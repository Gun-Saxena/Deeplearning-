package com.library.Service;

import com.library.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService{
    @Autowired
    private BookRepository bookRepository;
    public void addBook(){
        System.out.println("Book Service");
        bookRepository.saveBook();
    }
}
