/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starfreighteraj.view;

import byui.cit260.starfreighteraj.control.GameControl;
import java.util.Scanner;
import star.freighter.aj.StarFreighterAJ;



/**
 *
 * @author JeffJones
 */
public class MainMenuView {
    private String menu;

    public MainMenuView() {
        this.menu = "\n"
                  + "\n-------------------------------------------"
                  + "\n| Main Menu                               |"
                  + "\n-------------------------------------------"
                  + "\nN - Start new game"
                  + "\nL - Load and start saved game"
                  + "\nG - Game menu"
                  + "\nH - Get help on how to play the game"
                  + "\nS - Save game"
                  + "\nQ - Quit game"
                  + "\nT - TEST - ShipNameView"
                  + "\n--------------------------------------------";
    }
    
    
    public void displayMainMenuView() {
        
        boolean done = false;
        do {
            
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
            
        }  while (!done);
        
    }

    private String getMenuOption() {
        
        Scanner keyboard = new Scanner(System.in);
        String value = ""; 
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: The value cannot be blank");
                continue;
            }
            
            break;
        }
        
        return value;
    }

    public boolean doAction(String menuOption) {
        
        menuOption = menuOption.toUpperCase();
        
        switch (menuOption) {
            case "N":
                this.startNewGame();
                break;
            case "L":
                this.startExistingGame();
                break;
            case "G":
                this.displayGameMenu();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
// There was no Q - "Quit game" set up in your MainMenuView so it was passing to the default, which is why
// it was returning to the HelpMenuView.  This also will allow the game to break from this menu.
            case "Q":
                break; //I dunno if this was the real problem, because there's 
                // the bit above in the displayMainMenu function, but maybe we should include it to be safe from now on.
            case "T": //TEMPORARY FOR TESTING
                this.displayShipNameView();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(StarFreighterAJ.getPlayer());
        
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");

    }
    
    private void displayGameMenu() {
        GameMenuView gameMenuView = new GameMenuView();
        
        gameMenuView.displayGameMenuView();
        
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        
        helpMenuView.displayHelpMenuView();
    }
    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    //TEMPORARY FOR TESTING
    private void displayShipNameView() {
        ShipNameView shipNameView = new ShipNameView();
        
        shipNameView.displayShipNameView();
    }

}
