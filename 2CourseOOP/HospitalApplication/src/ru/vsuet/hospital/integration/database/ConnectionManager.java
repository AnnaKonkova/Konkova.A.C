package ru.vsuet.hospital.integration.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    public static final String DB_URL = "jdbc:h2:~/test/departments";
    public static final String USER = "sa";
    public static final String PASSWORD = "";
    private Connection connection;

    public ConnectionManager() {
        try {
            connection =
                    DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Error while db connecting: " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
