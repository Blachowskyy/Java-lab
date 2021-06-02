package com.company.devices;

public class Car {

    final String producer;
    final String model;
    public Integer year;
    public String fuelType;
    public Integer mileage;
    public Integer horsePower;
    public Double engineCapacity;
    public Double valueCar;

    public Car(String producer,String model) {
        this.producer = producer;
        this.model = model;
    }
    public boolean equals(Object o){
        if (this == o) {
            return true;
        }
        else if (o == null || getClass() != o.getClass()){
            return false;
        }
        Car car = (Car) o;
        return producer == car.producer &&
                model == car.model;
    }
    public String toString(){
        return producer+" "+model+" "+valueCar;
    }
}
