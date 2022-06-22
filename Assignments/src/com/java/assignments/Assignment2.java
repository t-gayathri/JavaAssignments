package com.java.assignments;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine().replaceAll("[^a-zA-Z]", " ");
        String s1 = s.replaceAll("\\s","");
        String s2 = s1.toLowerCase();
        Set<Character> set = new TreeSet<>();
        for(int i=0;i<s1.length();i++)
        {
            set.add(s2.charAt(i));
        }
        if(set.size()==26)
            System.out.println("it has all alphabets " + set.size());
        else
            System.out.println("it doesn't have all alphabets");
    }
}


/*
    Time complexity is the relation between input size and Running time(OPerations)
    O(n)

    Space Complexity
    O(1)

*/
