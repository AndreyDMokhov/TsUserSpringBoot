package com.example.test.server.testserver.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.server.testserver.entity.dto.TsUserRegisterRequest;

@RestController
@RequestMapping("/user")
public class TsUserController {

	@PostMapping("/registration")
	public void registration(@RequestBody TsUserRegisterRequest userRegisterRequest) {
		
	}
}
