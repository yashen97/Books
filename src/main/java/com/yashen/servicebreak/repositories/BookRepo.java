package com.yashen.servicebreak.repositories;

import com.yashen.servicebreak.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Long> {
}
