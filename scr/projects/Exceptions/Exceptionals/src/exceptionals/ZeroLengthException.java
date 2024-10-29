/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionals;

/**
 *
 * @author Barbara
 */
public class ZeroLengthException extends InvalidLengthException {
    
    //This will handle the lenth = 0 exception
    public ZeroLengthException(){
        //We can still print out hardcoded exceptions
        super("The Length of a Shape cannot be 0");
    }
    
    public ZeroLengthException(String message){
        //We can still print out hardcoded exceptions
        super(message);
    }
    
}
