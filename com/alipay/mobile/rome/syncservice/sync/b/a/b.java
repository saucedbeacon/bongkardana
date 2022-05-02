package com.alipay.mobile.rome.syncservice.sync.b.a;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.alipay.mobile.rome.syncsdk.util.c;
import java.io.File;
import java.lang.reflect.Method;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f9488a;
    private final String b;
    private final SQLiteDatabase.CursorFactory c;
    private final int d;
    private SQLiteDatabase e;
    private boolean f;
    private final DatabaseErrorHandler g;

    public abstract void a(int i, int i2);

    public abstract void a(SQLiteDatabase sQLiteDatabase);

    public b(Context context, String str) {
        this(context, str, (byte) 0);
    }

    private b(Context context, String str, byte b2) {
        this.f9488a = context;
        this.b = str;
        this.c = null;
        this.d = 1;
        this.g = null;
    }

    public final SQLiteDatabase c() {
        SQLiteDatabase a2;
        synchronized (this) {
            a2 = a();
        }
        return a2;
    }

    private SQLiteDatabase a() {
        SQLiteDatabase sQLiteDatabase = this.e;
        if (sQLiteDatabase != null) {
            if (!sQLiteDatabase.isOpen()) {
                this.e = null;
            } else if (!this.e.isReadOnly()) {
                return this.e;
            }
        }
        if (!this.f) {
            SQLiteDatabase sQLiteDatabase2 = this.e;
            try {
                this.f = true;
                if (sQLiteDatabase2 == null) {
                    sQLiteDatabase2 = this.b == null ? SQLiteDatabase.create((SQLiteDatabase.CursorFactory) null) : SQLiteDatabase.openDatabase(b(), this.c, 268435472, this.g);
                } else if (sQLiteDatabase2.isReadOnly()) {
                    Method declaredMethod = Class.forName("android.database.sqlite.SQLiteDatabase").getDeclaredMethod("reopenReadWrite", new Class[]{null});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(sQLiteDatabase2, new Object[]{null});
                }
            } catch (SQLiteException e2) {
                throw e2;
            } catch (Exception e3) {
                c.d("SyncSQLiteOpenHelper", "reopenReadWrite: ".concat(String.valueOf(e3)));
            } catch (Throwable th) {
                this.f = false;
                if (!(sQLiteDatabase2 == null || sQLiteDatabase2 == this.e)) {
                    sQLiteDatabase2.close();
                }
                throw th;
            }
            int version = sQLiteDatabase2.getVersion();
            if (version != this.d) {
                if (!sQLiteDatabase2.isReadOnly()) {
                    sQLiteDatabase2.beginTransaction();
                    if (version == 0) {
                        a(sQLiteDatabase2);
                    } else if (version > this.d) {
                        b(version, this.d);
                    } else {
                        a(version, this.d);
                    }
                    sQLiteDatabase2.setVersion(this.d);
                    sQLiteDatabase2.setTransactionSuccessful();
                    sQLiteDatabase2.endTransaction();
                } else {
                    StringBuilder sb = new StringBuilder("Can't upgrade read-only database from version ");
                    sb.append(sQLiteDatabase2.getVersion());
                    sb.append(" to ");
                    sb.append(this.d);
                    sb.append(": ");
                    sb.append(this.b);
                    throw new SQLiteException(sb.toString());
                }
            }
            if (sQLiteDatabase2.isReadOnly()) {
                StringBuilder sb2 = new StringBuilder("Opened ");
                sb2.append(this.b);
                sb2.append(" in read-only mode");
                c.c("SyncSQLiteOpenHelper", sb2.toString());
            }
            this.e = sQLiteDatabase2;
            this.f = false;
            if (!(sQLiteDatabase2 == null || sQLiteDatabase2 == sQLiteDatabase2)) {
                sQLiteDatabase2.close();
            }
            return sQLiteDatabase2;
        }
        throw new IllegalStateException("getDatabase called recursively");
    }

    private String b() {
        File databasePath = this.f9488a.getDatabasePath(this.b);
        try {
            File parentFile = databasePath.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("Make dirs for ");
            sb.append(databasePath.getPath());
            sb.append(" Error!");
            c.a("SyncSQLiteOpenHelper", sb.toString(), e2);
        }
        return databasePath.getPath();
    }

    public final synchronized void d() {
        if (this.f) {
            throw new IllegalStateException("Closed during initialization");
        } else if (this.e != null && this.e.isOpen()) {
            this.e.close();
            this.e = null;
        }
    }

    public void b(int i, int i2) {
        StringBuilder sb = new StringBuilder("Can't downgrade database from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        throw new SQLiteException(sb.toString());
    }
}
