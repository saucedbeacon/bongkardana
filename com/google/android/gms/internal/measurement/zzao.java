package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public final class zzao extends zzai implements zzal {
    protected final List<String> zza;
    protected final List<zzap> zzb;
    protected zzg zzc;

    private zzao(zzao zzao) {
        super(zzao.zzd);
        ArrayList arrayList = new ArrayList(zzao.zza.size());
        this.zza = arrayList;
        arrayList.addAll(zzao.zza);
        ArrayList arrayList2 = new ArrayList(zzao.zzb.size());
        this.zzb = arrayList2;
        arrayList2.addAll(zzao.zzb);
        this.zzc = zzao.zzc;
    }

    public final zzap zza(zzg zzg, List<zzap> list) {
        zzg zzc2 = this.zzc.zzc();
        for (int i = 0; i < this.zza.size(); i++) {
            if (i < list.size()) {
                zzc2.zzf(this.zza.get(i), zzg.zza(list.get(i)));
            } else {
                zzc2.zzf(this.zza.get(i), zzf);
            }
        }
        for (zzap next : this.zzb) {
            zzap zza2 = zzc2.zza(next);
            if (zza2 instanceof zzaq) {
                zza2 = zzc2.zza(next);
            }
            if (zza2 instanceof zzag) {
                return ((zzag) zza2).zzb();
            }
        }
        return zzap.zzf;
    }

    public final zzap zzt() {
        return new zzao(this);
    }

    public zzao(String str, List<zzap> list, List<zzap> list2, zzg zzg) {
        super(str);
        this.zza = new ArrayList();
        this.zzc = zzg;
        if (!list.isEmpty()) {
            for (zzap zzc2 : list) {
                this.zza.add(zzc2.zzc());
            }
        }
        this.zzb = new ArrayList(list2);
    }
}
