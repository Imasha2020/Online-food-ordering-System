/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package onlinefoodorderingsystem;

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
        
        try {
            System.out.println("====================Welcome to Spago Foods delivery================= ");
            Thread.sleep(1000);
            System.out.println("Are you user of Spago Foods?(Yes or No)");
            String input1 = input.nextLine();
            
            if(input1.equals("Yes")){
                System.out.println("========Login========");
            }else{
                System.out.println("========SignUp========");
            } 
            
        } catch (InterruptedException ex) {
            Logger.getLogger(OnlineFoodOrderingSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
    }
    
}
