/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noob.plantsystem.common;

/**
 *
 * @author noob
 */
public class TransientEmbeddedSystemStateMemento {
    private long timestamp;
    private long timeLeftUnlocked;
    private float reservoirLevel;
    private float nutrientSolutionLevel;
    private float currentUpperChamberHumidity;
    private float currentUpperChamberTemperature;
    private float currentLowerChamberTemperature;
    private int currentCO2PPM;
    private boolean lit;
    private boolean powered;
    private boolean misting;
    private boolean open;
    private boolean dehumidifying;
    private boolean cooling;
    private boolean injectingCO2;
    private boolean locked;

    /**
     * @return the timestamp
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return the timeLeftUnlocked
     */
    public long getTimeLeftUnlocked() {
        return timeLeftUnlocked;
    }

    /**
     * @param timeLeftUnlocked the timeLeftUnlocked to set
     */
    public void setTimeLeftUnlocked(long timeLeftUnlocked) {
        this.timeLeftUnlocked = timeLeftUnlocked;
    }

    /**
     * @return the reservoirLevel
     */
    public float getReservoirLevel() {
        return reservoirLevel;
    }

    /**
     * @param reservoirLevel the reservoirLevel to set
     */
    public void setReservoirLevel(float reservoirLevel) {
        this.reservoirLevel = reservoirLevel;
    }

    /**
     * @return the nutrientSolutionLevel
     */
    public float getNutrientSolutionLevel() {
        return nutrientSolutionLevel;
    }

    /**
     * @param nutrientSolutionLevel the nutrientSolutionLevel to set
     */
    public void setNutrientSolutionLevel(float nutrientSolutionLevel) {
        this.nutrientSolutionLevel = nutrientSolutionLevel;
    }

    /**
     * @return the currentUpperChamberHumidity
     */
    public float getCurrentUpperChamberHumidity() {
        return currentUpperChamberHumidity;
    }

    /**
     * @param currentUpperChamberHumidity the currentUpperChamberHumidity to set
     */
    public void setCurrentUpperChamberHumidity(float currentUpperChamberHumidity) {
        this.currentUpperChamberHumidity = currentUpperChamberHumidity;
    }

    /**
     * @return the currentUpperChamberTemperature
     */
    public float getCurrentUpperChamberTemperature() {
        return currentUpperChamberTemperature;
    }

    /**
     * @param currentUpperChamberTemperature the currentUpperChamberTemperature to set
     */
    public void setCurrentUpperChamberTemperature(float currentUpperChamberTemperature) {
        this.currentUpperChamberTemperature = currentUpperChamberTemperature;
    }

    /**
     * @return the currentLowerChamberTemperature
     */
    public float getCurrentLowerChamberTemperature() {
        return currentLowerChamberTemperature;
    }

    /**
     * @param currentLowerChamberTemperature the currentLowerChamberTemperature to set
     */
    public void setCurrentLowerChamberTemperature(float currentLowerChamberTemperature) {
        this.currentLowerChamberTemperature = currentLowerChamberTemperature;
    }

    /**
     * @return the currentCO2PPM
     */
    public int getCurrentCO2PPM() {
        return currentCO2PPM;
    }

    /**
     * @param currentCO2PPM the currentCO2PPM to set
     */
    public void setCurrentCO2PPM(int currentCO2PPM) {
        this.currentCO2PPM = currentCO2PPM;
    }

    /**
     * @return the lit
     */
    public boolean isLit() {
        return lit;
    }

    /**
     * @param lit the lit to set
     */
    public void setLit(boolean lit) {
        this.lit = lit;
    }

    /**
     * @return the powered
     */
    public boolean isPowered() {
        return powered;
    }

    /**
     * @param powered the powered to set
     */
    public void setPowered(boolean powered) {
        this.powered = powered;
    }

    /**
     * @return the misting
     */
    public boolean isMisting() {
        return misting;
    }

    /**
     * @param misting the misting to set
     */
    public void setMisting(boolean misting) {
        this.misting = misting;
    }

    /**
     * @return the open
     */
    public boolean isOpen() {
        return open;
    }

    /**
     * @param open the open to set
     */
    public void setOpen(boolean open) {
        this.open = open;
    }

    /**
     * @return the dehumidifying
     */
    public boolean isDehumidifying() {
        return dehumidifying;
    }

    /**
     * @param dehumidifying the dehumidifying to set
     */
    public void setDehumidifying(boolean dehumidifying) {
        this.dehumidifying = dehumidifying;
    }

    /**
     * @return the cooling
     */
    public boolean isCooling() {
        return cooling;
    }

    /**
     * @param cooling the cooling to set
     */
    public void setCooling(boolean cooling) {
        this.cooling = cooling;
    }

    /**
     * @return the injectingCO2
     */
    public boolean isInjectingCO2() {
        return injectingCO2;
    }

    /**
     * @param injectingCO2 the injectingCO2 to set
     */
    public void setInjectingCO2(boolean injectingCO2) {
        this.injectingCO2 = injectingCO2;
    }

    /**
     * @return the locked
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * @param locked the locked to set
     */
    public void setLocked(boolean locked) {
        this.locked = locked;
    }

}
