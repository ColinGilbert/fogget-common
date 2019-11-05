/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noob.plantsystem.common;

import java.util.HashMap;

/**
 *
 * @author noob
 */
public class EventDescription {
    
    public EventDescription() {
        descriptions = new HashMap<>();
        
        descriptions.put(1, "misting on");
        descriptions.put(2, "misting off");
        descriptions.put(3, "mininum water tank level reached");
        descriptions.put(4, "maximum water tank level reached");
        descriptions.put(5, "minimum nutrients level reached");
        descriptions.put(6, "maximum nutrients level reached");
        descriptions.put(7, "misting water supply valve on");
        descriptions.put(8, "misting water supply valve off");
        descriptions.put(9, "nutrients pump on");
        descriptions.put(10, "nutrients pump off");
        descriptions.put(11, "lights on");
        descriptions.put(12, "lights off");
        descriptions.put(13, "power on");
        descriptions.put(14, "power off");
        descriptions.put(15, "doors locked");
        descriptions.put(16, "doors unlocked");
        descriptions.put(17, "doors open");
        descriptions.put(18, "doors closed");
        descriptions.put(19, "dehumidifer on");
        descriptions.put(20, "dehumidifier off");
        descriptions.put(21, "cooling on");
        descriptions.put(22, "cooling off");
        descriptions.put(23, "CO2 injection valve open");
        descriptions.put(24, "CO2 injection valve closed");

    }
    
    public boolean exists(int arg) {
        return descriptions.containsKey(arg);
    }
    
    public String getDescription(int arg)
    {
        return descriptions.getOrDefault(arg, "");
    }
    
    protected HashMap<Integer, String> descriptions;
}
