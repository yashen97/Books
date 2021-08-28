package com.yashen.servicebreak.services.Impl;

import com.yashen.servicebreak.models.Author;
import com.yashen.servicebreak.repositories.AuthorRepo;

import com.yashen.servicebreak.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {  // extends is for extending a class. implements is for implementing an interface

    @Autowired
    AuthorRepo authorRepo;

    @Override
    public Author addOrUpdate(Author author){
        return authorRepo.save(author);
    }

    @Override
    public List<Author> addAllWrites(List<Author> authorList){
        return authorRepo.saveAll(authorList);
    }

    @Override
    public List<Author> getAuthors(){
        return authorRepo.findAll();
    }

    @Override
    public Optional<Author> getSelectedWrite(Long id){
        return authorRepo.findById(id);
    }

    @Override
    public void deleteWrite(Long id){
        authorRepo.deleteById(id);
    }
                                                                            // below code is experimental
    @Override
    public Author fetchAuthor(Long id) {
        return authorRepo.findById(id).get();
    }

    @Override
    public Author updateAuthorExtension(Long id, Author author) {
         Author authorFromDb=authorRepo.findById(id).get();


         if(Objects.nonNull(author.getName()) && !"".equalsIgnoreCase(author.getName())){
             authorFromDb.setName(author.getName());
         }

         if(Objects.nonNull(author.getCountry()) && !"".equalsIgnoreCase(author.getName())){
             authorFromDb.setCountry(author.getCountry());
         }

         return authorRepo.save(authorFromDb);
    }

    @Override
    public Author fetchAuthorByName(String authorName) {
        return authorRepo.findAuthorByNameIgnoreCase(authorName) ;
    }


}
