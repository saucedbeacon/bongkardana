package net.sqlcipher.database;

import com.google.firebase.perf.FirebasePerformance;
import o.isTitleOptional;

public abstract class SQLiteProgram extends SQLiteClosable implements isTitleOptional {
    private static final String TAG = "SQLiteProgram";
    boolean mClosed = false;
    private SQLiteCompiledSql mCompiledSql;
    @Deprecated
    protected SQLiteDatabase mDatabase;
    final String mSql;
    @Deprecated
    protected long nHandle = 0;
    @Deprecated
    protected long nStatement = 0;

    private final native void native_clear_bindings();

    /* access modifiers changed from: protected */
    @Deprecated
    public void compile(String str, boolean z) {
    }

    /* access modifiers changed from: protected */
    public final native void native_bind_blob(int i, byte[] bArr);

    /* access modifiers changed from: protected */
    public final native void native_bind_double(int i, double d);

    /* access modifiers changed from: protected */
    public final native void native_bind_long(int i, long j);

    /* access modifiers changed from: protected */
    public final native void native_bind_null(int i);

    /* access modifiers changed from: protected */
    public final native void native_bind_string(int i, String str);

    /* access modifiers changed from: protected */
    @Deprecated
    public final native void native_compile(String str);

    /* access modifiers changed from: protected */
    @Deprecated
    public final native void native_finalize();

    SQLiteProgram(SQLiteDatabase sQLiteDatabase, String str) {
        this.mDatabase = sQLiteDatabase;
        this.mSql = str.trim();
        sQLiteDatabase.acquireReference();
        sQLiteDatabase.addSQLiteClosable(this);
        this.nHandle = sQLiteDatabase.mNativeHandle;
        String substring = this.mSql.length() >= 6 ? this.mSql.substring(0, 6) : this.mSql;
        if (substring.equalsIgnoreCase("INSERT") || substring.equalsIgnoreCase("UPDATE") || substring.equalsIgnoreCase("REPLAC") || substring.equalsIgnoreCase(FirebasePerformance.HttpMethod.DELETE) || substring.equalsIgnoreCase("SELECT")) {
            SQLiteCompiledSql compiledStatementForSql = sQLiteDatabase.getCompiledStatementForSql(str);
            this.mCompiledSql = compiledStatementForSql;
            if (compiledStatementForSql == null) {
                SQLiteCompiledSql sQLiteCompiledSql = new SQLiteCompiledSql(sQLiteDatabase, str);
                this.mCompiledSql = sQLiteCompiledSql;
                sQLiteCompiledSql.acquire();
                sQLiteDatabase.addToCompiledQueries(str, this.mCompiledSql);
                boolean z = SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION;
            } else if (!compiledStatementForSql.acquire()) {
                this.mCompiledSql = new SQLiteCompiledSql(sQLiteDatabase, str);
                boolean z2 = SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION;
            }
            this.nStatement = this.mCompiledSql.nStatement;
            return;
        }
        SQLiteCompiledSql sQLiteCompiledSql2 = new SQLiteCompiledSql(sQLiteDatabase, str);
        this.mCompiledSql = sQLiteCompiledSql2;
        this.nStatement = sQLiteCompiledSql2.nStatement;
    }

    /* access modifiers changed from: protected */
    public void onAllReferencesReleased() {
        releaseCompiledSqlIfNotInCache();
        this.mDatabase.releaseReference();
        this.mDatabase.removeSQLiteClosable(this);
    }

    /* access modifiers changed from: protected */
    public void onAllReferencesReleasedFromContainer() {
        releaseCompiledSqlIfNotInCache();
        this.mDatabase.releaseReference();
    }

    private void releaseCompiledSqlIfNotInCache() {
        if (this.mCompiledSql != null) {
            synchronized (this.mDatabase.mCompiledQueries) {
                if (!this.mDatabase.mCompiledQueries.containsValue(this.mCompiledSql)) {
                    this.mCompiledSql.releaseSqlStatement();
                    this.mCompiledSql = null;
                    this.nStatement = 0;
                } else {
                    this.mCompiledSql.release();
                }
            }
        }
    }

    public final long getUniqueId() {
        return this.nStatement;
    }

    /* access modifiers changed from: package-private */
    public String getSqlString() {
        return this.mSql;
    }

    public void bindNull(int i) {
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_bind_null(i);
            } finally {
                releaseReference();
            }
        } else {
            StringBuilder sb = new StringBuilder("database ");
            sb.append(this.mDatabase.getPath());
            sb.append(" already closed");
            throw new IllegalStateException(sb.toString());
        }
    }

    public void bindLong(int i, long j) {
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_bind_long(i, j);
            } finally {
                releaseReference();
            }
        } else {
            StringBuilder sb = new StringBuilder("database ");
            sb.append(this.mDatabase.getPath());
            sb.append(" already closed");
            throw new IllegalStateException(sb.toString());
        }
    }

    public void bindDouble(int i, double d) {
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_bind_double(i, d);
            } finally {
                releaseReference();
            }
        } else {
            StringBuilder sb = new StringBuilder("database ");
            sb.append(this.mDatabase.getPath());
            sb.append(" already closed");
            throw new IllegalStateException(sb.toString());
        }
    }

    public void bindString(int i, String str) {
        if (str == null) {
            StringBuilder sb = new StringBuilder("the bind value at index ");
            sb.append(i);
            sb.append(" is null");
            throw new IllegalArgumentException(sb.toString());
        } else if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_bind_string(i, str);
            } finally {
                releaseReference();
            }
        } else {
            StringBuilder sb2 = new StringBuilder("database ");
            sb2.append(this.mDatabase.getPath());
            sb2.append(" already closed");
            throw new IllegalStateException(sb2.toString());
        }
    }

    public void bindBlob(int i, byte[] bArr) {
        if (bArr == null) {
            StringBuilder sb = new StringBuilder("the bind value at index ");
            sb.append(i);
            sb.append(" is null");
            throw new IllegalArgumentException(sb.toString());
        } else if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_bind_blob(i, bArr);
            } finally {
                releaseReference();
            }
        } else {
            StringBuilder sb2 = new StringBuilder("database ");
            sb2.append(this.mDatabase.getPath());
            sb2.append(" already closed");
            throw new IllegalStateException(sb2.toString());
        }
    }

    public void clearBindings() {
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_clear_bindings();
            } finally {
                releaseReference();
            }
        } else {
            StringBuilder sb = new StringBuilder("database ");
            sb.append(this.mDatabase.getPath());
            sb.append(" already closed");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() {
        if (!this.mClosed && this.mDatabase.isOpen()) {
            this.mDatabase.lock();
            try {
                releaseReference();
                this.mDatabase.unlock();
                this.mClosed = true;
            } catch (Throwable th) {
                this.mDatabase.unlock();
                throw th;
            }
        }
    }
}
