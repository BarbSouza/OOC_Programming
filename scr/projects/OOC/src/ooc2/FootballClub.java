/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooc2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lecturer
 */
public class FootballClub {
    
//    Create a menu options for the user
    public static int menu(){
    
        System.out.println("Welcome to OOC FC! Please choose from the following options: ");
        System.out.println("1. Initialie the program");
        
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
        
        return Integer.parseInt(option);
    }
    
//    Get the data for the players from the file
//    THe logic here is we want to capture the players from a database or file input 
//    Once we capture the data we have to implement a data stcructure 
        public static void dataInput() throws FileNotFoundException, IOException {
        
            BufferedReader br = new BufferedReader(new FileReader("FantasyFootballData2.csv"));
            
//            We take the player information from the file line by line 
                String line;
//            The data Structure is going be ArrayLists becasue we can change the size
                ArrayList<Forward> forwards = new ArrayList<>(); // Only Forward position players
                
//                A loop to go through the data 
//                And sign up the forward players
                while((line = br.readLine()) != null){
//                Store these players

                    String[] playerData = line.split(","); // name,age,position
                                                            //[0], [1], [2]
//                    System.out.println(playerData[0]);
                    
                    if(playerData[4].equals("Forward")){
//                    Pulled the player data name age position goals scored
                        Forward player = new Forward(playerData[0],playerData[1],playerData[2],Integer.parseInt(playerData[3]),playerData[4],0);
//                    Store it in the list
                        forwards.add(player);
                        
                        System.out.println(player.toString());
//                        System.out.println(playerData[0],playerData[1],playerData[2],Integer.parseInt(playerData[3]),playerData[4],0);
                    }
                }
                
                br.close();
        }
    
//    Main method will run the system 
    
    public static void main(String[] args) throws IOException{
    
//        Handle the logic for the system 
            int option = menu();
            if(option == 1){
                dataInput();
            }
    }
    
    
    
    
    
}
