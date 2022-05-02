package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzbj extends zzaw {
    public final zzap zza(String str, zzg zzg, List<zzap> list) {
        if (str == null || str.isEmpty() || !zzg.zzd(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", new Object[]{str}));
        }
        zzap zzh = zzg.zzh(str);
        if (zzh instanceof zzai) {
            return ((zzai) zzh).zza(zzg, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", new Object[]{str}));
    }
}
