package com.dharshini.learning.java.filehandling.test;

import com.dharshini.learning.java.jdbc.DBUtil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ListIterator;

public class UsedCarDataAnalysisApp {

    public static void main(String[] args) throws SQLException {
        Path cwd = Path.of("").toAbsolutePath();
        System.out.println(cwd);
        ArrayList<UsedCar> usedCars = new ArrayList<>();

        try{
            BufferedReader br = new BufferedReader(new FileReader(cwd+ "/data/csv/used_car_data.csv"));

            String line;
            int lineCnt = 0;
            while((line = br.readLine()) != null){

                if(lineCnt == 0){
                    System.out.println(line);
                    lineCnt++;
                    continue;
                }

                String[] lineStrArray = line.split(",");

                //creating objects
                UsedCar usedCar = new UsedCar();

                usedCar.setId(Integer.parseInt(lineStrArray[0])); //converts int to string (wrapper class)
                usedCar.setName(lineStrArray[1]);
                usedCar.setLocation(lineStrArray[2]);
                usedCar.setYear(Integer.parseInt(lineStrArray[3]));
                usedCar.setKmDriven(Integer.parseInt(lineStrArray[4]));
                usedCar.setFuelType(lineStrArray[5]);
                usedCar.setTransmission(lineStrArray[6]);
                usedCar.setOwnerType(lineStrArray[7]);
                usedCar.setMileage(lineStrArray[8]);
                usedCar.setEngine(lineStrArray[9]);
                usedCar.setPower(lineStrArray[10]);
                if(!lineStrArray[11].isEmpty()){
                    usedCar.setSeats((int) Double.parseDouble(lineStrArray[11]));
                }
                usedCar.setNewPrice(lineStrArray[12]);
                usedCar.setPrice(Double.parseDouble(lineStrArray[13]));
                usedCars.add(usedCar);//grp of obj stored in single unit-collections


            }
        } catch (FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException ioe) {
            System.out.println("There was problem in reading data from file: " + ioe.getMessage());
        }
        processUsedCarData(usedCars);
    }

    public static void processUsedCarData(ArrayList<UsedCar> usedCars) throws SQLException {

        String insertQuery = "INSERT INTO UsedCar(id, name, location, year, kmDriven, fuelType, transmission, " +
                "ownerType, mileage, engine, power, seats, newPrice, price) " +
                "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        PreparedStatement preparedStatement = null;
        Connection conn = DBUtil.getConnection();
        preparedStatement = conn.prepareStatement(insertQuery);


        for(UsedCar car : usedCars){
                System.out.println(car);

                preparedStatement.setInt(1,car.getId());
                preparedStatement.setString(2,car.getName());
                preparedStatement.setString(3,car.getLocation());
                preparedStatement.setInt(4,car.getYear());
                preparedStatement.setInt(5,car.getKmDriven());
                preparedStatement.setString(6,car.getFuelType());
                preparedStatement.setString(7,car.getTransmission());
                preparedStatement.setString(8,car.getOwnerType());
                preparedStatement.setString(9,car.getMileage());
                preparedStatement.setString(10,car.getEngine());
                preparedStatement.setString(11,car.getPower());
                preparedStatement.setInt(12,car.getSeats());
                preparedStatement.setString(13,car.getNewPrice());
                preparedStatement.setDouble(14,car.getPrice());

                preparedStatement.executeUpdate();


            }
        }
    }
