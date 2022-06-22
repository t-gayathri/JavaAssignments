package com.java.assignment6;

import java.util.Scanner;

public class VampireNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v=0;
        long number,i,c=0,f=0,j=0,x,k,p,c1,c2,b[]=new long[100];
        System.out.println("Enter a number:");
        number=sc.nextLong();
        //Counting the number of digits
        for(i=number;i>0;i/=10)
            c++;
        if(c%2!=0)
            f=1;
        else
        {
            for(i=(int)Math.pow(10,c/2-1); i<(int)Math.pow(10,c/2);  i++)
            {
                if(number%i==0)  //i is one factor
                {
                    j=number/i;   //j is another factor
                    if(!(j>=Math.pow(10,c/2-1) && j<Math.pow(10,c/2)))
                        f=1;

                    x=i*(int)Math.pow(10,c/2)+j;

                    if(i%10==0 && j%10==0)
                    {
                        f=1;
                        break;
                    }
                    else //Check all digits are distinct or not
                    {
                        f=0;
                        for(k=number;k>0;k/=10)
                        {
                            c1=c2=0;
                            for(p=number;p>0;p/=10)
                            {
                                if(k%10==p%10)
                                    c1++;
                            }
                            for(p=x;p>0;p/=10)
                            {
                                if(k%10==p%10)
                                    c2++;
                            }
                            if(c1!=c2)
                            {
                                f=1;
                                break;
                            }
                        }
                        if(f==0)
                        {
                            int fl=0;
                            for(int z=0;z<v;z++)
                                if(b[z]==i || b[z]==j)
                                    fl=1;
                            if(fl==0)
                                b[v++]=i;

                        }
                    }
                }
            }

        }
        if(v==0)
            System.out.println("Not a vampire number");
        else
        {
            System.out.println("Vampire number factors are: ");
            for(int z=0;z<v;z++)
                System.out.println(b[z]+"\t"+(number/b[z]));
        }
    }
}
