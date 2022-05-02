package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.Field;
import java.util.Map;

public final class zzhx {
    private final Map<String, zzhw> zzabe = new zzhv();
    private final Map<Field, zzhw> zzabf = new zzhv();
    private final Object zzabg;

    public zzhx(Object obj) {
        this.zzabg = obj;
    }

    public final void zzhk() {
        for (Map.Entry next : this.zzabe.entrySet()) {
            ((Map) this.zzabg).put((String) next.getKey(), ((zzhw) next.getValue()).zzhj());
        }
        for (Map.Entry next2 : this.zzabf.entrySet()) {
            zzij.zza((Field) next2.getKey(), this.zzabg, ((zzhw) next2.getValue()).zzhj());
        }
    }

    public final void zza(Field field, Class<?> cls, Object obj) {
        zzhw zzhw = this.zzabf.get(field);
        if (zzhw == null) {
            zzhw = new zzhw(cls);
            this.zzabf.put(field, zzhw);
        }
        zzlp.checkArgument(cls == zzhw.zzabc);
        zzhw.zzabd.add(obj);
    }
}
