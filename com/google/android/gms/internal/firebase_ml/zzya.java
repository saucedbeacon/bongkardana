package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

final class zzya {
    private static final Logger logger = Logger.getLogger(zzya.class.getName());
    private static final Class<?> zzbvl = zztn.zzry();
    private static final boolean zzbwg = zzvq();
    private static final Unsafe zzcce = zzvp();
    private static final boolean zzcen = zzp(Long.TYPE);
    private static final boolean zzceo = zzp(Integer.TYPE);
    private static final zzc zzcep;
    private static final boolean zzceq = zzvr();
    private static final long zzcer = ((long) zzn(byte[].class));
    private static final long zzces;
    private static final long zzcet;
    private static final long zzceu;
    private static final long zzcev;
    private static final long zzcew;
    private static final long zzcex;
    private static final long zzcey;
    private static final long zzcez;
    private static final long zzcfa;
    private static final long zzcfb;
    private static final long zzcfc = ((long) zzn(Object[].class));
    private static final long zzcfd = ((long) zzo(Object[].class));
    private static final long zzcfe;
    private static final int zzcff = ((int) (zzcer & 7));
    static final boolean zzcfg = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    private zzya() {
    }

    static final class zza extends zzc {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zzy(Object obj, long j) {
            if (zzya.zzcfg) {
                return zzya.zzq(obj, j);
            }
            return zzya.zzr(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            if (zzya.zzcfg) {
                zzya.zza(obj, j, b);
            } else {
                zzya.zzb(obj, j, b);
            }
        }

