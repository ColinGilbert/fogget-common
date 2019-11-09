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
 * These are used during property serialization/deserialization
 */
public class ArduinoPropertyStrings {
    
    // Transients
    public String timeOfDay() {
        return "timeOfDay";
    }

    public String currentWaterLevel() {
        return "currentWaterLevel";
    }
    
    public String currentNutrientLevel() {
        return "currentNutrientLevel";
    }
    
    public String lights() {
        return "lights";
    }
    
    public String powered() {
        return "powered";
    }
    
    public String locked() {
        return "locked";
    }
    
    public String doorsOpen() {
        return "doorsOpen";
    }
    
    public String timeLeftUnlocked() {
        return "timeLeftUnlocked";
    }
    
    public String currentUpperChamberHumidity() {
        return "currentUpperChamberHumidity";
    }
    
    public String currentUpperChamberTemperature() {
        return "currentUpperChamberTemperature";
    }
    
    public String currentLowerChamberTemperature() {
        return "currentLowerChamberTemperature";
    }
    
    public String currentCO2PPM() {
        return "currentCO2PPM";
    }
    
    public String dehumidifying() {
        return "dehumidifying";
    }
    
    public String cooling() {
        return "cooling";
    }
    
    public String injectingCO2() {
        return "injectingCO2";
    }
    
    
    // Persistent
    
    public String uid() {
        return "uid";
    }
    
    public String ip() {
        return "ip";
    }
    
    public String mistingInterval() {
        return "mistingInterval";
    }
    
    public String statusUpdatePushInterval() {
        return "statusUpdatePushInterval";
    }
    
    public String minWaterLevel() {
        return "minWaterLevel";
    }
    
    public String maxWaterLevel() {
        return "maxWaterLevel";
    }
    
    public String minNutrientSolutionLevel() {
        return "minNutrientsSolutionLevel";
    }
   
    public String maxNutrientSolutionLevel() {
        return "maxNutrientSolutionLevel";
    }
    
    public String nutrientsPPM() {
        return "nutrientsPPM";
    }
    
    public String nutrientSolutionRatio() {
        return "nutrientSolutionRatio";
    }
    
    public String lightsOnTime() {
        return "lightsOnTime";
    }
    
    public String lightsOffTime() {
        return "lightsOffTime";
    }
    
    public String targetUpperChamberHumidity() {
        return "targetUpperChamberHumidity";
    }
    
    public String targetUpperChamberTemperature() {
        return "targetUpperChamberTemperature";
    }
    
    public String targetLowerChamberTemperature() {
        return "targetLowerChamberTemperature";
    }
    
    public String targetCO2PPM() {
        return "targetCO2PPM";
    }
}
