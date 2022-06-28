package com.java.assigment8;

public class BookLibrary {
    public BookLibrary findBook(String bookname) throws BookNotFoundException {
        if(bookname.equals("Stranger")){
            return new BookLibrary();
        }else{
            throw new BookNotFoundException("The book you are looking for is not found "+bookname);
        }
    }
}
