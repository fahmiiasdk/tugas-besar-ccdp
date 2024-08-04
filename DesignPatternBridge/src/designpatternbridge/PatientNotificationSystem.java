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
public class PatientNotificationSystem extends HospitalManagementSystem {
    public PatientNotificationSystem(Notification notification) {
        super(notification);
    }

    @Override
    void sendNotification(String message) {
        notification.notify(message);
    }
}