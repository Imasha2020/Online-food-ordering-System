/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinefoodorderingsystem;

/**
 *
 * @author IMASHA THARUSHI
 */


//Abstraction and excapsulation Used
abstract class User {
    private String userId;
    private String username;
    private String password;

    public User(String userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    public boolean login(String enteredUsername , String enteredPassword){
        if(this.username.equals(enteredUsername)&&this.password.equals(enteredPassword)){
            System.out.println("Login SuccessFul for user:" + username);
            viewDashboard();
            return true;
        }
        else{
            System.out.println("Login failed.Invalid credentials");
            return false;
        }
    }
    
    abstract void viewDashboard();
    
}
