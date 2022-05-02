package com.j256.ormlite.field.types;

import com.j256.ormlite.field.SqlType;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class BaseDateType extends BaseDataType {
    protected static final DateStringFormatConfig defaultDateFormatConfig = new DateStringFormatConfig("yyyy-MM-dd HH:mm:ss.SSSSSS");

    public boolean isValidForVersion() {
        return true;
    }

    protected BaseDateType(SqlType sqlType, Class<?>[] clsArr) {
        super(sqlType, clsArr);
    }

    protected BaseDateType(SqlType sqlType) {
        super(sqlType);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r0 = (com.j256.ormlite.field.types.BaseDateType.DateStringFormatConfig) r0.getDataTypeConfigObj();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static com.j256.ormlite.field.types.BaseDateType.DateStringFormatConfig convertDateStringConfig(com.j256.ormlite.field.FieldType r0, com.j256.ormlite.field.types.BaseDateType.DateStringFormatConfig r1) {
        /*
            if (r0 != 0) goto L_0x0003
            return r1
        L_0x0003:
            java.lang.Object r0 = r0.getDataTypeConfigObj()
            com.j256.ormlite.field.types.BaseDateType$DateStringFormatConfig r0 = (com.j256.ormlite.field.types.BaseDateType.DateStringFormatConfig) r0
            if (r0 != 0) goto L_0x000c
            return r1
        L_0x000c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.field.types.BaseDateType.convertDateStringConfig(com.j256.ormlite.field.FieldType, com.j256.ormlite.field.types.BaseDateType$DateStringFormatConfig):com.j256.ormlite.field.types.BaseDateType$DateStringFormatConfig");
    }

    protected static Date parseDateString(DateStringFormatConfig dateStringFormatConfig, String str) throws ParseException {
        return dateStringFormatConfig.getDateFormat().parse(str);
    }

    protected static String normalizeDateString(DateStringFormatConfig dateStringFormatConfig, String str) throws ParseException {
        DateFormat dateFormat = dateStringFormatConfig.getDateFormat();
        return dateFormat.format(dateFormat.parse(str));
    }

    protected static class DateStringFormatConfig {
        final String dateFormatStr;
        private final ThreadLocal<DateFormat> threadLocal = new ThreadLocal<DateFormat>() {
            /* access modifiers changed from: protected */
            public DateFormat initialValue() {
                return new SimpleDateFormat(DateStringFormatConfig.this.dateFormatStr);
            }
        };

        public DateStringFormatConfig(String str) {
            this.dateFormatStr = str;
        }

        public DateFormat getDateFormat() {
            return this.threadLocal.get();
        }

        public String toString() {
            return this.dateFormatStr;
        }
    }

    public Object moveToNextValue(Object obj) {
        long currentTimeMillis = System.currentTimeMillis();
        if (obj == null) {
            return new Date(currentTimeMillis);
        }
        if (currentTimeMillis == ((Date) obj).getTime()) {
            return new Date(currentTimeMillis + 1);
        }
        return new Date(currentTimeMillis);
    }

    public boolean isValidForField(Field field) {
        return field.getType() == Date.class;
    }
}
