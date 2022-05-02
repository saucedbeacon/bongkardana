package o;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;

final class setActionBarVisibilityCallback implements SupportSQLiteOpenHelper {
    private final SupportSQLiteOpenHelper.setMax getMax;
    private final Context getMin;
    private boolean isInside;
    private final Object length = new Object();
    private final boolean setMax;
    private final String setMin;
    private setMin toIntRange;

    setActionBarVisibilityCallback(Context context, String str, SupportSQLiteOpenHelper.setMax setmax, boolean z) {
        this.getMin = context;
        this.setMin = str;
        this.getMax = setmax;
        this.setMax = z;
    }

    private setMin getMin() {
        setMin setmin;
        synchronized (this.length) {
            if (this.toIntRange == null) {
                shouldDelayChildPressedState[] shoulddelaychildpressedstateArr = new shouldDelayChildPressedState[1];
                if (Build.VERSION.SDK_INT < 23 || this.setMin == null || !this.setMax) {
                    this.toIntRange = new setMin(this.getMin, this.setMin, shoulddelaychildpressedstateArr, this.getMax);
                } else {
                    this.toIntRange = new setMin(this.getMin, new File(this.getMin.getNoBackupFilesDir(), this.setMin).getAbsolutePath(), shoulddelaychildpressedstateArr, this.getMax);
                }
                if (Build.VERSION.SDK_INT >= 16) {
                    this.toIntRange.setWriteAheadLoggingEnabled(this.isInside);
                }
            }
            setmin = this.toIntRange;
        }
        return setmin;
    }

    public final String getDatabaseName() {
        return this.setMin;
    }

