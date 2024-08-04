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
public interface HospitalBuilder {
    void buildPatientRecord();
    void buildAppointmentSchedule();
    PatientRecord getPatientRecord();
    AppointmentSchedule getAppointmentSchedule();
}