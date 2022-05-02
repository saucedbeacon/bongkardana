package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzux;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class zzuk {
    private static volatile boolean zzbwk = false;
    private static boolean zzbwl = true;
    private static final Class<?> zzbwm = zzsn();
    private static volatile zzuk zzbwn;
    private static final zzuk zzbwo = new zzuk(true);
    private final Map<zza, zzux.zzd<?, ?>> zzbwp;

    private static Class<?> zzsn() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    static final class zza {
        private final int number;
        private final Object object;

        zza(Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.object) * 65535) + this.number;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zza = (zza) obj;
            if (this.object == zza.object && this.number == zza.number) {
                return true;
            }
            return false;
        }
    }

    public static zzuk zzso() {
        zzuk zzuk = zzbwn;
        if (zzuk == null) {
            synchronized (zzuk.class) {
                zzuk = zzbwn;
                if (zzuk == null) {
                    zzuk = zzbwo;
                    zzbwn = zzuk;
                }
            }
        }
        return zzuk;
    }

    public final <ContainingType extends zzwi> zzux.zzd<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return this.zzbwp.get(new zza(containingtype, i));
    }

    zzuk() {
        this.zzbwp = new HashMap();
    }

    private zzuk(boolean z) {
        this.zzbwp = Collections.emptyMap();
    }
}
