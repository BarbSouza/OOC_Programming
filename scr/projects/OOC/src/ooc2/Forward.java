/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc2;

/**
 *
 * @author Lecturer
 */
public class Forward extends Player { // Dictated the relationship
//    This Forward class inherentece the parent Player properties
//    We will inhernt the attributes from the parent plus more
//    The new attribute is not present in the parent class 
//Add a new attribute for the Forward player
//    THe new attribute will be the num of goals scored
//    THe attribute will be instantiated in the subclass
    
        int numGoalsScored; // empty // 8
//                                                                                              8
    public Forward(String fName, String lName, String country, int age, String position, int numGoalsScored) {
        super(fName, lName, country, age, position);
//       We need to intitialise this to be usable 
        this.numGoalsScored = numGoalsScored; // 8
    }
    
//    Overlaod this method
    public Forward(String fName, String lName, String country, int age, String position){
        super(fName, lName, country, age, position);
        this.numGoalsScored = 0;
    }

    public int getNumGoalsScored() {
        return numGoalsScored;
    }

    public void setNumGoalsScored(int numGoalsScored) {
        this.numGoalsScored = numGoalsScored;
    }
    
    
//    Create a method to dynamically increment the number of goals scored
    public void goalScored(){
    
        this.numGoalsScored++; // goals +1
    }
    
    
    @Override
    public String toString(){
            return super.toString() + " Goals Scored: " + numGoalsScored;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
