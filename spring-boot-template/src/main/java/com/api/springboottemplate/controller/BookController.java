package com.api.springboottemplate.controller;

import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.api.swaggercodgen.api.BookApi;
import com.api.swaggercodgen.model.Book;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController implements BookApi{

    @Override
    public ResponseEntity<String> addBook(Book book) {
        return ResponseEntity.ok(book.getTitle()+" is added");
    }

    @Override
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book().title("Name of the Wind").author("Patrick"));
        bookList.add(new Book().title("Mistborn").author("Brandon"));
        return ResponseEntity.ok(bookList);
    }
}
