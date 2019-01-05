package com.example.test.server.testserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.server.testserver.entity.dto.HealthParamRequest;
import com.example.test.server.testserver.entity.dto.TsUserRegisterRequest;
import com.example.test.server.testserver.services.TsUserService;

@RestController
@RequestMapping("/user")
public class TsUserController {

	@Autowired
	private TsUserService userService;
	
	@PostMapping("/registration")
	public void registration(@RequestBody TsUserRegisterRequest userRegisterRequest) {
		userService.register(userRegisterRequest);
	}
	
	@PostMapping("/health_parameters")
	public void healthParam(@RequestHeader Long userId, @RequestBody HealthParamRequest healthParamRequest) {
		userService.saveHealthParam(userId, healthParamRequest);
	}
}
