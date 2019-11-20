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
public class EmbeddedStateChangeValidator {
    /**
 *
 * @author noob
 * The integer arguments are to be able to use an existing lights-on hour to test against.
 * Intended usage is for the case in which the backend is told that the user wants to change either only the minute or the hour setting.
 * That means it can then pull up the existing value from already-known information and calculate,
 *  */
    public static EmbeddedSystemConfigChangeMemento validate(EmbeddedSystemConfigChangeMemento arg, int currentLightsOnHour, int currentLightsOnMin, int currentLightsOffHour, int currentLightsOffMin) {
        EmbeddedSystemConfigChangeMemento req = arg;
        boolean settingLightsOnHour = false;
        boolean settingLightsOffHour = false;
        boolean settingLightsOnMinute = false;
        boolean settingLightsOffMinute = false;
        final int mistingInterval = req.getPersistentState().getMistingInterval();
        final int mistingDuration = req.getPersistentState().getMistingDuration();
        final int lightsOnHour = req.getPersistentState().getLightsOnHour();
        final int lightsOnMinute = req.getPersistentState().getLightsOnMinute();
        final int lightsOffHour = req.getPersistentState().getLightsOffHour();
        final int lightsOffMinute = req.getPersistentState().getLightsOffMinute();
        final long uid = req.getPersistentState().getUid();
        // Validating time
        if (req.hasChanges()) {
            if (req.isChangingLightsOnHour()) {
                settingLightsOnHour = true;
            }
            if (req.isChangingLightsOnMinute()) {
                settingLightsOnMinute = true;
            }
            if (req.isChangingLightsOffHour()) {
                settingLightsOffHour = true;
            }
            if (req.isChangingLightsOffMinute()) {
                settingLightsOffMinute = true;
            }
            boolean validOnTime = false;
            if (settingLightsOnHour && settingLightsOnMinute) {
                validOnTime = TimeOfDayValidator.validate(lightsOnHour, lightsOnMinute);
            } else if (settingLightsOnHour) {
                validOnTime = TimeOfDayValidator.validate(lightsOnHour, currentLightsOnMin);
            } else if (settingLightsOnMinute) {
                validOnTime = TimeOfDayValidator.validate(currentLightsOnHour, lightsOnMinute);
            }
            if (!validOnTime) {
                req.setChangingLightsOnHour(false);
                req.setChangingLightsOnMinute(false);
            }
            boolean validOffTime = false;
            if (settingLightsOffHour && settingLightsOffMinute) {
                validOffTime = TimeOfDayValidator.validate(lightsOffHour, lightsOffMinute);
            } else if (settingLightsOffHour) {
                validOffTime = TimeOfDayValidator.validate(lightsOffHour, currentLightsOffMin);
            } else if (settingLightsOffMinute) {
                validOffTime = TimeOfDayValidator.validate(currentLightsOffHour, lightsOffMinute);
            }
            if (!validOffTime) {
                req.setChangingLightsOffHour(false);
                req.setChangingLightsOffMinute(false);
            }
            // Validating misting interval
            if (req.isChangingMistingInterval() && (mistingInterval > CommonValues.maxMistingInterval || mistingInterval < CommonValues.minMistingInterval)) {
                req.setChangingMistingInterval(false);
            }
            // Validating misting duration
            if (req.isChangingMistingDuration() && (mistingDuration > CommonValues.maxMistingDuration || mistingDuration < CommonValues.minMistingDuration)) {
                req.setChangingMistingDuration(false);
            }
            // Validating solution ratio of nutrients vs water
            final double solutionRatio = req.getPersistentState().getNutrientSolutionRatio();
            if (req.isChangingNutrientSolutionRatio() && (solutionRatio > CommonValues.maxNutrientSolutionRatio || solutionRatio < CommonValues.minNutrientSolutionRatio)) {
                req.setChangingNutrientSolutionRatio(false);
            }
            // Validating humidity
            final float humidity = req.getPersistentState().getTargetUpperChamberHumidity();
            if (req.isChangingTargetUpperChamberHumidity() && (humidity > CommonValues.maxHumidity || humidity < CommonValues.minHumidity)) {
                req.setChangingTargetUpperChamberHumidity(false);
            }
            // Validating temperature
            final float temperature = req.getPersistentState().getTargetUpperChamberTemperature();
            if (req.isChangingTargetUpperChamberTemperature() && (temperature > CommonValues.maxTargetTemperature || temperature < CommonValues.minTargetTemperature)) {
                req.setChangingTargetUpperChamberTemperature(false);
            }
            final int ppm = req.getPersistentState().getTargetCO2PPM();
            // Validating target CO2 levels
            if (req.isChangingTargetCO2PPM()) {
                if (ppm < CommonValues.minCO2PPM || ppm > CommonValues.maxCO2PPM) {
                    req.setChangingTargetCO2PPM(false);
                }
            }
        }
        return req;
    }
}
