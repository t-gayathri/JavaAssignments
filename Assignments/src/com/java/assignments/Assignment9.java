package com.java.assignments;

public class Assignment9 {
    public static void main(String[] args) {
        String str1 = "hello i am good.";
        String str2 = "Hi i am fine.";
        String str3 = "Hi .";

        System.out.println(startWithCapital(str1));
        System.out.println(startWithCapital(str2));
        System.out.println(startWithCapital(str3));
    }

    public static Boolean startWithCapital(String str){
        if(str.matches("[A-Z][a-zA-Z\s]*[.]")){
            return true;
        }else{
            return false;
        }
    }
}
