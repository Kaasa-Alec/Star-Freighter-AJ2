/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starfreighteraj.view;

import java.util.Scanner;

/**
 *
 * @author AlecSir
 */
public class VendorMenuView {
    private String menu;

    public VendorMenuView() {
        this.menu = "\n************************************************"
                           + "\n*----------------------------------------------*"
                           + "\n*|Guy at the Counter                          |*"
                           + "\n*----------------------------------------------*"
                           + "\n*                                              *"
                           + "\n* 'Welcome to the vendor! Here you will find   *"
                           + "\n* all products necessary to keep your crew fed *"
                           + "\n* and sustained during interstellar space      *"
                           + "\n* travel. If you're looking for ship parts,    *"
                           + "\n* those would be at the Maintenance Hangar.    *"
                           + "\n* ...Oh, you're /that/ ship captain? Yeah, I   *"
                           + "\n* got a look at your freighter. It's a bit of  *"
                           + "\n* a wreck, isn't it? You'll definitely need    *"
                           + "\n* some new oxygen cells and plenty of food.    *"
                           + "\n* What can I get you?'                         *"
                           + "\n*                                              *"
                           + "\n************************************************"
                           + "\n                                                "
                           + "\n------------------------------------------------"
                           + "\n| Vendor                                       |"
                           + "\n------------------------------------------------"
                           + "\nO - Oxygen"
                           + "\nF - Food"
                           + "\nJ - Job Board"
                           + "\nL - Leave Vendor"
                           + "\n------------------------------------------------";
        
    }

    void displayVendorMenuView() {
        boolean done = false;
        do {
            
            String vendorMenuOption = this.getVendorMenuOption();
            if (vendorMenuOption.toUpperCase().equals("L"))
                return;
            
            done = this.doAction(vendorMenuOption);
            
        }  while (!done);
    }

    private String getVendorMenuOption() {
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

    private boolean doAction(String vendorMenuOption) {
        
        vendorMenuOption = vendorMenuOption.toUpperCase();
        
        switch (vendorMenuOption) {
            case "O":
                this.buyOxygen();
                break;
            case "F":
                this.buyFood();
                break;
            case "J":
                this.displayJobsBoard();
                break;
            case "L":
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    
    }

    private void buyOxygen() {
        System.out.println("*** buyOxygen function called ***");
    }

    private void buyFood() {
        System.out.println("*** buyFood function called ***");
    }

    private void displayJobsBoard() {
        JobBoardView jobBoardView = new JobBoardView();
        
        jobBoardView.displayJobBoardView();
    }
}
