/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starfreighteraj.view;

import java.util.Scanner;

/**
 *
 * @author JeffJones
 */
public class HelpMenuView {
    

private String helpMenu;

    public HelpMenuView() {
        this.helpMenu = "\n"
                  + "\n-------------------------------------------"
                  + "\n| Help Menu                               |"
                  + "\n-------------------------------------------"
                  + "\nG - Information about your goal"
                  + "\nM - How to get around"
                  + "\nH - Collecting resources"
                  + "\nD - Ship details"
                  + "\nR - Shop, upgrades and repairs"
                  + "\nQ - Quit"
                  + "\n--------------------------------------------";
    }
    
    
    public void displayHelpMenuView() {
        
        boolean done = false;
        do {
            
            String helpMenuOption = this.getHelpMenuOption();
            if (helpMenuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(helpMenuOption);
            
        }  while (!done);
        
    }

    private String getHelpMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = ""; 
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.helpMenu);
            
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

    public boolean doAction(String helpMenuOption) {
        
        helpMenuOption = helpMenuOption.toUpperCase();
        
        switch (helpMenuOption) {
            case "G":
                this.displayInfoScreen();
                break;
            case "M":
                this.displayMoveScreen();
                break;
            case "H":
                this.displayCollectScreen();
                break;
            case "D":
                this.displayDetailScreen();
                break;
            case "R":
                this.displayUpgradeScreen();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
        
        return false;
    }

    private void displayInfoScreen() {
        System.out.println("*** displayInfoScreen function called ***");
    }

    private void displayMoveScreen() {
        System.out.println("*** displayMoveScreen function called ***");
    }

    private void displayCollectScreen() {
        System.out.println("*** displayCollectScreen function called ***");
    }

    private void displayDetailScreen() {
        System.out.println("*** displayDetailScreen function called ***");
    }

    private void displayUpgradeScreen() {
        System.out.println("*** displayUpgradeScreen function called ***");
    }
}
