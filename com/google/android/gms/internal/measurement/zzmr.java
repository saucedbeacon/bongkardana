package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class zzmr {
    static final long zza = ((long) zzz(byte[].class));
    static final boolean zzb;
    private static final Unsafe zzc = zzq();
    private static final Class<?> zzd = zziq.zza();
    private static final boolean zze = zzr(Long.TYPE);
    private static final boolean zzf;
    private static final zzmq zzg;
    private static final boolean zzh;
    private static final boolean zzi;

    /* JADX WARNING: Removed duplicated region for block: B:35:0x015e  */
    static {
        /*
            java.lang.Class<double[]> r0 = double[].class
            java.lang.Class<float[]> r1 = float[].class
            java.lang.Class<long[]> r2 = long[].class
            java.lang.Class<int[]> r3 = int[].class
            java.lang.Class<boolean[]> r4 = boolean[].class
            sun.misc.Unsafe r5 = zzq()
            zzc = r5
            java.lang.Class r5 = com.google.android.gms.internal.measurement.zziq.zza()
            zzd = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            boolean r5 = zzr(r5)
            zze = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            boolean r5 = zzr(r5)
            zzf = r5
            sun.misc.Unsafe r6 = zzc
            r7 = 0
            if (r6 != 0) goto L_0x002c
            goto L_0x003d
        L_0x002c:
            boolean r8 = zze
            if (r8 == 0) goto L_0x0036
            com.google.android.gms.internal.measurement.zzmp r7 = new com.google.android.gms.internal.measurement.zzmp
            r7.<init>(r6)
            goto L_0x003d
        L_0x0036:
            if (r5 == 0) goto L_0x003d
            com.google.android.gms.internal.measurement.zzmo r7 = new com.google.android.gms.internal.measurement.zzmo
            r7.<init>(r6)
        L_0x003d:
            zzg = r7
            java.lang.String r5 = "getLong"
            java.lang.String r6 = "objectFieldOffset"
            r8 = 2
            r9 = 1
            r10 = 0
            if (r7 != 0) goto L_0x004a
        L_0x0048:
            r7 = 0
            goto L_0x0077
        L_0x004a:
            sun.misc.Unsafe r7 = r7.zza
            if (r7 != 0) goto L_0x004f
            goto L_0x0048
        L_0x004f:
            java.lang.Class r7 = r7.getClass()     // Catch:{ all -> 0x0072 }
            java.lang.Class[] r11 = new java.lang.Class[r9]     // Catch:{ all -> 0x0072 }
            java.lang.Class<java.lang.reflect.Field> r12 = java.lang.reflect.Field.class
            r11[r10] = r12     // Catch:{ all -> 0x0072 }
            r7.getMethod(r6, r11)     // Catch:{ all -> 0x0072 }
            java.lang.Class[] r11 = new java.lang.Class[r8]     // Catch:{ all -> 0x0072 }
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            r11[r10] = r12     // Catch:{ all -> 0x0072 }
            java.lang.Class r12 = java.lang.Long.TYPE     // Catch:{ all -> 0x0072 }
            r11[r9] = r12     // Catch:{ all -> 0x0072 }
            r7.getMethod(r5, r11)     // Catch:{ all -> 0x0072 }
            java.lang.reflect.Field r7 = zzB()     // Catch:{ all -> 0x0072 }
            if (r7 != 0) goto L_0x0070
            goto L_0x0048
        L_0x0070:
            r7 = 1
            goto L_0x0077
        L_0x0072:
            r7 = move-exception
            zzs(r7)
            goto L_0x0048
        L_0x0077:
            zzh = r7
            com.google.android.gms.internal.measurement.zzmq r7 = zzg
            if (r7 != 0) goto L_0x0080
        L_0x007d:
            r5 = 0
            goto L_0x0115
        L_0x0080:
            sun.misc.Unsafe r7 = r7.zza
            if (r7 != 0) goto L_0x0085
            goto L_0x007d
        L_0x0085:
            java.lang.Class r7 = r7.getClass()     // Catch:{ all -> 0x010f }
            java.lang.Class[] r11 = new java.lang.Class[r9]     // Catch:{ all -> 0x010f }
            java.lang.Class<java.lang.reflect.Field> r12 = java.lang.reflect.Field.class
            r11[r10] = r12     // Catch:{ all -> 0x010f }
            r7.getMethod(r6, r11)     // Catch:{ all -> 0x010f }
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x010f }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r6[r10] = r11     // Catch:{ all -> 0x010f }
            java.lang.String r11 = "arrayBaseOffset"
            r7.getMethod(r11, r6)     // Catch:{ all -> 0x010f }
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x010f }
            java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
            r6[r10] = r11     // Catch:{ all -> 0x010f }
            java.lang.String r11 = "arrayIndexScale"
            r7.getMethod(r11, r6)     // Catch:{ all -> 0x010f }
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x010f }
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            r6[r10] = r11     // Catch:{ all -> 0x010f }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x010f }
            r6[r9] = r11     // Catch:{ all -> 0x010f }
            java.lang.String r11 = "getInt"
            r7.getMethod(r11, r6)     // Catch:{ all -> 0x010f }
            r6 = 3
            java.lang.Class[] r11 = new java.lang.Class[r6]     // Catch:{ all -> 0x010f }
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            r11[r10] = r12     // Catch:{ all -> 0x010f }
            java.lang.Class r12 = java.lang.Long.TYPE     // Catch:{ all -> 0x010f }
            r11[r9] = r12     // Catch:{ all -> 0x010f }
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ all -> 0x010f }
            r11[r8] = r12     // Catch:{ all -> 0x010f }
            java.lang.String r12 = "putInt"
            r7.getMethod(r12, r11)     // Catch:{ all -> 0x010f }
            java.lang.Class[] r11 = new java.lang.Class[r8]     // Catch:{ all -> 0x010f }
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            r11[r10] = r12     // Catch:{ all -> 0x010f }
            java.lang.Class r12 = java.lang.Long.TYPE     // Catch:{ all -> 0x010f }
            r11[r9] = r12     // Catch:{ all -> 0x010f }
            r7.getMethod(r5, r11)     // Catch:{ all -> 0x010f }
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch:{ all -> 0x010f }
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            r5[r10] = r11     // Catch:{ all -> 0x010f }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x010f }
            r5[r9] = r11     // Catch:{ all -> 0x010f }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x010f }
            r5[r8] = r11     // Catch:{ all -> 0x010f }
            java.lang.String r11 = "putLong"
            r7.getMethod(r11, r5)     // Catch:{ all -> 0x010f }
            java.lang.Class[] r5 = new java.lang.Class[r8]     // Catch:{ all -> 0x010f }
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            r5[r10] = r11     // Catch:{ all -> 0x010f }
            java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ all -> 0x010f }
            r5[r9] = r11     // Catch:{ all -> 0x010f }
            java.lang.String r11 = "getObject"
            r7.getMethod(r11, r5)     // Catch:{ all -> 0x010f }
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch:{ all -> 0x010f }
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r5[r10] = r6     // Catch:{ all -> 0x010f }
            java.lang.Class r6 = java.lang.Long.TYPE     // Catch:{ all -> 0x010f }
            r5[r9] = r6     // Catch:{ all -> 0x010f }
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r5[r8] = r6     // Catch:{ all -> 0x010f }
            java.lang.String r6 = "putObject"
            r7.getMethod(r6, r5)     // Catch:{ all -> 0x010f }
            r5 = 1
            goto L_0x0115
        L_0x010f:
            r5 = move-exception
            zzs(r5)
            goto L_0x007d
        L_0x0115:
            zzi = r5
            java.lang.Class<byte[]> r5 = byte[].class
            int r5 = zzz(r5)
            long r5 = (long) r5
            zza = r5
            zzz(r4)
            zzA(r4)
            zzz(r3)
            zzA(r3)
            zzz(r2)
            zzA(r2)
            zzz(r1)
            zzA(r1)
            zzz(r0)
            zzA(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            zzz(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            zzA(r0)
            java.lang.reflect.Field r0 = zzB()
            if (r0 == 0) goto L_0x0155
            com.google.android.gms.internal.measurement.zzmq r1 = zzg
            if (r1 == 0) goto L_0x0155
            r1.zzh(r0)
        L_0x0155:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x015e
            goto L_0x015f
        L_0x015e:
            r9 = 0
        L_0x015f:
            zzb = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzmr.<clinit>():void");
    }

    private zzmr() {
    }

    private static int zzA(Class<?> cls) {
        if (zzi) {
            return zzg.zzj(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i = zziq.zza;
        Field zzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (zzC != null) {
            return zzC;
        }
        Field zzC2 = zzC(Buffer.class, "address");
        if (zzC2 == null || zzC2.getType() != Long.TYPE) {
            return null;
        }
        return zzC2;
    }

    private static Field zzC(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static void zzD(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        int i2 = (b & 255) << i;
        zzg.zzl(obj, j2, i2 | (zzg.zzk(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    public static void zzE(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        int i2 = (b & 255) << i;
        zzg.zzl(obj, j2, i2 | (zzg.zzk(obj, j2) & ((255 << i) ^ -1)));
    }

    static boolean zza() {
        return zzi;
    }

    static boolean zzb() {
        return zzh;
    }

    static <T> T zzc(Class<T> cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    static int zzd(Object obj, long j) {
        return zzg.zzk(obj, j);
    }

    static void zze(Object obj, long j, int i) {
        zzg.zzl(obj, j, i);
    }

    static long zzf(Object obj, long j) {
        return zzg.zzm(obj, j);
    }

    static void zzg(Object obj, long j, long j2) {
        zzg.zzn(obj, j, j2);
    }

    static boolean zzh(Object obj, long j) {
        return zzg.zzb(obj, j);
    }

    static void zzi(Object obj, long j, boolean z) {
        zzg.zzc(obj, j, z);
    }

    static float zzj(Object obj, long j) {
        return zzg.zzd(obj, j);
    }

    static void zzk(Object obj, long j, float f) {
        zzg.zze(obj, j, f);
    }

    static double zzl(Object obj, long j) {
        return zzg.zzf(obj, j);
    }

    static void zzm(Object obj, long j, double d) {
        zzg.zzg(obj, j, d);
    }

    static Object zzn(Object obj, long j) {
        return zzg.zzo(obj, j);
    }

    static void zzo(Object obj, long j, Object obj2) {
        zzg.zzp(obj, j, obj2);
    }

    static void zzp(byte[] bArr, long j, byte b) {
        zzg.zza(bArr, zza + j, b);
    }

    static Unsafe zzq() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzmn());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean zzr(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        int i = zziq.zza;
        try {
            Class<?> cls3 = zzd;
            cls3.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls3.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls3.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static /* synthetic */ void zzs(Throwable th) {
        Logger logger = Logger.getLogger(zzmr.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
        sb.append("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(valueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb.toString());
    }

    static /* synthetic */ boolean zzv(Object obj, long j) {
        return ((byte) ((zzg.zzk(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ boolean zzw(Object obj, long j) {
        return ((byte) ((zzg.zzk(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    private static int zzz(Class<?> cls) {
        if (zzi) {
            return zzg.zzi(cls);
        }
        return -1;
    }
}
