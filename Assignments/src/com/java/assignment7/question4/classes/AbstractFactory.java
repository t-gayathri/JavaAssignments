package com.java.assignment7.question4.classes;

import com.java.assignment7.question4.interfaces.Cycle;
import com.java.assignment7.question4.interfaces.CycleFactory;

public class AbstractFactory {
    public void createCycle(CycleFactory factory)
    {
        Cycle c = factory.getCycle();
        c.ride();
        c.numberOfWheels();
    }
}
