package com.example.test.server.testserver.entity.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class HealthParamRequest {
	
	private float temperature;
	private float levelSugar;
	private int systolic;
	private int diastolic;
}
