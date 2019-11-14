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

    public void setTimestamp(long arg);

    public void setReservoirLevel(float arg);

    public void setNutrientSolutionLevel(float arg);
    
    public void setPowered(boolean arg);

    public void setLit(boolean arg);

    public void setMisting(boolean arg);

    public void setLocked(boolean arg);

    public void setOpen(boolean arg);

    public void setTimeLeftUnlocked(long arg);

    public void setCurrentUpperChamberHumidity(float arg);

    public void setCurrentUpperChamberTemperature(float arg);

    public void setCurrentLowerChamberTemperature(float arg);

    public void setCurrentCO2PPM(int arg);
    
    public void setDehumidifying(boolean arg);

    public void setCooling(boolean arg);

    public void setInjectingCO2(boolean arg);
}
