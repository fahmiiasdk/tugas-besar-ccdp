/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternbuilder;

/**
 *
 * @author Asus
 */
public class PatientRecord {
    private String patientName;
    private String medicalHistory;

    // Getters and Setters
    public void setPatientName(String name) { this.patientName = name; }
    public void setMedicalHistory(String history) { this.medicalHistory = history; }

    
    public String getPatientName() {
		return patientName;
	}
    
    public String getMedicalHistory() {
		return medicalHistory;
	}
}