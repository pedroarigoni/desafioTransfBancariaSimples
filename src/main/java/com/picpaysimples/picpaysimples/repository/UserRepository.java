package com.picpaysimples.picpaysimples.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.picpaysimples.picpaysimples.domain.user.User;

public interface UserRepository extends JpaRepository<User, Long>{ //JpaRepository <recebe tabela que será manipulada (User) e o tipo da PK (Long)>
	Optional<User> findUserByDocument(String Document);
	Optional<User> findUserById(Long id);
}
