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
        descriptions2codes = new HashMap<>();
        
        // Boundary conditions being triggered on the side of the embedded system.
        // Max/min levels being reached (sensors) or actuators being triggered/stopped.
        // These get logged as separate events, due to their relative urgency.
        codes2descriptions.put(1, "misting on");
        codes2descriptions.put(2, "misting off");
        codes2descriptions.put(3, "mininum water tank level reached");
        codes2descriptions.put(4, "maximum water tank level reached");
        codes2descriptions.put(5, "minimum nutrients level reached");
        codes2descriptions.put(6, "maximum nutrients level reached");
        codes2descriptions.put(7, "misting water supply valve on");
        codes2descriptions.put(8, "misting water supply valve off");
        codes2descriptions.put(9, "nutrients pump on");
        codes2descriptions.put(10, "nutrients pump off");
        codes2descriptions.put(11, "lights on");
        codes2descriptions.put(12, "lights off");
        codes2descriptions.put(13, "power on");
        codes2descriptions.put(14, "power off");
        codes2descriptions.put(15, "doors locked");
        codes2descriptions.put(16, "doors unlocked");
        codes2descriptions.put(17, "doors open");
        codes2descriptions.put(18, "doors closed");
        codes2descriptions.put(19, "dehumidifer on");
        codes2descriptions.put(20, "dehumidifier off");
        codes2descriptions.put(21, "cooling on");
        codes2descriptions.put(22, "cooling off");
        codes2descriptions.put(23, "CO2 injection valve open");
        codes2descriptions.put(24, "CO2 injection valve closed");

        
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
