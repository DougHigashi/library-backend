package br.com.doug.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.doug.library.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
