package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@ShowFirstParty
@CheckReturnValue
@KeepForSdk
public class GoogleSignatureVerifier {
    @Nullable
    private static GoogleSignatureVerifier zza;
    private final Context zzb;
    private volatile String zzc;

    private GoogleSignatureVerifier(Context context) {
        this.zzb = context.getApplicationContext();
    }

    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            if (zza == null) {
                zzc.zza(context);
                zza = new GoogleSignatureVerifier(context);
            }
        }
        return zza;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.google.android.gms.common.zzl} */
    /* JADX WARNING: Multi-variable type inference failed */
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isUidGoogleSigned(int r6) {
        /*
            r5 = this;
            android.content.Context r0 = r5.zzb
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)
            java.lang.String[] r0 = r0.zza(r6)
            if (r0 == 0) goto L_0x002b
            int r1 = r0.length
            if (r1 != 0) goto L_0x0010
            goto L_0x002b
        L_0x0010:
            r1 = 0
            int r2 = r0.length
            r3 = 0
        L_0x0013:
            if (r3 >= r2) goto L_0x0023
            r1 = r0[r3]
            com.google.android.gms.common.zzl r1 = r5.zza((java.lang.String) r1, (int) r6)
            boolean r4 = r1.zza
            if (r4 == 0) goto L_0x0020
            goto L_0x0031
        L_0x0020:
            int r3 = r3 + 1
            goto L_0x0013
        L_0x0023:
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            r1 = r6
            com.google.android.gms.common.zzl r1 = (com.google.android.gms.common.zzl) r1
            goto L_0x0031
        L_0x002b:
            java.lang.String r6 = "no pkgs"
            com.google.android.gms.common.zzl r1 = com.google.android.gms.common.zzl.zza((java.lang.String) r6)
        L_0x0031:
            r1.zzc()
            boolean r6 = r1.zza
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleSignatureVerifier.isUidGoogleSigned(int):boolean");
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean isPackageGoogleSigned(String str) {
        zzl zza2 = zza(str);
        zza2.zzc();
        return zza2.zza;
    }

    public static boolean zza(PackageInfo packageInfo, boolean z) {
        zzd zzd;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                zzd = zza(packageInfo, zzi.zza);
            } else {
                zzd = zza(packageInfo, zzi.zza[0]);
            }
            if (zzd != null) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    public boolean isGooglePublicSignedPackage(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zza(packageInfo, false)) {
            return true;
        }
        return zza(packageInfo, true) && GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb);
    }

    private final zzl zza(String str, int i) {
        try {
            PackageInfo zza2 = Wrappers.packageManager(this.zzb).zza(str, 64, i);
            boolean honorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb);
            if (zza2 == null) {
                return zzl.zza("null pkg");
            }
            if (zza2.signatures != null) {
                if (zza2.signatures.length == 1) {
                    zzg zzg = new zzg(zza2.signatures[0].toByteArray());
                    String str2 = zza2.packageName;
                    zzl zza3 = zzc.zza(str2, zzg, honorsDebugCertificates, false);
                    if (!zza3.zza || zza2.applicationInfo == null || (zza2.applicationInfo.flags & 2) == 0 || !zzc.zza(str2, zzg, false, true).zza) {
                        return zza3;
                    }
                    return zzl.zza("debuggable release cert app rejected");
                }
            }
            return zzl.zza("single cert required");
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf = String.valueOf(str);
            return zzl.zza(valueOf.length() != 0 ? "no pkg ".concat(valueOf) : new String("no pkg "));
        }
    }

    private final zzl zza(String str) {
        zzl zzl;
        if (str == null) {
            return zzl.zza("null pkg");
        }
        if (str.equals(this.zzc)) {
            return zzl.zza();
        }
        try {
            PackageInfo packageInfo = Wrappers.packageManager(this.zzb).getPackageInfo(str, 64);
            boolean honorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb);
            if (packageInfo == null) {
                zzl = zzl.zza("null pkg");
            } else if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                zzl = zzl.zza("single cert required");
            } else {
                zzg zzg = new zzg(packageInfo.signatures[0].toByteArray());
                String str2 = packageInfo.packageName;
                zzl zza2 = zzc.zza(str2, zzg, honorsDebugCertificates, false);
                zzl = (!zza2.zza || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || !zzc.zza(str2, zzg, false, true).zza) ? zza2 : zzl.zza("debuggable release cert app rejected");
            }
            if (zzl.zza) {
                this.zzc = str;
            }
            return zzl;
        } catch (PackageManager.NameNotFoundException unused) {
            String valueOf = String.valueOf(str);
            return zzl.zza(valueOf.length() != 0 ? "no pkg ".concat(valueOf) : new String("no pkg "));
        }
    }

    @Nullable
    private static zzd zza(PackageInfo packageInfo, zzd... zzdArr) {
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
            return null;
        }
        zzg zzg = new zzg(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < zzdArr.length; i++) {
            if (zzdArr[i].equals(zzg)) {
                return zzdArr[i];
            }
        }
        return null;
    }
}
