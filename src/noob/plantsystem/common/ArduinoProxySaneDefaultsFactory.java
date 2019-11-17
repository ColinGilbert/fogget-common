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
public class ArduinoProxySaneDefaultsFactory {

    static public ArduinoProxy get() {
        PersistentArduinoState persistentState = new PersistentArduinoState();
        persistentState.setUid(-1); // Invalid UID that can easily be spotted.
        persistentState.setMistingInterval(15000); // Fifteen seconds time between mistings. 
        persistentState.setMistingDuration(2000); // Two seconds misting time
        persistentState.setStatusPushInterval(1000); // One update per second
        persistentState.setNutrientSolutionRatio(0.01d);
        persistentState.setLightsOnHour(0); 
        persistentState.setLightsOnMinute(0);
        persistentState.setLightsOffHour(0); 
        persistentState.setLightsOffMinute(0);
        persistentState.setTargetUpperChamberHumidity(70.0f);
        persistentState.setTargetUpperChamberTemperature(25.0f);
        persistentState.setTargetLowerChamberTemperature(18.0f);
        persistentState.setTargetCO2PPM(12000);
        ArduinoProxy proxy = new ArduinoProxy();
        proxy.setPersistentState(persistentState);
        return proxy;
    }
}
