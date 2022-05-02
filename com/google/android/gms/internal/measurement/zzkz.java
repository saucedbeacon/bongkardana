package com.google.android.gms.internal.measurement;

final class zzkz implements zzlg {
    private final zzlg[] zza;

    zzkz(zzlg... zzlgArr) {
        this.zza = zzlgArr;
    }

    public final boolean zzb(Class<?> cls) {
        zzlg[] zzlgArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzlgArr[i].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    public final zzlf zzc(Class<?> cls) {
        zzlg[] zzlgArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzlg zzlg = zzlgArr[i];
            if (zzlg.zzb(cls)) {
                return zzlg.zzc(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
