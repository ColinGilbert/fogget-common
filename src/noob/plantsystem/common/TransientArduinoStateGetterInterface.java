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
public interface TransientArduinoStateGetterInterface {

    public long getTimeOfDay();

    public float getCurrentWaterLevel();
    
    public float getCurrentNutrientsLevel();
    
    public boolean getLights();
    
    public boolean getPowered();
    
    public boolean getLocked();
    
    public boolean getDoorsOpen();
    
    public long getTimeLeftUnlocked();
    
    public float getCurrentUpperChamberHumidity();
    
    public float getCurrentUpperChamberTemperature();
    
    public float getCurrentLowerChamberTemperature();
    
    public int getCurrentCO2PPM();
    
    public boolean getDehumidifying();
    
    public boolean getCooling();
    
    public boolean getInjectingCO2();
}
