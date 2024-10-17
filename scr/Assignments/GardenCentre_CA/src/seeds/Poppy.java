/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seeds;

/**
 * Child Class of Seeds
 * @author Barbara
 */
public class Poppy extends Seeds {

    public Poppy( int stock) {
        super("Poppy", 5.5, stock, 8, "Papaver rhoeas", "Annual", " 40-80 cm", "March to May", "June to August", "The flowers produced by this selection of mixed Poppy seeds are various shades of red coloured varieties.\n It includes both single, and double flowered poppies. \n These flowers are very attractive to bees and butterflies.");
        //Setting this plant name and price
        //stock still needs to be defined
        //font: https://seedsireland.ie/products/poppy-mixed?_pos=1&_sid=4d27fd57e&_ss=r
   
    }

    @Override
    public String buy() {
        return "Poppy";
    }
    
    
}
