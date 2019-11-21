/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noob.plantsystem.common;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author noob
 */
public class ConnectionCloser {

    static public void closeConnection(PrintWriter tcpOut, Socket socket) {
        try {
            tcpOut.close();
        } catch (Exception ex) {
            Logger.getLogger(ConnectionCloser.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(ConnectionCloser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ConnectionCloser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static public void closeConnection(Scanner tcpIn, PrintWriter tcpOut, Socket socket) {
        try {
            tcpIn.close();
        } catch (Exception ex) {
            Logger.getLogger(ConnectionCloser.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            tcpOut.close();
        } catch (Exception ex) {
            Logger.getLogger(ConnectionCloser.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(ConnectionCloser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ConnectionCloser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
