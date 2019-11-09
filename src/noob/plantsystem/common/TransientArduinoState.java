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

    @Override
    public void setTimeOfDay(long arg) {
        timeOfDay = arg;
    }

    
    @Override
    public void setCurrentWaterLevel(float arg) {
        currentWaterLevel = arg;
    }

    @Override
    public void setCurrentNutrientsLevel(float arg) {
        currentNutrientsLevel = arg;
    }

    @Override
    public void setLights(boolean arg) {
        lights = arg;
    }

    @Override
    public void setPowered(boolean arg) {
        powered = arg;
    }

    @Override
    public void setDoorsLocked(boolean arg) {
        doorsLocked = arg;
    }

    @Override
    public void setDoorsOpen(boolean arg) {
        doorsOpen = arg;
    }

    @Override
    public void setTimeLeftUnlocked(long arg) {
        timeLeftUnlocked = arg;
    }

    @Override
    public void setCurrentUpperChamberHumidity(float arg) {
        currentUpperChamberHumidity = arg;
    }

    @Override
    public void setCurrentUpperChamberTemperature(float arg) {
        currentUpperChamberTemperature = arg;
    }

    @Override
    public void setCurrentLowerChamberTemperature(float arg) {
        currentLowerChamberTemperature = arg;
    }

    @Override
    public void setDehumidifying(boolean arg) {
        dehumidifying = arg;
    }

    @Override
    public void setCooling(boolean arg) {
        cooling = arg;
    }

    @Override
    public void setInjectingCO2(boolean arg) {
        injectingCO2 = arg;
    }

    @Override
    public long getTimeOfDay() {
        return timeOfDay;
    }

    @Override
    public float getCurrentWaterLevel() {
        return currentWaterLevel;
    }

    @Override
    public float getCurrentNutrientsLevel() {
        return currentNutrientsLevel;
    }

    @Override
    public boolean getLights() {
        return lights;
    }

    @Override
    public boolean getPowered() {
        return powered;
    }

    @Override
    public boolean getLocked() {
        return doorsLocked;
    }

    @Override
    public boolean getDoorsOpen() {
        return doorsOpen;
    }

    @Override
    public long getTimeLeftUnlocked() {
        return timeLeftUnlocked;
    }

    @Override
    public float getCurrentUpperChamberHumidity() {
        return currentUpperChamberHumidity;
    }

    @Override
    public float getCurrentUpperChamberTemperature() {
        return currentUpperChamberTemperature;
    }

    @Override
    public float getCurrentLowerChamberTemperature() {
        return currentLowerChamberTemperature;
    }

    @Override
    public int getCurrentCO2PPM() {
        return currentCO2PPM;
    }
    
    @Override
    public void setCurrentCO2PPM(int arg) {
       currentCO2PPM = arg;
    }
    
    @Override
    public boolean getDehumidifying() {
        return dehumidifying;
    }

    @Override
    public boolean getCooling() {
        return cooling;
    }

    @Override
    public boolean getInjectingCO2() {
        return injectingCO2;
    }

    
  
    
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
    protected Integer currentCO2PPM;
    protected Boolean dehumidifying;
    protected Boolean cooling;
    protected Boolean injectingCO2;
}
