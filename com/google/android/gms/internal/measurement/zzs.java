package com.google.android.gms.internal.measurement;

import com.iap.ac.android.acs.plugin.biz.region.foundation.RegionFoundationProxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class zzs extends zzai {
    final boolean zza;
    final boolean zzb;
    final /* synthetic */ zzt zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzs(zzt zzt, boolean z, boolean z2) {
        super(RegionFoundationProxy.COMPONENT_LOG);
        this.zzc = zzt;
        this.zza = z;
        this.zzb = z2;
    }

    public final zzap zza(zzg zzg, List<zzap> list) {
        zzh.zzb(RegionFoundationProxy.COMPONENT_LOG, 1, list);
        if (list.size() == 1) {
            this.zzc.zza.zza(3, zzg.zza(list.get(0)).zzc(), Collections.emptyList(), this.zza, this.zzb);
            return zzf;
        }
        int zzg2 = zzh.zzg(zzg.zza(list.get(0)).zzd().doubleValue());
        int i = zzg2 != 2 ? zzg2 != 3 ? zzg2 != 5 ? zzg2 != 6 ? 3 : 2 : 5 : 1 : 4;
        String zzc2 = zzg.zza(list.get(1)).zzc();
        if (list.size() == 2) {
            this.zzc.zza.zza(i, zzc2, Collections.emptyList(), this.zza, this.zzb);
            return zzf;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 2; i2 < Math.min(list.size(), 5); i2++) {
            arrayList.add(zzg.zza(list.get(i2)).zzc());
        }
        this.zzc.zza.zza(i, zzc2, arrayList, this.zza, this.zzb);
        return zzf;
    }
}
