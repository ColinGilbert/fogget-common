/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noob.plantsystem.common;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author noob
 */
public class ArduinoEventDescriptions {
    
    public ArduinoEventDescriptions() {
        descriptions = new HashMap<>();
        
        // Boundary conditions being triggered on the side of the embedded system.
        // Max/min levels being reached (sensors) or actuators being triggered/stopped.
        // These get logged as separate events, due to their relative urgency.
        descriptions.put(1, "mistingOn");
        descriptions.put(2, "mistingOff");
        descriptions.put(3, "mininumWaterTankLevelReached");
        descriptions.put(4, "maximumWaterTankLevelReached");
        descriptions.put(5, "minimumNutrientsLevelReached");
        descriptions.put(6, "maximumNutrientsLevelReached");
        descriptions.put(7, "mistingWaterSupplyValveOn");
        descriptions.put(8, "mistingWaterSupplyValveOff");
        descriptions.put(9, "nutrientsPumpOn");
        descriptions.put(10, "nutrientsPumpOff");
        descriptions.put(11, "lightsOn");
        descriptions.put(12, "lightsOff");
        descriptions.put(13, "powerOn");
        descriptions.put(14, "powerOff");
        descriptions.put(15, "doorsLocked");
        descriptions.put(16, "doorsUnlocked");
        descriptions.put(17, "doorsOpen");
        descriptions.put(18, "doorsClosed");
        descriptions.put(19, "dehumidiferOn");
        descriptions.put(20, "dehumidifierOff");
        descriptions.put(21, "coolingOn");
        descriptions.put(22, "coolingOff");
        descriptions.put(23, "co2InjectionValveOpen");
        descriptions.put(24, "co2InjectionValveClosed");

    }
    
    public boolean exists(int arg) {
        return descriptions.containsKey(arg);
    }
    public boolean exists(String arg) {
        return descriptions.containsValue(arg);
    }
    
    public String getDescription(int arg) {
        return descriptions.getOrDefault(arg, "");
    }
 
    protected HashMap<Integer, String> descriptions;
}
