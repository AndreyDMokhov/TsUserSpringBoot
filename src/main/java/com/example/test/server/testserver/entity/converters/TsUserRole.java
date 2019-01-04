package com.example.test.server.testserver.entity.converters;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TsUserRole {
	GUEST(1),
	REGULAR(2),
	ADMIN(3);
	
	private Integer id;
	
	public static TsUserRole getById(Integer id) {
		return Arrays.stream(values())
				.filter(x -> x.getId().equals(id))
				.findFirst()
				.orElse(GUEST);
	}
}
