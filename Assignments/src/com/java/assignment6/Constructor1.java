package com.java.assignment6;

public class Constructor1 {
    public Constructor1(int num1,int num2)
    {
        this(10);
        System.out.println("Constructor with two parameters: " + num1 + " and " + num2);
    }
    public Constructor1(int number)
    {
        System.out.println("Constructor with one parameter: " + number);
    }

    public static void main(String[] args)
    {
        Constructor1 constructor1 = new Constructor1(10,20);
    }
}
