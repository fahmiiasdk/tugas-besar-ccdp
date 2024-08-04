/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternabstractfactory;

/**
 *
 * @author Asus
 */
public class NurseFactory implements ResourceFactory {
    @Override
    public Doctor createDoctor() {
        return null;
    }

    @Override
    public Nurse createNurse() {
        return new Nurse();
    }

    @Override
    public Admin createAdmin() {
        return null;
    }
}