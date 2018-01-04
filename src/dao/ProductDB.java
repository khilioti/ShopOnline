package dao;


import model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDB {

        private Connection connection;

        public ProductDB() {
            try {
                connection = DriverManager.getConnection(
                        "jdbc:h2:tcp://localhost/~/ClientDB", "", "");

            } catch (org.h2.jdbc.JdbcSQLException e) {
                System.err.println("Базу запусти ))) Умник!!  Или проверь логин/пароль");
                System.out.println(e.getLocalizedMessage());
            } catch (SQLException e) {
                e.getStackTrace();
            }
        }

        public void addProduct(Product productAdd) {

            try (PreparedStatement ps = connection.prepareStatement
                    ("insert into products (name, price) values (?,?)")) {

                ps.setString(1, productAdd.getName());
                ps.setInt(2, productAdd.getPrice());
                ps.execute();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void updateProduct(Product productUD) {

            try (PreparedStatement ps = connection.prepareStatement
                    ("update products set name=?, price=? where id=?")) {
                ps.setString(1, productUD.getName());
                ps.setInt(2, productUD.getPrice());
                ps.setInt(3, productUD.getIdProduct());
                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void delProduct(int productsId) {

            try (PreparedStatement ps = connection.prepareStatement
                    ("delete from products where id=?")) {
                ps.setInt(1, productsId);
                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public List<Product> getProduct() {
            List<Product> products = new ArrayList<>();
            try (PreparedStatement ps = connection.prepareStatement
                    ("select * from products")) {
                ResultSet resultSet = ps.executeQuery();
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    int price = resultSet.getInt("price");
                    products.add(new Product(id, name, price));
                }
                return products;

            } catch (SQLException e) {
                e.printStackTrace();
                return new ArrayList<>();
            }
        }

    }


