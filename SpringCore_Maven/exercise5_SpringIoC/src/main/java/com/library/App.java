package com.library;

import com.library.Service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args) {

        ApplicationContext con=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService service=con.getBean("bookService",BookService.class);
        service.addBook();
    }
}
