/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noob.plantsystem.common;

/**
 *
 * @author noob
 * This class holds the string representation of all our state names
 * These are used during serialization/deserialization to XML
 */
public class ArduinoPropertyStrings {
    
    // Transients
    static public final String timeOfDay() {
        return "timeOfDay";
    }

    static public final String reservoirLevel() {
        return "reservoirLevel";
    }
    
    static public final String nutrientSolutionLevel() {
        return "nutrientSolutionevel";
    }
    
    static public final String lights() {
        return "lights";
    }
    
    static public final String powered() {
        return "powered";
    }
    
    static public final String doorsLocked() {
        return "doorsLocked";
    }
    
    static public final String doorsOpen() {
        return "doorsOpen";
    }
    
    static public final String timeLeftUnlocked() {
        return "timeLeftUnlocked";
    }
    
    static public final String upperChamberHumidity() {
        return "upperChamberHumidity";
    }
    
    static public final String upperChamberTemperature() {
        return "upperChamberTemperature";
    }
    
    static public final String lowerChamberTemperature() {
        return "lowerChamberTemperature";
    }
    
    static public final String CO2PPM() {
        return "CO2PPM";
    }
    
    static public final String dehumidifying() {
        return "dehumidifying";
    }
    
    static public final String cooling() {
        return "cooling";
    }
    
    static public final String injectingCO2() {
        return "injectingCO2";
    }
    
    
    // Persistent
    
    static public final String uid() {
        return "uid";
    }
  
    static public final String mistingInterval() {
        return "mistingInterval";
    }
    
    static public final String statusUpdatePushInterval() {
        return "statusUpdatePushInterval";
    }
    
    static public final String minWaterLevel() {
        return "minWaterLevel";
    }
    
    static public final String maxWaterLevel() {
        return "maxWaterLevel";
    }
    
    static public final String minNutrientSolutionLevel() {
        return "minNutrientSolutionLevel";
    }
   
    static public final String maxNutrientSolutionLevel() {
        return "maxNutrientSolutionLevel";
    }
    
    static public final String nutrientsPPM() {
        return "nutrientsPPM";
    }
    
    static public final String nutrientSolutionRatio() {
        return "nutrientSolutionRatio";
    }
    
    static public final String lightsOnTime() {
        return "lightsOnTime";
    }
    
    static public final String lightsOffTime() {
        return "lightsOffTime";
    }
    
    static public final String targetUpperChamberHumidity() {
        return "targetUpperChamberHumidity";
    }
    
    static public final String targetUpperChamberTemperature() {
        return "targetUpperChamberTemperature";
    }
    
    static public final String targetLowerChamberTemperature() {
        return "targetLowerChamberTemperature";
    }
    
    static public final String targetCO2PPM() {
        return "targetCO2PPM";
    }
}
