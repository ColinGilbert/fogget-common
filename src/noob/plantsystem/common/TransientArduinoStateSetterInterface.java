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
public interface TransientArduinoStateSetterInterface {

    public void setTimeOfDay(long arg);

    public void setCurrentWaterLevel(float arg);

    public void setCurrentNutrientsLevel(float arg);

    public void setLights(boolean arg);

    public void setPowered(boolean arg);

    public void setDoorsLocked(boolean arg);

    public void setDoorsOpen(boolean arg);

    public void setTimeLeftUnlocked(long arg);

    public void setCurrentUpperChamberHumidity(float arg);

    public void setCurrentUpperChamberTemperature(float arg);

    public void setCurrentLowerChamberTemperature(float arg);

    public void setDehumidifying(boolean arg);

    public void setCooling(boolean arg);

    public void setInjectingCO2(boolean arg);
}
