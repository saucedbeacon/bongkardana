package com.google.android.gms.internal.measurement;

final class zzla implements zzlu {
    private static final zzlg zzb = new zzky();
    private final zzlg zza;

    public zzla() {
        zzlg zzlg;
        zzlg[] zzlgArr = new zzlg[2];
        zzlgArr[0] = zzjy.zza();
        try {
            zzlg = (zzlg) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            zzlg = zzb;
        }
        zzlgArr[1] = zzlg;
        zzkz zzkz = new zzkz(zzlgArr);
        zzkl.zzb(zzkz, "messageInfoFactory");
        this.zza = zzkz;
    }

    private static boolean zzb(zzlf zzlf) {
        return zzlf.zzc() == 1;
    }

    public final <T> zzlt<T> zza(Class<T> cls) {
        zzlv.zza(cls);
        zzlf zzc = this.zza.zzc(cls);
        if (zzc.zza()) {
            if (zzkd.class.isAssignableFrom(cls)) {
                return zzlm.zzf(zzlv.zzC(), zzjs.zza(), zzc.zzb());
            }
            return zzlm.zzf(zzlv.zzA(), zzjs.zzb(), zzc.zzb());
        } else if (zzkd.class.isAssignableFrom(cls)) {
            if (zzb(zzc)) {
                return zzll.zzk(cls, zzc, zzlo.zzb(), zzkw.zzd(), zzlv.zzC(), zzjs.zza(), zzle.zzb());
            }
            return zzll.zzk(cls, zzc, zzlo.zzb(), zzkw.zzd(), zzlv.zzC(), (zzjq<?>) null, zzle.zzb());
        } else if (zzb(zzc)) {
            return zzll.zzk(cls, zzc, zzlo.zza(), zzkw.zzc(), zzlv.zzA(), zzjs.zzb(), zzle.zza());
        } else {
            return zzll.zzk(cls, zzc, zzlo.zza(), zzkw.zzc(), zzlv.zzB(), (zzjq<?>) null, zzle.zza());
        }
    }
}
