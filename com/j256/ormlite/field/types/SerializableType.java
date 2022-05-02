package com.j256.ormlite.field.types;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.misc.IOUtils;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.support.DatabaseResults;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.Arrays;

public class SerializableType extends BaseDataType {
    private static final SerializableType singleTon = new SerializableType();

    public boolean isAppropriateId() {
        return false;
    }

    public boolean isArgumentHolderRequired() {
        return true;
    }

    public boolean isComparable() {
        return false;
    }

    public boolean isStreamType() {
        return true;
    }

    public static SerializableType getSingleton() {
        return singleTon;
    }

    private SerializableType() {
        super(SqlType.SERIALIZABLE);
    }

    protected SerializableType(SqlType sqlType, Class<?>[] clsArr) {
        super(sqlType, clsArr);
    }

    public Object parseDefaultString(FieldType fieldType, String str) throws SQLException {
        throw new SQLException("Default values for serializable types are not supported");
    }

    public Object resultToSqlArg(FieldType fieldType, DatabaseResults databaseResults, int i) throws SQLException {
        return databaseResults.getBytes(i);
    }

    public Object sqlArgToJava(FieldType fieldType, Object obj, int i) throws SQLException {
        ObjectInputStream objectInputStream;
        Exception e;
        byte[] bArr = (byte[]) obj;
        try {
            objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
            try {
                Object readObject = objectInputStream.readObject();
                IOUtils.closeQuietly(objectInputStream);
                return readObject;
            } catch (Exception e2) {
                e = e2;
                try {
                    StringBuilder sb = new StringBuilder("Could not read serialized object from byte array: ");
                    sb.append(Arrays.toString(bArr));
                    sb.append("(len ");
                    sb.append(bArr.length);
                    sb.append(")");
                    throw SqlExceptionUtil.create(sb.toString(), e);
                } catch (Throwable th) {
                    th = th;
                    IOUtils.closeQuietly(objectInputStream);
                    throw th;
                }
            }
        } catch (Exception e3) {
            Exception exc = e3;
            objectInputStream = null;
            e = exc;
            StringBuilder sb2 = new StringBuilder("Could not read serialized object from byte array: ");
            sb2.append(Arrays.toString(bArr));
            sb2.append("(len ");
            sb2.append(bArr.length);
            sb2.append(")");
            throw SqlExceptionUtil.create(sb2.toString(), e);
        } catch (Throwable th2) {
            objectInputStream = null;
            th = th2;
            IOUtils.closeQuietly(objectInputStream);
            throw th;
        }
    }

    public Object javaToSqlArg(FieldType fieldType, Object obj) throws SQLException {
        ObjectOutputStream objectOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream2.writeObject(obj);
                objectOutputStream2.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                IOUtils.closeQuietly((Closeable) null);
                return byteArray;
            } catch (Exception e) {
                e = e;
                objectOutputStream = objectOutputStream2;
                try {
                    throw SqlExceptionUtil.create("Could not write serialized object to byte array: ".concat(String.valueOf(obj)), e);
                } catch (Throwable th) {
                    th = th;
                    IOUtils.closeQuietly(objectOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = objectOutputStream2;
                IOUtils.closeQuietly(objectOutputStream);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            throw SqlExceptionUtil.create("Could not write serialized object to byte array: ".concat(String.valueOf(obj)), e);
        }
    }

    public boolean isValidForField(Field field) {
        return Serializable.class.isAssignableFrom(field.getType());
    }

    public Object resultStringToJava(FieldType fieldType, String str, int i) throws SQLException {
        throw new SQLException("Serializable type cannot be converted from string to Java");
    }

    public Class<?> getPrimaryClass() {
        return Serializable.class;
    }
}
