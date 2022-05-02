package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.play.core.internal.af;
import com.google.android.play.core.internal.ag;
import com.google.android.play.core.internal.ap;
import com.google.android.play.core.internal.bu;
import com.google.android.play.core.internal.by;
import com.google.android.play.core.splitcompat.p;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;
import com.google.android.play.core.tasks.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class av {
    /* access modifiers changed from: private */
    public static final af b = new af("SplitInstallService");
    private static final Intent c = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    ap<bu> f10974a;
    /* access modifiers changed from: private */
    public final String d;

    public av(Context context) {
        this.d = context.getPackageName();
        if (by.a(context)) {
            this.f10974a = new ap(p.a(context), b, "SplitInstallService", c, ad.f10964a);
        }
    }

    static /* synthetic */ ArrayList a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    static /* synthetic */ Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10800);
        return bundle;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.util.ArrayList b(java.util.Collection r6) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            int r1 = r6.size()
            r2 = 0
        L_0x000e:
            if (r2 >= r1) goto L_0x0026
            java.lang.Object r3 = r6.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r5 = "language"
            r4.putString(r5, r3)
            r0.add(r4)
            int r2 = r2 + 1
            goto L_0x000e
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.av.b(java.util.Collection):java.util.ArrayList");
    }

    private static <T> Task<T> d() {
        b.b("onError(%d)", -14);
        return Tasks.a((Exception) new SplitInstallException(-14));
    }

    public final Task<List<SplitInstallSessionState>> a() {
        if (this.f10974a == null) {
            return d();
        }
        b.c("getSessionStates", new Object[0]);
        i iVar = new i();
        this.f10974a.a((ag) new ak(this, iVar, iVar));
        return iVar.a();
    }

    public final Task<SplitInstallSessionState> a(int i) {
        if (this.f10974a == null) {
            return d();
        }
        b.c("getSessionState(%d)", Integer.valueOf(i));
        i iVar = new i();
        this.f10974a.a((ag) new aj(this, iVar, i, iVar));
        return iVar.a();
    }

    public final Task<Integer> a(Collection<String> collection, Collection<String> collection2) {
        if (this.f10974a == null) {
            return d();
        }
        b.c("startInstall(%s,%s)", collection, collection2);
        i iVar = new i();
        this.f10974a.a((ag) new ae(this, iVar, collection, collection2, iVar));
        return iVar.a();
    }

    public final Task<Void> a(List<String> list) {
        if (this.f10974a == null) {
            return d();
        }
        b.c("deferredUninstall(%s)", list);
        i iVar = new i();
        this.f10974a.a((ag) new af(this, iVar, list, iVar));
        return iVar.a();
    }

    public final Task<Void> b(int i) {
        if (this.f10974a == null) {
            return d();
        }
        b.c("cancelInstall(%d)", Integer.valueOf(i));
        i iVar = new i();
        this.f10974a.a((ag) new al(this, iVar, i, iVar));
        return iVar.a();
    }

    public final Task<Void> b(List<String> list) {
        if (this.f10974a == null) {
            return d();
        }
        b.c("deferredInstall(%s)", list);
        i iVar = new i();
        this.f10974a.a((ag) new ag(this, iVar, list, iVar));
        return iVar.a();
    }

    public final Task<Void> c(List<String> list) {
        if (this.f10974a == null) {
            return d();
        }
        b.c("deferredLanguageInstall(%s)", list);
        i iVar = new i();
        this.f10974a.a((ag) new ah(this, iVar, list, iVar));
        return iVar.a();
    }

    public final Task<Void> d(List<String> list) {
        if (this.f10974a == null) {
            return d();
        }
        b.c("deferredLanguageUninstall(%s)", list);
        i iVar = new i();
        this.f10974a.a((ag) new ai(this, iVar, list, iVar));
        return iVar.a();
    }
}
