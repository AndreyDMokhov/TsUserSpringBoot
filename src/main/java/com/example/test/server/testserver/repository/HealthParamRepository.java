package com.example.test.server.testserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.server.testserver.entity.TsUserHealthParam;

public interface HealthParamRepository extends JpaRepository<TsUserHealthParam, Long> {

}
