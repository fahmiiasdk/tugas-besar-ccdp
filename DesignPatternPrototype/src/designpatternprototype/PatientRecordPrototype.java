/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternprototype;

/**
 *
 * @author Asus
 */
public abstract class PatientRecordPrototype implements Cloneable {
    @Override
    public abstract PatientRecordPrototype clone();
}