package com.yashen.servicebreak.controllers;

import com.yashen.servicebreak.models.Book;
import com.yashen.servicebreak.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("book")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/post")
    public Book postABook(@RequestBody Book book){
        return bookService.addOrUpdate(book);
    }

    @PostMapping("/postall")
    public List<Book> postAllBooks(@RequestBody List<Book> bookList){
        return bookService.addAllBooks(bookList);
    }

    @PutMapping("/update")
    public Book updateBook(@RequestBody Book book){
        return bookService.addOrUpdate(book);
    }

    @GetMapping("/get/{id}")
    public @ResponseBody Optional<Book> getBook(@PathVariable Long id){
        return bookService.getABook(id);
    }

    @GetMapping("getall")
    public @ResponseBody List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @DeleteMapping("delete/{id}")
    public String delete(@PathVariable Long id){
        try{
            bookService.deleteBook(id);
            return "204 Deleted";
        }catch (Exception e){
            e.printStackTrace();
            return "Book not found";
        }

    }
}
