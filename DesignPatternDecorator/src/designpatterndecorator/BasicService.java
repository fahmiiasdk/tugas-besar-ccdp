/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterndecorator;

/**
 *
 * @author Asus
 */
public class BasicService implements MedicalService {
    @Override
    public String getDescription() {
        return "Basic Medical Service";
    }
}