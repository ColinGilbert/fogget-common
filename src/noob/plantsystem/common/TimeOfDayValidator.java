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
public class TimeOfDayValidator {
    
   public static boolean validate(int hours, int minutes) {
        if (hours < 0 || minutes < 0) {
            return false;
        }
        if (hours > 23) {
            return false;
        }
        if (minutes > 59) {
            return false;
        }
        return true;
    }
}
