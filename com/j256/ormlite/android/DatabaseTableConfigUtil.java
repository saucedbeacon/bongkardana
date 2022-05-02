package com.j256.ormlite.android;

import android.os.Build;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.DatabaseFieldConfig;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.DatabaseTableConfig;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseTableConfigUtil {
    private static final int ALLOW_GENERATED_ID_INSERT = 24;
    private static final int CAN_BE_NULL = 5;
    private static final int COLUMN_DEFINITON = 25;
    private static final int COLUMN_NAME = 1;
    private static final int DATA_TYPE = 2;
    private static final int DEFAULT_VALUE = 3;
    public static final String DISABLE_ANNOTATION_HACK_SYSTEM_PROPERTY = "ormlite.annotation.hack.disable";
    private static final int FOREIGN = 9;
    private static final int FOREIGN_AUTO_CREATE = 26;
    private static final int FOREIGN_AUTO_REFRESH = 21;
    private static final int FOREIGN_COLUMN_NAME = 28;
    private static final int FORMAT = 14;
    private static final int GENERATED_ID = 7;
    private static final int GENERATED_ID_SEQUENCE = 8;
    private static final int ID = 6;
    private static final int INDEX = 17;
    private static final int INDEX_NAME = 19;
    private static final int MAX_FOREIGN_AUTO_REFRESH_LEVEL = 22;
    private static final int PERSISTED = 13;
    private static final int PERSISTER_CLASS = 23;
    private static final int READ_ONLY = 29;
    private static final int THROW_IF_NULL = 12;
    private static final int UNIQUE = 15;
    private static final int UNIQUE_COMBO = 16;
    private static final int UNIQUE_INDEX = 18;
    private static final int UNIQUE_INDEX_NAME = 20;
    private static final int UNKNOWN_ENUM_NAME = 11;
    private static final int USE_GET_SET = 10;
    private static final int VERSION = 27;
    private static final int WIDTH = 4;
    private static Class<?> annotationFactoryClazz;
    private static Class<?> annotationMemberClazz;
    private static final int[] configFieldNums;
    private static Field elementsField;
    private static Field nameField;
    private static Field valueField;
    private static int workedC;

    static {
        if (Build.VERSION.SDK_INT >= 14 || System.getProperty(DISABLE_ANNOTATION_HACK_SYSTEM_PROPERTY) != null) {
            configFieldNums = null;
        } else {
            configFieldNums = lookupClasses();
        }
    }

    public static <T> DatabaseTableConfig<T> fromClass(ConnectionSource connectionSource, Class<T> cls) throws SQLException {
        DatabaseType databaseType = connectionSource.getDatabaseType();
        String extractTableName = DatabaseTableConfig.extractTableName(cls);
        ArrayList arrayList = new ArrayList();
        for (Class<T> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            for (Field configFromField : cls2.getDeclaredFields()) {
                DatabaseFieldConfig configFromField2 = configFromField(databaseType, extractTableName, configFromField);
                if (configFromField2 != null && configFromField2.isPersisted()) {
                    arrayList.add(configFromField2);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return new DatabaseTableConfig<>(cls, extractTableName, (List<DatabaseFieldConfig>) arrayList);
    }

    public static int getWorkedC() {
        return workedC;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int[] lookupClasses() {
        /*
            r0 = 0
            java.lang.String r1 = "org.apache.harmony.lang.annotation.AnnotationFactory"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{  }
            annotationFactoryClazz = r1     // Catch:{  }
            java.lang.String r1 = "org.apache.harmony.lang.annotation.AnnotationMember"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{  }
            annotationMemberClazz = r1     // Catch:{  }
            java.lang.String r1 = "[Lorg.apache.harmony.lang.annotation.AnnotationMember;"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{  }
            java.lang.Class<?> r2 = annotationFactoryClazz     // Catch:{ ClassNotFoundException -> 0x0089 }
            java.lang.String r3 = "elements"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ ClassNotFoundException -> 0x0089 }
            elementsField = r2     // Catch:{ ClassNotFoundException -> 0x0089 }
            r3 = 1
            r2.setAccessible(r3)     // Catch:{ ClassNotFoundException -> 0x0089 }
            java.lang.Class<?> r2 = annotationMemberClazz     // Catch:{ ClassNotFoundException -> 0x0089 }
            java.lang.String r4 = "name"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r4)     // Catch:{ ClassNotFoundException -> 0x0089 }
            nameField = r2     // Catch:{ ClassNotFoundException -> 0x0089 }
            r2.setAccessible(r3)     // Catch:{ ClassNotFoundException -> 0x0089 }
            java.lang.Class<?> r2 = annotationMemberClazz     // Catch:{ ClassNotFoundException -> 0x0089 }
            java.lang.String r4 = "value"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r4)     // Catch:{ ClassNotFoundException -> 0x0089 }
            valueField = r2     // Catch:{ ClassNotFoundException -> 0x0089 }
            r2.setAccessible(r3)     // Catch:{ ClassNotFoundException -> 0x0089 }
            java.lang.Class<com.j256.ormlite.android.DatabaseTableConfigUtil$DatabaseFieldSample> r2 = com.j256.ormlite.android.DatabaseTableConfigUtil.DatabaseFieldSample.class
            java.lang.String r3 = "field"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ ClassNotFoundException -> 0x0089 }
            java.lang.Class<com.j256.ormlite.field.DatabaseField> r3 = com.j256.ormlite.field.DatabaseField.class
            java.lang.annotation.Annotation r2 = r2.getAnnotation(r3)
            com.j256.ormlite.field.DatabaseField r2 = (com.j256.ormlite.field.DatabaseField) r2
            java.lang.reflect.InvocationHandler r2 = java.lang.reflect.Proxy.getInvocationHandler(r2)
            java.lang.Class r3 = r2.getClass()
            java.lang.Class<?> r4 = annotationFactoryClazz
            if (r3 == r4) goto L_0x005d
            return r0
        L_0x005d:
            java.lang.reflect.Field r3 = elementsField     // Catch:{  }
            java.lang.Object r2 = r3.get(r2)     // Catch:{  }
            if (r2 == 0) goto L_0x0089
            java.lang.Class r3 = r2.getClass()     // Catch:{  }
            if (r3 == r1) goto L_0x006c
            goto L_0x0089
        L_0x006c:
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{  }
            int r1 = r2.length     // Catch:{  }
            int[] r1 = new int[r1]     // Catch:{  }
            r3 = 0
        L_0x0072:
            int r4 = r2.length     // Catch:{  }
            if (r3 >= r4) goto L_0x0088
            java.lang.reflect.Field r4 = nameField     // Catch:{  }
            r5 = r2[r3]     // Catch:{  }
            java.lang.Object r4 = r4.get(r5)     // Catch:{  }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{  }
            int r4 = configFieldNameToNum(r4)     // Catch:{  }
            r1[r3] = r4     // Catch:{  }
            int r3 = r3 + 1
            goto L_0x0072
        L_0x0088:
            return r1
        L_0x0089:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.android.DatabaseTableConfigUtil.lookupClasses():int[]");
    }

    private static int configFieldNameToNum(String str) {
        if (str.equals("columnName")) {
            return 1;
        }
        if (str.equals("dataType")) {
            return 2;
        }
        if (str.equals("defaultValue")) {
            return 3;
        }
        if (str.equals("width")) {
            return 4;
        }
        if (str.equals("canBeNull")) {
            return 5;
        }
        if (str.equals("id")) {
            return 6;
        }
        if (str.equals("generatedId")) {
            return 7;
        }
        if (str.equals("generatedIdSequence")) {
            return 8;
        }
        if (str.equals("foreign")) {
            return 9;
        }
        if (str.equals("useGetSet")) {
            return 10;
        }
        if (str.equals("unknownEnumName")) {
            return 11;
        }
        if (str.equals("throwIfNull")) {
            return 12;
        }
        if (str.equals("persisted")) {
            return 13;
        }
        if (str.equals("format")) {
            return 14;
        }
        if (str.equals("unique")) {
            return 15;
        }
        if (str.equals("uniqueCombo")) {
            return 16;
        }
        if (str.equals("index")) {
            return 17;
        }
        if (str.equals("uniqueIndex")) {
            return 18;
        }
        if (str.equals("indexName")) {
            return 19;
        }
        if (str.equals("uniqueIndexName")) {
            return 20;
        }
        if (str.equals("foreignAutoRefresh")) {
            return 21;
        }
        if (str.equals("maxForeignAutoRefreshLevel")) {
            return 22;
        }
        if (str.equals("persisterClass")) {
            return 23;
        }
        if (str.equals("allowGeneratedIdInsert")) {
            return 24;
        }
        if (str.equals("columnDefinition")) {
            return 25;
        }
        if (str.equals("foreignAutoCreate")) {
            return 26;
        }
        if (str.equals("version")) {
            return 27;
        }
        if (str.equals("foreignColumnName")) {
            return 28;
        }
        if (str.equals("readOnly")) {
            return 29;
        }
        throw new IllegalStateException("Could not find support for DatabaseField ".concat(String.valueOf(str)));
    }

    private static DatabaseFieldConfig configFromField(DatabaseType databaseType, String str, Field field) throws SQLException {
        if (configFieldNums == null) {
            return DatabaseFieldConfig.fromField(databaseType, str, field);
        }
        DatabaseField databaseField = (DatabaseField) field.getAnnotation(DatabaseField.class);
        DatabaseFieldConfig databaseFieldConfig = null;
        if (databaseField != null) {
            try {
                databaseFieldConfig = buildConfig(databaseField, str, field);
            } catch (Exception unused) {
            }
        }
        if (databaseFieldConfig == null) {
            return DatabaseFieldConfig.fromField(databaseType, str, field);
        }
        workedC++;
        return databaseFieldConfig;
    }

    private static DatabaseFieldConfig buildConfig(DatabaseField databaseField, String str, Field field) throws Exception {
        Object obj;
        InvocationHandler invocationHandler = Proxy.getInvocationHandler(databaseField);
        if (invocationHandler.getClass() != annotationFactoryClazz || (obj = elementsField.get(invocationHandler)) == null) {
            return null;
        }
        DatabaseFieldConfig databaseFieldConfig = new DatabaseFieldConfig(field.getName());
        Object[] objArr = (Object[]) obj;
        for (int i = 0; i < configFieldNums.length; i++) {
            Object obj2 = valueField.get(objArr[i]);
            if (obj2 != null) {
                assignConfigField(configFieldNums[i], databaseFieldConfig, field, obj2);
            }
        }
        return databaseFieldConfig;
    }

    private static void assignConfigField(int i, DatabaseFieldConfig databaseFieldConfig, Field field, Object obj) {
        switch (i) {
            case 1:
                databaseFieldConfig.setColumnName(valueIfNotBlank((String) obj));
                return;
            case 2:
                databaseFieldConfig.setDataType((DataType) obj);
                return;
            case 3:
                String str = (String) obj;
                if (str != null && !str.equals(DatabaseField.DEFAULT_STRING)) {
                    databaseFieldConfig.setDefaultValue(str);
                    return;
                }
                return;
            case 4:
                databaseFieldConfig.setWidth(((Integer) obj).intValue());
                return;
            case 5:
                databaseFieldConfig.setCanBeNull(((Boolean) obj).booleanValue());
                return;
            case 6:
                databaseFieldConfig.setId(((Boolean) obj).booleanValue());
                return;
            case 7:
                databaseFieldConfig.setGeneratedId(((Boolean) obj).booleanValue());
                return;
            case 8:
                databaseFieldConfig.setGeneratedIdSequence(valueIfNotBlank((String) obj));
                return;
            case 9:
                databaseFieldConfig.setForeign(((Boolean) obj).booleanValue());
                return;
            case 10:
                databaseFieldConfig.setUseGetSet(((Boolean) obj).booleanValue());
                return;
            case 11:
                databaseFieldConfig.setUnknownEnumValue(DatabaseFieldConfig.findMatchingEnumVal(field, (String) obj));
                return;
            case 12:
                databaseFieldConfig.setThrowIfNull(((Boolean) obj).booleanValue());
                return;
            case 13:
                databaseFieldConfig.setPersisted(((Boolean) obj).booleanValue());
                return;
            case 14:
                databaseFieldConfig.setFormat(valueIfNotBlank((String) obj));
                return;
            case 15:
                databaseFieldConfig.setUnique(((Boolean) obj).booleanValue());
                return;
            case 16:
                databaseFieldConfig.setUniqueCombo(((Boolean) obj).booleanValue());
                return;
            case 17:
                databaseFieldConfig.setIndex(((Boolean) obj).booleanValue());
                return;
            case 18:
                databaseFieldConfig.setUniqueIndex(((Boolean) obj).booleanValue());
                return;
            case 19:
                databaseFieldConfig.setIndexName(valueIfNotBlank((String) obj));
                return;
            case 20:
                databaseFieldConfig.setUniqueIndexName(valueIfNotBlank((String) obj));
                return;
            case 21:
                databaseFieldConfig.setForeignAutoRefresh(((Boolean) obj).booleanValue());
                return;
            case 22:
                databaseFieldConfig.setMaxForeignAutoRefreshLevel(((Integer) obj).intValue());
                return;
            case 23:
                databaseFieldConfig.setPersisterClass((Class) obj);
                return;
            case 24:
                databaseFieldConfig.setAllowGeneratedIdInsert(((Boolean) obj).booleanValue());
                return;
            case 25:
                databaseFieldConfig.setColumnDefinition(valueIfNotBlank((String) obj));
                return;
            case 26:
                databaseFieldConfig.setForeignAutoCreate(((Boolean) obj).booleanValue());
                return;
            case 27:
                databaseFieldConfig.setVersion(((Boolean) obj).booleanValue());
                return;
            case 28:
                databaseFieldConfig.setForeignColumnName(valueIfNotBlank((String) obj));
                return;
            case 29:
                databaseFieldConfig.setReadOnly(((Boolean) obj).booleanValue());
                return;
            default:
                throw new IllegalStateException("Could not find support for DatabaseField number ".concat(String.valueOf(i)));
        }
    }

    private static String valueIfNotBlank(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    static class DatabaseFieldSample {
        @DatabaseField
        String field;

        private DatabaseFieldSample() {
        }
    }
}
