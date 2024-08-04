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
public class DesignPatternState {

    public static void main(String[] args) {
        Patient patient = new Patient(new AdmittedState());
        patient.request();
        patient.request();
    }
    
}
