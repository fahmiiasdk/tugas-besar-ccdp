/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternchainofresponsibility;

/**
 *
 * @author Asus
 */
public class AppointmentRequestHandler extends RequestHandler {
    @Override
    void handleRequest(String request) {
        if (request.equals("appointment")) {
            System.out.println("Handling appointment request");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}