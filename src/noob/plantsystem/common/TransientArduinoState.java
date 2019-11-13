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
public class TransientArduinoState implements TransientArduinoStateSetterInterface, TransientArduinoStateGetterInterface {
    private long timeOfDay;
    private float reservoirLevel;
    private float nutrientSolutionLevel;
    private boolean lit;
    private boolean powered;
    private boolean open;
    private long timeLeftUnlocked;
    private float upperChamberHumidity;
    private float upperChamberTemperature;
    private float lowerChamberTemperature;
    private int currentCO2PPM;
    private boolean dehumidifying;
    private boolean cooling;
    private boolean injectingCO2;
    private boolean locked;

    /**
     * @return the timeOfDay
     */
    public long getTimeOfDay() {
        return timeOfDay;
    }

    /**
     * @param timeOfDay the timeOfDay to set
     */
    public void setTimeOfDay(long timeOfDay) {
        this.timeOfDay = timeOfDay;
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
     * @return the upperChamberHumidity
     */
    public float getUpperChamberHumidity() {
        return upperChamberHumidity;
    }

    /**
     * @param upperChamberHumidity the upperChamberHumidity to set
     */
    public void setUpperChamberHumidity(float upperChamberHumidity) {
        this.upperChamberHumidity = upperChamberHumidity;
    }

    /**
     * @return the upperChamberTemperature
     */
    public float getUpperChamberTemperature() {
        return upperChamberTemperature;
    }

    /**
     * @param upperChamberTemperature the upperChamberTemperature to set
     */
    public void setUpperChamberTemperature(float upperChamberTemperature) {
        this.upperChamberTemperature = upperChamberTemperature;
    }

    /**
     * @return the lowerChamberTemperature
     */
    public float getLowerChamberTemperature() {
        return lowerChamberTemperature;
    }

    /**
     * @param lowerChamberTemperature the lowerChamberTemperature to set
     */
    public void setLowerChamberTemperature(float lowerChamberTemperature) {
        this.lowerChamberTemperature = lowerChamberTemperature;
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
