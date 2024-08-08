package br.com.doug.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.doug.library.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
