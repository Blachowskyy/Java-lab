package com.company;
import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;
import java.util.Date;
public class Human {
    String firstName;
    String lastName;
    Integer age;
    String sex;
    private Double cash;
    final Integer DEFAULT_GARAGE_SIZE = 4;
    private Animal pet;
    Car[] Garage;
    public Car getCar(Integer garageNumber) {
        return this.Garage[garageNumber];
    }
    public void setCar(Car car, Integer garageNumber) {
        Garage[garageNumber] = car;
    }
    public Animal getAnimal() {
        return this.pet;
    }
    public void setAnimal(Animal pet) {
        this.pet = pet;
    }
    private Double salary;
    private Phone phone;
    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = 0.0;
        Garage = new Car[DEFAULT_GARAGE_SIZE];
    }
    public Human(String firstName, String lastName, Integer garageSize) {
        this.firstName = firstName;
        this.lastName = lastName;
        Garage = new Car[garageSize];
    }
    public Phone getPhone() {
        return this.phone;
    }
    public void setPhone(Phone phone) {
        this.phone = phone;
    }
    public Double getCash() {
        return this.cash;
    }
    public void addCash(Double cash) {
        this.cash += cash;
    }
    public void subtractCash(Double cash) {
        this.cash -= cash;
    }
    public void setCash(Double cash) {
        this.cash = cash;
    }
    public Integer getGarageSize() {
        return Garage.length;
    }
    public Double getSalary() {
        System.out.println("Date of check info about salary: " + new Date());
        System.out.println("Salary amount: " + this.salary);
        return salary;
    }
    public void setSalary(Double salary) {
        if (salary < 0.0) {
            System.out.println("Cannot set salary less than 0.");
        } else {
            System.out.println("Data was sent to accountant.");
            System.out.println("Please go to miss Hanna to pick up the contract");
            System.out.println("ZUS and US was informed about your salary. It's not good idea to hide your salary, they will control you");
            this.salary = salary;
        }
    }
    public Double getCarsValue() {
        Double sum = 0.0;
        for (Car car : Garage) {
            sum += car.getValue();
        }
        return sum;
    }

    public void sortCarsInGarageByValue() {
        Car temp;
        Integer i, j;
        for (i = 0; i < Garage.length - 1; i++) {
            for (j = 0; j < Garage.length - 1; j++) {
                if (Garage[j] == null || Garage[j].getYearOfProduction() == null) {
                    temp = Garage[j];
                    Garage[j] = Garage[j + 1];
                    Garage[j + 1] = temp;
                } else if (Garage[j + 1] == null || Garage[j + 1].getYearOfProduction() == null) {
                    continue;
                } else {
                    if (Garage[j].getYearOfProduction() < Garage[j + 1].getYearOfProduction()) {
                        temp = Garage[j];
                        Garage[j] = Garage[j + 1];
                        Garage[j + 1] = temp;
                    }
                }
            }
        }
    }

    public void showCarsInGarage() {
        for (Car car : Garage) {
            if (car == null) {
                System.out.println("miejsce w garażu puste");
            } else {
                System.out.println(car.toString());
            }
        }
    }

    public String toString() {
        return firstName + " " + lastName + " " + age;
    }

}