package com.company.devices;

public class Phone extends Device {
    Double memory;
    Double screenSize;


    public Phone(String producer, String model, Integer yearOfProduction){
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }
    @Override
    public void turnOn(){
        System.out.println("This phone "+producer+" "+model+" is now turned on.");
    }
}
