/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *  Represents an order in the e-commerce system.
 * @author anikettiwari
 */

public class Order {
    /**
     * Order ID associated with the order.
     */
    public String orderID;
    /**
     * List of products included in the order.
     */
    private ArrayList<Product> products;

    /**
     * Customer ID associated with the order.
     */
    private String customerID;

    /**
     * Status of the order.
     */
    private String status;
    
    /**
     * Get the order ID associated with the order.
     *
     * @return order ID as a String.
     */
    public String getOrderID(){
        return orderID;
    }
    
    /**
     * Set the order ID for the order.
     *
     * @param orderID as string
     */
    public void setOrderID(String orderID){
        this.orderID = orderID;
    }

    /**
     * Get the list of products in the order.
     *
     * @return ArrayList of Product objects.
     */
    public ArrayList<Product> getProducts() {
        return products;
    }

    /**
     * Set the list of products for the order.
     *
     * @param products ArrayList of Product objects.
     */
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    /**
     * Get the customer ID associated with the order.
     *
     * @return Customer ID as a String.
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Set the customer ID for the order.
     *
     * @param customerID Customer ID as a String.
     */
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    /**
     * Get the status of the order.
     *
     * @return OrderStatus enum representing the order status.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Set the status for the order.
     *
     * @param status OrderStatus enum representing the order status.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Order ID: ").append(orderID).append("\n");
        stringBuilder.append("Customer ID: ").append(customerID).append("\n");
        stringBuilder.append("Order Status: ").append(status).append("\n");
        stringBuilder.append("Products:\n");

        for (Product product : products) {
            stringBuilder.append("  ").append(product.toString()).append("\n");
        }

        return stringBuilder.toString();
    }
}
