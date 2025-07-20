package com.dharshini.learning.java.housetaxcalculation;

import java.time.Year;

public class House {
    private int size;
    private String type;
    private int noOfHouses;
    private int builtYear;
    private int pendingYears;

    public House(int size, String type, int noOfHouses, int builtYear, int pendingYears){
        this.size = size;
        this.type = type;
        this.noOfHouses = noOfHouses;
        this.builtYear = builtYear;
        this.pendingYears = pendingYears;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNoOfHouses() {
        return noOfHouses;
    }

    public void setNoOfHouses(int noOfHouses) {
        this.noOfHouses = noOfHouses;
    }

    public int getBuiltYear() {
        return builtYear;
    }

    public void setBuiltYear(int builtYear) {
        this.builtYear = builtYear;
    }

    public int getPendingYears() {
        return pendingYears;
    }

    public void setPendingYears(int pendingYears) {
        this.pendingYears = pendingYears;
    }

    @Override
    public String toString() {
        return "House{" +
                "size=" + size +
                ", type='" + type + '\'' +
                ", noOfHouses=" + noOfHouses +
                ", builtYear=" + builtYear +
                ", pendingYears=" + pendingYears +
                '}';
    }
}
