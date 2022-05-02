package com.alipay.mobile.rome.syncservice.sync.b.a.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.alipay.mobile.rome.syncservice.d.d;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected SQLiteDatabase f9487a;

    /* access modifiers changed from: protected */
    public abstract String b();

    protected a(SQLiteDatabase sQLiteDatabase) {
        this.f9487a = sQLiteDatabase;
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            this.f9487a = sQLiteDatabase;
        }
    }

    public final long a(ContentValues contentValues) {
        long insertOrThrow;
        synchronized (d.f9475a) {
            insertOrThrow = this.f9487a.insertOrThrow(b(), (String) null, contentValues);
        }
        return insertOrThrow;
    }

    public final int a(String str, String[] strArr) {
        int delete;
        synchronized (d.f9475a) {
            delete = this.f9487a.delete(b(), str, strArr);
        }
        return delete;
    }

    public final int a(ContentValues contentValues, String str, String[] strArr) {
        int update;
        synchronized (d.f9475a) {
            update = this.f9487a.update(b(), contentValues, str, strArr);
        }
        return update;
    }

    public final Cursor a(String[] strArr, String str, String[] strArr2) {
        Cursor query;
        synchronized (d.f9475a) {
            query = this.f9487a.query(b(), strArr, str, strArr2, (String) null, (String) null, (String) null);
        }
        return query;
    }

    public final Cursor b(String str, String[] strArr) {
        Cursor rawQuery;
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1137434811, oncanceled);
            onCancelLoad.getMin(-1137434811, oncanceled);
        }
        synchronized (d.f9475a) {
            rawQuery = this.f9487a.rawQuery(str, strArr);
        }
        return rawQuery;
    }

    public final void a(String str) {
        synchronized (d.f9475a) {
            this.f9487a.execSQL(str);
        }
    }

    protected static void a() {
        synchronized (d.f9475a) {
            com.alipay.mobile.rome.syncservice.sync.b.a.a.a(com.alipay.mobile.rome.syncservice.d.a.f9473a).a();
        }
    }

    protected static void c() {
        synchronized (d.f9475a) {
            com.alipay.mobile.rome.syncservice.sync.b.a.a.a(com.alipay.mobile.rome.syncservice.d.a.f9473a).b();
        }
    }
}
