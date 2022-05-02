package com.j256.ormlite.stmt;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DatabaseResultsMapper;
import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.dao.RawRowMapper;
import com.j256.ormlite.dao.RawRowObjectMapper;
import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.misc.IOUtils;
import com.j256.ormlite.stmt.StatementBuilder;
import com.j256.ormlite.stmt.mapped.MappedCreate;
import com.j256.ormlite.stmt.mapped.MappedDelete;
import com.j256.ormlite.stmt.mapped.MappedDeleteCollection;
import com.j256.ormlite.stmt.mapped.MappedQueryForFieldEq;
import com.j256.ormlite.stmt.mapped.MappedRefresh;
import com.j256.ormlite.stmt.mapped.MappedUpdate;
import com.j256.ormlite.stmt.mapped.MappedUpdateId;
import com.j256.ormlite.support.CompiledStatement;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.support.DatabaseResults;
import com.j256.ormlite.table.TableInfo;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

public class StatementExecutor<T, ID> implements GenericRowMapper<String[]> {
    private static Logger logger = LoggerFactory.getLogger((Class<?>) StatementExecutor.class);
    private static final FieldType[] noFieldTypes = new FieldType[0];
    private String countStarQuery;
    private final Dao<T, ID> dao;
    private final DatabaseType databaseType;
    private FieldType[] ifExistsFieldTypes;
    private String ifExistsQuery;
    private final ThreadLocal<Boolean> localIsInBatchMode = new ThreadLocal<Boolean>() {
        /* access modifiers changed from: protected */
        public Boolean initialValue() {
            return Boolean.FALSE;
        }
    };
    private MappedDelete<T, ID> mappedDelete;
    private MappedCreate<T, ID> mappedInsert;
    private MappedQueryForFieldEq<T, ID> mappedQueryForId;
    private MappedRefresh<T, ID> mappedRefresh;
    private MappedUpdate<T, ID> mappedUpdate;
    private MappedUpdateId<T, ID> mappedUpdateId;
    private PreparedQuery<T> preparedQueryForAll;
    private RawRowMapper<T> rawRowMapper;
    private final TableInfo<T, ID> tableInfo;

    public StatementExecutor(DatabaseType databaseType2, TableInfo<T, ID> tableInfo2, Dao<T, ID> dao2) {
        this.databaseType = databaseType2;
        this.tableInfo = tableInfo2;
        this.dao = dao2;
    }

    public T queryForId(DatabaseConnection databaseConnection, ID id2, ObjectCache objectCache) throws SQLException {
        if (this.mappedQueryForId == null) {
            this.mappedQueryForId = MappedQueryForFieldEq.build(this.databaseType, this.tableInfo, (FieldType) null);
        }
        return this.mappedQueryForId.execute(databaseConnection, id2, objectCache);
    }

