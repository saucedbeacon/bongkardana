package com.facebook.stetho.inspector.database;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver;
import com.facebook.stetho.inspector.protocol.module.DatabaseDescriptor;
import com.facebook.stetho.inspector.protocol.module.DatabaseDriver2;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class SqliteDatabaseDriver extends DatabaseDriver2<SqliteDatabaseDescriptor> {
    private static final String[] UNINTERESTING_FILENAME_SUFFIXES = {"-journal", "-shm", "-uid", "-wal"};
    private final DatabaseConnectionProvider mDatabaseConnectionProvider;
    private final DatabaseFilesProvider mDatabaseFilesProvider;

    @Deprecated
    public SqliteDatabaseDriver(Context context) {
        this(context, new DefaultDatabaseFilesProvider(context), new DefaultDatabaseConnectionProvider());
    }

    @Deprecated
    public SqliteDatabaseDriver(Context context, DatabaseFilesProvider databaseFilesProvider) {
        this(context, databaseFilesProvider, new DefaultDatabaseConnectionProvider());
    }

    public SqliteDatabaseDriver(Context context, DatabaseFilesProvider databaseFilesProvider, DatabaseConnectionProvider databaseConnectionProvider) {
        super(context);
        this.mDatabaseFilesProvider = databaseFilesProvider;
        this.mDatabaseConnectionProvider = databaseConnectionProvider;
    }

    public List<SqliteDatabaseDescriptor> getDatabaseNames() {
        ArrayList arrayList = new ArrayList();
        List<File> databaseFiles = this.mDatabaseFilesProvider.getDatabaseFiles();
        Collections.sort(databaseFiles);
        for (File sqliteDatabaseDescriptor : tidyDatabaseList(databaseFiles)) {
            arrayList.add(new SqliteDatabaseDescriptor(sqliteDatabaseDescriptor));
        }
        return arrayList;
    }

    static List<File> tidyDatabaseList(List<File> list) {
        HashSet hashSet = new HashSet(list);
        ArrayList arrayList = new ArrayList();
        for (File next : list) {
            String path = next.getPath();
            String removeSuffix = removeSuffix(path, UNINTERESTING_FILENAME_SUFFIXES);
            if (removeSuffix.equals(path) || !hashSet.contains(new File(removeSuffix))) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private static String removeSuffix(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (str.endsWith(str2)) {
                return str.substring(0, str.length() - str2.length());
            }
        }
        return str;
    }

    public List<String> getTableNames(SqliteDatabaseDescriptor sqliteDatabaseDescriptor) throws SQLiteException {
        Cursor rawQuery;
        SQLiteDatabase openDatabase = openDatabase(sqliteDatabaseDescriptor);
        try {
            rawQuery = openDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type IN (?, ?)", new String[]{"table", "view"});
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                arrayList.add(rawQuery.getString(0));
            }
            rawQuery.close();
            openDatabase.close();
            return arrayList;
        } catch (Throwable th) {
            openDatabase.close();
            throw th;
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x0071=Splitter:B:32:0x0071, B:40:0x0085=Splitter:B:40:0x0085} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.stetho.inspector.protocol.module.Database.ExecuteSQLResponse executeSQL(com.facebook.stetho.inspector.database.SqliteDatabaseDriver.SqliteDatabaseDescriptor r9, java.lang.String r10, com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver.ExecuteResultHandler<com.facebook.stetho.inspector.protocol.module.Database.ExecuteSQLResponse> r11) throws android.database.sqlite.SQLiteException {
        /*
            r8 = this;
            com.facebook.stetho.common.Util.throwIfNull(r10)
            com.facebook.stetho.common.Util.throwIfNull(r11)
            android.database.sqlite.SQLiteDatabase r9 = r8.openDatabase(r9)
            java.lang.String r0 = getFirstWord(r10)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.toUpperCase()     // Catch:{ all -> 0x008f }
            r1 = -1
            int r2 = r0.hashCode()     // Catch:{ all -> 0x008f }
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r2) {
                case -2130463047: goto L_0x0052;
                case -1926899396: goto L_0x0048;
                case -1852692228: goto L_0x003e;
                case -1785516855: goto L_0x0034;
                case -591179561: goto L_0x002a;
                case 2012838315: goto L_0x0020;
                default: goto L_0x001f;
            }     // Catch:{ all -> 0x008f }
        L_0x001f:
            goto L_0x005b
        L_0x0020:
            java.lang.String r2 = "DELETE"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x005b
            r1 = 1
            goto L_0x005b
        L_0x002a:
            java.lang.String r2 = "EXPLAIN"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x005b
            r1 = 5
            goto L_0x005b
        L_0x0034:
            java.lang.String r2 = "UPDATE"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x005b
            r1 = 0
            goto L_0x005b
        L_0x003e:
            java.lang.String r2 = "SELECT"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x005b
            r1 = 3
            goto L_0x005b
        L_0x0048:
            java.lang.String r2 = "PRAGMA"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x005b
            r1 = 4
            goto L_0x005b
        L_0x0052:
            java.lang.String r2 = "INSERT"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x005b
            r1 = 2
        L_0x005b:
            if (r1 == 0) goto L_0x0085
            if (r1 == r7) goto L_0x0085
            if (r1 == r6) goto L_0x007b
            if (r1 == r5) goto L_0x0071
            if (r1 == r4) goto L_0x0071
            if (r1 == r3) goto L_0x0071
            java.lang.Object r10 = r8.executeRawQuery(r9, r10, r11)     // Catch:{ all -> 0x008f }
            com.facebook.stetho.inspector.protocol.module.Database$ExecuteSQLResponse r10 = (com.facebook.stetho.inspector.protocol.module.Database.ExecuteSQLResponse) r10     // Catch:{ all -> 0x008f }
            r9.close()
            return r10
        L_0x0071:
            java.lang.Object r10 = r8.executeSelect(r9, r10, r11)     // Catch:{ all -> 0x008f }
            com.facebook.stetho.inspector.protocol.module.Database$ExecuteSQLResponse r10 = (com.facebook.stetho.inspector.protocol.module.Database.ExecuteSQLResponse) r10     // Catch:{ all -> 0x008f }
            r9.close()
            return r10
        L_0x007b:
            java.lang.Object r10 = r8.executeInsert(r9, r10, r11)     // Catch:{ all -> 0x008f }
            com.facebook.stetho.inspector.protocol.module.Database$ExecuteSQLResponse r10 = (com.facebook.stetho.inspector.protocol.module.Database.ExecuteSQLResponse) r10     // Catch:{ all -> 0x008f }
            r9.close()
            return r10
        L_0x0085:
            java.lang.Object r10 = r8.executeUpdateDelete(r9, r10, r11)     // Catch:{ all -> 0x008f }
            com.facebook.stetho.inspector.protocol.module.Database$ExecuteSQLResponse r10 = (com.facebook.stetho.inspector.protocol.module.Database.ExecuteSQLResponse) r10     // Catch:{ all -> 0x008f }
            r9.close()
            return r10
        L_0x008f:
            r10 = move-exception
            r9.close()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.stetho.inspector.database.SqliteDatabaseDriver.executeSQL(com.facebook.stetho.inspector.database.SqliteDatabaseDriver$SqliteDatabaseDescriptor, java.lang.String, com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver$ExecuteResultHandler):com.facebook.stetho.inspector.protocol.module.Database$ExecuteSQLResponse");
    }

    private static String getFirstWord(String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(32);
        return indexOf >= 0 ? trim.substring(0, indexOf) : trim;
    }

    @TargetApi(11)
    private <T> T executeUpdateDelete(SQLiteDatabase sQLiteDatabase, String str, BaseDatabaseDriver.ExecuteResultHandler<T> executeResultHandler) {
        return executeResultHandler.handleUpdateDelete(sQLiteDatabase.compileStatement(str).executeUpdateDelete());
    }

    private <T> T executeInsert(SQLiteDatabase sQLiteDatabase, String str, BaseDatabaseDriver.ExecuteResultHandler<T> executeResultHandler) {
        return executeResultHandler.handleInsert(sQLiteDatabase.compileStatement(str).executeInsert());
    }

    private <T> T executeSelect(SQLiteDatabase sQLiteDatabase, String str, BaseDatabaseDriver.ExecuteResultHandler<T> executeResultHandler) {
        Cursor rawQuery = sQLiteDatabase.rawQuery(str, (String[]) null);
        try {
            return executeResultHandler.handleSelect(rawQuery);
        } finally {
            rawQuery.close();
        }
    }

    private <T> T executeRawQuery(SQLiteDatabase sQLiteDatabase, String str, BaseDatabaseDriver.ExecuteResultHandler<T> executeResultHandler) {
        sQLiteDatabase.execSQL(str);
        return executeResultHandler.handleRawQuery();
    }

    private SQLiteDatabase openDatabase(SqliteDatabaseDescriptor sqliteDatabaseDescriptor) throws SQLiteException {
        Util.throwIfNull(sqliteDatabaseDescriptor);
        return this.mDatabaseConnectionProvider.openDatabase(sqliteDatabaseDescriptor.file);
    }

    static class SqliteDatabaseDescriptor implements DatabaseDescriptor {
        public final File file;

        public SqliteDatabaseDescriptor(File file2) {
            this.file = file2;
        }

        public String name() {
            return this.file.getName();
        }
    }
}
