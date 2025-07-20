package com.dharshini.learning.java.filehandling.test;

import java.io.*;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class BankTransactionAnalysisApp {
    public static void main(String[] args) {

        Path cwd = Path.of("").toAbsolutePath();
        System.out.println(cwd);
        ArrayList<BankTransaction> bankTransactions = new ArrayList<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        try {
            BufferedReader br = new BufferedReader(new FileReader(cwd + "/data/csv/banktransaction.csv"));
            String line;
            int lineCnt = 0;
            while ((line = br.readLine()) != null) {

                if (lineCnt == 0) {
                    System.out.println(line);
                    lineCnt++;
                    continue;
                }
                String[] lineStrArr = line.split(",");

                BankTransaction bankTransaction = new BankTransaction();

                bankTransaction.setTransactionID(lineStrArr[0]);
                bankTransaction.setAccountId(lineStrArr[1]);
                bankTransaction.setTransactionAmount(Double.parseDouble(lineStrArr[2]));
                bankTransaction.setTransactionDate(LocalDateTime.parse(lineStrArr[3], formatter));
                bankTransaction.setTransactionType(lineStrArr[4]);
                bankTransaction.setLocation(lineStrArr[5]);
                bankTransaction.setDeviceID(lineStrArr[6]);
                bankTransaction.setIpAddress(lineStrArr[7]);
                bankTransaction.setMerchantID(lineStrArr[8]);
                bankTransaction.setChannel(lineStrArr[9]);
                bankTransaction.setCustomerAge(Integer.parseInt(lineStrArr[10]));
                bankTransaction.setCustomerOccupation(lineStrArr[11]);
                bankTransaction.setTransactionDuration(Integer.parseInt(lineStrArr[12]));
                bankTransaction.setLoginAttempts(Integer.parseInt(lineStrArr[13]));
                bankTransaction.setAccountBalance(Double.parseDouble(lineStrArr[14]));
                bankTransaction.setPreviousTransactionDate(LocalDateTime.parse(lineStrArr[15], formatter));
                bankTransactions.add(bankTransaction);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        } catch (IOException ioe) {
            System.out.println("Error occurred" + ioe.getMessage());
        }
        bankTransactionData(bankTransactions);
    }

    public static void bankTransactionData(ArrayList<BankTransaction> bankTransactions) {
        try (FileWriter writer = new FileWriter("bank.csv")) {
            StringBuffer sb = new StringBuffer();
            sb.append("Transaction ID"+",AccountId"+",TransactionAmount"+",TransactionDate"+",TransactionType"+",Location"+",DeviceID"+",IpAddress"+",MerchantID"+",Channel"+",CustomerAge"+",CustomerOccupation"+",TransactionDuration"+",LoginAttempts"+",AccountBalance"+",PreviousTransactionDate");
            //sb.append(",AccountId");
            //sb.append(",TransactionAmount");
            //sb.append(",TransactionDate");
            //sb.append(",TransactionType");
            //sb.append(",Location");
            //sb.append(",DeviceID");
            //sb.append(",IpAddress");
            //sb.append(",MerchantID");
            //sb.append(",Channel");
            //sb.append(",CustomerAge");
            //sb.append(",CustomerOccupation");
            //sb.append(",TransactionDuration");
            //sb.append(",LoginAttempts");
            //sb.append(",AccountBalance");
            //sb.append(",PreviousTransactionDate");

            writer.write(sb.toString());
            writer.write("\n");

            for (BankTransaction bank : bankTransactions) {
                if (bank.getCustomerAge() >= 30 && bank.getCustomerAge() <= 55) {
                        writer.write(bank.getTransactionID()+ ","+bank.getAccountId()+","+bank.getTransactionAmount()+","+bank.getTransactionType()+","+bank.getTransactionDate()+","+bank.getLocation()+","+bank.getDeviceID()+","+bank.getIpAddress()+","+bank.getMerchantID()+","+bank.getChannel()+","+bank.getCustomerAge()+","+bank.getCustomerOccupation()+","+bank.getTransactionDuration()+","+bank.getLoginAttempts()+","+bank.getAccountBalance()+","+bank.getPreviousTransactionDate());
                        writer.write("\n");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
        }}}