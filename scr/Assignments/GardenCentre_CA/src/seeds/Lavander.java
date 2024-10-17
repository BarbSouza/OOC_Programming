/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seeds;

/**
 * Child Class of Seeds
 * @author Barbara
 */
public class Lavander extends Seeds {

    public Lavander(int stock) {
        super("Lavander", 7.5, stock, 12, "Lavandula angustifolia", "Perennial", "40-60 cm", "February to May", "July to August", "English Lavender produces beautiful, bee friendly, deep purple, fragrant flowers. \n Growing Lavender from seed takes patience. \n The seed can be slow to germinate, taking 3 to 6 weeks. \n Lavender also does not always flower in its first year of life. \n This beautiful plant is worth the wait though, as it will flower every summer after, once it is cared for.");
        //Setting this plant name and price
        //stock still needs to be defined
        // font: https://seedsireland.ie/products/lavender-hidcote-blue?_pos=1&_sid=c409f451d&_ss=r
    }

    @Override
    public String buy() {
        return "Lavander";
    }
    
}
