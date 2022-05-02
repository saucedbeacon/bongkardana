package com.appsflyer;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import com.iap.ac.android.gol.google.supergw.SuperGwUtils;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;

class AFKeystoreWrapper {

    /* renamed from: ˊ  reason: contains not printable characters */
    KeyStore f8565;

    /* renamed from: ˋ  reason: contains not printable characters */
    String f8566;

    /* renamed from: ˎ  reason: contains not printable characters */
    private Context f8567;

    /* renamed from: ˏ  reason: contains not printable characters */
    final Object f8568 = new Object();

    /* renamed from: ॱ  reason: contains not printable characters */
    int f8569;

    public AFKeystoreWrapper(Context context) {
        this.f8567 = context;
        this.f8566 = "";
        this.f8569 = 0;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            this.f8565 = instance;
            instance.load((KeyStore.LoadStoreParameter) null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r1 = r4.split(",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r1.length != 3) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        com.appsflyer.AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(java.lang.String.valueOf(r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3 = r1[1].trim().split(com.j256.ormlite.stmt.query.SimpleComparison.EQUAL_TO_OPERATION);
        r1 = r1[2].trim().split(com.j256.ormlite.stmt.query.SimpleComparison.EQUAL_TO_OPERATION);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r3.length != 2) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        if (r1.length != 2) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        r7.f8566 = r3[1].trim();
        r7.f8569 = java.lang.Integer.parseInt(r1[1].trim());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0070, code lost:
        r1 = th;
     */
    /* renamed from: ˊ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m1124() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f8568
            monitor-enter(r0)
            java.security.KeyStore r1 = r7.f8565     // Catch:{ all -> 0x0091 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x008e
            java.security.KeyStore r1 = r7.f8565     // Catch:{ all -> 0x0072 }
            java.util.Enumeration r1 = r1.aliases()     // Catch:{ all -> 0x0072 }
        L_0x000f:
            boolean r4 = r1.hasMoreElements()     // Catch:{ all -> 0x0072 }
            if (r4 == 0) goto L_0x008e
            java.lang.Object r4 = r1.nextElement()     // Catch:{ all -> 0x0072 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0072 }
            if (r4 == 0) goto L_0x000f
            java.lang.String r5 = "com.appsflyer"
            boolean r5 = r4.startsWith(r5)     // Catch:{ all -> 0x0072 }
            if (r5 == 0) goto L_0x000f
            java.lang.String r1 = ","
            java.lang.String[] r1 = r4.split(r1)     // Catch:{ all -> 0x0072 }
            int r5 = r1.length     // Catch:{ all -> 0x0072 }
            r6 = 3
            if (r5 != r6) goto L_0x008e
            java.lang.String r5 = "Found a matching AF key with alias:\n"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0072 }
            java.lang.String r4 = r5.concat(r4)     // Catch:{ all -> 0x0072 }
            com.appsflyer.AFLogger.afInfoLog(r4)     // Catch:{ all -> 0x0072 }
            r3 = r1[r2]     // Catch:{ all -> 0x0070 }
            java.lang.String r3 = r3.trim()     // Catch:{ all -> 0x0070 }
            java.lang.String r4 = "="
            java.lang.String[] r3 = r3.split(r4)     // Catch:{ all -> 0x0070 }
            r4 = 2
            r1 = r1[r4]     // Catch:{ all -> 0x0070 }
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x0070 }
            java.lang.String r5 = "="
            java.lang.String[] r1 = r1.split(r5)     // Catch:{ all -> 0x0070 }
            int r5 = r3.length     // Catch:{ all -> 0x0070 }
            if (r5 != r4) goto L_0x008f
            int r5 = r1.length     // Catch:{ all -> 0x0070 }
            if (r5 != r4) goto L_0x008f
            r3 = r3[r2]     // Catch:{ all -> 0x0070 }
            java.lang.String r3 = r3.trim()     // Catch:{ all -> 0x0070 }
            r7.f8566 = r3     // Catch:{ all -> 0x0070 }
            r1 = r1[r2]     // Catch:{ all -> 0x0070 }
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x0070 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0070 }
            r7.f8569 = r1     // Catch:{ all -> 0x0070 }
            goto L_0x008f
        L_0x0070:
            r1 = move-exception
            goto L_0x0074
        L_0x0072:
            r1 = move-exception
            r2 = 0
        L_0x0074:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = "Couldn't list KeyStore Aliases: "
            r3.<init>(r4)     // Catch:{ all -> 0x0091 }
            java.lang.Class r4 = r1.getClass()     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x0091 }
            r3.append(r4)     // Catch:{ all -> 0x0091 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0091 }
            com.appsflyer.AFLogger.afErrorLog(r3, r1)     // Catch:{ all -> 0x0091 }
            goto L_0x008f
        L_0x008e:
            r2 = 0
        L_0x008f:
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            return r2
        L_0x0091:
            r1 = move-exception
            monitor-exit(r0)
            goto L_0x0095
        L_0x0094:
            throw r1
        L_0x0095:
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AFKeystoreWrapper.m1124():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ˎ  reason: contains not printable characters */
    public final void m1126(String str) {
        AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance2.add(1, 5);
            AlgorithmParameterSpec algorithmParameterSpec = null;
            synchronized (this.f8568) {
                if (!this.f8565.containsAlias(str)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        algorithmParameterSpec = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(instance.getTime()).setCertificateNotAfter(instance2.getTime()).build();
                    } else if (Build.VERSION.SDK_INT >= 18 && !"OPPO".equals(Build.BRAND)) {
                        algorithmParameterSpec = new KeyPairGeneratorSpec.Builder(this.f8567).setAlias(str).setSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setSerialNumber(BigInteger.ONE).setStartDate(instance.getTime()).setEndDate(instance2.getTime()).build();
                    }
                    KeyPairGenerator instance3 = KeyPairGenerator.getInstance(SuperGwUtils.SIGN_TYPE, "AndroidKeyStore");
                    instance3.initialize(algorithmParameterSpec);
                    instance3.generateKeyPair();
                } else {
                    AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(str)));
                }
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Exception ");
            sb.append(th.getMessage());
            sb.append(" occurred");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ˋ  reason: contains not printable characters */
    public final String m1125() {
        StringBuilder sb = new StringBuilder();
        sb.append("com.appsflyer,");
        synchronized (this.f8568) {
            sb.append("KSAppsFlyerId=");
            sb.append(this.f8566);
            sb.append(",");
            sb.append("KSAppsFlyerRICounter=");
            sb.append(this.f8569);
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ॱ  reason: contains not printable characters */
    public final String m1128() {
        String str;
        synchronized (this.f8568) {
            str = this.f8566;
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ˏ  reason: contains not printable characters */
    public final int m1127() {
        int i;
        synchronized (this.f8568) {
            i = this.f8569;
        }
        return i;
    }
}
