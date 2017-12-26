package dao;

import model.Client;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;

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
    public void addClient(Client clientAdd){

        try(PreparedStatement ps = connection.prepareStatement
                ("insert into clients (name, surname, age) values (?,?,?)")) {

            ps.setString(1, clientAdd.getName());
            ps.setString(2, clientAdd.getSurName());
            ps.setInt(3, clientAdd.getAge());
            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }






    }
}
