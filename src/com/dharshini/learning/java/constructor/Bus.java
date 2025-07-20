package com.dharshini.learning.java.constructor;

public class Bus {
    private int busid;
    private String busNo;
    private String routeNo;
    private String driverName;
    private boolean isOutForPick;

    public Bus(int busid, String busNo, String routeNo, String driverName, boolean isOutForPick){

        this.busid = busid;
        this.busNo = busNo;
        this.routeNo = routeNo;
        this.driverName = driverName;
        this.isOutForPick = isOutForPick;
    }

    public int getBusid() {
        return busid;
    }

    public void setBusid(int busid) {
        this.busid = busid;
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo;
    }

    public String getRouteNo() {
        return routeNo;
    }

    public void setRouteNo(String routeNo) {
        this.routeNo = routeNo;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public boolean isOutForPick() {
        return isOutForPick;
    }

    public void setOutForPick(boolean outForPick) {
        isOutForPick = outForPick;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busid=" + busid +
                ", busNo='" + busNo + '\'' +
                ", routeNo='" + routeNo + '\'' +
                ", driverName='" + driverName + '\'' +
                ", isOutForPick=" + isOutForPick +
                '}';
    }
}
