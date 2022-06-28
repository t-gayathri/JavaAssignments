package com.java.assignment6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VampireNumber {
        public static void main(String[] args) {
            ArrayList<Integer> listOfVampireNumbers=new ArrayList<>();
            for(int i=1260;listOfVampireNumbers.size()<100;i++)
                if(vampireFactors(i))
                    listOfVampireNumbers.add(i);
            for(int i=0;i<listOfVampireNumbers.size();i++)
                System.out.println("Vampire number "+(i+1)+" is "+listOfVampireNumbers.get(i));
        }

        public static boolean vampireOccurances(int num1,int num2,int number){
            String number1=String.valueOf(num1);
            String number2=String.valueOf(num2);
            String vampire=String.valueOf(number);
            if((number1.length()!=number2.length()) || (number1.endsWith("0") && number2.endsWith("0")))
                return false;
            String combinedNUmber=number1+number2;
            char tempArray[] = combinedNUmber.toCharArray();
            Arrays.sort(tempArray);
            char vamArray[]=vampire.toCharArray();
            Arrays.sort(vamArray);
            combinedNUmber=new String(tempArray);
            vampire=new String(vamArray);
            if(combinedNUmber.equals(vampire)){
                return true;
            }

            return false;
        }

        public static boolean vampireFactors(int number){
            int factor1,factor2;
            if(Integer.toString(number).length()%2!=0)
                return false;
            for(int k=1;k*k<=number;k++){
                if(number%k==0) {
                    factor1 = k;
                    factor2 = number / factor1;
                    if(vampireOccurances(factor1, factor2,number))
                        return true;
                }
            }
            return false;
        }
}
