/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starfreighteraj.model;

import java.io.Serializable;

/**
 *
 * @author JeffJones
 */
public class Game implements Serializable  {
    
    //class instance variable
    private double totalTime;
    private double numberOfPlayers;

    public Game() {
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public double getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(double numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.numberOfPlayers) ^ (Double.doubleToLongBits(this.numberOfPlayers) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numberOfPlayers) != Double.doubleToLongBits(other.numberOfPlayers)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", numberOfPlayers=" + numberOfPlayers + '}';
    }
    
    
    
}
