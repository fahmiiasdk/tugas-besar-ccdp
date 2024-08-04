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
public class ConcreteHospitalBuilder implements HospitalBuilder {
    private PatientRecord patientRecord;
    private AppointmentSchedule appointmentSchedule;

    public ConcreteHospitalBuilder() {
        this.patientRecord = new PatientRecord();
        this.appointmentSchedule = new AppointmentSchedule();
    }

    @Override
    public void buildPatientRecord() {
        patientRecord.setPatientName("John Doe");
        patientRecord.setMedicalHistory("Healthy");
    }

    @Override
    public void buildAppointmentSchedule() {
        appointmentSchedule.setDate("2024-08-03");
        appointmentSchedule.setTime("10:00 AM");
    }

    @Override
    public PatientRecord getPatientRecord() {
        return this.patientRecord;
    }

    @Override
    public AppointmentSchedule getAppointmentSchedule() {
        return this.appointmentSchedule;
    }
}