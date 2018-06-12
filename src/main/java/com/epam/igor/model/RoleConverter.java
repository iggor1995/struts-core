package com.epam.igor.model;

import javax.persistence.AttributeConverter;
import java.sql.Date;
import java.time.LocalDate;

/**
 * Created by Igor_Lapin on 5/31/2018.
 */
public class RoleConverter  implements AttributeConverter<Role, String> {


    @Override
    public String convertToDatabaseColumn(Role attribute) {
        return attribute.toString();
    }

    @Override
    public Role convertToEntityAttribute(String dbData) {
        return Role.valueOf(dbData);
    }
}
