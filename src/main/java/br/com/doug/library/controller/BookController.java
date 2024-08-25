package br.com.doug.library.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.doug.library.entity.Book;
import br.com.doug.library.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // POST
    @PostMapping
    public Book create(@RequestBody Book book) {
        return bookService.create(book);
    }

    // GET
    @GetMapping("/{id}")
    public Book get(@PathVariable("id") Long id) {
        return bookService.get(id);
    }

    // PUT
    @PutMapping
    public Book put(@RequestBody Book book) {
        return bookService.update(book);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        bookService.delete(id);
    }
}
