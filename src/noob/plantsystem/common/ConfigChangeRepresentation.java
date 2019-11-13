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
public class ConfigChangeRepresentation implements PersistentArduinoStateSetterInterface, PersistentArduinoStateGetterInterface {
    
    private long uid;
    private int mistingInterval;
    private int mistingDuration;
    private int statusUpdatePushInterval;
    private int nutrientsPPM;
    private double nutrientSolutionRatio;
    private long lightsOnTime;
    private long lightsOffTime;
    private float targetUpperChamberHumidity;
    private float targetUpperChamberTemperature;
    private float targetLowerChamberTemperature;
    private int targetCO2PPM;

    private boolean changingMistingInterval = false;
    private boolean changingMistingDuration = false;
    private boolean changingStatusUpdatePushInterval = false;
    private boolean changingNutrientsPPM = false;
    private boolean changingNutrientSolutionRatio = false;
    private boolean changingLightsOnTime = false;
    private boolean changingLightsOffTime = false;
    private boolean changingTargetUpperChamberHumidity = false;
    private boolean changingTargetLowerChamberHumidity = false;
    private boolean changingTargetLowerChamberTemperature = false;
    private boolean changingTargetCO2PPM = false;

    /**
     * @return the uid
     */
    public long getUid() {
        return uid;
    }

    /**
     * @param uid the uid to set
     */
    public void setUid(long uid) {
        this.uid = uid;
    }

    /**
     * @return the mistingInterval
     */
    public int getMistingInterval() {
        return mistingInterval;
    }

    /**
     * @param mistingInterval the mistingInterval to set
     */
    public void setMistingInterval(int mistingInterval) {
        this.mistingInterval = mistingInterval;
    }

    /**
     * @return the mistingDuration
     */
    public int getMistingDuration() {
        return mistingDuration;
    }

    /**
     * @param mistingDuration the mistingDuration to set
     */
    public void setMistingDuration(int mistingDuration) {
        this.mistingDuration = mistingDuration;
    }

    /**
     * @return the statusUpdatePushInterval
     */
    public int getStatusUpdatePushInterval() {
        return statusUpdatePushInterval;
    }

    /**
     * @param statusUpdatePushInterval the statusUpdatePushInterval to set
     */
    public void setStatusUpdatePushInterval(int statusUpdatePushInterval) {
        this.statusUpdatePushInterval = statusUpdatePushInterval;
    }

    /**
     * @return the nutrientsPPM
     */
    public int getNutrientsPPM() {
        return nutrientsPPM;
    }

    /**
     * @param nutrientsPPM the nutrientsPPM to set
     */
    public void setNutrientsPPM(int nutrientsPPM) {
        this.nutrientsPPM = nutrientsPPM;
    }

    /**
     * @return the nutrientSolutionRatio
     */
    public double getNutrientSolutionRatio() {
        return nutrientSolutionRatio;
    }

    /**
     * @param nutrientSolutionRatio the nutrientSolutionRatio to set
     */
    public void setNutrientSolutionRatio(double nutrientSolutionRatio) {
        this.nutrientSolutionRatio = nutrientSolutionRatio;
    }

    /**
     * @return the lightsOnTime
     */
    public long getLightsOnTime() {
        return lightsOnTime;
    }

    /**
     * @param lightsOnTime the lightsOnTime to set
     */
    public void setLightsOnTime(long lightsOnTime) {
        this.lightsOnTime = lightsOnTime;
    }

    /**
     * @return the lightsOffTime
     */
    public long getLightsOffTime() {
        return lightsOffTime;
    }

    /**
     * @param lightsOffTime the lightsOffTime to set
     */
    public void setLightsOffTime(long lightsOffTime) {
        this.lightsOffTime = lightsOffTime;
    }

    /**
     * @return the targetUpperChamberHumidity
     */
    public float getTargetUpperChamberHumidity() {
        return targetUpperChamberHumidity;
    }

    /**
     * @param targetUpperChamberHumidity the targetUpperChamberHumidity to set
     */
    public void setTargetUpperChamberHumidity(float targetUpperChamberHumidity) {
        this.targetUpperChamberHumidity = targetUpperChamberHumidity;
    }

    /**
     * @return the targetUpperChamberTemperature
     */
    public float getTargetUpperChamberTemperature() {
        return targetUpperChamberTemperature;
    }

    /**
     * @param targetUpperChamberTemperature the targetUpperChamberTemperature to set
     */
    public void setTargetUpperChamberTemperature(float targetUpperChamberTemperature) {
        this.targetUpperChamberTemperature = targetUpperChamberTemperature;
    }

    /**
     * @return the targetLowerChamberTemperature
     */
    public float getTargetLowerChamberTemperature() {
        return targetLowerChamberTemperature;
    }

    /**
     * @param targetLowerChamberTemperature the targetLowerChamberTemperature to set
     */
    public void setTargetLowerChamberTemperature(float targetLowerChamberTemperature) {
        this.targetLowerChamberTemperature = targetLowerChamberTemperature;
    }

