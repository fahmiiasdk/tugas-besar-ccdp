/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternbridge;

/**
 *
 * @author Asus
 */
public class DesignPatternBridge {

    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification();
        Notification smsNotification = new SMSNotification();

        HospitalManagementSystem emailSystem = new PatientNotificationSystem(emailNotification);
        HospitalManagementSystem smsSystem = new PatientNotificationSystem(smsNotification);

        emailSystem.sendNotification("Your appointment is scheduled.");
        smsSystem.sendNotification("Your appointment is scheduled.");
    }
    
}
