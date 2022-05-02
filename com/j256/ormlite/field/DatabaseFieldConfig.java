package com.j256.ormlite.field;

import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.types.VoidType;
import com.j256.ormlite.misc.JavaxPersistenceConfigurer;
import com.j256.ormlite.table.DatabaseTableConfig;
import id.dana.lib.gcontainer.app.bridge.contact.ContactEventType;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Locale;

public class DatabaseFieldConfig {
    public static final boolean DEFAULT_CAN_BE_NULL = true;
    public static final DataType DEFAULT_DATA_TYPE = DataType.UNKNOWN;
    public static final boolean DEFAULT_FOREIGN_COLLECTION_ORDER_ASCENDING = true;
    private static final int DEFAULT_MAX_EAGER_FOREIGN_COLLECTION_LEVEL = 1;
    public static final Class<? extends DataPersister> DEFAULT_PERSISTER_CLASS = VoidType.class;
    public static final int NO_MAX_FOREIGN_AUTO_REFRESH_LEVEL_SPECIFIED = -1;
    private static JavaxPersistenceConfigurer javaxPersistenceConfigurer;
    private boolean allowGeneratedIdInsert;
    private boolean canBeNull = true;
    private String columnDefinition;
    private String columnName;
    private DataPersister dataPersister;
    private DataType dataType = DEFAULT_DATA_TYPE;
    private String defaultValue;
    private String fieldName;
    private boolean foreign;
    private boolean foreignAutoCreate;
    private boolean foreignAutoRefresh;
    private boolean foreignCollection;
    private String foreignCollectionColumnName;
    private boolean foreignCollectionEager;
    private String foreignCollectionForeignFieldName;
    private int foreignCollectionMaxEagerLevel = 1;
    private boolean foreignCollectionOrderAscending = true;
    private String foreignCollectionOrderColumnName;
    private String foreignColumnName;
    private DatabaseTableConfig<?> foreignTableConfig;
    private String format;
    private boolean generatedId;
    private String generatedIdSequence;

    /* renamed from: id  reason: collision with root package name */
    private boolean f11078id;
    private boolean index;
    private String indexName;
    private int maxForeignAutoRefreshLevel = -1;
    private boolean persisted = true;
    private Class<? extends DataPersister> persisterClass = DEFAULT_PERSISTER_CLASS;
    private boolean readOnly;
    private boolean throwIfNull;
    private boolean unique;
    private boolean uniqueCombo;
    private boolean uniqueIndex;
    private String uniqueIndexName;
    private Enum<?> unknownEnumValue;
    private boolean useGetSet;
    private boolean version;
    private int width;

    static {
        try {
            Class.forName("javax.persistence.Entity");
            javaxPersistenceConfigurer = (JavaxPersistenceConfigurer) Class.forName("com.j256.ormlite.misc.JavaxPersistenceImpl").getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            javaxPersistenceConfigurer = null;
        }
    }

    public DatabaseFieldConfig() {
    }

    public DatabaseFieldConfig(String str) {
        this.fieldName = str;
    }

