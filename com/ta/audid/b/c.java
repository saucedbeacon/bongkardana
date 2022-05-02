package com.ta.audid.b;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.ta.audid.g.m;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class c extends SQLiteOpenHelper {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public SQLiteDatabase f9834a;

    /* renamed from: a  reason: collision with other field name */
    private a f8827a = new a();

    /* renamed from: a  reason: collision with other field name */
    private Future<?> f8828a;

    /* renamed from: a  reason: collision with other field name */
    private AtomicInteger f8829a = new AtomicInteger();

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public c(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.rawQuery("PRAGMA journal_mode=DELETE", (String[]) null);
        } catch (Throwable unused) {
        }
        closeCursor(cursor);
        super.onOpen(sQLiteDatabase);
    }

    public synchronized SQLiteDatabase getWritableDatabase() {
        try {
            if (this.f9834a == null) {
                this.f9834a = super.getWritableDatabase();
            }
            this.f8829a.incrementAndGet();
        } catch (Throwable th) {
            m.w("TAG", "e", th);
        }
        return this.f9834a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void closeWritableDatabase(android.database.sqlite.SQLiteDatabase r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 != 0) goto L_0x0005
            monitor-exit(r4)
            return
        L_0x0005:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f8829a     // Catch:{ all -> 0x0028 }
            int r5 = r5.decrementAndGet()     // Catch:{ all -> 0x0028 }
            if (r5 != 0) goto L_0x0026
            java.util.concurrent.Future<?> r5 = r4.f8828a     // Catch:{ all -> 0x0028 }
            if (r5 == 0) goto L_0x0017
            java.util.concurrent.Future<?> r5 = r4.f8828a     // Catch:{ all -> 0x0028 }
            r0 = 0
            r5.cancel(r0)     // Catch:{ all -> 0x0028 }
        L_0x0017:
            com.ta.audid.g.j r5 = com.ta.audid.g.j.a()     // Catch:{ all -> 0x0028 }
            r0 = 0
            com.ta.audid.b.c$a r1 = r4.f8827a     // Catch:{ all -> 0x0028 }
            r2 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.ScheduledFuture r5 = r5.schedule(r0, r1, r2)     // Catch:{ all -> 0x0028 }
            r4.f8828a = r5     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r4)
            return
        L_0x0028:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.audid.b.c.closeWritableDatabase(android.database.sqlite.SQLiteDatabase):void");
    }

    public void closeCursor(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable unused) {
            }
        }
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            synchronized (c.this) {
                if (c.a(c.this).get() == 0 && c.a(c.this) != null) {
                    c.a(c.this).close();
                    SQLiteDatabase unused = c.this.f9834a = null;
                }
            }
        }
    }
}
