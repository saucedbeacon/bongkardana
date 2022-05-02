package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzep;
import com.google.android.gms.internal.measurement.zzeq;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzex;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

abstract class zzw {
    final String zzb;
    final int zzc;
    Boolean zzd;
    Boolean zze;
    Long zzf;
    Long zzg;

    zzw(String str, int i) {
        this.zzb = str;
        this.zzc = i;
    }

    private static Boolean zzd(String str, zzew zzew, boolean z, String str2, List<String> list, String str3, zzem zzem) {
        if (zzew == zzew.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && zzew != zzew.zzb) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        zzep zzep = zzep.UNKNOWN_COMPARISON_TYPE;
        switch (zzew.ordinal()) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (zzem != null) {
                        zzem.zze().zzb("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    @VisibleForTesting
    static Boolean zze(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    @VisibleForTesting
    static Boolean zzf(String str, zzex zzex, zzem zzem) {
        String str2;
        List<String> list;
        Preconditions.checkNotNull(zzex);
        if (str == null || !zzex.zza() || zzex.zzb() == zzew.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (zzex.zzb() == zzew.IN_LIST) {
            if (zzex.zzh() == 0) {
                return null;
            }
        } else if (!zzex.zzc()) {
            return null;
        }
        zzew zzb2 = zzex.zzb();
        boolean zzf2 = zzex.zzf();
        if (zzf2 || zzb2 == zzew.zzb || zzb2 == zzew.IN_LIST) {
            str2 = zzex.zzd();
        } else {
            str2 = zzex.zzd().toUpperCase(Locale.ENGLISH);
        }
        String str3 = str2;
        if (zzex.zzh() == 0) {
            list = null;
        } else {
            List<String> zzg2 = zzex.zzg();
            if (!zzf2) {
                ArrayList arrayList = new ArrayList(zzg2.size());
                for (String upperCase : zzg2) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                zzg2 = Collections.unmodifiableList(arrayList);
            }
            list = zzg2;
        }
        return zzd(str, zzb2, zzf2, str3, list, zzb2 == zzew.zzb ? str3 : null, zzem);
    }

    static Boolean zzg(long j, zzeq zzeq) {
        try {
            return zzj(new BigDecimal(j), zzeq, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean zzh(double d, zzeq zzeq) {
        try {
            return zzj(new BigDecimal(d), zzeq, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static Boolean zzi(String str, zzeq zzeq) {
        if (!zzkp.zzl(str)) {
            return null;
        }
        try {
            return zzj(new BigDecimal(str), zzeq, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @VisibleForTesting
    static Boolean zzj(BigDecimal bigDecimal, zzeq zzeq, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Preconditions.checkNotNull(zzeq);
        if (zzeq.zza() && zzeq.zzb() != zzep.UNKNOWN_COMPARISON_TYPE) {
            if (zzeq.zzb() == zzep.BETWEEN) {
                if (!zzeq.zzg() || !zzeq.zzi()) {
                    return null;
                }
            } else if (!zzeq.zze()) {
                return null;
            }
            zzep zzb2 = zzeq.zzb();
            if (zzeq.zzb() == zzep.BETWEEN) {
                if (zzkp.zzl(zzeq.zzh()) && zzkp.zzl(zzeq.zzj())) {
                    try {
                        BigDecimal bigDecimal5 = new BigDecimal(zzeq.zzh());
                        bigDecimal3 = new BigDecimal(zzeq.zzj());
                        bigDecimal2 = bigDecimal5;
                        bigDecimal4 = null;
                    } catch (NumberFormatException unused) {
                    }
                }
                return null;
            } else if (!zzkp.zzl(zzeq.zzf())) {
                return null;
            } else {
                try {
                    bigDecimal4 = new BigDecimal(zzeq.zzf());
                    bigDecimal2 = null;
                    bigDecimal3 = null;
                } catch (NumberFormatException unused2) {
                }
            }
            if (zzb2 == zzep.BETWEEN) {
                if (bigDecimal2 == null) {
                    return null;
                }
            } else if (bigDecimal4 == null) {
                return null;
            }
            zzew zzew = zzew.UNKNOWN_MATCH_TYPE;
            int ordinal = zzb2.ordinal();
            boolean z = true;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4 || bigDecimal2 == null) {
                            return null;
                        }
                        if (bigDecimal.compareTo(bigDecimal2) < 0 || bigDecimal.compareTo(bigDecimal3) > 0) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    } else if (bigDecimal4 == null) {
                        return null;
                    } else {
                        if (d != 0.0d) {
                            if (bigDecimal.compareTo(bigDecimal4.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal4.add(new BigDecimal(d).multiply(new BigDecimal(2)))) >= 0) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                        if (bigDecimal.compareTo(bigDecimal4) != 0) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                } else if (bigDecimal4 == null) {
                    return null;
                } else {
                    if (bigDecimal.compareTo(bigDecimal4) <= 0) {
                        z = false;
                    }
                    return Boolean.valueOf(z);
                }
            } else if (bigDecimal4 == null) {
                return null;
            } else {
                if (bigDecimal.compareTo(bigDecimal4) >= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public abstract int zza();

    /* access modifiers changed from: package-private */
    public abstract boolean zzb();

    /* access modifiers changed from: package-private */
    public abstract boolean zzc();
}
