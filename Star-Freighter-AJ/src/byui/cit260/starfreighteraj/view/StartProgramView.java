package byui.cit260.starfreighteraj.view;

import byui.cit260.starfreighteraj.control.GameControl;
import byui.cit260.starfreighteraj.model.Player;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JeffJones
 */
public class StartProgramView {
    private String promptMessage;
    private Player Player;
    
    public StartProgramView() {
        this.promptMessage = "\nPlease enter your name:";
        
        this.displayBanner();
     
    }
    private void displayBanner() {
        System.out.println(
                  "\n************************************************"
                + "\n*                                              *"
                + "\n* This is the game of Star Freighter           *"
                + "\n* In this game you will build a star freighter *"
                + "\n* to travel through space to deliver the goods *"
                + "\n* entrusted to you by Space Amazon.com         *"
                + "\n*                                              *"
                + "\n* You and your crew will need to first plan    *"
                + "\n* for your trip determining and estimating     *"
                + "\n* the amount of resources needed for the trip. *"
                + "\n* Then you will have to go out and collect the *"
                + "\n* components for your ship and install them.   *"
                + "\n* Be careful and heed the advice of your first *"
                + "\n* officer.  If you have too much or too little *"
                + "\n* of any one resource...well...let's just say  *"
                + "\n* it won't end well for you.                   *"
                + "\n*                                              *"
                + "\n* Good luck and shop smart.                    *"
                + "\n*                                              *"
                + "\n************************************************"
        );
    }

    public void displayStartProgramView() {
        
        boolean done = false; //set flag to not done
        do {
            //prompt for and get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // user wants to quit
                return; //exit the game
            
            // do the requested action and display the next view
            done = this.doAction(playersName);
        } while (!done);
        
     }
    
    private String getPlayersName(){
        
        Scanner keyboard = new Scanner(System.in);
        String value = ""; 
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break;
        }
        
        return value;
    }

    private boolean doAction(String playersName) {
        
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name:"
                    + "The name must be greater than one character in length");
        return false;
        }
        
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) {
            System.out.println("\nError creating the player.");
            return false;
        }
        
        this.displayNextView(player);
    
        
        return true;
        
    }

        private void displayNextView(Player player) {
        System.out.println("\n==========================================="
                          + "\n Welcome to the game " + player.getName()
                          + "\n We hope you have a lot of fun!"
                          + "\n==========================================="
                          );
        
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.displayMainMenuView();
    }

}
            

               
    

