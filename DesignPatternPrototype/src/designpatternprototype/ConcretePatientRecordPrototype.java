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
public class ConcretePatientRecordPrototype extends PatientRecordPrototype {
    private String patientName;
    private String medicalHistory;

    public ConcretePatientRecordPrototype(String name, String history) {
        this.patientName = name;
        this.medicalHistory = history;
    }

    @Override
    public PatientRecordPrototype clone() {
        return new ConcretePatientRecordPrototype(patientName, medicalHistory);
    }

    // Getters and Setters

    public String getPatientName() {
		return patientName;
	}
    
    public String getMedicalHistory() {
		return medicalHistory;
	}
}