/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptionals;

/**
 *
 * @author Barbara
 */
public class Exceptionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Taking in the user input
        //
        
        Scanner sc = new Scanner(System.in);
        
        boolean validInput = false;
        Circle circle1;
        //We need to take the input for the circle
        
        int input = 0;

        //the first exception block 
        while(!validInput){ //check the user input and prompt over and over 
            try{
            //Ask the user what you want to store
            System.out.println("What is the radius of the cricle?");
            input = sc.nextInt();
            circle1 = new Circle(input);
            validInput = true;
            }catch(InvalidLengthException e){
                System.out.println(e);
            }catch(NegativeNumberException e){
                System.out.println(e);
            }
        }
    
    //the second for rectangle
        
        Rectangle rect1 = new Rectangle(input, 6);
        
        //inut = is a java runtime unchecked exception
        //Java will not tell us about this in advance
        
        System.out.println(input);
        
        System.out.println(8/input); //ArithmeticException possible divide by zero
        
        int[] numArray = {1,2,5,8,11,14};
        
        System.out.println(numArray[input]); //check the input value in the array
        
        //the second exception block for rectangle
        try{
            throw new Exception("This is a general exception");
        }catch(FileNotFoundException e){
            System.out.println("The File is not Found");
        }catch(Exception e){
        e.printStackTrace(); //this stack trace is
        //a reference to when and where the event error occured
        }


    
}
    
}
