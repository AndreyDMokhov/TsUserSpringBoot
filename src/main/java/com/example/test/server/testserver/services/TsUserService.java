package com.example.test.server.testserver.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.server.testserver.entity.Pressure;
import com.example.test.server.testserver.entity.TsUser;
import com.example.test.server.testserver.entity.TsUserHealthParam;
import com.example.test.server.testserver.entity.dto.HealthParamRequest;
import com.example.test.server.testserver.entity.dto.TsUserRegisterRequest;
import com.example.test.server.testserver.repository.HealthParamRepository;
import com.example.test.server.testserver.repository.TsUserRepository;

@Service
public class TsUserService {
	
	@Autowired
	private TsUserRepository userRepository;
	
	@Autowired
	private HealthParamRepository healthParamRepository;

	public void register(TsUserRegisterRequest registerRequest) {
		TsUser user = userRepository.findByEmail(registerRequest.getEmail());
		if(user != null) {
			throw new RuntimeException("The email is exist yet");
		}
		user = TsUser.builder()
				.email(registerRequest.getEmail())
				.name(registerRequest.getName())
				.lastName(registerRequest.getLastName())
				.build();
		userRepository.save(user);
	}
	
	public void saveHealthParam (Long userId, HealthParamRequest healthParamRequest ) {
		TsUser user = userRepository.findTsUserById(userId);
		if (user == null) {
			throw new RuntimeException();
		}
		
		TsUserHealthParam userHealthParam = TsUserHealthParam.builder()
				.user(user)
				.temperature(healthParamRequest.getTemperature())
				.levelSugar(healthParamRequest.getLevelSugar())
				.pressure(Pressure.builder()
						.diastolic(healthParamRequest.getDiastolic())
						.systolic(healthParamRequest.getSystolic())
						.build())
				.build();
		healthParamRepository.save(userHealthParam);
	}
}
