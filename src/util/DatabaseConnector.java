/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.*;
import java.util.ArrayList;
import model.Product;
import model.Customer;
import model.CustomerDirectory;
import model.ProductDirectory;

/**
 * Database Connector class for interacting with database
 * @author jq
 */
public class DatabaseConnector {
    /*
    change based on you database file
    */
    private static final String URL = "jdbc:mysql://localhost:3306/test?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    /**
     * Privatized constructor so as to not allow object creation
     */
    private DatabaseConnector() {
    }

    /**
     * Insert given user to database
     * @see User
     * @param user User object to be added
     */
    public static void addUser(Customer user) {
        //add to database
        String query = "INSERT INTO USER(NAME,AGE) VALUES(?,?)";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
//            changed based on the roles (need final revision, meeting on this) 
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, user.getName());
            stmt.setInt(2, user.getAge());
            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);
//            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Return lost of all users in database
     * @see User
     * @return list of users
     */
    public static ArrayList<Customer> getAllusers() {
//        return list of users from db
        ArrayList<Customer> users = new ArrayList<>();

        String query = "SELECT * FROM USER";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Customer u = new Customer();
//            changed based on the roles (need final revision, meeting on this) 
//                also on this part we should have more roles 
                u.setName(rs.getString("name"));
                u.setAge(rs.getInt("age"));
//                i don't think we should change customer ID
//                p.setCustomerID(rs.getInt("id"));
                users.add(u);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    /**
     * Delete given user from database
     * @see User
     * @param u User to be deleted
     * 
     */
    public static void deleteUser(Customer u) {
        String query = "delete from USER where id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
//            changed based on the roles (need final revision, meeting on this) 
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, u.getCustomerId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Edit given user details in the database
     * @param oldUser existing user in database
     * @param newUser modified user details to be added
     */
    public static void editUser(Customer oldUser, Customer newUser) {
        String query = "UPDATE USER SET name=?, age=? WHERE id=?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
//            changed based on the roles (need final revision, meeting on this) 
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, newUser.getName());
            stmt.setInt(2, newUser.getAge());
//            again I don't think we should change customer id 
//            stmt.setInt(3, oldUser.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    

    /**
     * Insert given user to database
     * @see Product
     * @param Product Product object to be added
     */
    public static void addProduct(Product prod) {
        //add to database
        String query = "INSERT INTO USER(NAME,PRICE,DESCRIPTION) VALUES(?,?,?)";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
//            changed based on the roles (need final revision, meeting on this) 
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, prod.getProductName());
            stmt.setInt(2, prod.getPrice());
            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);
//            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Return lost of all users in database
     * @see Product
     * @return list of products
     */
    public static ArrayList<Product> getAllproducts() {
//        return list of users from db
        ArrayList<Product> products = new ArrayList<>();

        String query = "SELECT * FROM USER";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Product p = new Product();
//            changed based on the roles (need final revision, meeting on this) 
//                also on this part we should have more roles 
                p.setProductName(rs.getString("productname"));
                p.setPrice(rs.getInt("price"));
//                i don't think we should change customer ID
//                p.setCustomerID(rs.getInt("id"));
                products.add(p);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return products;
    }

    /**
     * Delete given user from database
     * @see Product
     * @param p Product to be deleted
     * 
     */
    public static void deleteProduct(Product p) {
        String query = "delete from USER where id = ?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
//            changed based on the roles (need final revision, meeting on this) 
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, p.getProductId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Edit given user details in the database
     * @param oldProduct existing product in database
     * @param newProduct modified product details to be added
     */
    public static void editProduct(Product oldProduct, Product newProduct) {
        String query = "UPDATE USER SET name=?, age=? WHERE id=?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
//            changed based on the roles (need final revision, meeting on this) 
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, newProduct.getProductName());
            stmt.setInt(2, newProduct.getPrice());
//            again I don't think we should change customer id 
//            stmt.setInt(3, oldProduct.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
