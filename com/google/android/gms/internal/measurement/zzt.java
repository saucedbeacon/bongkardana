package com.google.android.gms.internal.measurement;

import com.iap.ac.android.acs.plugin.biz.region.foundation.RegionFoundationProxy;
import java.util.List;

public final class zzt extends zzai {
    /* access modifiers changed from: private */
    public final zzr zza;

    public zzt(zzr zzr) {
        super("internal.logger");
        this.zza = zzr;
        this.zze.put(RegionFoundationProxy.COMPONENT_LOG, new zzs(this, false, true));
        this.zze.put("silent", new zzp(this, "silent"));
        ((zzai) this.zze.get("silent")).zzm(RegionFoundationProxy.COMPONENT_LOG, new zzs(this, true, true));
        this.zze.put("unmonitored", new zzq(this, "unmonitored"));
        ((zzai) this.zze.get("unmonitored")).zzm(RegionFoundationProxy.COMPONENT_LOG, new zzs(this, false, false));
    }

    public final zzap zza(zzg zzg, List<zzap> list) {
        return zzap.zzf;
    }
}
