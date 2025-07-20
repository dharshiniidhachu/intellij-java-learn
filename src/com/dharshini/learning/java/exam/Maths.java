package com.dharshini.learning.java.exam;

public class Maths {
    private int inputA;
    private int inputB;
    private String action;
    private int result;


    public int getInputA() {
        return inputA;
    }

    public void setInputA(int inputA) {
        this.inputA = inputA;
    }

    public int getInputB() {
        return inputB;
    }

    public void setInputB(int inputB) {
        this.inputB = inputB;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Maths{" +
                "inputA=" + inputA +
                ", inputB=" + inputB +
                ", action='" + action + '\'' +
                ", result=" + result +
                '}';
    }
}
