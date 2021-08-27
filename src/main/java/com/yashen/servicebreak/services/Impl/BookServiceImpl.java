package com.yashen.servicebreak.services.Impl;

import com.yashen.servicebreak.models.Book;
import com.yashen.servicebreak.repositories.BookRepo;
import com.yashen.servicebreak.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepo bookRepo;

    @Override
    public Book addOrUpdate(Book book){
        return bookRepo.save(book);
    }

    @Override
    public List<Book> addAllBooks(List<Book> bookList){
        return bookRepo.saveAll(bookList);
    }

    @Override
    public Optional<Book> getABook(Long id){
        return bookRepo.findById(id);
    }

    @Override
    public List<Book> getAllBooks(){
        return bookRepo.findAll();
    }

    @Override
    public void deleteBook(Long id){
        bookRepo.deleteById(id);
    }
}
