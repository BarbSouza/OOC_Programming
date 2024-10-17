/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seeds;

/**
 *
 * @author Barbara
 */
public abstract class Seeds {
    //PROPERTIES (attributes)
    private String name;
    private double price;
    private int stock;
    private int amount;
    private String scientificName;
    private String type;
    private String height;
    private String sowing;
    private String flowering;
    private String description;
    
    
    //Constructors
    public Seeds(String name, double price, int stock, int amount, String scientificName, String type, String height, String sowing, String flowering, String description) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.amount = amount;
        this.scientificName = scientificName;
        this.type = type;
        this.height = height;
        this.sowing = sowing;
        this.flowering = flowering;
        this.description = description;
    }

    //METHODS (Abilities/ Behaviours)
    public abstract String buy();
    
    
    
    //GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public int getAmount() {
        return amount;
    }
    
    public String getScientificName() {
        return scientificName;
    }

    public String getType() {
        return type;
    }

    public String getHeight() {
        return height;
    }

    public String getSowing() {
        return sowing;
    }

    public String getFlowering() {
        return flowering;
    }

    public String getDescription() {
        return description;
    }


    // Method to get full details of the seeds
    public String getFullDetails() {
        return "Name: " + name + "\n" +
               "Price: €" + price + "\n" +
               "Stock: " + stock + "\n" +
               "Quantity: " + amount + "kg each\n" +
               "Scientific Name: " + scientificName + "\n" +
               "Type: " + type + "\n" +
               "Height: " + height + "\n" +
               "Sowing: " + sowing + "\n" +
               "Flowering: " + flowering + "\n" +
               "Description: " + description;
    }

    //Method to reduce Stock with the quantity selected from the user
    public void reduceStock(int quantity) {
        if (quantity > 0 && quantity <= stock) {
            stock -= quantity;
        } else {
            System.out.println("Invalid quantity or insufficient stock.");
        }
    }
    
}
    

   


