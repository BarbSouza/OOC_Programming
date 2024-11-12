/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_connection;

/**
 *
 * @author Barbara
 */
public class Patient {
    //This patient information will utilised by the system to add
    //patient data from the hosputal database
    
    //Attributes
    private String name;
    private String birthDate;
    private String bloodType;
    private int patientID;
    
    //static attributes are a class variable
    //it will be shared by all the objects within the class
    //currentId this will be used to generate new ID values to patient
    //and check the currentIDs
    
    private static int currentID = 1;
    //Create 2 constructors
    //one constructor will be the patient data
    public Patient(String name, String birthDate, String bloodType){
    this.name = name;
    this.birthDate = birthDate;
    this.patientID = currentID; //static value 1
    currentID++; //Value 2
    
        System.out.println(name + " has a birthday on " + birthDate);
    }
    
    //the other is when adding the patient to the db
    //Constructor 2
    public Patient(String name, String birthDate, String bloodType, int patientID){
    this.name = name;
    this.birthDate = birthDate;
    this.patientID = patientID;
    
    if (currentID <= patientID ){ //current ID = 2
        currentID = patientID + 1; //This will increment the current ID
        
        
    }
}
