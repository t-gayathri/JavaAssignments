package com.java.assignments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Assignment4 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value of n");
        int counter = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> combinedDate = new ArrayList<>();
        ArrayList<Date> signUpDate = new ArrayList<>();
        ArrayList<Date> currentDate = new ArrayList<>();

        for(int i=0; i<counter; i++)
        {
            String dates = scanner.nextLine();
            combinedDate.add(dates);
        }

        try
        {
            for(String s : combinedDate)
            {
                int index = s.indexOf(" ");
                String signUp = s.substring(0,index);
                String current = s.substring(index+1);

                Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(signUp);
                Date date2 = new SimpleDateFormat("dd-MM-yyyy").parse(current);

                signUpDate.add(date1);
                currentDate.add(date2);
            }
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }

        for(int i=0;i< signUpDate.size();i++)
        {
            if(signUpDate.get(i).before(currentDate.get(i))){
                int yearDifference = getDiffYears(signUpDate.get(i),currentDate.get(i));

                Date present  = addYears(signUpDate.get(i),yearDifference);

                Date lowerRange = subtractDays(present,30);

                Date upperRange = addDays(present,30);

                SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
                String lowerBound = formatter.format(lowerRange);
                String upperBound = formatter.format(upperRange);
                String currentBound = formatter.format(currentDate.get(i));


                if(currentDate.get(i).before(upperRange))
                {
                    System.out.println(lowerBound+" "+currentBound);
                }
                else
                {
                    System.out.println(lowerBound+" "+upperBound);
                }

            }
            else
            {
                System.out.println("No range");
            }
        }
    }

    public static int getDiffYears(Date first, Date last)
    {
        Calendar a = getCalendar(first);
        Calendar b = getCalendar(last);
        int diff = b.get(Calendar.YEAR) - a.get(Calendar.YEAR);

        return diff;
    }

    public static Calendar getCalendar(Date date)
    {
        Calendar cal = Calendar.getInstance(Locale.US);
        cal.setTime(date);
        return cal;
    }

    public static Date subtractDays(Date date, int days)
    {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        cal.add(Calendar.DATE, -days);

        return cal.getTime();
    }

    public static Date addDays(Date date, int days)
    {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        cal.add(Calendar.DATE, days);

        return cal.getTime();
    }

    public static Date addYears(Date date, int years)
    {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        cal.add(Calendar.YEAR, years);

        return cal.getTime();
    }
}
