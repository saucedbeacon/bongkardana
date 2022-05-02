package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzux;

final class zzvv implements zzxb {
    private static final zzwf zzcbq = new zzvy();
    private final zzwf zzcbp;

    public zzvv() {
        this(new zzvx(zzuv.zzsy(), zzuc()));
    }

    private zzvv(zzwf zzwf) {
        this.zzcbp = (zzwf) zzva.zza(zzwf, "messageInfoFactory");
    }

    public final <T> zzxc<T> zzj(Class<T> cls) {
        zzxe.zzl((Class<?>) cls);
        zzwg zzh = this.zzcbp.zzh(cls);
        if (zzh.zzul()) {
            if (zzux.class.isAssignableFrom(cls)) {
                return zzwo.zza(zzxe.zzvd(), zzun.zzsq(), zzh.zzum());
            }
            return zzwo.zza(zzxe.zzvb(), zzun.zzsr(), zzh.zzum());
        } else if (zzux.class.isAssignableFrom(cls)) {
            if (zza(zzh)) {
                return zzwm.zza(cls, zzh, zzws.zzup(), zzvs.zzub(), zzxe.zzvd(), zzun.zzsq(), zzwd.zzui());
            }
            return zzwm.zza(cls, zzh, zzws.zzup(), zzvs.zzub(), zzxe.zzvd(), (zzum<?>) null, zzwd.zzui());
        } else if (zza(zzh)) {
            return zzwm.zza(cls, zzh, zzws.zzuo(), zzvs.zzua(), zzxe.zzvb(), zzun.zzsr(), zzwd.zzuh());
        } else {
            return zzwm.zza(cls, zzh, zzws.zzuo(), zzvs.zzua(), zzxe.zzvc(), (zzum<?>) null, zzwd.zzuh());
        }
    }

    private static boolean zza(zzwg zzwg) {
        return zzwg.zzuk() == zzux.zzf.zzcag;
    }

    private static zzwf zzuc() {
        try {
            return (zzwf) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return zzcbq;
        }
    }
}
