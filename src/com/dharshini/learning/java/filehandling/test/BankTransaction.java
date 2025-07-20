package com.dharshini.learning.java.filehandling.test;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class BankTransaction {
    private String transactionID;
    private String accountId;
    private double transactionAmount;
    private LocalDateTime transactionDate;
    private String transactionType;
    private String location;
    private String deviceID;
    private String ipAddress;
    private String merchantID;
    private String channel;
    private int customerAge;
    private String customerOccupation;
    private int transactionDuration;
    private int loginAttempts;
    private double accountBalance;
    private LocalDateTime PreviousTransactionDate;

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(String merchantID) {
        this.merchantID = merchantID;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public String getCustomerOccupation() {
        return customerOccupation;
    }

    public void setCustomerOccupation(String customerOccupation) {
        this.customerOccupation = customerOccupation;
    }

    public int getTransactionDuration() {
        return transactionDuration;
    }

    public void setTransactionDuration(int transactionDuration) {
        this.transactionDuration = transactionDuration;
    }

    public int getLoginAttempts() {
        return loginAttempts;
    }

    public void setLoginAttempts(int loginAttempts) {
        this.loginAttempts = loginAttempts;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public LocalDateTime getPreviousTransactionDate() {
        return PreviousTransactionDate;
    }

    public void setPreviousTransactionDate(LocalDateTime previousTransactionDate) {
        PreviousTransactionDate = previousTransactionDate;
    }

    @Override
    public String toString() {
        return "BankTransaction{" +
                "transactionID='" + transactionID + '\'' +
                ", accountId='" + accountId + '\'' +
                ", transactionAmount=" + transactionAmount +
                ", transactionDate=" + transactionDate +
                ", transactionType='" + transactionType + '\'' +
                ", location='" + location + '\'' +
                ", deviceID='" + deviceID + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", merchantID='" + merchantID + '\'' +
                ", channel='" + channel + '\'' +
                ", customerAge=" + customerAge +
                ", customerOccupation='" + customerOccupation + '\'' +
                ", transactionDuration=" + transactionDuration +
                ", loginAttempts=" + loginAttempts +
                ", accountBalance=" + accountBalance +
                ", PreviousTransactionDate=" + PreviousTransactionDate +
                '}';
    }
}
