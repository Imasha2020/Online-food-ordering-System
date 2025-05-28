/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinefoodorderingsystem;

/**
 *
 * @author IMASHA THARUSHI
 */
public class Customer extends User {
    private String address;
    private Order[] orderHistory; 

    public Customer(String address, Order[] orderHistory, String userId, String username, String password) {
        super(userId, username, password);
        this.address = address;
        this.orderHistory = orderHistory;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Order[] getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(Order[] orderHistory) {
        this.orderHistory = orderHistory;
    }

   public void placeOrder(){
       
   }
   
   public void makePayment(){
   }

    @Override
    void viewDashboard() {
        System.out.println("1.You can Browse Restaurants & Menus");
        System.out.println("2.Search/Filter FoodItems");
        System.out.println("3.View Cart / Place Order");
        System.out.println("4.View Order History");
        System.out.println("Rate/Review Orders");
    }
    
    
    
}
