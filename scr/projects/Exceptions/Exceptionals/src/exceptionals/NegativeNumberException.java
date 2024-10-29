/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionals;

/**
 *
 * @author Barbara
 */
public class NegativeNumberException extends ArithmeticException {
    
    //constructor
    //Non-parametized method
    //doesn't take an argument
    public NegativeNumberException(){
        super();
    }
    
    //constructor
    //Parametized Exception
    //takes an argument
    public NegativeNumberException(String message){
        super(message);
    }
}
