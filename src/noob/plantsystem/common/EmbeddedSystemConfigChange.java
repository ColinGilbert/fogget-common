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
public class EmbeddedSystemConfigChange {

    private PersistentArduinoState persistentState = new PersistentArduinoState();
    private boolean changingMistingInterval = false;
    private boolean changingMistingDuration = false;
    private boolean changingStatusPushInterval = false;
    private boolean changingNutrientsPPM = false;
    private boolean changingNutrientSolutionRatio = false;
    private boolean changingLightsOnHour = false;
    private boolean changingLightsOffHour = false;
    private boolean changingLightsOnMinute = false;
    private boolean changingLightsOffMinute = false;
    private boolean changingTargetUpperChamberHumidity = false;
    private boolean changingTargetUpperChamberTemperature = false;
    private boolean changingTargetLowerChamberTemperature = false;
    private boolean changingTargetCO2PPM = false;

    public void noChange() {
        setAll(false);
    }

    public void changeAll() {
        setAll(true);
    }

    protected void setAll(boolean arg) {
        changingMistingInterval 
                = changingMistingDuration
                = changingStatusPushInterval
                = changingNutrientsPPM
                = changingNutrientSolutionRatio
                = changingLightsOnHour
                = changingLightsOffHour
                = changingLightsOnMinute
                = changingLightsOffMinute
                = changingTargetUpperChamberHumidity
                = changingTargetUpperChamberTemperature
                = changingTargetLowerChamberTemperature
                = changingTargetCO2PPM = arg;
    }

    public boolean hasChanges() {
        return changingMistingInterval
                || changingMistingDuration
                || changingStatusPushInterval
                || changingNutrientsPPM
                || changingNutrientSolutionRatio
                || changingLightsOnHour
                || changingLightsOffHour
                || changingLightsOnMinute
                || changingLightsOffMinute
                || changingTargetUpperChamberHumidity
                || changingTargetUpperChamberTemperature
                || changingTargetLowerChamberTemperature
                || changingTargetCO2PPM;
    }
    
    /**
     * @return the persistentState
     */
    public PersistentArduinoState getPersistentState() {
        return persistentState;
    }

    /**
     * @param persistentState the persistentState to set
     */
    public void setPersistentState(PersistentArduinoState persistentState) {
        this.persistentState = persistentState;
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
     * @return the changingLightsOnHour
     */
    public boolean isChangingLightsOnHour() {
        return changingLightsOnHour;
    }

    /**
     * @return the changingLightsOffHour
     */
    public boolean isChangingLightsOffHour() {
        return changingLightsOffHour;
    }

    /**
     * @return the changingLightsOnMinute
     */
    public boolean isChangingLightsOnMinute() {
        return changingLightsOnMinute;
    }

    /**
     * @return the changingLightsOffMinute
     */
    public boolean isChangingLightsOffMinute() {
        return changingLightsOffMinute;
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
     * @param changingLightsOnHour the changingLightsOnHour to set
     */
    public void setChangingLightsOnHour(boolean changingLightsOnHour) {
        this.changingLightsOnHour = changingLightsOnHour;
    }

    /**
     * @param changingLightsOffHour the changingLightsOffHour to set
     */
    public void setChangingLightsOffHour(boolean changingLightsOffHour) {
        this.changingLightsOffHour = changingLightsOffHour;
    }

    /**
     * @param changingLightsOnMinute the changingLightsOnMinute to set
     */
    public void setChangingLightsOnMinute(boolean changingLightsOnMinute) {
        this.changingLightsOnMinute = changingLightsOnMinute;
    }

    /**
     * @param changingLightsOffMinute the changingLightsOffMinute to set
     */
    public void setChangingLightsOffMinute(boolean changingLightsOffMinute) {
        this.changingLightsOffMinute = changingLightsOffMinute;
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
