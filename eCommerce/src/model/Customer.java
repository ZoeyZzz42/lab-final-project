/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.Date;
import javax.swing.ImageIcon;
import java.util.UUID;

/**
 *
 * @author shakt
 */
public class Customer {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerId() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

   
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTeleNo() {
        return teleNo;
    }

    public void setTeleNo(long teleNo) {
        this.teleNo = teleNo;
    }

    public ImageIcon getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(ImageIcon profilePic) {
        this.profilePic = profilePic;
    }

    @Override
    public String toString() {
       return name ;
    }
    
    
    
    
    String name;
    public String customerID;
    int age;
    String gender;
    LocalDate registerDate;
    String email;
    long teleNo;
    public ImageIcon profilePic;
    
    
    
}
