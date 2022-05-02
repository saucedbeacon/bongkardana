package com.google.android.gms.internal.firebase_ml;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class zzfn {
    private static final zzfn zzwh = new zzfn();
    private final String zzwi;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    zzfn() {
        /*
            r4 = this;
            java.lang.String r0 = "java.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r1 = "9"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x0011
            java.lang.String r0 = "9.0.0"
            goto L_0x0015
        L_0x0011:
            java.lang.String r0 = zzn(r0)
        L_0x0015:
            com.google.android.gms.internal.firebase_ml.zzlu r1 = com.google.android.gms.internal.firebase_ml.zzlu.zzafh
            java.lang.String r1 = r1.value()
            com.google.android.gms.internal.firebase_ml.zzlu r2 = com.google.android.gms.internal.firebase_ml.zzlu.zzafj
            java.lang.String r2 = r2.value()
            java.lang.String r3 = com.google.android.gms.internal.firebase_ml.zzfe.VERSION
            r4.<init>(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzfn.<init>():void");
    }

    private zzfn(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder("java/");
        sb.append(zzn(str));
        sb.append(" http-google-%s/");
        sb.append(zzn(str4));
        if (!(str2 == null || str3 == null)) {
            sb.append(" ");
            sb.append(zzm(str2));
            sb.append("/");
            sb.append(zzn(str3));
        }
        this.zzwi = sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final String zzl(String str) {
        return String.format(this.zzwi, new Object[]{zzm(str)});
    }

    /* access modifiers changed from: private */
    public static zzfn zzfa() {
        return zzwh;
    }

    private static String zzm(String str) {
        return str.toLowerCase().replaceAll("[^\\w\\d\\-]", "-");
    }

    private static String zzn(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("(\\d+\\.\\d+\\.\\d+).*").matcher(str);
        return matcher.find() ? matcher.group(1) : str;
    }
}
