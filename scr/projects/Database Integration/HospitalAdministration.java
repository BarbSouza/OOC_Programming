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
//Instantiating the writer and reader for the db
            DatabaseWriter dbw = new DatabaseWriter(); //This will allow us to write to the db
            DatabaseReader dbr = new DatabaseReader(); //This will allow us to read from the db
            Scanner scanner = new Scanner(System.in); //Capture the user input
            
            //We want to present this menu to the user
            //and we want the user to interact for as long as they please
            while(true){
                //Like all menus
                //We need a couple of print statements
                //to present to the user
                System.out.println("\nHospital Admin System (HAS)");
                System.out.println("Please Select from the Following Options\n");
                System.out.println("1. Insert a Patient Record");
                System.out.println("2. Read Patient from Database");
                System.out.println("3. EXIT");
                System.out.println("\nEnter your choice\n");
                
                //caputure the user choice
                int choice = scanner.nextInt();
                scanner.nextLine(); //add another line
                
                //take in the user choice
                //provide a functionality according to the user selection
                //There is going to be 3 options
                
                switch(choice){
                    //since we know its a number the cases are going to be numbers
                    case 1: //if the user input ==1
                        //Insert new data to the db
                        System.out.println("Enter Patient Data");
                        System.out.println("Name: ");
                        String name = scanner.nextline(); //name of the patient
                        System.out.println("Birth-Date: ");
                        String birthdate = scanner.nextLine();
                        System.out.println("Blood Type: ");
                        String bloodtype = scanner.nextLine();
                        
                       //collect all the user input
                        Patient newPatient = new Patient(name, birthdate, bloodtype);
                        
                        //Try adding the patient record
                        //Check if the process is successful
                        //otherwise let the user know
                        if(dbw.addPatient(newPatient)){
                            System.out.println("Patient added Successfully");
                            
                        }else {
                            System.out.println("Unable to add patient, please check all the fields");
                        }
                        break;
                    case 2: //read the data from db
                        ArrayList<Patient> patients =dbr.getAllData();
                        //retrieve the data from the db
                        //store it as the patients arraylist
                        //check if it's empty
                        if(patients.isEmpty()){
                            System.out.println("No Data was found");
                        }else{
                            System.out.printf("%-5s | %-20s | %-12s | %8s", "\nID", "Name", "Birth Date", "Blood Type");
                            System.out.println("\n-------------------------------------------");
                            //print out all the patient records into the table
                            //this will require iterating through the 
                            for(Patient patient: patients){
                                System.out.printf("%-5s | %-20s | %-12s | %8s\n",
                                        patient.getPatientID(),
                                        patient.getName(),
                                        patient.getBirthDate(),
                                        patient.getBloodType());
                            }
                        }
                            break;
                            
                            case 3: //Exit
                                System.out.println("Thank you for using our system");
                                System.out.println("System Exit...");
                                scanner.close(); //IO Stream and we dont want the user to be able to interact with the system when it's shutdown
                                return;
                                
                            default:
                                System.out.println("Wrong input please select from the choices");
                            
                        }

                    }
            
        }else {
            //This means there is an issue either connecting to the db or creating it
            System.out.println("There was a problem creating or connecting to the databases. \nPlease check the db credentials");
            return;
        }

    }
    
}
