package com.example.test.server.testserver.entity.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply=true)
public class TsUserRoleConverter implements AttributeConverter<TsUserRole, Integer>{

	@Override
	public Integer convertToDatabaseColumn(TsUserRole userRole) {
		
		return userRole == null ? TsUserRole.GUEST.getId() : userRole.getId() ;
	}

	@Override
	public TsUserRole convertToEntityAttribute(Integer dbData) {
		return TsUserRole.getById(dbData);
	}

}
