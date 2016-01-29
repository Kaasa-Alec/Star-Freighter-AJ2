/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package star.freighter.aj;

import byui.cit260.starfreighteraj.model.Player;

/**
 *
 * @author JeffJones
 */
public class StarFreighterAJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Player playerOne = new Player();
       
       playerOne.setName("Fred Flinstone");
       playerOne.setTotalMoneyEarned(700.00);
       
       String playerInfo = playerOne.toString();
       System.out.println(playerInfo);      
    }
}

