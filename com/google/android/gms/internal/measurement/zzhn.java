package com.google.android.gms.internal.measurement;

import android.util.Log;

final class zzhn extends zzht<Long> {
    zzhn(zzhr zzhr, String str, Long l, boolean z) {
        super(zzhr, str, l, true, (zzhn) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String zzd = super.zzd();
            String str = (String) obj;
            StringBuilder sb = new StringBuilder(String.valueOf(zzd).length() + 25 + str.length());
            sb.append("Invalid long value for ");
            sb.append(zzd);
            sb.append(": ");
            sb.append(str);
            Log.e("PhenotypeFlag", sb.toString());
            return null;
        }
    }
}
