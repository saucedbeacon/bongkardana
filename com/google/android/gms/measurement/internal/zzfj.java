package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzr;
import java.util.List;

final class zzfj implements zzr {
    final /* synthetic */ zzfl zza;

    zzfj(zzfl zzfl) {
        this.zza = zzfl;
    }

    public final void zza(int i, String str, List<String> list, boolean z, boolean z2) {
        zzek zzek;
        int i2 = i - 1;
        if (i2 == 0) {
            zzek = this.zza.zzs.zzau().zzj();
        } else if (i2 != 1) {
            if (i2 == 3) {
                zzek = this.zza.zzs.zzau().zzk();
            } else if (i2 != 4) {
                zzek = this.zza.zzs.zzau().zzi();
            } else if (z) {
                zzek = this.zza.zzs.zzau().zzf();
            } else if (!z2) {
                zzek = this.zza.zzs.zzau().zzh();
            } else {
                zzek = this.zza.zzs.zzau().zze();
            }
        } else if (z) {
            zzek = this.zza.zzs.zzau().zzc();
        } else if (!z2) {
            zzek = this.zza.zzs.zzau().zzd();
        } else {
            zzek = this.zza.zzs.zzau().zzb();
        }
        int size = list.size();
        if (size == 1) {
            zzek.zzb(str, list.get(0));
        } else if (size == 2) {
            zzek.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzek.zza(str);
        } else {
            zzek.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
