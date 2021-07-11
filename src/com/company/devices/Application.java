package com.company.devices;

public class Application {
    String name;
    String version;
    Double price;
    public Application(String name, String version, Double price){
        this.name = name;
        this.version = version;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return name + "version: " + version;
    }
}
