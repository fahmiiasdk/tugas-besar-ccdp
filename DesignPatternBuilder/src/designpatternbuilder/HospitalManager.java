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
public class HospitalManager {
    private HospitalBuilder builder;

    public void setBuilder(HospitalBuilder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPatientRecord();
        builder.buildAppointmentSchedule();
    }
}