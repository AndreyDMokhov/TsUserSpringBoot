package com.example.test.server.testserver.entity;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.test.server.testserver.entity.converters.TsUserRole;
import com.example.test.server.testserver.entity.converters.TsUserRoleConverter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "USER_ACCOUNT")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TsUserAccount extends BaseEntity {
	
	@OneToOne
	@JoinColumn(name = "USER_ID", nullable = false, unique = true)
	private TsUser user;
	
	@Convert(converter = TsUserRoleConverter.class)
	private TsUserRole userRole;
}
