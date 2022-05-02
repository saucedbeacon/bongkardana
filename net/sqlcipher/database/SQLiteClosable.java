package net.sqlcipher.database;

public abstract class SQLiteClosable {
    private Object mLock = new Object();
    private int mReferenceCount = 1;

    /* access modifiers changed from: protected */
    public abstract void onAllReferencesReleased();

    /* access modifiers changed from: protected */
    public void onAllReferencesReleasedFromContainer() {
    }

    public void acquireReference() {
        synchronized (this.mLock) {
            if (this.mReferenceCount > 0) {
                this.mReferenceCount++;
            } else {
                StringBuilder sb = new StringBuilder("attempt to re-open an already-closed object: ");
                sb.append(getObjInfo());
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    public void releaseReference() {
        synchronized (this.mLock) {
            int i = this.mReferenceCount - 1;
            this.mReferenceCount = i;
            if (i == 0) {
                onAllReferencesReleased();
            }
        }
    }

    public void releaseReferenceFromContainer() {
        synchronized (this.mLock) {
            int i = this.mReferenceCount - 1;
            this.mReferenceCount = i;
            if (i == 0) {
                onAllReferencesReleasedFromContainer();
            }
        }
    }

    private String getObjInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(" (");
        if (this instanceof SQLiteDatabase) {
            sb.append("database = ");
            sb.append(((SQLiteDatabase) this).getPath());
        } else if ((this instanceof SQLiteProgram) || (this instanceof SQLiteStatement) || (this instanceof SQLiteQuery)) {
            sb.append("mSql = ");
            sb.append(((SQLiteProgram) this).mSql);
        }
        sb.append(") ");
        return sb.toString();
    }
}
