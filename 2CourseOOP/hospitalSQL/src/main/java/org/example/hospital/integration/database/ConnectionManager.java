package org.example.hospital.integration.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    public static final String DB_URL = "jdbc:mysql://localhost:3306";
    public static final String USER = "root";
    public static final String PASSWORD = "Iusaz04##";
    private Connection connection;

    public ConnectionManager() {
        try {
            connection =
                    DriverManager.getConnection(DB_URL, USER, PASSWORD);
            System.out.println("Успешное подключение к базе данных.");
        } catch (SQLException e) {
            throw new RuntimeException("Error while db connecting: " + e.getMessage());
        }
    }
    public Connection disconnectFromDatabase() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Отключение от базы данных.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Connection getConnection() {
        return connection;
    }
}
