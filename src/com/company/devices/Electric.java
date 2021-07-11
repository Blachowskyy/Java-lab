package com.company.devices;
import com.company.Human;

public class Electric extends Car {
    public Electric(String producer, String model, Integer productionYear) {
        super(producer, model, productionYear);
        System.out.println("We have electric car");
    }
    @Override
    public void refuel() {
        System.out.println("Really you wanna tank electric car? xD");
    }
}