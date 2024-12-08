package org.example.librarymanagementsystem.service;

import org.example.librarymanagementsystem.model.Book;
import org.example.librarymanagementsystem.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class BookService {

    private BookRepo bookRepo;

    public BookRepo getBookRepo() {
        return bookRepo;
    }

    @Autowired
    public void setBookRepo(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public void addBook(Book book) throws SQLException {
        bookRepo.addBook(book);
    }

    public List<Book> getAllBooks() throws SQLException {
        return bookRepo.getAllBooks();
    }
}
