package com.dharshini.learning.java.jdbc;

import com.dharshini.learning.java.jdbc.mthread.HealthData;
import com.dharshini.learning.java.jdbc.mthread.Status;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HInsert {

    static ArrayList<Hdata1> list = new ArrayList<>();
    static Status status = new Status();

    public static void main(String[] args) {

        status.setStartTime(LocalDateTime.now());
        System.out.println("Parsing starts" + LocalDateTime.now());

        Path cwd = Path.of("").toAbsolutePath();

        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(cwd + "data/csv/healthcare_dataset.csv"));
            String line;
            int lineNo = 1;
            while((line = bufferedReader.readLine())!=null){

                if(lineNo==1){
                    lineNo++;
                    continue;
                }

                String[] lines = line.split(",");
                Hdata1 data = new Hdata1();

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
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("parsed count: " + list.size());
        System.out.println("Ingestion starts: " + LocalDateTime.now());

        HInsert hInsert = new HInsert();

        status.setEndTime(LocalDateTime.now());
    }



}


