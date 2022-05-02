package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import id.dana.data.foundation.logger.log.DanaLogConstants;

public final class zzaf {
    public static final zzaf zza = new zzaf((Boolean) null, (Boolean) null);
    private final Boolean zzb;
    private final Boolean zzc;

    public zzaf(Boolean bool, Boolean bool2) {
        this.zzb = bool;
        this.zzc = bool2;
    }

    public static String zza(Bundle bundle) {
        String string = bundle.getString("ad_storage");
        if (string != null && zzo(string) == null) {
            return string;
        }
        String string2 = bundle.getString("analytics_storage");
        if (string2 == null || zzo(string2) != null) {
            return null;
        }
        return string2;
    }

    public static zzaf zzb(Bundle bundle) {
        if (bundle == null) {
            return zza;
        }
        return new zzaf(zzo(bundle.getString("ad_storage")), zzo(bundle.getString("analytics_storage")));
    }

    public static zzaf zzc(String str) {
        Boolean bool;
        Boolean bool2 = null;
        if (str != null) {
            Boolean zzp = str.length() >= 3 ? zzp(str.charAt(2)) : null;
            if (str.length() >= 4) {
                bool2 = zzp(str.charAt(3));
            }
            bool = bool2;
            bool2 = zzp;
        } else {
            bool = null;
        }
        return new zzaf(bool2, bool);
    }

    static Boolean zzj(Boolean bool, Boolean bool2) {
        if (bool == null) {
            return bool2;
        }
        if (bool2 == null) {
            return bool;
        }
        boolean z = false;
        if (bool.booleanValue() && bool2.booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static boolean zzm(int i, int i2) {
        return i <= i2;
    }

    static final int zzn(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    private static Boolean zzo(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals(DanaLogConstants.PushPermissionStatus.PUSH_DISABLED)) {
            return Boolean.FALSE;
        }
        return null;
    }

    private static Boolean zzp(char c) {
        if (c == '0') {
            return Boolean.FALSE;
        }
        if (c != '1') {
            return null;
        }
        return Boolean.TRUE;
    }

    private static final char zzq(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        return bool.booleanValue() ? '1' : '0';
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzaf)) {
            return false;
        }
        zzaf zzaf = (zzaf) obj;
        if (zzn(this.zzb) == zzn(zzaf.zzb) && zzn(this.zzc) == zzn(zzaf.zzc)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((zzn(this.zzb) + 527) * 31) + zzn(this.zzc);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ConsentSettings: ");
        sb.append("adStorage=");
        Boolean bool = this.zzb;
        String str2 = DanaLogConstants.PushPermissionStatus.PUSH_DISABLED;
        if (bool == null) {
            sb.append("uninitialized");
        } else {
            if (true != bool.booleanValue()) {
                str = str2;
            } else {
                str = "granted";
            }
            sb.append(str);
        }
        sb.append(", analyticsStorage=");
        Boolean bool2 = this.zzc;
        if (bool2 == null) {
            sb.append("uninitialized");
        } else {
            if (true == bool2.booleanValue()) {
                str2 = "granted";
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    public final String zzd() {
        return "G1" + zzq(this.zzb) + zzq(this.zzc);
    }

    public final Boolean zze() {
        return this.zzb;
    }

    public final boolean zzf() {
        Boolean bool = this.zzb;
        return bool == null || bool.booleanValue();
    }

    public final Boolean zzg() {
        return this.zzc;
    }

    public final boolean zzh() {
        Boolean bool = this.zzc;
        return bool == null || bool.booleanValue();
    }

    public final boolean zzi(zzaf zzaf) {
        if (this.zzb != Boolean.FALSE || zzaf.zzb == Boolean.FALSE) {
            return this.zzc == Boolean.FALSE && zzaf.zzc != Boolean.FALSE;
        }
        return true;
    }

    public final zzaf zzk(zzaf zzaf) {
        return new zzaf(zzj(this.zzb, zzaf.zzb), zzj(this.zzc, zzaf.zzc));
    }

    public final zzaf zzl(zzaf zzaf) {
        Boolean bool = this.zzb;
        if (bool == null) {
            bool = zzaf.zzb;
        }
        Boolean bool2 = this.zzc;
        if (bool2 == null) {
            bool2 = zzaf.zzc;
        }
        return new zzaf(bool, bool2);
    }
}
