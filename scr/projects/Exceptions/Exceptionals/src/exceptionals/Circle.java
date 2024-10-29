/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionals;

/**
 *
 * @author Barbara
 */
public class Circle {
        //The Circle must have a radius
        //We need to validate the inputs
        //
    
    //Construct the attributes
    int radius; //attribute
    
    //constructor to assign or retrieve the value
    
    public Circle(int radius) throws ZeroLengthException{ // //return type
        //The condition to text for our exception
        if(radius == 0){
            //if 0 throw an exception message
            throw new ZeroLengthException();
            
        }else if(radius < 0){
            throw new NegativeNumberException("Radius cannot be a negative number");
        }
        //otherwise assign the radius value to the attribute
        this.radius = radius;
    }
    
}
