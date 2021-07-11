package com.company.devices;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;
import com.company.Human;
import com.company.selleable;

public abstract class Car extends Device implements selleable {
    final String producer;
    final String model;
    public Double mileage;
    public Double value;
    List<Human> ownersList = new ArrayList<Human>();
    public Car(String producer, String model, Integer productionYear) {
        this.producer = producer;
        this.model = model;
        mileage = 0.0;
        yearOfProduction = productionYear;
        Integer year = Calendar.getInstance().get(Calendar.YEAR);
        value = 100000.0 - (Double.valueOf((year - yearOfProduction) * 3) * 1000);
    }
    public Double getValue() {
        return value;
    }
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return producer == car.producer &&
                model == car.model;
    }
    abstract void refuel();
    public String toString() {
        return producer + " " + model + " " + this.value;
    }
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("SELLING ");
        boolean isSellerHasACar = false;
        boolean isBuyerHasFreeGarage = false;
        boolean isBuyerHasMoney = false;
        Integer sellerGarageIndex = null, buyerGarageIndex = null;
        for (Integer i = 0; i < seller.getGarageSize(); i++) {
            if (seller.getCar(i) == this) {
                isSellerHasACar = true;
                sellerGarageIndex = i;
                break;
            }
        }
        if (isSellerHasACar) {
            System.out.println("It's your car -- you can sell it right away :D");
        } else {
            System.out.println("Really you want to scam people? You don't have this car O.o");
        }
        for (Integer i = 0; i < buyer.getGarageSize(); i++) {
            if (buyer.getCar(i) == null) {
                isBuyerHasFreeGarage = true;
                buyerGarageIndex = i;
                break;
            }
        }
        if (isBuyerHasFreeGarage) {
            System.out.println("There's a empty space for that car :D");
        } else {
            System.out.println("There's no space left in the garage...");
        }
        if (buyer.getCash() >= price) {
            isBuyerHasMoney = true;
            System.out.println("Buyer can afford this car :)");
        } else {
            System.out.println("The buyer have not enough money");
        }
        if (isBuyerHasFreeGarage && isBuyerHasMoney && isSellerHasACar && checkOwner() == seller) {
            buyer.setCar(this, buyerGarageIndex);
            seller.setCar(null, sellerGarageIndex);
            System.out.println("Car have been passed");
            buyer.subtractCash(price);
            seller.addCash(price);
            System.out.println("Money transfer is complete");
            System.out.println("Transaction complete, the car is now in buyers garage: " + buyerGarageIndex);
        }
    }
    public void addNewOwner(Human owner){
        this.ownersList.add(owner);
        System.out.println("Dodano nowego właściciela do listy właścicieli pojazdu.");
    }
    public Human checkOwner(){
        return ownersList.get(ownersList.size()-1);
    }
    public boolean checkIsHumanOnTheOwnersList(Human owner){
        return ownersList.contains(owner);
    }
    public boolean isHuman1SelltoHuman2Car(Human h1, Human h2){
        if(checkIsHumanOnTheOwnersList(h1) && checkIsHumanOnTheOwnersList(h2)){
            Integer indexH1 = ownersList.indexOf(h1);
            Integer indexH2 = ownersList.indexOf(h2);
            if(indexH1+1 == indexH2){
                return true;
            }else return false;
        }else return false;
    }
    public Integer countTransactions(){
        if (ownersList.size() == 0 || ownersList.size() == 1){
            return 0;
        }else{
            return ownersList.size() - 1;
        }
    }
    public void showOwnerList(){
        System.out.println("----Owners List:");
        for(Human h : ownersList){
            System.out.println(h.toString());
        }
    }
    @Override
    public void turnOn() {
        System.out.println(producer + " " + model + " " + "is turned on now");
    }
}