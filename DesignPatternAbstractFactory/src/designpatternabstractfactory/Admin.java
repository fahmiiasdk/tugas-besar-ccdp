/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternabstractfactory;

/**
 *
 * @author Asus
 */
public class Admin implements HumanResource {
    @Override
    public void manage() {
        System.out.println("Managing administrative tasks");
    }
}