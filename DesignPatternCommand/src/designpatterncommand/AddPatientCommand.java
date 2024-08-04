/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterncommand;

/**
 *
 * @author Asus
 */

public class AddPatientCommand implements Command {
    private HospitalOperations operations;

    public AddPatientCommand(HospitalOperations operations) {
        this.operations = operations;
    }

    @Override
    public void execute() {
        operations.addPatient();
    }
}