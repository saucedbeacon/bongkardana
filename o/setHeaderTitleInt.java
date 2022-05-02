package o;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class setHeaderTitleInt {
    @NonNull
    final Runnable IsOverlapping = new Runnable() {
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                o.setHeaderTitleInt r0 = o.setHeaderTitleInt.this
                java.lang.Object r0 = r0.setMax
                monitor-enter(r0)
                long r1 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0056 }
                o.setHeaderTitleInt r3 = o.setHeaderTitleInt.this     // Catch:{ all -> 0x0056 }
                long r3 = r3.isInside     // Catch:{ all -> 0x0056 }
                long r1 = r1 - r3
                o.setHeaderTitleInt r3 = o.setHeaderTitleInt.this     // Catch:{ all -> 0x0056 }
                long r3 = r3.length     // Catch:{ all -> 0x0056 }
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 >= 0) goto L_0x0018
                monitor-exit(r0)     // Catch:{ all -> 0x0056 }
                return
            L_0x0018:
                o.setHeaderTitleInt r1 = o.setHeaderTitleInt.this     // Catch:{ all -> 0x0056 }
                int r1 = r1.toIntRange     // Catch:{ all -> 0x0056 }
                if (r1 == 0) goto L_0x0020
                monitor-exit(r0)     // Catch:{ all -> 0x0056 }
                return
            L_0x0020:
                o.setHeaderTitleInt r1 = o.setHeaderTitleInt.this     // Catch:{ all -> 0x0056 }
                java.lang.Runnable r1 = r1.getMax     // Catch:{ all -> 0x0056 }
                if (r1 == 0) goto L_0x004e
                o.setHeaderTitleInt r1 = o.setHeaderTitleInt.this     // Catch:{ all -> 0x0056 }
                java.lang.Runnable r1 = r1.getMax     // Catch:{ all -> 0x0056 }
                r1.run()     // Catch:{ all -> 0x0056 }
                o.setHeaderTitleInt r1 = o.setHeaderTitleInt.this     // Catch:{ all -> 0x0056 }
                androidx.sqlite.db.SupportSQLiteDatabase r1 = r1.toFloatRange     // Catch:{ all -> 0x0056 }
                if (r1 == 0) goto L_0x004c
                o.setHeaderTitleInt r1 = o.setHeaderTitleInt.this     // Catch:{ all -> 0x0056 }
                androidx.sqlite.db.SupportSQLiteDatabase r1 = r1.toFloatRange     // Catch:{ all -> 0x0056 }
                boolean r1 = r1.isOpen()     // Catch:{ all -> 0x0056 }
                if (r1 == 0) goto L_0x004c
                o.setHeaderTitleInt r1 = o.setHeaderTitleInt.this     // Catch:{ IOException -> 0x004a }
                androidx.sqlite.db.SupportSQLiteDatabase r1 = r1.toFloatRange     // Catch:{ IOException -> 0x004a }
                r1.close()     // Catch:{ IOException -> 0x004a }
                o.setHeaderTitleInt r1 = o.setHeaderTitleInt.this     // Catch:{ all -> 0x0056 }
                r2 = 0
                r1.toFloatRange = r2     // Catch:{ all -> 0x0056 }
                goto L_0x004c
            L_0x004a:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0056 }
            L_0x004c:
                monitor-exit(r0)     // Catch:{ all -> 0x0056 }
                return
            L_0x004e:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0056 }
                java.lang.String r2 = "mOnAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568"
                r1.<init>(r2)     // Catch:{ all -> 0x0056 }
                throw r1     // Catch:{ all -> 0x0056 }
            L_0x0056:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setHeaderTitleInt.AnonymousClass2.run():void");
        }
    };
    boolean equals = false;
    @Nullable
    public Runnable getMax = null;
    @Nullable
    SupportSQLiteOpenHelper getMin = null;
    private final Runnable hashCode = new Runnable() {
        public final void run() {
            setHeaderTitleInt.this.setMin.execute(setHeaderTitleInt.this.IsOverlapping);
        }
    };
    @GuardedBy("mLock")
    long isInside = SystemClock.uptimeMillis();
    final long length;
    @NonNull
    final Object setMax = new Object();
    @NonNull
    final Executor setMin;
    @GuardedBy("mLock")
    @Nullable
    SupportSQLiteDatabase toFloatRange;
    @GuardedBy("mLock")
    int toIntRange = 0;
    @NonNull
    private final Handler values = new Handler(Looper.getMainLooper());

    public setHeaderTitleInt(long j, @NonNull TimeUnit timeUnit, @NonNull Executor executor) {
        this.length = timeUnit.toMillis(j);
        this.setMin = executor;
    }

    @Nullable
    public final <V> V getMin(@NonNull next<SupportSQLiteDatabase, V> next) {
        try {
            return next.length(length());
        } finally {
            setMax();
        }
    }

    @NonNull
    public final SupportSQLiteDatabase length() {
        synchronized (this.setMax) {
            this.values.removeCallbacks(this.hashCode);
            this.toIntRange++;
            if (this.equals) {
                throw new IllegalStateException("Attempting to open already closed database.");
            } else if (this.toFloatRange != null && this.toFloatRange.isOpen()) {
                SupportSQLiteDatabase supportSQLiteDatabase = this.toFloatRange;
                return supportSQLiteDatabase;
            } else if (this.getMin != null) {
                SupportSQLiteDatabase writableDatabase = this.getMin.getWritableDatabase();
                this.toFloatRange = writableDatabase;
                return writableDatabase;
            } else {
                throw new IllegalStateException("AutoCloser has not been initialized. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMax() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.setMax
            monitor-enter(r0)
            int r1 = r5.toIntRange     // Catch:{ all -> 0x0028 }
            if (r1 <= 0) goto L_0x0020
            int r1 = r5.toIntRange     // Catch:{ all -> 0x0028 }
            int r1 = r1 + -1
            r5.toIntRange = r1     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x001e
            androidx.sqlite.db.SupportSQLiteDatabase r1 = r5.toFloatRange     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0015:
            android.os.Handler r1 = r5.values     // Catch:{ all -> 0x0028 }
            java.lang.Runnable r2 = r5.hashCode     // Catch:{ all -> 0x0028 }
            long r3 = r5.length     // Catch:{ all -> 0x0028 }
            r1.postDelayed(r2, r3)     // Catch:{ all -> 0x0028 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0020:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = "ref count is 0 or lower but we're supposed to decrement"
            r1.<init>(r2)     // Catch:{ all -> 0x0028 }
            throw r1     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setHeaderTitleInt.setMax():void");
    }

    @Nullable
    public final SupportSQLiteDatabase setMin() {
        SupportSQLiteDatabase supportSQLiteDatabase;
        synchronized (this.setMax) {
            supportSQLiteDatabase = this.toFloatRange;
        }
        return supportSQLiteDatabase;
    }

    public final boolean getMin() {
        return !this.equals;
    }
}
