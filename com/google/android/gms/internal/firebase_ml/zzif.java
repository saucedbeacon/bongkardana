package com.google.android.gms.internal.firebase_ml;

import java.util.Locale;
import java.util.Map;

final class zzif implements Map.Entry<String, Object> {
    private final /* synthetic */ zzic zzach;
    private Object zzaci;
    private final zzij zzacj;

    zzif(zzic zzic, zzij zzij, Object obj) {
        this.zzach = zzic;
        this.zzacj = zzij;
        this.zzaci = zzlp.checkNotNull(obj);
    }

    public final Object getValue() {
        return this.zzaci;
    }

    public final Object setValue(Object obj) {
        Object obj2 = this.zzaci;
        this.zzaci = zzlp.checkNotNull(obj);
        this.zzacj.zzb(this.zzach.object, obj);
        return obj2;
    }

    public final int hashCode() {
        return ((String) getKey()).hashCode() ^ getValue().hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return ((String) getKey()).equals(entry.getKey()) && getValue().equals(entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        String name = this.zzacj.getName();
        return this.zzach.zzwv.zzhl() ? name.toLowerCase(Locale.US) : name;
    }
}
