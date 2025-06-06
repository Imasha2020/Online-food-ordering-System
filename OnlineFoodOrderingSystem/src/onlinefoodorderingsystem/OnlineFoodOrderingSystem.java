/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package onlinefoodorderingsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author IMASHA THARUSHI
 */
public class OnlineFoodOrderingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        List<User> users = new ArrayList<>();//making arraylist named users
        
        users.add(new Admin("A001" , "admin1" , "admin123"));//Add a default admin for testing login
        users.add(new Customer("Baduraliya","C001" , "cutomer1" , "customer123" ));
        users.add(new RestuarantOwner("KFC" , "R001" , "resOwn1" , "resOwn123"));
        users.add(new DeliveryAgent("D001" , "delAgent1" , "delAgent123"));
        
        
        
        while(true){
            System.out.println("\n====Welcome to Spago Foods Delivery====");
            System.out.println("1. Login"); 
            System.out.println("2. Sign Up");
            System.out.println("3. Exit");
            System.out.print("Choose Option: ");
            
            int choice = input.nextInt();
            input.nextLine();//Clear Buffer
            
            if(choice == 1){
                System.out.println("Enter username: ");
                String username = input.nextLine();
                System.out.println("Enter Password: ");
                String password = input.nextLine();
                
                User loggedIn = null;
                
                for(User u: users){
                    if(u.getUsername().equals(username)&& u.getPassword().equals(password)){
                        loggedIn = u;
                        break;
                    }
                }
                
                
                if(loggedIn != null){
                    System.out.println("\n=====Login successful!=====\n");
                    loggedIn.viewDashboard(); //Polymorphism
                }else{
                    System.out.println("❌ Invalid username or password.");
                }
                
            }else if(choice == 2){
                User newUser = signUp(input);
                
                if(newUser !=null){
                    users.add(newUser);
                    System.out.println("✅ Sign-up successful! You can now log in");
                }
                
                
            }else if(choice == 3){
                System.out.println("Exiting System...Good Bye!..");
                break;
            }else{
                System.out.println("❗ Invalid choice. Try again.");
            }
            
       }
        
        input.close();
        
    }
    
    
    //sign-up method
        public static User signUp(Scanner input){
            System.out.println("\n====Sign Up======");
            System.out.println("Enter role (Customer / RestaurantOwner / DeliveryAgent / Admin): ");
            String role = input.nextLine().trim(); //remove space of beginning and ending
            
            System.out.println("Enter username: ");
            String username = input.nextLine();
            System.out.println("Enter password: ");
            String password = input.nextLine();
            
            switch(role.toLowerCase()){
                case "customer":
                    System.out.println("Enter Address: ");
                    String address = input.nextLine();
                    return new Customer(address , generateId("C") , username , password);
                    
                case "RestaurantOwner" :
                    System.out.println("Enter Restuarant Name: ");
                    String Name = input.nextLine();
                    return new RestuarantOwner(Name, generateId("R"), username, password);
                    
                case "DeliveryAgent" :
                    return new DeliveryAgent(generateId("D"), username, password);
                    
                case "Admin" :
                    return new Admin(generateId("A") , username , password);
                    
                    
                default:
                    System.out.println("Invalid role");
                    return null;
            }
        
            
        }

    private static String generateId(String c) {
       return System.currentTimeMillis() + c;
    }

    
}
