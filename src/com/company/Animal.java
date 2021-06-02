package com.company;
import java.io.File;

public class Animal {

    final String spieces;
    private Double weight;
    public String name;

    static public final Double DEFAULT_ANIMAL_WEIGHT = 1.0;

    public Animal(String spieces){

        this.spieces = spieces;
        switch (spieces){

            case "dog":
                this.weight = 35.0;
                break;
            case "cat":
                this.weight = 7.0;
                break;
            case "hamster":
                this.weight = 0.6;
            default:
                this.weight = DEFAULT_ANIMAL_WEIGHT;

        }
    }

    void feed(){

        if(this.weight>0){
            this.weight += 1;
            System.out.println("Thank you for feeding buddy, my weight is now: " + this.weight);
        }
        else{
            System.out.println("Don't feed me. I'm already dead you dumbass");
        }
    }

    void takeForAWalk(){

        if(this.weight > 0){
            this.weight -= 1;
            System.out.println("Thank you for nice walking, my weight is now: " + this.weight);
        }
        else{
            System.out.println("You are crazy, how dead pet can walk?");
        }
    }
}
