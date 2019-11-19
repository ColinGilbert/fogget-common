/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noob.plantsystem.common;

import java.util.HashMap;
import javafx.util.Pair;

/**
 *
 * @author noob
 */
public class ArduinoEventDescriptions {

    public ArduinoEventDescriptions() {
        codes2descriptions = new HashMap<>();
        descriptions2codes = new HashMap<>();

        // Boundary conditions being triggered on the side of the embedded system.
        // Max/min levels being reached (sensors) or actuators being triggered/stopped.
        // These get logged as separate events, due to their relative urgency.
        EmbeddedEventType events[] = EmbeddedEventType.values();
        for (EmbeddedEventType e : events) {
            codes2descriptions.put(e.ordinal(), e.toString());
            descriptions2codes.put(e.toString(), e.ordinal());
        }

    }

    
    public boolean exists(int arg) {
        return codes2descriptions.containsKey(arg);
    }

    public boolean exists(String arg) {
        return codes2descriptions.containsValue(arg);
    }

    public Pair<Boolean, Integer> getCode(String arg) {
        if (descriptions2codes.containsKey(arg)) {
            return new Pair<>(true, descriptions2codes.get(arg));
        }

        return new Pair<>(false, -1);
    }

    public Pair<Boolean, String> getDescription(int arg) {
        if (codes2descriptions.containsKey(arg)) {
            return new Pair<>(true, codes2descriptions.get(arg));
        }
        return new Pair<>(false, "");
    }

    protected HashMap<Integer, String> codes2descriptions;
    protected HashMap<String, Integer> descriptions2codes;
}
