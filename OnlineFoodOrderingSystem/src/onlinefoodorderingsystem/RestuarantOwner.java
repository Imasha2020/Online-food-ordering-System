/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinefoodorderingsystem;

/**
 *
 * @author IMASHA THARUSHI
 */
public class RestuarantOwner extends User {
     private String restaurantName;

    public RestuarantOwner(String restaurantName, String userId, String username, String password) {
        super(userId, username, password);
        this.restaurantName = restaurantName;
    }
     
     

    @Override
    void viewDashboard() {
        System.out.println("1.Add/Update/Delete Food Items");
        System.out.println("2.View Orders Placed to Their Restaurant");
        System.out.println("3.View Customer Ratings/Feedback");
        System.out.println("4.Restaurant Profile(e.g., opening hours, delivery zones)");
    }
    
}
