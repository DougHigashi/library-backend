package br.com.doug.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.doug.library.entity.Return;

public interface ReturnRepository extends JpaRepository<Return, Long> {

}
