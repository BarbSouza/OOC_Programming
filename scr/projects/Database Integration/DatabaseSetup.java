/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Barbara
 */
public class DatabaseSetup extends DB_Connection {
    //Once extended we can make use of the db information
    //and create some logic to process the db creation
    
    //Create a method to setup the connection
    public static boolean setupDB() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
         //Create an instance of the driver class
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
         
        //try to connect to the database
         try(
                 Connection conn = DriverManager.getConnection(DB_BASE_URL, USER, PASSWORD);
                 Statement stmt = conn.createStatement();
                 ){
             //This is the query (statement)
             //check if we have the db otherwise create it
             stmt.execute("CREATE DATABASE IF NOT EXISTS " + DB_NAME + ";");
             //Query the db using the USE
             stmt.execute("USE " + DB_NAME + ";"); //database (Schema) pointer
             //Create a query to insert into the db
             String sql = 
                     //CREATE TABLE IF NOT EXISTS patient_data cal1 (col type)
                     "CREATE TABLE IF NOT EXISTS " + TABLE + "( "
                     + "name VARCHAR(255),"
                     + "bithdate DATE,"
                     + "bloodType VARCHAR(3),"
                     + "id INT(10)"
                     + ")";
             
             //take this String query and execute it
             stmt.execute(sql);
             
              return true;       
         }catch(Exception e){
             e.printStackTrace();
             return false;
         }
        
    }
    
    //create some logic to ensure we do not run into issues with db connection
    
    
}

