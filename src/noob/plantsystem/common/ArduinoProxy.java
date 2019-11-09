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
public class ArduinoProxy {
    
    public PersistentArduinoState getPersistentState() {
        return serializedState;
    }
    
    public void setPersistentState(PersistentArduinoState arg) {
        serializedState = arg;
    }
    
    public void setTransientState(TransientArduinoState arg) {
        transientState = arg;
    }
    
    public TransientArduinoState getTransientState() {
        return transientState;
    }
    
    public boolean isPopulated() {
        return populated;
    }
    
    public void setPopulated() {
        populated = true;
    }
    
    protected boolean populated = false;
    protected PersistentArduinoState serializedState;
    protected TransientArduinoState transientState;
}