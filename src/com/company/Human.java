package com.company;
import com.company.devices.Car;
import java.util.Date;

public class Human {

    String firstName;
    String lastName;
    Integer age;
    String sex;
    private Double salary;

    public Double getSalary(){

        System.out.println("Date when you checked about your salary: " + new Date());
        System.out.println("Your salary current level: " +this.salary);
        return salary;
    }

    public void setSalary(Double salary){
        if (salary < 0.0){
            System.out.println("Nobody will work for free!!!");
        }
        else{
            System.out.println("the accountants already know");
            System.out.println("Do not forget to pick up the annex to the contract from Mrs. Hanna");
            System.out.println("A message from ZUS and US: We already know how much you earn, do not hide it because you will lose everything");
            this.salary = salary;
        }
    }

    Animal pet;
    private Car car;

    public Car getCar(){
        return this.car;
    }
    public void buyCar(Car car){
        if(this.salary > car.valueCar){
            System.out.println("You can afford that car. It's now yours!");
            this.car = car;
        }
        else if (this.salary > car.valueCar/12){
            System.out.println("You bought a car on credit (no trudno :P)");
            this.car = car;
        }
        else {
            System.out.println("Your's salary is to low. You can buy it when you raise it :)");
        }



    }
    public String toString(){
        return firstName+" "+lastName;
    }

}
