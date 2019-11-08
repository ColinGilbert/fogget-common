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
public class ArduinoPropertiesDescriptions {

    public ArduinoPropertiesDescriptions() {
        properties = new HashSet<>();

        properties.add("IP");
        properties.add("timeOfDay");
        properties.add("mistingInterval");
        properties.add("statusUpdatePushInterval");
        properties.add("currentReservoirLevel");
        properties.add("mininumReservoirLevel");
        properties.add("maximumReservoirLevel");
        properties.add("currentNutrientsLevel");
        properties.add("minimumNutrientsLevel");
        properties.add("maximumNutrientsLevel");
        properties.add("nutrientsPPM");
        properties.add("nutrientsSolutionRatio");
        properties.add("lightsOnTime");
        properties.add("lightsOffTime");
        properties.add("timeLeftUnlocked");
        properties.add("targetUpperChamberHumidity");
        properties.add("currentUpperChamberHumidity");
        properties.add("targetUpperChamberTemperature");
        properties.add("currentUpperChamberTemperature");
        properties.add("targetLowerChamberTemperature");
        properties.add("currentLowerChamberTemperature");
        properties.add("targetCO2");
        properties.add("currentCO2");

    }

    public boolean exists(String arg) {
        return properties.contains(arg);
    }

    public Iterator<String> getDescription() { 
           return properties.iterator();
    }

    protected HashSet<String> properties;

}
