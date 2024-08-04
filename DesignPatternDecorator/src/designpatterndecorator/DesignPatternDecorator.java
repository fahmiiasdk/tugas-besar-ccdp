/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterndecorator;

/**
 *
 * @author Asus
 */
public class DesignPatternDecorator {

    public static void main(String[] args) {
        MedicalService basicService = new BasicService();
        MedicalService emergencyService = new EmergencyServiceDecorator(basicService);

        System.out.println(basicService.getDescription());
        System.out.println(emergencyService.getDescription());
    }
    
}
