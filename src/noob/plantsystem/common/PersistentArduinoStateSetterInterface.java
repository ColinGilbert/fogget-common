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
public interface PersistentArduinoStateSetterInterface {

    public void setUid(long arg);

    public void setMistingInterval(int arg);

    public void setMistingDuration(int arg);

    public void setStatusUpdatePushInterval(int arg);

    public void setNutrientSolutionRatio(double arg);

    public void setLightsOnTime(long arg);

    public void setLightsOffTime(long arg);

    public void setTargetUpperChamberHumidity(float arg);

    public void setTargetUpperChamberTemperature(float arg);

    public void setTargetLowerChamberTemperature(float arg);

    public void setTargetCO2PPM(int arg);
}
