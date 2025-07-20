package com.dharshini.learning.java.wiproassessment.inheritan;

class Employee extends Person {
    double annualSalary;
    int startYear;
    String insuranceNum;

    Employee(String name, double annualSalary,int startYear, String insuranceNum){
        super(name);
        this.annualSalary = annualSalary;
        this.startYear = startYear;
        this.insuranceNum = insuranceNum;
    }

    public double getAnnualSalary(){
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary){
        this.annualSalary = annualSalary;
    }

    public int getStartYear(){
        return startYear;
    }

    public void setStartYear(int startYear){
        this.startYear = startYear;
    }

    public String getInsuranceNum(){
        return insuranceNum;
    }

    public void setInsuranceNum(String insuranceNum){
        this.insuranceNum = insuranceNum;
    }



}
