package br.com.doug.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.doug.library.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
