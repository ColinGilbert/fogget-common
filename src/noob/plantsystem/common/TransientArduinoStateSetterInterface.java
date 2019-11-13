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

    public void setReservoirLevel(float arg);

    public void setNutrientSolutionLevel(float arg);

    public void setLit(boolean arg);

    public void setPowered(boolean arg);

    public void setLocked(boolean arg);

    public void setOpen(boolean arg);

    public void setTimeLeftUnlocked(long arg);

    public void setUpperChamberHumidity(float arg);

    public void setUpperChamberTemperature(float arg);

    public void setLowerChamberTemperature(float arg);

    public void setCO2PPM(int arg);
    
    public void setDehumidifying(boolean arg);

    public void setCooling(boolean arg);

    public void setInjectingCO2(boolean arg);
}