    /**
     * @return the targetCO2PPM
     */
    public int getTargetCO2PPM() {
        return targetCO2PPM;
    }

    /**
     * @param targetCO2PPM the targetCO2PPM to set
     */
    public void setTargetCO2PPM(int targetCO2PPM) {
        this.targetCO2PPM = targetCO2PPM;
    }

    /**
     * @return the changingMistingInterval
     */
    public boolean isChangingMistingInterval() {
        return changingMistingInterval;
    }

    /**
     * @param changingMistingInterval the changingMistingInterval to set
     */
    public void setChangingMistingInterval(boolean changingMistingInterval) {
        this.changingMistingInterval = changingMistingInterval;
    }

    /**
     * @return the changingMistingDuration
     */
    public boolean isChangingMistingDuration() {
        return changingMistingDuration;
    }

    /**
     * @param changingMistingDuration the changingMistingDuration to set
     */
    public void setChangingMistingDuration(boolean changingMistingDuration) {
        this.changingMistingDuration = changingMistingDuration;
    }

    /**
     * @return the changingStatusUpdatePushInterval
     */
    public boolean isChangingStatusUpdatePushInterval() {
        return changingStatusUpdatePushInterval;
    }

    /**
     * @param changingStatusUpdatePushInterval the changingStatusUpdatePushInterval to set
     */
    public void setChangingStatusUpdatePushInterval(boolean changingStatusUpdatePushInterval) {
        this.changingStatusUpdatePushInterval = changingStatusUpdatePushInterval;
    }

    /**
     * @return the changingNutrientsPPM
     */
    public boolean isChangingNutrientsPPM() {
        return changingNutrientsPPM;
    }

    /**
     * @param changingNutrientsPPM the changingNutrientsPPM to set
     */
    public void setChangingNutrientsPPM(boolean changingNutrientsPPM) {
        this.changingNutrientsPPM = changingNutrientsPPM;
    }

    /**
     * @return the changingNutrientSolutionRatio
     */
    public boolean isChangingNutrientSolutionRatio() {
        return changingNutrientSolutionRatio;
    }

    /**
     * @param changingNutrientSolutionRatio the changingNutrientSolutionRatio to set
     */
    public void setChangingNutrientSolutionRatio(boolean changingNutrientSolutionRatio) {
        this.changingNutrientSolutionRatio = changingNutrientSolutionRatio;
    }

    /**
     * @return the changingLightsOnTime
     */
    public boolean isChangingLightsOnTime() {
        return changingLightsOnTime;
    }

    /**
     * @param changingLightsOnTime the changingLightsOnTime to set
     */
    public void setChangingLightsOnTime(boolean changingLightsOnTime) {
        this.changingLightsOnTime = changingLightsOnTime;
    }

    /**
     * @return the changingLightsOffTime
     */
    public boolean isChangingLightsOffTime() {
        return changingLightsOffTime;
    }

    /**
     * @param changingLightsOffTime the changingLightsOffTime to set
     */
    public void setChangingLightsOffTime(boolean changingLightsOffTime) {
        this.changingLightsOffTime = changingLightsOffTime;
    }

    /**
     * @return the changingTargetUpperChamberHumidity
     */
    public boolean isChangingTargetUpperChamberHumidity() {
        return changingTargetUpperChamberHumidity;
    }

    /**
     * @param changingTargetUpperChamberHumidity the changingTargetUpperChamberHumidity to set
     */
    public void setChangingTargetUpperChamberHumidity(boolean changingTargetUpperChamberHumidity) {
        this.changingTargetUpperChamberHumidity = changingTargetUpperChamberHumidity;
    }

    /**
     * @return the changingTargetLowerChamberHumidity
     */
    public boolean isChangingTargetLowerChamberHumidity() {
        return changingTargetLowerChamberHumidity;
    }

    /**
     * @param changingTargetLowerChamberHumidity the changingTargetLowerChamberHumidity to set
     */
    public void setChangingTargetLowerChamberHumidity(boolean changingTargetLowerChamberHumidity) {
        this.changingTargetLowerChamberHumidity = changingTargetLowerChamberHumidity;
    }

    /**
     * @return the changingTargetLowerChamberTemperature
     */
    public boolean isChangingTargetLowerChamberTemperature() {
        return changingTargetLowerChamberTemperature;
    }

    /**
     * @param changingTargetLowerChamberTemperature the changingTargetLowerChamberTemperature to set
     */
    public void setChangingTargetLowerChamberTemperature(boolean changingTargetLowerChamberTemperature) {
        this.changingTargetLowerChamberTemperature = changingTargetLowerChamberTemperature;
    }

    /**
     * @return the changingTargetCO2PPM
     */
    public boolean isChangingTargetCO2PPM() {
        return changingTargetCO2PPM;
    }

    /**
     * @param changingTargetCO2PPM the changingTargetCO2PPM to set
     */
    public void setChangingTargetCO2PPM(boolean changingTargetCO2PPM) {
        this.changingTargetCO2PPM = changingTargetCO2PPM;
    }
}
