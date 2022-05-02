package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import com.google.android.play.core.internal.af;
import com.google.android.play.core.internal.ag;
import com.google.android.play.core.internal.ap;
import com.google.android.play.core.internal.by;
import com.google.android.play.core.internal.s;
import com.google.android.play.core.splitcompat.p;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;
import com.google.android.play.core.tasks.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

final class ar implements w {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final af f10847a = new af("AssetPackServiceImpl");
    private static final Intent b = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");
    /* access modifiers changed from: private */
    public final String c;
    /* access modifiers changed from: private */
    public final bz d;
    /* access modifiers changed from: private */
    @Nullable
    public ap<s> e;
    /* access modifiers changed from: private */
    @Nullable
    public ap<s> f;
    /* access modifiers changed from: private */
    public final AtomicBoolean g = new AtomicBoolean();

    ar(Context context, bz bzVar) {
        this.c = context.getPackageName();
        this.d = bzVar;
        if (by.a(context)) {
            this.e = new ap(p.a(context), f10847a, "AssetPackService", b, x.f10947a);
            this.f = new ap(p.a(context), f10847a, "AssetPackService-keepAlive", b, y.f10948a);
        }
        f10847a.a("AssetPackService initiated.", new Object[0]);
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

    static /* synthetic */ List a(ar arVar, List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AssetPackState next = AssetPackStates.a((Bundle) list.get(i), arVar.d).packStates().values().iterator().next();
            if (next == null) {
                f10847a.b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (db.a(next.status())) {
                arrayList.add(next.name());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final void a(int i, String str, int i2) {
        if (this.e != null) {
            f10847a.c("notifyModuleCompleted", new Object[0]);
            i iVar = new i();
            this.e.a((ag) new ag(this, iVar, i, str, iVar, i2));
            return;
        }
        throw new bv("The Play Store app is not installed or is an unofficial version.", i);
    }

    static /* synthetic */ Bundle b(Map map) {
        Bundle e2 = e();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        e2.putParcelableArrayList("installed_asset_module", arrayList);
        return e2;
    }

    /* access modifiers changed from: private */
    public static Bundle c(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i);
        return bundle;
    }

    /* access modifiers changed from: private */
    public static Bundle c(int i, String str) {
        Bundle c2 = c(i);
        c2.putString("module_name", str);
        return c2;
    }

    static /* synthetic */ Bundle c(int i, String str, String str2, int i2) {
        Bundle c2 = c(i, str);
        c2.putString("slice_id", str2);
        c2.putInt("chunk_number", i2);
        return c2;
    }

    private static <T> Task<T> d() {
        f10847a.b("onError(%d)", -11);
        return Tasks.a((Exception) new AssetPackException(-11));
    }

    /* access modifiers changed from: private */
    public static Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10800);
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList());
        return bundle;
    }

    public final Task<AssetPackStates> a(List<String> list, az azVar, Map<String, Long> map) {
        if (this.e == null) {
            return d();
        }
        f10847a.c("getPackStates(%s)", list);
        i iVar = new i();
        this.e.a((ag) new ae(this, iVar, list, map, iVar, azVar));
        return iVar.a();
    }

    public final Task<AssetPackStates> a(List<String> list, List<String> list2, Map<String, Long> map) {
        if (this.e == null) {
            return d();
        }
        f10847a.c("startDownload(%s)", list2);
        i iVar = new i();
        this.e.a((ag) new ab(this, iVar, list2, map, iVar, list));
        iVar.a().addOnSuccessListener(new z(this));
        return iVar.a();
    }

    public final Task<List<String>> a(Map<String, Long> map) {
        if (this.e == null) {
            return d();
        }
        f10847a.c("syncPacks", new Object[0]);
        i iVar = new i();
        this.e.a((ag) new ad(this, iVar, map, iVar));
        return iVar.a();
    }

    public final synchronized void a() {
        if (this.f == null) {
            f10847a.d("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        f10847a.c("keepAlive", new Object[0]);
        if (!this.g.compareAndSet(false, true)) {
            f10847a.c("Service is already kept alive.", new Object[0]);
            return;
        }
        i iVar = new i();
        this.f.a((ag) new aj(this, iVar, iVar));
    }

    public final void a(int i) {
        if (this.e != null) {
            f10847a.c("notifySessionFailed", new Object[0]);
            i iVar = new i();
            this.e.a((ag) new ah(this, iVar, i, iVar));
            return;
        }
        throw new bv("The Play Store app is not installed or is an unofficial version.", i);
    }

    public final void a(int i, String str) {
        a(i, str, 10);
    }

    public final void a(int i, String str, String str2, int i2) {
        if (this.e != null) {
            f10847a.c("notifyChunkTransferred", new Object[0]);
            i iVar = new i();
            this.e.a((ag) new af(this, iVar, i, str, str2, i2, iVar));
            return;
        }
        throw new bv("The Play Store app is not installed or is an unofficial version.", i);
    }

    public final void a(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1960846764, oncanceled);
            onCancelLoad.getMin(1960846764, oncanceled);
        }
        if (this.e != null) {
            f10847a.c("removePack(%s)", str);
            i iVar = new i();
            this.e.a((ag) new aa(this, iVar, str, iVar));
        }
    }

    public final void a(List<String> list) {
        if (this.e != null) {
            f10847a.c("cancelDownloads(%s)", list);
            i iVar = new i();
            this.e.a((ag) new ac(this, iVar, list, iVar));
        }
    }

    public final Task<ParcelFileDescriptor> b(int i, String str, String str2, int i2) {
        if (this.e == null) {
            return d();
        }
        f10847a.c("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        i iVar = new i();
        this.e.a((ag) new ai(this, iVar, i, str, str2, i2, iVar));
        return iVar.a();
    }
}
