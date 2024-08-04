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

public class DesignPatternAbstractFactory {
    public static void main(String[] args) {
        ResourceFactory doctorFactory = new DoctorFactory();
        HumanResource doctor = doctorFactory.createDoctor();
        doctor.manage();

        ResourceFactory nurseFactory = new NurseFactory();
        HumanResource nurse = nurseFactory.createNurse();
        nurse.manage();
        
        ResourceFactory adminFactory = new AdminFactory();
        HumanResource admin = adminFactory.createAdmin();
        admin.manage();
    }
}