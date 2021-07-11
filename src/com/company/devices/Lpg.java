package com.company.devices;
import com.company.Human;

public class Lpg extends Car {
    public Lpg(String producer, String model, Integer productionYear){
        super(producer, model, productionYear);
        System.out.println("We have an LPG car :(");
    }
    @Override
    public void refuel() {
        System.out.println("Starting LPG (Lepszy Power Gamoniu) refueling process......");
        System.out.println(".10%");
        System.out.println("..20%");
        System.out.println("...30%");
        System.out.println("....40%");
        System.out.println(".....50%");
        System.out.println("......60%");
        System.out.println(".......70%");
        System.out.println("........80%");
        System.out.println(".........90%");
        System.out.println("..........100%");
        System.out.println("Your tank is full now :)");
    }

}
