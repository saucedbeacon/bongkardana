package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.telephony.PhoneNumberUtils;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.clearcut.zzgw;
import com.google.android.gms.phenotype.Phenotype;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public final class zzp implements ClearcutLogger.zza {
    private static final Charset UTF_8 = Charset.forName(setMin(new int[]{0, 5, 0, 2}, new byte[]{1, 1, 1, 1, 0}, PhoneNumberUtils.isEmergencyNumber("")).intern());
    private static int getMax = 1;
    private static char[] getMin;
    private static int setMax;
    private static final zzao zzaq = new zzao(Phenotype.getContentProviderUri("com.google.android.gms.clearcut.public")).zzc("gms:playlog:service:samplingrules_").zzd("LogSamplingRules__");
    private static final zzao zzar = new zzao(Phenotype.getContentProviderUri("com.google.android.gms.clearcut.public")).zzc("gms:playlog:service:sampling_").zzd("LogSampling__");
    private static final ConcurrentHashMap<String, zzae<zzgw.zza>> zzas = new ConcurrentHashMap<>();
    private static final HashMap<String, zzae<String>> zzat = new HashMap<>();
    @VisibleForTesting
    private static Boolean zzau;
    @VisibleForTesting
    private static Long zzav;
    @VisibleForTesting
    private static final zzae<Boolean> zzaw = zzaq.zzc("enable_log_sampling_rules", false);
    private final Context zzh;

    /* JADX WARNING: type inference failed for: r0v13, types: [java.lang.Long, java.lang.Boolean] */
    static {
        getMin();
        ? r0 = 0;
        zzau = r0;
        zzav = r0;
        int i = setMax + 59;
        getMax = i % 128;
        if ((i % 2 == 0 ? 'G' : '[') == 'G') {
            int length = r0.length;
        }
    }

    public zzp(Context context) {
        this.zzh = context;
        if (context != null) {
            zzae.maybeInit(context);
            int i = setMax + 47;
            getMax = i % 128;
            int i2 = i % 2;
        }
        int i3 = getMax + 5;
        setMax = i3 % 128;
        if ((i3 % 2 != 0 ? 11 : '*') == 11) {
            int i4 = 88 / 0;
        }
    }

    static void getMin() {
        getMin = new char[]{22, '2', 'F', 'T', 'M'};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if ((r4 == null) != true) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
        if (r4 != null) goto L_0x0027;
     */
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long zza(java.lang.String r4, long r5) {
        /*
            int r0 = setMax
            r1 = 89
            int r0 = r0 + r1
            int r2 = r0 % 128
            getMax = r2
            int r0 = r0 % 2
            r2 = 13
            if (r0 != 0) goto L_0x0012
            r0 = 18
            goto L_0x0014
        L_0x0012:
            r0 = 13
        L_0x0014:
            r3 = 8
            if (r0 == r2) goto L_0x0025
            r0 = 0
            int r0 = r0.length     // Catch:{ all -> 0x0023 }
            r0 = 1
            if (r4 == 0) goto L_0x001f
            r2 = 0
            goto L_0x0020
        L_0x001f:
            r2 = 1
        L_0x0020:
            if (r2 == r0) goto L_0x005e
            goto L_0x0027
        L_0x0023:
            r4 = move-exception
            throw r4
        L_0x0025:
            if (r4 == 0) goto L_0x005e
        L_0x0027:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0030
            r0 = 16
            goto L_0x0032
        L_0x0030:
            r0 = 89
        L_0x0032:
            if (r0 == r1) goto L_0x0035
            goto L_0x005e
        L_0x0035:
            java.nio.charset.Charset r0 = UTF_8     // Catch:{ Exception -> 0x005c }
            byte[] r4 = r4.getBytes(r0)     // Catch:{ Exception -> 0x005c }
            int r0 = r4.length     // Catch:{ Exception -> 0x005c }
            int r0 = r0 + r3
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ Exception -> 0x005c }
            r0.put(r4)     // Catch:{ Exception -> 0x005c }
            r0.putLong(r5)     // Catch:{ Exception -> 0x005c }
            byte[] r4 = r0.array()     // Catch:{ Exception -> 0x005c }
            long r4 = com.google.android.gms.internal.clearcut.zzk.zza(r4)     // Catch:{ Exception -> 0x005c }
            int r6 = getMax     // Catch:{ Exception -> 0x005c }
            int r6 = r6 + 105
            int r0 = r6 % 128
            setMax = r0     // Catch:{ Exception -> 0x005a }
            int r6 = r6 % 2
            return r4
        L_0x005a:
            r4 = move-exception
            throw r4
        L_0x005c:
            r4 = move-exception
            throw r4
        L_0x005e:
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r3)
            java.nio.ByteBuffer r4 = r4.putLong(r5)
            byte[] r4 = r4.array()
            long r4 = com.google.android.gms.internal.clearcut.zzk.zza(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzp.zza(java.lang.String, long):long");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.clearcut.zzgw$zza$zzb, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if ((r12 != null) != false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (r12 == null) goto L_0x00f2;
     */
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.clearcut.zzgw.zza.zzb zza(java.lang.String r12) {
        /*
            int r0 = setMax
            int r0 = r0 + 61
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0016
            int r0 = r3.length     // Catch:{ all -> 0x0014 }
            if (r12 != 0) goto L_0x001d
            goto L_0x00f2
        L_0x0014:
            r12 = move-exception
            throw r12
        L_0x0016:
            if (r12 != 0) goto L_0x001a
            r0 = 0
            goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            if (r0 == 0) goto L_0x00f2
        L_0x001d:
            r0 = 44
            int r0 = r12.indexOf(r0)
            if (r0 < 0) goto L_0x002b
            java.lang.String r4 = r12.substring(r1, r0)
            int r0 = r0 + r2
            goto L_0x002e
        L_0x002b:
            java.lang.String r4 = ""
            r0 = 0
        L_0x002e:
            r5 = 47
            int r5 = r12.indexOf(r5, r0)
            if (r5 > 0) goto L_0x0038
            r6 = 0
            goto L_0x0039
        L_0x0038:
            r6 = 1
        L_0x0039:
            java.lang.String r7 = "LogSamplerImpl"
            if (r6 == 0) goto L_0x00cf
            java.lang.String r0 = r12.substring(r0, r5)     // Catch:{ NumberFormatException -> 0x00b4 }
            long r8 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x00b4 }
            int r5 = r5 + r2
            java.lang.String r0 = r12.substring(r5)     // Catch:{ NumberFormatException -> 0x00b4 }
            long r5 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x00b4 }
            int r12 = getMax
            int r12 = r12 + r2
            int r0 = r12 % 128
            setMax = r0
            int r12 = r12 % 2
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0095
            int r12 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x0062
            goto L_0x0095
        L_0x0062:
            com.google.android.gms.internal.clearcut.zzgw$zza$zzb$zza r12 = com.google.android.gms.internal.clearcut.zzgw.zza.zzb.zzfz()
            com.google.android.gms.internal.clearcut.zzgw$zza$zzb$zza r12 = r12.zzn(r4)
            com.google.android.gms.internal.clearcut.zzgw$zza$zzb$zza r12 = r12.zzr(r8)
            com.google.android.gms.internal.clearcut.zzgw$zza$zzb$zza r12 = r12.zzs(r5)
            com.google.android.gms.internal.clearcut.zzcg r12 = r12.zzbh()
            com.google.android.gms.internal.clearcut.zzcg r12 = (com.google.android.gms.internal.clearcut.zzcg) r12
            com.google.android.gms.internal.clearcut.zzgw$zza$zzb r12 = (com.google.android.gms.internal.clearcut.zzgw.zza.zzb) r12
            int r0 = setMax     // Catch:{ Exception -> 0x0093 }
            int r0 = r0 + 27
            int r2 = r0 % 128
            getMax = r2     // Catch:{ Exception -> 0x0093 }
            int r0 = r0 % 2
            r2 = 87
            if (r0 != 0) goto L_0x008a
            r1 = 87
        L_0x008a:
            if (r1 == r2) goto L_0x008d
            return r12
        L_0x008d:
            super.hashCode()     // Catch:{ all -> 0x0091 }
            return r12
        L_0x0091:
            r12 = move-exception
            throw r12
        L_0x0093:
            r12 = move-exception
            throw r12
        L_0x0095:
            r12 = 72
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            java.lang.String r12 = "negative values not supported: "
            r0.append(r12)
            r0.append(r8)
            java.lang.String r12 = "/"
            r0.append(r12)
            r0.append(r5)
            java.lang.String r12 = r0.toString()
            android.util.Log.e(r7, r12)
            return r3
        L_0x00b4:
            r0 = move-exception
            java.lang.String r1 = "parseLong() failed while parsing: "
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r2 = r12.length()
            if (r2 == 0) goto L_0x00c6
            java.lang.String r12 = r1.concat(r12)
            goto L_0x00cb
        L_0x00c6:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r1)
        L_0x00cb:
            android.util.Log.e(r7, r12, r0)
            return r3
        L_0x00cf:
            java.lang.String r0 = "Failed to parse the rule: "
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r1 = r12.length()
            if (r1 == 0) goto L_0x00e0
            java.lang.String r12 = r0.concat(r12)
            goto L_0x00ef
        L_0x00e0:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r0)
            int r0 = setMax
            int r0 = r0 + 71
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
        L_0x00ef:
            android.util.Log.e(r7, r12)
        L_0x00f2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzp.zza(java.lang.String):com.google.android.gms.internal.clearcut.zzgw$zza$zzb");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if ((r11 < 0) != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r11 >= 0) goto L_0x001e;
     */
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean zzb(long r9, long r11, long r13) {
        /*
            int r0 = setMax
            int r0 = r0 + 39
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0016
            r0 = 0
            goto L_0x0017
        L_0x0016:
            r0 = 1
        L_0x0017:
            if (r0 == 0) goto L_0x001e
            goto L_0x0056
        L_0x001a:
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0056
        L_0x001e:
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0056
            int r0 = getMax
            int r0 = r0 + 61
            int r5 = r0 % 128
            setMax = r5
            int r0 = r0 % 2
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x003c
            long r9 = r9 % r13
            int r13 = setMax
            int r13 = r13 + 75
            int r14 = r13 % 128
            getMax = r14
            int r13 = r13 % 2
            goto L_0x004b
        L_0x003c:
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r5 = r3 % r13
            r7 = 1
            long r5 = r5 + r7
            long r9 = r9 & r3
            long r9 = r9 % r13
            long r5 = r5 + r9
            long r9 = r5 % r13
        L_0x004b:
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0051
            r9 = 1
            goto L_0x0052
        L_0x0051:
            r9 = 0
        L_0x0052:
            if (r9 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            return r1
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzp.zzb(long, long, long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if ((r4 != 0) != true) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        if ((r4 == 0 ? 'G' : 13) != 13) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean zzc(android.content.Context r4) {
        /*
            int r0 = getMax
            int r0 = r0 + 15
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            java.lang.Boolean r0 = zzau     // Catch:{ Exception -> 0x004f }
            if (r0 != 0) goto L_0x0046
            int r0 = getMax     // Catch:{ Exception -> 0x004d }
            int r0 = r0 + 11
            int r1 = r0 % 128
            setMax = r1     // Catch:{ Exception -> 0x004d }
            int r0 = r0 % 2
            java.lang.String r1 = "com.google.android.providers.gsf.permission.READ_GSERVICES"
            r2 = 1
            r3 = 0
            com.google.android.gms.common.wrappers.PackageManagerWrapper r4 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r4)
            int r4 = r4.checkCallingOrSelfPermission(r1)
            if (r0 == 0) goto L_0x0033
            r0 = 16
            int r0 = r0 / r3
            if (r4 != 0) goto L_0x002d
            r4 = 0
            goto L_0x002e
        L_0x002d:
            r4 = 1
        L_0x002e:
            if (r4 == r2) goto L_0x003f
            goto L_0x0040
        L_0x0031:
            r4 = move-exception
            throw r4
        L_0x0033:
            r0 = 13
            if (r4 != 0) goto L_0x003a
            r4 = 71
            goto L_0x003c
        L_0x003a:
            r4 = 13
        L_0x003c:
            if (r4 == r0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            zzau = r4
        L_0x0046:
            java.lang.Boolean r4 = zzau     // Catch:{ Exception -> 0x004d }
            boolean r4 = r4.booleanValue()     // Catch:{ Exception -> 0x004d }
            return r4
        L_0x004d:
            r4 = move-exception
            throw r4
        L_0x004f:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzp.zzc(android.content.Context):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        if ((r4 != null ? '-' : '#') != '#') goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        r4 = getMax + 13;
        setMax = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r4 != null) goto L_0x0026;
     */
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long zzd(android.content.Context r4) {
        /*
            java.lang.Long r0 = zzav
            if (r0 != 0) goto L_0x0056
            int r0 = getMax
            int r0 = r0 + 31
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L_0x001b
            r0 = 85
            int r0 = r0 / 0
            if (r4 == 0) goto L_0x004b
            goto L_0x0026
        L_0x0019:
            r4 = move-exception
            throw r4
        L_0x001b:
            r0 = 35
            if (r4 == 0) goto L_0x0022
            r3 = 45
            goto L_0x0024
        L_0x0022:
            r3 = 35
        L_0x0024:
            if (r3 == r0) goto L_0x004b
        L_0x0026:
            boolean r0 = zzc(r4)
            r3 = 27
            if (r0 == 0) goto L_0x0031
            r0 = 90
            goto L_0x0033
        L_0x0031:
            r0 = 27
        L_0x0033:
            if (r0 == r3) goto L_0x0044
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r0 = "android_id"
            long r0 = com.google.android.gms.internal.clearcut.zzy.getLong(r4, r0, r1)
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            goto L_0x0048
        L_0x0044:
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
        L_0x0048:
            zzav = r4
            goto L_0x0056
        L_0x004b:
            int r4 = getMax
            int r4 = r4 + 13
            int r0 = r4 % 128
            setMax = r0
            int r4 = r4 % 2
            return r1
        L_0x0056:
            java.lang.Long r4 = zzav     // Catch:{ Exception -> 0x005d }
            long r0 = r4.longValue()     // Catch:{ Exception -> 0x005d }
            return r0
        L_0x005d:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzp.zzd(android.content.Context):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010f, code lost:
        if ((r1.zzh == null ? 'V' : 'b') != 'V') goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0117, code lost:
        if (r1.zzh == null) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x011e, code lost:
        r3 = zzas.get(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0126, code lost:
        if (r3 != null) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0128, code lost:
        r3 = zzaq.zza(r2, com.google.android.gms.internal.clearcut.zzgw.zza.zzft(), com.google.android.gms.internal.clearcut.zzq.zzax);
        r2 = zzas.putIfAbsent(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x013c, code lost:
        if (r2 == null) goto L_0x014a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r3 = getMax + 1;
        setMax = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0147, code lost:
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x014a, code lost:
        r2 = ((com.google.android.gms.internal.clearcut.zzgw.zza) r3.get()).zzfs();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x017d, code lost:
        if (r8 != 0) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0187, code lost:
        if (r3.getEventCode() != 0) goto L_0x0189;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c A[SYNTHETIC, Splitter:B:20:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f5  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x0098=Splitter:B:34:0x0098, B:71:0x0119=Splitter:B:71:0x0119} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(com.google.android.gms.clearcut.zze r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            int r2 = setMax
            int r2 = r2 + 21
            int r3 = r2 % 128
            getMax = r3
            int r2 = r2 % 2
            com.google.android.gms.internal.clearcut.zzr r2 = r0.zzag
            java.lang.String r2 = r2.zzj
            com.google.android.gms.internal.clearcut.zzr r3 = r0.zzag
            int r3 = r3.zzk
            com.google.android.gms.internal.clearcut.zzha r4 = r0.zzaa
            r5 = 0
            if (r4 == 0) goto L_0x0020
            com.google.android.gms.internal.clearcut.zzha r0 = r0.zzaa
            int r0 = r0.zzbji
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            com.google.android.gms.internal.clearcut.zzae<java.lang.Boolean> r4 = zzaw
            java.lang.Object r4 = r4.get()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r6 = 0
            r7 = 1
            if (r4 != 0) goto L_0x00bc
            if (r2 == 0) goto L_0x004d
            boolean r0 = r2.isEmpty()
            r4 = 41
            if (r0 != 0) goto L_0x003e
            r0 = 27
            goto L_0x0040
        L_0x003e:
            r0 = 41
        L_0x0040:
            if (r0 == r4) goto L_0x004d
            int r0 = getMax
            int r0 = r0 + 97
            int r3 = r0 % 128
            setMax = r3
            int r0 = r0 % 2
            goto L_0x0055
        L_0x004d:
            if (r3 < 0) goto L_0x0054
            java.lang.String r2 = java.lang.String.valueOf(r3)
            goto L_0x0055
        L_0x0054:
            r2 = r6
        L_0x0055:
            if (r2 == 0) goto L_0x0059
            r0 = 1
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            if (r0 == 0) goto L_0x01bd
            android.content.Context r0 = r1.zzh     // Catch:{ Exception -> 0x00b9 }
            if (r0 == 0) goto L_0x0098
            android.content.Context r0 = r1.zzh
            boolean r0 = zzc(r0)
            if (r0 != 0) goto L_0x006a
            r0 = 1
            goto L_0x006b
        L_0x006a:
            r0 = 0
        L_0x006b:
            if (r0 == 0) goto L_0x006e
            goto L_0x0098
        L_0x006e:
            java.util.HashMap<java.lang.String, com.google.android.gms.internal.clearcut.zzae<java.lang.String>> r0 = zzat
            java.lang.Object r0 = r0.get(r2)
            com.google.android.gms.internal.clearcut.zzae r0 = (com.google.android.gms.internal.clearcut.zzae) r0
            if (r0 != 0) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r5 = 1
        L_0x007a:
            if (r5 == r7) goto L_0x0091
            int r0 = getMax
            int r0 = r0 + 73
            int r3 = r0 % 128
            setMax = r3
            int r0 = r0 % 2
            com.google.android.gms.internal.clearcut.zzao r0 = zzar
            com.google.android.gms.internal.clearcut.zzae r0 = r0.zza(r2, r6)
            java.util.HashMap<java.lang.String, com.google.android.gms.internal.clearcut.zzae<java.lang.String>> r3 = zzat
            r3.put(r2, r0)
        L_0x0091:
            java.lang.Object r0 = r0.get()
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
        L_0x0098:
            com.google.android.gms.internal.clearcut.zzgw$zza$zzb r0 = zza((java.lang.String) r6)     // Catch:{ Exception -> 0x01be }
            if (r0 == 0) goto L_0x01bd
            java.lang.String r2 = r0.zzfw()
            android.content.Context r3 = r1.zzh
            long r3 = zzd(r3)
            long r5 = zza(r2, r3)
            long r7 = r0.zzfx()
            long r9 = r0.zzfy()
            boolean r0 = zzb(r5, r7, r9)
            return r0
        L_0x00b9:
            r0 = move-exception
            goto L_0x0149
        L_0x00bc:
            if (r2 == 0) goto L_0x00d9
            int r4 = setMax
            int r4 = r4 + 77
            int r8 = r4 % 128
            getMax = r8
            int r4 = r4 % 2
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x00d9
            int r3 = getMax
            int r3 = r3 + 111
            int r4 = r3 % 128
            setMax = r4
            int r3 = r3 % 2
            goto L_0x00e6
        L_0x00d9:
            if (r3 < 0) goto L_0x00dd
            r2 = 1
            goto L_0x00de
        L_0x00dd:
            r2 = 0
        L_0x00de:
            if (r2 == r7) goto L_0x00e2
            r2 = r6
            goto L_0x00e6
        L_0x00e2:
            java.lang.String r2 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x01be }
        L_0x00e6:
            r3 = 52
            r4 = 8
            if (r2 == 0) goto L_0x00ef
            r8 = 52
            goto L_0x00f1
        L_0x00ef:
            r8 = 8
        L_0x00f1:
            if (r8 == r3) goto L_0x00f5
            goto L_0x01bd
        L_0x00f5:
            int r3 = setMax
            int r3 = r3 + 99
            int r8 = r3 % 128
            getMax = r8
            int r3 = r3 % 2
            if (r3 != 0) goto L_0x0115
            android.content.Context r3 = r1.zzh
            r8 = 65
            int r8 = r8 / r5
            r8 = 86
            if (r3 != 0) goto L_0x010d
            r3 = 86
            goto L_0x010f
        L_0x010d:
            r3 = 98
        L_0x010f:
            if (r3 == r8) goto L_0x0119
            goto L_0x011e
        L_0x0112:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x0115:
            android.content.Context r3 = r1.zzh
            if (r3 != 0) goto L_0x011e
        L_0x0119:
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ Exception -> 0x01be }
            goto L_0x0154
        L_0x011e:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.google.android.gms.internal.clearcut.zzae<com.google.android.gms.internal.clearcut.zzgw$zza>> r3 = zzas
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.clearcut.zzae r3 = (com.google.android.gms.internal.clearcut.zzae) r3
            if (r3 != 0) goto L_0x014a
            com.google.android.gms.internal.clearcut.zzao r3 = zzaq
            com.google.android.gms.internal.clearcut.zzgw$zza r8 = com.google.android.gms.internal.clearcut.zzgw.zza.zzft()
            com.google.android.gms.internal.clearcut.zzan r9 = com.google.android.gms.internal.clearcut.zzq.zzax
            com.google.android.gms.internal.clearcut.zzae r3 = r3.zza(r2, r8, r9)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.google.android.gms.internal.clearcut.zzae<com.google.android.gms.internal.clearcut.zzgw$zza>> r8 = zzas
            java.lang.Object r2 = r8.putIfAbsent(r2, r3)
            com.google.android.gms.internal.clearcut.zzae r2 = (com.google.android.gms.internal.clearcut.zzae) r2
            if (r2 == 0) goto L_0x014a
            int r3 = getMax     // Catch:{ Exception -> 0x00b9 }
            int r3 = r3 + r7
            int r8 = r3 % 128
            setMax = r8     // Catch:{ Exception -> 0x00b9 }
            int r3 = r3 % 2
            r3 = r2
            goto L_0x014a
        L_0x0149:
            throw r0
        L_0x014a:
            java.lang.Object r2 = r3.get()
            com.google.android.gms.internal.clearcut.zzgw$zza r2 = (com.google.android.gms.internal.clearcut.zzgw.zza) r2
            java.util.List r2 = r2.zzfs()
        L_0x0154:
            java.util.Iterator r2 = r2.iterator()
        L_0x0158:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01bd
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.clearcut.zzgw$zza$zzb r3 = (com.google.android.gms.internal.clearcut.zzgw.zza.zzb) r3
            boolean r8 = r3.zzfv()
            if (r8 == 0) goto L_0x018f
            int r8 = getMax
            int r8 = r8 + 119
            int r9 = r8 % 128
            setMax = r9
            int r8 = r8 % 2
            if (r8 == 0) goto L_0x0183
            int r8 = r3.getEventCode()
            super.hashCode()     // Catch:{ all -> 0x0180 }
            if (r8 == 0) goto L_0x018f
            goto L_0x0189
        L_0x0180:
            r0 = move-exception
            r2 = r0
            throw r2
        L_0x0183:
            int r8 = r3.getEventCode()
            if (r8 == 0) goto L_0x018f
        L_0x0189:
            int r8 = r3.getEventCode()
            if (r8 != r0) goto L_0x0158
        L_0x018f:
            java.lang.String r8 = r3.zzfw()
            android.content.Context r9 = r1.zzh
            long r9 = zzd(r9)
            long r11 = zza(r8, r9)
            long r13 = r3.zzfx()
            long r15 = r3.zzfy()
            boolean r3 = zzb(r11, r13, r15)
            if (r3 != 0) goto L_0x01ae
            r3 = 75
            goto L_0x01b0
        L_0x01ae:
            r3 = 8
        L_0x01b0:
            if (r3 == r4) goto L_0x0158
            int r0 = setMax
            int r0 = r0 + 59
            int r2 = r0 % 128
            getMax = r2
            int r0 = r0 % 2
            return r5
        L_0x01bd:
            return r7
        L_0x01be:
            r0 = move-exception
            goto L_0x01c1
        L_0x01c0:
            throw r0
        L_0x01c1:
            goto L_0x01c0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzp.zza(com.google.android.gms.clearcut.zze):boolean");
    }

    private static String setMin(int[] iArr, byte[] bArr, boolean z) {
        int i = 0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        try {
            char[] cArr = new char[i3];
            System.arraycopy(getMin, i2, cArr, 0, i3);
            if ((bArr != null ? '3' : '9') != '9') {
                char[] cArr2 = new char[i3];
                int i6 = 0;
                char c = 0;
                while (i6 < i3) {
                    int i7 = setMax + 51;
                    getMax = i7 % 128;
                    int i8 = i7 % 2;
                    if (!(bArr[i6] != 1)) {
                        cArr2[i6] = (char) (((cArr[i6] << 1) + 1) - c);
                    } else {
                        cArr2[i6] = (char) ((cArr[i6] << 1) - c);
                    }
                    c = cArr2[i6];
                    i6++;
                    int i9 = setMax + 41;
                    getMax = i9 % 128;
                    int i10 = i9 % 2;
                }
                cArr = cArr2;
            }
            if (i5 > 0) {
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr, 0, cArr3, 0, i3);
                int i11 = i3 - i5;
                System.arraycopy(cArr3, 0, cArr, i11, i5);
                System.arraycopy(cArr3, i5, cArr, 0, i11);
            }
            if (z) {
                char[] cArr4 = new char[i3];
                for (int i12 = 0; i12 < i3; i12++) {
                    cArr4[i12] = cArr[(i3 - i12) - 1];
                }
                cArr = cArr4;
            }
            if (!(i4 <= 0)) {
                int i13 = setMax + 13;
                getMax = i13 % 128;
                if ((i13 % 2 == 0 ? '\\' : 'L') == '\\') {
                    i = 1;
                }
                while (i < i3) {
                    int i14 = getMax + 67;
                    setMax = i14 % 128;
                    int i15 = i14 % 2;
                    cArr[i] = (char) (cArr[i] - iArr[2]);
                    i++;
                }
            }
            return new String(cArr);
        } catch (Exception e) {
            throw e;
        }
    }
}
