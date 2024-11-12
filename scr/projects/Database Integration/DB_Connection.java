/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package db_connection;

/**
 *
 * @author Barbara
 */
public class DB_Connection {

    //This is the database connection information
    //all of our db information used to perform
    //CRUD operations will rely on this connection
    
    protected final static String DB_BASE_URL = "jdbc:mysql://localhost";
    protected final static String USER = "root";
    protected final static String PASSWORD = "password";
    //This Schema name may or may not be create
    protected final static String DB_NAME = "hospital";
    protected final static String TABLE = "patient_data";
    
    //Now we create the final Database URL with the Schema
    protected final static DB_URL = DB_BASE_URL + "/" + DB_NAME;
}
