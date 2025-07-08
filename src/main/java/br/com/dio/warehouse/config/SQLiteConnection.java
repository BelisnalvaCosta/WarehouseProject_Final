package br.com.dio.warehouse.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteConnection {
    private static final String URL = "jdbc:sqlite:warehouse.db";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}