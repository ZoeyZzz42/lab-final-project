package model;

import java.time.LocalDate;
import javax.swing.ImageIcon;

/**
 * ShoppingCart class
 */
public class ShoppingCart {
    private String scID;
    private String name;
    private int price;

    // Getters and setters for scID and name
    public String getScID() {
        return scID;
    }

    public void setScID(String scID) {
        this.scID = scID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter for price
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
