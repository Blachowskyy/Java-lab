package com.company;

public class Car {

    final String producer;
    final String model;
    public Integer year;
    public String fuelType;
    public Integer mileage;
    public Integer horsePower;
    public Double engineCapacity;

    public Car(String producer,String model) {
        this.producer = producer;
        this.model = model;
    }
}
