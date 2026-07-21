package com.library.Service;

import com.library.Repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }
    public void addBook(){
        System.out.println("Book Service!!");
        bookRepository.saveBook();
    }
}
