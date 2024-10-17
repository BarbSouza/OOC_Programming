/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gardencentre;

//Importing the Array and ArrayList
//Importing the Parent Class (Seeds) and also the child classes (Daisy, Lavander, Lily, Poppy and Sunflower)
//That way I can access all those classes data in this file
//Importing Scanner to get the user Input
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import seeds.*;



/**
 * Switch Version
 * 
 * @author Barbara Souza
 */
//Declaring an Array and the totalSpend variables
public class ShoppingTrolley {
    
    private ArrayList<Seeds> availableItems;  //this will store all the items in the trolley. They could be anything!
    private List<String> selectedItems;
    private double totalSpent;
    
    /**
     * Create a shopping bag by initialising the items to an empty arraylist
     */
    public ShoppingTrolley(){
        
        availableItems = new ArrayList<>();
        selectedItems = new ArrayList<>();
        totalSpent = 0.0;
        buyItem();
    }
    
    //Method to initialize the available Seeds in the shop
    public void buyItem(){
        
        availableItems.add(new Sunflower(15));
        availableItems.add(new Poppy(20));
        availableItems.add(new Daisy(30));
        availableItems.add(new Lily(25));
        availableItems.add(new Lavander(10));
        //adding the items to the availableItems arrayList
    }
    /**
     * create a formatted String containing all the items in the Trolley
     * @return the formatted String
     * Also clears the items list
     */
    public String emptyTrolley(){
        
        String itemList = "";
        
        for(String item: selectedItems){
            
            itemList = itemList + item + "\n";
            totalSpent = 0;
           
                    
        }
        
        selectedItems.clear(); //the trolley is empty now
        
        return itemList;
    }
    
  
    
    //Method to display available Seeds with the price and how many are in stock 
    public void displayAvailableItems() {
        System.out.println("Available Seeds:");
        for (Seeds seeds : availableItems) {
            //This is the foreach loop which gets each item as a string from selectedItems array and do the following code
            System.out.println("- Seed: " + seeds.getName());
            System.out.println(" Price: €" + seeds.getPrice());
            System.out.println(" In Stock: " + seeds.getStock());
            System.out.println();
        }
    }
    public void displayItems() {
        for (Seeds seeds : availableItems) {
            System.out.println("- " + seeds.getName());
        }
    }
    