    public DatabaseFieldConfig(String str, String str2, DataType dataType2, String str3, int i, boolean z, boolean z2, boolean z3, String str4, boolean z4, DatabaseTableConfig<?> databaseTableConfig, boolean z5, Enum<?> enumR, boolean z6, String str5, boolean z7, String str6, String str7, boolean z8, int i2, int i3) {
        this.fieldName = str;
        this.columnName = str2;
        this.dataType = dataType2;
        this.defaultValue = str3;
        this.width = i;
        this.canBeNull = z;
        this.f11078id = z2;
        this.generatedId = z3;
        this.generatedIdSequence = str4;
        this.foreign = z4;
        this.foreignTableConfig = databaseTableConfig;
        this.useGetSet = z5;
        this.unknownEnumValue = enumR;
        this.throwIfNull = z6;
        this.format = str5;
        this.unique = z7;
        this.indexName = str6;
        this.uniqueIndexName = str7;
        this.foreignAutoRefresh = z8;
        this.maxForeignAutoRefreshLevel = i2;
        this.foreignCollectionMaxEagerLevel = i3;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public void setFieldName(String str) {
        this.fieldName = str;
    }

    public String getColumnName() {
        return this.columnName;
    }

    public void setColumnName(String str) {
        this.columnName = str;
    }

    public DataType getDataType() {
        return this.dataType;
    }

    public void setDataType(DataType dataType2) {
        this.dataType = dataType2;
    }

    public DataPersister getDataPersister() {
        DataPersister dataPersister2 = this.dataPersister;
        return dataPersister2 == null ? this.dataType.getDataPersister() : dataPersister2;
    }

    public void setDataPersister(DataPersister dataPersister2) {
        this.dataPersister = dataPersister2;
    }

    public String getDefaultValue() {
        return this.defaultValue;
    }

    public void setDefaultValue(String str) {
        this.defaultValue = str;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public boolean isCanBeNull() {
        return this.canBeNull;
    }

    public void setCanBeNull(boolean z) {
        this.canBeNull = z;
    }

    public boolean isId() {
        return this.f11078id;
    }

    public void setId(boolean z) {
        this.f11078id = z;
    }

    public boolean isGeneratedId() {
        return this.generatedId;
    }

    public void setGeneratedId(boolean z) {
        this.generatedId = z;
    }

    public String getGeneratedIdSequence() {
        return this.generatedIdSequence;
    }

    public void setGeneratedIdSequence(String str) {
        this.generatedIdSequence = str;
    }

    public boolean isForeign() {
        return this.foreign;
    }

    public void setForeign(boolean z) {
        this.foreign = z;
    }

    public DatabaseTableConfig<?> getForeignTableConfig() {
        return this.foreignTableConfig;
    }

    public void setForeignTableConfig(DatabaseTableConfig<?> databaseTableConfig) {
        this.foreignTableConfig = databaseTableConfig;
    }

    public boolean isUseGetSet() {
        return this.useGetSet;
    }

    public void setUseGetSet(boolean z) {
        this.useGetSet = z;
    }

    public Enum<?> getUnknownEnumValue() {
        return this.unknownEnumValue;
    }

    public void setUnknownEnumValue(Enum<?> enumR) {
        this.unknownEnumValue = enumR;
    }

    public boolean isThrowIfNull() {
        return this.throwIfNull;
    }

    public void setThrowIfNull(boolean z) {
        this.throwIfNull = z;
    }

    public boolean isPersisted() {
        return this.persisted;
    }

    public void setPersisted(boolean z) {
        this.persisted = z;
    }

    public String getFormat() {
        return this.format;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public boolean isUnique() {
        return this.unique;
    }

    public void setUnique(boolean z) {
        this.unique = z;
    }

    public boolean isUniqueCombo() {
        return this.uniqueCombo;
    }

    public void setUniqueCombo(boolean z) {
        this.uniqueCombo = z;
    }

    public boolean isIndex() {
        return this.index;
    }

    public void setIndex(boolean z) {
        this.index = z;
    }

    public String getIndexName(String str) {
        if (this.index && this.indexName == null) {
            this.indexName = findIndexName(str);
        }
        return this.indexName;
    }

    public void setIndexName(String str) {
        this.indexName = str;
    }

    public boolean isUniqueIndex() {
        return this.uniqueIndex;
    }

    public void setUniqueIndex(boolean z) {
        this.uniqueIndex = z;
    }

    public String getUniqueIndexName(String str) {
        if (this.uniqueIndex && this.uniqueIndexName == null) {
            this.uniqueIndexName = findIndexName(str);
        }
        return this.uniqueIndexName;
    }

    public void setUniqueIndexName(String str) {
        this.uniqueIndexName = str;
    }

    public void setForeignAutoRefresh(boolean z) {
        this.foreignAutoRefresh = z;
    }

    public boolean isForeignAutoRefresh() {
        return this.foreignAutoRefresh;
    }

    public int getMaxForeignAutoRefreshLevel() {
        if (this.foreignAutoRefresh) {
            return this.maxForeignAutoRefreshLevel;
        }
        return -1;
    }

    public void setMaxForeignAutoRefreshLevel(int i) {
        this.maxForeignAutoRefreshLevel = i;
    }

    public boolean isForeignCollection() {
        return this.foreignCollection;
    }

    public void setForeignCollection(boolean z) {
        this.foreignCollection = z;
    }

    public boolean isForeignCollectionEager() {
        return this.foreignCollectionEager;
    }

    public void setForeignCollectionEager(boolean z) {
        this.foreignCollectionEager = z;
    }

    public int getForeignCollectionMaxEagerLevel() {
        return this.foreignCollectionMaxEagerLevel;
    }

    public void setForeignCollectionMaxEagerLevel(int i) {
        this.foreignCollectionMaxEagerLevel = i;
    }

    public String getForeignCollectionColumnName() {
        return this.foreignCollectionColumnName;
    }

    public void setForeignCollectionColumnName(String str) {
        this.foreignCollectionColumnName = str;
    }

    public String getForeignCollectionOrderColumnName() {
        return this.foreignCollectionOrderColumnName;
    }

    public void setForeignCollectionOrderColumnName(String str) {
        this.foreignCollectionOrderColumnName = str;
    }

    public boolean isForeignCollectionOrderAscending() {
        return this.foreignCollectionOrderAscending;
    }

    public void setForeignCollectionOrderAscending(boolean z) {
        this.foreignCollectionOrderAscending = z;
    }

    public String getForeignCollectionForeignFieldName() {
        return this.foreignCollectionForeignFieldName;
    }

    public void setForeignCollectionForeignFieldName(String str) {
        this.foreignCollectionForeignFieldName = str;
    }

    public Class<? extends DataPersister> getPersisterClass() {
        return this.persisterClass;
    }

    public void setPersisterClass(Class<? extends DataPersister> cls) {
        this.persisterClass = cls;
    }

    public boolean isAllowGeneratedIdInsert() {
        return this.allowGeneratedIdInsert;
    }

    public void setAllowGeneratedIdInsert(boolean z) {
        this.allowGeneratedIdInsert = z;
    }

    public String getColumnDefinition() {
        return this.columnDefinition;
    }

    public void setColumnDefinition(String str) {
        this.columnDefinition = str;
    }

    public boolean isForeignAutoCreate() {
        return this.foreignAutoCreate;
    }

    public void setForeignAutoCreate(boolean z) {
        this.foreignAutoCreate = z;
    }

    public boolean isVersion() {
        return this.version;
    }

    public void setVersion(boolean z) {
        this.version = z;
    }

    public String getForeignColumnName() {
        return this.foreignColumnName;
    }

    public void setForeignColumnName(String str) {
        this.foreignColumnName = str;
    }

    public boolean isReadOnly() {
        return this.readOnly;
    }

    public void setReadOnly(boolean z) {
        this.readOnly = z;
    }

    public static DatabaseFieldConfig fromField(DatabaseType databaseType, String str, Field field) throws SQLException {
        DatabaseField databaseField = (DatabaseField) field.getAnnotation(DatabaseField.class);
        if (databaseField == null) {
            ForeignCollectionField foreignCollectionField = (ForeignCollectionField) field.getAnnotation(ForeignCollectionField.class);
            if (foreignCollectionField != null) {
                return fromForeignCollection(databaseType, field, foreignCollectionField);
            }
            JavaxPersistenceConfigurer javaxPersistenceConfigurer2 = javaxPersistenceConfigurer;
            if (javaxPersistenceConfigurer2 == null) {
                return null;
            }
            return javaxPersistenceConfigurer2.createFieldConfig(databaseType, field);
        } else if (databaseField.persisted()) {
            return fromDatabaseField(databaseType, str, field, databaseField);
        } else {
            return null;
        }
    }

    public static Method findGetMethod(Field field, boolean z) throws IllegalArgumentException {
        Method method;
        if (Locale.ENGLISH.equals(Locale.getDefault())) {
            method = findMethodFromNames(field, true, z, methodFromField(field, ContactEventType.CONTACT_GET, (Locale) null), methodFromField(field, "is", (Locale) null));
        } else {
            method = findMethodFromNames(field, true, z, methodFromField(field, ContactEventType.CONTACT_GET, (Locale) null), methodFromField(field, ContactEventType.CONTACT_GET, Locale.ENGLISH), methodFromField(field, "is", (Locale) null), methodFromField(field, "is", Locale.ENGLISH));
        }
        if (method == null) {
            return null;
        }
        if (method.getReturnType() == field.getType()) {
            return method;
        }
        if (!z) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Return type of get method ");
        sb.append(method.getName());
        sb.append(" does not return ");
        sb.append(field.getType());
        throw new IllegalArgumentException(sb.toString());
    }

    public static Method findSetMethod(Field field, boolean z) throws IllegalArgumentException {
        Method method;
        if (Locale.ENGLISH.equals(Locale.getDefault())) {
            method = findMethodFromNames(field, false, z, methodFromField(field, "set", (Locale) null));
        } else {
            method = findMethodFromNames(field, false, z, methodFromField(field, "set", (Locale) null), methodFromField(field, "set", Locale.ENGLISH));
        }
        if (method == null) {
            return null;
        }
        if (method.getReturnType() == Void.TYPE) {
            return method;
        }
        if (!z) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Return type of set method ");
        sb.append(method.getName());
        sb.append(" returns ");
        sb.append(method.getReturnType());
        sb.append(" instead of void");
        throw new IllegalArgumentException(sb.toString());
    }

    public static DatabaseFieldConfig fromDatabaseField(DatabaseType databaseType, String str, Field field, DatabaseField databaseField) {
        DatabaseFieldConfig databaseFieldConfig = new DatabaseFieldConfig();
        databaseFieldConfig.fieldName = field.getName();
        if (databaseType.isEntityNamesMustBeUpCase()) {
            databaseFieldConfig.fieldName = databaseType.upCaseEntityName(databaseFieldConfig.fieldName);
        }
        databaseFieldConfig.columnName = valueIfNotBlank(databaseField.columnName());
        databaseFieldConfig.dataType = databaseField.dataType();
        String defaultValue2 = databaseField.defaultValue();
        if (!defaultValue2.equals(DatabaseField.DEFAULT_STRING)) {
            databaseFieldConfig.defaultValue = defaultValue2;
        }
        databaseFieldConfig.width = databaseField.width();
        databaseFieldConfig.canBeNull = databaseField.canBeNull();
        databaseFieldConfig.f11078id = databaseField.id();
        databaseFieldConfig.generatedId = databaseField.generatedId();
        databaseFieldConfig.generatedIdSequence = valueIfNotBlank(databaseField.generatedIdSequence());
        databaseFieldConfig.foreign = databaseField.foreign();
        databaseFieldConfig.useGetSet = databaseField.useGetSet();
        databaseFieldConfig.unknownEnumValue = findMatchingEnumVal(field, databaseField.unknownEnumName());
        databaseFieldConfig.throwIfNull = databaseField.throwIfNull();
        databaseFieldConfig.format = valueIfNotBlank(databaseField.format());
        databaseFieldConfig.unique = databaseField.unique();
        databaseFieldConfig.uniqueCombo = databaseField.uniqueCombo();
        databaseFieldConfig.index = databaseField.index();
        databaseFieldConfig.indexName = valueIfNotBlank(databaseField.indexName());
        databaseFieldConfig.uniqueIndex = databaseField.uniqueIndex();
        databaseFieldConfig.uniqueIndexName = valueIfNotBlank(databaseField.uniqueIndexName());
        boolean foreignAutoRefresh2 = databaseField.foreignAutoRefresh();
        databaseFieldConfig.foreignAutoRefresh = foreignAutoRefresh2;
        if (foreignAutoRefresh2 || databaseField.maxForeignAutoRefreshLevel() != 2) {
            databaseFieldConfig.maxForeignAutoRefreshLevel = databaseField.maxForeignAutoRefreshLevel();
        } else {
            databaseFieldConfig.maxForeignAutoRefreshLevel = -1;
        }
        databaseFieldConfig.persisterClass = databaseField.persisterClass();
        databaseFieldConfig.allowGeneratedIdInsert = databaseField.allowGeneratedIdInsert();
        databaseFieldConfig.columnDefinition = valueIfNotBlank(databaseField.columnDefinition());
        databaseFieldConfig.foreignAutoCreate = databaseField.foreignAutoCreate();
        databaseFieldConfig.version = databaseField.version();
        databaseFieldConfig.foreignColumnName = valueIfNotBlank(databaseField.foreignColumnName());
        databaseFieldConfig.readOnly = databaseField.readOnly();
        return databaseFieldConfig;
    }

    public void postProcess() {
        if (this.foreignColumnName != null) {
            this.foreignAutoRefresh = true;
        }
        if (this.foreignAutoRefresh && this.maxForeignAutoRefreshLevel == -1) {
            this.maxForeignAutoRefreshLevel = 2;
        }
    }

    public static Enum<?> findMatchingEnumVal(Field field, String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        for (Enum<?> enumR : (Enum[]) field.getType().getEnumConstants()) {
            if (enumR.name().equals(str)) {
                return enumR;
            }
        }
        StringBuilder sb = new StringBuilder("Unknwown enum unknown name ");
        sb.append(str);
        sb.append(" for field ");
        sb.append(field);
        throw new IllegalArgumentException(sb.toString());
    }

    private static DatabaseFieldConfig fromForeignCollection(DatabaseType databaseType, Field field, ForeignCollectionField foreignCollectionField) {
        DatabaseFieldConfig databaseFieldConfig = new DatabaseFieldConfig();
        databaseFieldConfig.fieldName = field.getName();
        if (foreignCollectionField.columnName().length() > 0) {
            databaseFieldConfig.columnName = foreignCollectionField.columnName();
        }
        databaseFieldConfig.foreignCollection = true;
        databaseFieldConfig.foreignCollectionEager = foreignCollectionField.eager();
        databaseFieldConfig.foreignCollectionMaxEagerLevel = foreignCollectionField.maxEagerLevel();
        databaseFieldConfig.foreignCollectionOrderColumnName = valueIfNotBlank(foreignCollectionField.orderColumnName());
        databaseFieldConfig.foreignCollectionOrderAscending = foreignCollectionField.orderAscending();
        databaseFieldConfig.foreignCollectionColumnName = valueIfNotBlank(foreignCollectionField.columnName());
        databaseFieldConfig.foreignCollectionForeignFieldName = valueIfNotBlank(foreignCollectionField.foreignFieldName());
        return databaseFieldConfig;
    }

    private String findIndexName(String str) {
        if (this.columnName == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_");
            sb.append(this.fieldName);
            sb.append("_idx");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("_");
        sb2.append(this.columnName);
        sb2.append("_idx");
        return sb2.toString();
    }

    private static String valueIfNotBlank(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    private static Method findMethodFromNames(Field field, boolean z, boolean z2, String... strArr) {
        int length = strArr.length;
        NoSuchMethodException noSuchMethodException = null;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            if (z) {
                try {
                    return field.getDeclaringClass().getMethod(str, new Class[0]);
                } catch (NoSuchMethodException e) {
                    if (noSuchMethodException == null) {
                        noSuchMethodException = e;
                    }
                    i++;
                }
            } else {
                return field.getDeclaringClass().getMethod(str, new Class[]{field.getType()});
            }
        }
        if (!z2) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Could not find appropriate ");
        sb.append(z ? ContactEventType.CONTACT_GET : "set");
        sb.append(" method for ");
        sb.append(field);
        throw new IllegalArgumentException(sb.toString(), noSuchMethodException);
    }

    private static String methodFromField(Field field, String str, Locale locale) {
        String str2;
        String name = field.getName();
        String substring = name.substring(0, 1);
        if (locale == null) {
            str2 = substring.toUpperCase();
        } else {
            str2 = substring.toUpperCase(locale);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(name, 1, name.length());
        return sb.toString();
    }
}
