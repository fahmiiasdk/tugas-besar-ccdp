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
public class AdminFactory implements ResourceFactory {
    @Override
    public Doctor createDoctor() {
        return null;
    }

    @Override
    public Nurse createNurse() {
        return null;
    }

    @Override
    public Admin createAdmin() {
        return new Admin();
    }
}