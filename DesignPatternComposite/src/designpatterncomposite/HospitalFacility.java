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
import java.util.ArrayList;
import java.util.List;

public class HospitalFacility implements HospitalComponent {
    private List<HospitalComponent> components = new ArrayList<>();

    public void addComponent(HospitalComponent component) {
        components.add(component);
    }

    public void removeComponent(HospitalComponent component) {
        components.remove(component);
    }

    @Override
    public void getDetails() {
        for (HospitalComponent component : components) {
            component.getDetails();
        }
    }
}