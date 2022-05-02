package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.internal.af;
import com.google.android.play.core.internal.ag;
import com.google.android.play.core.internal.ap;
import com.google.android.play.core.internal.by;
import com.google.android.play.core.internal.n;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;
import com.google.android.play.core.tasks.i;

final class p {
    /* access modifiers changed from: private */
    public static final af b = new af("AppUpdateService");
    private static final Intent c = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    ap<n> f9555a;
    /* access modifiers changed from: private */
    public final String d;
    private final Context e;
    private final r f;

    public p(Context context, r rVar) {
        this.d = context.getPackageName();
        this.e = context;
        this.f = rVar;
        if (by.a(context)) {
            this.f9555a = new ap(com.google.android.play.core.splitcompat.p.a(context), b, "AppUpdateService", c, j.f9551a);
        }
    }

    static /* synthetic */ Bundle a(p pVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(d());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(pVar.e.getPackageManager().getPackageInfo(pVar.e.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            b.b("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    static /* synthetic */ AppUpdateInfo a(p pVar, Bundle bundle, String str) {
        Bundle bundle2 = bundle;
        return AppUpdateInfo.a(str, bundle2.getInt("version.code", -1), bundle2.getInt("update.availability"), bundle2.getInt("install.status", 0), bundle2.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle2.getInt("client.version.staleness")), bundle2.getInt("in.app.update.priority", 0), bundle2.getLong("bytes.downloaded"), bundle2.getLong("total.bytes.to.download"), bundle2.getLong("additional.size.required"), pVar.f.a(), (PendingIntent) bundle2.getParcelable("blocking.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.intent"), (PendingIntent) bundle2.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.destructive.intent"));
    }

    private static <T> Task<T> c() {
        b.b("onError(%d)", -9);
        return Tasks.a((Exception) new InstallException(-9));
    }

    /* access modifiers changed from: private */
    public static Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore.version.code", 10800);
        return bundle;
    }

    public final Task<AppUpdateInfo> a(String str) {
        if (this.f9555a == null) {
            return c();
        }
        b.c("requestUpdateInfo(%s)", str);
        i iVar = new i();
        this.f9555a.a((ag) new k(this, iVar, str, iVar));
        return iVar.a();
    }

    public final Task<Void> b(String str) {
        if (this.f9555a == null) {
            return c();
        }
        b.c("completeUpdate(%s)", str);
        i iVar = new i();
        this.f9555a.a((ag) new l(this, iVar, iVar, str));
        return iVar.a();
    }
}
