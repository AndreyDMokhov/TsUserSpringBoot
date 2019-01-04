package com.example.test.server.testserver.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TS_USER")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TsUser extends BaseEntity {
	@Column(name = "EMAIL", nullable = false, unique = true)
	private String email;
	
	@Column(name = "FIRST_NAME")
	private String name;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
}
