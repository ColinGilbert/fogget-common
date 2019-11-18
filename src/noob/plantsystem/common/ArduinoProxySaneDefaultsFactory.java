/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noob.plantsystem.common;

import java.util.Random;

/**
 *
 * @author noob
 */
public class ArduinoProxySaneDefaultsFactory {

    static public ArduinoProxy get() {
        PersistentArduinoState persistentState = new PersistentArduinoState();
        persistentState.setUid(new Random().nextLong()); // Invalid UID that can easily be spotted.
        persistentState.setMistingInterval(15000); // Fifteen seconds time between mistings. 
        persistentState.setMistingDuration(2000); // Two seconds misting time
        persistentState.setStatusPushInterval(1000); // One update per second
        persistentState.setNutrientSolutionRatio(0.01d);
        persistentState.setLightsOnHour(8); 
        persistentState.setLightsOnMinute(0);
        persistentState.setLightsOffHour(22); 
        persistentState.setLightsOffMinute(0);
        persistentState.setTargetUpperChamberHumidity(70.0f);
        persistentState.setTargetUpperChamberTemperature(25.0f);
        persistentState.setTargetLowerChamberTemperature(18.0f);
        persistentState.setTargetCO2PPM(12000);
        TransientArduinoState transientState = new TransientArduinoState();
        transientState.setCurrentCO2PPM(10000);
        transientState.setCurrentLowerChamberTemperature(18.0f);
        transientState.setCurrentUpperChamberTemperature(23.0f);
        transientState.setCurrentUpperChamberHumidity(65.0f);
        transientState.setTimestamp(System.currentTimeMillis());
        ArduinoProxy proxy = new ArduinoProxy(); 
           proxy.setPersistentState(persistentState);
           proxy.setTransientState(transientState);
        return proxy;
    }
}
