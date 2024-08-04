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
public class Patient {
    private PatientState state;

    public Patient(PatientState state) {
        this.state = state;
    }

    public void setState(PatientState state) {
        this.state = state;
    }

    public void request() {
        state.handleRequest(this);
    }
}