package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractMap;
import java.util.Set;

final class zzic extends AbstractMap<String, Object> {
    final Object object;
    final zzib zzwv;

    zzic(Object obj, boolean z) {
        this.object = obj;
        zzib zza = zzib.zza(obj.getClass(), z);
        this.zzwv = zza;
        zzlp.checkArgument(!zza.isEnum());
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final Object get(Object obj) {
        zzij zzal;
        if ((obj instanceof String) && (zzal = this.zzwv.zzal((String) obj)) != null) {
            return zzal.zzh(this.object);
        }
        return null;
    }

    public final /* synthetic */ Set entrySet() {
        return new zzih(this);
    }

    public final /* synthetic */ Object put(Object obj, Object obj2) {
        String str = (String) obj;
        zzij zzal = this.zzwv.zzal(str);
        String valueOf = String.valueOf(str);
        zzlp.checkNotNull(zzal, valueOf.length() != 0 ? "no field of key ".concat(valueOf) : new String("no field of key "));
        Object zzh = zzal.zzh(this.object);
        zzal.zzb(this.object, zzlp.checkNotNull(obj2));
        return zzh;
    }
}
