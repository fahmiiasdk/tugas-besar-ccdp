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

public interface ResourceFactory {
    Doctor createDoctor();
    Nurse createNurse();
    Admin createAdmin();
}