    //Method to allow the user to purchase the Seeds
    public void startPurchase() {
        Scanner myKB = new Scanner(System.in);
        // Declaring the Scanner to get the user input
        boolean finished = false;
        // Declaring a boolean variable called finished to know when the code can stop
        
        /**
         * This next part of the code will first display the Items selected by the user and the quantity and the sum of those items (initianaly none)
         * Then the menu with all the Available Items that was set in the Method (displayAvailableItems)
         * Then the option to Proceed to Checkout, Remove an item and More information
         * At the end get the user input to choose an item to add to the trolley and the quatity
         * after the menu will display again with the user selections and the stock updated
         * this will reapeat until the user select "Proceed to Checkout"
         **/
         
        while(!finished) { //This loop will happen until its not finish
            System.out.println("\nYour Trolley:");
            for (String item : selectedItems) { 
                //In this foreach loop which gets each item as a string from selectedItems array and do the following code
                System.out.println("- " + item);
                // This part will show all the items the user added to the trolley followed by "- "
            }
            System.out.println("Total Spending: €" + totalSpent); //This will show how much the current items in the trolley sum up to
            
            System.out.println("\nSeeds:");
            displayAvailableItems(); //Will display all the available items according to the method set in the beggining
            System.out.println("- 1) Proceed to Checkout"); //Option to finish the loop 
            System.out.println("- 2) Remove Items"); //Option to remove Item
            System.out.println("- 3) More Information");
            
            System.out.println("Add to trolley: "); 
            String buy = myKB.nextLine();
            //Asking for the user input to select an item to add to trolley

            switch (buy.toLowerCase()) {
                //creating a switch statement to happen different things depending
                case "1":
                    System.out.println("\nCheckout:");
                    for (String item : selectedItems) {
                        System.out.println("- " + item);
                        // This part will show all the items the user added to the trolley followed by "- "
                    }
                    System.out.println("Total amount spent: €" + totalSpent);
                    System.out.println("Do You wish to go back to the shop? (yes/no)"); 
                    String menu = myKB.nextLine();
                    if (menu.equalsIgnoreCase("yes")) {
                        //if user input is "yes" the menu will show again
                        finished = false;
                    } else {
                    //happens if user input is "no" this loop will end
                    finished = true;
                    }
                    break;
                    
                case "2":
                    //happens if user input is "remove items" first will check if there is any item to remove then if it does it romeves everything from trolley.
                    if (selectedItems.isEmpty()) {
                System.out.println("No items to remove.");
                //check if trolley is already empty, if it is this messege shows
                
                    } else {
                    emptyTrolley();
                    //if not empty this calls the Method to emptyTrolly
                    }
                    break;
                    
                case "3":
                    //happens if user input is "more information"
                    System.out.println("Which Item do you wish to know more information?"); 
                    displayItems();
                    String seedInfo = myKB.nextLine();
                    //asks for user input to know which item
                    boolean seedFound = false;
                    //declaring a boolean to know when to finish the loop
                    for (Seeds seeds : availableItems) {
                        //In this foreach loop will check each of the seeds in the seeds package from the availableItems array
                        if (seeds.getName().equalsIgnoreCase(seedInfo)) {
                            //if the user input is a valid option (one of the seeds) this will call the method done on seeds to display all the information of the chosen seed
                            System.out.println(seeds.getFullDetails());
                            seedFound = true;
                            //its a valid input so finishes here
                        break;
                        }
                    } 
                    if (!seedFound) {
                        System.out.println("Invalid input. please try again");
                        //not a valid input (not one of the seeds in the seeds package) so this messege will print
                    }
                    break;
                    
                default:
                    //if it's none of the above (proceed to checkout, remove items, more information) the default will happen which is to get the qauntity of the item
                    boolean validSelection = false;
                    //declaring a boolean to know if user input is valid
                    for (Seeds seeds : availableItems) {
                        if (seeds.getName().equalsIgnoreCase(buy)) {
                            //this happens if user input is one of the available items
                            System.out.println("Enter quantity for " + seeds.getName() + " (available " + seeds.getStock() + "): ");
                            //this asks for the quantity and shows the available stock of the chosen seed
                            int quantity = myKB.nextInt();
                            myKB.nextLine();
                            //asks for user input (int) to know the quantity
                            if (quantity > 0 && quantity <= seeds.getStock()) {
                                //if the quantity is bigger than 0 and smaller than the available this part will happen
                                selectedItems.add(seeds.getName() + " x" + quantity);
                                //adds to the selected items arraylist the item name and the chosen quantity
                                totalSpent += seeds.getPrice() * quantity;
                                //adds to tatalSpent that item price times the quantity
                                seeds.reduceStock(quantity);
                                //calls the method to reduce the quantity
                                validSelection = true;
                                //its a valid input so the code ends
                            } else {
                                System.out.println("Invalid quantity or insufficient stock.");
                                //if its not a valid quantity this error message prints
                            }
                            break;
                        }
                    }
                    if (!validSelection) {
                        System.out.println("Invalid choice. Please try again.");
                        //if its not a valid option this error message prints
                    }
                    break;
            }
        }
        //this happens when the loop ends (by user input "proceed to checkout")
        System.out.println("\nCheckout:");
        for (String item : selectedItems) {
            System.out.println("- " + item);
            // This part will show all the items the user added to the trolley followed by "- "
        }
        System.out.println("Total amount spent: €" + totalSpent);
        System.out.println("\nThank you for shopping with us!");
    }
    
    }

    
    
    
    

