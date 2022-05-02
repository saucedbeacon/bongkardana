package com.j256.ormlite.field.types;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.support.DatabaseResults;
import java.math.BigInteger;
import java.sql.SQLException;

public class BigIntegerType extends BaseDataType {
    public static int DEFAULT_WIDTH = 255;
    private static final BigIntegerType singleTon = new BigIntegerType();

    public boolean isValidForVersion() {
        return true;
    }

    public boolean isValidGeneratedType() {
        return true;
    }

    public static BigIntegerType getSingleton() {
        return singleTon;
    }

    protected BigIntegerType() {
        super(SqlType.STRING, new Class[]{BigInteger.class});
    }

    protected BigIntegerType(SqlType sqlType, Class<?>[] clsArr) {
        super(sqlType, clsArr);
    }

    public Object parseDefaultString(FieldType fieldType, String str) throws SQLException {
        try {
            return new BigInteger(str).toString();
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder("Problems with field ");
            sb.append(fieldType);
            sb.append(" parsing default BigInteger string '");
            sb.append(str);
            sb.append("'");
            throw SqlExceptionUtil.create(sb.toString(), e);
        }
    }

    public Object resultToSqlArg(FieldType fieldType, DatabaseResults databaseResults, int i) throws SQLException {
        return databaseResults.getString(i);
    }

    public Object sqlArgToJava(FieldType fieldType, Object obj, int i) throws SQLException {
        try {
            return new BigInteger((String) obj);
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder("Problems with column ");
            sb.append(i);
            sb.append(" parsing BigInteger string '");
            sb.append(obj);
            sb.append("'");
            throw SqlExceptionUtil.create(sb.toString(), e);
        }
    }

    public Object javaToSqlArg(FieldType fieldType, Object obj) {
        return ((BigInteger) obj).toString();
    }

    public Object moveToNextValue(Object obj) {
        if (obj == null) {
            return BigInteger.ONE;
        }
        return ((BigInteger) obj).add(BigInteger.ONE);
    }

    public Object convertIdNumber(Number number) {
        return BigInteger.valueOf(number.longValue());
    }
}
