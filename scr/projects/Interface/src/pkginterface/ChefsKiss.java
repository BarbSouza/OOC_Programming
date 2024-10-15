/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author Barbara
 */
public class ChefsKiss {
    public static void main(String[] args){
        
        Kitchen kitchen = new Kitchen();
        
        Food.setKitchen(kitchen);
        
        //meal 1
        kitchen.add(new VegSoup()); //Starter
        kitchen.add(new Chicken()); //Main
        kitchen.add(new IceCream()); //Dessert
        
        //meal 2
        kitchen.add(new GarlicCheeseBread());
        kitchen.add(new Chicken()); 
        kitchen.add(new IceCream());
    }
    
}
