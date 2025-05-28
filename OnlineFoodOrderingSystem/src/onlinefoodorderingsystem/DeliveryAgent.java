/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinefoodorderingsystem;

/**
 *
 * @author IMASHA THARUSHI
 */
public class DeliveryAgent extends User{

    public DeliveryAgent(String userId, String username, String password) {
        super(userId, username, password);
    }
    
    public void pickOrder(){
        
    }
    
    public void markAsDelivered(){
    }

    @Override
    void viewDashboard() {
        System.out.println("1.View Assigned Orders");
        System.out.println("2.Mark Order as Picked Up or Delivered");
        System.out.println("3.View delivery History");
    }
    
    
    
}