    @RequiresApi(api = 16)
    public final void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.length) {
            if (this.toIntRange != null) {
                this.toIntRange.setWriteAheadLoggingEnabled(z);
            }
            this.isInside = z;
        }
    }

    public final SupportSQLiteDatabase getWritableDatabase() {
        return getMin().setMin();
    }

    public final SupportSQLiteDatabase getReadableDatabase() {
        return getMin().length();
    }

    public final void close() {
        getMin().close();
    }

    static class setMin extends SQLiteOpenHelper {
        final shouldDelayChildPressedState[] getMax;
        private boolean length;
        final SupportSQLiteOpenHelper.setMax setMax;

        setMin(Context context, String str, final shouldDelayChildPressedState[] shoulddelaychildpressedstateArr, final SupportSQLiteOpenHelper.setMax setmax) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, setmax.setMax, new DatabaseErrorHandler() {
                /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
                    r1 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
                    if (r0 != null) goto L_0x0035;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
                    r4 = r0.iterator();
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
                    if (r4.hasNext() != false) goto L_0x003f;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
                    androidx.sqlite.db.SupportSQLiteOpenHelper.setMax.setMin((java.lang.String) r4.next().second);
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
                    androidx.sqlite.db.SupportSQLiteOpenHelper.setMax.setMin(r4.getPath());
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
                    throw r1;
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x002f */
                /* JADX WARNING: Removed duplicated region for block: B:12:0x002d A[ExcHandler: all (r1v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
                  PHI: (r0v9 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v2 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:10:0x0028, B:13:0x002f, B:14:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:10:0x0028] */
                /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
                /* JADX WARNING: Removed duplicated region for block: B:29:0x0071  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onCorruption(android.database.sqlite.SQLiteDatabase r4) {
                    /*
                        r3 = this;
                        o.shouldDelayChildPressedState[] r0 = r9
                        r1 = 0
                        r2 = r0[r1]
                        if (r2 == 0) goto L_0x000d
                        boolean r2 = r2.setMin(r4)
                        if (r2 != 0) goto L_0x0014
                    L_0x000d:
                        o.shouldDelayChildPressedState r2 = new o.shouldDelayChildPressedState
                        r2.<init>(r4)
                        r0[r1] = r2
                    L_0x0014:
                        r4 = r0[r1]
                        r4.getPath()
                        boolean r0 = r4.isOpen()
                        if (r0 != 0) goto L_0x0027
                        java.lang.String r4 = r4.getPath()
                        androidx.sqlite.db.SupportSQLiteOpenHelper.setMax.setMin(r4)
                        return
                    L_0x0027:
                        r0 = 0
                        java.util.List r0 = r4.getAttachedDbs()     // Catch:{ SQLiteException -> 0x002f, all -> 0x002d }
                        goto L_0x002f
                    L_0x002d:
                        r1 = move-exception
                        goto L_0x0033
                    L_0x002f:
                        r4.close()     // Catch:{ IOException -> 0x0055, all -> 0x002d }
                        goto L_0x0056
                    L_0x0033:
                        if (r0 == 0) goto L_0x004d
                        java.util.Iterator r4 = r0.iterator()
                    L_0x0039:
                        boolean r0 = r4.hasNext()
                        if (r0 == 0) goto L_0x0054
                        java.lang.Object r0 = r4.next()
                        android.util.Pair r0 = (android.util.Pair) r0
                        java.lang.Object r0 = r0.second
                        java.lang.String r0 = (java.lang.String) r0
                        androidx.sqlite.db.SupportSQLiteOpenHelper.setMax.setMin(r0)
                        goto L_0x0039
                    L_0x004d:
                        java.lang.String r4 = r4.getPath()
                        androidx.sqlite.db.SupportSQLiteOpenHelper.setMax.setMin(r4)
                    L_0x0054:
                        throw r1
                    L_0x0055:
                    L_0x0056:
                        if (r0 == 0) goto L_0x0071
                        java.util.Iterator r4 = r0.iterator()
                    L_0x005c:
                        boolean r0 = r4.hasNext()
                        if (r0 == 0) goto L_0x0070
                        java.lang.Object r0 = r4.next()
                        android.util.Pair r0 = (android.util.Pair) r0
                        java.lang.Object r0 = r0.second
                        java.lang.String r0 = (java.lang.String) r0
                        androidx.sqlite.db.SupportSQLiteOpenHelper.setMax.setMin(r0)
                        goto L_0x005c
                    L_0x0070:
                        return
                    L_0x0071:
                        java.lang.String r4 = r4.getPath()
                        androidx.sqlite.db.SupportSQLiteOpenHelper.setMax.setMin(r4)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.setActionBarVisibilityCallback.setMin.AnonymousClass3.onCorruption(android.database.sqlite.SQLiteDatabase):void");
                }
            });
            this.setMax = setmax;
            this.getMax = shoulddelaychildpressedstateArr;
        }

        /* access modifiers changed from: package-private */
        public final synchronized SupportSQLiteDatabase setMin() {
            this.length = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.length) {
                close();
                return setMin();
            }
            shouldDelayChildPressedState[] shoulddelaychildpressedstateArr = this.getMax;
            shouldDelayChildPressedState shoulddelaychildpressedstate = shoulddelaychildpressedstateArr[0];
            if (shoulddelaychildpressedstate == null || !shoulddelaychildpressedstate.setMin(writableDatabase)) {
                shoulddelaychildpressedstateArr[0] = new shouldDelayChildPressedState(writableDatabase);
            }
            return shoulddelaychildpressedstateArr[0];
        }

        /* access modifiers changed from: package-private */
        public final synchronized SupportSQLiteDatabase length() {
            this.length = false;
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            if (this.length) {
                close();
                return length();
            }
            shouldDelayChildPressedState[] shoulddelaychildpressedstateArr = this.getMax;
            shouldDelayChildPressedState shoulddelaychildpressedstate = shoulddelaychildpressedstateArr[0];
            if (shoulddelaychildpressedstate == null || !shoulddelaychildpressedstate.setMin(readableDatabase)) {
                shoulddelaychildpressedstateArr[0] = new shouldDelayChildPressedState(readableDatabase);
            }
            return shoulddelaychildpressedstateArr[0];
        }

        private shouldDelayChildPressedState setMax(SQLiteDatabase sQLiteDatabase) {
            shouldDelayChildPressedState[] shoulddelaychildpressedstateArr = this.getMax;
            shouldDelayChildPressedState shoulddelaychildpressedstate = shoulddelaychildpressedstateArr[0];
            if (shoulddelaychildpressedstate == null || !shoulddelaychildpressedstate.setMin(sQLiteDatabase)) {
                shoulddelaychildpressedstateArr[0] = new shouldDelayChildPressedState(sQLiteDatabase);
            }
            return shoulddelaychildpressedstateArr[0];
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.setMax.length(setMax(sQLiteDatabase));
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.length = true;
            this.setMax.getMax(setMax(sQLiteDatabase), i, i2);
        }

        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            setMax(sQLiteDatabase);
        }

        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.length = true;
            this.setMax.getMin(setMax(sQLiteDatabase), i, i2);
        }

        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.length) {
                this.setMax.getMax(setMax(sQLiteDatabase));
            }
        }

        public final synchronized void close() {
            super.close();
            this.getMax[0] = null;
        }
    }
}
