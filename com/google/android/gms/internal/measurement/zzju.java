package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class zzju<T extends zzjt<T>> {
    private static final zzju zzd = new zzju(true);
    final zzmd<T, Object> zza = new zzlw(16);
    private boolean zzb;
    private boolean zzc;

    private zzju() {
    }

    public static <T extends zzjt<T>> zzju<T> zza() {
        throw null;
    }

    private static final void zzd(T t, Object obj) {
        boolean z;
        zzmx zzb2 = t.zzb();
        zzkl.zza(obj);
        zzmx zzmx = zzmx.DOUBLE;
        zzmy zzmy = zzmy.INT;
        switch (zzb2.zza().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof zzjd) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzkf)) {
                    return;
                }
            case 8:
                if ((obj instanceof zzli) || (obj instanceof zzkp)) {
                    return;
                }
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(t.zza()), t.zzb().zza(), obj.getClass().getName()}));
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzju zzju = new zzju();
        for (int i = 0; i < this.zza.zzc(); i++) {
            Map.Entry<T, Object> zzd2 = this.zza.zzd(i);
            zzju.zzc((zzjt) zzd2.getKey(), zzd2.getValue());
        }
        for (Map.Entry next : this.zza.zze()) {
            zzju.zzc((zzjt) next.getKey(), next.getValue());
        }
        zzju.zzc = this.zzc;
        return zzju;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzju)) {
            return false;
        }
        return this.zza.equals(((zzju) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (!this.zzb) {
            this.zza.zza();
            this.zzb = true;
        }
    }

    public final void zzc(T t, Object obj) {
        if (!t.zzc()) {
            zzd(t, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zzd(t, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzkp) {
            this.zzc = true;
        }
        this.zza.put(t, obj);
    }

    private zzju(boolean z) {
        zzb();
        zzb();
    }
}
