/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternprototype;

/**
 *
 * @author Asus
 */
public class DesignPatternPrototype {

    public static void main(String[] args) {
        ConcretePatientRecordPrototype original = new ConcretePatientRecordPrototype("Alice", "Flu");
        ConcretePatientRecordPrototype clone = (ConcretePatientRecordPrototype) original.clone();

        System.out.println("Original: " + original.getPatientName() + ", " + original.getMedicalHistory());
        System.out.println("Clone: " + clone.getPatientName() + ", " + clone.getMedicalHistory());
    }
    
}