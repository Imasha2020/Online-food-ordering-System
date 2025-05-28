/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinefoodorderingsystem;

/**
 *
 * @author IMASHA THARUSHI
 */
public class Admin extends User{
    
    private String adminId;

    public Admin(String adminId, String userId, String username, String password) {
        super(userId, username, password);
        this.adminId = adminId;
    }
    

    @Override
    void viewDashboard() {
        System.out.println("1.View All Users");
        System.out.println("2.Manage Restaurants");
        System.out.println("3.View all orders");
        System.out.println("4.Delete User");
    }
    
}
