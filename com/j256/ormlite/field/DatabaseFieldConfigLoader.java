package com.j256.ormlite.field;

import com.j256.ormlite.misc.SqlExceptionUtil;
import id.dana.sendmoney.summary.SummaryActivity;
import java.io.BufferedWriter;
import java.io.IOException;
import java.sql.SQLException;

public class DatabaseFieldConfigLoader {
    private static final String CONFIG_FILE_END_MARKER = "# --field-end--";
    private static final String CONFIG_FILE_START_MARKER = "# --field-start--";
    private static final DataPersister DEFAULT_DATA_PERSISTER = DatabaseFieldConfig.DEFAULT_DATA_TYPE.getDataPersister();
    private static final int DEFAULT_MAX_EAGER_FOREIGN_COLLECTION_LEVEL = 1;
    private static final String FIELD_NAME_ALLOW_GENERATED_ID_INSERT = "allowGeneratedIdInsert";
    private static final String FIELD_NAME_CAN_BE_NULL = "canBeNull";
    private static final String FIELD_NAME_COLUMN_DEFINITION = "columnDefinition";
    private static final String FIELD_NAME_COLUMN_NAME = "columnName";
    private static final String FIELD_NAME_DATA_PERSISTER = "dataPersister";
    private static final String FIELD_NAME_DEFAULT_VALUE = "defaultValue";
    private static final String FIELD_NAME_FIELD_NAME = "fieldName";
    private static final String FIELD_NAME_FOREIGN = "foreign";
    private static final String FIELD_NAME_FOREIGN_AUTO_CREATE = "foreignAutoCreate";
    private static final String FIELD_NAME_FOREIGN_AUTO_REFRESH = "foreignAutoRefresh";
    private static final String FIELD_NAME_FOREIGN_COLLECTION = "foreignCollection";
    private static final String FIELD_NAME_FOREIGN_COLLECTION_COLUMN_NAME = "foreignCollectionColumnName";
    private static final String FIELD_NAME_FOREIGN_COLLECTION_EAGER = "foreignCollectionEager";
    private static final String FIELD_NAME_FOREIGN_COLLECTION_FOREIGN_FIELD_NAME = "foreignCollectionForeignFieldName";
    private static final String FIELD_NAME_FOREIGN_COLLECTION_FOREIGN_FIELD_NAME_OLD = "foreignCollectionForeignColumnName";
    private static final String FIELD_NAME_FOREIGN_COLLECTION_ORDER_ASCENDING = "foreignCollectionOrderAscending";
    private static final String FIELD_NAME_FOREIGN_COLLECTION_ORDER_COLUMN_NAME = "foreignCollectionOrderColumnName";
    private static final String FIELD_NAME_FOREIGN_COLLECTION_ORDER_COLUMN_NAME_OLD = "foreignCollectionOrderColumn";
    private static final String FIELD_NAME_FOREIGN_COLUMN_NAME = "foreignColumnName";
    private static final String FIELD_NAME_FORMAT = "format";
    private static final String FIELD_NAME_GENERATED_ID = "generatedId";
    private static final String FIELD_NAME_GENERATED_ID_SEQUENCE = "generatedIdSequence";
    private static final String FIELD_NAME_ID = "id";
    private static final String FIELD_NAME_INDEX = "index";
    private static final String FIELD_NAME_INDEX_NAME = "indexName";
    private static final String FIELD_NAME_MAX_EAGER_FOREIGN_COLLECTION_LEVEL = "foreignCollectionMaxEagerLevel";
    private static final String FIELD_NAME_MAX_EAGER_FOREIGN_COLLECTION_LEVEL_OLD = "maxEagerForeignCollectionLevel";
    private static final String FIELD_NAME_MAX_FOREIGN_AUTO_REFRESH_LEVEL = "maxForeignAutoRefreshLevel";
    private static final String FIELD_NAME_PERSISTER_CLASS = "persisterClass";
    private static final String FIELD_NAME_READ_ONLY = "readOnly";
    private static final String FIELD_NAME_THROW_IF_NULL = "throwIfNull";
    private static final String FIELD_NAME_UNIQUE = "unique";
    private static final String FIELD_NAME_UNIQUE_COMBO = "uniqueCombo";
    private static final String FIELD_NAME_UNIQUE_INDEX = "uniqueIndex";
    private static final String FIELD_NAME_UNIQUE_INDEX_NAME = "uniqueIndexName";
    private static final String FIELD_NAME_UNKNOWN_ENUM_VALUE = "unknownEnumValue";
    private static final String FIELD_NAME_USE_GET_SET = "useGetSet";
    private static final String FIELD_NAME_VERSION = "version";
    private static final String FIELD_NAME_WIDTH = "width";

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.j256.ormlite.field.DatabaseFieldConfig fromReader(java.io.BufferedReader r7) throws java.sql.SQLException {
        /*
            com.j256.ormlite.field.DatabaseFieldConfig r0 = new com.j256.ormlite.field.DatabaseFieldConfig
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = 0
        L_0x0008:
            java.lang.String r4 = r7.readLine()     // Catch:{ IOException -> 0x0055 }
            if (r4 == 0) goto L_0x0050
            java.lang.String r5 = "# --field-end--"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0050
            int r5 = r4.length()
            if (r5 == 0) goto L_0x0008
            java.lang.String r5 = "#"
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L_0x0008
            java.lang.String r5 = "# --field-start--"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0008
            r3 = -2
            java.lang.String r5 = "="
            java.lang.String[] r3 = r4.split(r5, r3)
            int r5 = r3.length
            r6 = 2
            if (r5 != r6) goto L_0x0040
            r4 = r3[r2]
            r3 = r3[r1]
            readField(r0, r4, r3)
            r3 = 1
            goto L_0x0008
        L_0x0040:
            java.sql.SQLException r7 = new java.sql.SQLException
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "DatabaseFieldConfig reading from stream cannot parse line: "
            java.lang.String r0 = r1.concat(r0)
            r7.<init>(r0)
            throw r7
        L_0x0050:
            if (r3 == 0) goto L_0x0053
            return r0
        L_0x0053:
            r7 = 0
            return r7
        L_0x0055:
            r7 = move-exception
            java.lang.String r0 = "Could not read DatabaseFieldConfig from stream"
            java.sql.SQLException r7 = com.j256.ormlite.misc.SqlExceptionUtil.create(r0, r7)
            goto L_0x005e
        L_0x005d:
            throw r7
        L_0x005e:
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.field.DatabaseFieldConfigLoader.fromReader(java.io.BufferedReader):com.j256.ormlite.field.DatabaseFieldConfig");
    }

    public static void write(BufferedWriter bufferedWriter, DatabaseFieldConfig databaseFieldConfig, String str) throws SQLException {
        try {
            writeConfig(bufferedWriter, databaseFieldConfig, str);
        } catch (IOException e) {
            throw SqlExceptionUtil.create("Could not write config to writer", e);
        }
    }

    public static void writeConfig(BufferedWriter bufferedWriter, DatabaseFieldConfig databaseFieldConfig, String str) throws IOException {
        bufferedWriter.append(CONFIG_FILE_START_MARKER);
        bufferedWriter.newLine();
        if (databaseFieldConfig.getFieldName() != null) {
            bufferedWriter.append(FIELD_NAME_FIELD_NAME).append('=').append(databaseFieldConfig.getFieldName());
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getColumnName() != null) {
            bufferedWriter.append(FIELD_NAME_COLUMN_NAME).append('=').append(databaseFieldConfig.getColumnName());
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getDataPersister() != DEFAULT_DATA_PERSISTER) {
            DataType[] values = DataType.values();
            int length = values.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                DataType dataType = values[i];
                if (dataType.getDataPersister() == databaseFieldConfig.getDataPersister()) {
                    bufferedWriter.append(FIELD_NAME_DATA_PERSISTER).append('=').append(dataType.name());
                    bufferedWriter.newLine();
                    z = true;
                    break;
                }
                i++;
            }
            if (!z) {
                StringBuilder sb = new StringBuilder("Unknown data persister field: ");
                sb.append(databaseFieldConfig.getDataPersister());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (databaseFieldConfig.getDefaultValue() != null) {
            bufferedWriter.append(FIELD_NAME_DEFAULT_VALUE).append('=').append(databaseFieldConfig.getDefaultValue());
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getWidth() != 0) {
            bufferedWriter.append(FIELD_NAME_WIDTH).append('=').append(Integer.toString(databaseFieldConfig.getWidth()));
            bufferedWriter.newLine();
        }
        if (!databaseFieldConfig.isCanBeNull()) {
            bufferedWriter.append(FIELD_NAME_CAN_BE_NULL).append('=').append(Boolean.toString(databaseFieldConfig.isCanBeNull()));
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isId()) {
            bufferedWriter.append("id").append('=').append(SummaryActivity.CHECKED);
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isGeneratedId()) {
            bufferedWriter.append(FIELD_NAME_GENERATED_ID).append('=').append(SummaryActivity.CHECKED);
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getGeneratedIdSequence() != null) {
            bufferedWriter.append(FIELD_NAME_GENERATED_ID_SEQUENCE).append('=').append(databaseFieldConfig.getGeneratedIdSequence());
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isForeign()) {
            bufferedWriter.append(FIELD_NAME_FOREIGN).append('=').append(SummaryActivity.CHECKED);
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isUseGetSet()) {
            bufferedWriter.append(FIELD_NAME_USE_GET_SET).append('=').append(SummaryActivity.CHECKED);
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getUnknownEnumValue() != null) {
            bufferedWriter.append(FIELD_NAME_UNKNOWN_ENUM_VALUE).append('=').append(databaseFieldConfig.getUnknownEnumValue().getDeclaringClass().getName()).append('#').append(databaseFieldConfig.getUnknownEnumValue().name());
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isThrowIfNull()) {
            bufferedWriter.append(FIELD_NAME_THROW_IF_NULL).append('=').append(SummaryActivity.CHECKED);
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getFormat() != null) {
            bufferedWriter.append(FIELD_NAME_FORMAT).append('=').append(databaseFieldConfig.getFormat());
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isUnique()) {
            bufferedWriter.append(FIELD_NAME_UNIQUE).append('=').append(SummaryActivity.CHECKED);
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isUniqueCombo()) {
            bufferedWriter.append(FIELD_NAME_UNIQUE_COMBO).append('=').append(SummaryActivity.CHECKED);
            bufferedWriter.newLine();
        }
        String indexName = databaseFieldConfig.getIndexName(str);
        if (indexName != null) {
            bufferedWriter.append(FIELD_NAME_INDEX_NAME).append('=').append(indexName);
            bufferedWriter.newLine();
        }
        String uniqueIndexName = databaseFieldConfig.getUniqueIndexName(str);
        if (uniqueIndexName != null) {
            bufferedWriter.append(FIELD_NAME_UNIQUE_INDEX_NAME).append('=').append(uniqueIndexName);
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isForeignAutoRefresh()) {
            bufferedWriter.append(FIELD_NAME_FOREIGN_AUTO_REFRESH).append('=').append(SummaryActivity.CHECKED);
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getMaxForeignAutoRefreshLevel() != -1) {
            bufferedWriter.append(FIELD_NAME_MAX_FOREIGN_AUTO_REFRESH_LEVEL).append('=').append(Integer.toString(databaseFieldConfig.getMaxForeignAutoRefreshLevel()));
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getPersisterClass() != DatabaseFieldConfig.DEFAULT_PERSISTER_CLASS) {
            bufferedWriter.append(FIELD_NAME_PERSISTER_CLASS).append('=').append(databaseFieldConfig.getPersisterClass().getName());
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isAllowGeneratedIdInsert()) {
            bufferedWriter.append(FIELD_NAME_ALLOW_GENERATED_ID_INSERT).append('=').append(SummaryActivity.CHECKED);
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getColumnDefinition() != null) {
            bufferedWriter.append(FIELD_NAME_COLUMN_DEFINITION).append('=').append(databaseFieldConfig.getColumnDefinition());
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isForeignAutoCreate()) {
            bufferedWriter.append(FIELD_NAME_FOREIGN_AUTO_CREATE).append('=').append(SummaryActivity.CHECKED);
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isVersion()) {
            bufferedWriter.append("version").append('=').append(SummaryActivity.CHECKED);
            bufferedWriter.newLine();
        }
        String foreignColumnName = databaseFieldConfig.getForeignColumnName();
        if (foreignColumnName != null) {
            bufferedWriter.append(FIELD_NAME_FOREIGN_COLUMN_NAME).append('=').append(foreignColumnName);
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isReadOnly()) {
            bufferedWriter.append(FIELD_NAME_READ_ONLY).append('=').append(SummaryActivity.CHECKED);
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isForeignCollection()) {
            bufferedWriter.append(FIELD_NAME_FOREIGN_COLLECTION).append('=').append(SummaryActivity.CHECKED);
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.isForeignCollectionEager()) {
            bufferedWriter.append(FIELD_NAME_FOREIGN_COLLECTION_EAGER).append('=').append(SummaryActivity.CHECKED);
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getForeignCollectionMaxEagerLevel() != 1) {
            bufferedWriter.append(FIELD_NAME_MAX_EAGER_FOREIGN_COLLECTION_LEVEL).append('=').append(Integer.toString(databaseFieldConfig.getForeignCollectionMaxEagerLevel()));
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getForeignCollectionColumnName() != null) {
            bufferedWriter.append(FIELD_NAME_FOREIGN_COLLECTION_COLUMN_NAME).append('=').append(databaseFieldConfig.getForeignCollectionColumnName());
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getForeignCollectionOrderColumnName() != null) {
            bufferedWriter.append(FIELD_NAME_FOREIGN_COLLECTION_ORDER_COLUMN_NAME).append('=').append(databaseFieldConfig.getForeignCollectionOrderColumnName());
            bufferedWriter.newLine();
        }
        if (!databaseFieldConfig.isForeignCollectionOrderAscending()) {
            bufferedWriter.append(FIELD_NAME_FOREIGN_COLLECTION_ORDER_ASCENDING).append('=').append(Boolean.toString(databaseFieldConfig.isForeignCollectionOrderAscending()));
            bufferedWriter.newLine();
        }
        if (databaseFieldConfig.getForeignCollectionForeignFieldName() != null) {
            bufferedWriter.append(FIELD_NAME_FOREIGN_COLLECTION_FOREIGN_FIELD_NAME).append('=').append(databaseFieldConfig.getForeignCollectionForeignFieldName());
            bufferedWriter.newLine();
        }
        bufferedWriter.append(CONFIG_FILE_END_MARKER);
        bufferedWriter.newLine();
    }

    private static void readField(DatabaseFieldConfig databaseFieldConfig, String str, String str2) {
        if (str.equals(FIELD_NAME_FIELD_NAME)) {
            databaseFieldConfig.setFieldName(str2);
        } else if (str.equals(FIELD_NAME_COLUMN_NAME)) {
            databaseFieldConfig.setColumnName(str2);
        } else if (str.equals(FIELD_NAME_DATA_PERSISTER)) {
            databaseFieldConfig.setDataPersister(DataType.valueOf(str2).getDataPersister());
        } else if (str.equals(FIELD_NAME_DEFAULT_VALUE)) {
            databaseFieldConfig.setDefaultValue(str2);
        } else if (str.equals(FIELD_NAME_WIDTH)) {
            databaseFieldConfig.setWidth(Integer.parseInt(str2));
        } else if (str.equals(FIELD_NAME_CAN_BE_NULL)) {
            databaseFieldConfig.setCanBeNull(Boolean.parseBoolean(str2));
        } else if (str.equals("id")) {
            databaseFieldConfig.setId(Boolean.parseBoolean(str2));
        } else if (str.equals(FIELD_NAME_GENERATED_ID)) {
            databaseFieldConfig.setGeneratedId(Boolean.parseBoolean(str2));
        } else if (str.equals(FIELD_NAME_GENERATED_ID_SEQUENCE)) {
            databaseFieldConfig.setGeneratedIdSequence(str2);
        } else if (str.equals(FIELD_NAME_FOREIGN)) {
            databaseFieldConfig.setForeign(Boolean.parseBoolean(str2));
        } else if (str.equals(FIELD_NAME_USE_GET_SET)) {
            databaseFieldConfig.setUseGetSet(Boolean.parseBoolean(str2));
        } else if (str.equals(FIELD_NAME_UNKNOWN_ENUM_VALUE)) {
            String[] split = str2.split("#", -2);
            if (split.length == 2) {
                try {
                    Object[] enumConstants = Class.forName(split[0]).getEnumConstants();
                    if (enumConstants != null) {
                        boolean z = false;
                        for (Enum enumR : (Enum[]) enumConstants) {
                            if (enumR.name().equals(split[1])) {
                                databaseFieldConfig.setUnknownEnumValue(enumR);
                                z = true;
                            }
                        }
                        if (!z) {
                            throw new IllegalArgumentException("Invalid enum value name for unknownEnumvalue: ".concat(String.valueOf(str2)));
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Invalid class is not an Enum for unknownEnumValue: ".concat(String.valueOf(str2)));
                } catch (ClassNotFoundException unused) {
                    throw new IllegalArgumentException("Unknown class specified for unknownEnumValue: ".concat(String.valueOf(str2)));
                }
            } else {
                throw new IllegalArgumentException("Invalid value for unknownEnumValue which should be in class#name format: ".concat(String.valueOf(str2)));
            }
        } else if (str.equals(FIELD_NAME_THROW_IF_NULL)) {
            databaseFieldConfig.setThrowIfNull(Boolean.parseBoolean(str2));
        } else if (str.equals(FIELD_NAME_FORMAT)) {
            databaseFieldConfig.setFormat(str2);
        } else if (str.equals(FIELD_NAME_UNIQUE)) {
            databaseFieldConfig.setUnique(Boolean.parseBoolean(str2));
        } else if (str.equals(FIELD_NAME_UNIQUE_COMBO)) {
            databaseFieldConfig.setUniqueCombo(Boolean.parseBoolean(str2));
        } else if (str.equals("index")) {
            databaseFieldConfig.setIndex(Boolean.parseBoolean(str2));
        } else if (str.equals(FIELD_NAME_INDEX_NAME)) {
            databaseFieldConfig.setIndex(true);
            databaseFieldConfig.setIndexName(str2);
        } else if (str.equals(FIELD_NAME_UNIQUE_INDEX)) {
            databaseFieldConfig.setUniqueIndex(Boolean.parseBoolean(str2));
        } else if (str.equals(FIELD_NAME_UNIQUE_INDEX_NAME)) {
            databaseFieldConfig.setUniqueIndex(true);
            databaseFieldConfig.setUniqueIndexName(str2);
        } else if (str.equals(FIELD_NAME_FOREIGN_AUTO_REFRESH)) {
            databaseFieldConfig.setForeignAutoRefresh(Boolean.parseBoolean(str2));
        } else if (str.equals(FIELD_NAME_MAX_FOREIGN_AUTO_REFRESH_LEVEL)) {
            databaseFieldConfig.setMaxForeignAutoRefreshLevel(Integer.parseInt(str2));
        } else if (str.equals(FIELD_NAME_PERSISTER_CLASS)) {
            try {
                databaseFieldConfig.setPersisterClass(Class.forName(str2));
            } catch (ClassNotFoundException unused2) {
                throw new IllegalArgumentException("Could not find persisterClass: ".concat(String.valueOf(str2)));
            }
        } else if (str.equals(FIELD_NAME_ALLOW_GENERATED_ID_INSERT)) {
            databaseFieldConfig.setAllowGeneratedIdInsert(Boolean.parseBoolean(str2));
        } else if (str.equals(FIELD_NAME_COLUMN_DEFINITION)) {
            databaseFieldConfig.setColumnDefinition(str2);
        } else if (str.equals(FIELD_NAME_FOREIGN_AUTO_CREATE)) {
            databaseFieldConfig.setForeignAutoCreate(Boolean.parseBoolean(str2));
        } else if (str.equals("version")) {
            databaseFieldConfig.setVersion(Boolean.parseBoolean(str2));
        } else if (str.equals(FIELD_NAME_FOREIGN_COLUMN_NAME)) {
            databaseFieldConfig.setForeignColumnName(str2);
        } else if (str.equals(FIELD_NAME_READ_ONLY)) {
            databaseFieldConfig.setReadOnly(Boolean.parseBoolean(str2));
        } else if (str.equals(FIELD_NAME_FOREIGN_COLLECTION)) {
            databaseFieldConfig.setForeignCollection(Boolean.parseBoolean(str2));
        } else if (str.equals(FIELD_NAME_FOREIGN_COLLECTION_EAGER)) {
            databaseFieldConfig.setForeignCollectionEager(Boolean.parseBoolean(str2));
        } else if (str.equals(FIELD_NAME_MAX_EAGER_FOREIGN_COLLECTION_LEVEL_OLD)) {
            databaseFieldConfig.setForeignCollectionMaxEagerLevel(Integer.parseInt(str2));
        } else if (str.equals(FIELD_NAME_MAX_EAGER_FOREIGN_COLLECTION_LEVEL)) {
            databaseFieldConfig.setForeignCollectionMaxEagerLevel(Integer.parseInt(str2));
        } else if (str.equals(FIELD_NAME_FOREIGN_COLLECTION_COLUMN_NAME)) {
            databaseFieldConfig.setForeignCollectionColumnName(str2);
        } else if (str.equals(FIELD_NAME_FOREIGN_COLLECTION_ORDER_COLUMN_NAME_OLD)) {
            databaseFieldConfig.setForeignCollectionOrderColumnName(str2);
        } else if (str.equals(FIELD_NAME_FOREIGN_COLLECTION_ORDER_COLUMN_NAME)) {
            databaseFieldConfig.setForeignCollectionOrderColumnName(str2);
        } else if (str.equals(FIELD_NAME_FOREIGN_COLLECTION_ORDER_ASCENDING)) {
            databaseFieldConfig.setForeignCollectionOrderAscending(Boolean.parseBoolean(str2));
        } else if (str.equals(FIELD_NAME_FOREIGN_COLLECTION_FOREIGN_FIELD_NAME_OLD)) {
            databaseFieldConfig.setForeignCollectionForeignFieldName(str2);
        } else if (str.equals(FIELD_NAME_FOREIGN_COLLECTION_FOREIGN_FIELD_NAME)) {
            databaseFieldConfig.setForeignCollectionForeignFieldName(str2);
        }
    }
}
