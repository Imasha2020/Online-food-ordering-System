/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinefoodorderingsystem;

import java.util.Date;

/**
 *
 * @author IMASHA THARUSHI
 */


//Used encapsulation

public class Order {
    private String orderID;
    private Customer customer;
    private Restaurant restaurant;
    private FoodItem[] items;
    private String status;
    private Date timestamp;

    

    public Order(String orderID, Customer customer, Restaurant restaurant, FoodItem[] items, String status, Date timestamp) {
        this.orderID = orderID;
        this.customer = customer;
        this.restaurant = restaurant;
        this.items = items;
        this.status = status;
        this.timestamp = timestamp;
    }
    
    
    public double calculateTotal(){
        double total = 0.0;
       for(FoodItem item : items){
           total += item.getPrice();
       }
       
       return total;
    }
    
    public void updateStatus(){
        
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public FoodItem[] getItems() {
        return items;
    }

    public void setItems(FoodItem[] items) {
        this.items = items;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    
    
}
