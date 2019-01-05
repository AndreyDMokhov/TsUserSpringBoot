package com.example.test.server.testserver.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "HEALTH_PARAM")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TsUserHealthParam extends BaseEntity {
	
	@ManyToOne
	@JoinColumn(name="USER_ID", nullable=false)
	private TsUser user;
	
	@Column(name= "TEMPETATURE")
	private float temperature;
	
	@Column(name = "levelSugar")
	private float levelSugar;
	
	@Embedded
	private Pressure pressure;

	
}
