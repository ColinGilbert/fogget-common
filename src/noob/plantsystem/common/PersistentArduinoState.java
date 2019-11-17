/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noob.plantsystem.common;

import java.io.Serializable;

/**
 *
 * @author noob
 */
public class PersistentArduinoState {
       
    private long uid;
    private int mistingInterval;
    private int mistingDuration;
    private int statusPushInterval;
    private int nutrientsPPM;
    private double nutrientSolutionRatio;
    private int lightsOnHour;
    private int lightsOffHour;
    private int lightsOnMinute;
    private int lightsOffMinute;
    private float targetUpperChamberHumidity;
    private float targetUpperChamberTemperature;
    private float targetLowerChamberTemperature;
    private int targetCO2PPM;

    /**
     * @return the uid
     */
    public long getUid() {
        return uid;
    }

    /**
     * @return the mistingInterval
     */
    public int getMistingInterval() {
        return mistingInterval;
    }

    /**
     * @return the mistingDuration
     */
    public int getMistingDuration() {
        return mistingDuration;
    }

    /**
     * @return the statusPushInterval
     */
    public int getStatusPushInterval() {
        return statusPushInterval;
    }

    /**
     * @return the nutrientsPPM
     */
    public int getNutrientsPPM() {
        return nutrientsPPM;
    }

    /**
     * @return the nutrientSolutionRatio
     */
    public double getNutrientSolutionRatio() {
        return nutrientSolutionRatio;
    }

    /**
     * @return the lightsOnHour
     */
    public int getLightsOnHour() {
        return lightsOnHour;
    }

    /**
     * @return the lightsOffHour
     */
    public int getLightsOffHour() {
        return lightsOffHour;
    }

    /**
     * @return the lightsOnMinute
     */
    public int getLightsOnMinute() {
        return lightsOnMinute;
    }

    /**
     * @return the lightsOffMinute
     */
    public int getLightsOffMinute() {
        return lightsOffMinute;
    }

    /**
     * @return the targetUpperChamberHumidity
     */
    public float getTargetUpperChamberHumidity() {
        return targetUpperChamberHumidity;
    }

    /**
     * @return the targetUpperChamberTemperature
     */
    public float getTargetUpperChamberTemperature() {
        return targetUpperChamberTemperature;
    }

    /**
     * @return the targetLowerChamberTemperature
     */
    public float getTargetLowerChamberTemperature() {
        return targetLowerChamberTemperature;
    }

    /**
     * @return the targetCO2PPM
     */
    public int getTargetCO2PPM() {
        return targetCO2PPM;
    }

    /**
     * @param uid the uid to set
     */
    public void setUid(long uid) {
        this.uid = uid;
    }

    /**
     * @param mistingInterval the mistingInterval to set
     */
    public void setMistingInterval(int mistingInterval) {
        this.mistingInterval = mistingInterval;
    }

    /**
     * @param mistingDuration the mistingDuration to set
     */
    public void setMistingDuration(int mistingDuration) {
        this.mistingDuration = mistingDuration;
    }

    /**
     * @param statusPushInterval the statusPushInterval to set
     */
    public void setStatusPushInterval(int statusPushInterval) {
        this.statusPushInterval = statusPushInterval;
    }

    /**
     * @param nutrientsPPM the nutrientsPPM to set
     */
    public void setNutrientsPPM(int nutrientsPPM) {
        this.nutrientsPPM = nutrientsPPM;
    }

    /**
     * @param nutrientSolutionRatio the nutrientSolutionRatio to set
     */
    public void setNutrientSolutionRatio(double nutrientSolutionRatio) {
        this.nutrientSolutionRatio = nutrientSolutionRatio;
    }

    /**
     * @param lightsOnHour the lightsOnHour to set
     */
    public void setLightsOnHour(int lightsOnHour) {
        this.lightsOnHour = lightsOnHour;
    }

    /**
     * @param lightsOffHour the lightsOffHour to set
     */
    public void setLightsOffHour(int lightsOffHour) {
        this.lightsOffHour = lightsOffHour;
    }

    /**
     * @param lightsOnMinute the lightsOnMinute to set
     */
    public void setLightsOnMinute(int lightsOnMinute) {
        this.lightsOnMinute = lightsOnMinute;
    }

    /**
     * @param lightsOffMinute the lightsOffMinute to set
     */
    public void setLightsOffMinute(int lightsOffMinute) {
        this.lightsOffMinute = lightsOffMinute;
    }

    /**
     * @param targetUpperChamberHumidity the targetUpperChamberHumidity to set
     */
    public void setTargetUpperChamberHumidity(float targetUpperChamberHumidity) {
        this.targetUpperChamberHumidity = targetUpperChamberHumidity;
    }

    /**
     * @param targetUpperChamberTemperature the targetUpperChamberTemperature to set
     */
    public void setTargetUpperChamberTemperature(float targetUpperChamberTemperature) {
        this.targetUpperChamberTemperature = targetUpperChamberTemperature;
    }

    /**
     * @param targetLowerChamberTemperature the targetLowerChamberTemperature to set
     */
    public void setTargetLowerChamberTemperature(float targetLowerChamberTemperature) {
        this.targetLowerChamberTemperature = targetLowerChamberTemperature;
    }

    /**
     * @param targetCO2PPM the targetCO2PPM to set
     */
    public void setTargetCO2PPM(int targetCO2PPM) {
        this.targetCO2PPM = targetCO2PPM;
    }
}
