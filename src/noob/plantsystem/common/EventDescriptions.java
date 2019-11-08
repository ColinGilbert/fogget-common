/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noob.plantsystem.common;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author noob
 */
public class EventDescriptions {
    
    public EventDescriptions() {
        descriptions = new HashSet<>();
        
        // Boundary conditions being triggered on the side of the embedded system.
        // Max/min levels being reached (sensors) or actuators being triggered/stopped.
        // These get logged as separate events, due to their relative urgency.
        descriptions.add("mistingOn");
        descriptions.add("mistingOff");
        descriptions.add("mininumWaterTankLevelReached");
        descriptions.add("maximumWaterTankLevelReached");
        descriptions.add("minimumNutrientsLevelReached");
        descriptions.add("maximumNutrientsLevelReached");
        descriptions.add("mistingWaterSupplyValveOn");
        descriptions.add("mistingWaterSupplyValveOff");
        descriptions.add("nutrientsPumpOn");
        descriptions.add("nutrientsPumpOff");
        descriptions.add("lightsOn");
        descriptions.add("lightsOff");
        descriptions.add("powerOn");
        descriptions.add("powerOff");
        descriptions.add("doorsLocked");
        descriptions.add("doorsUnlocked");
        descriptions.add("doorsOpen");
        descriptions.add("doorsClosed");
        descriptions.add("dehumidiferOn");
        descriptions.add("dehumidifierOff");
        descriptions.add("coolingOn");
        descriptions.add("coolingOff");
        descriptions.add("co2InjectionValveOpen");
        descriptions.add("co2InjectionValveClosed");
        
        // Status reports from the embedded system
        descriptions.add("embeddedStatusReport");
        
        // Commands sent to the embedded system
        descriptions.add("commandsToembedded");
        
        // Requests from the client herself
        descriptions.add("clientRequestToBackend");

        // Response to the client
        descriptions.add("backendResponseToClient");
    }
    
    public boolean exists(String arg) {
        return descriptions.contains(arg);
    }
    
    public Iterator<String> getValues() {
        return descriptions.iterator();
    }
 
    protected HashSet<String> descriptions;
}
