package net.sqlcipher.database;

class SQLiteCompiledSql {
    private static final String TAG = "SQLiteCompiledSql";
    SQLiteDatabase mDatabase;
    private boolean mInUse = false;
    private String mSqlStmt = null;
    long nHandle = 0;
    long nStatement = 0;

    private final native void native_compile(String str);

    private final native void native_finalize();

    SQLiteCompiledSql(SQLiteDatabase sQLiteDatabase, String str) {
        if (sQLiteDatabase.isOpen()) {
            this.mDatabase = sQLiteDatabase;
            this.mSqlStmt = str;
            this.nHandle = sQLiteDatabase.mNativeHandle;
            compile(str, true);
            return;
        }
        StringBuilder sb = new StringBuilder("database ");
        sb.append(sQLiteDatabase.getPath());
        sb.append(" already closed");
        throw new IllegalStateException(sb.toString());
    }

    private void compile(String str, boolean z) {
        if (!this.mDatabase.isOpen()) {
            StringBuilder sb = new StringBuilder("database ");
            sb.append(this.mDatabase.getPath());
            sb.append(" already closed");
            throw new IllegalStateException(sb.toString());
        } else if (z) {
            this.mDatabase.lock();
            try {
                native_compile(str);
            } finally {
                this.mDatabase.unlock();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void releaseSqlStatement() {
        if (this.nStatement != 0) {
            boolean z = SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION;
            try {
                this.mDatabase.lock();
                native_finalize();
                this.nStatement = 0;
            } finally {
                this.mDatabase.unlock();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized boolean acquire() {
        if (this.mInUse) {
            return false;
        }
        this.mInUse = true;
        boolean z = SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION;
        return true;
    }

    /* access modifiers changed from: package-private */
    public synchronized void release() {
        boolean z = SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION;
        this.mInUse = false;
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            if (this.nStatement != 0) {
                boolean z = SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION;
                releaseSqlStatement();
                super.finalize();
            }
        } finally {
            super.finalize();
        }
    }
}
