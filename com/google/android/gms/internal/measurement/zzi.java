package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public final class zzi {
    public static zzap zza(Object obj) {
        if (obj == null) {
            return zzap.zzg;
        }
        if (obj instanceof String) {
            return new zzat((String) obj);
        }
        if (obj instanceof Double) {
            return new zzah((Double) obj);
        }
        if (obj instanceof Long) {
            return new zzah(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new zzah(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new zzaf((Boolean) obj);
        }
        throw new IllegalArgumentException("Invalid value type");
    }

    public static zzap zzb(zzgt zzgt) {
        if (zzgt == null) {
            return zzap.zzf;
        }
        zzgs zzgs = zzgs.UNKNOWN;
        int ordinal = zzgt.zza().ordinal();
        if (ordinal == 0) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        List<zzgt> zzb = zzgt.zzb();
                        ArrayList arrayList = new ArrayList();
                        for (zzgt zzb2 : zzb) {
                            arrayList.add(zzb(zzb2));
                        }
                        return new zzaq(zzgt.zzc(), arrayList);
                    }
                    String valueOf = String.valueOf(zzgt);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
                    sb.append("Invalid entity: ");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                } else if (zzgt.zzf()) {
                    return new zzaf(Boolean.valueOf(zzgt.zzg()));
                } else {
                    return new zzaf((Boolean) null);
                }
            } else if (zzgt.zzh()) {
                return new zzah(Double.valueOf(zzgt.zzi()));
            } else {
                return new zzah((Double) null);
            }
        } else if (zzgt.zzd()) {
            return new zzat(zzgt.zze());
        } else {
            return zzap.zzm;
        }
    }
}
