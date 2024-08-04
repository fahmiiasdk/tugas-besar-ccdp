/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterncomposite;

/**
 *
 * @author Asus
 */
public class DesignPatternComposite {

    public static void main(String[] args) {
        HospitalComponent equipment = new MedicalEquipment();
        HospitalComponent room = new Room();

        HospitalFacility facility = new HospitalFacility();
        facility.addComponent(equipment);
        facility.addComponent(room);

        facility.getDetails();
    }
    
    
}
