package br.com.doug.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.doug.library.entity.UserType;

public interface UserTypeRepository extends JpaRepository<UserType, Long> {

}
