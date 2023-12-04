/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author anikettiwari
 */
public class OrderDirectory {
    
    ArrayList<Order> allOrders;

    public OrderDirectory() {
        this.allOrders = new ArrayList<>();
    }

    public ArrayList<Order> getAllOrders() {
        return allOrders;
    }

    public void setAllOrders(ArrayList<Order> allOrders) {
        this.allOrders = allOrders;
    }
    
    public void addOrder(Order newOrder){
        this.allOrders.add(newOrder);
    }
    
    public void removeOrder(Order order){
        this.allOrders.remove(order);
    }

    @Override
    public String toString() {
        return "OrderDirectory{" + "allOrders=" + allOrders + '}';
    }
    
    
}
