package com.example.test.server.testserver.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Pressure {
	@Column(name="SYSTOLIC")
	private int systolic;
	@Column(name = "DIASTOLIC")
	private int diastolic;
	
}
