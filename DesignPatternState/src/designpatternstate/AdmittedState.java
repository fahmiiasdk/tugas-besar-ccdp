/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternstate;

/**
 *
 * @author Asus
 */
public class AdmittedState implements PatientState {
    @Override
    public void handleRequest(Patient patient) {
        System.out.println("Patient is admitted.");
        patient.setState(new DischargedState());
    }
}