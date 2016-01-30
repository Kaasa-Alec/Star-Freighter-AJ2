/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package star.freighter.aj;

import byui.cit260.starfreighteraj.model.Game;
import byui.cit260.starfreighteraj.model.Location;
import byui.cit260.starfreighteraj.model.Map;
import byui.cit260.starfreighteraj.model.Player;
import byui.cit260.starfreighteraj.model.PlayerCharacter;
import byui.cit260.starfreighteraj.model.StarShip;

/**
 *
 * @author JeffJones
 */
public class StarFreighterAJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game gameOne = new Game();
        Player playerOne = new Player();
        Map playerOneMap = new Map();
        PlayerCharacter mike = new PlayerCharacter();
        Location playerLocation = new Location();
        StarShip playerShip = new StarShip();
        
       
       gameOne.setTotalTime(60);
       gameOne.setNumberOfPlayers(1);
       playerOne.setName("Fred Flinstone");
       playerOne.setTotalMoneyEarned(700.00);
       playerOneMap.setRowCount(5);
       playerOneMap.setColumnCount(22);
       mike.setName("Captain Kirk");
       mike.setDescription("Captain of the Ship");
       mike.setCoordinates(6.66);
       mike.setStatistics(1000);
       playerLocation.setRow(5);
       playerLocation.setColumn(10);
       playerLocation.setExplored(true);
       playerLocation.setAmountRemaining(70);
       playerShip.setHull(200);
       playerShip.setSensors(25);
       playerShip.setCargoBays(4);
       playerShip.setWeaponTurrets(7);
       playerShip.setShields(300);
       playerShip.setMaxFuelCapacity(75);
       
       
       
       String gameInfo = gameOne.toString();
       System.out.println(gameInfo);
       String playerInfo = playerOne.toString();
       System.out.println(playerInfo); 
       String mapInfo = playerOneMap.toString();
       System.out.println(mapInfo);
       String playercharacterInfo = mike.toString();
       System.out.println(playercharacterInfo);
       String locationInfo = playerLocation.toString();
       System.out.println(locationInfo);
       String shipInfo = playerShip.toString();
       System.out.println(shipInfo);
       
    }
}

