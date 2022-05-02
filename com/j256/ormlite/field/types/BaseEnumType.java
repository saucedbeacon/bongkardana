package com.j256.ormlite.field.types;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import java.lang.reflect.Field;
import java.sql.SQLException;

public abstract class BaseEnumType extends BaseDataType {
    protected BaseEnumType(SqlType sqlType, Class<?>[] clsArr) {
        super(sqlType, clsArr);
    }

    protected BaseEnumType(SqlType sqlType) {
        super(sqlType);
    }

    protected static Enum<?> enumVal(FieldType fieldType, Object obj, Enum<?> enumR, Enum<?> enumR2) throws SQLException {
        if (enumR != null) {
            return enumR;
        }
        if (enumR2 != null) {
            return enumR2;
        }
        StringBuilder sb = new StringBuilder("Cannot get enum value of '");
        sb.append(obj);
        sb.append("' for field ");
        sb.append(fieldType);
        throw new SQLException(sb.toString());
    }

    public boolean isValidForField(Field field) {
        return field.getType().isEnum();
    }
}
