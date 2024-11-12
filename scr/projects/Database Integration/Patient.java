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
    
}
