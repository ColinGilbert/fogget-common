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
public interface PersistentArduinoStateInterface {
    public long getUID();
    public void setUID(long arg);

    public int getMistingInterval();
    public void setMistingInterval(int arg);
    
    public int getMistingDuration();
    public void setMistingDuration(int arg);
    
    public int getStatusUpdatePushInterval();
    public void setStatusUpdatePushInterval(int arg);
    
    public double getNutrientSolutionRatio();
    public void setNutrientSolutionRatio(double arg);
    
    public long getLightsOnTime();
    public void setLightsOnTime(long arg);
    
    public long getLightsOffTime();
    public void setLightsOffTime(long arg);
    
    public float getTargetUpperChamberHumidity();
    public void setTargetUpperChamberHumidity(float arg);
    
    public float getTargetUpperChamberTemperature();
    public void setTargetUpperChamberTemperature(float arg);
    
    public float getTargetLowerChamberTemperature();
    public void setTargetLowerChamberTemperature(float arg);
    
    public int getTargetCO2PPM();
    public void setTargetCO2PPM(int arg);
}
