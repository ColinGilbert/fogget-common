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
public class ArduinoPropertiesDescriptions {

    public ArduinoPropertiesDescriptions() {
        properties = new HashMap<>();

        properties.put(0, "IP");
        properties.put(1, "time of day");
        properties.put(2, "misting");
        properties.put(3, "status update push interval");
        properties.put(4, "current reservoir level");
        properties.put(5, "mininum reservoir level");
        properties.put(6, "maximum reservoir level");
        properties.put(7, "current nutrients level");
        properties.put(8, "minimum nutrients level");
        properties.put(9, "maximum nutrients level");
        properties.put(10, "nutrients PPM");
        properties.put(11, "nutrients solution ratio");
        properties.put(12, "lights");
        properties.put(13, "lights on time");
        properties.put(14, "lights off time");
        properties.put(15, "powered");
        properties.put(16, "doors locked");
        properties.put(17, "doors open");
        properties.put(18, "time left unlocked");
        properties.put(19, "target upper chamber humidity");
        properties.put(20, "current upper chamber humidity");
        properties.put(21, "target upper chamber temperature");
        properties.put(22, "current upper chamber temperature");
        properties.put(23, "target lower chamber temperature");
        properties.put(24, "current lower chamber temperature");
        properties.put(25, "target CO2 level");
        properties.put(26, "current CO2 level");
        properties.put(27, "dehumidifying");
        properties.put(28, "cooling");
        properties.put(29, "CO2 injection");
    }

    public boolean exists(int arg) {
        return properties.containsKey(arg);
    }

    public String getDescription(int arg) {
        return properties.getOrDefault(arg, "");
    }

    protected HashMap<Integer, String> properties;

}
