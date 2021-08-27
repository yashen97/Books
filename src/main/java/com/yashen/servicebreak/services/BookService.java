package com.yashen.servicebreak.services;


import com.yashen.servicebreak.models.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    Book addOrUpdate(Book book);
    List<Book> addAllBooks(List<Book> bookList);
    Optional<Book> getABook(Long id);
    List<Book> getAllBooks();
    void deleteBook(Long id);

}
