package com.java.assignment7.question4.classes;

import com.java.assignment7.question4.interfaces.Cycle;

public class Tricycle implements Cycle {
    @Override
    public void ride()
    {
        System.out.println("Riding Tricycle");
    }
    @Override
    public void numberOfWheels()
    {
        System.out.println("Tricycle has 3 wheels.");
    }
}
