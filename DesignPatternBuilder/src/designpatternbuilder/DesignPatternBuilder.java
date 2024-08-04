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
public class DesignPatternBuilder {

    public static void main(String[] args) {
        HospitalBuilder builder = new ConcreteHospitalBuilder();
        HospitalManager manager = new HospitalManager();
        manager.setBuilder(builder);
        manager.construct();

        PatientRecord patientRecord = builder.getPatientRecord();
        AppointmentSchedule appointmentSchedule = builder.getAppointmentSchedule();

        System.out.println("Patient Record: " + patientRecord.getPatientName() + ", " + patientRecord.getMedicalHistory());
        System.out.println("Appointment Schedule: " + appointmentSchedule.getDate() + ", " + appointmentSchedule.getTime());
    }
    
}
