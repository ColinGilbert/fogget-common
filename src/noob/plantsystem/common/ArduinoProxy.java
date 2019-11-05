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
public class ArduinoProxy implements SerializedArduinoStateInterface {
    
    public String getIP() {
        return serialized.getIP();
    }
    
    public void setIP(String arg) {
       serialized.setIP(arg);
    }
    
    public long getUID() {
        return serialized.getUID();
    }
    public void setUID(long arg) {
        serialized.setUID(arg);
    }    
    
    public int getMistingInterval() {
        return serialized.getMistingInterval();
    }
    public void setMistingInterval(int arg) {
        serialized.setMistingInterval(arg);
    }
    
    public int getStatusUpdatePushInterval() {
        return serialized.getStatusUpdatePushInterval();
    }
    
    public void setStatusUpdatePushInterval(int arg) {
        serialized.setStatusUpdatePushInterval(arg);
    }
    
    public float getMinWaterLevel() {
        return serialized.getMinWaterLevel();
    }
    
    public void setMinWaterLevel(float arg) {
        serialized.setMinWaterLevel(arg);
    }
    
    public float getMaxWaterLevel() {
        return serialized.getMaxWaterLevel();
    }
    
    public void setMaxWaterLevel(float arg) {
        serialized.setMaxWaterLevel(arg);
    }
    
    public float getMinNutrientSolutionLevel() {
        return serialized.getMinNutrientSolutionLevel();
    }
    
    public void setMinNutrientSolutionLevel(float arg) {
        serialized.setMinNutrientSolutionLevel(arg);
    }
    
    public float getMaxNutrientSolutionLevel() {
        return serialized.getMaxNutrientSolutionLevel();
    }
    
    public void setMaxNutrientSolutionLevel(float arg) {
        serialized.setMaxNutrientSolutionLevel(arg);
    }
    
    public int getNutrientsPPM() {
        return serialized.getNutrientsPPM();
    }
    
    public void setNutrientsPPM(int arg) {
        serialized.setNutrientsPPM(arg);
    }

    public double getNutrientSolutionRatio() {
        return serialized.getNutrientSolutionRatio();
    }
    
    public void setNutrientSolutionRatio(double arg) {
        serialized.setNutrientSolutionRatio(arg);
    }    
   
    public long getLightsOnTime() {
        return serialized.getLightsOnTime();
    }
    
    public void setLightsOnTime(long arg) {
        serialized.setLightsOnTime(arg);
    }
    
    public long getLightsOffTime() {
        return serialized.getLightsOffTime();
    }
    public void setLightsOffTime(long arg) {
        serialized.setLightsOffTime(arg);
    }
     
    public float getTargetUpperChamberHumidity() {
        return serialized.getTargetUpperChamberHumidity();
    }
    
    public void setTargetUpperChamberHumidity(float arg) {
        serialized.setTargetUpperChamberHumidity(arg);
    }
    
    public float getTargetUpperChamberTemperature() {
        return serialized.getTargetUpperChamberTemperature();
    }
    
    public void setTargetUpperChamberTemperature(float arg) {
        serialized.setTargetUpperChamberTemperature(arg);
    }
    
    public float getTargetLowerChamberTemperature() {
        return serialized.getTargetLowerChamberTemperature();
    }
    
    public void setTargetLowerChamberTemperature(float arg) {
        serialized.setTargetLowerChamberTemperature(arg);
    }
   
    public SerializedArduinoState getSerializedState() {
        return serialized;
    }
    
    public void setSerializedState(SerializedArduinoState arg) {
        serialized = arg;
    }
    
    protected SerializedArduinoState serialized;
    
    protected Long timeOfDay;
    protected Float currentWaterLevel;
    protected Float currentNutrientsLevel;
    protected Boolean lights;
    protected Boolean powered;
    protected Boolean doorsLocked;
    protected Boolean doorsOpen;
    protected Long timeLeftUnlocked;
    protected Float currentUpperChamberHumidity;
    protected Float currentUpperChamberTemperature;
    protected Float currentLowerChamberTemperature;
    protected Boolean dehumidifying;
    protected Boolean cooling;
    protected Boolean co2;
}