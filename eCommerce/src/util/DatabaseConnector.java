/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.*;
import java.util.ArrayList;
<<<<<<< HEAD
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
=======
<<<<<<< HEAD
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
=======
>>>>>>> refs/heads/Aniket2
import model.Customer;
import model.Product;

/**
 * Database Connector class for interacting with database
 * @author akshatr
 */
public class DatabaseConnector {

    private static final String URL = "jdbc:mysql://localhost:3306/Ecommerce?useSSL=false";
    private static final String USERNAME = "root";
<<<<<<< HEAD
    private static final String PASSWORD = "root";
=======
    private static final String PASSWORD = "labsql";
>>>>>>> origin/Louisnew
>>>>>>> refs/heads/Aniket2

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
<<<<<<< HEAD
=======
<<<<<<< HEAD
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
=======
>>>>>>> refs/heads/Aniket2
    public static void addProduct(Product user) {
        //add to database
        String query = "INSERT INTO PRODUCT(PRODUCTID,NAME,PRICE, DESCRIPTION) VALUES(?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, user.getProductId());
            stmt.setString(2, user.getProductName());
            stmt.setInt(3, user.getPrice());
            stmt.setString(4, user.getProductDescription());
            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
        /**
     * Insert given customer to database
     * @see User
     * @param customer User object to be added
     */
    public static void addUser(Customer customer) {
        //add to database
        String query = "INSERT INTO CUSTOMER(customerId,name,gender,age, email,telephone,password) VALUES(?,?,?,?,?,?,?)";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, customer.getCustomerId());
            stmt.setString(2, customer.getName());
            stmt.setString(3,customer.getGender());
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
<<<<<<< HEAD
=======
    
        /**
     * Insert given sc to database
     * @see User
     * @param sc User object to be added
     */
    public static void addShoppingCart(ShoppingCart sc) {
        //add to database
        String query = "INSERT INTO SHOPPINGCART(SCID,NAME,PRICE) VALUES(?,?,?)";
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, sc.getProductId());
            stmt.setString(2, sc.getProductName());
            stmt.setInt(3, sc.getPrice());
            int rows = stmt.executeUpdate();
            System.out.println("Rows impacted : " + rows);
            conn.close();
>>>>>>> origin/Louisnew
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
>>>>>>> refs/heads/Aniket2

    /**
     * Return lost of all users in database
     * @see User
     * @return list of users
     */
<<<<<<< HEAD
=======
<<<<<<< HEAD
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
=======
>>>>>>> refs/heads/Aniket2
    public static ArrayList<Product> getAllusers() {
//        return list of users from db
        ArrayList<Product> products = new ArrayList<>();

        String query = "SELECT * FROM PRODUCT";
<<<<<<< HEAD
=======
>>>>>>> origin/Louisnew
>>>>>>> refs/heads/Aniket2
        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
                Product p = new Product();
//            changed based on the roles (need final revision, meeting on this) 
//                also on this part we should have more roles 
                p.setProductName(rs.getString("productname"));
                p.setPrice(rs.getInt("price"));
//                i don't think we should change customer ID
//                p.setCustomerID(rs.getInt("id"));
                products.add(p);
=======
>>>>>>> refs/heads/Aniket2
                Product u = new Product();
                u.setProductId(rs.getString("productId"));
                u.setProductName(rs.getString("name"));
                u.setPrice(rs.getInt("price"));
                u.setProductDescription(rs.getString("description"));
                products.add(u);
<<<<<<< HEAD
=======
>>>>>>> origin/Louisnew
>>>>>>> refs/heads/Aniket2
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return products;
    }

    /**
     * Delete given user from database
<<<<<<< HEAD
=======
<<<<<<< HEAD
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
=======
>>>>>>> refs/heads/Aniket2
     * @see User
     * @param u User to be deleted
     * 
     */
    public static void deleteUser(Product u) {
        String query = "delete from PRODUCT where productId = ?";
        System.out.print(query);

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, u.getProductId());
            System.out.print(stmt);
<<<<<<< HEAD
=======
>>>>>>> origin/Louisnew
>>>>>>> refs/heads/Aniket2
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Edit given user details in the database
<<<<<<< HEAD
=======
<<<<<<< HEAD
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
=======
>>>>>>> refs/heads/Aniket2
     * @param oldProd existing user in database
     * @param newProd modified user details to be added
     */
    public static void editUser(Product oldProd, Product newProd) {
        String query = "UPDATE PRODUCT SET name=?, price=?,description=? WHERE productId=?";

        try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, newProd.getProductName());
            stmt.setInt(2, newProd.getPrice());
            stmt.setString(3, newProd.getProductDescription());
            stmt.setString(4, oldProd.getProductId());
<<<<<<< HEAD
=======
>>>>>>> origin/Louisnew
>>>>>>> refs/heads/Aniket2
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> refs/heads/Aniket2
    
            /**
     * Insert given customer to database
     * @see User
     * @param customer User object to be added
     */
    
/*
public static boolean containsUser(Customer customer) {
    String query = "SELECT EXISTS (SELECT 1 FROM CUSTOMER WHERE name = ?) AS user_exists";
    try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, customer.getName()); // Assuming getCustomerId() returns the username

        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
          // return rs.getBoolean("user_exists");
         boolean userExists = rs.getBoolean("user_exists");
              if (userExists) {
                 //User exists, display login successful message
               JOptionPane.showMessageDialog(null, "Login successful");
           }
             return userExists;
            
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}*/
    
    public static Customer getUser(String username) {
    String query = "SELECT * FROM CUSTOMER WHERE name = ?";
    try (Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, username);

        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            Customer user = new Customer();
            user.setCustomerID(rs.getString("customerId"));
            user.setName(rs.getString("name"));
            user.setAge(rs.getInt("age"));
            user.setGender(rs.getString("gender"));
            user.setRegisterDate(rs.getDate("registerDate").toLocalDate());
            user.setEmail(rs.getString("email"));
            user.setTeleNo(rs.getInt("teleNo"));
            user.setProfilePic(new ImageIcon(rs.getBytes("profilePic")));
            user.setRole(rs.getString("role"));
            user.setPassword(rs.getString("password"));

            return user;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null; 
}


<<<<<<< HEAD

=======
>>>>>>> origin/Louisnew
>>>>>>> refs/heads/Aniket2
}
