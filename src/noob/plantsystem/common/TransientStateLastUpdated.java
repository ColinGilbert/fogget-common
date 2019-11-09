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
public class TransientStateLastUpdated {


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
    public long getReservoirLevel() {
        return reservoirLevel;
    }

    /**
     * @param reservoirLevel the reservoirLevel to set
     */
    public void setReservoirLevel(long reservoirLevel) {
        this.reservoirLevel = reservoirLevel;
    }

    /**
     * @return the nutrientSolutionLevel
     */
    public long getNutrientSolutionLevel() {
        return nutrientSolutionLevel;
    }

    /**
     * @param nutrientSolutionLevel the nutrientSolutionLevel to set
     */
    public void setNutrientSolutionLevel(long nutrientSolutionLevel) {
        this.nutrientSolutionLevel = nutrientSolutionLevel;
    }

    /**
     * @return the lights
     */
    public long getLights() {
        return lights;
    }

    /**
     * @param lights the lights to set
     */
    public void setLights(long lights) {
        this.lights = lights;
    }

    /**
     * @return the powered
     */
    public long getPowered() {
        return powered;
    }

    /**
     * @param powered the powered to set
     */
    public void setPowered(long powered) {
        this.powered = powered;
    }

    /**
     * @return the locked
     */
    public long getLocked() {
        return locked;
    }

    /**
     * @param locked the locked to set
     */
    public void setLocked(long locked) {
        this.locked = locked;
    }

    /**
     * @return the doorsOpen
     */
    public long getDoorsOpen() {
        return doorsOpen;
    }

    /**
     * @param doorsOpen the doorsOpen to set
     */
    public void setDoorsOpen(long doorsOpen) {
        this.doorsOpen = doorsOpen;
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
    public long getUpperChamberHumidity() {
        return upperChamberHumidity;
    }

    /**
     * @param upperChamberHumidity the upperChamberHumidity to set
     */
    public void setUpperChamberHumidity(long upperChamberHumidity) {
        this.upperChamberHumidity = upperChamberHumidity;
    }

    /**
     * @return the upperChamberTemperature
     */
    public long getUpperChamberTemperature() {
        return upperChamberTemperature;
    }

    /**
     * @param upperChamberTemperature the upperChamberTemperature to set
     */
    public void setUpperChamberTemperature(long upperChamberTemperature) {
        this.upperChamberTemperature = upperChamberTemperature;
    }

    /**
     * @return the lowerChamberTemperature
     */
    public long getLowerChamberTemperature() {
        return lowerChamberTemperature;
    }

    /**
     * @param lowerChamberTemperature the lowerChamberTemperature to set
     */
    public void setLowerChamberTemperature(long lowerChamberTemperature) {
        this.lowerChamberTemperature = lowerChamberTemperature;
    }

    /**
     * @return the co2PPM
     */
    public long getCO2PPM() {
        return CO2PPM;
    }

    /**
     * @param co2PPM the co2PPM to set
     */
    public void setCO2PPM(long co2PPM) {
        this.CO2PPM = co2PPM;
    }

    /**
     * @return the dehumidifying
     */
    public long getDehumidifying() {
        return dehumidifying;
    }

    /**
     * @param dehumidifying the dehumidifying to set
     */
    public void setDehumidifying(long dehumidifying) {
        this.dehumidifying = dehumidifying;
    }

    /**
     * @return the cooling
     */
    public long getCooling() {
        return cooling;
    }

    /**
     * @param cooling the cooling to set
     */
    public void setCooling(long cooling) {
        this.cooling = cooling;
    }

    /**
     * @return the injectingCO2
     */
    public long getInjectingCO2() {
        return injectingCO2;
    }

    /**
     * @param injectingCO2 the injectingCO2 to set
     */
    public void setInjectingCO2(long injectingCO2) {
        this.injectingCO2 = injectingCO2;
    }
    
    protected long timeOfDay = -1;
    protected long reservoirLevel = -1;
    protected long nutrientSolutionLevel = -1;
    protected long lights = -1;
    protected long powered = -1;
    protected long locked = -1;
    protected long doorsOpen = -1;
    protected long timeLeftUnlocked = -1;
    protected long upperChamberHumidity = -1;
    protected long upperChamberTemperature = -1;
    protected long lowerChamberTemperature = -1;
    protected long CO2PPM = -1;
    protected long dehumidifying = -1;
    protected long cooling = -1;
    protected long injectingCO2 = -1;  
}
