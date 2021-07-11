package com.company.creatures;
import com.company.Human;
import com.company.selleable;

public abstract class Animal implements selleable, Feedable {
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
            case "sheep":
                this.weight = 120.0;
            default:
                this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }
    public void feed(){
        if(this.weight>0){
            this.weight += 1;
            System.out.println("Thank you for feeding buddy, my weight is now: " + this.weight);
        }
        else{
            System.out.println("Don't feed me. I'm already dead you dumbass");
        }
    }
    public void feed(Double feedWeight){
        if(this.weight>0){
            this.weight += feedWeight;
            System.out.println("Thank you for the dinner, my actual weight is: " + this.weight);
        }else{
            System.out.println("You can't feed dead animal you bastard!!! ");
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
    public String toString() {
        return spieces + " " + weight + " " + name;
    }
    @Override
    public void sell(Human seller, Human buyer, Double price) {
    }
}
