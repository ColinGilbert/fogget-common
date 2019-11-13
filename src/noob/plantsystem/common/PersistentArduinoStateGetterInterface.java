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
public interface PersistentArduinoStateGetterInterface {
    
    public long getUid();

    public int getMistingInterval();

    public int getMistingDuration();
    
    public int getStatusUpdatePushInterval();
    
    public double getNutrientSolutionRatio();
    
    public long getLightsOnTime();
    
    public long getLightsOffTime();
    
    public float getTargetUpperChamberHumidity();
    
    public float getTargetUpperChamberTemperature();
    
    public float getTargetLowerChamberTemperature();
    
    public int getTargetCO2PPM();
    
}