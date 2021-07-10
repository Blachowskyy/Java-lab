package com.company.creatures;

public class FarmAnimal extends Animal implements Edbile{

    public FarmAnimal(String spieces){
        super(spieces);
    }
    private Double weight;

    @Override
    public void beEaten(){
        System.out.println("Animal has been eaten!!!");
        this.weight = 0.0;
    }
}
