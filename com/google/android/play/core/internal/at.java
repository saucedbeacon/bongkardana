package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import androidx.annotation.Nullable;
import com.google.android.play.core.splitcompat.c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;

public final class at {

    /* renamed from: a  reason: collision with root package name */
    private final c f9582a;
    private final Context b;
    private final av c;

    public at(Context context, c cVar, av avVar, byte[] bArr) {
        this.f9582a = cVar;
        this.c = avVar;
        this.b = context;
    }

    @Nullable
    private static X509Certificate a(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException unused) {
            return null;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r11 = this;
            r0 = 0
            com.google.android.play.core.splitcompat.c r1 = r11.f9582a     // Catch:{ IOException -> 0x0096 }
            java.io.File r1 = r1.c()     // Catch:{ IOException -> 0x0096 }
            r2 = 0
            android.content.Context r3 = r11.b     // Catch:{ NameNotFoundException -> 0x001d }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x001d }
            android.content.Context r4 = r11.b     // Catch:{ NameNotFoundException -> 0x001d }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x001d }
            r5 = 64
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x001d }
            android.content.pm.Signature[] r3 = r3.signatures     // Catch:{ NameNotFoundException -> 0x001d }
            goto L_0x001e
        L_0x001d:
            r3 = r2
        L_0x001e:
            if (r3 != 0) goto L_0x0021
            goto L_0x0038
        L_0x0021:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r4 = r3.length
            r5 = 0
        L_0x0028:
            if (r5 >= r4) goto L_0x0038
            r6 = r3[r5]
            java.security.cert.X509Certificate r6 = a((android.content.pm.Signature) r6)
            if (r6 == 0) goto L_0x0035
            r2.add(r6)
        L_0x0035:
            int r5 = r5 + 1
            goto L_0x0028
        L_0x0038:
            if (r2 == 0) goto L_0x0096
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0041
            goto L_0x0096
        L_0x0041:
            java.io.File[] r1 = r1.listFiles()
            java.util.Arrays.sort(r1)
            int r3 = r1.length
        L_0x0049:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0095
            r4 = r1[r3]
            java.lang.String r5 = r4.getAbsolutePath()     // Catch:{ Exception -> 0x0094 }
            java.security.cert.X509Certificate[][] r5 = com.google.android.play.core.internal.h.a((java.lang.String) r5)     // Catch:{  }
            if (r5 == 0) goto L_0x0094
            int r6 = r5.length     // Catch:{ Exception -> 0x0094 }
            if (r6 == 0) goto L_0x0094
            r6 = r5[r0]     // Catch:{ Exception -> 0x0094 }
            int r6 = r6.length     // Catch:{ Exception -> 0x0094 }
            if (r6 != 0) goto L_0x0062
            goto L_0x0094
        L_0x0062:
            boolean r6 = r2.isEmpty()     // Catch:{ Exception -> 0x0094 }
            if (r6 == 0) goto L_0x0069
            goto L_0x0094
        L_0x0069:
            java.util.Iterator r6 = r2.iterator()     // Catch:{ Exception -> 0x0094 }
        L_0x006d:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x0094 }
            if (r7 == 0) goto L_0x008a
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x0094 }
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7     // Catch:{ Exception -> 0x0094 }
            int r8 = r5.length     // Catch:{ Exception -> 0x0094 }
            r9 = 0
        L_0x007b:
            if (r9 >= r8) goto L_0x0094
            r10 = r5[r9]     // Catch:{ Exception -> 0x0094 }
            r10 = r10[r0]     // Catch:{ Exception -> 0x0094 }
            boolean r10 = r10.equals(r7)     // Catch:{ Exception -> 0x0094 }
            if (r10 != 0) goto L_0x006d
            int r9 = r9 + 1
            goto L_0x007b
        L_0x008a:
            com.google.android.play.core.splitcompat.c r5 = r11.f9582a     // Catch:{  }
            java.io.File r5 = r5.a((java.io.File) r4)     // Catch:{  }
            r4.renameTo(r5)     // Catch:{  }
            goto L_0x0049
        L_0x0094:
            return r0
        L_0x0095:
            r0 = 1
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.at.a():boolean");
    }

    public final boolean a(List<Intent> list) throws IOException {
        for (Intent stringExtra : list) {
            if (!this.f9582a.b(stringExtra.getStringExtra("split_id")).exists()) {
                return false;
            }
        }
        return true;
    }
}
