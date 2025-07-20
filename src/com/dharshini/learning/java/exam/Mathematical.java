package com.dharshini.learning.java.exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.util.ArrayList;

public class Mathematical {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Path cwd = Path.of("").toAbsolutePath();
        System.out.println(cwd);

        try {
            BufferedReader br = new BufferedReader(new FileReader(cwd + "/data/csv/arith_test.csv"));
            BufferedWriter br1 = new BufferedWriter(new FileWriter(cwd +"/data/csv/arith_example.csv"));

            br1.write("Input A,Input B,Action,Result\n");


            String line ;
            int count = 0;

            while((line= br.readLine())!=null){
                if(count==0){
                    count++;
                    continue;
                }
                String[] linestrarr = line.split(",");
                Maths maths = new Maths();

                maths.setInputA(Integer.parseInt(linestrarr[0]));
                maths.setInputB(Integer.parseInt(linestrarr[1]));
                maths.setAction(linestrarr[2]);

                int result = 0;
                if (maths.getAction().equals("Add")){
                    result = add(maths.getInputA(),maths.getInputB());
                } else if (maths.getAction().equals("Sub")) {
                    result = sub(maths.getInputA(),maths.getInputB());
                } else if (maths.getAction().equals("Multiply")) {
                    result = multiply(maths.getInputA(),maths.getInputB());
                }else if (maths.getAction().equals("Divide")) {
                    result = divide(maths.getInputA(),maths.getInputB());
                }else{
                    System.out.println("Invalid");
                }

                System.out.println(result);
                maths.setResult(result);
                br1.write((maths.getInputA())+","+ maths.getInputB()+","+maths.getAction()+","+ maths.getResult());
                br1.write("\n");

            }
            br.close();
            br1.close();

            } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
}
}