    public T queryForFirst(DatabaseConnection databaseConnection, PreparedStmt<T> preparedStmt, ObjectCache objectCache) throws SQLException {
        CompiledStatement compile = preparedStmt.compile(databaseConnection, StatementBuilder.StatementType.SELECT);
        DatabaseResults databaseResults = null;
        try {
            compile.setMaxRows(1);
            DatabaseResults runQuery = compile.runQuery(objectCache);
            try {
                if (runQuery.first()) {
                    logger.debug("query-for-first of '{}' returned at least 1 result", (Object) preparedStmt.getStatement());
                    T mapRow = preparedStmt.mapRow(runQuery);
                    IOUtils.closeThrowSqlException(runQuery, "results");
                    IOUtils.closeThrowSqlException(compile, "compiled statement");
                    return mapRow;
                }
                logger.debug("query-for-first of '{}' returned at 0 results", (Object) preparedStmt.getStatement());
                IOUtils.closeThrowSqlException(runQuery, "results");
                IOUtils.closeThrowSqlException(compile, "compiled statement");
                return null;
            } catch (Throwable th) {
                th = th;
                databaseResults = runQuery;
                IOUtils.closeThrowSqlException(databaseResults, "results");
                IOUtils.closeThrowSqlException(compile, "compiled statement");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            IOUtils.closeThrowSqlException(databaseResults, "results");
            IOUtils.closeThrowSqlException(compile, "compiled statement");
            throw th;
        }
    }

    public List<T> queryForAll(ConnectionSource connectionSource, ObjectCache objectCache) throws SQLException {
        prepareQueryForAll();
        return query(connectionSource, this.preparedQueryForAll, objectCache);
    }

    public long queryForCountStar(DatabaseConnection databaseConnection) throws SQLException {
        if (this.countStarQuery == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("SELECT COUNT(*) FROM ");
            this.databaseType.appendEscapedEntityName(sb, this.tableInfo.getTableName());
            this.countStarQuery = sb.toString();
        }
        long queryForLong = databaseConnection.queryForLong(this.countStarQuery);
        logger.debug("query of '{}' returned {}", (Object) this.countStarQuery, (Object) Long.valueOf(queryForLong));
        return queryForLong;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.j256.ormlite.dao.ObjectCache] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long queryForLong(com.j256.ormlite.support.DatabaseConnection r7, com.j256.ormlite.stmt.PreparedStmt<T> r8) throws java.sql.SQLException {
        /*
            r6 = this;
            java.lang.String r0 = "compiled statement"
            java.lang.String r1 = "results"
            com.j256.ormlite.stmt.StatementBuilder$StatementType r2 = com.j256.ormlite.stmt.StatementBuilder.StatementType.SELECT_LONG
            com.j256.ormlite.support.CompiledStatement r7 = r8.compile(r7, r2)
            r2 = 0
            com.j256.ormlite.support.DatabaseResults r2 = r7.runQuery(r2)     // Catch:{ all -> 0x0039 }
            boolean r3 = r2.first()     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x0021
            r8 = 0
            long r3 = r2.getLong(r8)     // Catch:{ all -> 0x0039 }
            com.j256.ormlite.misc.IOUtils.closeThrowSqlException(r2, r1)
            com.j256.ormlite.misc.IOUtils.closeThrowSqlException(r7, r0)
            return r3
        L_0x0021:
            java.sql.SQLException r3 = new java.sql.SQLException     // Catch:{ all -> 0x0039 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0039 }
            java.lang.String r5 = "No result found in queryForLong: "
            r4.<init>(r5)     // Catch:{ all -> 0x0039 }
            java.lang.String r8 = r8.getStatement()     // Catch:{ all -> 0x0039 }
            r4.append(r8)     // Catch:{ all -> 0x0039 }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x0039 }
            r3.<init>(r8)     // Catch:{ all -> 0x0039 }
            throw r3     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r8 = move-exception
            com.j256.ormlite.misc.IOUtils.closeThrowSqlException(r2, r1)
            com.j256.ormlite.misc.IOUtils.closeThrowSqlException(r7, r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.stmt.StatementExecutor.queryForLong(com.j256.ormlite.support.DatabaseConnection, com.j256.ormlite.stmt.PreparedStmt):long");
    }

    public long queryForLong(DatabaseConnection databaseConnection, String str, String[] strArr) throws SQLException {
        CompiledStatement compiledStatement;
        logger.debug("executing raw query for long: {}", (Object) str);
        if (strArr.length > 0) {
            logger.trace("query arguments: {}", (Object) strArr);
        }
        DatabaseResults databaseResults = null;
        try {
            compiledStatement = databaseConnection.compileStatement(str, StatementBuilder.StatementType.SELECT, noFieldTypes, -1, false);
            try {
                assignStatementArguments(compiledStatement, strArr);
                databaseResults = compiledStatement.runQuery((ObjectCache) null);
                if (databaseResults.first()) {
                    long j = databaseResults.getLong(0);
                    IOUtils.closeThrowSqlException(databaseResults, "results");
                    IOUtils.closeThrowSqlException(compiledStatement, "compiled statement");
                    return j;
                }
                throw new SQLException("No result found in queryForLong: ".concat(String.valueOf(str)));
            } catch (Throwable th) {
                th = th;
                IOUtils.closeThrowSqlException(databaseResults, "results");
                IOUtils.closeThrowSqlException(compiledStatement, "compiled statement");
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            compiledStatement = null;
            IOUtils.closeThrowSqlException(databaseResults, "results");
            IOUtils.closeThrowSqlException(compiledStatement, "compiled statement");
            throw th;
        }
    }

    public List<T> query(ConnectionSource connectionSource, PreparedStmt<T> preparedStmt, ObjectCache objectCache) throws SQLException {
        SelectIterator<T, ID> buildIterator = buildIterator((BaseDaoImpl) null, connectionSource, preparedStmt, objectCache, -1);
        try {
            ArrayList arrayList = new ArrayList();
            while (buildIterator.hasNextThrow()) {
                arrayList.add(buildIterator.nextThrow());
            }
            logger.debug("query of '{}' returned {} results", (Object) preparedStmt.getStatement(), (Object) Integer.valueOf(arrayList.size()));
            return arrayList;
        } finally {
            IOUtils.closeThrowSqlException(buildIterator, "iterator");
        }
    }

    public SelectIterator<T, ID> buildIterator(BaseDaoImpl<T, ID> baseDaoImpl, ConnectionSource connectionSource, int i, ObjectCache objectCache) throws SQLException {
        prepareQueryForAll();
        return buildIterator(baseDaoImpl, connectionSource, this.preparedQueryForAll, objectCache, i);
    }

    public GenericRowMapper<T> getSelectStarRowMapper() throws SQLException {
        prepareQueryForAll();
        return this.preparedQueryForAll;
    }

    public RawRowMapper<T> getRawRowMapper() {
        if (this.rawRowMapper == null) {
            this.rawRowMapper = new RawRowMapperImpl(this.tableInfo);
        }
        return this.rawRowMapper;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.j256.ormlite.stmt.SelectIterator<T, ID> buildIterator(com.j256.ormlite.dao.BaseDaoImpl<T, ID> r17, com.j256.ormlite.support.ConnectionSource r18, com.j256.ormlite.stmt.PreparedStmt<T> r19, com.j256.ormlite.dao.ObjectCache r20, int r21) throws java.sql.SQLException {
        /*
            r16 = this;
            r1 = r16
            r11 = r18
            java.lang.String r12 = "compiled statement"
            com.j256.ormlite.table.TableInfo<T, ID> r0 = r1.tableInfo
            java.lang.String r0 = r0.getTableName()
            com.j256.ormlite.support.DatabaseConnection r13 = r11.getReadOnlyConnection(r0)
            r14 = 0
            com.j256.ormlite.stmt.StatementBuilder$StatementType r0 = com.j256.ormlite.stmt.StatementBuilder.StatementType.SELECT     // Catch:{ all -> 0x003c }
            r5 = r19
            r2 = r21
            com.j256.ormlite.support.CompiledStatement r15 = r5.compile(r13, r0, r2)     // Catch:{ all -> 0x003c }
            com.j256.ormlite.stmt.SelectIterator r0 = new com.j256.ormlite.stmt.SelectIterator     // Catch:{ all -> 0x0039 }
            com.j256.ormlite.table.TableInfo<T, ID> r2 = r1.tableInfo     // Catch:{ all -> 0x0039 }
            java.lang.Class r3 = r2.getDataClass()     // Catch:{ all -> 0x0039 }
            java.lang.String r9 = r19.getStatement()     // Catch:{ all -> 0x0039 }
            r2 = r0
            r4 = r17
            r5 = r19
            r6 = r18
            r7 = r13
            r8 = r15
            r10 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0039 }
            com.j256.ormlite.misc.IOUtils.closeThrowSqlException(r14, r12)
            return r0
        L_0x0039:
            r0 = move-exception
            r14 = r15
            goto L_0x003d
        L_0x003c:
            r0 = move-exception
        L_0x003d:
            com.j256.ormlite.misc.IOUtils.closeThrowSqlException(r14, r12)
            if (r13 == 0) goto L_0x0045
            r11.releaseConnection(r13)
        L_0x0045:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.stmt.StatementExecutor.buildIterator(com.j256.ormlite.dao.BaseDaoImpl, com.j256.ormlite.support.ConnectionSource, com.j256.ormlite.stmt.PreparedStmt, com.j256.ormlite.dao.ObjectCache, int):com.j256.ormlite.stmt.SelectIterator");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.j256.ormlite.dao.GenericRawResults<java.lang.String[]> queryRaw(com.j256.ormlite.support.ConnectionSource r17, java.lang.String r18, java.lang.String[] r19, com.j256.ormlite.dao.ObjectCache r20) throws java.sql.SQLException {
        /*
            r16 = this;
            r9 = r16
            r10 = r17
            r0 = r19
            java.lang.String r11 = "compiled statement"
            com.j256.ormlite.logger.Logger r1 = logger
            java.lang.String r2 = "executing raw query for: {}"
            r12 = r18
            r1.debug((java.lang.String) r2, (java.lang.Object) r12)
            int r1 = r0.length
            if (r1 <= 0) goto L_0x001b
            com.j256.ormlite.logger.Logger r1 = logger
            java.lang.String r2 = "query arguments: {}"
            r1.trace((java.lang.String) r2, (java.lang.Object) r0)
        L_0x001b:
            com.j256.ormlite.table.TableInfo<T, ID> r1 = r9.tableInfo
            java.lang.String r1 = r1.getTableName()
            com.j256.ormlite.support.DatabaseConnection r13 = r10.getReadOnlyConnection(r1)
            r14 = 0
            com.j256.ormlite.stmt.StatementBuilder$StatementType r5 = com.j256.ormlite.stmt.StatementBuilder.StatementType.SELECT     // Catch:{ all -> 0x004f }
            com.j256.ormlite.field.FieldType[] r6 = noFieldTypes     // Catch:{ all -> 0x004f }
            r7 = -1
            r8 = 0
            r3 = r13
            r4 = r18
            com.j256.ormlite.support.CompiledStatement r15 = r3.compileStatement(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x004f }
            r9.assignStatementArguments(r15, r0)     // Catch:{ all -> 0x004c }
            com.j256.ormlite.stmt.RawResultsImpl r0 = new com.j256.ormlite.stmt.RawResultsImpl     // Catch:{ all -> 0x004c }
            java.lang.Class<java.lang.String[]> r5 = java.lang.String[].class
            r1 = r0
            r2 = r17
            r3 = r13
            r4 = r18
            r6 = r15
            r7 = r16
            r8 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x004c }
            com.j256.ormlite.misc.IOUtils.closeThrowSqlException(r14, r11)
            return r0
        L_0x004c:
            r0 = move-exception
            r14 = r15
            goto L_0x0050
        L_0x004f:
            r0 = move-exception
        L_0x0050:
            com.j256.ormlite.misc.IOUtils.closeThrowSqlException(r14, r11)
            if (r13 == 0) goto L_0x0058
            r10.releaseConnection(r13)
        L_0x0058:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.stmt.StatementExecutor.queryRaw(com.j256.ormlite.support.ConnectionSource, java.lang.String, java.lang.String[], com.j256.ormlite.dao.ObjectCache):com.j256.ormlite.dao.GenericRawResults");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <UO> com.j256.ormlite.dao.GenericRawResults<UO> queryRaw(com.j256.ormlite.support.ConnectionSource r17, java.lang.String r18, com.j256.ormlite.dao.RawRowMapper<UO> r19, java.lang.String[] r20, com.j256.ormlite.dao.ObjectCache r21) throws java.sql.SQLException {
        /*
            r16 = this;
            r1 = r16
            r10 = r17
            r0 = r20
            java.lang.String r11 = "compiled statement"
            com.j256.ormlite.logger.Logger r2 = logger
            java.lang.String r3 = "executing raw query for: {}"
            r12 = r18
            r2.debug((java.lang.String) r3, (java.lang.Object) r12)
            int r2 = r0.length
            if (r2 <= 0) goto L_0x001b
            com.j256.ormlite.logger.Logger r2 = logger
            java.lang.String r3 = "query arguments: {}"
            r2.trace((java.lang.String) r3, (java.lang.Object) r0)
        L_0x001b:
            com.j256.ormlite.table.TableInfo<T, ID> r2 = r1.tableInfo
            java.lang.String r2 = r2.getTableName()
            com.j256.ormlite.support.DatabaseConnection r13 = r10.getReadOnlyConnection(r2)
            r14 = 0
            com.j256.ormlite.stmt.StatementBuilder$StatementType r6 = com.j256.ormlite.stmt.StatementBuilder.StatementType.SELECT     // Catch:{ all -> 0x0054 }
            com.j256.ormlite.field.FieldType[] r7 = noFieldTypes     // Catch:{ all -> 0x0054 }
            r8 = -1
            r9 = 0
            r4 = r13
            r5 = r18
            com.j256.ormlite.support.CompiledStatement r15 = r4.compileStatement(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0054 }
            r1.assignStatementArguments(r15, r0)     // Catch:{ all -> 0x0051 }
            com.j256.ormlite.stmt.RawResultsImpl r0 = new com.j256.ormlite.stmt.RawResultsImpl     // Catch:{ all -> 0x0051 }
            java.lang.Class<java.lang.String[]> r6 = java.lang.String[].class
            com.j256.ormlite.stmt.StatementExecutor$UserRawRowMapper r8 = new com.j256.ormlite.stmt.StatementExecutor$UserRawRowMapper     // Catch:{ all -> 0x0051 }
            r2 = r19
            r8.<init>(r2, r1)     // Catch:{ all -> 0x0051 }
            r2 = r0
            r3 = r17
            r4 = r13
            r5 = r18
            r7 = r15
            r9 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0051 }
            com.j256.ormlite.misc.IOUtils.closeThrowSqlException(r14, r11)
            return r0
        L_0x0051:
            r0 = move-exception
            r14 = r15
            goto L_0x0055
        L_0x0054:
            r0 = move-exception
        L_0x0055:
            com.j256.ormlite.misc.IOUtils.closeThrowSqlException(r14, r11)
            if (r13 == 0) goto L_0x005d
            r10.releaseConnection(r13)
        L_0x005d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.stmt.StatementExecutor.queryRaw(com.j256.ormlite.support.ConnectionSource, java.lang.String, com.j256.ormlite.dao.RawRowMapper, java.lang.String[], com.j256.ormlite.dao.ObjectCache):com.j256.ormlite.dao.GenericRawResults");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <UO> com.j256.ormlite.dao.GenericRawResults<UO> queryRaw(com.j256.ormlite.support.ConnectionSource r17, java.lang.String r18, com.j256.ormlite.field.DataType[] r19, com.j256.ormlite.dao.RawRowObjectMapper<UO> r20, java.lang.String[] r21, com.j256.ormlite.dao.ObjectCache r22) throws java.sql.SQLException {
        /*
            r16 = this;
            r1 = r16
            r10 = r17
            r0 = r21
            java.lang.String r11 = "compiled statement"
            com.j256.ormlite.logger.Logger r2 = logger
            java.lang.String r3 = "executing raw query for: {}"
            r12 = r18
            r2.debug((java.lang.String) r3, (java.lang.Object) r12)
            int r2 = r0.length
            if (r2 <= 0) goto L_0x001b
            com.j256.ormlite.logger.Logger r2 = logger
            java.lang.String r3 = "query arguments: {}"
            r2.trace((java.lang.String) r3, (java.lang.Object) r0)
        L_0x001b:
            com.j256.ormlite.table.TableInfo<T, ID> r2 = r1.tableInfo
            java.lang.String r2 = r2.getTableName()
            com.j256.ormlite.support.DatabaseConnection r13 = r10.getReadOnlyConnection(r2)
            r14 = 0
            com.j256.ormlite.stmt.StatementBuilder$StatementType r6 = com.j256.ormlite.stmt.StatementBuilder.StatementType.SELECT     // Catch:{ all -> 0x0056 }
            com.j256.ormlite.field.FieldType[] r7 = noFieldTypes     // Catch:{ all -> 0x0056 }
            r8 = -1
            r9 = 0
            r4 = r13
            r5 = r18
            com.j256.ormlite.support.CompiledStatement r15 = r4.compileStatement(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0056 }
            r1.assignStatementArguments(r15, r0)     // Catch:{ all -> 0x0053 }
            com.j256.ormlite.stmt.RawResultsImpl r0 = new com.j256.ormlite.stmt.RawResultsImpl     // Catch:{ all -> 0x0053 }
            java.lang.Class<java.lang.String[]> r6 = java.lang.String[].class
            com.j256.ormlite.stmt.StatementExecutor$UserRawRowObjectMapper r8 = new com.j256.ormlite.stmt.StatementExecutor$UserRawRowObjectMapper     // Catch:{ all -> 0x0053 }
            r2 = r19
            r3 = r20
            r8.<init>(r3, r2)     // Catch:{ all -> 0x0053 }
            r2 = r0
            r3 = r17
            r4 = r13
            r5 = r18
            r7 = r15
            r9 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0053 }
            com.j256.ormlite.misc.IOUtils.closeThrowSqlException(r14, r11)
            return r0
        L_0x0053:
            r0 = move-exception
            r14 = r15
            goto L_0x0057
        L_0x0056:
            r0 = move-exception
        L_0x0057:
            com.j256.ormlite.misc.IOUtils.closeThrowSqlException(r14, r11)
            if (r13 == 0) goto L_0x005f
            r10.releaseConnection(r13)
        L_0x005f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.stmt.StatementExecutor.queryRaw(com.j256.ormlite.support.ConnectionSource, java.lang.String, com.j256.ormlite.field.DataType[], com.j256.ormlite.dao.RawRowObjectMapper, java.lang.String[], com.j256.ormlite.dao.ObjectCache):com.j256.ormlite.dao.GenericRawResults");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.j256.ormlite.dao.GenericRawResults<java.lang.Object[]> queryRaw(com.j256.ormlite.support.ConnectionSource r17, java.lang.String r18, com.j256.ormlite.field.DataType[] r19, java.lang.String[] r20, com.j256.ormlite.dao.ObjectCache r21) throws java.sql.SQLException {
        /*
            r16 = this;
            r1 = r16
            r10 = r17
            r0 = r20
            java.lang.String r11 = "compiled statement"
            com.j256.ormlite.logger.Logger r2 = logger
            java.lang.String r3 = "executing raw query for: {}"
            r12 = r18
            r2.debug((java.lang.String) r3, (java.lang.Object) r12)
            int r2 = r0.length
            if (r2 <= 0) goto L_0x001b
            com.j256.ormlite.logger.Logger r2 = logger
            java.lang.String r3 = "query arguments: {}"
            r2.trace((java.lang.String) r3, (java.lang.Object) r0)
        L_0x001b:
            com.j256.ormlite.table.TableInfo<T, ID> r2 = r1.tableInfo
            java.lang.String r2 = r2.getTableName()
            com.j256.ormlite.support.DatabaseConnection r13 = r10.getReadOnlyConnection(r2)
            r14 = 0
            com.j256.ormlite.stmt.StatementBuilder$StatementType r6 = com.j256.ormlite.stmt.StatementBuilder.StatementType.SELECT     // Catch:{ all -> 0x0054 }
            com.j256.ormlite.field.FieldType[] r7 = noFieldTypes     // Catch:{ all -> 0x0054 }
            r8 = -1
            r9 = 0
            r4 = r13
            r5 = r18
            com.j256.ormlite.support.CompiledStatement r15 = r4.compileStatement(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0054 }
            r1.assignStatementArguments(r15, r0)     // Catch:{ all -> 0x0051 }
            com.j256.ormlite.stmt.RawResultsImpl r0 = new com.j256.ormlite.stmt.RawResultsImpl     // Catch:{ all -> 0x0051 }
            java.lang.Class<java.lang.Object[]> r6 = java.lang.Object[].class
            com.j256.ormlite.stmt.StatementExecutor$ObjectArrayRowMapper r8 = new com.j256.ormlite.stmt.StatementExecutor$ObjectArrayRowMapper     // Catch:{ all -> 0x0051 }
            r2 = r19
            r8.<init>(r2)     // Catch:{ all -> 0x0051 }
            r2 = r0
            r3 = r17
            r4 = r13
            r5 = r18
            r7 = r15
            r9 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0051 }
            com.j256.ormlite.misc.IOUtils.closeThrowSqlException(r14, r11)
            return r0
        L_0x0051:
            r0 = move-exception
            r14 = r15
            goto L_0x0055
        L_0x0054:
            r0 = move-exception
        L_0x0055:
            com.j256.ormlite.misc.IOUtils.closeThrowSqlException(r14, r11)
            if (r13 == 0) goto L_0x005d
            r10.releaseConnection(r13)
        L_0x005d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.stmt.StatementExecutor.queryRaw(com.j256.ormlite.support.ConnectionSource, java.lang.String, com.j256.ormlite.field.DataType[], java.lang.String[], com.j256.ormlite.dao.ObjectCache):com.j256.ormlite.dao.GenericRawResults");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <UO> com.j256.ormlite.dao.GenericRawResults<UO> queryRaw(com.j256.ormlite.support.ConnectionSource r17, java.lang.String r18, com.j256.ormlite.dao.DatabaseResultsMapper<UO> r19, java.lang.String[] r20, com.j256.ormlite.dao.ObjectCache r21) throws java.sql.SQLException {
        /*
            r16 = this;
            r1 = r16
            r10 = r17
            r0 = r20
            java.lang.String r11 = "compiled statement"
            com.j256.ormlite.logger.Logger r2 = logger
            java.lang.String r3 = "executing raw query for: {}"
            r12 = r18
            r2.debug((java.lang.String) r3, (java.lang.Object) r12)
            int r2 = r0.length
            if (r2 <= 0) goto L_0x001b
            com.j256.ormlite.logger.Logger r2 = logger
            java.lang.String r3 = "query arguments: {}"
            r2.trace((java.lang.String) r3, (java.lang.Object) r0)
        L_0x001b:
            com.j256.ormlite.table.TableInfo<T, ID> r2 = r1.tableInfo
            java.lang.String r2 = r2.getTableName()
            com.j256.ormlite.support.DatabaseConnection r13 = r10.getReadOnlyConnection(r2)
            r14 = 0
            com.j256.ormlite.stmt.StatementBuilder$StatementType r6 = com.j256.ormlite.stmt.StatementBuilder.StatementType.SELECT     // Catch:{ all -> 0x0054 }
            com.j256.ormlite.field.FieldType[] r7 = noFieldTypes     // Catch:{ all -> 0x0054 }
            r8 = -1
            r9 = 0
            r4 = r13
            r5 = r18
            com.j256.ormlite.support.CompiledStatement r15 = r4.compileStatement(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0054 }
            r1.assignStatementArguments(r15, r0)     // Catch:{ all -> 0x0051 }
            com.j256.ormlite.stmt.RawResultsImpl r0 = new com.j256.ormlite.stmt.RawResultsImpl     // Catch:{ all -> 0x0051 }
            java.lang.Class<java.lang.Object[]> r6 = java.lang.Object[].class
            com.j256.ormlite.stmt.StatementExecutor$UserDatabaseResultsMapper r8 = new com.j256.ormlite.stmt.StatementExecutor$UserDatabaseResultsMapper     // Catch:{ all -> 0x0051 }
            r2 = r19
            r8.<init>(r2)     // Catch:{ all -> 0x0051 }
            r2 = r0
            r3 = r17
            r4 = r13
            r5 = r18
            r7 = r15
            r9 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0051 }
            com.j256.ormlite.misc.IOUtils.closeThrowSqlException(r14, r11)
            return r0
        L_0x0051:
            r0 = move-exception
            r14 = r15
            goto L_0x0055
        L_0x0054:
            r0 = move-exception
        L_0x0055:
            com.j256.ormlite.misc.IOUtils.closeThrowSqlException(r14, r11)
            if (r13 == 0) goto L_0x005d
            r10.releaseConnection(r13)
        L_0x005d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.stmt.StatementExecutor.queryRaw(com.j256.ormlite.support.ConnectionSource, java.lang.String, com.j256.ormlite.dao.DatabaseResultsMapper, java.lang.String[], com.j256.ormlite.dao.ObjectCache):com.j256.ormlite.dao.GenericRawResults");
    }

    public int updateRaw(DatabaseConnection databaseConnection, String str, String[] strArr) throws SQLException {
        logger.debug("running raw update statement: {}", (Object) str);
        if (strArr.length > 0) {
            logger.trace("update arguments: {}", (Object) strArr);
        }
        CompiledStatement compileStatement = databaseConnection.compileStatement(str, StatementBuilder.StatementType.UPDATE, noFieldTypes, -1, false);
        try {
            assignStatementArguments(compileStatement, strArr);
            return compileStatement.runUpdate();
        } finally {
            IOUtils.closeThrowSqlException(compileStatement, "compiled statement");
        }
    }

    public int executeRawNoArgs(DatabaseConnection databaseConnection, String str) throws SQLException {
        logger.debug("running raw execute statement: {}", (Object) str);
        return databaseConnection.executeStatement(str, -1);
    }

    public int executeRaw(DatabaseConnection databaseConnection, String str, String[] strArr) throws SQLException {
        logger.debug("running raw execute statement: {}", (Object) str);
        if (strArr.length > 0) {
            logger.trace("execute arguments: {}", (Object) strArr);
        }
        CompiledStatement compileStatement = databaseConnection.compileStatement(str, StatementBuilder.StatementType.EXECUTE, noFieldTypes, -1, false);
        try {
            assignStatementArguments(compileStatement, strArr);
            return compileStatement.runExecute();
        } finally {
            IOUtils.closeThrowSqlException(compileStatement, "compiled statement");
        }
    }

    public int create(DatabaseConnection databaseConnection, T t, ObjectCache objectCache) throws SQLException {
        if (this.mappedInsert == null) {
            this.mappedInsert = MappedCreate.build(this.databaseType, this.tableInfo);
        }
        int insert = this.mappedInsert.insert(this.databaseType, databaseConnection, t, objectCache);
        if (this.dao != null && !this.localIsInBatchMode.get().booleanValue()) {
            this.dao.notifyChanges();
        }
        return insert;
    }

    public int update(DatabaseConnection databaseConnection, T t, ObjectCache objectCache) throws SQLException {
        if (this.mappedUpdate == null) {
            this.mappedUpdate = MappedUpdate.build(this.databaseType, this.tableInfo);
        }
        int update = this.mappedUpdate.update(databaseConnection, t, objectCache);
        if (this.dao != null && !this.localIsInBatchMode.get().booleanValue()) {
            this.dao.notifyChanges();
        }
        return update;
    }

    public int updateId(DatabaseConnection databaseConnection, T t, ID id2, ObjectCache objectCache) throws SQLException {
        if (this.mappedUpdateId == null) {
            this.mappedUpdateId = MappedUpdateId.build(this.databaseType, this.tableInfo);
        }
        int execute = this.mappedUpdateId.execute(databaseConnection, t, id2, objectCache);
        if (this.dao != null && !this.localIsInBatchMode.get().booleanValue()) {
            this.dao.notifyChanges();
        }
        return execute;
    }

    public int update(DatabaseConnection databaseConnection, PreparedUpdate<T> preparedUpdate) throws SQLException {
        CompiledStatement compile = preparedUpdate.compile(databaseConnection, StatementBuilder.StatementType.UPDATE);
        try {
            int runUpdate = compile.runUpdate();
            if (this.dao != null && !this.localIsInBatchMode.get().booleanValue()) {
                this.dao.notifyChanges();
            }
            return runUpdate;
        } finally {
            IOUtils.closeThrowSqlException(compile, "compiled statement");
        }
    }

    public int refresh(DatabaseConnection databaseConnection, T t, ObjectCache objectCache) throws SQLException {
        if (this.mappedRefresh == null) {
            this.mappedRefresh = MappedRefresh.build(this.databaseType, this.tableInfo);
        }
        return this.mappedRefresh.executeRefresh(databaseConnection, t, objectCache);
    }

    public int delete(DatabaseConnection databaseConnection, T t, ObjectCache objectCache) throws SQLException {
        if (this.mappedDelete == null) {
            this.mappedDelete = MappedDelete.build(this.databaseType, this.tableInfo);
        }
        int delete = this.mappedDelete.delete(databaseConnection, t, objectCache);
        if (this.dao != null && !this.localIsInBatchMode.get().booleanValue()) {
            this.dao.notifyChanges();
        }
        return delete;
    }

    public int deleteById(DatabaseConnection databaseConnection, ID id2, ObjectCache objectCache) throws SQLException {
        if (this.mappedDelete == null) {
            this.mappedDelete = MappedDelete.build(this.databaseType, this.tableInfo);
        }
        int deleteById = this.mappedDelete.deleteById(databaseConnection, id2, objectCache);
        if (this.dao != null && !this.localIsInBatchMode.get().booleanValue()) {
            this.dao.notifyChanges();
        }
        return deleteById;
    }

    public int deleteObjects(DatabaseConnection databaseConnection, Collection<T> collection, ObjectCache objectCache) throws SQLException {
        int deleteObjects = MappedDeleteCollection.deleteObjects(this.databaseType, this.tableInfo, databaseConnection, collection, objectCache);
        if (this.dao != null && !this.localIsInBatchMode.get().booleanValue()) {
            this.dao.notifyChanges();
        }
        return deleteObjects;
    }

    public int deleteIds(DatabaseConnection databaseConnection, Collection<ID> collection, ObjectCache objectCache) throws SQLException {
        int deleteIds = MappedDeleteCollection.deleteIds(this.databaseType, this.tableInfo, databaseConnection, collection, objectCache);
        if (this.dao != null && !this.localIsInBatchMode.get().booleanValue()) {
            this.dao.notifyChanges();
        }
        return deleteIds;
    }

    public int delete(DatabaseConnection databaseConnection, PreparedDelete<T> preparedDelete) throws SQLException {
        CompiledStatement compile = preparedDelete.compile(databaseConnection, StatementBuilder.StatementType.DELETE);
        try {
            int runUpdate = compile.runUpdate();
            if (this.dao != null && !this.localIsInBatchMode.get().booleanValue()) {
                this.dao.notifyChanges();
            }
            return runUpdate;
        } finally {
            IOUtils.closeThrowSqlException(compile, "compiled statement");
        }
    }

    public <CT> CT callBatchTasks(ConnectionSource connectionSource, Callable<CT> callable) throws SQLException {
        CT doCallBatchTasks;
        if (!connectionSource.isSingleConnection(this.tableInfo.getTableName())) {
            return doCallBatchTasks(connectionSource, callable);
        }
        synchronized (this) {
            doCallBatchTasks = doCallBatchTasks(connectionSource, callable);
        }
        return doCallBatchTasks;
    }

    private <CT> CT doCallBatchTasks(ConnectionSource connectionSource, Callable<CT> callable) throws SQLException {
        DatabaseConnection readWriteConnection = connectionSource.getReadWriteConnection(this.tableInfo.getTableName());
        boolean z = false;
        try {
            this.localIsInBatchMode.set(Boolean.TRUE);
            z = connectionSource.saveSpecialConnection(readWriteConnection);
            return doCallBatchTasks(readWriteConnection, z, callable);
        } finally {
            if (z) {
                connectionSource.clearSpecialConnection(readWriteConnection);
            }
            connectionSource.releaseConnection(readWriteConnection);
            this.localIsInBatchMode.set(Boolean.FALSE);
            Dao<T, ID> dao2 = this.dao;
            if (dao2 != null) {
                dao2.notifyChanges();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <CT> CT doCallBatchTasks(com.j256.ormlite.support.DatabaseConnection r6, boolean r7, java.util.concurrent.Callable<CT> r8) throws java.sql.SQLException {
        /*
            r5 = this;
            java.lang.String r0 = "re-enabled auto-commit on table {} after batch tasks"
            com.j256.ormlite.db.DatabaseType r1 = r5.databaseType
            boolean r1 = r1.isBatchUseTransaction()
            if (r1 == 0) goto L_0x0011
            com.j256.ormlite.db.DatabaseType r0 = r5.databaseType
            java.lang.Object r6 = com.j256.ormlite.misc.TransactionManager.callInTransaction(r6, r7, r0, r8)
            return r6
        L_0x0011:
            r7 = 0
            r1 = 1
            boolean r2 = r6.isAutoCommitSupported()     // Catch:{ all -> 0x0058 }
            if (r2 == 0) goto L_0x0034
            boolean r2 = r6.isAutoCommit()     // Catch:{ all -> 0x0058 }
            if (r2 == 0) goto L_0x0034
            r6.setAutoCommit(r7)     // Catch:{ all -> 0x0058 }
            com.j256.ormlite.logger.Logger r7 = logger     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = "disabled auto-commit on table {} before batch tasks"
            com.j256.ormlite.table.TableInfo<T, ID> r3 = r5.tableInfo     // Catch:{ all -> 0x0031 }
            java.lang.String r3 = r3.getTableName()     // Catch:{ all -> 0x0031 }
            r7.debug((java.lang.String) r2, (java.lang.Object) r3)     // Catch:{ all -> 0x0031 }
            r7 = 1
            goto L_0x0034
        L_0x0031:
            r7 = move-exception
            r8 = 1
            goto L_0x005b
        L_0x0034:
            java.lang.Object r8 = r8.call()     // Catch:{ SQLException -> 0x0056, Exception -> 0x004e }
            if (r7 == 0) goto L_0x0048
            r6.setAutoCommit(r1)
            com.j256.ormlite.logger.Logger r6 = logger
            com.j256.ormlite.table.TableInfo<T, ID> r7 = r5.tableInfo
            java.lang.String r7 = r7.getTableName()
            r6.debug((java.lang.String) r0, (java.lang.Object) r7)
        L_0x0048:
            return r8
        L_0x0049:
            r8 = move-exception
            r4 = r8
            r8 = r7
            r7 = r4
            goto L_0x005b
        L_0x004e:
            r8 = move-exception
            java.lang.String r2 = "Batch tasks callable threw non-SQL exception"
            java.sql.SQLException r8 = com.j256.ormlite.misc.SqlExceptionUtil.create(r2, r8)     // Catch:{ all -> 0x0049 }
            throw r8     // Catch:{ all -> 0x0049 }
        L_0x0056:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0049 }
        L_0x0058:
            r8 = move-exception
            r7 = r8
            r8 = 0
        L_0x005b:
            if (r8 == 0) goto L_0x006b
            r6.setAutoCommit(r1)
            com.j256.ormlite.logger.Logger r6 = logger
            com.j256.ormlite.table.TableInfo<T, ID> r8 = r5.tableInfo
            java.lang.String r8 = r8.getTableName()
            r6.debug((java.lang.String) r0, (java.lang.Object) r8)
        L_0x006b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.stmt.StatementExecutor.doCallBatchTasks(com.j256.ormlite.support.DatabaseConnection, boolean, java.util.concurrent.Callable):java.lang.Object");
    }

    public String[] mapRow(DatabaseResults databaseResults) throws SQLException {
        int columnCount = databaseResults.getColumnCount();
        String[] strArr = new String[columnCount];
        for (int i = 0; i < columnCount; i++) {
            strArr[i] = databaseResults.getString(i);
        }
        return strArr;
    }

    public boolean ifExists(DatabaseConnection databaseConnection, ID id2) throws SQLException {
        if (this.ifExistsQuery == null) {
            QueryBuilder queryBuilder = new QueryBuilder(this.databaseType, this.tableInfo, this.dao);
            queryBuilder.selectRaw("COUNT(*)");
            queryBuilder.where().eq(this.tableInfo.getIdField().getColumnName(), new SelectArg());
            this.ifExistsQuery = queryBuilder.prepareStatementString();
            this.ifExistsFieldTypes = new FieldType[]{this.tableInfo.getIdField()};
        }
        long queryForLong = databaseConnection.queryForLong(this.ifExistsQuery, new Object[]{this.tableInfo.getIdField().convertJavaFieldToSqlArgValue(id2)}, this.ifExistsFieldTypes);
        logger.debug("query of '{}' returned {}", (Object) this.ifExistsQuery, (Object) Long.valueOf(queryForLong));
        return queryForLong != 0;
    }

    private void assignStatementArguments(CompiledStatement compiledStatement, String[] strArr) throws SQLException {
        for (int i = 0; i < strArr.length; i++) {
            compiledStatement.setObject(i, strArr[i], SqlType.STRING);
        }
    }

    private void prepareQueryForAll() throws SQLException {
        if (this.preparedQueryForAll == null) {
            this.preparedQueryForAll = new QueryBuilder(this.databaseType, this.tableInfo, this.dao).prepare();
        }
    }

    static class UserRawRowMapper<UO> implements GenericRowMapper<UO> {
        private String[] columnNames;
        private final RawRowMapper<UO> mapper;
        private final GenericRowMapper<String[]> stringRowMapper;

        public UserRawRowMapper(RawRowMapper<UO> rawRowMapper, GenericRowMapper<String[]> genericRowMapper) {
            this.mapper = rawRowMapper;
            this.stringRowMapper = genericRowMapper;
        }

        public UO mapRow(DatabaseResults databaseResults) throws SQLException {
            return this.mapper.mapRow(getColumnNames(databaseResults), this.stringRowMapper.mapRow(databaseResults));
        }

        private String[] getColumnNames(DatabaseResults databaseResults) throws SQLException {
            String[] strArr = this.columnNames;
            if (strArr != null) {
                return strArr;
            }
            String[] columnNames2 = databaseResults.getColumnNames();
            this.columnNames = columnNames2;
            return columnNames2;
        }
    }

    static class UserRawRowObjectMapper<UO> implements GenericRowMapper<UO> {
        private String[] columnNames;
        private final DataType[] columnTypes;
        private final RawRowObjectMapper<UO> mapper;

        public UserRawRowObjectMapper(RawRowObjectMapper<UO> rawRowObjectMapper, DataType[] dataTypeArr) {
            this.mapper = rawRowObjectMapper;
            this.columnTypes = dataTypeArr;
        }

        public UO mapRow(DatabaseResults databaseResults) throws SQLException {
            int columnCount = databaseResults.getColumnCount();
            Object[] objArr = new Object[columnCount];
            for (int i = 0; i < columnCount; i++) {
                DataType[] dataTypeArr = this.columnTypes;
                if (i >= dataTypeArr.length) {
                    objArr[i] = null;
                } else {
                    objArr[i] = dataTypeArr[i].getDataPersister().resultToJava((FieldType) null, databaseResults, i);
                }
            }
            return this.mapper.mapRow(getColumnNames(databaseResults), this.columnTypes, objArr);
        }

        private String[] getColumnNames(DatabaseResults databaseResults) throws SQLException {
            String[] strArr = this.columnNames;
            if (strArr != null) {
                return strArr;
            }
            String[] columnNames2 = databaseResults.getColumnNames();
            this.columnNames = columnNames2;
            return columnNames2;
        }
    }

    static class ObjectArrayRowMapper implements GenericRowMapper<Object[]> {
        private final DataType[] columnTypes;

        public ObjectArrayRowMapper(DataType[] dataTypeArr) {
            this.columnTypes = dataTypeArr;
        }

        public Object[] mapRow(DatabaseResults databaseResults) throws SQLException {
            DataType dataType;
            int columnCount = databaseResults.getColumnCount();
            Object[] objArr = new Object[columnCount];
            for (int i = 0; i < columnCount; i++) {
                DataType[] dataTypeArr = this.columnTypes;
                if (i >= dataTypeArr.length) {
                    dataType = DataType.STRING;
                } else {
                    dataType = dataTypeArr[i];
                }
                objArr[i] = dataType.getDataPersister().resultToJava((FieldType) null, databaseResults, i);
            }
            return objArr;
        }
    }

    static class UserDatabaseResultsMapper<UO> implements GenericRowMapper<UO> {
        public final DatabaseResultsMapper<UO> mapper;

        private UserDatabaseResultsMapper(DatabaseResultsMapper<UO> databaseResultsMapper) {
            this.mapper = databaseResultsMapper;
        }

        public UO mapRow(DatabaseResults databaseResults) throws SQLException {
            return this.mapper.mapRow(databaseResults);
        }
    }
}
