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

    public long getTimestamp();

    public float getReservoirLevel();
    
    public float getNutrientSolutionLevel();
    
    public boolean isPowered();

    public boolean isLit();
    
    public boolean isMisting();
    
    public boolean isLocked();
    
    public boolean isOpen();
    
    public long getTimeLeftUnlocked();
    
    public float getUpperChamberHumidity();
    
    public float getUpperChamberTemperature();
    
    public float getLowerChamberTemperature();
    
    public int getCurrentCO2PPM();
    
    public boolean isDehumidifying();
    
    public boolean isCooling();
    
    public boolean isInjectingCO2();
    
}
