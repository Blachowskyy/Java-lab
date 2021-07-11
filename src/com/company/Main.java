package com.company;
import com.company.Human;
import com.company.creatures.*;
import com.company.devices.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Diesel car1 = new Diesel("Volvo", "V70", 2000);
		Lpg car2 = new Lpg("Skoda", "Fabia", 1995);
		Electric car3 = new Electric("Tesla", "model 3", 2021);
		Human human1 = new Human("Wojciech", "Blacha");
		human1.setCar(car1,0);
		human1.setCar(car2, 1);
		human1.setCar(car3, 2);
		car2.refuel();
		car3.refuel();
		car2.turnOn();
		System.out.println("Cars in your garage:");
		human1.showCarsInGarage();
		System.out.println("Sorted cars in your garage:");
		human1.sortCarsInGarageByValue();
		human1.showCarsInGarage();
		Human human2 = new Human("Piotrek", "Piszczyglowa");
		human2.setCash(14000.0);
		car1.showOwnerList();
		System.out.println("Owner of the Volvo: " + car1.checkOwner().toString());
		car1.sell(human1,human2,4000.0);
		car1.sell(human1,human2,4000.0);
		car1.sell(human1,human2,4000.0);
		human1.showCarsInGarage();
		human2.showCarsInGarage();
		car2.sell(human1,human2, 35000.0);
		System.out.println();
		car1.showOwnerList();
		System.out.println("Owner of the Volvo: " + car1.checkOwner().toString());
		System.out.println();
		System.out.println("Wojtek was the owner of Volvo? " + car1.checkIsHumanOnTheOwnersList(human1));
		System.out.println("Wojtek selled the Volvo? " + car1.isHuman1SelltoHuman2Car(human1,human2));
		System.out.println("Volvo was selled to Wojtek by Piotr? " + car1.isHuman1SelltoHuman2Car(human2,human1));
		System.out.println("How many times the Volvo was selled? " + car1.countTransactions());
		System.out.println();
		car1.sell(human2, human1, 0.0);
		System.out.println("How many times the Volvo was selled? " + car1.countTransactions());
		System.out.println("The final owner of the Vovlo: " + car1.checkOwner().toString());
		car1.showOwnerList();
	}
}
