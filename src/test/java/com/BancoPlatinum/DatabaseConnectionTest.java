package com.BancoPlatinum;

import static org.junit.Assert.*;

import org.junit.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionTest {

    @Test
    public void testDatabaseConnection() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco_platinum", "usuario", "contraseña");
            assertNotNull(connection);
            connection.close();
        } catch (SQLException e) {
            fail("Error en la conexión a la base de datos: " + e.getMessage());
        }
    }
}