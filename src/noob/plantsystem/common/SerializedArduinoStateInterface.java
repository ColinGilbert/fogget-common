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
public interface SerializedArduinoStateInterface {
    public long getUID();
    public void setUID(long arg);
    public String getIP();
    public void setIP(String arg);
    public int getMistingInterval();
    public void setMistingInterval(int arg);
    public int getStatusUpdatePushInterval();
    public void setStatusUpdatePushInterval(int arg);
    public float getMinWaterLevel();
    public void setMinWaterLevel(float arg);
    public float getMaxWaterLevel();
    public void setMaxWaterLevel(float arg);
    public float getMinNutrientSolutionLevel();
    public void setMinNutrientSolutionLevel(float arg);
    public float getMaxNutrientSolutionLevel();
    public void setMaxNutrientSolutionLevel(float arg);
    public int getNutrientsPPM();
    public void setNutrientsPPM(int arg);
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
}
