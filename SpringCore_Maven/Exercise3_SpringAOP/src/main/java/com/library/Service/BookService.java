package com.library.Service;

public class BookService {
    public void addBook(){
        System.out.println("Book Added!!");
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
