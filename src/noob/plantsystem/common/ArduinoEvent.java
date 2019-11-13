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
public class ArduinoEvent {
    
    public long getUid() {
        return uid;
    }
    
    public int getEvent() {
        return event;
    }
    
    public long getTimestamp() {
        return timestamp;
    }
    
    public void setUid(long arg) {
        uid = arg;
    }
    
    public void setEvent(int arg) {
        event = arg;
    }
    
    public void setTimestamp(long arg) {
        timestamp = arg;
    }
    
    protected long uid;
    protected int event;
    protected long timestamp;
}
