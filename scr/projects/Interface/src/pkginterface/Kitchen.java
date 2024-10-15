/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

import java.util.ArrayList;

/**
 *
 * @author Barbara
 */
public class Kitchen {
    
    private ArrayList<Food> orders = new ArrayList<>();
    
    public int numRemainingOrders(){
        
        return orders.size();
        
    }
    
    public void add(Food food){ //adds food to the orders
        orders.add(food);
        System.out.println("Added: " + food.getName());
        
        if(food instanceof Allergic){
            
            System.out.println("Warning this order contains the following allergens: ");
            
            Allergens[] allergens = ((Allergic) food).listAllergens();
            
            for(Allergens allergen: allergens){
                
                System.out.println(allergen);
                
            }
        }
    }
    
    public void remove(Food food){
        
        orders.remove(food);
        
    }
    
    public Food serveNextMeal(){
        
        for(Courses course: Courses.values()){
            
            for(Food food: orders){
                
                if(food.getType() == course){
                    orders.remove(food);
                    return food;
                }
                
                
            }
        }
        return null;
    }
    
    
}
