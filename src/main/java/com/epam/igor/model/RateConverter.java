package com.epam.igor.model;

import javax.persistence.AttributeConverter;

public class RateConverter implements AttributeConverter<Rate, String> {

    @Override
    public String convertToDatabaseColumn(Rate attribute) {
        return attribute.toString();
    }

    @Override
    public Rate convertToEntityAttribute(String dbData) {
        return Rate.valueOf(dbData);
    }
}