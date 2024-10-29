/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionals;

/**
 *
 * @author Barbara
 */
public class Rectangle {
    
    //atrributes
    
    int length;
    int width;
    
    //the constructor will manage/ validate the input
    
    public Rectangle(int length, int width){
        
        if(length <= 0 || width <= 0){
            throw new NegativeNumberException("The side must be positive");
            
        }
        //otherwise if the value is bigger than zero
        this.length = length;
        this.width = width;
        
    }
    
}
