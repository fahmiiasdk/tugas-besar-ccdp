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
public class DesignPatternCommand {

    public static void main(String[] args) {
        HospitalOperations operations = new HospitalOperations();

        Command addPatientCommand = new AddPatientCommand(operations);
        Command generateReportCommand = new GenerateReportCommand(operations);

        CommandInvoker invoker = new CommandInvoker();

        invoker.setCommand(addPatientCommand);
        invoker.invoke();

        invoker.setCommand(generateReportCommand);
        invoker.invoke();
    }
    
}
