package com.example.test.server.testserver.entity.converters;

import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TsUserAccountStatus {
	CREATED(1),
	CONFIRMED(2);
	
	private Integer id;
	
	public static TsUserAccountStatus getById(Integer id) {
	
		return Arrays.stream(values())
				.filter(x -> x.getId().equals(id))
				.findFirst()
				.orElse(null);
	}
	
}
