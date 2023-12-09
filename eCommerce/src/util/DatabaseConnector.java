/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import model.Customer;
import model.Product;

/**
 * Database Connector class for interacting with database
 *
 * @author akshatr
 */
public class DatabaseConnector {

    private static final String URL = "jdbc:mysql://127.0.0.1:55000/Ecommerce";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "hallowelt";

    /**
     * Privatized constructor so as to not allow object creation
     */
    private DatabaseConnector() {
    }


    public static void addProduct(Product product) {
        //add to database
        String query = "INSERT INTO PRODUCT(PRODUCTID,NAME,PRICE, DESCRIPTION) VALUES(?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, product.getProductId());
            stmt.setString(2, product.getProductName());
            stmt.setInt(3, product.getPrice());
            stmt.setString(4, product.getProductDescription());
            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void addUser(Customer customer) {
        //add to database
        String query = "INSERT INTO CUSTOMER(customerId,name,gender,age, email,telephone,password) VALUES(?,?,?,?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, customer.getCustomerId());
            stmt.setString(2, customer.getName());
            stmt.setString(3, customer.getGender());
            stmt.setInt(4, customer.getAge());
            stmt.setString(5, customer.getEmail());
            stmt.setInt(6, customer.getTeleNo());
            stmt.setString(7, customer.getPassword());
            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static ArrayList<Product> getAllusers() {
//        return list of users from db
        ArrayList<Product> products = new ArrayList<>();

        String query = "SELECT * FROM PRODUCT";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Product u = new Product();
                u.setProductId(rs.getString("productId"));
                u.setProductName(rs.getString("name"));
                u.setProductDescription(rs.getString("description"));
                u.setPrice(rs.getInt("price"));
                products.add(u);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return products;
    }
    
        /**
     * Return lost of all users in database
     * @see User
     * @return list of users
     */
    public static ArrayList<ShoppingCart> getSoppingCList() {
//        return list of users from db
        ArrayList<ShoppingCart> scs = new ArrayList<>();

        String query = "SELECT * FROM SHOPPINGCART";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                ShoppingCart u = new ShoppingCart();
                u.setProductName(rs.getString("name"));
                u.setPrice(rs.getInt("price"));
                scs.add(u);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return scs;
    }


    public static void deleteUser(Product u) {
        String query = "delete from PRODUCT where productId = ?";
        System.out.print(query);

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, u.getProductId());
            System.out.print(stmt);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Edit given user details in the database
     *
     * @param oldProd existing user in database
     * @param newProd modified user details to be added
     */
    public static void editProduct(Product oldProd, Product newProd) {
        String query = "UPDATE PRODUCT SET name=?, price=?,description=? WHERE productId=?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, newProd.getProductName());
            stmt.setInt(2, newProd.getPrice());
            stmt.setString(3, newProd.getProductDescription());
            stmt.setString(4, oldProd.getProductId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean validateUser(String username, String password) {
        String query = "SELECT password FROM CUSTOMER WHERE name = ?";

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement stmt = connection.prepareStatement(query)) {

            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // User exists, now compare the password
                String storedPassword = rs.getString("password");
                if (storedPassword.equals(password)) {
                    JOptionPane.showMessageDialog(null, "Login successful");
                    return true; // Correct password
                } else {
                    JOptionPane.showMessageDialog(null, "Error: Incorrect password."); // Incorrect password
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error: User does not exist."); // User does not exist
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

//    public static boolean containsUser(Customer customer) {
//        String query = "SELECT EXISTS (SELECT 1 FROM CUSTOMER WHERE name = ?) AS user_exists";
//        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
//            PreparedStatement stmt = conn.prepareStatement(query);
//            stmt.setString(1, customer.getName()); // Assuming getCustomerId() returns the username
//
//            ResultSet rs = stmt.executeQuery();
//            if (rs.next()) {
//                // return rs.getBoolean("user_exists");
//                boolean userExists = rs.getBoolean("user_exists");
//                if (userExists) {
//                    //User exists, display login successful message
//                    JOptionPane.showMessageDialog(null, "Login successful");
//                    return true;
//                } else {
//                    JOptionPane.showMessageDialog(null, "Error: User does not exist.");
//                    return false;
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Ecommerce";
        String user = "root";
        String password = "123";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            String query = "SELECT * FROM PRODUCT";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                ArrayList<Product> products = new ArrayList<>();
                Product u = new Product();
                u.setProductId(rs.getString("productId"));
                u.setProductName(rs.getString("name"));
                u.setProductDescription(rs.getString("description"));
                u.setPrice(rs.getInt("price"));
                products.add(u);
                for (Product product : products) {
                    if (product.getProductName().equals("Product1")) {
                        int priceOfProduct1 = 0;
                        priceOfProduct1 = product.getPrice();
                        System.out.println(priceOfProduct1);
                        break;
                    }
                }
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
