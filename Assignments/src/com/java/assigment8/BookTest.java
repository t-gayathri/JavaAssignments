package com.java.assigment8;

public class BookTest {
    public static void main(String[] args) {
        BookLibrary bookLibrary = new BookLibrary();
        try{
            bookLibrary.findBook("Friends");
        }catch(BookNotFoundException exception){
            System.out.println(exception);
        }finally{
            System.out.println("Finally block will print at least once");
        }
    }
}
