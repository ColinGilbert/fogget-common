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
public class SerializedArduinoState implements SerializedArduinoStateInterface, Serializable {
 
    @Override
    public long getUID()
        {
            return uid;
        }
        
    @Override
    public void setUID(long arg)
    {
        uid = arg;
    }
    @Override
    public String getIP()
    {
        return ip;
    }
    
    @Override
    public void setIP(String arg)
    {
        ip = arg;
    }
    
    @Override
    public int getMistingInterval()
    {
        return mistingInterval;
    }
    
    @Override
    public void setMistingInterval(int arg)
    {
        mistingInterval = arg;
    }
    
    @Override
    public int getStatusUpdatePushInterval()
    {
        return statusUpdatePushInterval;
    }
    
    @Override
    public void setStatusUpdatePushInterval(int arg)
    {
        statusUpdatePushInterval = arg;
    }
    
    @Override
    public float getMinWaterLevel()
    {
        return minWaterLevel;
    }
    
    @Override
    public void setMinWaterLevel(float arg)
    {
        minWaterLevel = arg;
    }
    
    @Override
    public float getMaxWaterLevel()
    {
        return maxWaterLevel;
    }
    
    @Override
    public void setMaxWaterLevel(float arg)
    {
        maxWaterLevel = arg;
    }
    
    @Override
    public float getMinNutrientSolutionLevel()
    {
        return minNutrientSolutionLevel;
    }
    
    @Override
    public void setMinNutrientSolutionLevel(float arg)
    {
        minNutrientSolutionLevel = arg;
    }
    
    @Override
    public float getMaxNutrientSolutionLevel()
    {
        return maxNutrientSolutionLevel;
    }
    
    @Override
    public void setMaxNutrientSolutionLevel(float arg)
    {
        maxNutrientSolutionLevel = arg;
    }
    
    @Override
    public int getNutrientsPPM()
    {
        return nutrientsPPM;
    }
    
    @Override
    public void setNutrientsPPM(int arg)
    {
        nutrientsPPM = arg;
    }
    
    @Override
    public double getNutrientSolutionRatio()
    {
        return nutrientSolutionRatio;
    }
    
    @Override
    public void setNutrientSolutionRatio(double arg)
    {
        nutrientSolutionRatio = arg;
    }
    
    @Override
    public long getLightsOnTime()
    {
        return lightsOnTime;
    }
    
    @Override
    public void setLightsOnTime(long arg)
    {
        lightsOnTime = arg;
    }
    
    @Override
    public long getLightsOffTime()
    {
        return lightsOffTime;
    }
    
    @Override
    public void setLightsOffTime(long arg)
    {
        lightsOffTime = arg;
    }
    
    @Override
    public float getTargetUpperChamberHumidity()
    {
        return lightsOffTime;
    }
    
    @Override
    public void setTargetUpperChamberHumidity(float arg)
    {
        targetUpperChamberHumidity = arg;
    }
    
    @Override
    public float getTargetUpperChamberTemperature()
    {
        return targetUpperChamberTemperature;
    }
    
    @Override
    public void setTargetUpperChamberTemperature(float arg)
    {
        targetUpperChamberTemperature = arg;
    }
    
    @Override
    public float getTargetLowerChamberTemperature()
    {
        return targetLowerChamberTemperature;
    }
    
    @Override
    public void setTargetLowerChamberTemperature(float arg) 
    {
        targetLowerChamberTemperature = arg;
    }
    
 
    protected Long uid;
    protected String ip;
    protected Integer mistingInterval;
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
            
}
