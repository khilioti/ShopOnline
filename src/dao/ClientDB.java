package dao;

import model.Client;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public void addClient(Client clientAdd) {

        try (PreparedStatement ps = connection.prepareStatement
                ("insert into clients (name, surname, age) values (?,?,?)")) {

            ps.setString(1, clientAdd.getName());
            ps.setString(2, clientAdd.getSurName());
            ps.setInt(3, clientAdd.getAge());
            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateClient(Client clients) {

        try (PreparedStatement ps = connection.prepareStatement
                ("update clients set name=?, surname=?, age=? where id=?")) {
            ps.setString(1, clients.getName());
            ps.setString(2, clients.getSurName());
            ps.setInt(3, clients.getAge());
            ps.setInt(4, clients.getIdClient());
            ps.executeUpdate();
            } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delClient(int clientsId) {

        try (PreparedStatement ps = connection.prepareStatement
                ("delete from clients where id=?")) {
            ps.setInt(1, clientsId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Client> getClient() {
        List<Client> clients = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement
                ("select * from clients")) {
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                clients.add(new Client(id, name, surname, age));
            }
            return clients;

        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

}
