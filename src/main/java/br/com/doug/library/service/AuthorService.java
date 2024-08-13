package br.com.doug.library.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.doug.library.entity.Author;
import br.com.doug.library.repository.AuthorRepository;

@Service
public class AuthorService {
    private AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Optional<Author> get(Long id) {
        return authorRepository.findById(id);
    }

    public Author create(Author author) {
        return authorRepository.save(author);
    }

    public Author update(Author author) {
        return authorRepository.save(null);
    }

    public void delete(long id) {
        authorRepository.deleteById(id);
    }

}
