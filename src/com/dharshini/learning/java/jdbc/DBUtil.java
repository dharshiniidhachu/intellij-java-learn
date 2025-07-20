package com.dharshini.learning.java.jdbc;

import java.sql.*;

public class DBUtil {

        private static final String URL = "jdbc:mysql://localhost:3306/dharshini";
        private static final String USER = "root";
        private static final String PASSWORD = "admin";


        static {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                System.err.println("Error loading database driver: " + e.getMessage());
            }
        }

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }

        public static void closeResources(Connection connection, Statement statement, ResultSet resultSet) {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }

        public static void closeResources(Connection connection, Statement statement) {
            closeResources(connection, statement, null);
        }


        public static void closeResources(Connection connection) {
            closeResources(connection, null, null);
        }
    }
