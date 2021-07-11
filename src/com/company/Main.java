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
		System.out.println("Cars in your garage:");
		human1.showCarsInGarage();
		System.out.println("Sorted cars in your garage:");
		human1.sortCarsInGarageByValue();
		human1.showCarsInGarage();
		Human human2 = new Human("Piotrek", "Piszczyglowa");
		human2.setCash(14000.0);
		car1.sell(human1,human2,4000.0);
		car1.sell(human1,human2,4000.0);
		car1.sell(human1,human2,4000.0);
		human1.showCarsInGarage();
		human2.showCarsInGarage();
		car2.sell(human1,human2, 35000.0);
	}
}
