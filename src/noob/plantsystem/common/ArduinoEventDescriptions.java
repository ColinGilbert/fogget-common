/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noob.plantsystem.common;

import java.util.HashMap;
import java.util.Iterator;
import javafx.util.Pair;
import java.util.Set;

/**
 *
 * @author noob
 */
public class ArduinoEventDescriptions {
    
    public ArduinoEventDescriptions() {
        codes2descriptions = new HashMap<>();
        
        // Boundary conditions being triggered on the side of the embedded system.
        // Max/min levels being reached (sensors) or actuators being triggered/stopped.
        // These get logged as separate events, due to their relative urgency.
        codes2descriptions.put(1, "mistingOn");
        codes2descriptions.put(2, "mistingOff");
        codes2descriptions.put(3, "mininumWaterTankLevelReached");
        codes2descriptions.put(4, "maximumWaterTankLevelReached");
        codes2descriptions.put(5, "minimumNutrientsLevelReached");
        codes2descriptions.put(6, "maximumNutrientsLevelReached");
        codes2descriptions.put(7, "mistingWaterSupplyValveOn");
        codes2descriptions.put(8, "mistingWaterSupplyValveOff");
        codes2descriptions.put(9, "nutrientsPumpOn");
        codes2descriptions.put(10, "nutrientsPumpOff");
        codes2descriptions.put(11, "lightsOn");
        codes2descriptions.put(12, "lightsOff");
        codes2descriptions.put(13, "powerOn");
        codes2descriptions.put(14, "powerOff");
        codes2descriptions.put(15, "doorsLocked");
        codes2descriptions.put(16, "doorsUnlocked");
        codes2descriptions.put(17, "doorsOpen");
        codes2descriptions.put(18, "doorsClosed");
        codes2descriptions.put(19, "dehumidiferOn");
        codes2descriptions.put(20, "dehumidifierOff");
        codes2descriptions.put(21, "coolingOn");
        codes2descriptions.put(22, "coolingOff");
        codes2descriptions.put(23, "co2InjectionValveOpen");
        codes2descriptions.put(24, "co2InjectionValveClosed");

        
        for (Integer i : codes2descriptions.keySet())
        {
            String s = codes2descriptions.get(i);
            descriptions2codes.put(s, i);
        }
 
    }
    
    public boolean exists(int arg) {
        return codes2descriptions.containsKey(arg);
    }
    
    public boolean exists(String arg) {
        return codes2descriptions.containsValue(arg);
    }
    
    public Pair<Boolean, Integer> getCode(String arg) {
        if (descriptions2codes.containsValue(arg)) {
            return new Pair<>(true, descriptions2codes.get(arg));
        }
       
        return new Pair<>(false, -1);
    }
    

    public Pair<Boolean, String> getDescription(int arg) {
        if (codes2descriptions.containsValue(arg)) {
            return new Pair<>(true, codes2descriptions.get(arg));
        }
        return new Pair<>(false, "");
    }
 
    protected HashMap<Integer, String> codes2descriptions;
    protected HashMap<String, Integer> descriptions2codes;
}
