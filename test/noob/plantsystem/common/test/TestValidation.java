/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noob.plantsystem.common.test;

import noob.plantsystem.common.EmbeddedStateChangeValidator;
import noob.plantsystem.common.EmbeddedSystemConfigChange;
import noob.plantsystem.common.CommonValues;
import org.testng.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Colin Gilbert These tests verify that one of the most troublesome
 * parts of this systems works correctly.
 *
 */
public class TestValidation {

    protected void testValues(EmbeddedSystemConfigChange representation, EmbeddedSystemConfigChange results, String arg) {
        String firstPart = "Validate State change representation FAIL in subset \"" + arg + " \". ";
        Assert.assertEquals(representation.isChangingMistingDuration(), results.isChangingMistingDuration(), firstPart + "Misting duration.");
        Assert.assertEquals(representation.isChangingMistingInterval(), results.isChangingMistingInterval(), firstPart + "Misting interval.");
        Assert.assertEquals(representation.isChangingLightsOnHour(), results.isChangingLightsOnHour(), firstPart + "Lights on hour.");
        Assert.assertEquals(representation.isChangingLightsOnMinute(), results.isChangingLightsOnMinute(), firstPart + "Lights on minute.");
        Assert.assertEquals(representation.isChangingLightsOffHour(), results.isChangingLightsOffHour(), firstPart + "Lights off hour.");
        Assert.assertEquals(representation.isChangingLightsOffMinute(), results.isChangingLightsOffMinute(), firstPart + "Lights off minute.");
        Assert.assertEquals(representation.isChangingNutrientSolutionRatio(), results.isChangingNutrientSolutionRatio(), firstPart + "Nutrient solution ratio.");
        Assert.assertEquals(representation.isChangingNutrientsPPM(), results.isChangingNutrientsPPM(), firstPart + "Misting duration too big failed.");
        Assert.assertEquals(representation.isChangingTargetLowerChamberTemperature(), results.isChangingTargetLowerChamberTemperature(), firstPart + "Lower chamber temperature.");
        Assert.assertEquals(representation.isChangingTargetUpperChamberHumidity(), results.isChangingTargetUpperChamberHumidity(), firstPart + "Upper chamber temperatur.");
        Assert.assertEquals(representation.isChangingTargetCO2PPM(), results.isChangingTargetCO2PPM(), firstPart + "Target CO2");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void targetstooHigh() {
        EmbeddedSystemConfigChange representation = new EmbeddedSystemConfigChange();
 EmbeddedSystemConfigChange results = EmbeddedStateChangeValidator.validate(representation, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE); // The values are zero as we're not testing the time.

        representation.getPersistentState().setMistingDuration(Integer.MAX_VALUE);
        representation.setChangingMistingDuration(true);

        representation.getPersistentState().setMistingInterval(Integer.MAX_VALUE);
        representation.setChangingMistingInterval(true);

        representation.getPersistentState().setLightsOnHour(Integer.MAX_VALUE);
        representation.setChangingLightsOnHour(true);

        representation.getPersistentState().setLightsOnMinute(Integer.MAX_VALUE);
        representation.setChangingLightsOnMinute(true);

        representation.getPersistentState().setLightsOffHour(Integer.MAX_VALUE);
        representation.setChangingLightsOffHour(true);

        representation.getPersistentState().setLightsOffMinute(Integer.MAX_VALUE);
        representation.setChangingLightsOffMinute(true);

        representation.getPersistentState().setNutrientSolutionRatio(Double.MAX_VALUE);
        representation.setChangingNutrientSolutionRatio(true);

        representation.getPersistentState().setNutrientsPPM(Integer.MAX_VALUE);
        representation.setChangingNutrientsPPM(true);

        representation.getPersistentState().setTargetLowerChamberTemperature(Float.MAX_VALUE);
        representation.setChangingTargetLowerChamberTemperature(true);

        representation.getPersistentState().setTargetUpperChamberTemperature(Float.MAX_VALUE);
        representation.setChangingTargetUpperChamberTemperature(true);

        representation.getPersistentState().setTargetUpperChamberHumidity(Float.MAX_VALUE);
        representation.setChangingTargetUpperChamberHumidity(true);

        representation.getPersistentState().setTargetCO2PPM(Integer.MAX_VALUE);
        representation.setChangingTargetCO2PPM(true);


        testValues(representation, results, "MAX_VALUE");
    }

    @Test
    public void targetsTooLow() {
        EmbeddedSystemConfigChange representation = new EmbeddedSystemConfigChange();

        representation.getPersistentState().setMistingDuration(Integer.MIN_VALUE);
        representation.setChangingMistingDuration(true);

        representation.getPersistentState().setMistingInterval(Integer.MIN_VALUE);
        representation.setChangingMistingInterval(true);

        representation.getPersistentState().setLightsOnHour(Integer.MIN_VALUE);
        representation.setChangingLightsOnHour(true);

        representation.getPersistentState().setLightsOnMinute(Integer.MIN_VALUE);
        representation.setChangingLightsOnMinute(true);

        representation.getPersistentState().setLightsOffHour(Integer.MIN_VALUE);
        representation.setChangingLightsOffHour(true);

        representation.getPersistentState().setLightsOffMinute(Integer.MIN_VALUE);
        representation.setChangingLightsOffMinute(true);

        representation.getPersistentState().setNutrientSolutionRatio(Double.MIN_VALUE);
        representation.setChangingNutrientSolutionRatio(true);

        representation.getPersistentState().setNutrientsPPM(Integer.MIN_VALUE);
        representation.setChangingNutrientsPPM(true);

        representation.getPersistentState().setTargetLowerChamberTemperature(Float.MIN_VALUE);
        representation.setChangingTargetLowerChamberTemperature(true);

        representation.getPersistentState().setTargetUpperChamberTemperature(Float.MIN_VALUE);
        representation.setChangingTargetUpperChamberTemperature(true);

        representation.getPersistentState().setTargetUpperChamberHumidity(Float.MIN_VALUE);
        representation.setChangingTargetUpperChamberHumidity(true);
        representation.getPersistentState().setLightsOnMinute(Integer.MIN_VALUE);
        representation.setChangingLightsOnMinute(true);

        representation.getPersistentState().setTargetCO2PPM(Integer.MIN_VALUE);
        representation.setChangingTargetCO2PPM(true);

        EmbeddedSystemConfigChange results = EmbeddedStateChangeValidator.validate(representation, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE); // The values are zero as we're not testing the time.

        testValues(representation, results, "MIN_VALUE");
    }

    final int validHighHour = 23;
    final int validHighMinute = 59;

    @Test
    public void nonsenseOnTimeValuesHoursGoodMinutesLow() {
        EmbeddedSystemConfigChange representation = new EmbeddedSystemConfigChange();
        representation.getPersistentState().setLightsOnMinute(-1);
        representation.setChangingLightsOnMinute(true);
        EmbeddedSystemConfigChange results = EmbeddedStateChangeValidator.validate(representation, validHighHour, validHighMinute, 0, 0); // The values are zero as we're not testing the time.
        testValues(representation, results, "LIGHTS ON: hours good, minutes too small");

    }

    @Test
    public void nonsenseOnTimeValuesHoursGoodMinutesHigh() {
        EmbeddedSystemConfigChange representation = new EmbeddedSystemConfigChange();
        representation.getPersistentState().setLightsOnMinute(60);
        representation.setChangingLightsOnMinute(true);
        EmbeddedSystemConfigChange results = EmbeddedStateChangeValidator.validate(representation, validHighHour, validHighMinute, 0, 0); // The values are zero as we're not testing the time.
        testValues(representation, results, "LIGHTS ON: hours good, minutes too big");

    }

    @Test
    public void nonsenseOnTimeValuesHoursHighMinutesGood() {
        EmbeddedSystemConfigChange representation = new EmbeddedSystemConfigChange();
        representation.getPersistentState().setLightsOnHour(24);
        representation.setChangingLightsOnHour(true);
        EmbeddedSystemConfigChange results = EmbeddedStateChangeValidator.validate(representation, validHighHour, validHighMinute, 0, 0); // The values are zero as we're not testing the time.
        testValues(representation, results, "LIGHTS ON: hours too big, minutes good");

    }

    @Test
    public void nonsenseOnTimeValuesHoursLowMinutesGood() {
        EmbeddedSystemConfigChange representation = new EmbeddedSystemConfigChange();
        representation.getPersistentState().setLightsOnHour(-1);
        representation.setChangingLightsOffHour(true);
        EmbeddedSystemConfigChange results = EmbeddedStateChangeValidator.validate(representation, validHighHour, validHighMinute, 0, 0); // The values are zero as we're not testing the time.
        testValues(representation, results, "LIGHTS ON: hours too small, minutes good");

    }

    @Test
    public void nonsenseOffTimeValuesHoursGoodMinutesLow() {
        EmbeddedSystemConfigChange representation = new EmbeddedSystemConfigChange();
        representation.getPersistentState().setLightsOnMinute(-1);
        representation.setChangingLightsOnMinute(true);
        EmbeddedSystemConfigChange results = EmbeddedStateChangeValidator.validate(representation, validHighHour, validHighMinute, 0, 0); // The values are zero as we're not testing the time.
        testValues(representation, results, "LIGHTS OFF: hours good, minutes too small");

    }

    @Test
    public void nonsenseOffTimeValuesHoursGoodMinutesHigh() {
        EmbeddedSystemConfigChange representation = new EmbeddedSystemConfigChange();
       representation.getPersistentState().setLightsOnMinute(60);
        representation.setChangingLightsOnMinute(true);
        EmbeddedSystemConfigChange results = EmbeddedStateChangeValidator.validate(representation, validHighHour, validHighMinute, 0, 0); // The values are zero as we're not testing the time.
        testValues(representation, results, "LIGHTS OFF: hours good, minutes too high");

    }

    @Test
    public void nonsenseOffTimeValuesHoursHighMinutesGood() {
        EmbeddedSystemConfigChange representation = new EmbeddedSystemConfigChange();
        representation.getPersistentState().setLightsOffHour(24);
        representation.setChangingLightsOffHour(true);
        EmbeddedSystemConfigChange results = EmbeddedStateChangeValidator.validate(representation, validHighHour, validHighMinute, 0, 0); // The values are zero as we're not testing the time.
        testValues(representation, results, "LIGHTS OFF: hours too big, minutes good");

    }

    @Test
    public void nonsenseOffTimeValuesHoursLowMinutesGood() {
        EmbeddedSystemConfigChange representation = new EmbeddedSystemConfigChange();
        representation.getPersistentState().setLightsOffHour(-1);
        representation.setChangingLightsOffHour(true);
        EmbeddedSystemConfigChange results = EmbeddedStateChangeValidator.validate(representation, validHighHour, validHighMinute, 0, 0); // The values are zero as we're not testing the time.
        testValues(representation, results, "LIGHTS OFF: hours too small, minutes good");

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {

    }

    @AfterMethod
    public void tearDownMethod() throws Exception {

    }
}
