package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzav extends zzaw {
    public zzav() {
        this.zza.add(zzbl.BITWISE_AND);
        this.zza.add(zzbl.BITWISE_LEFT_SHIFT);
        this.zza.add(zzbl.BITWISE_NOT);
        this.zza.add(zzbl.BITWISE_OR);
        this.zza.add(zzbl.BITWISE_RIGHT_SHIFT);
        this.zza.add(zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.zza.add(zzbl.BITWISE_XOR);
    }

    public final zzap zza(String str, zzg zzg, List<zzap> list) {
        zzbl zzbl = zzbl.ADD;
        switch (zzh.zze(str).ordinal()) {
            case 4:
                zzh.zza(zzbl.BITWISE_AND.name(), 2, list);
                return new zzah(Double.valueOf((double) (zzh.zzg(zzg.zza(list.get(0)).zzd().doubleValue()) & zzh.zzg(zzg.zza(list.get(1)).zzd().doubleValue()))));
            case 5:
                zzh.zza(zzbl.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new zzah(Double.valueOf((double) (zzh.zzg(zzg.zza(list.get(0)).zzd().doubleValue()) << ((int) (zzh.zzh(zzg.zza(list.get(1)).zzd().doubleValue()) & 31)))));
            case 6:
                zzh.zza(zzbl.BITWISE_NOT.name(), 1, list);
                return new zzah(Double.valueOf((double) (zzh.zzg(zzg.zza(list.get(0)).zzd().doubleValue()) ^ -1)));
            case 7:
                zzh.zza(zzbl.BITWISE_OR.name(), 2, list);
                return new zzah(Double.valueOf((double) (zzh.zzg(zzg.zza(list.get(0)).zzd().doubleValue()) | zzh.zzg(zzg.zza(list.get(1)).zzd().doubleValue()))));
            case 8:
                zzh.zza(zzbl.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new zzah(Double.valueOf((double) (zzh.zzg(zzg.zza(list.get(0)).zzd().doubleValue()) >> ((int) (zzh.zzh(zzg.zza(list.get(1)).zzd().doubleValue()) & 31)))));
            case 9:
                zzh.zza(zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new zzah(Double.valueOf((double) (zzh.zzh(zzg.zza(list.get(0)).zzd().doubleValue()) >>> ((int) (zzh.zzh(zzg.zza(list.get(1)).zzd().doubleValue()) & 31)))));
            case 10:
                zzh.zza(zzbl.BITWISE_XOR.name(), 2, list);
                return new zzah(Double.valueOf((double) (zzh.zzg(zzg.zza(list.get(0)).zzd().doubleValue()) ^ zzh.zzg(zzg.zza(list.get(1)).zzd().doubleValue()))));
            default:
                return super.zzb(str);
        }
    }
}
