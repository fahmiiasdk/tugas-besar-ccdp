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
public interface PatientState {
    void handleRequest(Patient patient);
}