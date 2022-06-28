package com.java.assignment7.question4.classes;

import com.java.assignment7.question4.interfaces.Cycle;

public class Bicycle implements Cycle {
    @Override
    public void ride()
    {
        System.out.println("Riding Bicycle");
    }
    @Override
    public void numberOfWheels()
    {
        System.out.println("Bicycle has 2 wheels.");
    }
}
