package com.dharshini.learning.java.jdbc.mthread;

import com.dharshini.learning.java.jdbc.DBUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadIngestion {
    static ArrayList<Insurance> list = new ArrayList<>();

    static Status status = new Status();

    public static void main(String[] args) {

        status.setStartTime(LocalDateTime.now());
        System.out.println("Data parsing starts : " + LocalDateTime.now());
        Path cwd = Path.of("").toAbsolutePath();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(cwd + "/data/csv/motor_insurance_data.csv"));

            String line;

            int lineNO = 1;
            while ((line = bufferedReader.readLine()) != null) {

                line = line + "0";
                if (lineNO == 1) {
                    lineNO++;
                    continue;

                }

                String[] lines = line.split(",");

                Insurance data = new Insurance();
                data.setSex(Integer.parseInt(lines[0]));
                data.setInsrBegin(lines[1]);
                data.setInsrEnd(lines[2]);
                data.setEffectiveYear((lines[3]));
                data.setInsrType(Integer.parseInt(lines[4]));
                data.setInsuredValue(Double.parseDouble(lines[5]));

                if (lines[6].isEmpty()) {
                    lines[6] = "0.0";
                }
                data.setPremium(Double.parseDouble(lines[6]));
                data.setObjectId(Long.parseLong(lines[7]));

                if (lines[8].isEmpty()) {
                    lines[8] = "0";
                }
                data.setProdYear(Integer.parseInt(lines[8]));

                if (lines[9].isEmpty()) {
                    lines[9] = "0";
                }
                data.setSeatsNum(Integer.parseInt(lines[9]));

                if (lines[10].isEmpty()) {
                    lines[10] = "0.0";
                }
                data.setCarryingCapacity(Double.parseDouble(lines[10]));
                data.setTypeVehicle(lines[11]);

                if (lines[12].isEmpty()) {
                    lines[12] = "0.0";
                }
                data.setCcmTon(Double.parseDouble(lines[12]));
                data.setMake(lines[13]);
                data.setUsage(lines[14]);
                data.setClaimPaid(lines[15]);
                list.add(data);
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        System.out.println("Parsed count : " + list.size());

        System.out.println("Data parsing ends : " + LocalDateTime.now());
        System.out.println("Ingestion Starts : " + LocalDateTime.now());

        MultiThreadIngestion multithreadIngestion = new MultiThreadIngestion();
        multithreadIngestion.startIngestion();

        status.setEndTime(LocalDateTime.now());
    }

    public void startIngestion() {

        ExecutorService executorService = Executors.newFixedThreadPool(6);

        int totalSize = list.size();
        int chunkSize = (int) Math.ceil((double) totalSize / 6);

        for (int i = 0; i < 6; i++) {

            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, totalSize);
            if (start < totalSize) {
                List<Insurance> subList = list.subList(start, end);
                executorService.submit(new PartDataProcessor(subList));
            }
        }

        executorService.shutdown();

    }



    class PartDataProcessor implements Runnable {

        List<Insurance> partData;

        public PartDataProcessor(List<Insurance> partData) {
            this.partData = partData;
        }

        @Override
        public void run() {

            System.out.println("partData : " + partData.size());
            String insertQuery = "INSERT INTO Motor (SEX, INSR_BEGIN, INSR_END, EFFECTIVE_YR, INSR_TYPE,INSURED_VALUE,PREMIUM,OBJECT_ID,PROD_YEAR,SEATS_NUM,CARRYING_CAPACITY,TYPE_VEHICLE,CCM_TON,MAKE,USEAGE,CLAIM_PAID)VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement preparedStatement = null;
            Connection conn = null;

            try {
                conn = DBUtil.getConnection();
                preparedStatement = conn.prepareStatement(insertQuery);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            try {
                int insertCount = 0;

                for (Insurance x : partData) {

                    preparedStatement.setInt(1, x.getSex());
                    preparedStatement.setString(2, x.getInsrBegin());
                    preparedStatement.setString(3, x.getInsrEnd());
                    preparedStatement.setString(4, x.getEffectiveYear());
                    preparedStatement.setInt(5, x.getInsrType());
                    preparedStatement.setDouble(6, x.getInsuredValue());
                    preparedStatement.setDouble(7, x.getPremium());
                    preparedStatement.setLong(8, x.getObjectId());
                    preparedStatement.setInt(9, x.getProdYear());
                    preparedStatement.setInt(10, x.getSeatsNum());
                    preparedStatement.setDouble(11, x.getCarryingCapacity());
                    preparedStatement.setString(12, x.getTypeVehicle());
                    preparedStatement.setDouble(13, x.getCcmTon());
                    preparedStatement.setString(14, x.getMake());
                    preparedStatement.setString(15, x.getUsage());
                    preparedStatement.setString(16, x.getClaimPaid());
                    preparedStatement.executeUpdate();

                    insertCount++;

                }

                System.out.println("Inserted count : " + insertCount + " completed : " +  LocalDateTime.now());

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                DBUtil.closeResources(conn, preparedStatement);
            }
        }
    }
}
