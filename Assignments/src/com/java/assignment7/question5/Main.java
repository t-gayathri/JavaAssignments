package com.java.assignment7.question5;

public class Main {
    public static void main(String[] args)
    {
        FirstClass firstClass = new FirstClass();
        FirstClass.FirstInner firstInner = firstClass.new FirstInner("hi");
    }
}
