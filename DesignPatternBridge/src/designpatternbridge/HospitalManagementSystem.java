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
public abstract class HospitalManagementSystem {
    protected Notification notification;

    public HospitalManagementSystem(Notification notification) {
        this.notification = notification;
    }

    abstract void sendNotification(String message);
}