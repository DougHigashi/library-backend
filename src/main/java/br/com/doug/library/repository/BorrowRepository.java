package br.com.doug.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.doug.library.entity.Borrow;

public interface BorrowRepository extends JpaRepository<Borrow, Long> {

}
