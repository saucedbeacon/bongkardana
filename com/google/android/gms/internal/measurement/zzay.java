package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzay extends zzaw {
    public zzay() {
        this.zza.add(zzbl.EQUALS);
        this.zza.add(zzbl.GREATER_THAN);
        this.zza.add(zzbl.GREATER_THAN_EQUALS);
        this.zza.add(zzbl.IDENTITY_EQUALS);
        this.zza.add(zzbl.IDENTITY_NOT_EQUALS);
        this.zza.add(zzbl.LESS_THAN);
        this.zza.add(zzbl.LESS_THAN_EQUALS);
        this.zza.add(zzbl.NOT_EQUALS);
    }

    private static boolean zzc(zzap zzap, zzap zzap2) {
        if (zzap instanceof zzal) {
            zzap = new zzat(zzap.zzc());
        }
        if (zzap2 instanceof zzal) {
            zzap2 = new zzat(zzap2.zzc());
        }
        if ((zzap instanceof zzat) && (zzap2 instanceof zzat)) {
            return zzap.zzc().compareTo(zzap2.zzc()) < 0;
        }
        double doubleValue = zzap.zzd().doubleValue();
        double doubleValue2 = zzap2.zzd().doubleValue();
        return !Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && Double.compare(doubleValue, doubleValue2) < 0;
    }

    private static boolean zzd(zzap zzap, zzap zzap2) {
        if (zzap.getClass().equals(zzap2.getClass())) {
            if ((zzap instanceof zzau) || (zzap instanceof zzan)) {
                return true;
            }
            if (zzap instanceof zzah) {
                if (Double.isNaN(zzap.zzd().doubleValue()) || Double.isNaN(zzap2.zzd().doubleValue())) {
                    return false;
                }
                return zzap.zzd().equals(zzap2.zzd());
            } else if (zzap instanceof zzat) {
                return zzap.zzc().equals(zzap2.zzc());
            } else {
                if (zzap instanceof zzaf) {
                    return zzap.zze().equals(zzap2.zze());
                }
                return zzap == zzap2;
            }
        } else if (((zzap instanceof zzau) || (zzap instanceof zzan)) && ((zzap2 instanceof zzau) || (zzap2 instanceof zzan))) {
            return true;
        } else {
            boolean z = zzap instanceof zzah;
            if (z && (zzap2 instanceof zzat)) {
                return zzd(zzap, new zzah(zzap2.zzd()));
            }
            boolean z2 = zzap instanceof zzat;
            if (z2 && (zzap2 instanceof zzah)) {
                return zzd(new zzah(zzap.zzd()), zzap2);
            }
            if (zzap instanceof zzaf) {
                return zzd(new zzah(zzap.zzd()), zzap2);
            }
            if (zzap2 instanceof zzaf) {
                return zzd(zzap, new zzah(zzap2.zzd()));
            }
            if ((z2 || z) && (zzap2 instanceof zzal)) {
                return zzd(zzap, new zzat(zzap2.zzc()));
            }
            if (!(zzap instanceof zzal) || (!(zzap2 instanceof zzat) && !(zzap2 instanceof zzah))) {
                return false;
            }
            return zzd(new zzat(zzap.zzc()), zzap2);
        }
    }

    private static boolean zze(zzap zzap, zzap zzap2) {
        if (zzap instanceof zzal) {
            zzap = new zzat(zzap.zzc());
        }
        if (zzap2 instanceof zzal) {
            zzap2 = new zzat(zzap2.zzc());
        }
        if (((!(zzap instanceof zzat) || !(zzap2 instanceof zzat)) && (Double.isNaN(zzap.zzd().doubleValue()) || Double.isNaN(zzap2.zzd().doubleValue()))) || zzc(zzap2, zzap)) {
            return false;
        }
        return true;
    }

    public final zzap zza(String str, zzg zzg, List<zzap> list) {
        boolean z;
        boolean zzd;
        zzh.zza(zzh.zze(str).name(), 2, list);
        zzap zza = zzg.zza(list.get(0));
        zzap zza2 = zzg.zza(list.get(1));
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal != 23) {
            if (ordinal == 48) {
                zzd = zzd(zza, zza2);
            } else if (ordinal == 42) {
                z = zzc(zza, zza2);
            } else if (ordinal != 43) {
                switch (ordinal) {
                    case 37:
                        z = zzc(zza2, zza);
                        break;
                    case 38:
                        z = zze(zza2, zza);
                        break;
                    case 39:
                        z = zzh.zzf(zza, zza2);
                        break;
                    case 40:
                        zzd = zzh.zzf(zza, zza2);
                        break;
                    default:
                        return super.zzb(str);
                }
            } else {
                z = zze(zza, zza2);
            }
            z = !zzd;
        } else {
            z = zzd(zza, zza2);
        }
        return z ? zzap.zzk : zzap.zzl;
    }
}
