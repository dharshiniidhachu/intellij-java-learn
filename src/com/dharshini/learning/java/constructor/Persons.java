package com.dharshini.learning.java.constructor;

public class Persons {
    private String Name;
    private long PhoneNo;
    private int age;
    private String Village;
    private String City;
    private String District;

    public Persons(){

    }


    public Persons(String Name, long PhoneNo, int age, String Village, String City, String District) {
        this.Name = Name;
        this.PhoneNo = PhoneNo;
        this.age = age;
        this.Village = Village;
        this.City = City;
        this.District = District;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        PhoneNo = phoneNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getVillage() {
        return Village;
    }

    public void setVillage(String village) {
        Village = village;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    @Override
    public String toString() {
        return "com.dharshini.learning.java.constructor.Persons{" +
                "Name='" + Name + '\'' +
                ", PhoneNo=" + PhoneNo +
                ", age=" + age +
                ", Village='" + Village + '\'' +
                ", City='" + City + '\'' +
                ", District='" + District + '\'' +
                '}';
    }
}


