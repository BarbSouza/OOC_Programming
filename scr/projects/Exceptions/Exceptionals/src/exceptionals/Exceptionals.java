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

    }
    
}
    
}
