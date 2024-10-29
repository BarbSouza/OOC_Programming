/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seeds;

/**
 * Child Class of Seeds
 * @author Barbara
 */
public class Lily extends Seeds {

    public Lily(int stock) {
        super("Lily", 7, stock, 7, "Lilium", "Annual", "85cm", "September to December", "May to June", "Lily seeds will produce beautiful, tall Purple flowers from May to June. \n Alliums are much loved by bees.");
        //Setting this plant name and price
        //stock still needs to be defined
        //Extra information on the plants
        //Font: https://seedsireland.ie/products/allium-bulbs-gladiator?_pos=1&_sid=eb0ad1449&_ss=r
    }

    @Override
    public String buy() {
        return "Lliy";
    }
    
}
