package com.company;
import java.util.List;
import java.util.ArrayList;
import com.company.devices.Phone;
import com.company.devices.Lpg;
import com.company.devices.Electric;
import com.company.devices.Diesel;
import com.company.creatures.Pet;
import com.company.creatures.FarmAnimal;
public class Main {

    public static void main(String[] args) {
	    Pet dog = new Pet("dog");
	    FarmAnimal sheep = new FarmAnimal("sheep");
	    sheep.feed(3.0);
	    dog.feed();
	    sheep.beEaten();

	    Diesel car1 = new Diesel("Volvo", "V70", 2000);
	    Lpg car2 = new Lpg("skoda", "Fabia", 1995);
	    Electric car3 = new Electric("Tesla", "model 3", 2021);

	    Human human = new Human();
	    human.firstName = "Wojciech";
	    human.lastName = "Blacha";
	    human.setCar(car1);
	    human.setCar(car2);
	    human.setCar(car3);
	    car1.refuel();
	    car2.refuel();
	    car3.refuel();


    }
}
