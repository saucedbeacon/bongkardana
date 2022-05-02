package com.j256.ormlite.misc;

import com.j256.ormlite.db.DatabaseType;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.support.DatabaseConnection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class TransactionManager {
    private static final String SAVE_POINT_PREFIX = "ORMLITE";
    private static final Logger logger = LoggerFactory.getLogger((Class<?>) TransactionManager.class);
    private static AtomicInteger savePointCounter = new AtomicInteger();
    private ConnectionSource connectionSource;

    public TransactionManager() {
    }

    public TransactionManager(ConnectionSource connectionSource2) {
        this.connectionSource = connectionSource2;
        initialize();
    }

    public void initialize() {
        if (this.connectionSource == null) {
            StringBuilder sb = new StringBuilder("dataSource was not set on ");
            sb.append(getClass().getSimpleName());
            throw new IllegalStateException(sb.toString());
        }
    }

    public <T> T callInTransaction(Callable<T> callable) throws SQLException {
        return callInTransaction(this.connectionSource, callable);
    }

    public <T> T callInTransaction(String str, Callable<T> callable) throws SQLException {
        return callInTransaction(str, this.connectionSource, callable);
    }

    public static <T> T callInTransaction(ConnectionSource connectionSource2, Callable<T> callable) throws SQLException {
        return callInTransaction((String) null, connectionSource2, callable);
    }

    public static <T> T callInTransaction(String str, ConnectionSource connectionSource2, Callable<T> callable) throws SQLException {
        DatabaseConnection readWriteConnection = connectionSource2.getReadWriteConnection(str);
        try {
            return callInTransaction(readWriteConnection, connectionSource2.saveSpecialConnection(readWriteConnection), connectionSource2.getDatabaseType(), callable);
        } finally {
            connectionSource2.clearSpecialConnection(readWriteConnection);
            connectionSource2.releaseConnection(readWriteConnection);
        }
    }

    public static <T> T callInTransaction(DatabaseConnection databaseConnection, DatabaseType databaseType, Callable<T> callable) throws SQLException {
        return callInTransaction(databaseConnection, false, databaseType, callable);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:34|35|36|37) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:42|43|44|45) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x007b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x008e */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062 A[Catch:{ SQLException -> 0x0087, Exception -> 0x0074, all -> 0x0070 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:36:0x007b=Splitter:B:36:0x007b, B:44:0x008e=Splitter:B:44:0x008e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T callInTransaction(com.j256.ormlite.support.DatabaseConnection r6, boolean r7, com.j256.ormlite.db.DatabaseType r8, java.util.concurrent.Callable<T> r9) throws java.sql.SQLException {
        /*
            java.lang.String r0 = "after commit exception, rolling back to save-point also threw exception"
            r1 = 0
            java.lang.String r2 = "restored auto-commit to true"
            r3 = 0
            r4 = 1
            if (r7 != 0) goto L_0x0012
            boolean r7 = r8.isNestedSavePointsSupported()     // Catch:{ all -> 0x0094 }
            if (r7 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r7 = 0
            goto L_0x005c
        L_0x0012:
            boolean r7 = r6.isAutoCommitSupported()     // Catch:{ all -> 0x0094 }
            if (r7 == 0) goto L_0x002d
            boolean r7 = r6.isAutoCommit()     // Catch:{ all -> 0x0094 }
            if (r7 == 0) goto L_0x002d
            r6.setAutoCommit(r3)     // Catch:{ all -> 0x0094 }
            com.j256.ormlite.logger.Logger r7 = logger     // Catch:{ all -> 0x002a }
            java.lang.String r8 = "had to set auto-commit to false"
            r7.debug(r8)     // Catch:{ all -> 0x002a }
            r3 = 1
            goto L_0x002d
        L_0x002a:
            r7 = move-exception
            r3 = 1
            goto L_0x0095
        L_0x002d:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0094 }
            java.lang.String r8 = "ORMLITE"
            r7.<init>(r8)     // Catch:{ all -> 0x0094 }
            java.util.concurrent.atomic.AtomicInteger r8 = savePointCounter     // Catch:{ all -> 0x0094 }
            int r8 = r8.incrementAndGet()     // Catch:{ all -> 0x0094 }
            r7.append(r8)     // Catch:{ all -> 0x0094 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0094 }
            java.sql.Savepoint r1 = r6.setSavePoint(r7)     // Catch:{ all -> 0x0094 }
            if (r1 != 0) goto L_0x004f
            com.j256.ormlite.logger.Logger r7 = logger     // Catch:{ all -> 0x0094 }
            java.lang.String r8 = "started savePoint transaction"
            r7.debug(r8)     // Catch:{ all -> 0x0094 }
            goto L_0x005a
        L_0x004f:
            com.j256.ormlite.logger.Logger r7 = logger     // Catch:{ all -> 0x0094 }
            java.lang.String r8 = "started savePoint transaction {}"
            java.lang.String r5 = r1.getSavepointName()     // Catch:{ all -> 0x0094 }
            r7.debug((java.lang.String) r8, (java.lang.Object) r5)     // Catch:{ all -> 0x0094 }
        L_0x005a:
            r7 = r3
            r3 = 1
        L_0x005c:
            java.lang.Object r8 = r9.call()     // Catch:{ SQLException -> 0x0087, Exception -> 0x0074 }
            if (r3 == 0) goto L_0x0065
            commit(r6, r1)     // Catch:{ SQLException -> 0x0087, Exception -> 0x0074 }
        L_0x0065:
            if (r7 == 0) goto L_0x006f
            r6.setAutoCommit(r4)
            com.j256.ormlite.logger.Logger r6 = logger
            r6.debug(r2)
        L_0x006f:
            return r8
        L_0x0070:
            r8 = move-exception
            r3 = r7
            r7 = r8
            goto L_0x0095
        L_0x0074:
            r8 = move-exception
            if (r3 == 0) goto L_0x0080
            rollBack(r6, r1)     // Catch:{ SQLException -> 0x007b }
            goto L_0x0080
        L_0x007b:
            com.j256.ormlite.logger.Logger r9 = logger     // Catch:{ all -> 0x0070 }
            r9.error((java.lang.Throwable) r8, (java.lang.String) r0)     // Catch:{ all -> 0x0070 }
        L_0x0080:
            java.lang.String r9 = "Transaction callable threw non-SQL exception"
            java.sql.SQLException r8 = com.j256.ormlite.misc.SqlExceptionUtil.create(r9, r8)     // Catch:{ all -> 0x0070 }
            throw r8     // Catch:{ all -> 0x0070 }
        L_0x0087:
            r8 = move-exception
            if (r3 == 0) goto L_0x0093
            rollBack(r6, r1)     // Catch:{ SQLException -> 0x008e }
            goto L_0x0093
        L_0x008e:
            com.j256.ormlite.logger.Logger r9 = logger     // Catch:{ all -> 0x0070 }
            r9.error((java.lang.Throwable) r8, (java.lang.String) r0)     // Catch:{ all -> 0x0070 }
        L_0x0093:
            throw r8     // Catch:{ all -> 0x0070 }
        L_0x0094:
            r7 = move-exception
        L_0x0095:
            if (r3 == 0) goto L_0x009f
            r6.setAutoCommit(r4)
            com.j256.ormlite.logger.Logger r6 = logger
            r6.debug(r2)
        L_0x009f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.misc.TransactionManager.callInTransaction(com.j256.ormlite.support.DatabaseConnection, boolean, com.j256.ormlite.db.DatabaseType, java.util.concurrent.Callable):java.lang.Object");
    }

    public void setConnectionSource(ConnectionSource connectionSource2) {
        this.connectionSource = connectionSource2;
    }

    private static void commit(DatabaseConnection databaseConnection, Savepoint savepoint) throws SQLException {
        String savepointName = savepoint == null ? null : savepoint.getSavepointName();
        databaseConnection.commit(savepoint);
        if (savepointName == null) {
            logger.debug("committed savePoint transaction");
        } else {
            logger.debug("committed savePoint transaction {}", (Object) savepointName);
        }
    }

    private static void rollBack(DatabaseConnection databaseConnection, Savepoint savepoint) throws SQLException {
        String savepointName = savepoint == null ? null : savepoint.getSavepointName();
        databaseConnection.rollback(savepoint);
        if (savepointName == null) {
            logger.debug("rolled back savePoint transaction");
        } else {
            logger.debug("rolled back savePoint transaction {}", (Object) savepointName);
        }
    }
}
