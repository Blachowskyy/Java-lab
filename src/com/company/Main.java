package com.company;

public class Main {

    public static void main(String[] args) {
	    Animal dog = new Animal("dog");
	    dog.name = "Szarik";
	    dog.feed();
	    dog.takeForAWalk();
	    dog.takeForAWalk();
	    dog.takeForAWalk();
	    dog.takeForAWalk();
	    dog.feed();

	    Human me = new Human();
	    me.firstName = "Wojciech";
	    me.lastName = "Blacha";
	    me.sex = "male";
	    me.age = 26;

	    Car car = new Car("Volvo", "V70");
	    me.car = car;
	    car.year = 2000;
	    car.fuelType = "diesel";
	    car.mileage = 375214;
	    car.horsePower = 235;
	    car.engineCapacity = 2.5;

	    System.out.println(me.firstName + " " + me.lastName + " " + "have" + " " + me.car.producer + " " + me.car.model + " " + me.car.year);

		me.setSalary(1600.0);
		me.setSalary(-160.0);
		me.getSalary();
		me.setSalary(7000.0);
		me.getSalary();


    }
}
