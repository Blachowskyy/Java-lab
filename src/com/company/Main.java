package com.company;
import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.creatures.Pet;
import com.company.creatures.FarmAnimal;
public class Main {

    public static void main(String[] args) {
	    Pet dog = new Pet("dog");
	    FarmAnimal sheep = new FarmAnimal("sheep");
	    sheep.feed(3.0);
	    dog.feed();
	    sheep.beEaten();




    }
}
