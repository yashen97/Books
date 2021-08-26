package com.yashen.servicebreak.controllers;

import com.yashen.servicebreak.models.Author;
import com.yashen.servicebreak.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("author")
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @PostMapping("/post")
    public Author postAuthor(@RequestBody Author author){
        return authorService.addOrUpdate(author);
    }

    @PostMapping("/postall")
    public List<Author> postAllAuthors(@RequestBody List<Author> authorList){
        return authorService.addAllWrites(authorList);
    }

    @GetMapping("/get/{id}")
    public Optional<Author> getSelectedAuthor(@PathVariable Long id){
        return authorService.getSelectedWrite(id);
    }

    @GetMapping("/getall")
    public @ResponseBody List<Author> getAllAuthors(){
        return authorService.getAuthors();
    }

    @PutMapping("/update")
    public Author updateAuthor(@RequestBody Author author){
        return authorService.addOrUpdate(author);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAuthor(@PathVariable Long id){
        authorService.deleteWrite(id);
        return "204 Deleted";
    }
}
