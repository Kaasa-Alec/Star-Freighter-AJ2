/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.starfreighteraj.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author AlecSir
 */
public class ShipUpgrade implements Serializable{
    
    private String description;
    private double travelTime;
    private boolean blocked;
    private boolean upgradeAvailable;
    private String upgradeType;

    public ShipUpgrade() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public boolean isUpgradeAvailable() {
        return upgradeAvailable;
    }

    public void setUpgradeAvailable(boolean upgradeAvailable) {
        this.upgradeAvailable = upgradeAvailable;
    }

    public String getUpgradeType() {
        return upgradeType;
    }

    public void setUpgradeType(String upgradeType) {
        this.upgradeType = upgradeType;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
        hash = 71 * hash + (this.blocked ? 1 : 0);
        hash = 71 * hash + (this.upgradeAvailable ? 1 : 0);
        hash = 71 * hash + Objects.hashCode(this.upgradeType);
        return hash;
    }

    @Override
    public String toString() {
        return "ShipUpgrade{" + "description=" + description + ", travelTime=" + travelTime + ", blocked=" + blocked + ", upgradeAvailable=" + upgradeAvailable + ", upgradeType=" + upgradeType + '}';
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
        final ShipUpgrade other = (ShipUpgrade) obj;
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        if (this.blocked != other.blocked) {
            return false;
        }
        if (this.upgradeAvailable != other.upgradeAvailable) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.upgradeType, other.upgradeType)) {
            return false;
        }
        return true;
    }
    
    
    
}
