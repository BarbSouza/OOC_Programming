/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author Barbara
 */
public class GarlicCheeseBread extends Food implements Allergic{
    private final Allergens[] ALLERGENS = {Allergens.DAIRY, Allergens.GLUTEN};
            
    public GarlicCheeseBread(){
        super("Garlic Cheese Bread", 6.0, Courses.STARTER);
    }

@Override
public Allergens[] listAllergens(){
    return ALLERGENS;
}

}