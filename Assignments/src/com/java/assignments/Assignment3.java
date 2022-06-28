package com.java.assignments;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Assignment3 {
    public static void pingCommand(String command) {

        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

            String lines = "";
            while ((lines = inputStream.readLine()) != null) {
                System.out.println(lines);
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        String ip;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the IP address : ");
        ip =in.nextLine();
        pingCommand("ping " + ip);


    }
}
