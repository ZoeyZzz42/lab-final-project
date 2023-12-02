/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author shakt
 */
public class CustomerDirectory {
    ArrayList<Customer> allUsers;

    public CustomerDirectory() {
        this.allUsers = new ArrayList<>();
    }
    
    

    public ArrayList<Customer> getAllUsers() {
        return allUsers;
    }

    public void setAllUsers(ArrayList<Customer> allUsers) {
        this.allUsers = allUsers;
    }
    
      public void addUser(Customer newUser){
        this.allUsers.add(newUser);
    }
    
    public void removeUser(Customer user){
        this.allUsers.remove(user);
    }

    @Override
    public String toString() {
        return "UserDirectory{" + "allUsers=" + allUsers + '}';
    }
    
    
}
