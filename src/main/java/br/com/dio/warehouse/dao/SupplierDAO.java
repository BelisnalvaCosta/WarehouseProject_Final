package br.com.dio.warehouse.dao;

import br.com.dio.warehouse.model.Supplier;
import br.com.dio.warehouse.config.SQLiteConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SupplierDAO {
    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS suppliers (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "name TEXT NOT NULL," +
                     "cnpj TEXT NOT NULL," +
                     "contact TEXT NOT NULL)";
        try (Connection conn = SQLiteConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insert(Supplier supplier) {
        String sql = "INSERT INTO suppliers(name, cnpj, contact) VALUES (?, ?, ?)";
        try (Connection conn = SQLiteConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, supplier.getName());
            stmt.setString(2, supplier.getCnpj());
            stmt.setString(3, supplier.getContact());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}