package br.com.dio.warehouse.dao;

import br.com.dio.warehouse.config.SQLiteConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoxDAO {
    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS boxes (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "amount INTEGER NOT NULL," +
                     "validate TEXT NOT NULL," +
                     "price REAL NOT NULL)";
        try (Connection conn = SQLiteConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}