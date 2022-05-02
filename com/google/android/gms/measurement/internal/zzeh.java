package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class zzeh extends zzgo {
    protected static final AtomicReference<String[]> zza = new AtomicReference<>();
    protected static final AtomicReference<String[]> zzb = new AtomicReference<>();
    protected static final AtomicReference<String[]> zzc = new AtomicReference<>();

    zzeh(zzfu zzfu) {
        super(zzfu);
    }

    private static final String zzi(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (zzku.zzS(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    str2 = strArr3[i];
                    if (str2 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr3[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public final boolean zza() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean zzb() {
        this.zzs.zzat();
        return this.zzs.zzq() && Log.isLoggable(this.zzs.zzau().zzn(), 3);
    }

    /* access modifiers changed from: protected */
    public final String zzc(String str) {
        if (str == null) {
            return null;
        }
        if (!zzb()) {
            return str;
        }
        return zzi(str, zzgr.zzc, zzgr.zza, zza);
    }

    /* access modifiers changed from: protected */
    public final String zzd(String str) {
        if (str == null) {
            return null;
        }
        if (!zzb()) {
            return str;
        }
        return zzi(str, zzgs.zzb, zzgs.zza, zzb);
    }

    /* access modifiers changed from: protected */
    public final String zze(String str) {
        if (str == null) {
            return null;
        }
        if (!zzb()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return zzi(str, zzgt.zzb, zzgt.zza, zzc);
        }
        return "experiment_id(" + str + ")";
    }

    /* access modifiers changed from: protected */
    public final String zzf(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        if (!zzb()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str2 : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(zzd(str2));
            sb.append(SimpleComparison.EQUAL_TO_OPERATION);
            Object obj = bundle.get(str2);
            if (obj instanceof Bundle) {
                str = zzh(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                str = zzh((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                str = zzh(((ArrayList) obj).toArray());
            } else {
                str = String.valueOf(obj);
            }
            sb.append(str);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String zzh(Object[] objArr) {
        String str;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Bundle bundle : objArr) {
            if (bundle instanceof Bundle) {
                str = zzf(bundle);
            } else {
                str = String.valueOf(bundle);
            }
            if (str != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(str);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
