/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author Barbara
 */
public class Food {
    private String name;
    private double price;
    private Courses type;
    
    
    private static Kitchen kitchen;
    
    public static void setKitchen(Kitchen newKitchen){
        kitchen = newKitchen;
    }
    
    public Food(String name, double price, Courses type){
        
        this.name = name;
        this.price = price;
        this.type = type;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
    
    public Courses getType(){
        return type;
    }
    
  //  public void order(){
   //     kitchen
   // }
    
}
