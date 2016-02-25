/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starfreighteraj.view;

import byui.cit260.starfreighteraj.control.ShopControl;
import java.util.Scanner;
import star.freighter.aj.StarFreighterAJ;

/**
 *
 * @author JeffJones
 */
public class GameMenuView {
    
    private String gameMenu;

    public GameMenuView() {
        this.gameMenu = "\n"
                  + "\n-------------------------------------------"
                  + "\n| Game Menu                               |"
                  + "\n-------------------------------------------"
                  + "\nI - Inventory"
                  + "\nL - Location chooser"
                  + "\nV - Vendor menu"
                  + "\nB - Back to Main Menu"
                  + "\n--------------------------------------------";
    }

    public void displayGameMenuView() {
        boolean done = false;
        do {
            
            String gameMenuOption = this.getGameMenuOption();
            if (gameMenuOption.toUpperCase().equals("B"))
                return;
            
            done = this.doAction(gameMenuOption);
            
        }  while (!done);
    }
        
        public String getGameMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = ""; 
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.gameMenu);
            
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
        
        public boolean doAction(String gameMenuOption) {
        
        gameMenuOption = gameMenuOption.toUpperCase();
        boolean valid = true;
        switch (gameMenuOption) {
            case "I":
                this.displayInventoryScreen();
                break;
            case "L":
                this.displayLocationChooser();
                break;
            case "V":
                this.displayVendorMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                valid = false; // HERE WAS THE PROBLEM, WATCH OUT IN FUTURE
                break;
        }
        
        return false;
    }
        
    private void displayInventoryScreen() {
        System.out.println("*** displayInventoryScreen function called ***");
    }
    
    private void displayLocationChooser() {
        System.out.println("*** displayLocationChooser function called ***");
    }

    private void displayVendorMenu() {
        VendorMenuView vendorMenuView = new VendorMenuView();
        vendorMenuView.displayVendorMenuView();
    }
  

  //ShopControl.createNewShop(StarFreighterAJ.getPlayer());  

}
