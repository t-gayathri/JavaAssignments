package com.java.assignment7.question2;

public class Main {
    public static void main(String[] args) {
        Cycle[] cycles = new Cycle[]{new Unicycle(),new Bicycle(),new Tricycle()};

        for(Cycle cycle:cycles)
        {
            cycle.balance();
        }

        Cycle c1 = new Unicycle();
        Unicycle uni = (Unicycle) c1;
        uni.balance();

        Cycle c2 = new Bicycle();
        Bicycle bi = (Bicycle) c2;
        bi.balance();

        Cycle c3 = new Tricycle();
        Tricycle tri = (Tricycle) c3;
        tri.balance();
    }
}
