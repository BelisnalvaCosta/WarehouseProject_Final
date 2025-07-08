package br.com.dio.warehouse.dao;

import br.com.dio.warehouse.config.SQLiteConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BasicBasketDAO {
    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS basic_baskets (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "amount INTEGER NOT NULL," +
                     "price REAL NOT NULL," +
                     "expiry_date TEXT NOT NULL," +
                     "supplier_id INTEGER," +
                     "FOREIGN KEY(supplier_id) REFERENCES suppliers(id))";
        try (Connection conn = SQLiteConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}