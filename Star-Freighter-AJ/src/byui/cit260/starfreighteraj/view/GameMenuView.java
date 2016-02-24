/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starfreighteraj.view;

import byui.cit260.starfreighteraj.control.ShopControl;
import star.freighter.aj.StarFreighterAJ;

/**
 *
 * @author JeffJones
 */
public class GameMenuView {

    void displayMenu() {
        //This is temporary, so I could test the VendorMenuView while programming 
        //it. If you code the Game Menu, make sure to leave this in somewhere so the
        //vendor still works. You'd probably make a new function and copy/paste the
        //stuff below into it so it's just like this one.
        
        
        ShopControl.createNewShop(StarFreighterAJ.getPlayer());
        
        VendorMenuView vendorMenuView = new VendorMenuView();
        vendorMenuView.displayVendorMenuView();
    }
    
}