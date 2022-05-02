package net.sqlcipher.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.os.Debug;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.alibaba.fastjson.parser.JSONLexer;
import com.j256.ormlite.field.FieldType;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import kotlin.text.Typography;
import net.sqlcipher.CrossProcessCursorWrapper;
import net.sqlcipher.Cursor;
import net.sqlcipher.CursorWrapper;
import net.sqlcipher.DatabaseErrorHandler;
import net.sqlcipher.DatabaseUtils;
import net.sqlcipher.SQLException;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class SQLiteDatabase extends SQLiteClosable implements SupportSQLiteDatabase {
    private static final String COMMIT_SQL = "COMMIT;";
    public static final int CONFLICT_ABORT = 2;
    public static final int CONFLICT_FAIL = 3;
    public static final int CONFLICT_IGNORE = 4;
    public static final int CONFLICT_NONE = 0;
    public static final int CONFLICT_REPLACE = 5;
    public static final int CONFLICT_ROLLBACK = 1;
    private static final String[] CONFLICT_VALUES = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final int CREATE_IF_NECESSARY = 268435456;
    private static final Pattern EMAIL_IN_DB_PATTERN = Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+");
    private static final int EVENT_DB_CORRUPT = 75004;
    private static final int EVENT_DB_OPERATION = 52000;
    static final String GET_LOCK_LOG_PREFIX = "GETLOCK:";
    private static int IsOverlapping = 1;
    private static final String KEY_ENCODING = "UTF-8";
    private static final int LOCK_ACQUIRED_WARNING_THREAD_TIME_IN_MS = 100;
    private static final int LOCK_ACQUIRED_WARNING_TIME_IN_MS = 300;
    private static final int LOCK_ACQUIRED_WARNING_TIME_IN_MS_ALWAYS_PRINT = 2000;
    private static final int LOCK_WARNING_WINDOW_IN_MS = 20000;
    private static final String LOG_SLOW_QUERIES_PROPERTY = "db.log.slow_query_threshold";
    public static final int MAX_SQL_CACHE_SIZE = 250;
    private static final int MAX_WARNINGS_ON_CACHESIZE_CONDITION = 1;
    public static final String MEMORY = ":memory:";
    public static final int NO_LOCALIZED_COLLATORS = 16;
    public static final int OPEN_READONLY = 1;
    public static final int OPEN_READWRITE = 0;
    private static final int OPEN_READ_MASK = 1;
    private static final int QUERY_LOG_SQL_LENGTH = 64;
    private static final int SLEEP_AFTER_YIELD_QUANTUM = 1000;
    public static final String SQLCIPHER_ANDROID_VERSION = "4.4.3";
    public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;
    private static final String TAG = "Database";
    private static int getMax;
    private static int getMin;
    private static boolean length;
    private static WeakHashMap<SQLiteDatabase, Object> sActiveDatabases = new WeakHashMap<>();
    private static int sQueryLogTimeInMillis = 0;
    private static char[] setMax;
    private static boolean setMin;
    private int mCacheFullWarnings;
    Map<String, SQLiteCompiledSql> mCompiledQueries;
    private final DatabaseErrorHandler mErrorHandler;
    private CursorFactory mFactory;
    private int mFlags;
    private boolean mInnerTransactionIsSuccessful;
    private long mLastLockMessageTime;
    private String mLastSqlStatement;
    private final ReentrantLock mLock;
    private long mLockAcquiredThreadTime;
    private long mLockAcquiredWallTime;
    private boolean mLockingEnabled;
    private int mMaxSqlCacheSize;
    long mNativeHandle;
    private int mNumCacheHits;
    private int mNumCacheMisses;
    private String mPath;
    private String mPathForLogs;
    private WeakHashMap<SQLiteClosable, Object> mPrograms;
    private final int mSlowQueryThreshold;
    private Throwable mStackTrace;
    private final Map<String, SyncUpdateInfo> mSyncUpdateInfo;
    int mTempTableSequence;
    private String mTimeClosed;
    private String mTimeOpened;
    private boolean mTransactionIsSuccessful;
    private SQLiteTransactionListener mTransactionListener;

    public interface CursorFactory {
        Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery);
    }

    public interface LibraryLoader {
        void loadLibraries(String... strArr);
    }

    enum SQLiteDatabaseTransactionType {
        Deferred,
        Immediate,
        Exclusive
    }

    private native void dbclose();

    private native void dbopen(String str, int i);

    private native void enableSqlProfiling(String str);

    private native void enableSqlTracing(String str);

    private native void key(byte[] bArr) throws SQLException;

    private native void key_mutf8(char[] cArr) throws SQLException;

    private native int native_getDbLookaside();

    private native void native_rawExecSQL(String str);

    private native int native_status(int i, boolean z);

    public static SQLiteDatabase openOrCreateDatabase(File file, String str, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        String str2;
        int i = getMin + 39;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        if (!(file == null)) {
            str2 = file.getPath();
        } else {
            int i3 = IsOverlapping + 101;
            getMin = i3 % 128;
            int i4 = i3 % 2;
            str2 = null;
        }
        return openOrCreateDatabase(str2, str, cursorFactory, sQLiteDatabaseHook, databaseErrorHandler);
    }

    private native void rekey(byte[] bArr) throws SQLException;

    public static native int releaseMemory();

    public static native void setICURoot(String str);

    static void setMax() {
        getMax = 39;
        setMin = true;
        length = true;
        setMax = new char[]{'|', '{', 'm', 'T', '_'};
    }

    /* access modifiers changed from: package-private */
    public native int lastChangeCount();

    /* access modifiers changed from: package-private */
    public native long lastInsertRow();

    /* access modifiers changed from: package-private */
    public native void native_execSQL(String str) throws SQLException;

    /* access modifiers changed from: package-private */
    public native void native_setLocale(String str, int i);

    static /* synthetic */ void access$000(SQLiteDatabase sQLiteDatabase, byte[] bArr) throws SQLException {
        int i = IsOverlapping + 17;
        getMin = i % 128;
        if ((i % 2 != 0 ? 3 : '[') != 3) {
            sQLiteDatabase.key(bArr);
        } else {
            sQLiteDatabase.key(bArr);
            Object obj = null;
            super.hashCode();
        }
        int i2 = IsOverlapping + 57;
        getMin = i2 % 128;
        int i3 = i2 % 2;
    }

    static /* synthetic */ void access$100(SQLiteDatabase sQLiteDatabase, char[] cArr) throws SQLException {
        int i = getMin + 73;
        IsOverlapping = i % 128;
        if ((i % 2 == 0 ? '1' : 11) != 11) {
            sQLiteDatabase.key_mutf8(cArr);
            Object[] objArr = null;
            int length2 = objArr.length;
            return;
        }
        sQLiteDatabase.key_mutf8(cArr);
    }

    static {
        setMax();
        int i = getMin + 75;
        IsOverlapping = i % 128;
        int i2 = i % 2;
    }

    public int status(int i, boolean z) {
        int i2 = getMin + 53;
        IsOverlapping = i2 % 128;
        char c = i2 % 2 == 0 ? 19 : '+';
        int native_status = native_status(i, z);
        if (c != '+') {
            Object[] objArr = null;
            int length2 = objArr.length;
        }
        return native_status;
    }

    public void changePassword(String str) throws SQLiteException {
        int i = IsOverlapping + 11;
        getMin = i % 128;
        int i2 = i % 2;
        if (isOpen()) {
            if (!(str == null)) {
                int i3 = getMin + 9;
                IsOverlapping = i3 % 128;
                int i4 = i3 % 2;
                try {
                    byte[] bytes = getBytes(str.toCharArray());
                    rekey(bytes);
                    Arrays.fill(bytes, (byte) 0);
                } catch (Exception e) {
                    throw e;
                }
            }
        } else {
            throw new SQLiteException("database not open");
        }
    }

    public void changePassword(char[] cArr) throws SQLiteException {
        int i = getMin + 59;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        if (isOpen()) {
            if ((cArr != null ? '=' : '9') == '=') {
                int i3 = getMin + 11;
                IsOverlapping = i3 % 128;
                if (i3 % 2 != 0) {
                    byte[] bytes = getBytes(cArr);
                    rekey(bytes);
                    Arrays.fill(bytes, (byte) 0);
                } else {
                    byte[] bytes2 = getBytes(cArr);
                    rekey(bytes2);
                    Arrays.fill(bytes2, (byte) 0);
                }
            }
            int i4 = getMin + 29;
            IsOverlapping = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        throw new SQLiteException("database not open");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.util.zip.ZipInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.util.zip.ZipInputStream} */
    /* JADX WARNING: type inference failed for: r7v2, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v19 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bb A[Catch:{ all -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00c9 A[SYNTHETIC, Splitter:B:73:0x00c9] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d1 A[Catch:{ IOException -> 0x00cd }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void loadICUData(android.content.Context r6, java.io.File r7) {
        /*
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "icu"
            r0.<init>(r7, r1)
            java.io.File r7 = new java.io.File
            java.lang.String r1 = "icudt46l.dat"
            r7.<init>(r0, r1)
            r1 = 0
            boolean r2 = r0.exists()     // Catch:{ Exception -> 0x00b3, all -> 0x00b0 }
            if (r2 != 0) goto L_0x0022
            int r2 = getMin
            int r2 = r2 + 69
            int r3 = r2 % 128
            IsOverlapping = r3
            int r2 = r2 % 2
            r0.mkdirs()     // Catch:{ Exception -> 0x00b3, all -> 0x00b0 }
        L_0x0022:
            boolean r0 = r7.exists()     // Catch:{ Exception -> 0x00b3, all -> 0x00b0 }
            r2 = 0
            if (r0 != 0) goto L_0x0063
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x00b3, all -> 0x00b0 }
            android.content.res.AssetManager r6 = r6.getAssets()     // Catch:{ Exception -> 0x00b3, all -> 0x00b0 }
            java.lang.String r3 = "icudt46l.zip"
            java.io.InputStream r6 = r6.open(r3)     // Catch:{ Exception -> 0x00b3, all -> 0x00b0 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x00b3, all -> 0x00b0 }
            r0.getNextEntry()     // Catch:{ Exception -> 0x0061 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0061 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x0061 }
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch:{ Exception -> 0x005c, all -> 0x0055 }
        L_0x0044:
            int r3 = r0.read(r1)     // Catch:{ Exception -> 0x005c, all -> 0x0055 }
            if (r3 <= 0) goto L_0x004c
            r4 = 0
            goto L_0x004d
        L_0x004c:
            r4 = 1
        L_0x004d:
            if (r4 == 0) goto L_0x0051
            r1 = r0
            goto L_0x0064
        L_0x0051:
            r6.write(r1, r2, r3)     // Catch:{ Exception -> 0x005c, all -> 0x0055 }
            goto L_0x0044
        L_0x0055:
            r7 = move-exception
            r1 = r0
            r5 = r7
            r7 = r6
            r6 = r5
            goto L_0x00c7
        L_0x005c:
            r1 = move-exception
            r5 = r1
            r1 = r6
            r6 = r5
            goto L_0x00b5
        L_0x0061:
            r6 = move-exception
            goto L_0x00b5
        L_0x0063:
            r6 = r1
        L_0x0064:
            if (r1 == 0) goto L_0x0087
            int r7 = getMin
            int r7 = r7 + 47
            int r0 = r7 % 128
            IsOverlapping = r0
            int r7 = r7 % 2
            r0 = 35
            if (r7 != 0) goto L_0x0077
            r7 = 35
            goto L_0x0078
        L_0x0077:
            r7 = 3
        L_0x0078:
            if (r7 == r0) goto L_0x007e
            r1.close()     // Catch:{ IOException -> 0x009e }
            goto L_0x0087
        L_0x007e:
            r1.close()     // Catch:{ IOException -> 0x009e }
            r7 = 18
            int r7 = r7 / r2
            goto L_0x0087
        L_0x0085:
            r6 = move-exception
            throw r6
        L_0x0087:
            if (r6 == 0) goto L_0x00a5
            r6.flush()     // Catch:{ IOException -> 0x009e }
            r6.close()     // Catch:{ IOException -> 0x009e }
            int r6 = IsOverlapping     // Catch:{ Exception -> 0x009c }
            int r6 = r6 + 69
            int r7 = r6 % 128
            getMin = r7     // Catch:{ Exception -> 0x009a }
            int r6 = r6 % 2
            goto L_0x00a5
        L_0x009a:
            r6 = move-exception
            throw r6
        L_0x009c:
            r6 = move-exception
            throw r6
        L_0x009e:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            r7.<init>(r6)
            throw r7
        L_0x00a5:
            int r6 = IsOverlapping
            int r6 = r6 + 59
            int r7 = r6 % 128
            getMin = r7
            int r6 = r6 % 2
            return
        L_0x00b0:
            r6 = move-exception
            r7 = r1
            goto L_0x00c7
        L_0x00b3:
            r6 = move-exception
            r0 = r1
        L_0x00b5:
            boolean r2 = r7.exists()     // Catch:{ all -> 0x00c4 }
            if (r2 == 0) goto L_0x00be
            r7.delete()     // Catch:{ all -> 0x00c4 }
        L_0x00be:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch:{ all -> 0x00c4 }
            r7.<init>(r6)     // Catch:{ all -> 0x00c4 }
            throw r7     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r6 = move-exception
            r7 = r1
            r1 = r0
        L_0x00c7:
            if (r1 == 0) goto L_0x00cf
            r1.close()     // Catch:{ IOException -> 0x00cd }
            goto L_0x00cf
        L_0x00cd:
            r6 = move-exception
            goto L_0x00d8
        L_0x00cf:
            if (r7 == 0) goto L_0x00de
            r7.flush()     // Catch:{ IOException -> 0x00cd }
            r7.close()     // Catch:{ IOException -> 0x00cd }
            goto L_0x00de
        L_0x00d8:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            r7.<init>(r6)
            throw r7
        L_0x00de:
            goto L_0x00e0
        L_0x00df:
            throw r6
        L_0x00e0:
            goto L_0x00df
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.loadICUData(android.content.Context, java.io.File):void");
    }

    public static synchronized void loadLibs(Context context) {
        synchronized (SQLiteDatabase.class) {
            int i = IsOverlapping + 87;
            getMin = i % 128;
            int i2 = i % 2;
            loadLibs(context, context.getFilesDir());
            int i3 = getMin + 105;
            IsOverlapping = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    public static synchronized void loadLibs(Context context, File file) {
        synchronized (SQLiteDatabase.class) {
            try {
                loadLibs(context, file, new LibraryLoader() {
                    public final void loadLibraries(String... strArr) {
                        for (String loadLibrary : strArr) {
                            System.loadLibrary(loadLibrary);
                        }
                    }
                });
                int i = IsOverlapping + 97;
                getMin = i % 128;
                if ((i % 2 != 0 ? 15 : 'C') != 'C') {
                    int i2 = 5 / 0;
                }
            } catch (Exception e) {
                throw e;
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    public static synchronized void loadLibs(Context context, LibraryLoader libraryLoader) {
        synchronized (SQLiteDatabase.class) {
            int i = getMin + 79;
            IsOverlapping = i % 128;
            if ((i % 2 == 0 ? (char) 30 : 12) != 30) {
                loadLibs(context, context.getFilesDir(), libraryLoader);
            } else {
                loadLibs(context, context.getFilesDir(), libraryLoader);
                Object[] objArr = null;
                int length2 = objArr.length;
            }
        }
    }

    public static synchronized void loadLibs(Context context, File file, LibraryLoader libraryLoader) {
        synchronized (SQLiteDatabase.class) {
            int i = IsOverlapping + 109;
            getMin = i % 128;
            int i2 = i % 2;
            try {
                libraryLoader.loadLibraries("sqlcipher");
                int i3 = IsOverlapping + 125;
                getMin = i3 % 128;
                if (i3 % 2 != 0) {
                    Object[] objArr = null;
                    int length2 = objArr.length;
                    return;
                }
                return;
            } catch (Exception e) {
                throw e;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void addSQLiteClosable(SQLiteClosable sQLiteClosable) {
        int i = getMin + 73;
        IsOverlapping = i % 128;
        Object[] objArr = null;
        if ((i % 2 == 0 ? 'C' : 27) != 'C') {
            try {
                lock();
            } catch (Exception e) {
                throw e;
            }
            try {
                this.mPrograms.put(sQLiteClosable, objArr);
            } finally {
                unlock();
            }
        } else {
            lock();
            this.mPrograms.put(sQLiteClosable, objArr);
            unlock();
            int length2 = objArr.length;
        }
    }

    /* access modifiers changed from: package-private */
    public void removeSQLiteClosable(SQLiteClosable sQLiteClosable) {
        int i = getMin + 51;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        try {
            lock();
            try {
                this.mPrograms.remove(sQLiteClosable);
                try {
                    int i3 = getMin + 95;
                    IsOverlapping = i3 % 128;
                    if ((i3 % 2 == 0 ? '6' : '2') != '2') {
                        int i4 = 16 / 0;
                    }
                } catch (Exception e) {
                    throw e;
                }
            } finally {
                unlock();
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* access modifiers changed from: protected */
    public void onAllReferencesReleased() {
        if (isOpen()) {
            if (SQLiteDebug.DEBUG_SQL_CACHE) {
                this.mTimeClosed = getTime();
            }
            dbclose();
            synchronized (sActiveDatabases) {
                sActiveDatabases.remove(this);
            }
        }
    }

    public void setLockingEnabled(boolean z) {
        int i = IsOverlapping + 89;
        getMin = i % 128;
        if (!(i % 2 == 0)) {
            this.mLockingEnabled = z;
            Object obj = null;
            super.hashCode();
        } else {
            this.mLockingEnabled = z;
        }
        int i2 = getMin + 77;
        IsOverlapping = i2 % 128;
        int i3 = i2 % 2;
    }

    /* access modifiers changed from: package-private */
    public void onCorruption() {
        int i = IsOverlapping + 33;
        getMin = i % 128;
        Object obj = null;
        if ((i % 2 != 0 ? 'V' : Typography.less) != '<') {
            this.mErrorHandler.onCorruption(this);
            super.hashCode();
        } else {
            this.mErrorHandler.onCorruption(this);
        }
        int i2 = getMin + 65;
        IsOverlapping = i2 % 128;
        if (!(i2 % 2 != 0)) {
            super.hashCode();
        }
    }

    /* access modifiers changed from: package-private */
    public void lock() {
        if (this.mLockingEnabled) {
            try {
                try {
                    this.mLock.lock();
                    if ((SQLiteDebug.DEBUG_LOCK_TIME_TRACKING ? 9 : 'I') == 9) {
                        if ((this.mLock.getHoldCount() == 1 ? '(' : '=') != '=') {
                            int i = IsOverlapping + 111;
                            getMin = i % 128;
                            int i2 = i % 2;
                            this.mLockAcquiredWallTime = SystemClock.elapsedRealtime();
                            this.mLockAcquiredThreadTime = Debug.threadCpuTimeNanos();
                            int i3 = getMin + 91;
                            IsOverlapping = i3 % 128;
                            int i4 = i3 % 2;
                        }
                    }
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r0 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (net.sqlcipher.database.SQLiteDebug.DEBUG_LOCK_TIME_TRACKING != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void lockForced() {
        /*
            r3 = this;
            int r0 = getMin     // Catch:{ Exception -> 0x0063 }
            int r0 = r0 + 23
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            r1 = 48
            if (r0 != 0) goto L_0x0011
            r0 = 73
            goto L_0x0013
        L_0x0011:
            r0 = 48
        L_0x0013:
            r2 = 0
            if (r0 == r1) goto L_0x0024
            java.util.concurrent.locks.ReentrantLock r0 = r3.mLock
            r0.lock()
            boolean r0 = net.sqlcipher.database.SQLiteDebug.DEBUG_LOCK_TIME_TRACKING
            r1 = 0
            int r1 = r1.length     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0047
            goto L_0x002d
        L_0x0022:
            r0 = move-exception
            throw r0
        L_0x0024:
            java.util.concurrent.locks.ReentrantLock r0 = r3.mLock
            r0.lock()
            boolean r0 = net.sqlcipher.database.SQLiteDebug.DEBUG_LOCK_TIME_TRACKING
            if (r0 == 0) goto L_0x0047
        L_0x002d:
            java.util.concurrent.locks.ReentrantLock r0 = r3.mLock
            int r0 = r0.getHoldCount()
            r1 = 1
            if (r0 != r1) goto L_0x0038
            r0 = 0
            goto L_0x0039
        L_0x0038:
            r0 = 1
        L_0x0039:
            if (r0 == r1) goto L_0x0047
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0063 }
            r3.mLockAcquiredWallTime = r0     // Catch:{ Exception -> 0x0063 }
            long r0 = android.os.Debug.threadCpuTimeNanos()     // Catch:{ Exception -> 0x0063 }
            r3.mLockAcquiredThreadTime = r0     // Catch:{ Exception -> 0x0063 }
        L_0x0047:
            int r0 = getMin
            int r0 = r0 + 123
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            r1 = 89
            if (r0 != 0) goto L_0x0058
            r0 = 89
            goto L_0x005a
        L_0x0058:
            r0 = 56
        L_0x005a:
            if (r0 == r1) goto L_0x005d
            return
        L_0x005d:
            r0 = 98
            int r0 = r0 / r2
            return
        L_0x0061:
            r0 = move-exception
            throw r0
        L_0x0063:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.lockForced():void");
    }

    /* access modifiers changed from: package-private */
    public void unlock() {
        if (this.mLockingEnabled) {
            if ((SQLiteDebug.DEBUG_LOCK_TIME_TRACKING ? 8 : '2') != '2') {
                try {
                    boolean z = true;
                    if ((this.mLock.getHoldCount() == 1 ? ',' : Typography.greater) == ',') {
                        int i = IsOverlapping + 95;
                        getMin = i % 128;
                        if (i % 2 != 0) {
                            z = false;
                        }
                        checkLockHoldTime();
                        if (!z) {
                            int i2 = 7 / 0;
                        }
                    }
                } catch (Exception e) {
                    throw e;
                }
            }
            this.mLock.unlock();
            try {
                int i3 = getMin + 7;
                IsOverlapping = i3 % 128;
                if (i3 % 2 == 0) {
                    Object obj = null;
                    super.hashCode();
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        if ((net.sqlcipher.database.SQLiteDebug.DEBUG_LOCK_TIME_TRACKING ? 'P' : 'F') != 'P') goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (net.sqlcipher.database.SQLiteDebug.DEBUG_LOCK_TIME_TRACKING != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void unlockForced() {
        /*
            r3 = this;
            int r0 = IsOverlapping
            int r0 = r0 + 25
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x0017
            boolean r0 = net.sqlcipher.database.SQLiteDebug.DEBUG_LOCK_TIME_TRACKING     // Catch:{ Exception -> 0x0072 }
            r1 = 87
            int r1 = r1 / 0
            if (r0 == 0) goto L_0x0059
            goto L_0x0025
        L_0x0015:
            r0 = move-exception
            throw r0
        L_0x0017:
            boolean r0 = net.sqlcipher.database.SQLiteDebug.DEBUG_LOCK_TIME_TRACKING     // Catch:{ Exception -> 0x0072 }
            r1 = 80
            if (r0 == 0) goto L_0x0020
            r0 = 80
            goto L_0x0022
        L_0x0020:
            r0 = 70
        L_0x0022:
            if (r0 == r1) goto L_0x0025
            goto L_0x0059
        L_0x0025:
            java.util.concurrent.locks.ReentrantLock r0 = r3.mLock
            int r0 = r0.getHoldCount()
            r1 = 1
            r2 = 14
            if (r0 != r1) goto L_0x0033
            r0 = 33
            goto L_0x0035
        L_0x0033:
            r0 = 14
        L_0x0035:
            if (r0 == r2) goto L_0x0059
            int r0 = IsOverlapping
            int r0 = r0 + 19
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            r1 = 93
            if (r0 == 0) goto L_0x0048
            r0 = 16
            goto L_0x004a
        L_0x0048:
            r0 = 93
        L_0x004a:
            if (r0 == r1) goto L_0x0056
            r3.checkLockHoldTime()
            r0 = 84
            int r0 = r0 / 0
            goto L_0x0059
        L_0x0054:
            r0 = move-exception
            throw r0
        L_0x0056:
            r3.checkLockHoldTime()
        L_0x0059:
            java.util.concurrent.locks.ReentrantLock r0 = r3.mLock
            r0.unlock()
            int r0 = getMin
            int r0 = r0 + 87
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0071
            r0 = 88
            int r0 = r0 / 0
            return
        L_0x006f:
            r0 = move-exception
            throw r0
        L_0x0071:
            return
        L_0x0072:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.unlockForced():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007c, code lost:
        if ((r4 > com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS ? 8 : '\\') != '\\') goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void checkLockHoldTime() {
        /*
            r13 = this;
            int r0 = IsOverlapping
            int r0 = r0 + 31
            int r1 = r0 % 128
            getMin = r1
            r1 = 2
            int r0 = r0 % r1
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r13.mLockAcquiredWallTime
            long r4 = r2 - r4
            r6 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x004b
            java.lang.String r0 = "Database"
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 != 0) goto L_0x004b
            int r0 = getMin     // Catch:{ Exception -> 0x0049 }
            int r0 = r0 + 103
            int r8 = r0 % 128
            IsOverlapping = r8     // Catch:{ Exception -> 0x0049 }
            int r0 = r0 % r1
            r8 = 44
            if (r0 != 0) goto L_0x0030
            r0 = 75
            goto L_0x0032
        L_0x0030:
            r0 = 44
        L_0x0032:
            r9 = 20000(0x4e20, double:9.8813E-320)
            if (r0 == r8) goto L_0x003e
            long r11 = r13.mLastLockMessageTime
            long r11 = r11 | r2
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x004b
            goto L_0x0046
        L_0x003e:
            long r11 = r13.mLastLockMessageTime     // Catch:{ Exception -> 0x0047 }
            long r11 = r2 - r11
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x004b
        L_0x0046:
            return
        L_0x0047:
            r0 = move-exception
            throw r0
        L_0x0049:
            r0 = move-exception
            goto L_0x0083
        L_0x004b:
            r8 = 300(0x12c, double:1.48E-321)
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0053
            r0 = 0
            goto L_0x0054
        L_0x0053:
            r0 = 1
        L_0x0054:
            if (r0 == 0) goto L_0x0057
            goto L_0x0084
        L_0x0057:
            long r8 = android.os.Debug.threadCpuTimeNanos()
            long r10 = r13.mLockAcquiredThreadTime
            long r8 = r8 - r10
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r8 / r10
            int r0 = (int) r8
            r8 = 100
            r9 = 95
            if (r0 > r8) goto L_0x006c
            r0 = 95
            goto L_0x006e
        L_0x006c:
            r0 = 20
        L_0x006e:
            if (r0 == r9) goto L_0x0071
            goto L_0x007e
        L_0x0071:
            r0 = 92
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x007a
            r4 = 8
            goto L_0x007c
        L_0x007a:
            r4 = 92
        L_0x007c:
            if (r4 == r0) goto L_0x0084
        L_0x007e:
            r13.mLastLockMessageTime = r2     // Catch:{ Exception -> 0x0049 }
            boolean r0 = net.sqlcipher.database.SQLiteDebug.DEBUG_LOCK_TIME_TRACKING_STACK_TRACE     // Catch:{ Exception -> 0x0049 }
            goto L_0x0084
        L_0x0083:
            throw r0
        L_0x0084:
            int r0 = getMin
            int r0 = r0 + 21
            int r2 = r0 % 128
            IsOverlapping = r2
            int r0 = r0 % r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.checkLockHoldTime():void");
    }

    public boolean isDatabaseIntegrityOk() {
        int i = IsOverlapping + 101;
        getMin = i % 128;
        int i2 = i % 2;
        Pair<Boolean, String> resultFromPragma = getResultFromPragma("PRAGMA integrity_check;");
        if (!(((Boolean) resultFromPragma.first).booleanValue())) {
            try {
                return ((Boolean) resultFromPragma.first).booleanValue();
            } catch (Exception e) {
                throw e;
            }
        } else {
            int i3 = getMin + 71;
            try {
                IsOverlapping = i3 % 128;
                if ((i3 % 2 == 0 ? 8 : 'K') == 'K') {
                    return ((String) resultFromPragma.second).equals("ok");
                }
                int i4 = 66 / 0;
                return ((String) resultFromPragma.second).equals("ok");
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    public List<Pair<String, String>> getAttachedDbs() {
        ArrayList<Pair<String, String>> arrayList;
        int i = IsOverlapping + 59;
        getMin = i % 128;
        if ((i % 2 != 0 ? '`' : 'V') != 'V') {
            arrayList = getAttachedDbs(this);
            int i2 = 88 / 0;
        } else {
            arrayList = getAttachedDbs(this);
        }
        try {
            int i3 = IsOverlapping + 109;
            getMin = i3 % 128;
            if ((i3 % 2 != 0 ? '=' : 'b') == 'b') {
                return arrayList;
            }
            Object obj = null;
            super.hashCode();
            return arrayList;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x007e, code lost:
        throw new java.lang.IllegalStateException("Write Ahead Logging cannot be enabled while in a transaction");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r0 == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (inTransaction() == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean enableWriteAheadLogging() {
        /*
            r5 = this;
            int r0 = IsOverlapping
            int r0 = r0 + 19
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L_0x0017
            boolean r0 = r5.inTransaction()
            int r2 = r1.length     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x0077
            goto L_0x001d
        L_0x0015:
            r0 = move-exception
            throw r0
        L_0x0017:
            boolean r0 = r5.inTransaction()
            if (r0 != 0) goto L_0x0077
        L_0x001d:
            java.util.ArrayList r0 = getAttachedDbs(r5)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0027
            r4 = 1
            goto L_0x0028
        L_0x0027:
            r4 = 0
        L_0x0028:
            if (r4 == 0) goto L_0x0046
            int r0 = r0.size()
            if (r0 <= r2) goto L_0x0032
            r0 = 1
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            if (r0 == 0) goto L_0x0046
            int r0 = getMin
            int r0 = r0 + 95
            int r2 = r0 % 128
            IsOverlapping = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0045
            int r0 = r1.length     // Catch:{ all -> 0x0043 }
            return r3
        L_0x0043:
            r0 = move-exception
            throw r0
        L_0x0045:
            return r3
        L_0x0046:
            boolean r0 = r5.isReadOnly()     // Catch:{ Exception -> 0x0075 }
            r1 = 47
            if (r0 != 0) goto L_0x0051
            r0 = 47
            goto L_0x0053
        L_0x0051:
            r0 = 16
        L_0x0053:
            if (r0 == r1) goto L_0x0056
            goto L_0x006c
        L_0x0056:
            int r0 = IsOverlapping
            int r0 = r0 + 109
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            java.lang.String r0 = r5.getPath()
            java.lang.String r1 = ":memory:"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006d
        L_0x006c:
            return r3
        L_0x006d:
            java.lang.String r0 = "PRAGMA journal_mode = WAL;"
            r5.rawExecSQL(r0)     // Catch:{ Exception -> 0x0073 }
            return r2
        L_0x0073:
            r0 = move-exception
            throw r0
        L_0x0075:
            r0 = move-exception
            throw r0
        L_0x0077:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Write Ahead Logging cannot be enabled while in a transaction"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.enableWriteAheadLogging():boolean");
    }

    public void disableWriteAheadLogging() {
        try {
            int i = getMin + 107;
            IsOverlapping = i % 128;
            int i2 = i % 2;
            if (!inTransaction()) {
                rawExecSQL("PRAGMA journal_mode = DELETE;");
                int i3 = getMin + 105;
                try {
                    IsOverlapping = i3 % 128;
                    if ((i3 % 2 == 0 ? ']' : 29) == ']') {
                        Object[] objArr = null;
                        int length2 = objArr.length;
                    }
                } catch (Exception e) {
                    throw e;
                }
            } else {
                throw new IllegalStateException("Write Ahead Logging cannot be disabled while in a transaction");
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public boolean isWriteAheadLoggingEnabled() {
        int i = IsOverlapping + 17;
        getMin = i % 128;
        int i2 = i % 2;
        Pair<Boolean, String> resultFromPragma = getResultFromPragma("PRAGMA journal_mode;");
        if (!((Boolean) resultFromPragma.first).booleanValue()) {
            return ((Boolean) resultFromPragma.first).booleanValue();
        }
        int i3 = IsOverlapping + 93;
        getMin = i3 % 128;
        char c = i3 % 2 != 0 ? 'H' : '0';
        boolean equals = ((String) resultFromPragma.second).equals("wal");
        if (c != 'H') {
            return equals;
        }
        int i4 = 78 / 0;
        return equals;
    }

    public void setForeignKeyConstraintsEnabled(boolean z) {
        try {
            int i = IsOverlapping + 21;
            try {
                getMin = i % 128;
                int i2 = i % 2;
                if (!inTransaction()) {
                    Object[] objArr = new Object[1];
                    objArr[0] = (z ? 11 : Typography.dollar) != 11 ? "OFF" : "ON";
                    execSQL(String.format("PRAGMA foreign_keys = %s;", objArr));
                    int i3 = IsOverlapping + 107;
                    getMin = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                }
                throw new IllegalStateException("Foreign key constraints may not be changed while in a transaction");
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void beginTransaction() {
        int i = IsOverlapping + 83;
        getMin = i % 128;
        boolean z = i % 2 == 0;
        SQLiteTransactionListener sQLiteTransactionListener = null;
        beginTransactionWithListener(sQLiteTransactionListener);
        if (!z) {
            super.hashCode();
        }
        try {
            int i2 = getMin + 35;
            IsOverlapping = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    public void beginTransactionWithListener(SQLiteTransactionListener sQLiteTransactionListener) {
        try {
            int i = IsOverlapping + 81;
            getMin = i % 128;
            int i2 = i % 2;
            beginTransactionWithListenerInternal(sQLiteTransactionListener, SQLiteDatabaseTransactionType.Exclusive);
            int i3 = getMin + 21;
            IsOverlapping = i3 % 128;
            if ((i3 % 2 == 0 ? 'M' : 'I') == 'M') {
                Object[] objArr = null;
                int length2 = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void beginTransactionNonExclusive() {
        int i = IsOverlapping + 89;
        getMin = i % 128;
        int i2 = i % 2;
        try {
            beginTransactionWithListenerInternal((SQLiteTransactionListener) null, SQLiteDatabaseTransactionType.Immediate);
            int i3 = IsOverlapping + 41;
            getMin = i3 % 128;
            if ((i3 % 2 != 0 ? '%' : 18) != 18) {
                int i4 = 85 / 0;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener sQLiteTransactionListener) {
        int i = getMin + 3;
        IsOverlapping = i % 128;
        if ((i % 2 == 0 ? '@' : 27) != 27) {
            try {
                beginTransactionWithListenerInternal(sQLiteTransactionListener, SQLiteDatabaseTransactionType.Immediate);
                Object[] objArr = null;
                int length2 = objArr.length;
            } catch (Exception e) {
                throw e;
            }
        } else {
            beginTransactionWithListenerInternal(sQLiteTransactionListener, SQLiteDatabaseTransactionType.Immediate);
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [net.sqlcipher.database.SQLiteTransactionListener] */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0067, code lost:
        if (r5.mTransactionIsSuccessful != false) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void endTransaction() {
        /*
            r5 = this;
            boolean r0 = r5.isOpen()
            if (r0 == 0) goto L_0x00b0
            java.util.concurrent.locks.ReentrantLock r0 = r5.mLock
            boolean r0 = r0.isHeldByCurrentThread()
            if (r0 == 0) goto L_0x00a8
            r0 = 0
            boolean r1 = r5.mInnerTransactionIsSuccessful     // Catch:{ all -> 0x00a1 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x002c
            int r1 = IsOverlapping     // Catch:{ Exception -> 0x002a }
            int r1 = r1 + r2
            int r4 = r1 % 128
            getMin = r4     // Catch:{ Exception -> 0x002a }
            int r1 = r1 % 2
            r4 = 48
            if (r1 == 0) goto L_0x0025
            r1 = 48
            goto L_0x0027
        L_0x0025:
            r1 = 73
        L_0x0027:
            r5.mInnerTransactionIsSuccessful = r3     // Catch:{ all -> 0x00a1 }
            goto L_0x002e
        L_0x002a:
            r0 = move-exception
            throw r0
        L_0x002c:
            r5.mTransactionIsSuccessful = r3     // Catch:{ all -> 0x00a1 }
        L_0x002e:
            java.util.concurrent.locks.ReentrantLock r1 = r5.mLock     // Catch:{ all -> 0x00a1 }
            int r1 = r1.getHoldCount()     // Catch:{ all -> 0x00a1 }
            r4 = 20
            if (r1 == r2) goto L_0x003b
            r1 = 11
            goto L_0x003d
        L_0x003b:
            r1 = 20
        L_0x003d:
            if (r1 == r4) goto L_0x0045
        L_0x003f:
            r5.mTransactionListener = r0
            r5.unlockForced()
            return
        L_0x0045:
            net.sqlcipher.database.SQLiteTransactionListener r1 = r5.mTransactionListener     // Catch:{ all -> 0x00a1 }
            if (r1 == 0) goto L_0x0084
            int r1 = IsOverlapping     // Catch:{ Exception -> 0x0082 }
            int r1 = r1 + 105
            int r4 = r1 % 128
            getMin = r4     // Catch:{ Exception -> 0x0082 }
            int r1 = r1 % 2
            if (r1 == 0) goto L_0x0057
            r1 = 0
            goto L_0x0058
        L_0x0057:
            r1 = 1
        L_0x0058:
            if (r1 == r2) goto L_0x0065
            boolean r1 = r5.mTransactionIsSuccessful     // Catch:{ RuntimeException -> 0x0063 }
            int r4 = r0.length     // Catch:{ RuntimeException -> 0x0063 }
            if (r1 == 0) goto L_0x0060
            r2 = 0
        L_0x0060:
            if (r2 == 0) goto L_0x0069
            goto L_0x0079
        L_0x0063:
            r1 = move-exception
            goto L_0x007f
        L_0x0065:
            boolean r1 = r5.mTransactionIsSuccessful     // Catch:{ RuntimeException -> 0x0063 }
            if (r1 == 0) goto L_0x0079
        L_0x0069:
            net.sqlcipher.database.SQLiteTransactionListener r1 = r5.mTransactionListener     // Catch:{ RuntimeException -> 0x0063 }
            r1.onCommit()     // Catch:{ RuntimeException -> 0x0063 }
            int r1 = IsOverlapping
            int r1 = r1 + 45
            int r2 = r1 % 128
            getMin = r2
            int r1 = r1 % 2
            goto L_0x0084
        L_0x0079:
            net.sqlcipher.database.SQLiteTransactionListener r1 = r5.mTransactionListener     // Catch:{ RuntimeException -> 0x0063 }
            r1.onRollback()     // Catch:{ RuntimeException -> 0x0063 }
            goto L_0x0084
        L_0x007f:
            r5.mTransactionIsSuccessful = r3     // Catch:{ all -> 0x00a1 }
            goto L_0x0085
        L_0x0082:
            r0 = move-exception
            throw r0
        L_0x0084:
            r1 = r0
        L_0x0085:
            boolean r2 = r5.mTransactionIsSuccessful     // Catch:{ all -> 0x00a1 }
            if (r2 == 0) goto L_0x008f
            java.lang.String r1 = "COMMIT;"
            r5.execSQL(r1)     // Catch:{ all -> 0x00a1 }
            goto L_0x003f
        L_0x008f:
            java.lang.String r2 = "ROLLBACK;"
            r5.execSQL(r2)     // Catch:{ SQLException -> 0x003f }
            if (r1 == 0) goto L_0x003f
            int r2 = IsOverlapping
            int r2 = r2 + 7
            int r3 = r2 % 128
            getMin = r3
            int r2 = r2 % 2
            throw r1     // Catch:{ SQLException -> 0x003f }
        L_0x00a1:
            r1 = move-exception
            r5.mTransactionListener = r0
            r5.unlockForced()
            throw r1
        L_0x00a8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "no transaction pending"
            r0.<init>(r1)
            throw r0
        L_0x00b0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "database not open"
            r0.<init>(r1)
            goto L_0x00b9
        L_0x00b8:
            throw r0
        L_0x00b9:
            goto L_0x00b8
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.endTransaction():void");
    }

    public void setTransactionSuccessful() {
        try {
            int i = getMin + 99;
            try {
                IsOverlapping = i % 128;
                int i2 = i % 2;
                if (!isOpen()) {
                    throw new IllegalStateException("database not open");
                } else if (!this.mLock.isHeldByCurrentThread()) {
                    throw new IllegalStateException("no transaction pending");
                } else if (!this.mInnerTransactionIsSuccessful) {
                    this.mInnerTransactionIsSuccessful = true;
                    int i3 = getMin + 1;
                    IsOverlapping = i3 % 128;
                    int i4 = i3 % 2;
                } else {
                    throw new IllegalStateException("setTransactionSuccessful may only be called once per call to beginTransaction");
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public boolean inTransaction() {
        try {
            int i = getMin + 25;
            IsOverlapping = i % 128;
            int i2 = i % 2;
            if (this.mLock.getHoldCount() <= 0) {
                return false;
            }
            int i3 = IsOverlapping + 51;
            getMin = i3 % 128;
            int i4 = i3 % 2;
            return true;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean isDbLockedByCurrentThread() {
        int i = getMin + 123;
        IsOverlapping = i % 128;
        if ((i % 2 == 0 ? 'S' : ']') == ']') {
            return this.mLock.isHeldByCurrentThread();
        }
        try {
            boolean isHeldByCurrentThread = this.mLock.isHeldByCurrentThread();
            Object obj = null;
            super.hashCode();
            return isHeldByCurrentThread;
        } catch (Exception e) {
            throw e;
        }
    }

    public boolean isDbLockedByOtherThreads() {
        if ((!this.mLock.isHeldByCurrentThread() ? 'U' : 'A') != 'A') {
            int i = IsOverlapping + 67;
            getMin = i % 128;
            int i2 = i % 2;
            if (!(!this.mLock.isLocked())) {
                int i3 = getMin + 81;
                IsOverlapping = i3 % 128;
                int i4 = i3 % 2;
                int i5 = getMin + 113;
                IsOverlapping = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if ((!isOpen() ? 27 : '#') != 27) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        r0 = getMin + 69;
        IsOverlapping = r0 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        if ((r0 % 2) != 0) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r0 == false) goto L_0x0030;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean yieldIfContended() {
        /*
            r4 = this;
            int r0 = IsOverlapping
            int r0 = r0 + 5
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L_0x0018
            boolean r0 = r4.isOpen()
            r2 = 0
            int r2 = r2.length     // Catch:{ all -> 0x0016 }
            if (r0 != 0) goto L_0x0027
            goto L_0x0030
        L_0x0016:
            r0 = move-exception
            throw r0
        L_0x0018:
            boolean r0 = r4.isOpen()
            r2 = 27
            if (r0 != 0) goto L_0x0023
            r0 = 27
            goto L_0x0025
        L_0x0023:
            r0 = 35
        L_0x0025:
            if (r0 == r2) goto L_0x0030
        L_0x0027:
            r2 = -1
            boolean r0 = r4.yieldIfContendedHelper(r1, r2)     // Catch:{ Exception -> 0x002e }
            return r0
        L_0x002e:
            r0 = move-exception
            throw r0
        L_0x0030:
            int r0 = getMin
            int r0 = r0 + 69
            int r2 = r0 % 128
            IsOverlapping = r2
            int r0 = r0 % 2
            r2 = 56
            if (r0 != 0) goto L_0x0041
            r0 = 56
            goto L_0x0043
        L_0x0041:
            r0 = 28
        L_0x0043:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.yieldIfContended():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if ((!isOpen() ? ']' : 'O') != 'O') goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        return yieldIfContendedHelper(true, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r0 == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean yieldIfContendedSafely() {
        /*
            r4 = this;
            int r0 = IsOverlapping
            int r0 = r0 + 75
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            r1 = 1
            if (r0 == 0) goto L_0x001a
            boolean r0 = r4.isOpen()
            r2 = 0
            super.hashCode()     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x0040
            goto L_0x0029
        L_0x0018:
            r0 = move-exception
            throw r0
        L_0x001a:
            boolean r0 = r4.isOpen()
            r2 = 79
            if (r0 != 0) goto L_0x0025
            r0 = 93
            goto L_0x0027
        L_0x0025:
            r0 = 79
        L_0x0027:
            if (r0 == r2) goto L_0x0040
        L_0x0029:
            int r0 = IsOverlapping
            int r0 = r0 + 51
            int r2 = r0 % 128
            getMin = r2
            int r0 = r0 % 2
            r2 = 0
            if (r0 == 0) goto L_0x0037
            r1 = 0
        L_0x0037:
            if (r1 == 0) goto L_0x003a
            return r2
        L_0x003a:
            r0 = 99
            int r0 = r0 / r2
            return r2
        L_0x003e:
            r0 = move-exception
            throw r0
        L_0x0040:
            r2 = -1
            boolean r0 = r4.yieldIfContendedHelper(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.yieldIfContendedSafely():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        if ((isOpen()) != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        r5 = getMin + 61;
        IsOverlapping = r5 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        if ((r5 % 2) != 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r0 == false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean yieldIfContendedSafely(long r5) {
        /*
            r4 = this;
            int r0 = IsOverlapping
            int r0 = r0 + 69
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 == 0) goto L_0x0020
            boolean r0 = r4.isOpen()
            r3 = 0
            super.hashCode()     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x002b
            goto L_0x0030
        L_0x001e:
            r5 = move-exception
            throw r5
        L_0x0020:
            boolean r0 = r4.isOpen()     // Catch:{ Exception -> 0x003e }
            if (r0 != 0) goto L_0x0028
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            if (r0 == 0) goto L_0x0030
        L_0x002b:
            boolean r5 = r4.yieldIfContendedHelper(r2, r5)
            return r5
        L_0x0030:
            int r5 = getMin
            int r5 = r5 + 61
            int r6 = r5 % 128
            IsOverlapping = r6
            int r5 = r5 % 2
            if (r5 != 0) goto L_0x003d
            r1 = 1
        L_0x003d:
            return r1
        L_0x003e:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.yieldIfContendedSafely(long):boolean");
    }

    private boolean yieldIfContendedHelper(boolean z, long j) {
        long j2;
        boolean z2;
        try {
            int i = getMin + 73;
            IsOverlapping = i % 128;
            int i2 = i % 2;
            try {
                if (this.mLock.getQueueLength() == 0) {
                    int i3 = IsOverlapping + 77;
                    getMin = i3 % 128;
                    if (i3 % 2 != 0) {
                        this.mLockAcquiredWallTime = SystemClock.elapsedRealtime();
                        this.mLockAcquiredThreadTime = Debug.threadCpuTimeNanos();
                        return true;
                    }
                    this.mLockAcquiredWallTime = SystemClock.elapsedRealtime();
                    this.mLockAcquiredThreadTime = Debug.threadCpuTimeNanos();
                    return false;
                }
                setTransactionSuccessful();
                SQLiteTransactionListener sQLiteTransactionListener = this.mTransactionListener;
                endTransaction();
                if (!(z) || !isDbLockedByCurrentThread()) {
                    if (j > 0) {
                        while (j > 0) {
                            if (j < 1000) {
                                int i4 = IsOverlapping + 1;
                                getMin = i4 % 128;
                                int i5 = i4 % 2;
                                j2 = j;
                            } else {
                                j2 = 1000;
                            }
                            try {
                                Thread.sleep(j2);
                                int i6 = IsOverlapping + 19;
                                getMin = i6 % 128;
                                int i7 = i6 % 2;
                            } catch (InterruptedException unused) {
                                Thread.interrupted();
                            }
                            j -= 1000;
                            if (this.mLock.getQueueLength() == 0) {
                                z2 = true;
                                continue;
                            } else {
                                z2 = false;
                                continue;
                            }
                            if (z2) {
                                break;
                            }
                        }
                    }
                    beginTransactionWithListener(sQLiteTransactionListener);
                    return true;
                }
                throw new IllegalStateException("Db locked more than once. yielfIfContended cannot yield");
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public Map<String, String> getSyncedTables() {
        HashMap hashMap;
        synchronized (this.mSyncUpdateInfo) {
            hashMap = new HashMap();
            for (String next : this.mSyncUpdateInfo.keySet()) {
                SyncUpdateInfo syncUpdateInfo = this.mSyncUpdateInfo.get(next);
                if (syncUpdateInfo.deletedTable != null) {
                    hashMap.put(next, syncUpdateInfo.deletedTable);
                }
            }
        }
        return hashMap;
    }

    static class SyncUpdateInfo {
        String deletedTable;
        String foreignKey;
        String masterTable;

        SyncUpdateInfo(String str, String str2, String str3) {
            this.masterTable = str;
            this.deletedTable = str2;
            this.foreignKey = str3;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [net.sqlcipher.database.SQLiteDatabaseHook] */
    public static SQLiteDatabase openDatabase(String str, String str2, CursorFactory cursorFactory, int i) {
        SQLiteDatabase sQLiteDatabase;
        int i2 = getMin + 5;
        IsOverlapping = i2 % 128;
        ? r2 = 0;
        if ((i2 % 2 == 0 ? 'I' : '0') != '0') {
            sQLiteDatabase = openDatabase(str, str2, cursorFactory, i, (SQLiteDatabaseHook) r2);
            int length2 = r2.length;
        } else {
            try {
                sQLiteDatabase = openDatabase(str, str2, cursorFactory, i, (SQLiteDatabaseHook) r2);
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            int i3 = IsOverlapping + 81;
            getMin = i3 % 128;
            int i4 = i3 % 2;
            return sQLiteDatabase;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static SQLiteDatabase openDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i) {
        try {
            int i2 = IsOverlapping + 7;
            getMin = i2 % 128;
            int i3 = i2 % 2;
            try {
                SQLiteDatabase openDatabase = openDatabase(str, cArr, cursorFactory, i, (SQLiteDatabaseHook) null, (DatabaseErrorHandler) null);
                int i4 = getMin + 111;
                IsOverlapping = i4 % 128;
                int i5 = i4 % 2;
                return openDatabase;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static SQLiteDatabase openDatabase(String str, String str2, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook) {
        int i2 = getMin + 71;
        IsOverlapping = i2 % 128;
        int i3 = i2 % 2;
        try {
            SQLiteDatabase openDatabase = openDatabase(str, str2, cursorFactory, i, sQLiteDatabaseHook, (DatabaseErrorHandler) null);
            int i4 = IsOverlapping + 53;
            getMin = i4 % 128;
            if ((i4 % 2 != 0 ? '`' : '9') == '9') {
                return openDatabase;
            }
            int i5 = 65 / 0;
            return openDatabase;
        } catch (Exception e) {
            throw e;
        }
    }

    public static SQLiteDatabase openDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook) {
        int i2 = IsOverlapping + 21;
        getMin = i2 % 128;
        if ((i2 % 2 != 0 ? 25 : '2') != '2') {
            SQLiteDatabase openDatabase = openDatabase(str, cArr, cursorFactory, i, sQLiteDatabaseHook, (DatabaseErrorHandler) null);
            Object obj = null;
            super.hashCode();
            return openDatabase;
        }
        try {
            return openDatabase(str, cArr, cursorFactory, i, sQLiteDatabaseHook, (DatabaseErrorHandler) null);
        } catch (Exception e) {
            throw e;
        }
    }

    public static SQLiteDatabase openDatabase(String str, String str2, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        try {
            int i2 = IsOverlapping + 9;
            try {
                getMin = i2 % 128;
                int i3 = i2 % 2;
                boolean z = false;
                char[] cArr = null;
                if (str2 == null) {
                    int i4 = getMin + 69;
                    IsOverlapping = i4 % 128;
                    if (i4 % 2 == 0) {
                        z = true;
                    }
                    if (z) {
                        super.hashCode();
                    }
                } else {
                    cArr = str2.toCharArray();
                }
                SQLiteDatabase openDatabase = openDatabase(str, cArr, cursorFactory, i, sQLiteDatabaseHook, databaseErrorHandler);
                int i5 = IsOverlapping + 1;
                getMin = i5 % 128;
                int i6 = i5 % 2;
                return openDatabase;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static SQLiteDatabase openDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        int i2 = IsOverlapping + 121;
        getMin = i2 % 128;
        int i3 = i2 % 2;
        SQLiteDatabase openDatabase = openDatabase(str, getBytes(cArr), cursorFactory, i, sQLiteDatabaseHook, databaseErrorHandler);
        int i4 = IsOverlapping + 51;
        getMin = i4 % 128;
        if ((i4 % 2 != 0 ? 'W' : 21) != 'W') {
            return openDatabase;
        }
        Object obj = null;
        super.hashCode();
        return openDatabase;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    public static net.sqlcipher.database.SQLiteDatabase openDatabase(java.lang.String r2, byte[] r3, net.sqlcipher.database.SQLiteDatabase.CursorFactory r4, int r5, net.sqlcipher.database.SQLiteDatabaseHook r6, net.sqlcipher.DatabaseErrorHandler r7) {
        /*
            if (r7 == 0) goto L_0x0003
            goto L_0x0008
        L_0x0003:
            net.sqlcipher.DefaultDatabaseErrorHandler r7 = new net.sqlcipher.DefaultDatabaseErrorHandler
            r7.<init>()
        L_0x0008:
            r0 = 0
            net.sqlcipher.database.SQLiteDatabase r1 = new net.sqlcipher.database.SQLiteDatabase     // Catch:{ SQLiteDatabaseCorruptException -> 0x0012 }
            r1.<init>((java.lang.String) r2, (net.sqlcipher.database.SQLiteDatabase.CursorFactory) r4, (int) r5, (net.sqlcipher.DatabaseErrorHandler) r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0012 }
            r1.openDatabaseInternal((byte[]) r3, (net.sqlcipher.database.SQLiteDatabaseHook) r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0013 }
            goto L_0x001e
        L_0x0012:
            r1 = r0
        L_0x0013:
            r7.onCorruption(r1)
            net.sqlcipher.database.SQLiteDatabase r1 = new net.sqlcipher.database.SQLiteDatabase
            r1.<init>((java.lang.String) r2, (net.sqlcipher.database.SQLiteDatabase.CursorFactory) r4, (int) r5, (net.sqlcipher.DatabaseErrorHandler) r7)
            r1.openDatabaseInternal((byte[]) r3, (net.sqlcipher.database.SQLiteDatabaseHook) r6)
        L_0x001e:
            boolean r3 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_STATEMENTS
            if (r3 == 0) goto L_0x0025
            r1.enableSqlTracing(r2)
        L_0x0025:
            boolean r3 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_TIME
            if (r3 == 0) goto L_0x002c
            r1.enableSqlProfiling(r2)
        L_0x002c:
            java.util.WeakHashMap<net.sqlcipher.database.SQLiteDatabase, java.lang.Object> r2 = sActiveDatabases
            monitor-enter(r2)
            java.util.WeakHashMap<net.sqlcipher.database.SQLiteDatabase, java.lang.Object> r3 = sActiveDatabases     // Catch:{ all -> 0x0036 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0036 }
            monitor-exit(r2)     // Catch:{ all -> 0x0036 }
            return r1
        L_0x0036:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.openDatabase(java.lang.String, byte[], net.sqlcipher.database.SQLiteDatabase$CursorFactory, int, net.sqlcipher.database.SQLiteDatabaseHook, net.sqlcipher.DatabaseErrorHandler):net.sqlcipher.database.SQLiteDatabase");
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, String str, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook) {
        int i = IsOverlapping + 57;
        getMin = i % 128;
        int i2 = i % 2;
        DatabaseErrorHandler databaseErrorHandler = null;
        SQLiteDatabase openOrCreateDatabase = openOrCreateDatabase(file, str, cursorFactory, sQLiteDatabaseHook, databaseErrorHandler);
        int i3 = IsOverlapping + 31;
        getMin = i3 % 128;
        if (i3 % 2 == 0) {
            return openOrCreateDatabase;
        }
        super.hashCode();
        return openOrCreateDatabase;
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, String str2, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook) {
        int i = getMin + 9;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        try {
            SQLiteDatabase openDatabase = openDatabase(str, str2, cursorFactory, 268435456, sQLiteDatabaseHook);
            int i3 = IsOverlapping + 113;
            getMin = i3 % 128;
            if ((i3 % 2 != 0 ? 'Y' : 7) == 7) {
                return openDatabase;
            }
            int i4 = 62 / 0;
            return openDatabase;
        } catch (Exception e) {
            throw e;
        }
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, String str2, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        char[] cArr;
        char[] cArr2 = null;
        if (str2 == null) {
            int i = getMin + 83;
            IsOverlapping = i % 128;
            int i2 = i % 2;
            cArr = cArr2;
        } else {
            char[] charArray = str2.toCharArray();
            try {
                int i3 = IsOverlapping + 49;
                getMin = i3 % 128;
                int i4 = i3 % 2;
                cArr = charArray;
            } catch (Exception e) {
                throw e;
            }
        }
        SQLiteDatabase openDatabase = openDatabase(str, cArr, cursorFactory, 268435456, sQLiteDatabaseHook, databaseErrorHandler);
        int i5 = IsOverlapping + 105;
        getMin = i5 % 128;
        if (!(i5 % 2 != 0)) {
            return openDatabase;
        }
        super.hashCode();
        return openDatabase;
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, char[] cArr, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook) {
        try {
            int i = getMin + 61;
            try {
                IsOverlapping = i % 128;
                int i2 = i % 2;
                SQLiteDatabase openDatabase = openDatabase(str, cArr, cursorFactory, 268435456, sQLiteDatabaseHook);
                int i3 = getMin + 3;
                IsOverlapping = i3 % 128;
                int i4 = i3 % 2;
                return openDatabase;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, char[] cArr, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        int i = getMin + 11;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        SQLiteDatabase openDatabase = openDatabase(str, cArr, cursorFactory, 268435456, sQLiteDatabaseHook, databaseErrorHandler);
        int i3 = IsOverlapping + 41;
        getMin = i3 % 128;
        if ((i3 % 2 != 0 ? 'b' : '7') == '7') {
            return openDatabase;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return openDatabase;
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, byte[] bArr, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook) {
        SQLiteDatabase sQLiteDatabase;
        int i = IsOverlapping + 109;
        getMin = i % 128;
        if ((i % 2 != 0 ? 12 : 'a') != 'a') {
            sQLiteDatabase = openDatabase(str, bArr, cursorFactory, 268435456, sQLiteDatabaseHook, (DatabaseErrorHandler) null);
            Object[] objArr = null;
            int length2 = objArr.length;
        } else {
            sQLiteDatabase = openDatabase(str, bArr, cursorFactory, 268435456, sQLiteDatabaseHook, (DatabaseErrorHandler) null);
        }
        int i2 = IsOverlapping + 35;
        getMin = i2 % 128;
        int i3 = i2 % 2;
        return sQLiteDatabase;
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, byte[] bArr, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, DatabaseErrorHandler databaseErrorHandler) {
        try {
            int i = IsOverlapping + 119;
            try {
                getMin = i % 128;
                if ((i % 2 != 0 ? ']' : '[') != ']') {
                    return openDatabase(str, bArr, cursorFactory, 268435456, sQLiteDatabaseHook, databaseErrorHandler);
                }
                SQLiteDatabase openDatabase = openDatabase(str, bArr, cursorFactory, 268435456, sQLiteDatabaseHook, databaseErrorHandler);
                Object obj = null;
                super.hashCode();
                return openDatabase;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static SQLiteDatabase openOrCreateDatabase(File file, String str, CursorFactory cursorFactory) {
        try {
            int i = getMin + 91;
            IsOverlapping = i % 128;
            int i2 = i % 2;
            SQLiteDatabaseHook sQLiteDatabaseHook = null;
            SQLiteDatabase openOrCreateDatabase = openOrCreateDatabase(file, str, cursorFactory, sQLiteDatabaseHook);
            int i3 = getMin + 15;
            IsOverlapping = i3 % 128;
            if ((i3 % 2 == 0 ? '2' : '3') != '2') {
                return openOrCreateDatabase;
            }
            super.hashCode();
            return openOrCreateDatabase;
        } catch (Exception e) {
            throw e;
        }
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, String str2, CursorFactory cursorFactory) {
        int i = getMin + 25;
        IsOverlapping = i % 128;
        if ((i % 2 == 0 ? (char) 18 : 27) != 27) {
            SQLiteDatabase openDatabase = openDatabase(str, str2, cursorFactory, 268435456, (SQLiteDatabaseHook) null);
            int i2 = 32 / 0;
            return openDatabase;
        }
        try {
            return openDatabase(str, str2, cursorFactory, 268435456, (SQLiteDatabaseHook) null);
        } catch (Exception e) {
            throw e;
        }
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, char[] cArr, CursorFactory cursorFactory) {
        int i = IsOverlapping + 121;
        getMin = i % 128;
        int i2 = i % 2;
        SQLiteDatabase openDatabase = openDatabase(str, cArr, cursorFactory, 268435456, (SQLiteDatabaseHook) null);
        try {
            int i3 = getMin + 89;
            IsOverlapping = i3 % 128;
            int i4 = i3 % 2;
            return openDatabase;
        } catch (Exception e) {
            throw e;
        }
    }

    public static SQLiteDatabase openOrCreateDatabase(String str, byte[] bArr, CursorFactory cursorFactory) {
        int i = IsOverlapping + 119;
        getMin = i % 128;
        int i2 = i % 2;
        try {
            SQLiteDatabase openDatabase = openDatabase(str, bArr, cursorFactory, 268435456, (SQLiteDatabaseHook) null, (DatabaseErrorHandler) null);
            int i3 = IsOverlapping + 107;
            getMin = i3 % 128;
            int i4 = i3 % 2;
            return openDatabase;
        } catch (Exception e) {
            throw e;
        }
    }

    public static SQLiteDatabase create(CursorFactory cursorFactory, String str) {
        char[] cArr = null;
        if ((str == null ? 'U' : 15) != 15) {
            int i = IsOverlapping + 17;
            getMin = i % 128;
            if ((i % 2 != 0 ? 8 : 'N') == 8) {
                int length2 = cArr.length;
            }
        } else {
            cArr = str.toCharArray();
            int i2 = getMin + 55;
            IsOverlapping = i2 % 128;
            int i3 = i2 % 2;
        }
        return openDatabase(MEMORY, cArr, cursorFactory, 268435456);
    }

    public static SQLiteDatabase create(CursorFactory cursorFactory, char[] cArr) {
        int i = IsOverlapping + 1;
        getMin = i % 128;
        if ((i % 2 != 0 ? JSONLexer.EOI : 'c') == 'c') {
            return openDatabase(MEMORY, cArr, cursorFactory, 268435456);
        }
        try {
            SQLiteDatabase openDatabase = openDatabase(MEMORY, cArr, cursorFactory, 268435456);
            Object obj = null;
            super.hashCode();
            return openDatabase;
        } catch (Exception e) {
            throw e;
        }
    }

    public void close() {
        int i = getMin + 57;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        if (!isOpen()) {
            int i3 = IsOverlapping + 99;
            getMin = i3 % 128;
            if (i3 % 2 != 0) {
                Object[] objArr = null;
                int length2 = objArr.length;
                return;
            }
            return;
        }
        lock();
        try {
            closeClosable();
            onAllReferencesReleased();
        } finally {
            unlock();
        }
    }

    private void closeClosable() {
        Iterator<Map.Entry<SQLiteClosable, Object>> it;
        int i = getMin + 31;
        IsOverlapping = i % 128;
        Object[] objArr = null;
        if (i % 2 == 0) {
            deallocCachedSqlStatements();
            it = this.mPrograms.entrySet().iterator();
            int length2 = objArr.length;
        } else {
            deallocCachedSqlStatements();
            it = this.mPrograms.entrySet().iterator();
        }
        while (true) {
            if ((it.hasNext() ? 'M' : 6) != 6) {
                try {
                    SQLiteClosable sQLiteClosable = (SQLiteClosable) it.next().getKey();
                    if (sQLiteClosable != null) {
                        int i2 = IsOverlapping + 69;
                        getMin = i2 % 128;
                        if ((i2 % 2 != 0 ? '%' : 'a') != '%') {
                            sQLiteClosable.onAllReferencesReleasedFromContainer();
                        } else {
                            sQLiteClosable.onAllReferencesReleasedFromContainer();
                            super.hashCode();
                        }
                    }
                    int i3 = getMin + 53;
                    IsOverlapping = i3 % 128;
                    int i4 = i3 % 2;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getVersion() {
        /*
            r5 = this;
            int r0 = IsOverlapping
            int r0 = r0 + 113
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            r0 = 0
            r5.lock()
            boolean r1 = r5.isOpen()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x0037
            net.sqlcipher.database.SQLiteStatement r1 = new net.sqlcipher.database.SQLiteStatement     // Catch:{ all -> 0x003f }
            java.lang.String r2 = "PRAGMA user_version;"
            r1.<init>(r5, r2)     // Catch:{ all -> 0x003f }
            long r2 = r1.simpleQueryForLong()     // Catch:{ all -> 0x0035 }
            int r0 = (int) r2
            r1.close()
            r5.unlock()
            int r1 = IsOverlapping     // Catch:{ Exception -> 0x0033 }
            int r1 = r1 + 53
            int r2 = r1 % 128
            getMin = r2     // Catch:{ Exception -> 0x0031 }
            int r1 = r1 % 2
            return r0
        L_0x0031:
            r0 = move-exception
            throw r0
        L_0x0033:
            r0 = move-exception
            throw r0
        L_0x0035:
            r0 = move-exception
            goto L_0x0043
        L_0x0037:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x003f }
            java.lang.String r2 = "database not open"
            r1.<init>(r2)     // Catch:{ all -> 0x003f }
            throw r1     // Catch:{ all -> 0x003f }
        L_0x003f:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0043:
            if (r1 == 0) goto L_0x0048
            r1.close()
        L_0x0048:
            r5.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getVersion():int");
    }

    public void setVersion(int i) {
        int i2 = IsOverlapping + 99;
        getMin = i2 % 128;
        int i3 = i2 % 2;
        try {
            execSQL("PRAGMA user_version = ".concat(String.valueOf(i)));
            int i4 = getMin + 95;
            IsOverlapping = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r0 != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        throw new java.lang.IllegalStateException("database not open");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (isOpen() != false) goto L_0x0028;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long getMaximumSize() {
        /*
            r6 = this;
            int r0 = getMin
            int r0 = r0 + 39
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x000e
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            r1 = 0
            if (r0 == 0) goto L_0x001c
            r6.lock()
            boolean r0 = r6.isOpen()     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0051
            goto L_0x0028
        L_0x001c:
            r6.lock()
            boolean r0 = r6.isOpen()     // Catch:{ all -> 0x0059 }
            super.hashCode()     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0051
        L_0x0028:
            net.sqlcipher.database.SQLiteStatement r0 = new net.sqlcipher.database.SQLiteStatement     // Catch:{ all -> 0x0059 }
            java.lang.String r2 = "PRAGMA max_page_count;"
            r0.<init>(r6, r2)     // Catch:{ all -> 0x0059 }
            long r1 = r0.simpleQueryForLong()     // Catch:{ all -> 0x004c }
            long r3 = r6.getPageSize()     // Catch:{ all -> 0x004c }
            long r1 = r1 * r3
            r0.close()     // Catch:{ Exception -> 0x004a }
            r6.unlock()     // Catch:{ Exception -> 0x004a }
            int r0 = getMin
            int r0 = r0 + 57
            int r3 = r0 % 128
            IsOverlapping = r3
            int r0 = r0 % 2
            return r1
        L_0x004a:
            r0 = move-exception
            throw r0
        L_0x004c:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x005a
        L_0x0051:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0059 }
            java.lang.String r2 = "database not open"
            r0.<init>(r2)     // Catch:{ all -> 0x0059 }
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
        L_0x005a:
            if (r1 == 0) goto L_0x005f
            r1.close()
        L_0x005f:
            r6.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getMaximumSize():long");
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [net.sqlcipher.database.SQLiteProgram] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r0 != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006c, code lost:
        throw new java.lang.IllegalStateException("database not open");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (isOpen() != false) goto L_0x002a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long setMaximumSize(long r10) {
        /*
            r9 = this;
            int r0 = getMin
            int r0 = r0 + 101
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            r1 = 7
            if (r0 != 0) goto L_0x000f
            r0 = 7
            goto L_0x0011
        L_0x000f:
            r0 = 56
        L_0x0011:
            r2 = 0
            if (r0 == r1) goto L_0x0020
            r9.lock()
            boolean r0 = r9.isOpen()     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x0065
            goto L_0x002a
        L_0x001e:
            r10 = move-exception
            goto L_0x006d
        L_0x0020:
            r9.lock()     // Catch:{ Exception -> 0x0080 }
            boolean r0 = r9.isOpen()     // Catch:{ all -> 0x001e }
            int r1 = r2.length     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x0065
        L_0x002a:
            long r0 = r9.getPageSize()     // Catch:{ all -> 0x001e }
            long r3 = r10 / r0
            long r10 = r10 % r0
            r5 = 0
            r7 = 85
            int r8 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x003c
            r10 = 48
            goto L_0x003e
        L_0x003c:
            r10 = 85
        L_0x003e:
            if (r10 == r7) goto L_0x0043
            r10 = 1
            long r3 = r3 + r10
        L_0x0043:
            net.sqlcipher.database.SQLiteStatement r10 = new net.sqlcipher.database.SQLiteStatement     // Catch:{ all -> 0x001e }
            java.lang.String r11 = "PRAGMA max_page_count = "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x001e }
            java.lang.String r11 = r11.concat(r3)     // Catch:{ all -> 0x001e }
            r10.<init>(r9, r11)     // Catch:{ all -> 0x001e }
            long r2 = r10.simpleQueryForLong()     // Catch:{ all -> 0x0061 }
            long r2 = r2 * r0
            r10.close()     // Catch:{ Exception -> 0x005f }
            r9.unlock()     // Catch:{ Exception -> 0x005f }
            return r2
        L_0x005f:
            r10 = move-exception
            throw r10
        L_0x0061:
            r11 = move-exception
            r2 = r10
            r10 = r11
            goto L_0x006d
        L_0x0065:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x001e }
            java.lang.String r11 = "database not open"
            r10.<init>(r11)     // Catch:{ all -> 0x001e }
            throw r10     // Catch:{ all -> 0x001e }
        L_0x006d:
            if (r2 == 0) goto L_0x007c
            r2.close()
            int r11 = getMin
            int r11 = r11 + 101
            int r0 = r11 % 128
            IsOverlapping = r0
            int r11 = r11 % 2
        L_0x007c:
            r9.unlock()
            throw r10
        L_0x0080:
            r10 = move-exception
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.setMaximumSize(long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (isOpen() != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        throw new java.lang.IllegalStateException("database not open");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0 != false) goto L_0x002b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long getPageSize() {
        /*
            r3 = this;
            int r0 = getMin
            int r0 = r0 + 91
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            r1 = 1
            if (r0 != 0) goto L_0x000f
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            r2 = 0
            if (r0 == r1) goto L_0x0022
            r3.lock()
            boolean r0 = r3.isOpen()     // Catch:{ all -> 0x0020 }
            super.hashCode()     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x0041
            goto L_0x002b
        L_0x0020:
            r0 = move-exception
            goto L_0x0049
        L_0x0022:
            r3.lock()     // Catch:{ Exception -> 0x005e }
            boolean r0 = r3.isOpen()     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x0041
        L_0x002b:
            net.sqlcipher.database.SQLiteStatement r0 = new net.sqlcipher.database.SQLiteStatement     // Catch:{ all -> 0x0020 }
            java.lang.String r1 = "PRAGMA page_size;"
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0020 }
            long r1 = r0.simpleQueryForLong()     // Catch:{ all -> 0x003d }
            r0.close()
            r3.unlock()
            return r1
        L_0x003d:
            r1 = move-exception
            r2 = r0
            r0 = r1
            goto L_0x0049
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0020 }
            java.lang.String r1 = "database not open"
            r0.<init>(r1)     // Catch:{ all -> 0x0020 }
            throw r0     // Catch:{ all -> 0x0020 }
        L_0x0049:
            if (r2 == 0) goto L_0x0058
            r2.close()
            int r1 = IsOverlapping     // Catch:{ Exception -> 0x005e }
            int r1 = r1 + 51
            int r2 = r1 % 128
            getMin = r2     // Catch:{ Exception -> 0x005e }
            int r1 = r1 % 2
        L_0x0058:
            r3.unlock()     // Catch:{ Exception -> 0x005c }
            throw r0
        L_0x005c:
            r0 = move-exception
            throw r0
        L_0x005e:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getPageSize():long");
    }

    public void setPageSize(long j) {
        try {
            int i = IsOverlapping + 7;
            getMin = i % 128;
            char c = i % 2 != 0 ? 31 : 'c';
            execSQL("PRAGMA page_size = ".concat(String.valueOf(j)));
            if (c == 31) {
                Object[] objArr = null;
                int length2 = objArr.length;
            }
            int i2 = IsOverlapping + 37;
            getMin = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    public void markTableSyncable(String str, String str2) {
        try {
            int i = IsOverlapping + 23;
            try {
                getMin = i % 128;
                int i2 = i % 2;
                if (isOpen()) {
                    markTableSyncable(str, FieldType.FOREIGN_ID_FIELD_SUFFIX, str, str2);
                    int i3 = getMin + 7;
                    IsOverlapping = i3 % 128;
                    if ((i3 % 2 == 0 ? (char) 18 : 25) == 18) {
                        Object[] objArr = null;
                        int length2 = objArr.length;
                        return;
                    }
                    return;
                }
                throw new SQLiteException("database not open");
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (isOpen() != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (isOpen() != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        throw new net.sqlcipher.database.SQLiteException("database not open");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void markTableSyncable(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = this;
            int r0 = getMin
            int r0 = r0 + 99
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            r1 = 36
            if (r0 != 0) goto L_0x0011
            r0 = 12
            goto L_0x0013
        L_0x0011:
            r0 = 36
        L_0x0013:
            if (r0 == r1) goto L_0x0024
            boolean r0 = r2.isOpen()     // Catch:{ Exception -> 0x0022 }
            r1 = 83
            int r1 = r1 / 0
            if (r0 == 0) goto L_0x003a
            goto L_0x002a
        L_0x0020:
            r3 = move-exception
            throw r3
        L_0x0022:
            r3 = move-exception
            goto L_0x0039
        L_0x0024:
            boolean r0 = r2.isOpen()
            if (r0 == 0) goto L_0x003a
        L_0x002a:
            r0 = 0
            r2.markTableSyncable(r3, r4, r5, r0)
            int r3 = IsOverlapping     // Catch:{ Exception -> 0x0022 }
            int r3 = r3 + 45
            int r4 = r3 % 128
            getMin = r4     // Catch:{ Exception -> 0x0022 }
            int r3 = r3 % 2
            return
        L_0x0039:
            throw r3
        L_0x003a:
            net.sqlcipher.database.SQLiteException r3 = new net.sqlcipher.database.SQLiteException
            java.lang.String r4 = "database not open"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.markTableSyncable(java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: finally extract failed */
    private void markTableSyncable(String str, String str2, String str3, String str4) {
        lock();
        try {
            StringBuilder sb = new StringBuilder("SELECT _sync_dirty FROM ");
            sb.append(str3);
            sb.append(" LIMIT 0");
            native_execSQL(sb.toString());
            StringBuilder sb2 = new StringBuilder("SELECT ");
            sb2.append(str2);
            sb2.append(" FROM ");
            sb2.append(str);
            sb2.append(" LIMIT 0");
            native_execSQL(sb2.toString());
            unlock();
            SyncUpdateInfo syncUpdateInfo = new SyncUpdateInfo(str3, str4, str2);
            synchronized (this.mSyncUpdateInfo) {
                this.mSyncUpdateInfo.put(str, syncUpdateInfo);
            }
        } catch (Throwable th) {
            unlock();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public void rowUpdated(String str, long j) {
        SyncUpdateInfo syncUpdateInfo;
        synchronized (this.mSyncUpdateInfo) {
            syncUpdateInfo = this.mSyncUpdateInfo.get(str);
        }
        if (syncUpdateInfo != null) {
            StringBuilder sb = new StringBuilder("UPDATE ");
            sb.append(syncUpdateInfo.masterTable);
            sb.append(" SET _sync_dirty=1 WHERE _id=(SELECT ");
            sb.append(syncUpdateInfo.foreignKey);
            sb.append(" FROM ");
            sb.append(str);
            sb.append(" WHERE _id=");
            sb.append(j);
            sb.append(")");
            execSQL(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if ((r0 > 0 ? 24 : ';') != ';') goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r0 > 0) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        if ((r2 < 0 ? 'X' : 8) != 8) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        if (r2 <= 0) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        r4 = 'Q';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
        r4 = '%';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0058, code lost:
        if (r4 == '%') goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005c, code lost:
        r3 = getMin + 83;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        IsOverlapping = r3 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0064, code lost:
        if ((r3 % 2) != 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r3 = 6 / 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0068, code lost:
        if (r2 < r0) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006e, code lost:
        if (r2 < r0) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0070, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0072, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0073, code lost:
        if (r4 == true) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0076, code lost:
        if (r0 >= 0) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0078, code lost:
        r5 = r5.substring(0, r2);
        r0 = IsOverlapping + 47;
        getMin = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0086, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0089, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String findEditTable(java.lang.String r5) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x008a
            int r0 = getMin
            int r0 = r0 + 105
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L_0x002d
            r0 = 119(0x77, float:1.67E-43)
            int r0 = r5.indexOf(r0)     // Catch:{ Exception -> 0x002b }
            r2 = 17
            int r2 = r5.indexOf(r2)     // Catch:{ Exception -> 0x002b }
            r3 = 59
            if (r0 <= 0) goto L_0x0026
            r4 = 24
            goto L_0x0028
        L_0x0026:
            r4 = 59
        L_0x0028:
            if (r4 == r3) goto L_0x004f
            goto L_0x003b
        L_0x002b:
            r5 = move-exception
            goto L_0x0087
        L_0x002d:
            r0 = 32
            int r0 = r5.indexOf(r0)
            r2 = 44
            int r2 = r5.indexOf(r2)
            if (r0 <= 0) goto L_0x004f
        L_0x003b:
            if (r0 < r2) goto L_0x0048
            r3 = 8
            if (r2 >= 0) goto L_0x0044
            r4 = 88
            goto L_0x0046
        L_0x0044:
            r4 = 8
        L_0x0046:
            if (r4 == r3) goto L_0x004f
        L_0x0048:
            java.lang.String r5 = r5.substring(r1, r0)     // Catch:{ Exception -> 0x004d }
            return r5
        L_0x004d:
            r5 = move-exception
            goto L_0x0088
        L_0x004f:
            r3 = 37
            if (r2 <= 0) goto L_0x0056
            r4 = 81
            goto L_0x0058
        L_0x0056:
            r4 = 37
        L_0x0058:
            if (r4 == r3) goto L_0x0089
            int r3 = getMin     // Catch:{ Exception -> 0x004d }
            int r3 = r3 + 83
            int r4 = r3 % 128
            IsOverlapping = r4     // Catch:{ Exception -> 0x002b }
            int r3 = r3 % 2
            if (r3 != 0) goto L_0x006d
            r3 = 6
            int r3 = r3 / r1
            if (r2 < r0) goto L_0x0078
            goto L_0x0076
        L_0x006b:
            r5 = move-exception
            throw r5
        L_0x006d:
            r3 = 1
            if (r2 < r0) goto L_0x0072
            r4 = 1
            goto L_0x0073
        L_0x0072:
            r4 = 0
        L_0x0073:
            if (r4 == r3) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            if (r0 >= 0) goto L_0x0089
        L_0x0078:
            java.lang.String r5 = r5.substring(r1, r2)
            int r0 = IsOverlapping
            int r0 = r0 + 47
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            return r5
        L_0x0087:
            throw r5
        L_0x0088:
            throw r5
        L_0x0089:
            return r5
        L_0x008a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid tables"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.findEditTable(java.lang.String):java.lang.String");
    }

    public SQLiteStatement compileStatement(String str) throws SQLException {
        int i = getMin + 39;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        try {
            lock();
            try {
                if (isOpen()) {
                    SQLiteStatement sQLiteStatement = new SQLiteStatement(this, str);
                    int i3 = IsOverlapping + 9;
                    getMin = i3 % 128;
                    if ((i3 % 2 != 0 ? Typography.dollar : 2) == 2) {
                        return sQLiteStatement;
                    }
                    Object[] objArr = null;
                    int length2 = objArr.length;
                    return sQLiteStatement;
                }
                throw new IllegalStateException("database not open");
            } finally {
                unlock();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public Cursor query(boolean z, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        int i = getMin + 67;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        Cursor queryWithFactory = queryWithFactory((CursorFactory) null, z, str, strArr, str2, strArr2, str3, str4, str5, str6);
        try {
            int i3 = IsOverlapping + 65;
            try {
                getMin = i3 % 128;
                if (!(i3 % 2 != 0)) {
                    return queryWithFactory;
                }
                Object[] objArr = null;
                try {
                    int length2 = objArr.length;
                    return queryWithFactory;
                } catch (Throwable th) {
                    throw th;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        if (isOpen() != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        r2 = r8;
        r3 = r9;
        r4 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r0 = rawQueryWithFactory(r9, net.sqlcipher.database.SQLiteQueryBuilder.buildQueryString(r10, r11, r12, r13, r15, r16, r17, r18), r14, findEditTable(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        r1 = IsOverlapping + 119;
        getMin = r1 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        if ((r1 % 2) == 0) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        r1 = kotlin.text.Typography.less;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        r1 = kotlin.text.Typography.amp;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        if (r1 == '&') goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r1 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0059, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (isOpen() != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public net.sqlcipher.Cursor queryWithFactory(net.sqlcipher.database.SQLiteDatabase.CursorFactory r9, boolean r10, java.lang.String r11, java.lang.String[] r12, java.lang.String r13, java.lang.String[] r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            r8 = this;
            int r0 = getMin
            int r0 = r0 + 111
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 == r1) goto L_0x001f
            boolean r0 = r8.isOpen()     // Catch:{ Exception -> 0x001c }
            if (r0 == 0) goto L_0x001a
            goto L_0x0028
        L_0x001a:
            r2 = r8
            goto L_0x0060
        L_0x001c:
            r0 = move-exception
            r2 = r8
            goto L_0x005f
        L_0x001f:
            boolean r0 = r8.isOpen()     // Catch:{ Exception -> 0x006c }
            r1 = 66
            int r1 = r1 / r2
            if (r0 == 0) goto L_0x001a
        L_0x0028:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            java.lang.String r0 = net.sqlcipher.database.SQLiteQueryBuilder.buildQueryString(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x001c }
            java.lang.String r1 = findEditTable(r11)     // Catch:{ Exception -> 0x001c }
            r2 = r8
            r3 = r9
            r4 = r14
            net.sqlcipher.Cursor r0 = r8.rawQueryWithFactory(r9, r0, r14, r1)     // Catch:{ Exception -> 0x005e }
            int r1 = IsOverlapping
            int r1 = r1 + 119
            int r3 = r1 % 128
            getMin = r3
            int r1 = r1 % 2
            r3 = 38
            if (r1 == 0) goto L_0x0053
            r1 = 60
            goto L_0x0055
        L_0x0053:
            r1 = 38
        L_0x0055:
            if (r1 == r3) goto L_0x005d
            r1 = 0
            int r1 = r1.length     // Catch:{ all -> 0x005a }
            return r0
        L_0x005a:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x005d:
            return r0
        L_0x005e:
            r0 = move-exception
        L_0x005f:
            throw r0
        L_0x0060:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "database not open"
            r0.<init>(r1)
            throw r0
        L_0x0068:
            r0 = move-exception
            r2 = r8
            r1 = r0
            throw r1
        L_0x006c:
            r0 = move-exception
            r2 = r8
            r1 = r0
            goto L_0x0071
        L_0x0070:
            throw r1
        L_0x0071:
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.queryWithFactory(net.sqlcipher.database.SQLiteDatabase$CursorFactory, boolean, java.lang.String, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String, java.lang.String, java.lang.String, java.lang.String):net.sqlcipher.Cursor");
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        Cursor cursor;
        int i = IsOverlapping + 123;
        getMin = i % 128;
        boolean z = false;
        if (!(i % 2 == 0)) {
            try {
                cursor = query(false, str, strArr, str2, strArr2, str3, str4, str5, (String) null);
            } catch (Exception e) {
                throw e;
            }
        } else {
            cursor = query(false, str, strArr, str2, strArr2, str3, str4, str5, (String) null);
        }
        int i2 = IsOverlapping + 11;
        getMin = i2 % 128;
        if (i2 % 2 != 0) {
            z = true;
        }
        if (!z) {
            return cursor;
        }
        Object[] objArr = null;
        try {
            int length2 = objArr.length;
            return cursor;
        } catch (Throwable th) {
            throw th;
        }
    }

    public Cursor query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        int i = IsOverlapping + 83;
        getMin = i % 128;
        int i2 = i % 2;
        Cursor query = query(false, str, strArr, str2, strArr2, str3, str4, str5, str6);
        int i3 = getMin + 31;
        IsOverlapping = i3 % 128;
        if ((i3 % 2 == 0 ? 'M' : '3') != 'M') {
            return query;
        }
        Object[] objArr = null;
        try {
            int length2 = objArr.length;
            return query;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, java.lang.String, net.sqlcipher.database.SQLiteDatabase$CursorFactory] */
    public Cursor rawQuery(String str, String[] strArr) {
        Cursor cursor;
        int i = getMin + 105;
        IsOverlapping = i % 128;
        ? r2 = 0;
        if ((i % 2 == 0 ? 'J' : 20) != 20) {
            cursor = rawQueryWithFactory(r2, str, strArr, r2);
            super.hashCode();
        } else {
            cursor = rawQueryWithFactory(r2, str, strArr, r2);
        }
        int i2 = IsOverlapping + 49;
        getMin = i2 % 128;
        int i3 = i2 % 2;
        return cursor;
    }

    public SQLiteQueryStats getQueryStats(String str, Object[] objArr) {
        int i = getMin + 63;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        try {
            execSQL(String.format("CREATE TABLE tempstat AS %s", new Object[]{str}), objArr);
            Cursor rawQuery = rawQuery("SELECT sum(payload) FROM dbstat WHERE name = 'tempstat';", new Object[0]);
            if (rawQuery == null) {
                return new SQLiteQueryStats(0, 0);
            }
            rawQuery.moveToFirst();
            long j = rawQuery.getLong(0);
            rawQuery.close();
            Cursor rawQuery2 = rawQuery("SELECT max(mx_payload) FROM dbstat WHERE name = 'tempstat';", new Object[0]);
            if (rawQuery2 == null) {
                return new SQLiteQueryStats(j, 0);
            }
            rawQuery2.moveToFirst();
            long j2 = rawQuery2.getLong(0);
            rawQuery2.close();
            execSQL("DROP TABLE tempstat;");
            int i3 = getMin + 27;
            IsOverlapping = i3 % 128;
            int i4 = i3 % 2;
            return new SQLiteQueryStats(j, j2);
        } catch (SQLiteException e) {
            execSQL("DROP TABLE IF EXISTS tempstat;");
            throw e;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r4 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r0 != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public net.sqlcipher.Cursor rawQuery(java.lang.String r4, java.lang.Object[] r5) {
        /*
            r3 = this;
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x004d
            net.sqlcipher.database.SQLiteDirectCursorDriver r0 = new net.sqlcipher.database.SQLiteDirectCursorDriver
            r1 = 0
            r0.<init>(r3, r4, r1)
            net.sqlcipher.database.SQLiteDatabase$CursorFactory r4 = r3.mFactory     // Catch:{ all -> 0x004b }
            net.sqlcipher.Cursor r4 = r0.query((net.sqlcipher.database.SQLiteDatabase.CursorFactory) r4, (java.lang.Object[]) r5)     // Catch:{ all -> 0x004b }
            int r5 = r3.mSlowQueryThreshold
            r0 = -1
            if (r5 == r0) goto L_0x0045
            int r5 = getMin
            int r5 = r5 + 109
            int r0 = r5 % 128
            IsOverlapping = r0
            int r5 = r5 % 2
            r0 = 0
            r2 = 1
            if (r5 != 0) goto L_0x0027
            r5 = 1
            goto L_0x0028
        L_0x0027:
            r5 = 0
        L_0x0028:
            if (r5 == r2) goto L_0x002d
            if (r4 == 0) goto L_0x0038
            goto L_0x0035
        L_0x002d:
            int r5 = r1.length     // Catch:{ all -> 0x0043 }
            if (r4 == 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r0 = 1
        L_0x0032:
            if (r0 == 0) goto L_0x0035
            goto L_0x0038
        L_0x0035:
            r4.getCount()
        L_0x0038:
            int r5 = getMin
            int r5 = r5 + 91
            int r0 = r5 % 128
            IsOverlapping = r0
            int r5 = r5 % 2
            goto L_0x0045
        L_0x0043:
            r4 = move-exception
            throw r4
        L_0x0045:
            net.sqlcipher.CrossProcessCursorWrapper r5 = new net.sqlcipher.CrossProcessCursorWrapper
            r5.<init>(r4)
            return r5
        L_0x004b:
            r4 = move-exception
            throw r4
        L_0x004d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "database not open"
            r4.<init>(r5)     // Catch:{ Exception -> 0x0055 }
            throw r4     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.rawQuery(java.lang.String, java.lang.Object[]):net.sqlcipher.Cursor");
    }

    public Cursor rawQueryWithFactory(CursorFactory cursorFactory, String str, String[] strArr, String str2) {
        if (isOpen()) {
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, str2);
            if ((cursorFactory != null ? 13 : '-') == '-') {
                cursorFactory = this.mFactory;
                int i = IsOverlapping + 59;
                getMin = i % 128;
                int i2 = i % 2;
            }
            Cursor query = sQLiteDirectCursorDriver.query(cursorFactory, strArr);
            if ((this.mSlowQueryThreshold != -1 ? 'Q' : 29) == 'Q' && query != null) {
                int i3 = IsOverlapping + 11;
                getMin = i3 % 128;
                int i4 = i3 % 2;
                query.getCount();
            }
            return new CrossProcessCursorWrapper(query);
        }
        try {
            throw new IllegalStateException("database not open");
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.String, net.sqlcipher.database.SQLiteDatabase$CursorFactory] */
    public Cursor rawQuery(String str, String[] strArr, int i, int i2) {
        CursorWrapper cursorWrapper;
        int i3 = IsOverlapping + 85;
        getMin = i3 % 128;
        ? r2 = 0;
        if ((i3 % 2 != 0 ? ',' : '?') != '?') {
            cursorWrapper = (CursorWrapper) rawQueryWithFactory(r2, str, strArr, r2);
            ((SQLiteCursor) cursorWrapper.getWrappedCursor()).setLoadStyle(i, i2);
            int length2 = r2.length;
        } else {
            cursorWrapper = (CursorWrapper) rawQueryWithFactory(r2, str, strArr, r2);
            ((SQLiteCursor) cursorWrapper.getWrappedCursor()).setLoadStyle(i, i2);
        }
        try {
            int i4 = IsOverlapping + 11;
            getMin = i4 % 128;
            if ((i4 % 2 != 0 ? 'E' : '.') == '.') {
                return cursorWrapper;
            }
            int length3 = r2.length;
            return cursorWrapper;
        } catch (Exception e) {
            throw e;
        }
    }

    public long insert(String str, String str2, ContentValues contentValues) {
        int i = getMin + 57;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        try {
            long insertWithOnConflict = insertWithOnConflict(str, str2, contentValues, 0);
            int i3 = IsOverlapping + 23;
            getMin = i3 % 128;
            if ((i3 % 2 != 0 ? (char) 24 : 6) != 24) {
                return insertWithOnConflict;
            }
            Object obj = null;
            super.hashCode();
            return insertWithOnConflict;
        } catch (SQLException unused) {
            return -1;
        }
    }

    public long insertOrThrow(String str, String str2, ContentValues contentValues) throws SQLException {
        int i = getMin + 73;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        boolean z = false;
        try {
            long insertWithOnConflict = insertWithOnConflict(str, str2, contentValues, 0);
            int i3 = getMin + 35;
            IsOverlapping = i3 % 128;
            if (i3 % 2 == 0) {
                z = true;
            }
            if (!z) {
                return insertWithOnConflict;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return insertWithOnConflict;
        } catch (Exception e) {
            throw e;
        }
    }

    public long replace(String str, String str2, ContentValues contentValues) {
        int i = IsOverlapping + 1;
        getMin = i % 128;
        int i2 = i % 2;
        try {
            long insertWithOnConflict = insertWithOnConflict(str, str2, contentValues, 5);
            try {
                int i3 = getMin + 119;
                IsOverlapping = i3 % 128;
                int i4 = i3 % 2;
                return insertWithOnConflict;
            } catch (Exception e) {
                throw e;
            }
        } catch (SQLException unused) {
            return -1;
        }
    }

    public long replaceOrThrow(String str, String str2, ContentValues contentValues) throws SQLException {
        try {
            int i = getMin + 103;
            IsOverlapping = i % 128;
            int i2 = i % 2;
            long insertWithOnConflict = insertWithOnConflict(str, str2, contentValues, 5);
            int i3 = IsOverlapping + 53;
            getMin = i3 % 128;
            if (i3 % 2 == 0) {
                return insertWithOnConflict;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return insertWithOnConflict;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.util.Set<java.util.Map$Entry<java.lang.String, java.lang.Object>>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: net.sqlcipher.database.SQLiteStatement} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: java.util.Set<java.util.Map$Entry<java.lang.String, java.lang.Object>>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: java.util.Set<java.util.Map$Entry<java.lang.String, java.lang.Object>>} */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c5 A[SYNTHETIC, Splitter:B:32:0x00c5] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x012a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long insertWithOnConflict(java.lang.String r7, java.lang.String r8, android.content.ContentValues r9, int r10) {
        /*
            r6 = this;
            boolean r0 = r6.isOpen()
            if (r0 == 0) goto L_0x0133
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 152(0x98, float:2.13E-43)
            r0.<init>(r1)
            java.lang.String r1 = "INSERT"
            r0.append(r1)
            java.lang.String[] r1 = CONFLICT_VALUES
            r10 = r1[r10]
            r0.append(r10)
            java.lang.String r10 = " INTO "
            r0.append(r10)
            r0.append(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r10 = 40
            r7.<init>(r10)
            r1 = 81
            if (r9 == 0) goto L_0x002f
            r2 = 81
            goto L_0x0031
        L_0x002f:
            r2 = 13
        L_0x0031:
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == r1) goto L_0x0037
            goto L_0x008f
        L_0x0037:
            int r1 = r9.size()     // Catch:{ Exception -> 0x013b }
            if (r1 <= 0) goto L_0x008f
            int r8 = getMin
            int r8 = r8 + 35
            int r1 = r8 % 128
            IsOverlapping = r1
            int r8 = r8 % 2
            java.util.Set r8 = r9.valueSet()
            java.util.Iterator r9 = r8.iterator()
            r0.append(r10)
            r10 = 0
        L_0x0053:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0089
            if (r10 == 0) goto L_0x005d
            r10 = 0
            goto L_0x005e
        L_0x005d:
            r10 = 1
        L_0x005e:
            if (r10 == 0) goto L_0x0061
            goto L_0x0073
        L_0x0061:
            int r10 = getMin
            int r10 = r10 + 23
            int r1 = r10 % 128
            IsOverlapping = r1
            int r10 = r10 % 2
            java.lang.String r10 = ", "
            r0.append(r10)
            r7.append(r10)
        L_0x0073:
            java.lang.Object r10 = r9.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r10 = r10.getKey()
            java.lang.String r10 = (java.lang.String) r10
            r0.append(r10)
            r10 = 63
            r7.append(r10)
            r10 = 1
            goto L_0x0053
        L_0x0089:
            r9 = 41
            r0.append(r9)
            goto L_0x00ab
        L_0x008f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "("
            r9.<init>(r10)
            r9.append(r8)     // Catch:{ Exception -> 0x0131 }
            java.lang.String r8 = ") "
            r9.append(r8)     // Catch:{ Exception -> 0x013b }
            java.lang.String r8 = r9.toString()     // Catch:{ Exception -> 0x013b }
            r0.append(r8)     // Catch:{ Exception -> 0x013b }
            java.lang.String r8 = "NULL"
            r7.append(r8)     // Catch:{ Exception -> 0x013b }
            r8 = r3
        L_0x00ab:
            java.lang.String r9 = " VALUES("
            r0.append(r9)
            r0.append(r7)
            java.lang.String r7 = ");"
            r0.append(r7)
            r6.lock()
            java.lang.String r7 = r0.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0123 }
            net.sqlcipher.database.SQLiteStatement r7 = r6.compileStatement((java.lang.String) r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0123 }
            if (r8 == 0) goto L_0x00e6
            int r9 = r8.size()     // Catch:{ SQLiteDatabaseCorruptException -> 0x011e, all -> 0x011b }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ SQLiteDatabaseCorruptException -> 0x011e, all -> 0x011b }
            r10 = 0
        L_0x00ce:
            if (r10 >= r9) goto L_0x00d2
            r0 = 1
            goto L_0x00d3
        L_0x00d2:
            r0 = 0
        L_0x00d3:
            if (r0 == r5) goto L_0x00d6
            goto L_0x00e6
        L_0x00d6:
            java.lang.Object r0 = r8.next()     // Catch:{ SQLiteDatabaseCorruptException -> 0x011e, all -> 0x011b }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x011e, all -> 0x011b }
            int r10 = r10 + 1
            java.lang.Object r0 = r0.getValue()     // Catch:{ SQLiteDatabaseCorruptException -> 0x011e, all -> 0x011b }
            net.sqlcipher.DatabaseUtils.bindObjectToProgram(r7, r10, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x011e, all -> 0x011b }
            goto L_0x00ce
        L_0x00e6:
            r7.execute()     // Catch:{ SQLiteDatabaseCorruptException -> 0x011e, all -> 0x011b }
            int r8 = r6.lastChangeCount()     // Catch:{ SQLiteDatabaseCorruptException -> 0x011e, all -> 0x011b }
            if (r8 <= 0) goto L_0x0106
            int r8 = IsOverlapping
            int r8 = r8 + 17
            int r9 = r8 % 128
            getMin = r9
            int r8 = r8 % 2
            if (r8 == 0) goto L_0x0101
            long r8 = r6.lastInsertRow()     // Catch:{ SQLiteDatabaseCorruptException -> 0x011e, all -> 0x011b }
            int r10 = r3.length     // Catch:{ SQLiteDatabaseCorruptException -> 0x011e, all -> 0x011b }
            goto L_0x0112
        L_0x0101:
            long r8 = r6.lastInsertRow()     // Catch:{ SQLiteDatabaseCorruptException -> 0x011e, all -> 0x011b }
            goto L_0x0112
        L_0x0106:
            r8 = -1
            int r10 = IsOverlapping
            int r10 = r10 + 91
            int r0 = r10 % 128
            getMin = r0
            int r10 = r10 % 2
        L_0x0112:
            if (r7 == 0) goto L_0x0117
            r7.close()
        L_0x0117:
            r6.unlock()
            return r8
        L_0x011b:
            r8 = move-exception
            r3 = r7
            goto L_0x0128
        L_0x011e:
            r8 = move-exception
            r3 = r7
            goto L_0x0124
        L_0x0121:
            r8 = move-exception
            goto L_0x0128
        L_0x0123:
            r8 = move-exception
        L_0x0124:
            r6.onCorruption()     // Catch:{ all -> 0x0121 }
            throw r8     // Catch:{ all -> 0x0121 }
        L_0x0128:
            if (r3 == 0) goto L_0x012d
            r3.close()
        L_0x012d:
            r6.unlock()
            throw r8
        L_0x0131:
            r7 = move-exception
            throw r7
        L_0x0133:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "database not open"
            r7.<init>(r8)     // Catch:{ Exception -> 0x013b }
            throw r7     // Catch:{ Exception -> 0x013b }
        L_0x013b:
            r7 = move-exception
            goto L_0x013e
        L_0x013d:
            throw r7
        L_0x013e:
            goto L_0x013d
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.insertWithOnConflict(java.lang.String, java.lang.String, android.content.ContentValues, int):long");
    }

    public int delete(String str, String str2, String[] strArr) {
        int i = IsOverlapping + 85;
        getMin = i % 128;
        Object[] objArr = (Object[]) strArr;
        if ((i % 2 != 0 ? '!' : 18) == 18) {
            return delete(str, str2, objArr);
        }
        int delete = delete(str, str2, objArr);
        Object[] objArr2 = null;
        int length2 = objArr2.length;
        return delete;
    }

    public int delete(String str, String str2, Object[] objArr) {
        String str3;
        SQLiteStatement sQLiteStatement = null;
        lock();
        try {
            if (isOpen()) {
                StringBuilder sb = new StringBuilder("DELETE FROM ");
                sb.append(str);
                if (!TextUtils.isEmpty(str2)) {
                    int i = getMin + 11;
                    IsOverlapping = i % 128;
                    int i2 = i % 2;
                    str3 = " WHERE ".concat(String.valueOf(str2));
                } else {
                    str3 = "";
                }
                sb.append(str3);
                sQLiteStatement = compileStatement(sb.toString());
                if (objArr != null) {
                    int length2 = objArr.length;
                    try {
                        int i3 = IsOverlapping + 91;
                        getMin = i3 % 128;
                        int i4 = i3 % 2;
                        int i5 = 0;
                        while (i5 < length2) {
                            int i6 = getMin + 39;
                            IsOverlapping = i6 % 128;
                            if (!(i6 % 2 != 0)) {
                                DatabaseUtils.bindObjectToProgram(sQLiteStatement, i5 >> 0, objArr[i5]);
                                i5 += 17;
                            } else {
                                int i7 = i5 + 1;
                                DatabaseUtils.bindObjectToProgram(sQLiteStatement, i7, objArr[i5]);
                                i5 = i7;
                            }
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                }
                sQLiteStatement.execute();
                int lastChangeCount = lastChangeCount();
                if ((sQLiteStatement != null ? '(' : 'T') == '(') {
                    sQLiteStatement.close();
                }
                unlock();
                return lastChangeCount;
            }
            throw new IllegalStateException("database not open");
        } catch (SQLiteDatabaseCorruptException e2) {
            onCorruption();
            throw e2;
        } catch (Exception e3) {
            throw e3;
        } catch (Throwable th) {
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
            unlock();
            throw th;
        }
    }

    public int update(String str, ContentValues contentValues, String str2, String[] strArr) {
        try {
            int i = getMin + 69;
            IsOverlapping = i % 128;
            int i2 = i % 2;
            int updateWithOnConflict = updateWithOnConflict(str, contentValues, str2, strArr, 0);
            int i3 = IsOverlapping + 61;
            getMin = i3 % 128;
            int i4 = i3 % 2;
            return updateWithOnConflict;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r0 != 0) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r6.size() != 0) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int updateWithOnConflict(java.lang.String r5, android.content.ContentValues r6, java.lang.String r7, java.lang.String[] r8, int r9) {
        /*
            r4 = this;
            r0 = 22
            if (r6 == 0) goto L_0x0007
            r1 = 22
            goto L_0x0009
        L_0x0007:
            r1 = 97
        L_0x0009:
            if (r1 != r0) goto L_0x0113
            int r0 = getMin
            int r0 = r0 + 7
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L_0x0024
            int r0 = r6.size()
            super.hashCode()     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0113
            goto L_0x002a
        L_0x0022:
            r5 = move-exception
            throw r5
        L_0x0024:
            int r0 = r6.size()
            if (r0 == 0) goto L_0x0113
        L_0x002a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r2 = 120(0x78, float:1.68E-43)
            r0.<init>(r2)
            java.lang.String r2 = "UPDATE "
            r0.append(r2)
            java.lang.String[] r2 = CONFLICT_VALUES
            r9 = r2[r9]
            r0.append(r9)
            r0.append(r5)
            java.lang.String r5 = " SET "
            r0.append(r5)
            java.util.Set r5 = r6.valueSet()
            java.util.Iterator r6 = r5.iterator()
        L_0x004d:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x0076
            java.lang.Object r9 = r6.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r9 = r9.getKey()
            java.lang.String r9 = (java.lang.String) r9
            r0.append(r9)
            java.lang.String r9 = "=?"
            r0.append(r9)
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x004d
            java.lang.String r9 = ", "
            r0.append(r9)     // Catch:{ Exception -> 0x0073 }
            goto L_0x004d
        L_0x0073:
            r5 = move-exception
            goto L_0x010e
        L_0x0076:
            boolean r6 = android.text.TextUtils.isEmpty(r7)
            if (r6 != 0) goto L_0x008e
            java.lang.String r6 = " WHERE "
            r0.append(r6)
            r0.append(r7)
            int r6 = IsOverlapping
            int r6 = r6 + 45
            int r7 = r6 % 128
            getMin = r7
            int r6 = r6 % 2
        L_0x008e:
            r4.lock()
            boolean r6 = r4.isOpen()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0103, SQLException -> 0x0101 }
            if (r6 == 0) goto L_0x00f7
            java.lang.String r6 = r0.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0103, SQLException -> 0x0101 }
            net.sqlcipher.database.SQLiteStatement r1 = r4.compileStatement((java.lang.String) r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0103, SQLException -> 0x0101 }
            int r6 = r5.size()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0103, SQLException -> 0x0101 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0103, SQLException -> 0x0101 }
            r7 = 0
            r9 = 1
            r0 = 0
        L_0x00aa:
            r2 = 57
            if (r0 >= r6) goto L_0x00b1
            r3 = 41
            goto L_0x00b3
        L_0x00b1:
            r3 = 57
        L_0x00b3:
            if (r3 == r2) goto L_0x00c7
            java.lang.Object r2 = r5.next()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0103, SQLException -> 0x0101 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ SQLiteDatabaseCorruptException -> 0x0103, SQLException -> 0x0101 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0103, SQLException -> 0x0101 }
            net.sqlcipher.DatabaseUtils.bindObjectToProgram(r1, r9, r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0103, SQLException -> 0x0101 }
            int r9 = r9 + 1
            int r0 = r0 + 1
            goto L_0x00aa
        L_0x00c7:
            if (r8 == 0) goto L_0x00dd
            int r5 = r8.length     // Catch:{ SQLiteDatabaseCorruptException -> 0x0103, SQLException -> 0x0101 }
        L_0x00ca:
            r6 = 3
            if (r7 >= r5) goto L_0x00d0
            r0 = 28
            goto L_0x00d1
        L_0x00d0:
            r0 = 3
        L_0x00d1:
            if (r0 == r6) goto L_0x00dd
            r6 = r8[r7]     // Catch:{ SQLiteDatabaseCorruptException -> 0x0103, SQLException -> 0x0101 }
            r1.bindString(r9, r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0103, SQLException -> 0x0101 }
            int r9 = r9 + 1
            int r7 = r7 + 1
            goto L_0x00ca
        L_0x00dd:
            r1.execute()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0103, SQLException -> 0x0101 }
            int r5 = r4.lastChangeCount()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0103, SQLException -> 0x0101 }
            if (r1 == 0) goto L_0x00f3
            r1.close()
            int r6 = getMin
            int r6 = r6 + 49
            int r7 = r6 % 128
            IsOverlapping = r7
            int r6 = r6 % 2
        L_0x00f3:
            r4.unlock()
            return r5
        L_0x00f7:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ SQLiteDatabaseCorruptException -> 0x0103, SQLException -> 0x0101 }
            java.lang.String r6 = "database not open"
            r5.<init>(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0103, SQLException -> 0x0101 }
            throw r5     // Catch:{ SQLiteDatabaseCorruptException -> 0x0103, SQLException -> 0x0101 }
        L_0x00ff:
            r5 = move-exception
            goto L_0x0108
        L_0x0101:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x00ff }
        L_0x0103:
            r5 = move-exception
            r4.onCorruption()     // Catch:{ all -> 0x00ff }
            throw r5     // Catch:{ all -> 0x00ff }
        L_0x0108:
            if (r1 == 0) goto L_0x010f
            r1.close()     // Catch:{ Exception -> 0x0073 }
            goto L_0x010f
        L_0x010e:
            throw r5
        L_0x010f:
            r4.unlock()
            throw r5
        L_0x0113:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Empty values"
            r5.<init>(r6)
            goto L_0x011c
        L_0x011b:
            throw r5
        L_0x011c:
            goto L_0x011b
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.updateWithOnConflict(java.lang.String, android.content.ContentValues, java.lang.String, java.lang.String[], int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (isOpen() != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        if (isOpen() != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        throw new java.lang.IllegalStateException("database not open");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void execSQL(java.lang.String r3) throws net.sqlcipher.SQLException {
        /*
            r2 = this;
            int r0 = IsOverlapping
            int r0 = r0 + 43
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            r1 = 82
            if (r0 == 0) goto L_0x0011
            r0 = 8
            goto L_0x0013
        L_0x0011:
            r0 = 82
        L_0x0013:
            if (r0 == r1) goto L_0x002a
            android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x0028 }
            r2.lock()     // Catch:{ Exception -> 0x0026 }
            boolean r0 = r2.isOpen()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0051 }
            r1 = 59
            int r1 = r1 / 0
            if (r0 == 0) goto L_0x0047
            goto L_0x0036
        L_0x0026:
            r3 = move-exception
            throw r3
        L_0x0028:
            r3 = move-exception
            throw r3
        L_0x002a:
            android.os.SystemClock.uptimeMillis()
            r2.lock()
            boolean r0 = r2.isOpen()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0051 }
            if (r0 == 0) goto L_0x0047
        L_0x0036:
            r2.native_execSQL(r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0051 }
            r2.unlock()
            int r3 = getMin
            int r3 = r3 + 73
            int r0 = r3 % 128
            IsOverlapping = r0
            int r3 = r3 % 2
            return
        L_0x0047:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ SQLiteDatabaseCorruptException -> 0x0051 }
            java.lang.String r0 = "database not open"
            r3.<init>(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0051 }
            throw r3     // Catch:{ SQLiteDatabaseCorruptException -> 0x0051 }
        L_0x004f:
            r3 = move-exception
            goto L_0x0056
        L_0x0051:
            r3 = move-exception
            r2.onCorruption()     // Catch:{ all -> 0x004f }
            throw r3     // Catch:{ all -> 0x004f }
        L_0x0056:
            r2.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.execSQL(java.lang.String):void");
    }

    public void rawExecSQL(String str) {
        try {
            int i = getMin + 23;
            IsOverlapping = i % 128;
            int i2 = i % 2;
            SystemClock.uptimeMillis();
            lock();
            try {
                if (isOpen()) {
                    native_rawExecSQL(str);
                    unlock();
                    try {
                        int i3 = getMin + 39;
                        IsOverlapping = i3 % 128;
                        int i4 = i3 % 2;
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    throw new IllegalStateException("database not open");
                }
            } catch (SQLiteDatabaseCorruptException e2) {
                onCorruption();
                throw e2;
            } catch (Throwable th) {
                unlock();
                throw th;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r8 != null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
        if (r8 != null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x008b, code lost:
        throw new java.lang.IllegalArgumentException("Empty bindArgs");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void execSQL(java.lang.String r7, java.lang.Object[] r8) throws net.sqlcipher.SQLException {
        /*
            r6 = this;
            int r0 = IsOverlapping     // Catch:{ Exception -> 0x0090 }
            int r0 = r0 + 113
            int r1 = r0 % 128
            getMin = r1     // Catch:{ Exception -> 0x008e }
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            if (r0 == r2) goto L_0x0016
            if (r8 == 0) goto L_0x0084
            goto L_0x001b
        L_0x0016:
            r0 = 46
            int r0 = r0 / r1
            if (r8 == 0) goto L_0x0084
        L_0x001b:
            r0 = 0
            android.os.SystemClock.uptimeMillis()
            r6.lock()
            boolean r3 = r6.isOpen()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0076 }
            if (r3 == 0) goto L_0x006c
            net.sqlcipher.database.SQLiteStatement r0 = r6.compileStatement((java.lang.String) r7)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0076 }
            if (r8 == 0) goto L_0x0060
            int r7 = r8.length     // Catch:{ SQLiteDatabaseCorruptException -> 0x0076 }
            r3 = 0
        L_0x0030:
            r4 = 47
            if (r3 >= r7) goto L_0x0037
            r5 = 47
            goto L_0x0039
        L_0x0037:
            r5 = 66
        L_0x0039:
            if (r5 == r4) goto L_0x003c
            goto L_0x0060
        L_0x003c:
            int r4 = getMin     // Catch:{ Exception -> 0x0090 }
            int r4 = r4 + 99
            int r5 = r4 % 128
            IsOverlapping = r5     // Catch:{ Exception -> 0x008e }
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x004a
            r4 = 1
            goto L_0x004b
        L_0x004a:
            r4 = 0
        L_0x004b:
            if (r4 == r2) goto L_0x0056
            int r4 = r3 + 1
            r3 = r8[r3]     // Catch:{ SQLiteDatabaseCorruptException -> 0x0076 }
            net.sqlcipher.DatabaseUtils.bindObjectToProgram(r0, r4, r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0076 }
            r3 = r4
            goto L_0x0030
        L_0x0056:
            int r4 = r3 % 1
            r5 = r8[r3]     // Catch:{ SQLiteDatabaseCorruptException -> 0x0076 }
            net.sqlcipher.DatabaseUtils.bindObjectToProgram(r0, r4, r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0076 }
            int r3 = r3 + 60
            goto L_0x0030
        L_0x0060:
            r0.execute()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0076 }
            if (r0 == 0) goto L_0x0068
            r0.close()
        L_0x0068:
            r6.unlock()
            return
        L_0x006c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ SQLiteDatabaseCorruptException -> 0x0076 }
            java.lang.String r8 = "database not open"
            r7.<init>(r8)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0076 }
            throw r7     // Catch:{ SQLiteDatabaseCorruptException -> 0x0076 }
        L_0x0074:
            r7 = move-exception
            goto L_0x007b
        L_0x0076:
            r7 = move-exception
            r6.onCorruption()     // Catch:{ all -> 0x0074 }
            throw r7     // Catch:{ all -> 0x0074 }
        L_0x007b:
            if (r0 == 0) goto L_0x0080
            r0.close()     // Catch:{ Exception -> 0x008e }
        L_0x0080:
            r6.unlock()
            throw r7
        L_0x0084:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Empty bindArgs"
            r7.<init>(r8)
            throw r7
        L_0x008c:
            r7 = move-exception
            throw r7
        L_0x008e:
            r7 = move-exception
            throw r7
        L_0x0090:
            r7 = move-exception
            goto L_0x0093
        L_0x0092:
            throw r7
        L_0x0093:
            goto L_0x0092
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.execSQL(java.lang.String, java.lang.Object[]):void");
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            int i = IsOverlapping + 51;
            getMin = i % 128;
            int i2 = i % 2;
            if ((isOpen() ? 3 : ',') == 3) {
                int i3 = getMin + 33;
                IsOverlapping = i3 % 128;
                int i4 = i3 % 2;
                closeClosable();
                onAllReferencesReleased();
                int i5 = getMin + 119;
                IsOverlapping = i5 % 128;
                int i6 = i5 % 2;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public SQLiteDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i) {
        this(str, cursorFactory, i, (DatabaseErrorHandler) null);
        openDatabaseInternal(cArr, (SQLiteDatabaseHook) null);
    }

    public SQLiteDatabase(String str, char[] cArr, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this(str, cursorFactory, i, (DatabaseErrorHandler) null);
        openDatabaseInternal(cArr, sQLiteDatabaseHook);
    }

    public SQLiteDatabase(String str, byte[] bArr, CursorFactory cursorFactory, int i, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this(str, cursorFactory, i, (DatabaseErrorHandler) null);
        openDatabaseInternal(bArr, sQLiteDatabaseHook);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    private SQLiteDatabase(String str, CursorFactory cursorFactory, int i, DatabaseErrorHandler databaseErrorHandler) {
        this.mLock = new ReentrantLock(true);
        this.mLockAcquiredWallTime = 0;
        this.mLockAcquiredThreadTime = 0;
        this.mLastLockMessageTime = 0;
        ? r0 = 0;
        this.mLastSqlStatement = r0;
        this.mNativeHandle = 0;
        this.mTempTableSequence = 0;
        this.mPathForLogs = r0;
        this.mCompiledQueries = new HashMap();
        this.mMaxSqlCacheSize = MAX_SQL_CACHE_SIZE;
        this.mTimeOpened = r0;
        this.mTimeClosed = r0;
        this.mStackTrace = r0;
        this.mLockingEnabled = true;
        this.mSyncUpdateInfo = new HashMap();
        if (str != null) {
            this.mFlags = i;
            this.mPath = str;
            this.mSlowQueryThreshold = -1;
            this.mStackTrace = new DatabaseObjectNotClosedException().fillInStackTrace();
            this.mFactory = cursorFactory;
            this.mPrograms = new WeakHashMap<>();
            this.mErrorHandler = databaseErrorHandler;
            int i2 = IsOverlapping + 27;
            getMin = i2 % 128;
            if ((i2 % 2 != 0 ? 'X' : '`') == 'X') {
                super.hashCode();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("path should not be null");
    }

    private void openDatabaseInternal(char[] cArr, SQLiteDatabaseHook sQLiteDatabaseHook) {
        try {
            int i = getMin + 87;
            IsOverlapping = i % 128;
            int i2 = i % 2;
            openDatabaseInternal(getBytes(cArr), sQLiteDatabaseHook);
            int i3 = getMin + 37;
            IsOverlapping = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005c, code lost:
        if (r3 != null) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008a A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void openDatabaseInternal(final byte[] r6, net.sqlcipher.database.SQLiteDatabaseHook r7) {
        /*
            r5 = this;
            java.lang.String r0 = r5.mPath     // Catch:{ Exception -> 0x00a5 }
            int r1 = r5.mFlags     // Catch:{ Exception -> 0x00a5 }
            r5.dbopen(r0, r1)     // Catch:{ Exception -> 0x00a5 }
            r0 = 0
            r1 = 1
            net.sqlcipher.database.SQLiteDatabase$2 r2 = new net.sqlcipher.database.SQLiteDatabase$2     // Catch:{ RuntimeException -> 0x0016 }
            r2.<init>(r6)     // Catch:{ RuntimeException -> 0x0016 }
            r5.keyDatabase(r7, r2)     // Catch:{ RuntimeException -> 0x0016 }
            return
        L_0x0012:
            r6 = move-exception
            r0 = 1
            goto L_0x008c
        L_0x0016:
            r2 = move-exception
            char[] r3 = getChars(r6)     // Catch:{ all -> 0x0012 }
            boolean r4 = r5.containsNull(r3)     // Catch:{ all -> 0x0012 }
            if (r4 == 0) goto L_0x008b
            net.sqlcipher.database.SQLiteDatabase$3 r2 = new net.sqlcipher.database.SQLiteDatabase$3     // Catch:{ all -> 0x0012 }
            r2.<init>(r6, r3)     // Catch:{ all -> 0x0012 }
            r5.keyDatabase(r7, r2)     // Catch:{ all -> 0x0012 }
            if (r6 == 0) goto L_0x002d
            r7 = 0
            goto L_0x002e
        L_0x002d:
            r7 = 1
        L_0x002e:
            if (r7 == r1) goto L_0x0040
            int r7 = r6.length     // Catch:{ all -> 0x0012 }
            if (r7 <= 0) goto L_0x0040
            int r7 = IsOverlapping
            int r7 = r7 + 99
            int r2 = r7 % 128
            getMin = r2
            int r7 = r7 % 2
            r5.rekey(r6)     // Catch:{ all -> 0x0012 }
        L_0x0040:
            int r6 = IsOverlapping
            int r6 = r6 + 21
            int r7 = r6 % 128
            getMin = r7
            int r6 = r6 % 2
            if (r6 == 0) goto L_0x005c
            r6 = 27
            int r6 = r6 / r0
            r6 = 47
            if (r3 == 0) goto L_0x0056
            r7 = 47
            goto L_0x0057
        L_0x0056:
            r7 = 0
        L_0x0057:
            if (r7 == r6) goto L_0x005e
            goto L_0x0073
        L_0x005a:
            r6 = move-exception
            goto L_0x008c
        L_0x005c:
            if (r3 == 0) goto L_0x0073
        L_0x005e:
            int r6 = r3.length     // Catch:{ all -> 0x005a }
            if (r6 <= 0) goto L_0x0063
            r6 = 0
            goto L_0x0064
        L_0x0063:
            r6 = 1
        L_0x0064:
            if (r6 == r1) goto L_0x0073
            int r6 = getMin
            int r6 = r6 + 21
            int r7 = r6 % 128
            IsOverlapping = r7
            int r6 = r6 % 2
            java.util.Arrays.fill(r3, r0)     // Catch:{ all -> 0x005a }
        L_0x0073:
            int r6 = getMin
            int r6 = r6 + 105
            int r7 = r6 % 128
            IsOverlapping = r7
            int r6 = r6 % 2
            if (r6 != 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r0 = 1
        L_0x0081:
            if (r0 == r1) goto L_0x008a
            r6 = 0
            super.hashCode()     // Catch:{ all -> 0x0088 }
            return
        L_0x0088:
            r6 = move-exception
            throw r6
        L_0x008a:
            return
        L_0x008b:
            throw r2     // Catch:{ all -> 0x0012 }
        L_0x008c:
            if (r0 == 0) goto L_0x00a4
            r5.dbclose()
            boolean r7 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE
            r0 = 31
            if (r7 == 0) goto L_0x009a
            r7 = 38
            goto L_0x009c
        L_0x009a:
            r7 = 31
        L_0x009c:
            if (r7 == r0) goto L_0x00a4
            java.lang.String r7 = r5.getTime()
            r5.mTimeClosed = r7
        L_0x00a4:
            throw r6
        L_0x00a5:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.openDatabaseInternal(byte[], net.sqlcipher.database.SQLiteDatabaseHook):void");
    }

    private boolean containsNull(char[] cArr) {
        int i;
        int i2;
        int i3 = IsOverlapping + 93;
        getMin = i3 % 128;
        int i4 = i3 % 2;
        if ((cArr != null ? 8 : 'R') == 'R' || cArr.length <= 0) {
            return false;
        }
        int i5 = getMin + 111;
        IsOverlapping = i5 % 128;
        if (i5 % 2 == 0) {
            i2 = cArr.length;
            i = 1;
        } else {
            i2 = cArr.length;
            i = 0;
        }
        while (true) {
            if (i >= i2) {
                return false;
            }
            int i6 = getMin + 85;
            IsOverlapping = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 34 / 0;
                if ((cArr[i] == 0 ? Typography.greater : '^') == '^') {
                    i++;
                    int i8 = getMin + 39;
                    IsOverlapping = i8 % 128;
                    int i9 = i8 % 2;
                }
            } else if (cArr[i] != 0) {
                i++;
                int i82 = getMin + 39;
                IsOverlapping = i82 % 128;
                int i92 = i82 % 2;
            }
            try {
                int i10 = getMin + 93;
                IsOverlapping = i10 % 128;
                int i11 = i10 % 2;
                int i12 = IsOverlapping + 17;
                try {
                    getMin = i12 % 128;
                    int i13 = i12 % 2;
                    return true;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        if ((r4 != null ? '2' : 'R') != '2') goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r4 != null) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void keyDatabase(net.sqlcipher.database.SQLiteDatabaseHook r4, java.lang.Runnable r5) {
        /*
            r3 = this;
            int r0 = getMin
            int r0 = r0 + 97
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0013
            r0 = 0
            int r0 = r0.length     // Catch:{ all -> 0x0011 }
            if (r4 == 0) goto L_0x002c
            goto L_0x001f
        L_0x0011:
            r4 = move-exception
            throw r4
        L_0x0013:
            r0 = 50
            if (r4 == 0) goto L_0x001a
            r1 = 50
            goto L_0x001c
        L_0x001a:
            r1 = 82
        L_0x001c:
            if (r1 == r0) goto L_0x001f
            goto L_0x002c
        L_0x001f:
            r4.preKey(r3)
            int r0 = getMin
            int r0 = r0 + 53
            int r1 = r0 % 128
            IsOverlapping = r1
            int r0 = r0 % 2
        L_0x002c:
            if (r5 == 0) goto L_0x0034
            r5.run()     // Catch:{ Exception -> 0x0032 }
            goto L_0x0034
        L_0x0032:
            r4 = move-exception
            throw r4
        L_0x0034:
            r5 = 1
            r0 = 0
            if (r4 == 0) goto L_0x003a
            r1 = 0
            goto L_0x003b
        L_0x003a:
            r1 = 1
        L_0x003b:
            if (r1 == r5) goto L_0x004a
            r4.postKey(r3)
            int r4 = IsOverlapping
            int r4 = r4 + 47
            int r1 = r4 % 128
            getMin = r1
            int r4 = r4 % 2
        L_0x004a:
            boolean r4 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE
            if (r4 == 0) goto L_0x0075
            int r4 = IsOverlapping
            int r4 = r4 + 23
            int r1 = r4 % 128
            getMin = r1
            int r4 = r4 % 2
            r1 = 20
            if (r4 == 0) goto L_0x005f
            r4 = 38
            goto L_0x0061
        L_0x005f:
            r4 = 20
        L_0x0061:
            if (r4 == r1) goto L_0x006f
            java.lang.String r4 = r3.getTime()
            r3.mTimeOpened = r4
            r4 = 88
            int r4 = r4 / r0
            goto L_0x0075
        L_0x006d:
            r4 = move-exception
            throw r4
        L_0x006f:
            java.lang.String r4 = r3.getTime()
            r3.mTimeOpened = r4
        L_0x0075:
            java.lang.String r4 = "select count(*) from sqlite_master;"
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ RuntimeException -> 0x00a0 }
            net.sqlcipher.Cursor r4 = r3.rawQuery((java.lang.String) r4, (java.lang.String[]) r1)     // Catch:{ RuntimeException -> 0x00a0 }
            if (r4 == 0) goto L_0x009f
            int r1 = IsOverlapping
            int r1 = r1 + 39
            int r2 = r1 % 128
            getMin = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L_0x008c
            r5 = 0
        L_0x008c:
            if (r5 == 0) goto L_0x0098
            r4.moveToFirst()     // Catch:{ RuntimeException -> 0x00a0 }
            r4.getInt(r0)     // Catch:{ RuntimeException -> 0x00a0 }
        L_0x0094:
            r4.close()     // Catch:{ RuntimeException -> 0x00a0 }
            goto L_0x009f
        L_0x0098:
            r4.moveToFirst()     // Catch:{ RuntimeException -> 0x00a0 }
            r4.getInt(r0)     // Catch:{ RuntimeException -> 0x00a0 }
            goto L_0x0094
        L_0x009f:
            return
        L_0x00a0:
            r4 = move-exception
            goto L_0x00a3
        L_0x00a2:
            throw r4
        L_0x00a3:
            goto L_0x00a2
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.keyDatabase(net.sqlcipher.database.SQLiteDatabaseHook, java.lang.Runnable):void");
    }

    private String getTime() {
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS ", Locale.US).format(Long.valueOf(System.currentTimeMillis()));
        int i = getMin + 59;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        return format;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (((r3.mFlags & 1) != 1) != true) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        r0 = getMin + 19;
        IsOverlapping = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (((r3.mFlags ^ 0) == 0) != true) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isReadOnly() {
        /*
            r3 = this;
            int r0 = IsOverlapping     // Catch:{ Exception -> 0x002f }
            int r0 = r0 + 105
            int r1 = r0 % 128
            getMin = r1     // Catch:{ Exception -> 0x002f }
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0019
            int r0 = r3.mFlags
            r0 = r0 ^ r1
            if (r0 != 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == r2) goto L_0x0023
            goto L_0x0024
        L_0x0019:
            int r0 = r3.mFlags
            r0 = r0 & r2
            if (r0 != r2) goto L_0x0020
            r0 = 0
            goto L_0x0021
        L_0x0020:
            r0 = 1
        L_0x0021:
            if (r0 == r2) goto L_0x0024
        L_0x0023:
            return r2
        L_0x0024:
            int r0 = getMin
            int r0 = r0 + 19
            int r2 = r0 % 128
            IsOverlapping = r2
            int r0 = r0 % 2
            return r1
        L_0x002f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.isReadOnly():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r7.mNativeHandle != 0) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0025, code lost:
        if ((r7.mNativeHandle == 0) != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0032, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isOpen() {
        /*
            r7 = this;
            int r0 = IsOverlapping     // Catch:{ Exception -> 0x0035 }
            int r0 = r0 + 7
            int r1 = r0 % 128
            getMin = r1     // Catch:{ Exception -> 0x0033 }
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r3 = 0
            if (r0 == r2) goto L_0x001c
            long r5 = r7.mNativeHandle
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0027
            goto L_0x0032
        L_0x001c:
            long r5 = r7.mNativeHandle     // Catch:{ Exception -> 0x0033 }
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0024
            r0 = 0
            goto L_0x0025
        L_0x0024:
            r0 = 1
        L_0x0025:
            if (r0 == 0) goto L_0x0032
        L_0x0027:
            int r0 = getMin
            int r0 = r0 + 37
            int r2 = r0 % 128
            IsOverlapping = r2
            int r0 = r0 % 2
            return r1
        L_0x0032:
            return r2
        L_0x0033:
            r0 = move-exception
            throw r0
        L_0x0035:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.isOpen():boolean");
    }

    public boolean needUpgrade(int i) {
        if ((i > getVersion() ? 22 : '5') == '5') {
            return false;
        }
        try {
            int i2 = getMin + 37;
            IsOverlapping = i2 % 128;
            boolean z = i2 % 2 != 0;
            int i3 = getMin + 25;
            IsOverlapping = i3 % 128;
            if ((i3 % 2 == 0 ? 'N' : '#') != 'N') {
                return z;
            }
            int i4 = 70 / 0;
            return z;
        } catch (Exception e) {
            throw e;
        }
    }

    public final String getPath() {
        String str;
        try {
            int i = getMin + 73;
            try {
                IsOverlapping = i % 128;
                Object obj = null;
                if ((i % 2 == 0 ? 30 : 'H') != 'H') {
                    str = this.mPath;
                    super.hashCode();
                } else {
                    str = this.mPath;
                }
                int i2 = IsOverlapping + 95;
                getMin = i2 % 128;
                if (!(i2 % 2 != 0)) {
                    return str;
                }
                super.hashCode();
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private String getPathForLogs() {
        int i = getMin + 13;
        IsOverlapping = i % 128;
        int i2 = i % 2;
        char c = 6;
        if ((this.mPathForLogs != null ? (char) 6 : 16) == 6) {
            return this.mPathForLogs;
        }
        if (this.mPath != null) {
            c = 11;
        }
        if (c != 11) {
            return null;
        }
        try {
            try {
                if (this.mPath.indexOf(64) != -1) {
                    this.mPathForLogs = EMAIL_IN_DB_PATTERN.matcher(this.mPath).replaceAll("XX@YY");
                } else {
                    int i3 = IsOverlapping + 117;
                    getMin = i3 % 128;
                    int i4 = i3 % 2;
                    this.mPathForLogs = this.mPath;
                }
                return this.mPathForLogs;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void setLocale(Locale locale) {
        try {
            int i = getMin + 51;
            IsOverlapping = i % 128;
            int i2 = i % 2;
            lock();
            try {
                native_setLocale(locale.toString(), this.mFlags);
                int i3 = IsOverlapping + 33;
                getMin = i3 % 128;
                if (!(i3 % 2 == 0)) {
                    Object obj = null;
                    super.hashCode();
                }
            } finally {
                unlock();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void addToCompiledQueries(java.lang.String r4, net.sqlcipher.database.SQLiteCompiledSql r5) {
        /*
            r3 = this;
            int r0 = r3.mMaxSqlCacheSize
            if (r0 != 0) goto L_0x0007
            boolean r4 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE
            return
        L_0x0007:
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r0 = r3.mCompiledQueries
            monitor-enter(r0)
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r1 = r3.mCompiledQueries     // Catch:{ all -> 0x0030 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0030 }
            net.sqlcipher.database.SQLiteCompiledSql r1 = (net.sqlcipher.database.SQLiteCompiledSql) r1     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0016:
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r1 = r3.mCompiledQueries     // Catch:{ all -> 0x0030 }
            int r1 = r1.size()     // Catch:{ all -> 0x0030 }
            int r2 = r3.mMaxSqlCacheSize     // Catch:{ all -> 0x0030 }
            if (r1 != r2) goto L_0x0027
            int r4 = r3.mCacheFullWarnings     // Catch:{ all -> 0x0030 }
            r5 = 1
            int r4 = r4 + r5
            r3.mCacheFullWarnings = r4     // Catch:{ all -> 0x0030 }
            goto L_0x002e
        L_0x0027:
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r1 = r3.mCompiledQueries     // Catch:{ all -> 0x0030 }
            r1.put(r4, r5)     // Catch:{ all -> 0x0030 }
            boolean r4 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.addToCompiledQueries(java.lang.String, net.sqlcipher.database.SQLiteCompiledSql):void");
    }

    private void deallocCachedSqlStatements() {
        synchronized (this.mCompiledQueries) {
            for (SQLiteCompiledSql releaseSqlStatement : this.mCompiledQueries.values()) {
                releaseSqlStatement.releaseSqlStatement();
            }
            this.mCompiledQueries.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        if (r2 == false) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        r3.mNumCacheHits++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        r3.mNumCacheMisses++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r0 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public net.sqlcipher.database.SQLiteCompiledSql getCompiledStatementForSql(java.lang.String r4) {
        /*
            r3 = this;
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r0 = r3.mCompiledQueries
            monitor-enter(r0)
            int r1 = r3.mMaxSqlCacheSize     // Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x000c
            boolean r4 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE     // Catch:{ all -> 0x002b }
            r4 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return r4
        L_0x000c:
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r1 = r3.mCompiledQueries     // Catch:{ all -> 0x002b }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x002b }
            net.sqlcipher.database.SQLiteCompiledSql r4 = (net.sqlcipher.database.SQLiteCompiledSql) r4     // Catch:{ all -> 0x002b }
            r1 = 1
            if (r4 == 0) goto L_0x0019
            r2 = 1
            goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            if (r2 == 0) goto L_0x0023
            int r0 = r3.mNumCacheHits
            int r0 = r0 + r1
            r3.mNumCacheHits = r0
            goto L_0x0028
        L_0x0023:
            int r0 = r3.mNumCacheMisses
            int r0 = r0 + r1
            r3.mNumCacheMisses = r0
        L_0x0028:
            boolean r0 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE
            return r4
        L_0x002b:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getCompiledStatementForSql(java.lang.String):net.sqlcipher.database.SQLiteCompiledSql");
    }

    public boolean isInCompiledSqlCache(String str) {
        boolean containsKey;
        synchronized (this.mCompiledQueries) {
            containsKey = this.mCompiledQueries.containsKey(str);
        }
        return containsKey;
    }

    public void purgeFromCompiledSqlCache(String str) {
        synchronized (this.mCompiledQueries) {
            this.mCompiledQueries.remove(str);
        }
    }

    public void resetCompiledSqlCache() {
        synchronized (this.mCompiledQueries) {
            this.mCompiledQueries.clear();
        }
    }

    public synchronized int getMaxSqlCacheSize() {
        int i;
        int i2 = IsOverlapping + 23;
        getMin = i2 % 128;
        if (i2 % 2 == 0) {
            i = this.mMaxSqlCacheSize;
        } else {
            i = this.mMaxSqlCacheSize;
            Object[] objArr = null;
            int length2 = objArr.length;
        }
        int i3 = getMin + 117;
        IsOverlapping = i3 % 128;
        int i4 = i3 % 2;
        return i;
    }

    public synchronized void setMaxSqlCacheSize(int i) {
        int i2 = getMin + 119;
        IsOverlapping = i2 % 128;
        int i3 = i2 % 2;
        if ((i <= 250 ? '(' : '\'') != '\'') {
            int i4 = getMin + 75;
            IsOverlapping = i4 % 128;
            int i5 = i4 % 2;
            if (i >= 0) {
                if (i >= this.mMaxSqlCacheSize) {
                    this.mMaxSqlCacheSize = i;
                } else {
                    throw new IllegalStateException("cannot set cacheSize to a value less than the value set with previous setMaxSqlCacheSize() call.");
                }
            }
        }
        throw new IllegalStateException("expected value between 0 and 250");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        if ((r4.length == 0 ? (char) 8 : 12) != 12) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        if (r4.length == 0) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] getBytes(char[] r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x0062
            int r1 = getMin
            int r1 = r1 + 117
            int r2 = r1 % 128
            IsOverlapping = r2
            int r1 = r1 % 2
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0013
            r1 = 0
            goto L_0x0014
        L_0x0013:
            r1 = 1
        L_0x0014:
            if (r1 == r3) goto L_0x0028
            int r1 = r4.length
            r3 = 48
            int r3 = r3 / r2
            r2 = 12
            if (r1 != 0) goto L_0x0021
            r1 = 8
            goto L_0x0023
        L_0x0021:
            r1 = 12
        L_0x0023:
            if (r1 == r2) goto L_0x002c
            goto L_0x0062
        L_0x0026:
            r4 = move-exception
            throw r4
        L_0x0028:
            int r1 = r4.length
            if (r1 != 0) goto L_0x002c
            goto L_0x0062
        L_0x002c:
            java.nio.CharBuffer r4 = java.nio.CharBuffer.wrap(r4)
            r1 = 5
            byte[] r1 = new byte[r1]
            r1 = {-123, -124, -125, -126, -127} // fill-array
            int r2 = android.view.ViewConfiguration.getMinimumFlingVelocity()
            int r2 = r2 >> 16
            int r2 = 127 - r2
            java.lang.String r0 = getMin(r1, r2, r0, r0)
            java.lang.String r0 = r0.intern()
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.nio.ByteBuffer r4 = r0.encode(r4)
            int r0 = r4.limit()
            byte[] r0 = new byte[r0]
            r4.get(r0)
            int r4 = getMin
            int r4 = r4 + 115
            int r1 = r4 % 128
            IsOverlapping = r1
            int r4 = r4 % 2
            return r0
        L_0x0062:
            int r4 = getMin
            int r4 = r4 + 3
            int r1 = r4 % 128
            IsOverlapping = r1
            int r4 = r4 % 2
            r1 = 7
            if (r4 != 0) goto L_0x0071
            r4 = 6
            goto L_0x0072
        L_0x0071:
            r4 = 7
        L_0x0072:
            if (r4 == r1) goto L_0x0078
            int r4 = r0.length     // Catch:{ all -> 0x0076 }
            return r0
        L_0x0076:
            r4 = move-exception
            throw r4
        L_0x0078:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getBytes(char[]):byte[]");
    }

    public static char[] getChars(byte[] bArr) {
        if ((bArr != null ? 'I' : '+') != '+') {
            int i = IsOverlapping + 107;
            getMin = i % 128;
            int i2 = i % 2;
            if (bArr.length != 0) {
                CharBuffer decode = Charset.forName(getMin(new byte[]{-123, -124, -125, -126, -127}, AndroidCharacter.getMirror('0') + 'O', (int[]) null, (char[]) null).intern()).decode(ByteBuffer.wrap(bArr));
                char[] cArr = new char[decode.limit()];
                decode.get(cArr);
                int i3 = IsOverlapping + 81;
                getMin = i3 % 128;
                if ((i3 % 2 != 0 ? '@' : 'A') == 'A') {
                    return cArr;
                }
                int i4 = 22 / 0;
                return cArr;
            }
        }
        return null;
    }

    public android.database.Cursor query(String str) {
        int i = getMin + 83;
        IsOverlapping = i % 128;
        boolean z = i % 2 != 0;
        String[] strArr = null;
        Cursor rawQuery = rawQuery(str, strArr);
        if (!z) {
            super.hashCode();
        }
        return rawQuery;
    }

    public android.database.Cursor query(String str, Object[] objArr) {
        Cursor cursor;
        try {
            int i = IsOverlapping + 99;
            try {
                getMin = i % 128;
                if (!(i % 2 == 0)) {
                    cursor = rawQuery(str, objArr);
                    Object obj = null;
                    super.hashCode();
                } else {
                    cursor = rawQuery(str, objArr);
                }
                int i2 = getMin + 107;
                IsOverlapping = i2 % 128;
                int i3 = i2 % 2;
                return cursor;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public android.database.Cursor query(SupportSQLiteQuery supportSQLiteQuery) {
        int i = getMin + 79;
        IsOverlapping = i % 128;
        char c = i % 2 == 0 ? '3' : 24;
        CancellationSignal cancellationSignal = null;
        android.database.Cursor query = query(supportSQLiteQuery, cancellationSignal);
        if (c == '3') {
            super.hashCode();
        }
        int i2 = getMin + 51;
        IsOverlapping = i2 % 128;
        int i3 = i2 % 2;
        return query;
    }

    public android.database.Cursor query(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
        String min = supportSQLiteQuery.setMin();
        String str = null;
        SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, min, str);
        boolean z = false;
        SQLiteQuery sQLiteQuery = new SQLiteQuery(this, min, 0, new Object[supportSQLiteQuery.setMax()]);
        supportSQLiteQuery.setMin(sQLiteQuery);
        CrossProcessCursorWrapper crossProcessCursorWrapper = new CrossProcessCursorWrapper(new SQLiteCursor(this, sQLiteDirectCursorDriver, str, sQLiteQuery));
        try {
            int i = getMin + 31;
            IsOverlapping = i % 128;
            if (i % 2 != 0) {
                z = true;
            }
            if (z) {
                return crossProcessCursorWrapper;
            }
            super.hashCode();
            return crossProcessCursorWrapper;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.String] */
    public long insert(String str, int i, ContentValues contentValues) throws android.database.SQLException {
        int i2 = IsOverlapping + 39;
        getMin = i2 % 128;
        ? r1 = 0;
        if (!(i2 % 2 != 0)) {
            return insertWithOnConflict(str, r1, contentValues, i);
        }
        try {
            long insertWithOnConflict = insertWithOnConflict(str, r1, contentValues, i);
            int length2 = r1.length;
            return insertWithOnConflict;
        } catch (Exception e) {
            throw e;
        }
    }

    public int update(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        int i2 = getMin + 109;
        IsOverlapping = i2 % 128;
        int i3 = i2 % 2;
        String[] strArr = new String[objArr.length];
        int i4 = IsOverlapping + 35;
        getMin = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        while (true) {
            if ((i6 < objArr.length ? 9 : 'A') == 'A') {
                return updateWithOnConflict(str, contentValues, str2, strArr, i);
            }
            int i7 = getMin + 61;
            IsOverlapping = i7 % 128;
            if (i7 % 2 == 0) {
                try {
                    strArr[i6] = objArr[i6].toString();
                    i6 += 91;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                try {
                    strArr[i6] = objArr[i6].toString();
                    i6++;
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
    }

    public void beginTransactionWithListener(final SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransactionWithListener((SQLiteTransactionListener) new SQLiteTransactionListener() {
            public void onBegin() {
                sQLiteTransactionListener.onBegin();
            }

            public void onCommit() {
                sQLiteTransactionListener.onCommit();
            }

            public void onRollback() {
                sQLiteTransactionListener.onRollback();
            }
        });
        try {
            int i = getMin + 103;
            IsOverlapping = i % 128;
            if (i % 2 == 0) {
                int i2 = 95 / 0;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void beginTransactionWithListenerNonExclusive(final SQLiteTransactionListener sQLiteTransactionListener) {
        beginTransactionWithListenerNonExclusive((SQLiteTransactionListener) new SQLiteTransactionListener() {
            public void onBegin() {
                sQLiteTransactionListener.onBegin();
            }

            public void onCommit() {
                sQLiteTransactionListener.onCommit();
            }

            public void onRollback() {
                sQLiteTransactionListener.onRollback();
            }
        });
        int i = getMin + 105;
        IsOverlapping = i % 128;
        if (!(i % 2 != 0)) {
            int i2 = 90 / 0;
        }
    }

    private void beginTransactionWithListenerInternal(SQLiteTransactionListener sQLiteTransactionListener, SQLiteDatabaseTransactionType sQLiteDatabaseTransactionType) {
        lockForced();
        try {
            if (isOpen()) {
                try {
                    boolean z = false;
                    if (this.mLock.getHoldCount() <= 1) {
                        if (sQLiteDatabaseTransactionType == SQLiteDatabaseTransactionType.Exclusive) {
                            execSQL("BEGIN EXCLUSIVE;");
                        } else if (sQLiteDatabaseTransactionType == SQLiteDatabaseTransactionType.Immediate) {
                            int i = IsOverlapping + 71;
                            getMin = i % 128;
                            int i2 = i % 2;
                            execSQL("BEGIN IMMEDIATE;");
                        } else if (sQLiteDatabaseTransactionType == SQLiteDatabaseTransactionType.Deferred) {
                            execSQL("BEGIN DEFERRED;");
                        } else {
                            throw new IllegalArgumentException(String.format("%s is an unsupported transaction type", new Object[]{sQLiteDatabaseTransactionType}));
                        }
                        this.mTransactionListener = sQLiteTransactionListener;
                        this.mTransactionIsSuccessful = true;
                        this.mInnerTransactionIsSuccessful = false;
                        if (!(sQLiteTransactionListener == null)) {
                            int i3 = IsOverlapping + 3;
                            getMin = i3 % 128;
                            if (i3 % 2 != 0) {
                                z = true;
                            }
                            if (!z) {
                                sQLiteTransactionListener.onBegin();
                                return;
                            }
                            sQLiteTransactionListener.onBegin();
                            Object[] objArr = null;
                            int length2 = objArr.length;
                        }
                    } else if (!this.mInnerTransactionIsSuccessful) {
                        int i4 = getMin + 89;
                        IsOverlapping = i4 % 128;
                        if ((i4 % 2 == 0 ? Typography.greater : 12) == '>') {
                            int i5 = 79 / 0;
                        }
                    } else {
                        throw new IllegalStateException("Cannot call beginTransaction between calling setTransactionSuccessful and endTransaction");
                    }
                } catch (RuntimeException e) {
                    execSQL("ROLLBACK;");
                    throw e;
                } catch (Throwable th) {
                    unlockForced();
                    throw th;
                }
            } else {
                throw new IllegalStateException("database not open");
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (r8 != -1) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        if (r8 != -1) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
        r8 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.ArrayList<net.sqlcipher.database.SQLiteDebug.DbStats> getDbStats() {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = getActiveDatabases()
            java.util.Iterator r1 = r1.iterator()
        L_0x000d:
            boolean r2 = r1.hasNext()
            r3 = 11
            if (r2 == 0) goto L_0x0018
            r2 = 11
            goto L_0x001a
        L_0x0018:
            r2 = 59
        L_0x001a:
            if (r2 == r3) goto L_0x001d
            return r0
        L_0x001d:
            java.lang.Object r2 = r1.next()
            net.sqlcipher.database.SQLiteDatabase r2 = (net.sqlcipher.database.SQLiteDatabase) r2
            if (r2 == 0) goto L_0x000d
            boolean r3 = r2.isOpen()
            r4 = 93
            if (r3 == 0) goto L_0x0030
            r3 = 93
            goto L_0x0032
        L_0x0030:
            r3 = 39
        L_0x0032:
            if (r3 == r4) goto L_0x0035
            goto L_0x000d
        L_0x0035:
            int r3 = getMin     // Catch:{ Exception -> 0x0131 }
            int r3 = r3 + 57
            int r4 = r3 % 128
            IsOverlapping = r4     // Catch:{ Exception -> 0x0131 }
            int r3 = r3 % 2
            r4 = -1
            java.lang.String r5 = "/"
            r6 = 0
            if (r3 != 0) goto L_0x005b
            int r3 = r2.native_getDbLookaside()
            java.lang.String r7 = r2.getPath()
            int r8 = r7.lastIndexOf(r5)
            r9 = 0
            super.hashCode()     // Catch:{ all -> 0x0058 }
            if (r8 == r4) goto L_0x006c
            goto L_0x0069
        L_0x0058:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x005b:
            int r3 = r2.native_getDbLookaside()
            java.lang.String r7 = r2.getPath()
            int r8 = r7.lastIndexOf(r5)
            if (r8 == r4) goto L_0x006c
        L_0x0069:
            int r8 = r8 + 1
            goto L_0x006d
        L_0x006c:
            r8 = 0
        L_0x006d:
            java.lang.String r7 = r7.substring(r8)
            java.util.ArrayList r8 = getAttachedDbs(r2)
            if (r8 == 0) goto L_0x000d
            r9 = 0
        L_0x0078:
            int r10 = r8.size()
            if (r9 >= r10) goto L_0x000d
            java.lang.Object r10 = r8.get(r9)
            android.util.Pair r10 = (android.util.Pair) r10
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.Object r12 = r10.first
            java.lang.String r12 = (java.lang.String) r12
            r11.append(r12)
            java.lang.String r12 = ".page_count;"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            long r14 = getPragmaVal(r2, r11)
            r11 = 14
            if (r9 != 0) goto L_0x00a4
            r12 = 14
            goto L_0x00a6
        L_0x00a4:
            r12 = 73
        L_0x00a6:
            if (r12 == r11) goto L_0x0104
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r11 = "  (attached) "
            r3.<init>(r11)
            java.lang.Object r11 = r10.first
            java.lang.String r11 = (java.lang.String) r11
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            java.lang.Object r11 = r10.second
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r11 = r11.trim()
            int r11 = r11.length()
            if (r11 <= 0) goto L_0x0101
            java.lang.Object r11 = r10.second
            java.lang.String r11 = (java.lang.String) r11
            int r11 = r11.lastIndexOf(r5)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r3)
            java.lang.String r3 = " : "
            r12.append(r3)
            java.lang.Object r3 = r10.second
            java.lang.String r3 = (java.lang.String) r3
            if (r11 == r4) goto L_0x00f5
            int r10 = getMin
            int r10 = r10 + 101
            int r13 = r10 % 128
            IsOverlapping = r13
            int r10 = r10 % 2
            if (r10 != 0) goto L_0x00f2
            int r11 = r11 + 8
            goto L_0x00f6
        L_0x00f2:
            int r11 = r11 + 1
            goto L_0x00f6
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            java.lang.String r3 = r3.substring(r11)
            r12.append(r3)
            java.lang.String r3 = r12.toString()
        L_0x0101:
            r13 = r3
            r3 = 0
            goto L_0x0118
        L_0x0104:
            int r10 = getMin
            int r10 = r10 + 111
            int r11 = r10 % 128
            IsOverlapping = r11
            int r10 = r10 % 2
            if (r10 != 0) goto L_0x0117
            r10 = 29
            int r10 = r10 / r6
            goto L_0x0117
        L_0x0114:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0117:
            r13 = r7
        L_0x0118:
            r10 = 0
            int r12 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x012d
            net.sqlcipher.database.SQLiteDebug$DbStats r10 = new net.sqlcipher.database.SQLiteDebug$DbStats
            long r16 = r2.getPageSize()
            r12 = r10
            r18 = r3
            r12.<init>(r13, r14, r16, r18)
            r0.add(r10)
        L_0x012d:
            int r9 = r9 + 1
            goto L_0x0078
        L_0x0131:
            r0 = move-exception
            goto L_0x0134
        L_0x0133:
            throw r0
        L_0x0134:
            goto L_0x0133
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getDbStats():java.util.ArrayList");
    }

    private static ArrayList<SQLiteDatabase> getActiveDatabases() {
        ArrayList<SQLiteDatabase> arrayList = new ArrayList<>();
        synchronized (sActiveDatabases) {
            arrayList.addAll(sActiveDatabases.keySet());
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038 A[SYNTHETIC, Splitter:B:21:0x0038] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long getPragmaVal(net.sqlcipher.database.SQLiteDatabase r3, java.lang.String r4) {
        /*
            boolean r0 = r3.isOpen()
            if (r0 != 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            if (r0 == 0) goto L_0x001a
            int r3 = getMin     // Catch:{ Exception -> 0x0018 }
            int r3 = r3 + 27
            int r4 = r3 % 128
            IsOverlapping = r4     // Catch:{ Exception -> 0x0018 }
            int r3 = r3 % 2
            r3 = 0
            return r3
        L_0x0018:
            r3 = move-exception
            throw r3
        L_0x001a:
            r0 = 0
            net.sqlcipher.database.SQLiteStatement r1 = new net.sqlcipher.database.SQLiteStatement     // Catch:{ all -> 0x0035 }
            java.lang.String r2 = "PRAGMA "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0035 }
            java.lang.String r4 = r2.concat(r4)     // Catch:{ all -> 0x0035 }
            r1.<init>(r3, r4)     // Catch:{ all -> 0x0035 }
            long r3 = r1.simpleQueryForLong()     // Catch:{ all -> 0x0032 }
            r1.close()
            return r3
        L_0x0032:
            r3 = move-exception
            r0 = r1
            goto L_0x0036
        L_0x0035:
            r3 = move-exception
        L_0x0036:
            if (r0 == 0) goto L_0x0048
            r0.close()     // Catch:{ Exception -> 0x0046 }
            int r4 = IsOverlapping
            int r4 = r4 + 75
            int r0 = r4 % 128
            getMin = r0
            int r4 = r4 % 2
            goto L_0x0048
        L_0x0046:
            r3 = move-exception
            throw r3
        L_0x0048:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: net.sqlcipher.database.SQLiteDatabase.getPragmaVal(net.sqlcipher.database.SQLiteDatabase, java.lang.String):long");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>>, java.lang.String[]] */
    private static ArrayList<Pair<String, String>> getAttachedDbs(SQLiteDatabase sQLiteDatabase) {
        ? r2 = 0;
        if ((!sQLiteDatabase.isOpen() ? Typography.dollar : 'F') != '$') {
            ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
            try {
                Cursor rawQuery = sQLiteDatabase.rawQuery("pragma database_list;", (String[]) r2);
                while (rawQuery.moveToNext()) {
                    arrayList.add(new Pair(rawQuery.getString(1), rawQuery.getString(2)));
                }
                rawQuery.close();
                int i = getMin + 47;
                IsOverlapping = i % 128;
                if (i % 2 != 0) {
                    return arrayList;
                }
                int i2 = 64 / 0;
                return arrayList;
            } catch (Exception e) {
                throw e;
            }
        } else {
            int i3 = getMin + 57;
            IsOverlapping = i3 % 128;
            if ((i3 % 2 == 0 ? JSONLexer.EOI : 19) != 19) {
                int length2 = r2.length;
            }
            return r2;
        }
    }

    private Pair<Boolean, String> getResultFromPragma(String str) {
        int i;
        if ((str != null ? 'C' : 'N') != 'N') {
            int i2 = getMin + 89;
            IsOverlapping = i2 % 128;
            if (!(i2 % 2 != 0)) {
                i = str.length();
                Object[] objArr = null;
                int length2 = objArr.length;
            } else {
                i = str.length();
            }
        } else {
            i = 0;
        }
        try {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-1876586770, oncanceled);
                onCancelLoad.getMin(-1876586770, oncanceled);
            }
            Cursor rawQuery = rawQuery(str, new Object[0]);
            if (rawQuery == null) {
                Pair<Boolean, String> pair = new Pair<>(Boolean.FALSE, "");
                int i3 = getMin + 101;
                IsOverlapping = i3 % 128;
                int i4 = i3 % 2;
                return pair;
            }
            rawQuery.moveToFirst();
            String string = rawQuery.getString(0);
            rawQuery.close();
            return new Pair<>(Boolean.TRUE, string);
        } catch (Exception e) {
            throw e;
        }
    }

    private static String getMin(byte[] bArr, int i, int[] iArr, char[] cArr) {
        char[] cArr2 = setMax;
        int i2 = getMax;
        int i3 = 0;
        if ((length ? '@' : 14) == '@') {
            int i4 = getMin + 97;
            IsOverlapping = i4 % 128;
            int i5 = i4 % 2;
            int length2 = bArr.length;
            char[] cArr3 = new char[length2];
            int i6 = 0;
            while (true) {
                if (!(i6 < length2)) {
                    return new String(cArr3);
                }
                int i7 = IsOverlapping + 47;
                getMin = i7 % 128;
                if (i7 % 2 != 0) {
                    cArr3[i6] = (char) (cArr2[bArr[(length2 >>> 1) * i6] / i] + i2);
                } else {
                    cArr3[i6] = (char) (cArr2[bArr[(length2 - 1) - i6] + i] - i2);
                }
                i6++;
            }
        } else if (setMin) {
            int length3 = cArr.length;
            char[] cArr4 = new char[length3];
            int i8 = IsOverlapping + 45;
            getMin = i8 % 128;
            int i9 = i8 % 2;
            while (true) {
                if ((i3 < length3 ? '(' : 20) != '(') {
                    return new String(cArr4);
                }
                int i10 = getMin + 123;
                IsOverlapping = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr4[i3] = (char) (cArr2[cArr[(length3 >> 0) >>> i3] + i] << i2);
                    i3 += 33;
                } else {
                    cArr4[i3] = (char) (cArr2[cArr[(length3 - 1) - i3] - i] - i2);
                    i3++;
                }
            }
        } else {
            int length4 = iArr.length;
            char[] cArr5 = new char[length4];
            while (i3 < length4) {
                cArr5[i3] = (char) (cArr2[iArr[(length4 - 1) - i3] - i] - i2);
                i3++;
                int i11 = getMin + 15;
                IsOverlapping = i11 % 128;
                int i12 = i11 % 2;
            }
            return new String(cArr5);
        }
    }
}
