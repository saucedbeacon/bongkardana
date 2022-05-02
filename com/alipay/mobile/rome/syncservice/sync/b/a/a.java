package com.alipay.mobile.rome.syncservice.sync.b.a;

import android.content.Context;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.alipay.mobile.rome.syncservice.d.e;
import com.alipay.mobile.rome.syncservice.sync.b.a.a.b;
import com.alipay.mobile.rome.syncservice.sync.b.a.a.c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f9486a = a.class.getSimpleName();
    private static volatile a e;
    public c b;
    public b c;
    public AtomicBoolean d = new AtomicBoolean(false);
    private Context f;

    public static a a(Context context) {
        if (e == null) {
            synchronized (a.class) {
                if (e == null) {
                    e = new a(context, "sync_dispatch.db");
                }
            }
        }
        return e;
    }

    private a(Context context, String str) {
        super(context, str);
        SQLiteDatabase sQLiteDatabase;
        this.f = context;
        try {
            sQLiteDatabase = c();
        } catch (SQLiteCantOpenDatabaseException e2) {
            com.alipay.mobile.rome.syncsdk.util.c.d(f9486a, "SyncDbManager error:".concat(String.valueOf(e2)));
            String message = e2.getMessage();
            if (TextUtils.isEmpty(message) || !message.contains("14")) {
                this.f.deleteDatabase("sync_dispatch.db");
                sQLiteDatabase = c();
            } else {
                b();
                sQLiteDatabase = c();
            }
        } catch (SQLiteException e3) {
            com.alipay.mobile.rome.syncsdk.util.c.d(f9486a, "Could not open the database:".concat(String.valueOf(e3)));
            String message2 = e3.getMessage();
            if (TextUtils.isEmpty(message2) || !message2.contains("not an error") || !message2.contains("read/write mode")) {
                this.f.deleteDatabase("sync_dispatch.db");
                sQLiteDatabase = c();
            } else {
                b();
                sQLiteDatabase = c();
            }
        } catch (Exception e4) {
            com.alipay.mobile.rome.syncsdk.util.c.d(f9486a, "Could not open the database, need recreate: ".concat(String.valueOf(e4)));
            this.f.deleteDatabase("sync_dispatch.db");
            sQLiteDatabase = c();
        }
        this.c = new b(sQLiteDatabase);
        this.b = new c(sQLiteDatabase);
    }

    public final void a(SQLiteDatabase sQLiteDatabase) {
        com.alipay.mobile.rome.syncsdk.util.c.a(f9486a, "onCreate");
        b bVar = this.c;
        if (bVar != null) {
            bVar.a(sQLiteDatabase);
            this.b.a(sQLiteDatabase);
        }
        b.b(sQLiteDatabase);
        c.b(sQLiteDatabase);
    }

    public final void a(int i, int i2) {
        String str = f9486a;
        StringBuilder sb = new StringBuilder("onUpgrade: oldVersion = ");
        sb.append(i);
        sb.append(", newVersion=");
        sb.append(i2);
        com.alipay.mobile.rome.syncsdk.util.c.c(str, sb.toString());
    }

    public final void b(int i, int i2) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-306913699, oncanceled);
            onCancelLoad.getMin(-306913699, oncanceled);
        }
        com.alipay.mobile.rome.syncsdk.util.c.c(f9486a, "onDowngrade");
    }

    public final boolean a() {
        boolean z = true;
        this.d.set(true);
        try {
            d();
            this.f.deleteDatabase("sync_dispatch.db");
            c();
        } catch (Exception e2) {
            com.alipay.mobile.rome.syncsdk.util.c.d(f9486a, "deleteAndRecreateDB:".concat(String.valueOf(e2)));
            z = false;
        }
        this.d.set(false);
        return z;
    }

    public final long a(com.alipay.mobile.rome.syncservice.sync.d.b bVar) {
        if (this.d.get()) {
            com.alipay.mobile.rome.syncsdk.util.c.a(f9486a, "deleteMsg...db recreating~");
            return 0;
        }
        c cVar = this.b;
        if (bVar != null) {
            return cVar.b(bVar.c, bVar.f9495a, bVar.e, bVar.d);
        }
        com.alipay.mobile.rome.syncsdk.util.c.d(c.b, "deleteMsg : uplinkMsgItem is null");
        return -1;
    }

    public final int a(String str, String str2, int i) {
        if (!this.d.get()) {
            return this.c.a(str, str2, i);
        }
        com.alipay.mobile.rome.syncsdk.util.c.a(f9486a, "deleteDownlinkMsgItem...db recreating~");
        return 0;
    }

    public final void b() {
        try {
            String path = this.f.getDatabasePath("sync_dispatch.db").getPath();
            ArrayList arrayList = new ArrayList();
            arrayList.add("chmod 660 ".concat(String.valueOf(path)));
            StringBuilder sb = new StringBuilder("chmod 660 ");
            sb.append(path);
            sb.append("-journal");
            arrayList.add(sb.toString());
            if (!e.a((List<String>) arrayList)) {
                String str = f9486a;
                StringBuilder sb2 = new StringBuilder("changeDBReadWrite failed path=");
                sb2.append(path);
                sb2.append(", DO deleteAndRecreateDB!");
                com.alipay.mobile.rome.syncsdk.util.c.a(str, sb2.toString());
                a();
                return;
            }
            com.alipay.mobile.rome.syncsdk.util.c.a(f9486a, "changeDBReadWrite success path=".concat(String.valueOf(path)));
        } catch (Throwable th) {
            String str2 = f9486a;
            StringBuilder sb3 = new StringBuilder("changeDBReadWrite path=");
            sb3.append((String) null);
            sb3.append(" error: ");
            sb3.append(th);
            com.alipay.mobile.rome.syncsdk.util.c.d(str2, sb3.toString());
        }
    }
}
