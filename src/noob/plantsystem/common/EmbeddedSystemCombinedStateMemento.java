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
public class EmbeddedSystemCombinedStateMemento {

    private PersistentEmbeddedSystemStateMemento persistentState = new PersistentEmbeddedSystemStateMemento();
    private TransientEmbeddedSystemStateMemento transientState = new TransientEmbeddedSystemStateMemento();

    /**
     * @return the persistentState
     */
    public PersistentEmbeddedSystemStateMemento getPersistentState() {
        return persistentState;
    }

    /**
     * @param persistentState the persistentState to set
     */
    public void setPersistentState(PersistentEmbeddedSystemStateMemento persistentState) {
        this.persistentState = persistentState;
    }

    /**
     * @return the transientState
     */
    public TransientEmbeddedSystemStateMemento getTransientState() {
        return transientState;
    }

    /**
     * @param transientState the transientState to set
     */
    public void setTransientState(TransientEmbeddedSystemStateMemento transientState) {
        this.transientState = transientState;
    }
}
