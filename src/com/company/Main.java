package com.company;
import com.company.devices.Car;
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
	    Car car2 = new Car("Volvo", "V70");
	    Car car3 = new Car("Audi", "RS5");
	    car.valueCar = 2000.0;
	    car2.valueCar = 2000.0;


	    me.setSalary(4000.0);
		me.getCar();
		me.buyCar(car);

		System.out.println(car.equals(car2));
		System.out.println(car.equals(car3));
		System.out.println(car);
		System.out.println(car2);
		System.out.println(me);
		System.out.println(dog);


    }
}
