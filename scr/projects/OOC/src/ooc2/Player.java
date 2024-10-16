/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc2;

/**
 *
 * @author Lecturer
 */
public class Player {
    
//    This player class will have a couple attributes 
//    These attributes should only be for the Player
    
//    List out all the attributes for the player class
//    These attributes are stored in Mem RAM
    private String fName; // Messi
    private String lName; // Last name we have now 
    private String country; // The most recent country value
    private int age;
    private String position;
    
//    Now that we have the attributes we need to create 
//    A constructor, then we pass in the attributes for this constructor
    
    public Player(String fName, String lName, String country, int age, String position){
    
//    The constructors job is to take data intended for this class 
//      And create an way to invoke the current attribute values
        this.fName = fName; // Messi // The most current instance of this attribute
        this.lName = lName; // this is the input being assign to the attribute in Mem
        this.country = country;
        this.age = age;
        this.position = position;
    
    }
    
//    Anytime we want to pass a value to any of these attributes we use the constructor 
//    To assign these values
    
    
//        Getters and Setters are important!!
//    Allow us to either read the current data from the system or 
//    Assign a new value to the attributes on this system
    
    public String getfName(){
        return fName;
    }
    
    public String getlName(){
        return lName;
    }
    
    
    public int getAge(){
        return age;
    }

    public String getPosition() {
        return position;
    }

//    Setter require an input 
//    The input from the setters must match the constructs inputs
//    Constructor Player(String fName){}
//    Setter      setfName(String fName)
    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    
    
    public String toString(){
            return "Name: " + fName + " " + lName + ", Country: " + country + ", Age: " + age + ", Position: " + position;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
