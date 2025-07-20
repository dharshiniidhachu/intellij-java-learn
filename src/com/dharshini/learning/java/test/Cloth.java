package com.dharshini.learning.java.test;

class Cloth {
    private String type;

    public Cloth(String type) {

        this.type = type;
    }

    public String getType() {

        return type;
    }

}

class Kurti {
    private String brand;
    private Cloth cloth;

    public Kurti(String brand, Cloth cloth)
    {
        this.brand = brand;
        this.cloth = cloth;
    }

    public void displayDetails()
    {
        System.out.println("Kurti Brand: " + brand);
        System.out.println("Cloth Type: " + cloth.getType());
    }
}
