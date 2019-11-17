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
public class ArduinoConfigChangeRepresentation {

    private PersistentArduinoState persistentState = new PersistentArduinoState();

    private boolean changingMistingInterval = false;
    private boolean changingMistingDuration = false;
    private boolean changingStatusPushInterval = false;
    private boolean changingNutrientsPPM = false;
    private boolean changingNutrientSolutionRatio = false;
    private boolean changingLightsOnTime = false;
    private boolean changingLightsOffTime = false;
    private boolean changingTargetUpperChamberHumidity = false;
    private boolean changingTargetUpperChamberTemperature = false;
    private boolean changingTargetLowerChamberTemperature = false;
    private boolean changingTargetCO2PPM = false;


    public void noChange() {
        setChangingMistingInterval(false);
        setChangingMistingDuration(false);
        setChangingStatusPushInterval(false);
        setChangingNutrientsPPM(false);
        setChangingNutrientSolutionRatio(false);
        setChangingLightsOnTime(false);
        setChangingLightsOffTime(false);
        setChangingTargetUpperChamberHumidity(false);
        setChangingTargetUpperChamberTemperature(false);
        setChangingTargetLowerChamberTemperature(false);
        setChangingTargetCO2PPM(false);
    }

    public void changeAll() {
        setChangingMistingInterval(true);
        setChangingMistingDuration(true);
        setChangingStatusPushInterval(true);
        setChangingNutrientsPPM(true);
        setChangingNutrientSolutionRatio(true);
        setChangingLightsOnTime(true);
        setChangingLightsOffTime(true);
        setChangingTargetUpperChamberHumidity(true);
        setChangingTargetUpperChamberTemperature(true);
        setChangingTargetLowerChamberTemperature(true);
        setChangingTargetCO2PPM(true);
    }

    public boolean hasChanges() {
        return        isChangingMistingInterval() ||        //= true;
        isChangingMistingDuration() ||        //= true;
        isChangingStatusPushInterval() ||        // = true;
        isChangingNutrientsPPM() ||        //= true;
        isChangingNutrientSolutionRatio() ||        // = true;
        isChangingLightsOnTime() ||        //= true;
        isChangingLightsOffTime() ||
        isChangingTargetUpperChamberHumidity() ||
        isChangingTargetUpperChamberTemperature() ||
        isChangingTargetLowerChamberTemperature() || 
        isChangingTargetCO2PPM();
    }

    /**
     * @return the persistentState
     */
    public PersistentArduinoState getPersistentState() {
        return persistentState;
    }

    /**
     * @return the changingMistingInterval
     */
    public boolean isChangingMistingInterval() {
        return changingMistingInterval;
    }

    /**
     * @return the changingMistingDuration
     */
    public boolean isChangingMistingDuration() {
        return changingMistingDuration;
    }

    /**
     * @return the changingStatusPushInterval
     */
    public boolean isChangingStatusPushInterval() {
        return changingStatusPushInterval;
    }

    /**
     * @return the changingNutrientsPPM
     */
    public boolean isChangingNutrientsPPM() {
        return changingNutrientsPPM;
    }

    /**
     * @return the changingNutrientSolutionRatio
     */
    public boolean isChangingNutrientSolutionRatio() {
        return changingNutrientSolutionRatio;
    }

    /**
     * @return the changingLightsOnTime
     */
    public boolean isChangingLightsOnTime() {
        return changingLightsOnTime;
    }

    /**
     * @return the changingLightsOffTime
     */
    public boolean isChangingLightsOffTime() {
        return changingLightsOffTime;
    }

    /**
     * @return the changingTargetUpperChamberHumidity
     */
    public boolean isChangingTargetUpperChamberHumidity() {
        return changingTargetUpperChamberHumidity;
    }

    /**
     * @return the changingTargetUpperChamberTemperature
     */
    public boolean isChangingTargetUpperChamberTemperature() {
        return changingTargetUpperChamberTemperature;
    }

    /**
     * @return the changingTargetLowerChamberTemperature
     */
    public boolean isChangingTargetLowerChamberTemperature() {
        return changingTargetLowerChamberTemperature;
    }

    /**
     * @return the changingTargetCO2PPM
     */
    public boolean isChangingTargetCO2PPM() {
        return changingTargetCO2PPM;
    }

    /**
     * @param persistentState the persistentState to set
     */
    public void setPersistentState(PersistentArduinoState persistentState) {
        this.persistentState = persistentState;
    }

    /**
     * @param changingMistingInterval the changingMistingInterval to set
     */
    public void setChangingMistingInterval(boolean changingMistingInterval) {
        this.changingMistingInterval = changingMistingInterval;
    }

    /**
     * @param changingMistingDuration the changingMistingDuration to set
     */
    public void setChangingMistingDuration(boolean changingMistingDuration) {
        this.changingMistingDuration = changingMistingDuration;
    }

    /**
     * @param changingStatusPushInterval the changingStatusPushInterval to set
     */
    public void setChangingStatusPushInterval(boolean changingStatusPushInterval) {
        this.changingStatusPushInterval = changingStatusPushInterval;
    }

    /**
     * @param changingNutrientsPPM the changingNutrientsPPM to set
     */
    public void setChangingNutrientsPPM(boolean changingNutrientsPPM) {
        this.changingNutrientsPPM = changingNutrientsPPM;
    }

    /**
     * @param changingNutrientSolutionRatio the changingNutrientSolutionRatio to set
     */
    public void setChangingNutrientSolutionRatio(boolean changingNutrientSolutionRatio) {
        this.changingNutrientSolutionRatio = changingNutrientSolutionRatio;
    }

    /**
     * @param changingLightsOnTime the changingLightsOnTime to set
     */
    public void setChangingLightsOnTime(boolean changingLightsOnTime) {
        this.changingLightsOnTime = changingLightsOnTime;
    }

    /**
     * @param changingLightsOffTime the changingLightsOffTime to set
     */
    public void setChangingLightsOffTime(boolean changingLightsOffTime) {
        this.changingLightsOffTime = changingLightsOffTime;
    }

    /**
     * @param changingTargetUpperChamberHumidity the changingTargetUpperChamberHumidity to set
     */
    public void setChangingTargetUpperChamberHumidity(boolean changingTargetUpperChamberHumidity) {
        this.changingTargetUpperChamberHumidity = changingTargetUpperChamberHumidity;
    }

    /**
     * @param changingTargetUpperChamberTemperature the changingTargetUpperChamberTemperature to set
     */
    public void setChangingTargetUpperChamberTemperature(boolean changingTargetUpperChamberTemperature) {
        this.changingTargetUpperChamberTemperature = changingTargetUpperChamberTemperature;
    }

    /**
     * @param changingTargetLowerChamberTemperature the changingTargetLowerChamberTemperature to set
     */
    public void setChangingTargetLowerChamberTemperature(boolean changingTargetLowerChamberTemperature) {
        this.changingTargetLowerChamberTemperature = changingTargetLowerChamberTemperature;
    }

    /**
     * @param changingTargetCO2PPM the changingTargetCO2PPM to set
     */
    public void setChangingTargetCO2PPM(boolean changingTargetCO2PPM) {
        this.changingTargetCO2PPM = changingTargetCO2PPM;
    }

}
