package com.java.assignment10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SList<Integer> sl = new SList<>();
        int exit = 1;
        while (exit == 1)
        {
            System.out.println("Select the option");
            System.out.println("1 : insert the data");
            System.out.println("2 : display the data");
            System.out.println("3 : delete the data");
            System.out.println("4 : exit");
            String option = sc.next();
            switch (option)
            {
                case "1" :
                    System.out.println("enter the data that you want to insert");
                    int d = sc.nextInt();
                    sl.insert(d);
                    break;
                case "2" :
                    System.out.println("Data in the list: ");
                    sl.showData();
                    break;
                case "3" :
                    System.out.println("Enter the data that you want to delete");
                    int d1 = sc.nextInt();
                    sl.removeData(d1);
                    break;
                case "4" :
                    exit = 0;
                    break;
                default:
                    System.out.println("Enter the valid option");
                    break;
            }
        }
    }

}
