package com.java.assignment7.question1;

public class Hamster extends Rodent{
    public Hamster(){
        System.out.println("This is a Hamster.");
    }

    @Override
    public void eat()
    {
        System.out.println("Hamster is eating.");
    }
}
