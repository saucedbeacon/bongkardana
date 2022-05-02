package com.j256.ormlite.table;

import com.j256.ormlite.field.DatabaseFieldConfig;
import com.j256.ormlite.field.DatabaseFieldConfigLoader;
import com.j256.ormlite.misc.SqlExceptionUtil;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseTableConfigLoader {
    private static final String CONFIG_FILE_END_MARKER = "# --table-end--";
    private static final String CONFIG_FILE_FIELDS_END = "# --table-fields-end--";
    private static final String CONFIG_FILE_FIELDS_START = "# --table-fields-start--";
    private static final String CONFIG_FILE_START_MARKER = "# --table-start--";
    private static final String FIELD_NAME_DATA_CLASS = "dataClass";
    private static final String FIELD_NAME_TABLE_NAME = "tableName";

    public static List<DatabaseTableConfig<?>> loadDatabaseConfigFromReader(BufferedReader bufferedReader) throws SQLException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            DatabaseTableConfig fromReader = fromReader(bufferedReader);
            if (fromReader == null) {
                return arrayList;
            }
            arrayList.add(fromReader);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> com.j256.ormlite.table.DatabaseTableConfig<T> fromReader(java.io.BufferedReader r7) throws java.sql.SQLException {
        /*
            com.j256.ormlite.table.DatabaseTableConfig r0 = new com.j256.ormlite.table.DatabaseTableConfig
            r0.<init>()
            r1 = 1
            r2 = 0
            r3 = 0
        L_0x0008:
            java.lang.String r4 = r7.readLine()     // Catch:{ IOException -> 0x0061 }
            if (r4 == 0) goto L_0x005c
            java.lang.String r5 = "# --table-end--"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x005c
            java.lang.String r5 = "# --table-fields-start--"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0022
            readFields(r7, r0)
            goto L_0x0008
        L_0x0022:
            int r5 = r4.length()
            if (r5 == 0) goto L_0x0008
            java.lang.String r5 = "#"
            boolean r5 = r4.startsWith(r5)
            if (r5 != 0) goto L_0x0008
            java.lang.String r5 = "# --table-start--"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0008
            r3 = -2
            java.lang.String r5 = "="
            java.lang.String[] r3 = r4.split(r5, r3)
            int r5 = r3.length
            r6 = 2
            if (r5 != r6) goto L_0x004c
            r4 = r3[r2]
            r3 = r3[r1]
            readTableField(r0, r4, r3)
            r3 = 1
            goto L_0x0008
        L_0x004c:
            java.sql.SQLException r7 = new java.sql.SQLException
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "DatabaseTableConfig reading from stream cannot parse line: "
            java.lang.String r0 = r1.concat(r0)
            r7.<init>(r0)
            throw r7
        L_0x005c:
            if (r3 == 0) goto L_0x005f
            return r0
        L_0x005f:
            r7 = 0
            return r7
        L_0x0061:
            r7 = move-exception
            java.lang.String r0 = "Could not read DatabaseTableConfig from stream"
            java.sql.SQLException r7 = com.j256.ormlite.misc.SqlExceptionUtil.create(r0, r7)
            goto L_0x006a
        L_0x0069:
            throw r7
        L_0x006a:
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.table.DatabaseTableConfigLoader.fromReader(java.io.BufferedReader):com.j256.ormlite.table.DatabaseTableConfig");
    }

    public static <T> void write(BufferedWriter bufferedWriter, DatabaseTableConfig<T> databaseTableConfig) throws SQLException {
        try {
            writeConfig(bufferedWriter, databaseTableConfig);
        } catch (IOException e) {
            throw SqlExceptionUtil.create("Could not write config to writer", e);
        }
    }

    private static <T> void writeConfig(BufferedWriter bufferedWriter, DatabaseTableConfig<T> databaseTableConfig) throws IOException, SQLException {
        bufferedWriter.append(CONFIG_FILE_START_MARKER);
        bufferedWriter.newLine();
        if (databaseTableConfig.getDataClass() != null) {
            bufferedWriter.append(FIELD_NAME_DATA_CLASS).append('=').append(databaseTableConfig.getDataClass().getName());
            bufferedWriter.newLine();
        }
        if (databaseTableConfig.getTableName() != null) {
            bufferedWriter.append(FIELD_NAME_TABLE_NAME).append('=').append(databaseTableConfig.getTableName());
            bufferedWriter.newLine();
        }
        bufferedWriter.append(CONFIG_FILE_FIELDS_START);
        bufferedWriter.newLine();
        if (databaseTableConfig.getFieldConfigs() != null) {
            for (DatabaseFieldConfig write : databaseTableConfig.getFieldConfigs()) {
                DatabaseFieldConfigLoader.write(bufferedWriter, write, databaseTableConfig.getTableName());
            }
        }
        bufferedWriter.append(CONFIG_FILE_FIELDS_END);
        bufferedWriter.newLine();
        bufferedWriter.append(CONFIG_FILE_END_MARKER);
        bufferedWriter.newLine();
    }

    private static <T> void readTableField(DatabaseTableConfig<T> databaseTableConfig, String str, String str2) {
        if (str.equals(FIELD_NAME_DATA_CLASS)) {
            try {
                databaseTableConfig.setDataClass(Class.forName(str2));
            } catch (ClassNotFoundException unused) {
                throw new IllegalArgumentException("Unknown class specified for dataClass: ".concat(String.valueOf(str2)));
            }
        } else if (str.equals(FIELD_NAME_TABLE_NAME)) {
            databaseTableConfig.setTableName(str2);
        }
    }

    private static <T> void readFields(BufferedReader bufferedReader, DatabaseTableConfig<T> databaseTableConfig) throws SQLException {
        DatabaseFieldConfig fromReader;
        ArrayList arrayList = new ArrayList();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null || readLine.equals(CONFIG_FILE_FIELDS_END) || (fromReader = DatabaseFieldConfigLoader.fromReader(bufferedReader)) == null) {
                    databaseTableConfig.setFieldConfigs(arrayList);
                } else {
                    arrayList.add(fromReader);
                }
            } catch (IOException e) {
                throw SqlExceptionUtil.create("Could not read next field from config file", e);
            }
        }
        databaseTableConfig.setFieldConfigs(arrayList);
    }
}
