package com.java.assignment7.question1;

public class Mouse extends Rodent{
    public Mouse()
    {
        System.out.println("This is a Mouse.");
    }

    @Override
    public void eat()
    {
        System.out.println("Mouse is eating.");
    }
}
