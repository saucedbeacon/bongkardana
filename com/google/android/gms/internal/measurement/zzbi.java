package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzbi extends zzaw {
    protected zzbi() {
        this.zza.add(zzbl.ADD);
        this.zza.add(zzbl.DIVIDE);
        this.zza.add(zzbl.MODULUS);
        this.zza.add(zzbl.MULTIPLY);
        this.zza.add(zzbl.NEGATE);
        this.zza.add(zzbl.POST_DECREMENT);
        this.zza.add(zzbl.POST_INCREMENT);
        this.zza.add(zzbl.PRE_DECREMENT);
        this.zza.add(zzbl.PRE_INCREMENT);
        this.zza.add(zzbl.SUBTRACT);
    }

    public final zzap zza(String str, zzg zzg, List<zzap> list) {
        zzbl zzbl = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal == 0) {
            zzh.zza(zzbl.ADD.name(), 2, list);
            zzap zza = zzg.zza(list.get(0));
            zzap zza2 = zzg.zza(list.get(1));
            if (!(zza instanceof zzal) && !(zza instanceof zzat) && !(zza2 instanceof zzal) && !(zza2 instanceof zzat)) {
                return new zzah(Double.valueOf(zza.zzd().doubleValue() + zza2.zzd().doubleValue()));
            }
            String valueOf = String.valueOf(zza.zzc());
            String valueOf2 = String.valueOf(zza2.zzc());
            return new zzat(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        } else if (ordinal == 21) {
            zzh.zza(zzbl.DIVIDE.name(), 2, list);
            return new zzah(Double.valueOf(zzg.zza(list.get(0)).zzd().doubleValue() / zzg.zza(list.get(1)).zzd().doubleValue()));
        } else if (ordinal == 59) {
            zzh.zza(zzbl.SUBTRACT.name(), 2, list);
            return new zzah(Double.valueOf(zzg.zza(list.get(0)).zzd().doubleValue() + new zzah(Double.valueOf(-zzg.zza(list.get(1)).zzd().doubleValue())).zzd().doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            zzh.zza(str, 2, list);
            zzap zza3 = zzg.zza(list.get(0));
            zzg.zza(list.get(1));
            return zza3;
        } else if (ordinal == 55 || ordinal == 56) {
            zzh.zza(str, 1, list);
            return zzg.zza(list.get(0));
        } else {
            switch (ordinal) {
                case 44:
                    zzh.zza(zzbl.MODULUS.name(), 2, list);
                    return new zzah(Double.valueOf(zzg.zza(list.get(0)).zzd().doubleValue() % zzg.zza(list.get(1)).zzd().doubleValue()));
                case 45:
                    zzh.zza(zzbl.MULTIPLY.name(), 2, list);
                    return new zzah(Double.valueOf(zzg.zza(list.get(0)).zzd().doubleValue() * zzg.zza(list.get(1)).zzd().doubleValue()));
                case 46:
                    zzh.zza(zzbl.NEGATE.name(), 1, list);
                    return new zzah(Double.valueOf(-zzg.zza(list.get(0)).zzd().doubleValue()));
                default:
                    return super.zzb(str);
            }
        }
    }
}
