package org.example.librarymanagementsystem.controller;

import org.example.librarymanagementsystem.model.Book;
import org.example.librarymanagementsystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@Controller
public class LibraryController {

    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("allbooks")
    public String allbooks(Model model) throws SQLException {
        List<Book> books = bookService.getAllBooks();
        model.addAttribute("books", books);
        return "allbooks";
    }
    @RequestMapping("form")
    public String form() {
        System.out.println(" in form ");
        return "form";
    }

    @PostMapping("bookadded")
    public String bookadded(@ModelAttribute Book book, Model model) throws SQLException {
        System.out.println(" in book added");
        model.addAttribute("book", book);
        bookService.addBook(book);
        return "bookadded";
    }

}
