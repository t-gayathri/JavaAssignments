package com.java.assignment7.question4.classes;

public class TestFactory {
    public static void main(String[] args)
    {

        AbstractFactory factory = new AbstractFactory();

        factory.createCycle(new UnicycleFactory());

        factory.createCycle(new BicycleFactory());

        factory.createCycle(new TricycleFactory());

    }
}
