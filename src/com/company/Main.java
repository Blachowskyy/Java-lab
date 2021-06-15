package com.company;
import com.company.devices.Car;
import com.company.devices.Phone;
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

		me.setCash(1500.0);
		me.addCash(1500.0);
		me.setAnimal(dog);
		Human colleague = new Human();
		colleague.firstName = "Piotrek";
		colleague.lastName = "Piszczygłowa";
		colleague.setCash(1500.00);

		System.out.println("My animal before buying: " + me.getAnimal().toString());
		if(colleague.getAnimal() != null){
			System.out.println("Friends animal before selling: " + colleague.getAnimal().toString());
		}else{
			System.out.println("My friend don't have animal");
		}

		me.getAnimal().sell(me,colleague,500.0);
		if(me.getAnimal() != null){
			System.out.println("My animal after buying: " + me.getAnimal().toString());
		}else{
			System.out.println("I don't have a pet");
		}

		System.out.println("My friends animal after selling: " + colleague.getAnimal().toString());

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

		Phone phone = new Phone("Xiaomi", "Mi10",2020);
		System.out.println(phone);
		phone.turnOn();
		car.turnOn();

		colleague.addCash(15000.0);
		System.out.println("My car before selling: " + me.getCar().toString());
		if(colleague.getCar() != null){
			System.out.println("My friend's car before buying: " + colleague.getCar().toString());
		}else{
			System.out.println("My friend don't have a car...");
		}

		me.getCar().sell(me,colleague,2000.0);
		if(me.getCar() != null){
			System.out.println("My car after selling: " + me.getCar().toString());
		}else{
			System.out.println("I don't have a car");
		}

		System.out.println("Friends car after buying:" + colleague.getCar().toString());

		me.setPhone(phone);

		System.out.println("My phone before selling: " + me.getPhone().toString());
		if(colleague.getPhone() != null){
			System.out.println("Friend's phone before buying: " + colleague.getPhone().toString());
		}else{
			System.out.println("Friend don't have a phone...");
		}

		me.getPhone().sell(me,colleague,600.0);
		if(me.getCar() != null){
			System.out.println("My phone after selling: " + me.getPhone().toString());
		}else{
			System.out.println("I don't have a phone now");
		}

		System.out.println("Friend's phone after buying: " + colleague.getPhone().toString());




    }
}
