package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.internal.af;
import com.google.android.play.core.internal.cj;
import com.google.android.play.core.internal.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

final class cp {

    /* renamed from: a  reason: collision with root package name */
    private static final af f10895a = new af("ExtractorSessionStoreView");
    private final bb b;
    private final cj<w> c;
    private final bz d;
    private final cj<Executor> e;
    private final Map<Integer, cm> f = new HashMap();
    private final ReentrantLock g = new ReentrantLock();

    cp(bb bbVar, cj<w> cjVar, bz bzVar, cj<Executor> cjVar2) {
        this.b = bbVar;
        this.c = cjVar;
        this.d = bzVar;
        this.e = cjVar2;
    }

    private final <T> T a(co<T> coVar) {
        try {
            a();
            return coVar.a();
        } finally {
            b();
        }
    }

    private final Map<String, cm> d(List<String> list) {
        return (Map) a(new cf(this, list));
    }

    private final cm e(int i) {
        Map<Integer, cm> map = this.f;
        Integer valueOf = Integer.valueOf(i);
        cm cmVar = map.get(valueOf);
        if (cmVar != null) {
            return cmVar;
        }
        throw new bv(String.format("Could not find session %d while trying to get it", new Object[]{valueOf}), i);
    }

    private static String e(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList != null && !stringArrayList.isEmpty()) {
            return stringArrayList.get(0);
        }
        throw new bv("Session without pack received.");
    }

    private static <T> List<T> e(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }

    /* access modifiers changed from: package-private */
    public final Map<String, Integer> a(List<String> list) {
        return (Map) a(new ci(this, list));
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.g.lock();
    }

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        a(new ch(this, i));
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, int i, long j) {
        a(new ce(this, str, i, j));
    }

    /* access modifiers changed from: package-private */
    public final boolean a(Bundle bundle) {
        return ((Boolean) a(new cc(this, bundle))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Map b(List list) {
        int i;
        Map<String, cm> d2 = d((List<String>) list);
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            cm cmVar = d2.get(str);
            if (cmVar == null) {
                i = 8;
            } else {
                if (db.a(cmVar.c.c)) {
                    try {
                        cmVar.c.c = 6;
                        this.e.a().execute(new cj(this, cmVar));
                        this.d.a(str);
                    } catch (bv unused) {
                        f10895a.c("Session %d with pack %s does not exist, no need to cancel.", Integer.valueOf(cmVar.f10893a), str);
                    }
                }
                i = cmVar.c.c;
            }
            hashMap.put(str, Integer.valueOf(i));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.g.unlock();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(int i) {
        e(i).c.c = 5;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(String str, int i, long j) {
        cm cmVar = d((List<String>) Arrays.asList(new String[]{str})).get(str);
        if (cmVar == null || db.b(cmVar.c.c)) {
            f10895a.b(String.format("Could not find pack %s while trying to complete it", new Object[]{str}), new Object[0]);
        }
        this.b.f(str, i, j);
        cmVar.c.c = 4;
    }

    /* access modifiers changed from: package-private */
    public final boolean b(Bundle bundle) {
        return ((Boolean) a(new cd(this, bundle))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Boolean c(Bundle bundle) {
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.TRUE;
        }
        Map<Integer, cm> map = this.f;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return Boolean.TRUE;
        }
        cm cmVar = this.f.get(valueOf);
        if (cmVar.c.c == 6) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!db.a(cmVar.c.c, bundle.getInt(h.a("status", e(bundle)))));
    }

    /* access modifiers changed from: package-private */
    public final Map<Integer, cm> c() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Map c(List list) {
        HashMap hashMap = new HashMap();
        for (cm next : this.f.values()) {
            String str = next.c.f10892a;
            if (list.contains(str)) {
                cm cmVar = (cm) hashMap.get(str);
                if ((cmVar == null ? -1 : cmVar.f10893a) < next.f10893a) {
                    hashMap.put(str, next);
                }
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(int i) {
        cm e2 = e(i);
        if (db.b(e2.c.c)) {
            bb bbVar = this.b;
            cl clVar = e2.c;
            bbVar.f(clVar.f10892a, e2.b, clVar.b);
            cl clVar2 = e2.c;
            int i2 = clVar2.c;
            if (i2 == 5 || i2 == 6) {
                this.b.d(clVar2.f10892a);
                return;
            }
            return;
        }
        throw new bv(String.format("Could not safely delete session %d because it is not in a terminal state.", new Object[]{Integer.valueOf(i)}), i);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Boolean d(Bundle bundle) {
        cn cnVar;
        Bundle bundle2 = bundle;
        int i = bundle2.getInt("session_id");
        if (i == 0) {
            return Boolean.FALSE;
        }
        Map<Integer, cm> map = this.f;
        Integer valueOf = Integer.valueOf(i);
        boolean z = false;
        if (map.containsKey(valueOf)) {
            cm e2 = e(i);
            int i2 = bundle2.getInt(h.a("status", e2.c.f10892a));
            if (db.a(e2.c.c, i2)) {
                f10895a.a("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(e2.c.c));
                cl clVar = e2.c;
                String str = clVar.f10892a;
                int i3 = clVar.c;
                if (i3 == 4) {
                    this.c.a().a(i, str);
                } else if (i3 == 5) {
                    this.c.a().a(i);
                } else if (i3 == 6) {
                    this.c.a().a((List<String>) Arrays.asList(new String[]{str}));
                }
            } else {
                e2.c.c = i2;
                if (db.b(i2)) {
                    a(i);
                    this.d.a(e2.c.f10892a);
                } else {
                    List<cn> list = e2.c.e;
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        cn cnVar2 = list.get(i4);
                        ArrayList parcelableArrayList = bundle2.getParcelableArrayList(h.a("chunk_intents", e2.c.f10892a, cnVar2.f10894a));
                        if (parcelableArrayList != null) {
                            for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                                if (!(parcelableArrayList.get(i5) == null || ((Intent) parcelableArrayList.get(i5)).getData() == null)) {
                                    cnVar2.d.get(i5).f10891a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String e3 = e(bundle);
            long j = bundle2.getLong(h.a("pack_version", e3));
            int i6 = bundle2.getInt(h.a("status", e3));
            long j2 = bundle2.getLong(h.a("total_bytes_to_download", e3));
            ArrayList<String> stringArrayList = bundle2.getStringArrayList(h.a("slice_ids", e3));
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = e(stringArrayList).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                ArrayList parcelableArrayList2 = bundle2.getParcelableArrayList(h.a("chunk_intents", e3, str2));
                ArrayList arrayList2 = new ArrayList();
                for (Intent intent : e(parcelableArrayList2)) {
                    Iterator<T> it2 = it;
                    if (intent != null) {
                        z = true;
                    }
                    arrayList2.add(new ck(z));
                    it = it2;
                    z = false;
                }
                Iterator<T> it3 = it;
                String string = bundle2.getString(h.a("uncompressed_hash_sha256", e3, str2));
                long j3 = bundle2.getLong(h.a("uncompressed_size", e3, str2));
                int i7 = bundle2.getInt(h.a("patch_format", e3, str2), 0);
                if (i7 != 0) {
                    cnVar = new cn(str2, string, j3, arrayList2, 0, i7);
                    z = false;
                } else {
                    z = false;
                    cnVar = new cn(str2, string, j3, arrayList2, bundle2.getInt(h.a("compression_format", e3, str2), 0), 0);
                }
                arrayList.add(cnVar);
                it = it3;
            }
            this.f.put(Integer.valueOf(i), new cm(i, bundle2.getInt("app_version_code"), new cl(e3, j, i6, j2, arrayList)));
        }
        return Boolean.TRUE;
    }

    /* access modifiers changed from: package-private */
    public final void d(int i) {
        a(new cg(this, i));
    }
}
