package com.example.library.controller;

import com.example.library.model.Book;
import com.example.library.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService service = new BookService();

    @PostMapping
    public String addBook(@RequestBody Book book) {
        service.addBook(book);
        return "Book added successfully";
    }

    @GetMapping
    public List<Book> getBooks() {
        return service.getAllBooks();
    }
}
