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
    public SerializedArduinoState getSerializedState() {
        return serializedState;
    }
    
    public void setSerializedState(SerializedArduinoState arg) {
        serializedState = arg;
    }
    
    public void setTransientArduinoState(TransientArduinoState arg) {
        transientState = arg;
    }
    
    public TransientArduinoState getTransientArduinoState() {
        return transientState;
    }
    
    protected SerializedArduinoState serializedState;
    protected TransientArduinoState transientState;
}