/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkginterface;

/**
 *
 * @author Barbara
 */
//extends classes, implements interfaces
public class IceCream extends Food implements Allergic{
    
    private final Allergens[] ALLERGENS = {Allergens.DAIRY};
    
    public IceCream(){
        super{"Ice Cream", 4.5, Courses.DESSERT);
    }
    
    @Override
    public Allergens[] listAllergens(){
        return ALLERGENS;
    }
        
}
