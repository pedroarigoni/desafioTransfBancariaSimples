package com.picpaysimples.picpaysimples.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.picpaysimples.picpaysimples.domain.user.User;
import com.picpaysimples.picpaysimples.domain.user.UserType;
import com.picpaysimples.picpaysimples.dtos.UserDTO;
import com.picpaysimples.picpaysimples.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public void validateTransaction(User sender, BigDecimal amount) throws Exception{
		if(sender.getUserType() == UserType.MERCHANT) {
			throw new Exception("Lojista não pode realizar envio.");
		}
		
		if(sender.getBalance().compareTo(amount) < 0) {
			throw new Exception("Saldo insuficiente.");
		}
	}

	public User findUserById(Long id) throws Exception{
		return this.repository.findUserById(id).orElseThrow(() -> new Exception("Usuário não encontrado."));
	}
	
	public User createUser(UserDTO data) {
		User newUser = new User (data);
		return newUser;
	}
	
	public void saveUser(User user) {
		this.repository.save(user);
	}

	public List<User> getAllUsers() {
		return this.repository.findAll();
		
	}
}
