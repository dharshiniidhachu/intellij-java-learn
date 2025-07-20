package com.dharshini.learning.java.filehandling.test;

import java.io.*;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class BankTxnApp {
    static ArrayList<BankTxn> arrayList = new ArrayList<>();
    static String aa;

    public static void main(String[] args) {

        Path cwd = Path.of("").toAbsolutePath();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(cwd + "/data/csv/banktransaction.csv"));//reads file line by line
            String line;
            int firstLine = 0;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            while ((line = reader.readLine()) != null) {
                if (firstLine == 0) {
                    System.out.println(line);
                    aa = line;
                    firstLine++;
                    continue;
                }
                String[] strline = line.split(",");
                BankTxn bankTxn = new BankTxn();
                bankTxn.setTransactionID(strline[0]);
                bankTxn.setAccountId(strline[1]);
                bankTxn.setTransactionAmount(Double.parseDouble(strline[2]));
                bankTxn.setTransactionDate(LocalDateTime.parse(strline[3],formatter));
                bankTxn.setTransactionType(strline[4]);
                bankTxn.setLocation(strline[5]);
                bankTxn.setDeviceID(strline[6]);
                bankTxn.setIpAddress(strline[7]);
                bankTxn.setMerchantID(strline[8]);
                bankTxn.setChannel(strline[9]);
                bankTxn.setCustomerAge(Integer.parseInt(strline[10]));
                bankTxn.setCustomerOccupation(strline[11]);
                bankTxn.setTransactionDuration(strline[12]);
                bankTxn.setLoginAttempts(Integer.parseInt(strline[13]));
                bankTxn.setAccountBalance(Double.parseDouble(strline[14]));
                bankTxn.setPreviousTransactionDate(LocalDateTime.parse(strline[15],formatter));

                arrayList.add(bankTxn);

            }
        } catch (IOException e) {
            System.out.println(e);
            e.printStackTrace();
        }

        ageCalculation();
    }

    public static void ageCalculation(){

        try{
            FileWriter writer = new FileWriter("banktxn.csv");
            writer.write(aa + "\n");
            writer.write("Customer Age between 30 and 50"+"\n");

            for(BankTxn list : arrayList) {
                int age = list.getCustomerAge();
                if (age >= 30 && age <= 50) {
                    writer.write(list.getTransactionID() + "," + list.getAccountId() + ","
                            + list.getTransactionAmount() + "," + list.getTransactionDate() + ","
                            + list.getTransactionType() + "," + list.getLocation() + ","
                            + list.getDeviceID() + "," + list.getIpAddress() + ","
                            + list.getMerchantID() + "," + list.getChannel() + ","
                            + list.getCustomerAge() + "," + list.getCustomerOccupation() + ","
                            + list.getTransactionDuration() + "," + list.getLoginAttempts() + ","
                            + list.getAccountBalance() + "," + list.getPreviousTransactionDate()+"\n");
                }
            }
                writer.write("Transaction Amount Calculation"+"\n");
                for(BankTxn list : arrayList){
                    LocalDateTime dt = list.getTransactionDate();
                    LocalDateTime pdt = list.getPreviousTransactionDate();
                    double amount = list.getTransactionAmount();
                    if(amount>=10 && amount<=100){
                        writer.write(list.getTransactionID() +","+list.getAccountId()+","
                                +list.getTransactionAmount()+","+ dt +","
                                +list.getTransactionType()+","+list.getLocation()+","
                                +list.getDeviceID()+","+list.getIpAddress()+","
                                +list.getMerchantID()+","+list.getChannel()+","
                                +list.getCustomerAge()+"," +list.getCustomerOccupation()+","
                                +list.getTransactionDuration()+","+list.getLoginAttempts()+","
                                +list.getAccountBalance()+","+ pdt +"\n");
                    }
                }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
