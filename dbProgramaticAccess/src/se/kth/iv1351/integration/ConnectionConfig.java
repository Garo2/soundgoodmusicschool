package se.kth.iv1351.integration;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionConfig {

    /**
     * @return the connection with the database
     */
    public static Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/soundgoodmusicschooldb", "postgres", "Garo123");
            connection.setAutoCommit(false);
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
