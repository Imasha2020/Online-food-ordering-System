/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlinefoodorderingsystem;

/**
 *
 * @author IMASHA THARUSHI
 */
class Restaurant {
    private String restaurant;
    private String name;
    private FoodItem[] menu;

    public Restaurant(String restaurant, String name, FoodItem[] menu) {
        this.restaurant = restaurant;
        this.name = name;
        this.menu = menu;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FoodItem[] getMenu() {
        return menu;
    }

    public void setMenu(FoodItem[] menu) {
        this.menu = menu;
    }
    
    public void addFoodItem(){
        
    }
    
    public void updateMenu(){
        
    }
}
