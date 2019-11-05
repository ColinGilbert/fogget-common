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
public class EventsResponseIteratorBuilder extends EventsResponseIterator {
    
    public void addArduino(long uid) {
        arduinos.add(uid);
        currentArduino++;
        currentEvent = 0;
    }
    
    public void addEvent(int eventID, long timeInMillis) {
        events.add(eventID);
        timestamps.add(timeInMillis);
        currentEvent++;
    }
    
    public EventsResponseIterator getBuiltItem() {
        currentArduino = 0;
        currentEvent = 0;
        return (EventsResponseIterator)this;
    }
}
