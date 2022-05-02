package com.google.android.gms.internal.phenotype;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class zzf {
    private static final Uri CONTENT_URI = Uri.parse("content://com.google.android.gsf.gservices");
    private static final Uri zzbe = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    private static final Pattern zzbf = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    private static final Pattern zzbg = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    /* access modifiers changed from: private */
    public static final AtomicBoolean zzbh = new AtomicBoolean();
    private static HashMap<String, String> zzbi;
    private static final HashMap<String, Boolean> zzbj = new HashMap<>();
    private static final HashMap<String, Integer> zzbk = new HashMap<>();
    private static final HashMap<String, Long> zzbl = new HashMap<>();
    private static final HashMap<String, Float> zzbm = new HashMap<>();
    private static Object zzbn;
    private static boolean zzbo;
    private static String[] zzbp = new String[0];

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> T zza(java.util.HashMap<java.lang.String, T> r2, java.lang.String r3, T r4) {
        /*
            java.lang.Class<com.google.android.gms.internal.phenotype.zzf> r0 = com.google.android.gms.internal.phenotype.zzf.class
            monitor-enter(r0)
            boolean r1 = r2.containsKey(r3)     // Catch:{ all -> 0x0015 }
            if (r1 == 0) goto L_0x0012
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0015 }
            if (r2 == 0) goto L_0x0010
            r4 = r2
        L_0x0010:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return r4
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            r2 = 0
            return r2
        L_0x0015:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.phenotype.zzf.zza(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        r13 = r13.query(CONTENT_URI, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r14}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0070, code lost:
        if (r13 == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0076, code lost:
        if (r13.moveToFirst() != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
        r15 = r13.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007d, code lost:
        if (r15 == null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0083, code lost:
        if (r15.equals((java.lang.Object) null) == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0085, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0086, code lost:
        zza(r0, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0089, code lost:
        if (r15 == null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008b, code lost:
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0091, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        zza(r0, r14, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0095, code lost:
        if (r13 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0097, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x009b, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009c, code lost:
        if (r13 != null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x009e, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a1, code lost:
        throw r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String zza(android.content.ContentResolver r13, java.lang.String r14, java.lang.String r15) {
        /*
            java.lang.Class<com.google.android.gms.internal.phenotype.zzf> r15 = com.google.android.gms.internal.phenotype.zzf.class
            monitor-enter(r15)
            zza(r13)     // Catch:{ all -> 0x00a2 }
            java.lang.Object r0 = zzbn     // Catch:{ all -> 0x00a2 }
            java.util.HashMap<java.lang.String, java.lang.String> r1 = zzbi     // Catch:{ all -> 0x00a2 }
            boolean r1 = r1.containsKey(r14)     // Catch:{ all -> 0x00a2 }
            r2 = 0
            if (r1 == 0) goto L_0x001e
            java.util.HashMap<java.lang.String, java.lang.String> r13 = zzbi     // Catch:{ all -> 0x00a2 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x00a2 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x00a2 }
            if (r13 == 0) goto L_0x001c
            r2 = r13
        L_0x001c:
            monitor-exit(r15)     // Catch:{ all -> 0x00a2 }
            return r2
        L_0x001e:
            java.lang.String[] r1 = zzbp     // Catch:{ all -> 0x00a2 }
            int r3 = r1.length     // Catch:{ all -> 0x00a2 }
            r4 = 0
            r5 = 0
        L_0x0023:
            r6 = 1
            if (r5 >= r3) goto L_0x0061
            r7 = r1[r5]     // Catch:{ all -> 0x00a2 }
            boolean r7 = r14.startsWith(r7)     // Catch:{ all -> 0x00a2 }
            if (r7 == 0) goto L_0x005e
            boolean r0 = zzbo     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x003a
            java.util.HashMap<java.lang.String, java.lang.String> r0 = zzbi     // Catch:{ all -> 0x00a2 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x005c
        L_0x003a:
            java.lang.String[] r0 = zzbp     // Catch:{ all -> 0x00a2 }
            java.util.HashMap<java.lang.String, java.lang.String> r1 = zzbi     // Catch:{ all -> 0x00a2 }
            java.util.Map r13 = zza(r13, r0)     // Catch:{ all -> 0x00a2 }
            r1.putAll(r13)     // Catch:{ all -> 0x00a2 }
            zzbo = r6     // Catch:{ all -> 0x00a2 }
            java.util.HashMap<java.lang.String, java.lang.String> r13 = zzbi     // Catch:{ all -> 0x00a2 }
            boolean r13 = r13.containsKey(r14)     // Catch:{ all -> 0x00a2 }
            if (r13 == 0) goto L_0x005c
            java.util.HashMap<java.lang.String, java.lang.String> r13 = zzbi     // Catch:{ all -> 0x00a2 }
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x00a2 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x00a2 }
            if (r13 == 0) goto L_0x005a
            r2 = r13
        L_0x005a:
            monitor-exit(r15)     // Catch:{ all -> 0x00a2 }
            return r2
        L_0x005c:
            monitor-exit(r15)     // Catch:{ all -> 0x00a2 }
            return r2
        L_0x005e:
            int r5 = r5 + 1
            goto L_0x0023
        L_0x0061:
            monitor-exit(r15)     // Catch:{ all -> 0x00a2 }
            android.net.Uri r8 = CONTENT_URI
            r9 = 0
            r10 = 0
            java.lang.String[] r11 = new java.lang.String[r6]
            r11[r4] = r14
            r12 = 0
            r7 = r13
            android.database.Cursor r13 = r7.query(r8, r9, r10, r11, r12)
            if (r13 == 0) goto L_0x0092
            boolean r15 = r13.moveToFirst()     // Catch:{ all -> 0x009b }
            if (r15 != 0) goto L_0x0079
            goto L_0x0092
        L_0x0079:
            java.lang.String r15 = r13.getString(r6)     // Catch:{ all -> 0x009b }
            if (r15 == 0) goto L_0x0086
            boolean r1 = r15.equals(r2)     // Catch:{ all -> 0x009b }
            if (r1 == 0) goto L_0x0086
            r15 = r2
        L_0x0086:
            zza((java.lang.Object) r0, (java.lang.String) r14, (java.lang.String) r15)     // Catch:{ all -> 0x009b }
            if (r15 == 0) goto L_0x008c
            r2 = r15
        L_0x008c:
            if (r13 == 0) goto L_0x0091
            r13.close()
        L_0x0091:
            return r2
        L_0x0092:
            zza((java.lang.Object) r0, (java.lang.String) r14, (java.lang.String) r2)     // Catch:{ all -> 0x009b }
            if (r13 == 0) goto L_0x009a
            r13.close()
        L_0x009a:
            return r2
        L_0x009b:
            r14 = move-exception
            if (r13 == 0) goto L_0x00a1
            r13.close()
        L_0x00a1:
            throw r14
        L_0x00a2:
            r13 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00a2 }
            goto L_0x00a6
        L_0x00a5:
            throw r13
        L_0x00a6:
            goto L_0x00a5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.phenotype.zzf.zza(android.content.ContentResolver, java.lang.String, java.lang.String):java.lang.String");
    }

    private static Map<String, String> zza(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(zzbe, (String[]) null, (String) null, strArr, (String) null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
            }
        }
        return treeMap;
    }

    private static void zza(ContentResolver contentResolver) {
        if (zzbi == null) {
            zzbh.set(false);
            zzbi = new HashMap<>();
            zzbn = new Object();
            zzbo = false;
            contentResolver.registerContentObserver(CONTENT_URI, true, new zzg((Handler) null));
        } else if (zzbh.getAndSet(false)) {
            zzbi.clear();
            zzbj.clear();
            zzbk.clear();
            zzbl.clear();
            zzbm.clear();
            zzbn = new Object();
            zzbo = false;
        }
    }

    private static void zza(Object obj, String str, String str2) {
        synchronized (zzf.class) {
            if (obj == zzbn) {
                zzbi.put(str, str2);
            }
        }
    }

    public static boolean zza(ContentResolver contentResolver, String str, boolean z) {
        Object zzb = zzb(contentResolver);
        Boolean bool = (Boolean) zza(zzbj, str, Boolean.valueOf(z));
        if (bool != null) {
            return bool.booleanValue();
        }
        String zza = zza(contentResolver, str, (String) null);
        if (zza != null && !zza.equals("")) {
            if (zzbf.matcher(zza).matches()) {
                bool = true;
                z = true;
            } else if (zzbg.matcher(zza).matches()) {
                bool = false;
                z = false;
            } else {
                Log.w("Gservices", "attempt to read gservices key " + str + " (value \"" + zza + "\") as boolean");
            }
        }
        HashMap<String, Boolean> hashMap = zzbj;
        synchronized (zzf.class) {
            if (zzb == zzbn) {
                hashMap.put(str, bool);
                zzbi.remove(str);
            }
        }
        return z;
    }

    private static Object zzb(ContentResolver contentResolver) {
        Object obj;
        synchronized (zzf.class) {
            zza(contentResolver);
            obj = zzbn;
        }
        return obj;
    }
}
