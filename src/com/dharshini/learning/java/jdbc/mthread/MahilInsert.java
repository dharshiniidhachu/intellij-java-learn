package com.dharshini.learning.java.jdbc.mthread;

import com.dharshini.learning.java.jdbc.DBUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MahilInsert {

    static ArrayList<MahilData> list = new ArrayList<>();
    static Status status = new Status();

    public static void main(String[] args) {

        System.out.println("Parsing starts: " + LocalDateTime.now());
        Path cwd = Path.of("").toAbsolutePath();

        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(cwd + "/data/csv/mahil_test_loan_dataset.csv"));
            String line;
            int lineNo = 1;
            while((line= bufferedReader.readLine())!=null) {
                if(lineNo==1) {
                    lineNo++;
                    continue;
                }

                String[] lines = line.split(",");
                MahilData data = new MahilData();

                data.setApplicationDate(lines[0]);
                data.setAge(Integer.parseInt(lines[1]));
                data.setAnnualIncome(Long.parseLong(lines[2]));
                data.setCreditScore(Integer.parseInt(lines[3]));
                data.setEmploymentStatus(lines[4]);
                data.setEducationLevel(lines[5]);
                data.setExperience(Integer.parseInt(lines[6]));
                data.setLoanAmount(Long.parseLong(lines[7]));
                data.setLoanDuration(lines[8]);
                data.setMaritalStatus(lines[9]);
                data.setNoOfDependents(Integer.parseInt(lines[10]));
                data.setHomeOwnershipStatus(lines[11]);
                data.setMonthlyDebtPayments(Integer.parseInt(lines[12]));
                data.setCreditCardUtilizationRate(Double.parseDouble(lines[13]));
                data.setNoOfCreditLines(Integer.parseInt(lines[14]));
                data.setNoOfCreditInquiries(Integer.parseInt(lines[15]));
                data.setDebtToIncomeRatio(Double.parseDouble(lines[16]));
                data.setBankruptcyHistory(Integer.parseInt(lines[17]));
                data.setLoanPurpose(lines[18]);
                data.setLoanDefaults(Integer.parseInt(lines[19]));
                data.setPaymentHistory(Integer.parseInt(lines[20]));
                data.setLengthOfCreditHistory(Integer.parseInt(lines[21]));
                data.setSavings(Integer.parseInt(lines[22]));
                data.setBalance(Integer.parseInt(lines[23]));
                data.setTotalAssests(Integer.parseInt(lines[24]));
                data.setTotalLiabilities(Integer.parseInt(lines[25]));
                data.setMonthlyIncome(lines[26]);
                data.setUtilityBillsHistory(Double.parseDouble(lines[27]));
                data.setJobTenure(Integer.parseInt(lines[28]));
                data.setNetWorth(Long.parseLong(lines[29]));
                data.setBaseInterestRate(Double.parseDouble(lines[30]));
                data.setInterestRate(Double.parseDouble(lines[31]));
                data.setMonthlyLoanPayment(Double.parseDouble(lines[32]));
                data.setTotalDebtToIncomeRatio(Double.parseDouble(lines[33]));
                data.setLoanApproved(Integer.parseInt(lines[34]));
                data.setRiskScore(lines[35]);

                list.add(data);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("Parsed data : " + list.size());
        System.out.println("Parsing ended " + LocalDateTime.now());
        System.out.println("Ingestion starts: " + LocalDateTime.now());

        MahilInsert mahilInsert = new MahilInsert();
        mahilInsert.ingestionStart();

        status.setEndTime(LocalDateTime.now());
    }
    public void ingestionStart() {
        ExecutorService ex = Executors.newFixedThreadPool(6);

        int totalSize = list.size();
        int chunkSize = (int) Math.ceil((double) totalSize/6);
        for(int i=0;i<6;i++){
            int start = i * chunkSize;
            int end = Math.min(start+chunkSize,totalSize);

            if(start<totalSize) {
                List<MahilData> subList= list.subList(start,end);
                ex.submit(new PartDataProcess(subList));

            }
        }
        ex.shutdown();
    }

    class PartDataProcess implements Runnable {

        List<MahilData> partData;

        public PartDataProcess(List<MahilData> partData) {
            this.partData = partData;
        }

        @Override
        public void run() {

            System.out.println("Part Data : " + partData.size());
            String query = "INSERT INTO Mahil (APPLICATION_DATE,AGE,ANNUAL_INCOME,CREDIT_SCORE,EMPLOYMENT_STATUS,EDUCATION_LEVEL,EXPERIENCE,LOAN_AMOUNT,LOAN_DURATION,MARITAL_STATUS,NO_OF_DEPENDENTS,HOME_OWNERSHIP_STATUS,MONTHLY_DEBT_PAYMENTS,CREDIT_CARD_UTILIZATION_RATE,NO_OF_CREDIT_LINES,NO_OF_CREDIT_INQUIRIES,DEBT_TO_INCOME_RATIO,BANK_HISTORY,LOAN_PURPOSE,LOAN_DEFAULTS,PAYMENT_HISTORY,LENGTH_OF_CREDIT_HISTORY,SAVINGS_ACCOUNT_BALANCE,CHECKING_ACCOUNT_BALANCE,TOTAL_ASSETS,TOTAL_LIABILITIES,MONTHLY_INCOME,UTILITY_BILLS_PAYMENT_HISTORY,JOB_TENURE,NET_WORTH,BASE_INTEREST_RATE,INTEREST_RATE,MONTHLY_LOAN_PAYMENT,TOTAL_DEBT_TO_INCOME_RATIO,LOAN_APPROVED,RISK_SCORE) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement preparedStatement = null;
            Connection conn = null;

           try {
               conn = DBUtil.getConnection();
               preparedStatement = conn.prepareStatement(query);

           } catch (SQLException e) {
               throw new RuntimeException(e);
           }

           try{
               int insertCount = 0;
               for(MahilData x : partData) {
                   preparedStatement.setString(1,x.getApplicationDate());
                   preparedStatement.setInt(2,x.getAge());
                   preparedStatement.setLong(3,x.getAnnualIncome());
                   preparedStatement.setInt(4,x.getCreditScore());
                   preparedStatement.setString(5,x.getEmploymentStatus());
                   preparedStatement.setString(6,x.getEducationLevel());
                   preparedStatement.setInt(7,x.getExperience());
                   preparedStatement.setLong(8,x.getLoanAmount());
                   preparedStatement.setString(9,x.getLoanDuration());
                   preparedStatement.setString(10,x.getMaritalStatus());
                   preparedStatement.setInt(11,x.getNoOfDependents());
                   preparedStatement.setString(12,x.getHomeOwnershipStatus());
                   preparedStatement.setInt(13,x.getMonthlyDebtPayments());
                   preparedStatement.setDouble(14,x.getCreditCardUtilizationRate());
                   preparedStatement.setInt(15,x.getNoOfCreditLines());
                   preparedStatement.setInt(16,x.getNoOfCreditInquiries());
                   preparedStatement.setDouble(17,x.getDebtToIncomeRatio());
                   preparedStatement.setInt(18,x.getBankruptcyHistory());
                   preparedStatement.setString(19,x.getLoanPurpose());
                   preparedStatement.setInt(20,x.getLoanDefaults());
                   preparedStatement.setInt(21,x.getPaymentHistory());
                   preparedStatement.setInt(22,x.getLengthOfCreditHistory());
                   preparedStatement.setInt(23,x.getSavings());
                   preparedStatement.setInt(24,x.getBalance());
                   preparedStatement.setInt(25,x.getTotalAssests());
                   preparedStatement.setInt(26,x.getTotalLiabilities());
                   preparedStatement.setString(27,x.getMonthlyIncome());
                   preparedStatement.setDouble(28,x.getUtilityBillsHistory());
                   preparedStatement.setInt(29,x.getJobTenure());
                   preparedStatement.setLong(30,x.getNetWorth());
                   preparedStatement.setDouble(31,x.getBaseInterestRate());
                   preparedStatement.setDouble(32,x.getInterestRate());
                   preparedStatement.setDouble(33,x.getMonthlyLoanPayment());
                   preparedStatement.setDouble(34,x.getTotalDebtToIncomeRatio());
                   preparedStatement.setInt(35,x.getLoanApproved());
                   preparedStatement.setString(36,x.getRiskScore());

                   preparedStatement.executeUpdate();
                   insertCount++;

               }
               System.out.println("Inserted Data Count : " + insertCount);
               System.out.println("Insertion completed : " + LocalDateTime.now());

           } catch (Exception e) {
               throw new RuntimeException(e);
           } finally {
               DBUtil.closeResources(conn,preparedStatement);
           }





        }
    }
}
