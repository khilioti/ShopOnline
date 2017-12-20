package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ClientDB {

    private Connection connection;
    public ClientDB() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:h2:tcp://localhost/~/ClientDB", "", "");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
