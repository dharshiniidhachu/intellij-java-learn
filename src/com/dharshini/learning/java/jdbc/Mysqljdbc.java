package com.dharshini.learning.java.jdbc;
import java.sql.*;

public class Mysqljdbc {

        public static void main(String[] args) {

            String url = "jdbc:mysql://localhost:3306/dharshini";
            String user = "root";
            String password = "admin";

            Connection connection = null;
            Statement statement =   null;
            ResultSet resultSet =   null;

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");

                connection = DriverManager.getConnection(url, user, password);
                System.out.println("Connected to the database!");

                statement = connection.createStatement();

                String query = "SELECT id, name, address,age FROM Persons ";

                resultSet = statement.executeQuery(query);

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String address = resultSet.getString("address");
                    int age = resultSet.getInt("age");
                    System.out.println("ID: " + id + ", Name: " + name + ", Address: " + address + ", Age: " + age);
                }


            } catch (Exception e) {

                e.printStackTrace();

            } finally {

                try {
                    assert resultSet != null;
                    resultSet.close();
                    statement.close();
                    connection.close();

                } catch (SQLException e) {
                    System.out.println("Exception Occurred in closing resources : " + e.getMessage());
                }

            }
        }
    }
