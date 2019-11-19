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
public class CommonValues {
    // Savefiles
    public final static String stateSaveFileName = "SYSTEMS.SAVE";
    public final static String descriptionsSaveFileName = "DESCRIPTIONS.SAVE";
    // Connection setup information
    public final static String localhost = "127.0.0.1";
    public final static int mqttPort = 1883;
    public final static int localUIPort = 6777;
    public final static String mqttBrokerURL = "tcp://" + localhost + ":" + mqttPort;
    public final static String defaultDescription = "This is the default system description. Set one in the box below!";
    public final static String pushEventFromEmbeddedTopic = "pushEventFromEmbedded";
    public final static String pushStatusFromEmbeddedTopic = "pushStatusFromEmbedded";
    public final static String pushConfigToEmbeddedTopic = "pushConfigToEmbedded";
    public final static String updateDescriptionRequestTopic = "updateDescriptionRequest";
    public final static String updateEmbeddedStateRequestTopic = "updateEmbeddedStateRequest";
    public final static int maxMqttMessagesInFlight = 1000;
    public final static int eventPoolQueueSize = 100;
    public final static int embeddedSystemTimeout = 10000;
    // MqttClientID for the servlet UI; if we generate a new ID for each connection on the servlet UI, it'll end creating a brand new thread each time.
    public final static String mqttServletClientID = "FoggetUIClientServlet";
   // The following are used by the localhost TCP connection that assists in transferring the backend information to the web UI.
    public final static String pushProxiesToUI = "pushProxiesToUI";
    public final static String getProxiesForUI = "getProxiesForUI";
    public final static String pushEventsToUI = "pushEventsToUI";
    public final static String getEventsForUI = "getEventsForUI";
    public final static String pushDescriptionsToUI = "pushDescriptionsToUI";
    public final static String getDescriptionsForUI = "getDescriptionsForUI";
    // Values for technical (domain-specific) data, to help us make a sensible system.
        public final static int minMistingDuration = 0;
    public final static int maxMistingDuration = 120;
        public final static int minMistingInterval = 0;
    public final static int maxMistingInterval = 900;
        public final static int minNutrientSolutionPPM = 900;
    public final static int maxNutrientSolutionPPM = 900;
    public final static double minNutrientSolutionRatio = 0.0;
    public final static double maxNutrientSolutionRatio = 0.01; // The following is due to the toxicity of nutrients in high concentrations towards plants.
    public final static float minHumidity = 0.0f;
    public final static float maxHumidity = 100.0f;
    public final static float minTargetTemperature = 10.0f;
    public final static float maxTargetTemperature = 80.0f;
    public final static float minPossibleTemperature = -273.6f;
    public final static float maxPossibleTemperature = Float.MAX_VALUE;           
    public final static int minCO2PPM = 0;
    public final static int maxCO2PPM = 1000000;
    public final static int maxDescriptionLength = 512;
    public final static double millisInSec = 1000.0d;
    public final static double millisInMin = 60000.0d;
    public final static long millisInHour = 3600000;
    public final static long millisInDay = 86400000;
    public final static int minutesInHour = 60;
    public final static int hoursInDay = 24;
}