package com.yashen.servicebreak.repositories;

import com.yashen.servicebreak.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author,Long> {

    public Author findAuthorByName(String name);

    public Author findAuthorByNameIgnoreCase(String name);
}
