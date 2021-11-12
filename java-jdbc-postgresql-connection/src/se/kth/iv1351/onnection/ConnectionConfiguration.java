package se.kth.iv1351.onnection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class ConnectionConfiguration {

    public static Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/soundgoodschool2db", "postgres", "Garo123");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;
    }
}
