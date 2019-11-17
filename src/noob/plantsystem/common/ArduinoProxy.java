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
public class ArduinoProxy  {
    private PersistentArduinoState persistentState;
    private TransientArduinoState transientState;

    /**
     * @return the persistentState
     */
    public PersistentArduinoState getPersistentState() {
        return persistentState;
    }

    /**
     * @param persistentState the persistentState to set
     */
    public void setPersistentState(PersistentArduinoState persistentState) {
        this.persistentState = persistentState;
    }

    /**
     * @return the transientState
     */
    public TransientArduinoState getTransientState() {
        return transientState;
    }

    /**
     * @param transientState the transientState to set
     */
    public void setTransientState(TransientArduinoState transientState) {
        this.transientState = transientState;
    }
}
