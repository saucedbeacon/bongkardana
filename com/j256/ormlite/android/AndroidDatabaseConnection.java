package com.j256.ormlite.android;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.misc.IOUtils;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.misc.VersionUtils;
import com.j256.ormlite.stmt.GenericRowMapper;
import com.j256.ormlite.stmt.StatementBuilder;
import com.j256.ormlite.support.CompiledStatement;
import com.j256.ormlite.support.DatabaseConnection;
import com.j256.ormlite.support.GeneratedKeyHolder;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Savepoint;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class AndroidDatabaseConnection implements DatabaseConnection {
    private static final String ANDROID_VERSION = "VERSION__5.0__";
    private static final String[] NO_STRING_ARGS = new String[0];
    private static Logger logger = LoggerFactory.getLogger((Class<?>) AndroidDatabaseConnection.class);
    private final boolean cancelQueriesEnabled;
    private final SQLiteDatabase db;
    private final boolean readWrite;

    public boolean isAutoCommitSupported() {
        return true;
    }

    static {
        VersionUtils.checkCoreVersusAndroidVersions(ANDROID_VERSION);
    }

    public AndroidDatabaseConnection(SQLiteDatabase sQLiteDatabase, boolean z) {
        this(sQLiteDatabase, z, false);
    }

    public AndroidDatabaseConnection(SQLiteDatabase sQLiteDatabase, boolean z, boolean z2) {
        this.db = sQLiteDatabase;
        this.readWrite = z;
        this.cancelQueriesEnabled = z2;
        logger.trace("{}: db {} opened, read-write = {}", (Object) this, (Object) sQLiteDatabase, (Object) Boolean.valueOf(z));
    }

    public boolean isAutoCommit() throws SQLException {
        try {
            boolean inTransaction = this.db.inTransaction();
            logger.trace("{}: in transaction is {}", (Object) this, (Object) Boolean.valueOf(inTransaction));
            return !inTransaction;
        } catch (android.database.SQLException e) {
            throw SqlExceptionUtil.create("problems getting auto-commit from database", e);
        }
    }

    public void setAutoCommit(boolean z) {
        if (z) {
            if (this.db.inTransaction()) {
                this.db.setTransactionSuccessful();
                this.db.endTransaction();
            }
        } else if (!this.db.inTransaction()) {
            this.db.beginTransaction();
        }
    }

    public Savepoint setSavePoint(String str) throws SQLException {
        try {
            this.db.beginTransaction();
            logger.trace("{}: save-point set with name {}", (Object) this, (Object) str);
            return new OurSavePoint(str);
        } catch (android.database.SQLException e) {
            throw SqlExceptionUtil.create("problems beginning transaction ".concat(String.valueOf(str)), e);
        }
    }

    public boolean isReadWrite() {
        return this.readWrite;
    }

    public void commit(Savepoint savepoint) throws SQLException {
        try {
            this.db.setTransactionSuccessful();
            this.db.endTransaction();
            if (savepoint == null) {
                logger.trace("{}: transaction is successfuly ended", (Object) this);
            } else {
                logger.trace("{}: transaction {} is successfuly ended", (Object) this, (Object) savepoint.getSavepointName());
            }
        } catch (android.database.SQLException e) {
            if (savepoint == null) {
                throw SqlExceptionUtil.create("problems commiting transaction", e);
            }
            StringBuilder sb = new StringBuilder("problems commiting transaction ");
            sb.append(savepoint.getSavepointName());
            throw SqlExceptionUtil.create(sb.toString(), e);
        }
    }

    public void rollback(Savepoint savepoint) throws SQLException {
        try {
            this.db.endTransaction();
            if (savepoint == null) {
                logger.trace("{}: transaction is ended, unsuccessfuly", (Object) this);
            } else {
                logger.trace("{}: transaction {} is ended, unsuccessfuly", (Object) this, (Object) savepoint.getSavepointName());
            }
        } catch (android.database.SQLException e) {
            if (savepoint == null) {
                throw SqlExceptionUtil.create("problems rolling back transaction", e);
            }
            StringBuilder sb = new StringBuilder("problems rolling back transaction ");
            sb.append(savepoint.getSavepointName());
            throw SqlExceptionUtil.create(sb.toString(), e);
        }
    }

    public int executeStatement(String str, int i) throws SQLException {
        return AndroidCompiledStatement.execSql(this.db, str, str, NO_STRING_ARGS);
    }

    public CompiledStatement compileStatement(String str, StatementBuilder.StatementType statementType, FieldType[] fieldTypeArr, int i, boolean z) {
        AndroidCompiledStatement androidCompiledStatement = new AndroidCompiledStatement(str, this.db, statementType, this.cancelQueriesEnabled, z);
        logger.trace("{}: compiled statement got {}: {}", (Object) this, (Object) androidCompiledStatement, (Object) str);
        return androidCompiledStatement;
    }

    public int insert(String str, Object[] objArr, FieldType[] fieldTypeArr, GeneratedKeyHolder generatedKeyHolder) throws SQLException {
        try {
            SQLiteStatement compileStatement = this.db.compileStatement(str);
            bindArgs(compileStatement, objArr, fieldTypeArr);
            long executeInsert = compileStatement.executeInsert();
            if (generatedKeyHolder != null) {
                generatedKeyHolder.addKey(Long.valueOf(executeInsert));
            }
            logger.trace("{}: insert statement is compiled and executed, changed {}: {}", (Object) this, (Object) 1, (Object) str);
            closeQuietly(compileStatement);
            return 1;
        } catch (android.database.SQLException e) {
            throw SqlExceptionUtil.create("inserting to database failed: ".concat(String.valueOf(str)), e);
        } catch (Throwable th) {
            closeQuietly((SQLiteStatement) null);
            throw th;
        }
    }

    public int update(String str, Object[] objArr, FieldType[] fieldTypeArr) throws SQLException {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(212670206, oncanceled);
            onCancelLoad.getMin(212670206, oncanceled);
        }
        return update(str, objArr, fieldTypeArr, "updated");
    }

    public int delete(String str, Object[] objArr, FieldType[] fieldTypeArr) throws SQLException {
        return update(str, objArr, fieldTypeArr, "deleted");
    }

    public <T> Object queryForOne(String str, Object[] objArr, FieldType[] fieldTypeArr, GenericRowMapper<T> genericRowMapper, ObjectCache objectCache) throws SQLException {
        Cursor cursor;
        android.database.SQLException e;
        T t;
        T t2 = null;
        try {
            cursor = this.db.rawQuery(str, toStrings(objArr));
            try {
                t = new AndroidDatabaseResults(cursor, objectCache, true);
            } catch (android.database.SQLException e2) {
                t = null;
                e = e2;
                try {
                    throw SqlExceptionUtil.create("queryForOne from database failed: ".concat(String.valueOf(str)), e);
                } catch (Throwable th) {
                    th = th;
                    t2 = t;
                    IOUtils.closeQuietly(t2);
                    closeQuietly(cursor);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                IOUtils.closeQuietly(t2);
                closeQuietly(cursor);
                throw th;
            }
            try {
                logger.trace("{}: queried for one result: {}", (Object) this, (Object) str);
                if (t.first()) {
                    t2 = genericRowMapper.mapRow(t);
                    if (t.next()) {
                        Object obj = MORE_THAN_ONE;
                        IOUtils.closeQuietly(t);
                        closeQuietly(cursor);
                        return obj;
                    }
                }
                IOUtils.closeQuietly(t);
                closeQuietly(cursor);
                return t2;
            } catch (android.database.SQLException e3) {
                e = e3;
                throw SqlExceptionUtil.create("queryForOne from database failed: ".concat(String.valueOf(str)), e);
            }
        } catch (android.database.SQLException e4) {
            t = null;
            e = e4;
            cursor = null;
            throw SqlExceptionUtil.create("queryForOne from database failed: ".concat(String.valueOf(str)), e);
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
            IOUtils.closeQuietly(t2);
            closeQuietly(cursor);
            throw th;
        }
    }

    public long queryForLong(String str) throws SQLException {
        SQLiteStatement sQLiteStatement = null;
        try {
            sQLiteStatement = this.db.compileStatement(str);
            long simpleQueryForLong = sQLiteStatement.simpleQueryForLong();
            logger.trace("{}: query for long simple query returned {}: {}", (Object) this, (Object) Long.valueOf(simpleQueryForLong), (Object) str);
            closeQuietly(sQLiteStatement);
            return simpleQueryForLong;
        } catch (android.database.SQLException e) {
            throw SqlExceptionUtil.create("queryForLong from database failed: ".concat(String.valueOf(str)), e);
        } catch (Throwable th) {
            closeQuietly(sQLiteStatement);
            throw th;
        }
    }

    public long queryForLong(String str, Object[] objArr, FieldType[] fieldTypeArr) throws SQLException {
        AndroidDatabaseResults androidDatabaseResults;
        Cursor cursor;
        android.database.SQLException e;
        Cursor cursor2 = null;
        try {
            cursor = this.db.rawQuery(str, toStrings(objArr));
            try {
                androidDatabaseResults = new AndroidDatabaseResults(cursor, (ObjectCache) null, false);
            } catch (android.database.SQLException e2) {
                android.database.SQLException sQLException = e2;
                androidDatabaseResults = null;
                e = sQLException;
                try {
                    throw SqlExceptionUtil.create("queryForLong from database failed: ".concat(String.valueOf(str)), e);
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    closeQuietly(cursor2);
                    IOUtils.closeQuietly(androidDatabaseResults);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                androidDatabaseResults = null;
                cursor2 = cursor;
                closeQuietly(cursor2);
                IOUtils.closeQuietly(androidDatabaseResults);
                throw th;
            }
            try {
                long j = androidDatabaseResults.first() ? androidDatabaseResults.getLong(0) : 0;
                logger.trace("{}: query for long raw query returned {}: {}", (Object) this, (Object) Long.valueOf(j), (Object) str);
                closeQuietly(cursor);
                IOUtils.closeQuietly(androidDatabaseResults);
                return j;
            } catch (android.database.SQLException e3) {
                e = e3;
                throw SqlExceptionUtil.create("queryForLong from database failed: ".concat(String.valueOf(str)), e);
            }
        } catch (android.database.SQLException e4) {
            androidDatabaseResults = null;
            e = e4;
            cursor = null;
            throw SqlExceptionUtil.create("queryForLong from database failed: ".concat(String.valueOf(str)), e);
        } catch (Throwable th3) {
            th = th3;
            androidDatabaseResults = null;
            closeQuietly(cursor2);
            IOUtils.closeQuietly(androidDatabaseResults);
            throw th;
        }
    }

    public void close() throws IOException {
        try {
            this.db.close();
            logger.trace("{}: db {} closed", (Object) this, (Object) this.db);
        } catch (android.database.SQLException e) {
            throw new IOException("problems closing the database connection", e);
        }
    }

    public void closeQuietly() {
        IOUtils.closeQuietly(this);
    }

    public boolean isClosed() throws SQLException {
        try {
            boolean isOpen = this.db.isOpen();
            logger.trace("{}: db {} isOpen returned {}", (Object) this, (Object) this.db, (Object) Boolean.valueOf(isOpen));
            return !isOpen;
        } catch (android.database.SQLException e) {
            throw SqlExceptionUtil.create("problems detecting if the database is closed", e);
        }
    }

    public boolean isTableExists(String str) {
        SQLiteDatabase sQLiteDatabase = this.db;
        StringBuilder sb = new StringBuilder("SELECT DISTINCT tbl_name FROM sqlite_master WHERE tbl_name = '");
        sb.append(str);
        sb.append("'");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), (String[]) null);
        try {
            boolean z = rawQuery.getCount() > 0;
            logger.trace("{}: isTableExists '{}' returned {}", (Object) this, (Object) str, (Object) Boolean.valueOf(z));
            return z;
        } finally {
            rawQuery.close();
        }
    }

    private int update(String str, Object[] objArr, FieldType[] fieldTypeArr, String str2) throws SQLException {
        int i;
        SQLiteStatement sQLiteStatement = null;
        try {
            SQLiteStatement compileStatement = this.db.compileStatement(str);
            try {
                bindArgs(compileStatement, objArr, fieldTypeArr);
                compileStatement.execute();
                closeQuietly(compileStatement);
                try {
                    sQLiteStatement = this.db.compileStatement("SELECT CHANGES()");
                    i = (int) sQLiteStatement.simpleQueryForLong();
                } catch (android.database.SQLException unused) {
                    i = 1;
                } catch (Throwable th) {
                    closeQuietly((SQLiteStatement) null);
                    throw th;
                }
                closeQuietly(sQLiteStatement);
                logger.trace("{} statement is compiled and executed, changed {}: {}", (Object) str2, (Object) Integer.valueOf(i), (Object) str);
                return i;
            } catch (android.database.SQLException e) {
                e = e;
                sQLiteStatement = compileStatement;
                try {
                    throw SqlExceptionUtil.create("updating database failed: ".concat(String.valueOf(str)), e);
                } catch (Throwable th2) {
                    th = th2;
                    closeQuietly(sQLiteStatement);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                sQLiteStatement = compileStatement;
                closeQuietly(sQLiteStatement);
                throw th;
            }
        } catch (android.database.SQLException e2) {
            e = e2;
            throw SqlExceptionUtil.create("updating database failed: ".concat(String.valueOf(str)), e);
        }
    }

    private void bindArgs(SQLiteStatement sQLiteStatement, Object[] objArr, FieldType[] fieldTypeArr) throws SQLException {
        if (objArr != null) {
            for (int i = 0; i < objArr.length; i++) {
                byte[] bArr = objArr[i];
                if (bArr == null) {
                    sQLiteStatement.bindNull(i + 1);
                } else {
                    SqlType sqlType = fieldTypeArr[i].getSqlType();
                    switch (AnonymousClass1.$SwitchMap$com$j256$ormlite$field$SqlType[sqlType.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                            sQLiteStatement.bindString(i + 1, bArr.toString());
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            sQLiteStatement.bindLong(i + 1, ((Number) bArr).longValue());
                            break;
                        case 9:
                        case 10:
                            sQLiteStatement.bindDouble(i + 1, ((Number) bArr).doubleValue());
                            break;
                        case 11:
                        case 12:
                            sQLiteStatement.bindBlob(i + 1, bArr);
                            break;
                        case 13:
                        case 14:
                        case 15:
                            throw new SQLException("Invalid Android type: ".concat(String.valueOf(sqlType)));
                        default:
                            throw new SQLException("Unknown sql argument type: ".concat(String.valueOf(sqlType)));
                    }
                }
            }
        }
    }

    /* renamed from: com.j256.ormlite.android.AndroidDatabaseConnection$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$j256$ormlite$field$SqlType;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.j256.ormlite.field.SqlType[] r0 = com.j256.ormlite.field.SqlType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$j256$ormlite$field$SqlType = r0
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.LONG_STRING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.CHAR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x003e }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.BYTE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.SHORT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.INTEGER     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.LONG     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x006c }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.FLOAT     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.BYTE_ARRAY     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.SERIALIZABLE     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x009c }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.DATE     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.BLOB     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.BIG_DECIMAL     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.android.AndroidDatabaseConnection.AnonymousClass1.<clinit>():void");
        }
    }

    private String[] toStrings(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        String[] strArr = new String[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null) {
                strArr[i] = null;
            } else {
                strArr[i] = obj.toString();
            }
        }
        return strArr;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(AUScreenAdaptTool.PREFIX_ID);
        sb.append(Integer.toHexString(super.hashCode()));
        return sb.toString();
    }

    private void closeQuietly(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    private void closeQuietly(SQLiteStatement sQLiteStatement) {
        if (sQLiteStatement != null) {
            sQLiteStatement.close();
        }
    }

    static class OurSavePoint implements Savepoint {
        private String name;

        public int getSavepointId() {
            return 0;
        }

        public OurSavePoint(String str) {
            this.name = str;
        }

        public String getSavepointName() {
            return this.name;
        }
    }
}
