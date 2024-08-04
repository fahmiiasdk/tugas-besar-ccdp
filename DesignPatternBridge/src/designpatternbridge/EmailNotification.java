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
public class EmailNotification implements Notification {
    @Override
    public void notify(String message) {
        System.out.println("Sending Email: " + message);
    }
}