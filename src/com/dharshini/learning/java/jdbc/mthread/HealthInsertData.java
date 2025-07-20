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

public class HealthInsertData {

    static ArrayList<HealthData> list = new ArrayList<>();

    static Status status = new Status();

    public static void main(String[] args) {

        status.setStartTime(LocalDateTime.now());

        System.out.println("Data parsing starts: " + LocalDateTime.now());
        Path cwd = Path.of("").toAbsolutePath();

        try{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(cwd + "/data/csv/healthcare_dataset (1).csv"));
        String line;
        int lineNo = 1;
        while((line=bufferedReader.readLine()) != null) {

            if(lineNo==1){
                lineNo++;
                continue;
            }

            String[] lines = line.split(",");
            HealthData data = new HealthData();

            data.setName(lines[0]);
            data.setAge(Integer.parseInt(lines[1]));
            data.setGender(lines[2]);
            data.setBloodType(lines[3]);
            data.setMedicalCondition(lines[4]);
            data.setDateOfAdmission(lines[5]);
            data.setDoctor(lines[6]);
            data.setHospital(lines[7]);
            data.setInsuranceProvider(lines[8]);
            data.setBillingAmount(Double.parseDouble(lines[9]));
            data.setRoomNumber(Integer.parseInt(lines[10]));
            data.setAdmissionType(lines[11]);
            data.setDischargeDate(lines[12]);
            data.setMedication(lines[13]);
            data.setTestResults(lines[14]);

            list.add(data);

        }

    } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println("Parsed Count: " + list.size());
        System.out.println("Parsing ends: " + LocalDateTime.now());
        System.out.println("Ingestion starts: " + LocalDateTime.now());

        HealthInsertData healthInsertData = new HealthInsertData();
        healthInsertData.startIngestion();

        status.setEndTime(LocalDateTime.now());

    }
    public void startIngestion() {
        ExecutorService ex = Executors.newFixedThreadPool(6);

        int totalSize = list.size();
        int chunkSize = (int) Math.ceil((double) totalSize/6);
        for(int i = 0; i<6 ; i++) {

            int start = i * chunkSize;
            int end = Math.min(start+chunkSize,totalSize);
            if(start<totalSize) {
                List<HealthData> subList = list.subList(start,end);
                ex.submit(new PartDataProcessor(subList));
            }
        }
        ex.shutdown();
    }
    class PartDataProcessor implements Runnable {
        List<HealthData> partData;
        public PartDataProcessor(List<HealthData> partData) {
            this.partData = partData;
        }

        @Override
        public void run() {

            System.out.println("part data: " + partData.size());
            String insertQuery = "INSERT INTO Health (NAME, AGE, GENDER, BLOOD_TYPE, MEDICAL_CONDITION, DATE_OF_ADMISSION, DOCTOR, HOSPITAL, INSURANCE_PROVIDER, BILLING_AMOUNT, ROOM_NUMBER, ADMISSION_TYPE, DISCHARGE_DATE, MEDICATION, TEST_RESULTS) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement preparedStatement = null;
            Connection conn = null;

            try{
                conn = DBUtil.getConnection();
                preparedStatement = conn.prepareStatement(insertQuery);

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            try{
                int insertCount = 0;
                for(HealthData x : partData) {
                    preparedStatement.setString(1, x.getName());
                    preparedStatement.setInt(2,x.getAge());
                    preparedStatement.setString(3,x.getGender());
                    preparedStatement.setString(4,x.getBloodType());
                    preparedStatement.setString(5,x.getMedicalCondition());
                    preparedStatement.setString(6, x.getDateOfAdmission());
                    preparedStatement.setString(7,x.getDoctor());
                    preparedStatement.setString(8,x.getHospital());
                    preparedStatement.setString(9,x.getInsuranceProvider());
                    preparedStatement.setDouble(10,x.getBillingAmount());
                    preparedStatement.setInt(11,x.getRoomNumber());
                    preparedStatement.setString(12,x.getAdmissionType());
                    preparedStatement.setString(13,x.getDischargeDate());
                    preparedStatement.setString(14,x.getMedication());
                    preparedStatement.setString(15,x.getTestResults());
                    preparedStatement.executeUpdate();

                    insertCount++;

                }
                System.out.println("Inserted count : " + insertCount + "complete" + LocalDateTime.now());
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                DBUtil.closeResources(conn, preparedStatement);
            }
        }
    }
}
