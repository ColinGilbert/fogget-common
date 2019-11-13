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
        TransientArduinoState transientState = new TransientArduinoState();

        ArduinoProxy proxy = new ArduinoProxy();
        
        persistentState.setUid(-1); // Invalid UID that can easily be spotted.
        persistentState.setMistingInterval(15000); // Fifteen seconds time between mistings. 
        persistentState.setMistingDuration(2000); // Two seconds misting time
        persistentState.setStatusUpdatePushInterval(1000); // One update per second
        persistentState.setNutrientSolutionRatio(0.01d);
        persistentState.setLightsOnTime(-1); // Lights on time = -1 means always on
        persistentState.setLightsOffTime(-1); // Lights off time = -1 also means always on 
        persistentState.setTargetUpperChamberHumidity(70.0f);
        persistentState.setTargetUpperChamberTemperature(25.0f);
        persistentState.setTargetLowerChamberTemperature(18.0f);
        persistentState.setTargetCO2PPM(12000);

        proxy.updateTransientState(transientState);
        proxy.updatePersistentState(persistentState);
        
        return proxy;
    }
}
