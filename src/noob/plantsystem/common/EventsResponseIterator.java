/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noob.plantsystem.common;

import java.util.ArrayList;

/**
 *
 * @author noob
 */
public class EventsResponseIterator {

    public EventsResponseIterator() {
        arduinos = new ArrayList<>();
        events = new ArrayList<>();
        timestamps = new ArrayList<>();
        currentArduino = 0;
        currentEvent = 0;
    }

    protected ArrayList<Long> arduinos;
    protected ArrayList<Integer> events;
    protected ArrayList<Long> timestamps;

    protected int currentArduino;
    protected int currentEvent;

    public boolean hasNextArduino() {
        return (arduinos.size() > currentArduino);
    }

    public boolean iterateArduino() {
        if (arduinos.size() > currentArduino) {
            currentArduino++;
            return true;
        }
        return false;
    }

    public boolean hasNextEvent() {
        return (events.size() > currentEvent);
    }

    public boolean iterateNextEvent() {
        if (events.size() > currentEvent) {
            currentEvent++;
            return true;
        }
        return false;
    }

    public long getArduinoUID() {
        return arduinos.get(currentArduino);
    }

    public int getEventType() {
        return events.get(currentEvent);
    }

    public long getEventTimeInMillis() {
        return timestamps.get(currentEvent);
    }

    public void reset() {
        currentArduino = 0;
        currentEvent = 0;
    }
}
