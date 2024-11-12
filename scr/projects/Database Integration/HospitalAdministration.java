/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_connection;

/**
 *
 * @author Barbara
 */
public class HospitalAdministration {
    
    //The main method will try to insert data into db
    //check connection status
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        
        //Using the db set up we can check if the operation went ok
        
        if(DatabaseSetup.setupDB()){
        //If after we run the setupDB method all is ok
        //we have now created a db schema and create a table
        
            System.out.println("Database has been successfully or already exists.");
        }else {
            //This means there is an issue either connecting to the db or creating it
            System.out.println("There was a problem creating or connecting to the databases. \nPlease check the db credentials");
            return;
        }

    }
    
}
