package com.java.assignment7.question4.classes;

import com.java.assignment7.question4.interfaces.Cycle;

public class Unicycle implements Cycle {
    @Override
    public void ride()
    {
        System.out.println("Riding Unicycle");
    }

    @Override
    public void numberOfWheels()
    {
        System.out.println("Unicycle has 1 wheel.");
    }
}
