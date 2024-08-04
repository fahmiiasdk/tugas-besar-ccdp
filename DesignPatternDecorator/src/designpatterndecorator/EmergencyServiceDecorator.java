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
public class EmergencyServiceDecorator extends ServiceDecorator {
    public EmergencyServiceDecorator(MedicalService decoratedService) {
        super(decoratedService);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Emergency Support";
    }
}