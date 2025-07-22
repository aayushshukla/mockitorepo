package com.infosys.spring.mockito.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.infosys.spring.mockito.api.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	List<User> findByAddress(String address);

}
