package org.example.librarymanagementsystem;

import org.example.librarymanagementsystem.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLException;

@SpringBootApplication
public class LibraryManagementSystemApplication {

    public static void main(String[] args) throws SQLException {
        ApplicationContext context = SpringApplication.run(LibraryManagementSystemApplication.class, args);
        BookService bookService = context.getBean(BookService.class);
        bookService.getAllBooks();
    }
}
