/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import javax.swing.ImageIcon;

/**
 *
 * @author jq
 */
public class ShoppingCart {
    private String scID;
    private String name;
    private int price;

    /**
     * @return the scID
     */
    public String getProductName() {
        return scID;
    }

    /**
     * @param productName the scID to set
     */
    public void setProductName(String productName) {
        this.scID = productName;
    }

    /**
     * @return the name
     */
    public String getProductId() {
        return name;
    }

    /**
     * @param productId the name to set
     */
    public void setProductId(String productId) {
        this.name = productId;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
}
