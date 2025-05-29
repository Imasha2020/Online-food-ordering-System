/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinefoodorderingsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author IMASHA THARUSHI
 */
public class Admin extends User{

    public Admin(String userId, String username, String password) {
        super(userId, username, password);
    }
    
    

    @Override
    void viewDashboard() {
        System.out.println("1.View All Users");
        System.out.println("2.Manage Restaurants");
        System.out.println("3.View all orders");
        System.out.println("4.Delete User");
        
        
        List<User> users = new ArrayList<>();//making arraylist named users
        
        users.add(new Admin("A001" , "admin1" , "admin123"));//Add a default admin for testing login
        users.add(new Customer("Baduraliya","C001" , "cutomer1" , "customer123" ));
        users.add(new RestuarantOwner("KFC" , "R001" , "resOwn1" , "resOwn123"));
        users.add(new DeliveryAgent("D001" , "delAgent1" , "delAgent123"));
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter what is your choice: ");
        int choice = input.nextInt();
        
        switch(choice){
            case 1:
                for(User u : users){
                    String userDescription = u.toString();
                    System.out.println(userDescription);
                }
                
            case 2:
                
                
        }
        
    }
    
}
