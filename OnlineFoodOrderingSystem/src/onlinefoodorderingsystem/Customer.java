/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinefoodorderingsystem;

/**
 *
 * @author IMASHA THARUSHI
 */

import java.util.Scanner;

public class Customer extends User {
    
    
    private String address;

    public Customer(String address, String userId, String username, String password) {
        super(userId, username, password);
        this.address = address;
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
        System.out.println("5.Rate/Review Orders");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter what is your choice: ");
        int choice = input.nextInt();
        
        switch(choice){
            case 1:
                Restaurant restaurants = new Restaurant();
        }
        
        
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
