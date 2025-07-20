package com.dharshini.learning.java.jdbc.mthread;

public class Insurance {

        private int sex;
        private String insrBegin;
        private String insrEnd;
        private String effectiveYear;
        private int insrType;
        private double insuredValue;
        private double premium;
        private long objectId;
        private int prodYear;
        private int seatsNum;
        private double carryingCapacity;
        private String typeVehicle;
        private double ccmTon;
        private String make;
        private String Usage;
        private String claimPaid;

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public String getInsrBegin() {
            return insrBegin;
        }

        public void setInsrBegin(String insrBegin) {
            this.insrBegin = insrBegin;
        }

        public String getInsrEnd() {
            return insrEnd;
        }

        public void setInsrEnd(String insrEnd) {
            this.insrEnd = insrEnd;
        }

        public String getEffectiveYear() {
            return effectiveYear;
        }

        public void setEffectiveYear(String effectiveYear) {
            this.effectiveYear = effectiveYear;
        }

        public int getInsrType() {
            return insrType;
        }

        public void setInsrType(int insrType) {
            this.insrType = insrType;
        }

        public double getInsuredValue() {
            return insuredValue;
        }

        public void setInsuredValue(double insuredValue) {
            this.insuredValue = insuredValue;
        }

        public double getPremium() {
            return premium;
        }

        public void setPremium(double premium) {
            this.premium = premium;
        }

        public long getObjectId() {
            return objectId;
        }

        public void setObjectId(long objectId) {
            this.objectId = objectId;
        }

        public int getProdYear() {
            return prodYear;
        }

        public void setProdYear(int prodYear) {
            this.prodYear = prodYear;
        }

        public int getSeatsNum() {
            return seatsNum;
        }

        public void setSeatsNum(int seatsNum) {
            this.seatsNum = seatsNum;
        }

        public double getCarryingCapacity() {
            return carryingCapacity;
        }

        public void setCarryingCapacity(double carryingCapacity) {
            this.carryingCapacity = carryingCapacity;
        }

        public String getTypeVehicle() {
            return typeVehicle;
        }

        public void setTypeVehicle(String typeVehicle) {
            this.typeVehicle = typeVehicle;
        }

        public double getCcmTon() {
            return ccmTon;
        }

        public void setCcmTon(double ccmTon) {
            this.ccmTon = ccmTon;
        }

        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getUsage() {
            return Usage;
        }

        public void setUsage(String usage) {
            Usage = usage;
        }

        public String getClaimPaid() {
            return claimPaid;
        }

        public void setClaimPaid(String claimPaid) {
            this.claimPaid = claimPaid;
        }

        @Override
        public String toString() {
            return "MotorInsuranceData{" +
                    "sex=" + sex +
                    ", insrBegin='" + insrBegin + '\'' +
                    ", insrEnd='" + insrEnd + '\'' +
                    ", effectiveYear='" + effectiveYear + '\'' +
                    ", insrType=" + insrType +
                    ", insuredValue=" + insuredValue +
                    ", premium=" + premium +
                    ", objectId=" + objectId +
                    ", prodYear=" + prodYear +
                    ", seatsNum=" + seatsNum +
                    ", carryingCapacity=" + carryingCapacity +
                    ", typeVehicle='" + typeVehicle + '\'' +
                    ", ccmTon=" + ccmTon +
                    ", make='" + make + '\'' +
                    ", Usage='" + Usage + '\'' +
                    ", claimPaid=" + claimPaid +
                    '}';
        }
    }
