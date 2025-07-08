package br.com.dio.warehouse.test;

import br.com.dio.warehouse.config.SQLiteConnection;
import org.junit.jupiter.api.Test;
import java.sql.Connection;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

public class ConnectionTest {
    @Test
    public void testConnection() {
        try {
            Connection conn = SQLiteConnection.getConnection();
            assertNotNull(conn);
        } catch (Exception e) {
            fail("Conexão falhou: " + e.getMessage());
        }
    }
}