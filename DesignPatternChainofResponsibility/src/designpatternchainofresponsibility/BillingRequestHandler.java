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
public class BillingRequestHandler extends RequestHandler {
    @Override
    void handleRequest(String request) {
        if (request.equals("billing")) {
            System.out.println("Handling billing request");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}