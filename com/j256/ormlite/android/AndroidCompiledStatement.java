package com.j256.ormlite.android;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.j256.ormlite.android.compat.ApiCompatibility;
import com.j256.ormlite.android.compat.ApiCompatibilityUtils;
import com.j256.ormlite.dao.ObjectCache;
import com.j256.ormlite.field.SqlType;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.misc.SqlExceptionUtil;
import com.j256.ormlite.stmt.StatementBuilder;
import com.j256.ormlite.support.CompiledStatement;
import com.j256.ormlite.support.DatabaseResults;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AndroidCompiledStatement implements CompiledStatement {
    private static final String[] NO_STRING_ARGS = new String[0];
    private static final ApiCompatibility apiCompatibility = ApiCompatibilityUtils.getCompatibility();
    private static Logger logger = LoggerFactory.getLogger((Class<?>) AndroidCompiledStatement.class);
    private List<Object> args;
    private final boolean cacheStore;
    private final boolean cancelQueriesEnabled;
    private ApiCompatibility.CancellationHook cancellationHook;
    private Cursor cursor;
    private final SQLiteDatabase db;
    private Integer max;
    private final String sql;
    private final StatementBuilder.StatementType type;

    public void setQueryTimeout(long j) {
    }

    public AndroidCompiledStatement(String str, SQLiteDatabase sQLiteDatabase, StatementBuilder.StatementType statementType, boolean z, boolean z2) {
        this.sql = str;
        this.db = sQLiteDatabase;
        this.type = statementType;
        this.cancelQueriesEnabled = z;
        this.cacheStore = z2;
    }

    public int getColumnCount() throws SQLException {
        return getCursor().getColumnCount();
    }

    public String getColumnName(int i) throws SQLException {
        return getCursor().getColumnName(i);
    }

    public DatabaseResults runQuery(ObjectCache objectCache) throws SQLException {
        if (this.type.isOkForQuery()) {
            return new AndroidDatabaseResults(getCursor(), objectCache, this.cacheStore);
        }
        StringBuilder sb = new StringBuilder("Cannot call query on a ");
        sb.append(this.type);
        sb.append(" statement");
        throw new IllegalArgumentException(sb.toString());
    }

    public int runUpdate() throws SQLException {
        String str;
        if (this.type.isOkForUpdate()) {
            if (this.max == null) {
                str = this.sql;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.sql);
                sb.append(" ");
                sb.append(this.max);
                str = sb.toString();
            }
            return execSql(this.db, "runUpdate", str, getArgArray());
        }
        StringBuilder sb2 = new StringBuilder("Cannot call update on a ");
        sb2.append(this.type);
        sb2.append(" statement");
        throw new IllegalArgumentException(sb2.toString());
    }

    public int runExecute() throws SQLException {
        if (this.type.isOkForExecute()) {
            return execSql(this.db, "runExecute", this.sql, getArgArray());
        }
        StringBuilder sb = new StringBuilder("Cannot call execute on a ");
        sb.append(this.type);
        sb.append(" statement");
        throw new IllegalArgumentException(sb.toString());
    }

    public void close() throws IOException {
        Cursor cursor2 = this.cursor;
        if (cursor2 != null && !cursor2.isClosed()) {
            try {
                this.cursor.close();
            } catch (android.database.SQLException e) {
                throw new IOException("Problems closing Android cursor", e);
            }
        }
        this.cancellationHook = null;
    }

    public void closeQuietly() {
        Cursor cursor2 = this.cursor;
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public void cancel() {
        ApiCompatibility.CancellationHook cancellationHook2 = this.cancellationHook;
        if (cancellationHook2 != null) {
            cancellationHook2.cancel();
        }
    }

    public void setObject(int i, Object obj, SqlType sqlType) throws SQLException {
        isInPrep();
        if (this.args == null) {
            this.args = new ArrayList();
        }
        if (obj == null) {
            this.args.add(i, (Object) null);
            return;
        }
        switch (AnonymousClass1.$SwitchMap$com$j256$ormlite$field$SqlType[sqlType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                this.args.add(i, obj.toString());
                return;
            case 12:
            case 13:
                this.args.add(i, obj);
                return;
            case 14:
            case 15:
                throw new SQLException("Invalid Android type: ".concat(String.valueOf(sqlType)));
            default:
                throw new SQLException("Unknown sql argument type: ".concat(String.valueOf(sqlType)));
        }
    }

    /* renamed from: com.j256.ormlite.android.AndroidCompiledStatement$1  reason: invalid class name */
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
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.DATE     // Catch:{ NoSuchFieldError -> 0x0028 }
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
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.CHAR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.BYTE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.SHORT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.INTEGER     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x006c }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.LONG     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.BYTE_ARRAY     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = $SwitchMap$com$j256$ormlite$field$SqlType     // Catch:{ NoSuchFieldError -> 0x009c }
                com.j256.ormlite.field.SqlType r1 = com.j256.ormlite.field.SqlType.SERIALIZABLE     // Catch:{ NoSuchFieldError -> 0x009c }
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
            throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.android.AndroidCompiledStatement.AnonymousClass1.<clinit>():void");
        }
    }

    public void setMaxRows(int i) throws SQLException {
        isInPrep();
        this.max = Integer.valueOf(i);
    }

    public Cursor getCursor() throws SQLException {
        String str;
        if (this.cursor == null) {
            try {
                if (this.max == null) {
                    str = this.sql;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.sql);
                    sb.append(" LIMIT ");
                    sb.append(this.max);
                    str = sb.toString();
                }
                if (this.cancelQueriesEnabled) {
                    this.cancellationHook = apiCompatibility.createCancellationHook();
                }
                Cursor rawQuery = apiCompatibility.rawQuery(this.db, str, getStringArray(), this.cancellationHook);
                this.cursor = rawQuery;
                rawQuery.moveToFirst();
                logger.trace("{}: started rawQuery cursor for: {}", (Object) this, (Object) str);
            } catch (android.database.SQLException e) {
                throw SqlExceptionUtil.create("Problems executing Android query: ".concat(String.valueOf((Object) null)), e);
            }
        }
        return this.cursor;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(AUScreenAdaptTool.PREFIX_ID);
        sb.append(Integer.toHexString(super.hashCode()));
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r5 == null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        logger.trace("executing statement {} changed {} rows: {}", (java.lang.Object) r3, (java.lang.Object) java.lang.Integer.valueOf(r2), (java.lang.Object) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if (r5 != null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r5.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int execSql(android.database.sqlite.SQLiteDatabase r2, java.lang.String r3, java.lang.String r4, java.lang.Object[] r5) throws java.sql.SQLException {
        /*
            r2.execSQL(r4, r5)     // Catch:{ SQLException -> 0x002e }
            r5 = 0
            java.lang.String r0 = "SELECT CHANGES()"
            android.database.sqlite.SQLiteStatement r5 = r2.compileStatement(r0)     // Catch:{ SQLException -> 0x0015, all -> 0x0017 }
            long r0 = r5.simpleQueryForLong()     // Catch:{ SQLException -> 0x0015, all -> 0x0017 }
            int r2 = (int) r0
            if (r5 == 0) goto L_0x0022
        L_0x0011:
            r5.close()
            goto L_0x0022
        L_0x0015:
            goto L_0x001e
        L_0x0017:
            r2 = move-exception
            if (r5 == 0) goto L_0x001d
            r5.close()
        L_0x001d:
            throw r2
        L_0x001e:
            r2 = 1
            if (r5 == 0) goto L_0x0022
            goto L_0x0011
        L_0x0022:
            com.j256.ormlite.logger.Logger r5 = logger
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.String r1 = "executing statement {} changed {} rows: {}"
            r5.trace((java.lang.String) r1, (java.lang.Object) r3, (java.lang.Object) r0, (java.lang.Object) r4)
            return r2
        L_0x002e:
            r2 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Problems executing "
            r5.<init>(r0)
            r5.append(r3)
            java.lang.String r3 = " Android statement: "
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            java.sql.SQLException r2 = com.j256.ormlite.misc.SqlExceptionUtil.create(r3, r2)
            goto L_0x004b
        L_0x004a:
            throw r2
        L_0x004b:
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.android.AndroidCompiledStatement.execSql(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.Object[]):int");
    }

    private void isInPrep() throws SQLException {
        if (this.cursor != null) {
            throw new SQLException("Query already run. Cannot add argument values.");
        }
    }

    private Object[] getArgArray() {
        List<Object> list = this.args;
        if (list == null) {
            return NO_STRING_ARGS;
        }
        return list.toArray(new Object[list.size()]);
    }

    private String[] getStringArray() {
        List<Object> list = this.args;
        if (list == null) {
            return NO_STRING_ARGS;
        }
        return (String[]) list.toArray(new String[list.size()]);
    }
}