        public final boolean zzm(Object obj, long j) {
            if (zzya.zzcfg) {
                return zzya.zzs(obj, j);
            }
            return zzya.zzt(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zzya.zzcfg) {
                zzya.zzb(obj, j, z);
            } else {
                zzya.zzc(obj, j, z);
            }
        }

        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    static final class zzb extends zzc {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zzy(Object obj, long j) {
            if (zzya.zzcfg) {
                return zzya.zzq(obj, j);
            }
            return zzya.zzr(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            if (zzya.zzcfg) {
                zzya.zza(obj, j, b);
            } else {
                zzya.zzb(obj, j, b);
            }
        }

        public final boolean zzm(Object obj, long j) {
            if (zzya.zzcfg) {
                return zzya.zzs(obj, j);
            }
            return zzya.zzt(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zzya.zzcfg) {
                zzya.zzb(obj, j, z);
            } else {
                zzya.zzc(obj, j, z);
            }
        }

        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        public final void zza(Object obj, long j, float f) {
            zza(obj, j, Float.floatToIntBits(f));
        }

        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    static final class zzd extends zzc {
        zzd(Unsafe unsafe) {
            super(unsafe);
        }

        public final byte zzy(Object obj, long j) {
            return this.zzcfh.getByte(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            this.zzcfh.putByte(obj, j, b);
        }

        public final boolean zzm(Object obj, long j) {
            return this.zzcfh.getBoolean(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            this.zzcfh.putBoolean(obj, j, z);
        }

        public final float zzn(Object obj, long j) {
            return this.zzcfh.getFloat(obj, j);
        }

        public final void zza(Object obj, long j, float f) {
            this.zzcfh.putFloat(obj, j, f);
        }

        public final double zzo(Object obj, long j) {
            return this.zzcfh.getDouble(obj, j);
        }

        public final void zza(Object obj, long j, double d) {
            this.zzcfh.putDouble(obj, j, d);
        }
    }

    static boolean zzvn() {
        return zzbwg;
    }

    static abstract class zzc {
        Unsafe zzcfh;

        zzc(Unsafe unsafe) {
            this.zzcfh = unsafe;
        }

        public abstract void zza(Object obj, long j, double d);

        public abstract void zza(Object obj, long j, float f);

        public abstract void zza(Object obj, long j, boolean z);

        public abstract void zze(Object obj, long j, byte b);

        public abstract boolean zzm(Object obj, long j);

        public abstract float zzn(Object obj, long j);

        public abstract double zzo(Object obj, long j);

        public abstract byte zzy(Object obj, long j);

        public final int zzk(Object obj, long j) {
            return this.zzcfh.getInt(obj, j);
        }

        public final void zza(Object obj, long j, int i) {
            this.zzcfh.putInt(obj, j, i);
        }

        public final long zzl(Object obj, long j) {
            return this.zzcfh.getLong(obj, j);
        }

        public final void zza(Object obj, long j, long j2) {
            this.zzcfh.putLong(obj, j, j2);
        }
    }

    static boolean zzvo() {
        return zzceq;
    }

    static <T> T zzm(Class<T> cls) {
        try {
            return zzcce.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int zzn(Class<?> cls) {
        if (zzbwg) {
            return zzcep.zzcfh.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzo(Class<?> cls) {
        if (zzbwg) {
            return zzcep.zzcfh.arrayIndexScale(cls);
        }
        return -1;
    }

    static int zzk(Object obj, long j) {
        return zzcep.zzk(obj, j);
    }

    static void zza(Object obj, long j, int i) {
        zzcep.zza(obj, j, i);
    }

    static long zzl(Object obj, long j) {
        return zzcep.zzl(obj, j);
    }

    static void zza(Object obj, long j, long j2) {
        zzcep.zza(obj, j, j2);
    }

    static boolean zzm(Object obj, long j) {
        return zzcep.zzm(obj, j);
    }

    static void zza(Object obj, long j, boolean z) {
        zzcep.zza(obj, j, z);
    }

    static float zzn(Object obj, long j) {
        return zzcep.zzn(obj, j);
    }

    static void zza(Object obj, long j, float f) {
        zzcep.zza(obj, j, f);
    }

    static double zzo(Object obj, long j) {
        return zzcep.zzo(obj, j);
    }

    static void zza(Object obj, long j, double d) {
        zzcep.zza(obj, j, d);
    }

    static Object zzp(Object obj, long j) {
        return zzcep.zzcfh.getObject(obj, j);
    }

    static void zza(Object obj, long j, Object obj2) {
        zzcep.zzcfh.putObject(obj, j, obj2);
    }

    static byte zza(byte[] bArr, long j) {
        return zzcep.zzy(bArr, zzcer + j);
    }

    static void zza(byte[] bArr, long j, byte b) {
        zzcep.zze(bArr, zzcer + j, b);
    }

    static Unsafe zzvp() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzxz());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean zzvq() {
        Unsafe unsafe = zzcce;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (zztn.zzrx()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzvr() {
        Unsafe unsafe = zzcce;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (zzvs() == null) {
                return false;
            }
            if (zztn.zzrx()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzp(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!zztn.zzrx()) {
            return false;
        }
        try {
            Class<?> cls3 = zzbvl;
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

    private static Field zzvs() {
        Field zzb2;
        if (zztn.zzrx() && (zzb2 = zzb(Buffer.class, "effectiveDirectAddress")) != null) {
            return zzb2;
        }
        Field zzb3 = zzb(Buffer.class, "address");
        if (zzb3 == null || zzb3.getType() != Long.TYPE) {
            return null;
        }
        return zzb3;
    }

    private static Field zzb(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static byte zzq(Object obj, long j) {
        return (byte) (zzk(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static byte zzr(Object obj, long j) {
        return (byte) (zzk(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    public static void zza(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (zzk(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    public static void zzb(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        zza(obj, j2, ((255 & b) << i) | (zzk(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    public static boolean zzs(Object obj, long j) {
        return zzq(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    public static boolean zzt(Object obj, long j) {
        return zzr(obj, j) != 0;
    }

    /* access modifiers changed from: private */
    public static void zzb(Object obj, long j, boolean z) {
        zza(obj, j, z ? (byte) 1 : 0);
    }

    /* access modifiers changed from: private */
    public static void zzc(Object obj, long j, boolean z) {
        zzb(obj, j, z ? (byte) 1 : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00d2, code lost:
        r1 = zzcep;
     */
    static {
        /*
            java.lang.Class<double[]> r0 = double[].class
            java.lang.Class<float[]> r1 = float[].class
            java.lang.Class<long[]> r2 = long[].class
            java.lang.Class<int[]> r3 = int[].class
            java.lang.Class<boolean[]> r4 = boolean[].class
            java.lang.Class<com.google.android.gms.internal.firebase_ml.zzya> r5 = com.google.android.gms.internal.firebase_ml.zzya.class
            java.lang.String r5 = r5.getName()
            java.util.logging.Logger r5 = java.util.logging.Logger.getLogger(r5)
            logger = r5
            sun.misc.Unsafe r5 = zzvp()
            zzcce = r5
            java.lang.Class r5 = com.google.android.gms.internal.firebase_ml.zztn.zzry()
            zzbvl = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            boolean r5 = zzp(r5)
            zzcen = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            boolean r5 = zzp(r5)
            zzceo = r5
            sun.misc.Unsafe r5 = zzcce
            r6 = 0
            if (r5 != 0) goto L_0x0038
            goto L_0x005d
        L_0x0038:
            boolean r5 = com.google.android.gms.internal.firebase_ml.zztn.zzrx()
            if (r5 == 0) goto L_0x0056
            boolean r5 = zzcen
            if (r5 == 0) goto L_0x004a
            com.google.android.gms.internal.firebase_ml.zzya$zza r6 = new com.google.android.gms.internal.firebase_ml.zzya$zza
            sun.misc.Unsafe r5 = zzcce
            r6.<init>(r5)
            goto L_0x005d
        L_0x004a:
            boolean r5 = zzceo
            if (r5 == 0) goto L_0x005d
            com.google.android.gms.internal.firebase_ml.zzya$zzb r6 = new com.google.android.gms.internal.firebase_ml.zzya$zzb
            sun.misc.Unsafe r5 = zzcce
            r6.<init>(r5)
            goto L_0x005d
        L_0x0056:
            com.google.android.gms.internal.firebase_ml.zzya$zzd r6 = new com.google.android.gms.internal.firebase_ml.zzya$zzd
            sun.misc.Unsafe r5 = zzcce
            r6.<init>(r5)
        L_0x005d:
            zzcep = r6
            boolean r5 = zzvr()
            zzceq = r5
            boolean r5 = zzvq()
            zzbwg = r5
            java.lang.Class<byte[]> r5 = byte[].class
            int r5 = zzn(r5)
            long r5 = (long) r5
            zzcer = r5
            int r5 = zzn(r4)
            long r5 = (long) r5
            zzces = r5
            int r4 = zzo(r4)
            long r4 = (long) r4
            zzcet = r4
            int r4 = zzn(r3)
            long r4 = (long) r4
            zzceu = r4
            int r3 = zzo(r3)
            long r3 = (long) r3
            zzcev = r3
            int r3 = zzn(r2)
            long r3 = (long) r3
            zzcew = r3
            int r2 = zzo(r2)
            long r2 = (long) r2
            zzcex = r2
            int r2 = zzn(r1)
            long r2 = (long) r2
            zzcey = r2
            int r1 = zzo(r1)
            long r1 = (long) r1
            zzcez = r1
            int r1 = zzn(r0)
            long r1 = (long) r1
            zzcfa = r1
            int r0 = zzo(r0)
            long r0 = (long) r0
            zzcfb = r0
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = zzn(r0)
            long r0 = (long) r0
            zzcfc = r0
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = zzo(r0)
            long r0 = (long) r0
            zzcfd = r0
            java.lang.reflect.Field r0 = zzvs()
            if (r0 == 0) goto L_0x00de
            com.google.android.gms.internal.firebase_ml.zzya$zzc r1 = zzcep
            if (r1 != 0) goto L_0x00d7
            goto L_0x00de
        L_0x00d7:
            sun.misc.Unsafe r1 = r1.zzcfh
            long r0 = r1.objectFieldOffset(r0)
            goto L_0x00e0
        L_0x00de:
            r0 = -1
        L_0x00e0:
            zzcfe = r0
            long r0 = zzcer
            r2 = 7
            long r0 = r0 & r2
            int r1 = (int) r0
            zzcff = r1
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x00f4
            r0 = 1
            goto L_0x00f5
        L_0x00f4:
            r0 = 0
        L_0x00f5:
            zzcfg = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzya.<clinit>():void");
    }
}
