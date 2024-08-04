/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterncomposite;

/**
 *
 * @author Asus
 */
public class Room implements HospitalComponent {
    @Override
    public void getDetails() {
        System.out.println("Room details");
    }
}