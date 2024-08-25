package br.com.doug.library.service;

import org.springframework.stereotype.Service;

import br.com.doug.library.entity.Book;
import br.com.doug.library.repository.BookRepository;

@Service
public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book get(Long id) {
        var book = bookRepository.findById(id);

        return book.get();
    }

    public Book create(Book book) {
        return bookRepository.save(book);
    }

    public Book update(Book book) {
        return bookRepository.save(book);
    }

    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

}
