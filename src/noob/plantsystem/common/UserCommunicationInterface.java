/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noob.plantsystem.common;


import java.util.List;
import java.util.Map;

/**
 *
 * @author noob
 */
public interface UserCommunicationInterface {

    // Getters
    List<Long> getActiveArduinoSystems();

    List<ArduinoProxy> getArduinoState(List<Integer> args);
    EventsResponseIterator getArduinoHistory(int numEvents, List<Long> uids, List<Integer> eventTypes);

    Map<Long, String> getArduinoDescriptions(List<Long> uids);

    Map<Integer, String> getEventDescriptions();

    String getEventDatabaseBackup(long from, long to);
     
    String getEventDatabaseBackup();
    
    long getTime();
   
    // Setters
    Map<Long, Boolean> setArduinoDescription(Map<Long, String> values);

    Map<Long, Boolean> setMistingInterval(Map<Long, Long> values);

    Map<Long, Long> setNutrientsPPM(Map<Long, Long> values);

    Map<Long, Double> setNutrientsSolutionRatio(Map<Long, Double> values);

    Map<Long, Boolean> setDailyLightingSchedule(List<Long> uids, long onTimeMillis, long offTimeMillis);

    Map<Long, Boolean> unlock(List<Long> uids, long millis);

    Map<Long, Boolean> lock(List<Long> uids);

    Map<Long, Float> setTargetUpperChamberHumidity(List<Long> uids, float percentage);

    Map<Long, Float> setTargetUpperChamberTemperature(List<Long> uids, float percentage);

    Map<Long, Float> setTargetLowerChamberTemperature(List<Long> uids, float percentage);

    Map<Long, Float> setCurrentLowerChamberTemperature(List<Long> uids, float percentage);
}
