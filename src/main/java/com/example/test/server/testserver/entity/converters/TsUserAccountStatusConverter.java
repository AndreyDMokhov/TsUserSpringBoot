package com.example.test.server.testserver.entity.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class TsUserAccountStatusConverter implements AttributeConverter<TsUserAccountStatus, Integer>{

	@Override
	public Integer convertToDatabaseColumn(TsUserAccountStatus accountStatus) {
		
		return accountStatus == null ? null : accountStatus.getId();
	}

	@Override
	public TsUserAccountStatus convertToEntityAttribute(Integer dbData) {
		return TsUserAccountStatus.getById(dbData);
	}

}
