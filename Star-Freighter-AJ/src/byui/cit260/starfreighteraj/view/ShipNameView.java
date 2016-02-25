/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starfreighteraj.view;

import byui.cit260.starfreighteraj.control.GameControl;
import byui.cit260.starfreighteraj.model.ShipModel;
import java.util.Scanner;

/**
 *
 * @author AlecSir
 */
public class ShipNameView {
    private String promptMessage;
    private ShipModel ship;
    
    public ShipNameView() {
        this.promptMessage = "Please enter the name of your ship:";
        
        this.displayBanner();
        
    }

    private void displayBanner() {
        System.out.println(
                  "\n************************************************"
                + "\n*                                              *"
                + "\n* What an exciting day! It feels like you've   *"
                + "\n* been cramped up in that space station        *"
                + "\n* forever! Finally, the time has come to       *"
                + "\n* depart for Omacron Persei-8! But before you  *"
                + "\n* leave on your maiden voyage, don't you think *"
                + "\n* you should give the ship a name? At the very *"
                + "\n* least, it might help them identify your body *"
                + "\n* in case something goes wrong, so go ahead    *"
                + "\n* and give it a try! Grab that paintbrush and  *"
                + "\n* give the flagship of your future shipping    *"
                + "\n* fleet an awesome name!                       *"
                + "\n*                                              *"
                + "\n************************************************"
        );
    }
    
    public void displayShipNameView() {
        
        boolean done = false;
        do {
            String shipsName = this.getShipsName();
            if (shipsName.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(shipsName);
        } while (!done);
        
     }

    private String getShipsName() {
        Scanner keyboard = new Scanner(System.in);
        String value = ""; 
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
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

    private boolean doAction(String shipsName) {
        
        if (shipsName.length() < 2) {
            System.out.println("\nInvalid ship name:"
                    + "The name must be greater than one character in length");
        return false;
        }
        
        ShipModel ship = GameControl.createShip(shipsName);
        
        if (ship == null) {
            System.out.println("\nError creating the player.");
            return false;
        }
        
        if (shipsName.toUpperCase().equals("ENTERPRISE")) {
                this.displayNextViewEnterprise();
        }
        else
        this.displayNextView(ship);
    
        
        return true;
        
    }

    private void displayNextViewEnterprise() {
                
                System.out.println(
                         "\n************************************************"
                       + "\n*                                              *"
                       + "\n* 'Enterprise,' huh? How original. Did you     *"
                       + "\n* think of that all on your own? I bet you're  *" 
                       + "\n* feelin' reeeeaaaally proud of yourself,      *"
                       + "\n* aren't you?                                  *"
                       + "\n*                                              *"
                       + "\n* Alright, whatever. In any case, the ship's   *"
                       + "\n* all done, and now all that remains is to     *"
                       + "\n* have one last look around the place and make *"
                       + "\n* sure that we have everything we need. We     *"
                       + "\n* wouldn't want to run out of air or food in   *"
                       + "\n* space. And we certainly wouldn't want to be  *"
                       + "\n* caught off-guard if pirates show up. Take    *"
                       + "\n* another look before we shove off and let's   *"
                       + "\n* get under way, captain!                      *"
                       + "\n*                                              *"
                       + "\n************************************************"
                       );
        
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.displayMainMenuView();
    }

    private void displayNextView(ShipModel ship) {
        System.out.println(
                         "\n************************************************"
                       + "\n                                                "
                       + "\n Wow, '" + ship.getName() + "' is an awesome    "
                       + "\n name! People everywhere will empty their       "
                       + "\n wallets whenever they hear it! Now that        "
                       + "\n we are all done, all that remains is to        "
                       + "\n have one last look around the place and make   "
                       + "\n sure that we have everything we need. We       "
                       + "\n wouldn't want to run out of air or food in     "
                       + "\n space. And we certainly wouldn't want to be    "
                       + "\n caught off-guard if pirates show up. Take      "
                       + "\n another look before we shove off and let's get "
                       + "\n under way, captain!                            "
                       + "\n                                                "
                       + "\n************************************************"
                       );
        
        MainMenuView mainMenuView = new MainMenuView();
        
        mainMenuView.displayMainMenuView();
    }
}
