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
public class PersistentArduinoState implements PersistentArduinoStateInterface, Serializable {
    
    @Override
    public long getUID() {
        return uid;
    }

    @Override
    public void setUID(long arg) {
        uid = arg;
    }

    @Override
    public int getMistingInterval() {
        return mistingInterval;
    }

    @Override
    public void setMistingInterval(int arg) {
        mistingInterval = arg;
    }

    @Override
    public int getMistingDuration() {
        return mistingDuration;
    }
    
    @Override
    public void setMistingDuration(int arg) {
        mistingDuration = arg;
    }
    
    @Override
    public int getStatusUpdatePushInterval() {
        return statusUpdatePushInterval;
    }

    @Override
    public void setStatusUpdatePushInterval(int arg) {
        statusUpdatePushInterval = arg;
    }

    @Override
    public double getNutrientSolutionRatio() {
        return nutrientSolutionRatio;
    }

    @Override
    public void setNutrientSolutionRatio(double arg) {
        nutrientSolutionRatio = arg;
    }

    @Override
    public long getLightsOnTime() {
        return lightsOnTime;
    }

    @Override
    public void setLightsOnTime(long arg) {
        lightsOnTime = arg;
    }

    @Override
    public long getLightsOffTime() {
        return lightsOffTime;
    }

    @Override
    public void setLightsOffTime(long arg) {
        lightsOffTime = arg;
    }

    @Override
    public float getTargetUpperChamberHumidity() {
        return lightsOffTime;
    }

    @Override
    public void setTargetUpperChamberHumidity(float arg) {
        targetUpperChamberHumidity = arg;
    }

    @Override
    public float getTargetUpperChamberTemperature() {
        return targetUpperChamberTemperature;
    }

    @Override
    public void setTargetUpperChamberTemperature(float arg) {
        targetUpperChamberTemperature = arg;
    }

    @Override
    public float getTargetLowerChamberTemperature() {
        return targetLowerChamberTemperature;
    }

    @Override
    public void setTargetLowerChamberTemperature(float arg) {
        targetLowerChamberTemperature = arg;
    }

    @Override
    public int getTargetCO2PPM() {
        return targetCO2PPM;
    }
    
    @Override
    public void setTargetCO2PPM(int arg) {
        targetCO2PPM = arg;
    }
    
    protected Long uid;
    protected Integer mistingInterval;
    protected Integer mistingDuration;
    protected Integer statusUpdatePushInterval;
    protected Float minWaterLevel;
    protected Float maxWaterLevel;
    protected Float minNutrientSolutionLevel;
    protected Float maxNutrientSolutionLevel;
    protected Integer nutrientsPPM;
    protected Double nutrientSolutionRatio;
    protected Long lightsOnTime;
    protected Long lightsOffTime;
    protected Float targetUpperChamberHumidity;
    protected Float targetUpperChamberTemperature;
    protected Float targetLowerChamberTemperature;
    protected Integer targetCO2PPM;

}
