/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starfreighteraj.view;

/**
 *
 * @author AlecSir
 */
public class VendorMenuView {
    
    private String menu;

    public VendorMenuView() {
        this.menu = "\n"
                  + "\n-------------------------------------------"
                  + "\n| Main Menu                               |"
                  + "\n-------------------------------------------"
                  + "\nN - Start new game"
                  + "\nL - Load and start saved game"
                  + "\nH - Get help on how to play the game"
                  + "\nS - Save game"
                  + "\nQ - Quit game"
                  + "\n--------------------------------------------";
    }
}
