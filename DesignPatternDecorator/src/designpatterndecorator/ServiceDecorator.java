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
public abstract class ServiceDecorator implements MedicalService {
    protected MedicalService decoratedService;

    public ServiceDecorator(MedicalService decoratedService) {
        this.decoratedService = decoratedService;
    }

    @Override
    public String getDescription() {
        return decoratedService.getDescription();
    }
}