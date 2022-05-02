package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.zzfj;
import com.google.android.gms.internal.measurement.zzfk;
import com.google.android.gms.internal.measurement.zzfl;
import com.google.android.gms.internal.measurement.zzfm;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzge;
import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.internal.measurement.zzog;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o.PlaybackStateCompat;

final class zzt {
    final /* synthetic */ zzy zza;
    private String zzb;
    private boolean zzc;
    private zzgd zzd;
    /* access modifiers changed from: private */
    public BitSet zze;
    private BitSet zzf;
    private Map<Integer, Long> zzg;
    private Map<Integer, List<Long>> zzh;

    /* synthetic */ zzt(zzy zzy, String str, zzs zzs) {
        this.zza = zzy;
        this.zzb = str;
        this.zzc = true;
        this.zze = new BitSet();
        this.zzf = new BitSet();
        this.zzg = new PlaybackStateCompat();
        this.zzh = new PlaybackStateCompat();
    }

    /* access modifiers changed from: package-private */
    public final void zza(@NonNull zzw zzw) {
        int zza2 = zzw.zza();
        Boolean bool = zzw.zzd;
        if (bool != null) {
            this.zzf.set(zza2, bool.booleanValue());
        }
        Boolean bool2 = zzw.zze;
        if (bool2 != null) {
            this.zze.set(zza2, bool2.booleanValue());
        }
        if (zzw.zzf != null) {
            Map<Integer, Long> map = this.zzg;
            Integer valueOf = Integer.valueOf(zza2);
            Long l = map.get(valueOf);
            long longValue = zzw.zzf.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.zzg.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (zzw.zzg != null) {
            Map<Integer, List<Long>> map2 = this.zzh;
            Integer valueOf2 = Integer.valueOf(zza2);
            List list = map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.zzh.put(valueOf2, list);
            }
            if (zzw.zzb()) {
                list.clear();
            }
            zzog.zzb();
            if (this.zza.zzs.zzc().zzn(this.zzb, zzea.zzZ) && zzw.zzc()) {
                list.clear();
            }
            zzog.zzb();
            if (this.zza.zzs.zzc().zzn(this.zzb, zzea.zzZ)) {
                Long valueOf3 = Long.valueOf(zzw.zzg.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(zzw.zzg.longValue() / 1000));
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final zzfk zzb(int i) {
        ArrayList arrayList;
        List list;
        zzfj zzh2 = zzfk.zzh();
        zzh2.zza(i);
        zzh2.zzd(this.zzc);
        zzgd zzgd = this.zzd;
        if (zzgd != null) {
            zzh2.zzc(zzgd);
        }
        zzgc zzk = zzgd.zzk();
        zzk.zzc(zzkp.zzn(this.zze));
        zzk.zza(zzkp.zzn(this.zzf));
        Map<Integer, Long> map = this.zzg;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer intValue : this.zzg.keySet()) {
                int intValue2 = intValue.intValue();
                Long l = this.zzg.get(Integer.valueOf(intValue2));
                if (l != null) {
                    zzfl zze2 = zzfm.zze();
                    zze2.zza(intValue2);
                    zze2.zzb(l.longValue());
                    arrayList2.add((zzfm) zze2.zzaA());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zzk.zze(arrayList);
        }
        Map<Integer, List<Long>> map2 = this.zzh;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer next : this.zzh.keySet()) {
                zzge zzf2 = zzgf.zzf();
                zzf2.zza(next.intValue());
                List list2 = this.zzh.get(next);
                if (list2 != null) {
                    Collections.sort(list2);
                    zzf2.zzb(list2);
                }
                arrayList3.add((zzgf) zzf2.zzaA());
            }
            list = arrayList3;
        }
        zzk.zzg(list);
        zzh2.zzb(zzk);
        return (zzfk) zzh2.zzaA();
    }

    /* synthetic */ zzt(zzy zzy, String str, zzgd zzgd, BitSet bitSet, BitSet bitSet2, Map map, Map map2, zzs zzs) {
        this.zza = zzy;
        this.zzb = str;
        this.zze = bitSet;
        this.zzf = bitSet2;
        this.zzg = map;
        this.zzh = new PlaybackStateCompat();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.zzh.put(num, arrayList);
        }
        this.zzc = false;
        this.zzd = zzgd;
    }
}
