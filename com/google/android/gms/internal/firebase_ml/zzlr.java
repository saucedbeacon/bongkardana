package com.google.android.gms.internal.firebase_ml;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class zzlr {
    /* access modifiers changed from: private */
    public final int limit;
    /* access modifiers changed from: private */
    public final zzla zzaej;
    private final boolean zzaek;
    private final zzlv zzael;

    private zzlr(zzlv zzlv) {
        this(zzlv, false, zzle.zzaeb, Integer.MAX_VALUE);
    }

    private zzlr(zzlv zzlv, boolean z, zzla zzla, int i) {
        this.zzael = zzlv;
        this.zzaek = false;
        this.zzaej = zzla;
        this.limit = Integer.MAX_VALUE;
    }

    public static zzlr zza(zzla zzla) {
        zzlp.checkNotNull(zzla);
        return new zzlr(new zzlq(zzla));
    }

    public final List<String> zza(CharSequence charSequence) {
        zzlp.checkNotNull(charSequence);
        Iterator<String> zza = this.zzael.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (zza.hasNext()) {
            arrayList.add(zza.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
