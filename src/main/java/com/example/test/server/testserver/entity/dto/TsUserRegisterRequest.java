package com.example.test.server.testserver.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TsUserRegisterRequest {
	
	private String email;
	
	private String name;
	
	private String lastName;
}
