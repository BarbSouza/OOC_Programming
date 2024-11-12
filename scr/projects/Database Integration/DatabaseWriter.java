/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db_connection;

/**
 *
 * @author Barbara
 */
public class DatabaseWriter {
    //This method will write information to the database
    
    public boolean addPatient(Patient patient) throws SQLException {
        //The patient instance == 
        try(
                 Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
                 Statement stmt = conn.createStatement();
                 ){
            
            //Instert data into table INSERT INTO TABLE cols VALUES
            String sql = String.format("INSERT INTO " + TABLE + "VALUES {"
            + "'%s', '%s', '%s', %d);",
                    patient.getName(),
                    patient.getBirthDate(),
                    patient.getBloodType(),
                    patient.getPatientID()
                    
            );
            stmt.execute(sql);
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
    }
    }
    
    
    
}
