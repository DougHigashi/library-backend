package br.com.doug.library.service;

import org.springframework.stereotype.Service;

import br.com.doug.library.entity.Author;
import br.com.doug.library.repository.AuthorRepository;

@Service
public class AuthorService {
    private AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author get(Long id) {
        var author = authorRepository.findById(id);

        return author.get();
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
