package com.dharshini.learning.java.jdbc;

import java.sql.*;

    public class DbInsertExample {

        public static void main(String[] args) {

            String insertQuery = "INSERT INTO persons (id, name, address, age) VALUES (?, ?, ?, ?)";

            PreparedStatement preparedStatement = null;
            Connection conn = null;

            try  {
                conn = DBUtil.getConnection();
                preparedStatement = conn.prepareStatement(insertQuery);
                preparedStatement.setInt(1, 1);
                preparedStatement.setString(2, "Shalu");
                preparedStatement.setString(3, "Chennai,Tamilnadu");
                preparedStatement.setInt(4, 32);

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Insert successful! Rows affected: " + rowsAffected);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                DBUtil.closeResources(conn,preparedStatement);
            }
        }
    }