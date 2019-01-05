package com.example.test.server.testserver.repository;

import org.springframework.data.jpa.repository.*;

import com.example.test.server.testserver.entity.TsUser;

public interface TsUserRepository extends JpaRepository<TsUser, Long> {
	TsUser findTsUserById(Long id);
	TsUser findByEmail(String email); 
}
