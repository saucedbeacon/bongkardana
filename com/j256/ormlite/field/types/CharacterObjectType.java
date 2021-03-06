package com.j256.ormlite.field.types;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.support.DatabaseResults;
import java.sql.SQLException;

public class CharacterObjectType extends BaseDataType {
    private static final CharacterObjectType singleTon = new CharacterObjectType();

    public static CharacterObjectType getSingleton() {
        return singleTon;
    }

    private CharacterObjectType() {
        super(SqlType.CHAR, new Class[]{Character.class});
    }

    protected CharacterObjectType(SqlType sqlType, Class<?>[] clsArr) {
        super(sqlType, clsArr);
    }

    public Object parseDefaultString(FieldType fieldType, String str) throws SQLException {
        if (str.length() == 1) {
            return Character.valueOf(str.charAt(0));
        }
        StringBuilder sb = new StringBuilder("Problems with field ");
        sb.append(fieldType);
        sb.append(", default string to long for Character: '");
        sb.append(str);
        sb.append("'");
        throw new SQLException(sb.toString());
    }

    public Object resultToSqlArg(FieldType fieldType, DatabaseResults databaseResults, int i) throws SQLException {
        return Character.valueOf(databaseResults.getChar(i));
    }
}
