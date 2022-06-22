package com.java.assignment7.question4.classes;

import com.java.assignment7.question4.interfaces.Cycle;
import com.java.assignment7.question4.interfaces.CycleFactory;

public class UnicycleFactory implements CycleFactory {
    @Override
    public Cycle getCycle()
    {
        return new Unicycle();
    }
}
