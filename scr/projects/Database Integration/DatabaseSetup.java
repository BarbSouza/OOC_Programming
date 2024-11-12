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
import java.sql.SQLException;
public class DatabaseSetup extends DB_Connection {
    //Once extended we can make use of the db information
    //and create some logic to process the db creation
    
    //Create a method to setup the connection
    public static boolean setup() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
         //Create an instance of the driver class
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
         
        //try to connect to the database
         try(
                 Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                 Statement stmt = conn.createStatement();
                 ){
             //This is the query (statement)
             //check if we have the db otherwise create it
             stmt.execute("CRETE DATABASE IF NOT EXITS" + DB_NAME + ";");
         }
        
    }
    
    //create some logic to ensure we do not run into issues with db connection
    
    
}
