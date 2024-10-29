/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seeds;

/**
 * Child Class of Seeds
 * @author Barbara
 */
public class Daisy extends Seeds {

    public Daisy(int stock) {
        super("Daisy", 8, stock, 8, "Leucanthemum vulgare", "Perennial", "60 cm", "March to May", "July to October", "The Oxeye Daisy is a wildflower native to Ireland. \n It has dainty white flowers with golden centres. \n It produces a lot of seed each year, which helps it to spread easily and cover bare ground. \n It can also spread by its roots. \n Daisies offer lots of pollen, making it very popular with bees! \n Oxeye Daisy can grow to 60cm in height.");
        //Setting this plant name and price
        //stock still needs to be defined
        //Font: https://seedsireland.ie/products/oxeye-daisy-organic-seed?_pos=1&_sid=7304ef1f5&_ss=r
    }

    @Override
    public String buy() {
        return "Daisy";
    }

    
    
}
