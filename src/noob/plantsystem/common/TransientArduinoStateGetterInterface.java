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

    public float getReservoirLevel();
    
    public float getNutrientSolutionLevel();
    
    public boolean getLights();
    
    public boolean getPowered();
    
    public boolean getLocked();
    
    public boolean getDoorsOpen();
    
    public long getTimeLeftUnlocked();
    
    public float getUpperChamberHumidity();
    
    public float getUpperChamberTemperature();
    
    public float getLowerChamberTemperature();
    
    public int getCO2PPM();
    
    public boolean getDehumidifying();
    
    public boolean getCooling();
    
    public boolean getInjectingCO2();
    
    public TransientStateLastUpdated getLastUpdated();

}
