package com.java.assignment6;

public class Constructor3 {
    public String string;

    public Constructor3(String string)
    {
        this.string=string;
        System.out.println("String is: " + this.string);
    }

    public static void main(String[] args)
    {
        Constructor3[] list = {new Constructor3("steve"),new Constructor3("austin")};

    }
}
