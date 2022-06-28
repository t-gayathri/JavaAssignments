package com.java.assignment7.question5;

    public class FirstClass {
        class FirstInner
        {
            FirstInner(String str)
        {
            System.out.println(str);
        }
        }


    }

    class SecondOuter extends FirstClass{
        class SecondInner extends FirstInner{

            SecondInner(String str) {
                super(str);
            }
        }
    }
