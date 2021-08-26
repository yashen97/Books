package com.yashen.servicebreak.services;

import com.yashen.servicebreak.models.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    Author addOrUpdate(Author author);
    List<Author> addAllWrites(List<Author> authorList);
    public List<Author> getAuthors();
    public Optional<Author> getSelectedWrite(Long id);
    public void deleteWrite(Long id);
}
