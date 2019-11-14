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
public class EmbeddedStatusReport implements TransientArduinoStateGetterInterface, TransientArduinoStateSetterInterface {

    public void updateTransientState(TransientArduinoState state) {
        setReservoirLevel(state.getReservoirLevel());
        setNutrientSolutionLevel(state.getNutrientSolutionLevel());
        setLit(state.isLit());
        setPowered(state.isPowered());
        setMisting(state.isMisting());
        setOpen(state.isOpen());
        setTimeLeftUnlocked(state.getTimeLeftUnlocked());
        setUpperChamberHumidity(state.getUpperChamberHumidity());
        setUpperChamberTemperature(state.getUpperChamberTemperature());
        setLowerChamberTemperature(state.getLowerChamberTemperature());
        setCurrentCO2PPM(state.getCurrentCO2PPM());
        setDehumidifying(state.isDehumidifying());
        setInjectingCO2(state.isInjectingCO2());
        setLocked(state.isLocked());
    }

    public TransientArduinoState extractTransientState() {
        TransientArduinoState results = new TransientArduinoState();
        results.setReservoirLevel(getReservoirLevel());
        results.setNutrientSolutionLevel(getNutrientSolutionLevel());
        results.setPowered(isPowered());
        results.setLit(isLit());
        results.setMisting(isMisting());
        results.setOpen(isOpen());
        results.setTimeLeftUnlocked(getTimeLeftUnlocked());
        results.setUpperChamberHumidity(getUpperChamberHumidity());
        results.setUpperChamberTemperature(getUpperChamberTemperature());
        results.setLowerChamberTemperature(getLowerChamberTemperature());
        results.setCurrentCO2PPM(getCurrentCO2PPM());
        results.setDehumidifying(isDehumidifying());
        results.setInjectingCO2(isInjectingCO2());
        results.setLocked(isLocked());
        return results;
    }

    private long uid;
    private long timestamp;
    private float reservoirLevel;
    private float nutrientSolutionLevel;
    private long timeLeftUnlocked;
    private float upperChamberHumidity;
    private float upperChamberTemperature;
    private float lowerChamberTemperature;
    private int currentCO2PPM;
    
    private boolean powered;
    private boolean lit;
    private boolean misting;
    private boolean open;
    private boolean dehumidifying;
    private boolean cooling;
    private boolean injectingCO2;
    private boolean locked;

    /**
     * @return the uid
     */
    public long getUid() {
        return uid;
    }

    /**
     * @param uid the uid to set
     */
    public void setUid(long uid) {
        this.uid = uid;
    }

    /**
     * @return the timestamp
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return the reservoirLevel
     */
    public float getReservoirLevel() {
        return reservoirLevel;
    }

    /**
     * @param reservoirLevel the reservoirLevel to set
     */
    public void setReservoirLevel(float reservoirLevel) {
        this.reservoirLevel = reservoirLevel;
    }

    /**
     * @return the nutrientSolutionLevel
     */
    public float getNutrientSolutionLevel() {
        return nutrientSolutionLevel;
    }

    /**
     * @param nutrientSolutionLevel the nutrientSolutionLevel to set
     */
    public void setNutrientSolutionLevel(float nutrientSolutionLevel) {
        this.nutrientSolutionLevel = nutrientSolutionLevel;
    }

    /**
     * @return the timeLeftUnlocked
     */
    public long getTimeLeftUnlocked() {
        return timeLeftUnlocked;
    }

    /**
     * @param timeLeftUnlocked the timeLeftUnlocked to set
     */
    public void setTimeLeftUnlocked(long timeLeftUnlocked) {
        this.timeLeftUnlocked = timeLeftUnlocked;
    }

    /**
     * @return the upperChamberHumidity
     */
    public float getUpperChamberHumidity() {
        return upperChamberHumidity;
    }

    /**
     * @param upperChamberHumidity the upperChamberHumidity to set
     */
    public void setUpperChamberHumidity(float upperChamberHumidity) {
        this.upperChamberHumidity = upperChamberHumidity;
    }

    /**
     * @return the upperChamberTemperature
     */
    public float getUpperChamberTemperature() {
        return upperChamberTemperature;
    }

    /**
     * @param upperChamberTemperature the upperChamberTemperature to set
     */
    public void setUpperChamberTemperature(float upperChamberTemperature) {
        this.upperChamberTemperature = upperChamberTemperature;
    }

    /**
     * @return the lowerChamberTemperature
     */
    public float getLowerChamberTemperature() {
        return lowerChamberTemperature;
    }

    /**
     * @param lowerChamberTemperature the lowerChamberTemperature to set
     */
    public void setLowerChamberTemperature(float lowerChamberTemperature) {
        this.lowerChamberTemperature = lowerChamberTemperature;
    }

    /**
     * @return the currentCO2PPM
     */
    public int getCurrentCO2PPM() {
        return currentCO2PPM;
    }

    /**
     * @param currentCO2PPM the currentCO2PPM to set
     */
    public void setCurrentCO2PPM(int currentCO2PPM) {
        this.currentCO2PPM = currentCO2PPM;
    }

    /**
     * @return the powered
     */
    public boolean isPowered() {
        return powered;
    }

    /**
     * @param powered the powered to set
     */
    public void setPowered(boolean powered) {
        this.powered = powered;
    }

    /**
     * @return the lit
     */
    public boolean isLit() {
        return lit;
    }

    /**
     * @param lit the lit to set
     */
    public void setLit(boolean lit) {
        this.lit = lit;
    }

    /**
     * @return the misting
     */
    public boolean isMisting() {
        return misting;
    }

    /**
     * @param misting the misting to set
     */
    public void setMisting(boolean misting) {
        this.misting = misting;
    }

    /**
     * @return the open
     */
    public boolean isOpen() {
        return open;
    }

    /**
     * @param open the open to set
     */
    public void setOpen(boolean open) {
        this.open = open;
    }

    /**
     * @return the dehumidifying
     */
    public boolean isDehumidifying() {
        return dehumidifying;
    }

    /**
     * @param dehumidifying the dehumidifying to set
     */
    public void setDehumidifying(boolean dehumidifying) {
        this.dehumidifying = dehumidifying;
    }

    /**
     * @return the cooling
     */
    public boolean isCooling() {
        return cooling;
    }

    /**
     * @param cooling the cooling to set
     */
    public void setCooling(boolean cooling) {
        this.cooling = cooling;
    }

    /**
     * @return the injectingCO2
     */
    public boolean isInjectingCO2() {
        return injectingCO2;
    }

    /**
     * @param injectingCO2 the injectingCO2 to set
     */
    public void setInjectingCO2(boolean injectingCO2) {
        this.injectingCO2 = injectingCO2;
    }

    /**
     * @return the locked
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * @param locked the locked to set
     */
    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
