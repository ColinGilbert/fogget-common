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
    public void setReservoirLevel(float arg) {
        reservoirLevel = arg;
    }

    @Override
    public void setNutrientSolutionLevel(float arg) {
        nutrientSolutionLevel = arg;
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
    public void setUpperChamberHumidity(float arg) {
        upperChamberHumidity = arg;
    }

    @Override
    public void setUpperChamberTemperature(float arg) {
        upperChamberTemperature = arg;
    }

    @Override
    public void setLowerChamberTemperature(float arg) {
        lowerChamberTemperature = arg;
    }

    @Override
    public void setCO2PPM(int arg) {
        co2PPM = arg;
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
    public void setLastUpdated(TransientStateLastUpdated arg) {
        lastUpdated = arg;
    }
    @Override
    public long getTimeOfDay() {
        return timeOfDay;
    }

    @Override
    public float getReservoirLevel() {
        return reservoirLevel;
    }

    @Override
    public float getNutrientSolutionLevel() {
        return nutrientSolutionLevel;
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
    public float getUpperChamberHumidity() {
        return upperChamberHumidity;
    }

    @Override
    public float getUpperChamberTemperature() {
        return upperChamberTemperature;
    }

    @Override
    public float getLowerChamberTemperature() {
        return lowerChamberTemperature;
    }

    @Override
    public int getCO2PPM() {
        return co2PPM;
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
    
    @Override
    public TransientStateLastUpdated getLastUpdated() {
        return lastUpdated;
    }
    
    protected Long timeOfDay;
    protected Float reservoirLevel;
    protected Float nutrientSolutionLevel;
    protected Boolean lights;
    protected Boolean powered;
    protected Boolean doorsLocked;
    protected Boolean doorsOpen;
    protected Long timeLeftUnlocked;
    protected Float upperChamberHumidity;
    protected Float upperChamberTemperature;
    protected Float lowerChamberTemperature;
    protected Integer co2PPM;
    protected Boolean dehumidifying;
    protected Boolean cooling;
    protected Boolean injectingCO2;
    
    protected TransientStateLastUpdated lastUpdated = new TransientStateLastUpdated();
}
