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
public class DesignPatternChainofResponsibility {

    public static void main(String[] args) {
        RequestHandler appointmentHandler = new AppointmentRequestHandler();
        RequestHandler billingHandler = new BillingRequestHandler();

        appointmentHandler.setNextHandler(billingHandler);

        appointmentHandler.handleRequest("appointment");
        appointmentHandler.handleRequest("billing");
        appointmentHandler.handleRequest("unknown");
    }
    
}