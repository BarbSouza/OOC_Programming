/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Barbara
 */
public class DatabaseReader extends DB_Connection {
    // We will need to be able to read data back
    // from the database to the user
    // Since we have formatted the patient data
    // We can use a collection method to store and retrieve all the patient data
    // This method will handle retrieval and storage of patient data
    public ArrayList<Patient> getAllData(){
        // In order to retrieve the information we first must
        // Connect to the database
        // This method will act as "SELECT * FROM TABLE" SQL Command
        ArrayList<Patient> patients = new ArrayList<>();
        // Try to connect to the database and retrieve the information
        try(
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                Statement stmt = conn.createStatement();
                ){
            // In this block we will handle any requirements for pulling the data from the db
            // Handle any validations
            // Now that the connection is established
            // We begin creating the logic for reading the data from the db
            // There will be multiple records, we would like to iterate through all the records
            ResultSet results = stmt.executeQuery(String.format("SELECT * FROM %s;", TABLE));
            // Create a check for results and create a while loop to iterate through them
            while(results.next()){
                //Name, BirthDate, BloodType, ID
                String name = results.getString("name");
                String birthdate = results.getString("birtdate");
                String bloodtype = results.getString("bloodtype");
                int id = results.getInt("id");
                
                Patient patient = new Patient(name, birthdate, bloodtype, id);
                patients.add(patient);
            }
                
        }catch(Exception e){
            e.printStackTrace();
        }
        //the array data
        return patients;
    }
    
}
