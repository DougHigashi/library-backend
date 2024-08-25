package br.com.doug.library.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.doug.library.entity.Author;
import br.com.doug.library.service.AuthorService;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    // POST
    @PostMapping
    public Author create(@RequestBody Author author) {
        return authorService.create(author);
    }

    // GET
    @GetMapping("/{id}")
    public Author get(@PathVariable("id") Long id) {
        return authorService.get(id);
    }

    // PUT
    @PutMapping
    public Author put(@RequestBody Author author) {
        return authorService.update(author);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        authorService.delete(id);
    }

}
