package com.j256.ormlite.table;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.misc.IOUtils;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.stmt.StatementBuilder;
import com.j256.ormlite.support.CompiledStatement;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.support.DatabaseResults;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class TableUtils {
    private static Logger logger = LoggerFactory.getLogger((Class<?>) TableUtils.class);
    private static final FieldType[] noFieldTypes = new FieldType[0];

    private TableUtils() {
    }

    public static <T> int createTable(ConnectionSource connectionSource, Class<T> cls) throws SQLException {
        return doCreateTable(DaoManager.createDao(connectionSource, cls), false);
    }

    public static int createTable(Dao<?, ?> dao) throws SQLException {
        return doCreateTable(dao, false);
    }

    public static <T> int createTableIfNotExists(ConnectionSource connectionSource, Class<T> cls) throws SQLException {
        return doCreateTable(DaoManager.createDao(connectionSource, cls), true);
    }

    public static <T> int createTable(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig) throws SQLException {
        return doCreateTable(DaoManager.createDao(connectionSource, databaseTableConfig), false);
    }

    public static <T> int createTableIfNotExists(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig) throws SQLException {
        return doCreateTable(DaoManager.createDao(connectionSource, databaseTableConfig), true);
    }

    public static <T, ID> List<String> getCreateTableStatements(ConnectionSource connectionSource, Class<T> cls) throws SQLException {
        Dao createDao = DaoManager.createDao(connectionSource, cls);
        if (createDao instanceof BaseDaoImpl) {
            return addCreateTableStatements(connectionSource, ((BaseDaoImpl) createDao).getTableInfo(), false);
        }
        return addCreateTableStatements(connectionSource, new TableInfo(connectionSource, (BaseDaoImpl) null, cls), false);
    }

    public static <T, ID> List<String> getCreateTableStatements(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig) throws SQLException {
        Dao createDao = DaoManager.createDao(connectionSource, databaseTableConfig);
        if (createDao instanceof BaseDaoImpl) {
            return addCreateTableStatements(connectionSource, ((BaseDaoImpl) createDao).getTableInfo(), false);
        }
        databaseTableConfig.extractFieldTypes(connectionSource);
        return addCreateTableStatements(connectionSource, new TableInfo(connectionSource.getDatabaseType(), (BaseDaoImpl) null, databaseTableConfig), false);
    }

    public static <T, ID> int dropTable(ConnectionSource connectionSource, Class<T> cls, boolean z) throws SQLException {
        return dropTable(DaoManager.createDao(connectionSource, cls), z);
    }

    public static <T, ID> int dropTable(Dao<T, ID> dao, boolean z) throws SQLException {
        ConnectionSource connectionSource = dao.getConnectionSource();
        Class<T> dataClass = dao.getDataClass();
        DatabaseType databaseType = connectionSource.getDatabaseType();
        if (dao instanceof BaseDaoImpl) {
            return doDropTable(databaseType, connectionSource, ((BaseDaoImpl) dao).getTableInfo(), z);
        }
        return doDropTable(databaseType, connectionSource, new TableInfo(connectionSource, (BaseDaoImpl) null, dataClass), z);
    }

    public static <T, ID> int dropTable(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig, boolean z) throws SQLException {
        DatabaseType databaseType = connectionSource.getDatabaseType();
        Dao createDao = DaoManager.createDao(connectionSource, databaseTableConfig);
        if (createDao instanceof BaseDaoImpl) {
            return doDropTable(databaseType, connectionSource, ((BaseDaoImpl) createDao).getTableInfo(), z);
        }
        databaseTableConfig.extractFieldTypes(connectionSource);
        return doDropTable(databaseType, connectionSource, new TableInfo(databaseType, (BaseDaoImpl) null, databaseTableConfig), z);
    }

    public static <T> int clearTable(ConnectionSource connectionSource, Class<T> cls) throws SQLException {
        String extractTableName = DatabaseTableConfig.extractTableName(cls);
        DatabaseType databaseType = connectionSource.getDatabaseType();
        if (databaseType.isEntityNamesMustBeUpCase()) {
            extractTableName = databaseType.upCaseEntityName(extractTableName);
        }
        return clearTable(connectionSource, extractTableName);
    }

    public static <T> int clearTable(ConnectionSource connectionSource, DatabaseTableConfig<T> databaseTableConfig) throws SQLException {
        return clearTable(connectionSource, databaseTableConfig.getTableName());
    }

    private static <T> int clearTable(ConnectionSource connectionSource, String str) throws SQLException {
        DatabaseType databaseType = connectionSource.getDatabaseType();
        StringBuilder sb = new StringBuilder(48);
        if (databaseType.isTruncateSupported()) {
            sb.append("TRUNCATE TABLE ");
        } else {
            sb.append("DELETE FROM ");
        }
        databaseType.appendEscapedEntityName(sb, str);
        String obj = sb.toString();
        logger.info("clearing table '{}' with '{}", (Object) str, (Object) obj);
        CompiledStatement compiledStatement = null;
        DatabaseConnection readWriteConnection = connectionSource.getReadWriteConnection(str);
        try {
            compiledStatement = readWriteConnection.compileStatement(obj, StatementBuilder.StatementType.EXECUTE, noFieldTypes, -1, false);
            return compiledStatement.runExecute();
        } finally {
            IOUtils.closeThrowSqlException(compiledStatement, "compiled statement");
            connectionSource.releaseConnection(readWriteConnection);
        }
    }

    private static <T, ID> int doDropTable(DatabaseType databaseType, ConnectionSource connectionSource, TableInfo<T, ID> tableInfo, boolean z) throws SQLException {
        logger.info("dropping table '{}'", (Object) tableInfo.getTableName());
        ArrayList arrayList = new ArrayList();
        addDropIndexStatements(databaseType, tableInfo, arrayList);
        addDropTableStatements(databaseType, tableInfo, arrayList);
        DatabaseConnection readWriteConnection = connectionSource.getReadWriteConnection(tableInfo.getTableName());
        try {
            return doStatements(readWriteConnection, "drop", arrayList, z, databaseType.isCreateTableReturnsNegative(), false);
        } finally {
            connectionSource.releaseConnection(readWriteConnection);
        }
    }

    private static <T, ID> void addDropIndexStatements(DatabaseType databaseType, TableInfo<T, ID> tableInfo, List<String> list) {
        HashSet<String> hashSet = new HashSet<>();
        for (FieldType fieldType : tableInfo.getFieldTypes()) {
            String indexName = fieldType.getIndexName();
            if (indexName != null) {
                hashSet.add(indexName);
            }
            String uniqueIndexName = fieldType.getUniqueIndexName();
            if (uniqueIndexName != null) {
                hashSet.add(uniqueIndexName);
            }
        }
        StringBuilder sb = new StringBuilder(48);
        for (String str : hashSet) {
            logger.info("dropping index '{}' for table '{}", (Object) str, (Object) tableInfo.getTableName());
            sb.append("DROP INDEX ");
            databaseType.appendEscapedEntityName(sb, str);
            list.add(sb.toString());
            sb.setLength(0);
        }
    }

    private static <T, ID> void addCreateIndexStatements(DatabaseType databaseType, TableInfo<T, ID> tableInfo, List<String> list, boolean z, boolean z2) {
        String str;
        HashMap hashMap = new HashMap();
        for (FieldType fieldType : tableInfo.getFieldTypes()) {
            if (z2) {
                str = fieldType.getUniqueIndexName();
            } else {
                str = fieldType.getIndexName();
            }
            if (str != null) {
                List list2 = (List) hashMap.get(str);
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap.put(str, list2);
                }
                list2.add(fieldType.getColumnName());
            }
        }
        StringBuilder sb = new StringBuilder(128);
        for (Map.Entry entry : hashMap.entrySet()) {
            logger.info("creating index '{}' for table '{}", entry.getKey(), (Object) tableInfo.getTableName());
            sb.append("CREATE ");
            if (z2) {
                sb.append("UNIQUE ");
            }
            sb.append("INDEX ");
            if (z && databaseType.isCreateIndexIfNotExistsSupported()) {
                sb.append("IF NOT EXISTS ");
            }
            databaseType.appendEscapedEntityName(sb, (String) entry.getKey());
            sb.append(" ON ");
            databaseType.appendEscapedEntityName(sb, tableInfo.getTableName());
            sb.append(" ( ");
            boolean z3 = true;
            for (String str2 : (List) entry.getValue()) {
                if (z3) {
                    z3 = false;
                } else {
                    sb.append(", ");
                }
                databaseType.appendEscapedEntityName(sb, str2);
            }
            sb.append(" )");
            list.add(sb.toString());
            sb.setLength(0);
        }
    }

    private static <T, ID> void addDropTableStatements(DatabaseType databaseType, TableInfo<T, ID> tableInfo, List<String> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (FieldType dropColumnArg : tableInfo.getFieldTypes()) {
            databaseType.dropColumnArg(dropColumnArg, arrayList, arrayList2);
        }
        StringBuilder sb = new StringBuilder(64);
        sb.append("DROP TABLE ");
        databaseType.appendEscapedEntityName(sb, tableInfo.getTableName());
        sb.append(' ');
        list.addAll(arrayList);
        list.add(sb.toString());
        list.addAll(arrayList2);
    }

    private static <T, ID> int doCreateTable(Dao<T, ID> dao, boolean z) throws SQLException {
        if (dao instanceof BaseDaoImpl) {
            return doCreateTable(dao.getConnectionSource(), ((BaseDaoImpl) dao).getTableInfo(), z);
        }
        return doCreateTable(dao.getConnectionSource(), new TableInfo(dao.getConnectionSource(), (BaseDaoImpl) null, dao.getDataClass()), z);
    }

    private static <T, ID> int doCreateTable(ConnectionSource connectionSource, TableInfo<T, ID> tableInfo, boolean z) throws SQLException {
        DatabaseType databaseType = connectionSource.getDatabaseType();
        logger.info("creating table '{}'", (Object) tableInfo.getTableName());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        addCreateTableStatements(databaseType, tableInfo, arrayList, arrayList2, z);
        DatabaseConnection readWriteConnection = connectionSource.getReadWriteConnection(tableInfo.getTableName());
        try {
            return doStatements(readWriteConnection, "create", arrayList, false, databaseType.isCreateTableReturnsNegative(), databaseType.isCreateTableReturnsZero()) + doCreateTestQueries(readWriteConnection, databaseType, arrayList2);
        } finally {
            connectionSource.releaseConnection(readWriteConnection);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int doStatements(com.j256.ormlite.support.DatabaseConnection r14, java.lang.String r15, java.util.Collection<java.lang.String> r16, boolean r17, boolean r18, boolean r19) throws java.sql.SQLException {
        /*
            r1 = r15
            java.lang.String r2 = "compiled statement"
            java.util.Iterator r3 = r16.iterator()
            r4 = 0
            r5 = 0
        L_0x0009:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r0 = r3.next()
            r12 = r0
            java.lang.String r12 = (java.lang.String) r12
            r13 = 0
            com.j256.ormlite.stmt.StatementBuilder$StatementType r8 = com.j256.ormlite.stmt.StatementBuilder.StatementType.EXECUTE     // Catch:{ SQLException -> 0x0037 }
            com.j256.ormlite.field.FieldType[] r9 = noFieldTypes     // Catch:{ SQLException -> 0x0037 }
            r10 = -1
            r11 = 0
            r6 = r14
            r7 = r12
            com.j256.ormlite.support.CompiledStatement r13 = r6.compileStatement(r7, r8, r9, r10, r11)     // Catch:{ SQLException -> 0x0037 }
            int r6 = r13.runExecute()     // Catch:{ SQLException -> 0x0037 }
            com.j256.ormlite.logger.Logger r0 = logger     // Catch:{ SQLException -> 0x0033 }
            java.lang.String r7 = "executed {} table statement changed {} rows: {}"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)     // Catch:{ SQLException -> 0x0033 }
            r0.info((java.lang.String) r7, (java.lang.Object) r15, (java.lang.Object) r8, (java.lang.Object) r12)     // Catch:{ SQLException -> 0x0033 }
            goto L_0x0042
        L_0x0033:
            r0 = move-exception
            goto L_0x0039
        L_0x0035:
            r0 = move-exception
            goto L_0x009f
        L_0x0037:
            r0 = move-exception
            r6 = 0
        L_0x0039:
            if (r17 == 0) goto L_0x0090
            com.j256.ormlite.logger.Logger r7 = logger     // Catch:{ all -> 0x0035 }
            java.lang.String r8 = "ignoring {} error '{}' for statement: {}"
            r7.info((java.lang.String) r8, (java.lang.Object) r15, (java.lang.Object) r0, (java.lang.Object) r12)     // Catch:{ all -> 0x0035 }
        L_0x0042:
            com.j256.ormlite.misc.IOUtils.closeThrowSqlException(r13, r2)
            if (r6 >= 0) goto L_0x006b
            if (r18 == 0) goto L_0x004a
            goto L_0x008c
        L_0x004a:
            java.sql.SQLException r0 = new java.sql.SQLException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SQL statement "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r2 = " updated "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = " rows, we were expecting >= 0"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x006b:
            if (r6 <= 0) goto L_0x008c
            if (r19 != 0) goto L_0x0070
            goto L_0x008c
        L_0x0070:
            java.sql.SQLException r0 = new java.sql.SQLException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SQL statement updated "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r2 = " rows, we were expecting == 0: "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008c:
            int r5 = r5 + 1
            goto L_0x0009
        L_0x0090:
            java.lang.String r1 = "SQL statement failed: "
            java.lang.String r3 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = r1.concat(r3)     // Catch:{ all -> 0x0035 }
            java.sql.SQLException r0 = com.j256.ormlite.misc.SqlExceptionUtil.create(r1, r0)     // Catch:{ all -> 0x0035 }
            throw r0     // Catch:{ all -> 0x0035 }
        L_0x009f:
            com.j256.ormlite.misc.IOUtils.closeThrowSqlException(r13, r2)
            throw r0
        L_0x00a3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.table.TableUtils.doStatements(com.j256.ormlite.support.DatabaseConnection, java.lang.String, java.util.Collection, boolean, boolean, boolean):int");
    }

    private static int doCreateTestQueries(DatabaseConnection databaseConnection, DatabaseType databaseType, List<String> list) throws SQLException {
        int i = 0;
        for (String next : list) {
            CompiledStatement compiledStatement = null;
            try {
                CompiledStatement compileStatement = databaseConnection.compileStatement(next, StatementBuilder.StatementType.SELECT, noFieldTypes, -1, false);
                try {
                    DatabaseResults runQuery = compileStatement.runQuery((ObjectCache) null);
                    int i2 = 0;
                    for (boolean first = runQuery.first(); first; first = runQuery.next()) {
                        i2++;
                    }
                    logger.info("executing create table after-query got {} results: {}", (Object) Integer.valueOf(i2), (Object) next);
                    IOUtils.closeThrowSqlException(compileStatement, "compiled statement");
                    i++;
                } catch (SQLException e) {
                    e = e;
                    compiledStatement = compileStatement;
                    try {
                        throw SqlExceptionUtil.create("executing create table after-query failed: ".concat(String.valueOf(next)), e);
                    } catch (Throwable th) {
                        th = th;
                        IOUtils.closeThrowSqlException(compiledStatement, "compiled statement");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    compiledStatement = compileStatement;
                    IOUtils.closeThrowSqlException(compiledStatement, "compiled statement");
                    throw th;
                }
            } catch (SQLException e2) {
                e = e2;
                throw SqlExceptionUtil.create("executing create table after-query failed: ".concat(String.valueOf(next)), e);
            }
        }
        return i;
    }

    private static <T, ID> List<String> addCreateTableStatements(ConnectionSource connectionSource, TableInfo<T, ID> tableInfo, boolean z) throws SQLException {
        ArrayList arrayList = new ArrayList();
        addCreateTableStatements(connectionSource.getDatabaseType(), tableInfo, arrayList, new ArrayList(), z);
        return arrayList;
    }

    private static <T, ID> void addCreateTableStatements(DatabaseType databaseType, TableInfo<T, ID> tableInfo, List<String> list, List<String> list2, boolean z) throws SQLException {
        FieldType[] fieldTypeArr;
        int i;
        int i2;
        boolean z2;
        DatabaseType databaseType2 = databaseType;
        TableInfo<T, ID> tableInfo2 = tableInfo;
        List<String> list3 = list;
        boolean z3 = z;
        StringBuilder sb = new StringBuilder(256);
        sb.append("CREATE TABLE ");
        if (z3 && databaseType.isCreateIfNotExistsSupported()) {
            sb.append("IF NOT EXISTS ");
        }
        databaseType2.appendEscapedEntityName(sb, tableInfo.getTableName());
        sb.append(" (");
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        FieldType[] fieldTypes = tableInfo.getFieldTypes();
        int length = fieldTypes.length;
        boolean z4 = true;
        int i3 = 0;
        while (i3 < length) {
            FieldType fieldType = fieldTypes[i3];
            if (!fieldType.isForeignCollection()) {
                if (z4) {
                    z2 = false;
                } else {
                    sb.append(", ");
                    z2 = z4;
                }
                String columnDefinition = fieldType.getColumnDefinition();
                if (columnDefinition == null) {
                    i2 = i3;
                    i = length;
                    fieldTypeArr = fieldTypes;
                    databaseType.appendColumnArg(tableInfo.getTableName(), sb, fieldType, arrayList, arrayList2, arrayList3, list2);
                } else {
                    i2 = i3;
                    i = length;
                    fieldTypeArr = fieldTypes;
                    databaseType2.appendEscapedEntityName(sb, fieldType.getColumnName());
                    sb.append(' ');
                    sb.append(columnDefinition);
                    sb.append(' ');
                }
                z4 = z2;
            } else {
                i2 = i3;
                i = length;
                fieldTypeArr = fieldTypes;
            }
            i3 = i2 + 1;
            TableInfo<T, ID> tableInfo3 = tableInfo;
            length = i;
            fieldTypes = fieldTypeArr;
        }
        DatabaseType databaseType3 = databaseType;
        String str = ", ";
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        ArrayList arrayList6 = arrayList3;
        List<String> list4 = list2;
        databaseType3.addPrimaryKeySql(tableInfo.getFieldTypes(), arrayList4, arrayList5, arrayList6, list4);
        databaseType3.addUniqueComboSql(tableInfo.getFieldTypes(), arrayList4, arrayList5, arrayList6, list4);
        for (String append : arrayList) {
            sb.append(str);
            sb.append(append);
        }
        sb.append(") ");
        databaseType2.appendCreateTableSuffix(sb);
        list3.addAll(arrayList2);
        list3.add(sb.toString());
        list3.addAll(arrayList3);
        TableInfo<T, ID> tableInfo4 = tableInfo;
        addCreateIndexStatements(databaseType2, tableInfo4, list3, z3, false);
        addCreateIndexStatements(databaseType2, tableInfo4, list3, z3, true);
    }
}
