package com.google.android.gms.internal.vision;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

final class zziu {
    private static final Logger logger = Logger.getLogger(zziu.class.getName());
    private static final boolean zzaaz = zzk(Long.TYPE);
    private static final boolean zzaba = zzk(Integer.TYPE);
    private static final zzd zzabb;
    private static final boolean zzabc = zzhl();
    /* access modifiers changed from: private */
    public static final long zzabd = ((long) zzi(byte[].class));
    private static final long zzabe;
    private static final long zzabf;
    private static final long zzabg;
    private static final long zzabh;
    private static final long zzabi;
    private static final long zzabj;
    private static final long zzabk;
    private static final long zzabl;
    private static final long zzabm;
    private static final long zzabn;
    private static final long zzabo = ((long) zzi(Object[].class));
    private static final long zzabp = ((long) zzj(Object[].class));
    private static final long zzabq;
    /* access modifiers changed from: private */
    public static final boolean zzabr = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);
    private static final Class<?> zzrm = zzeg.zzcl();
    private static final boolean zzsr = zzhk();
    private static final Unsafe zzzc = zzhj();

    private zziu() {
    }

    static final class zzb extends zzd {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        public final void zza(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        public final byte zzy(Object obj, long j) {
            if (zziu.zzabr) {
                return zziu.zzq(obj, j);
            }
            return zziu.zzr(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            if (zziu.zzabr) {
                zziu.zza(obj, j, b);
            } else {
                zziu.zzb(obj, j, b);
            }
        }

        public final boolean zzm(Object obj, long j) {
            if (zziu.zzabr) {
                return zziu.zzs(obj, j);
            }
            return zziu.zzt(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zziu.zzabr) {
                zziu.zzb(obj, j, z);
            } else {
                zziu.zzc(obj, j, z);
            }
        }

        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        public final void zza(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }

        public final void zza(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }
    }

    static final class zzc extends zzd {
        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        public final void zza(long j, byte b) {
            this.zzabs.putByte(j, b);
        }

        public final byte zzy(Object obj, long j) {
            return this.zzabs.getByte(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            this.zzabs.putByte(obj, j, b);
        }

        public final boolean zzm(Object obj, long j) {
            return this.zzabs.getBoolean(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            this.zzabs.putBoolean(obj, j, z);
        }

        public final float zzn(Object obj, long j) {
            return this.zzabs.getFloat(obj, j);
        }

        public final void zza(Object obj, long j, float f) {
            this.zzabs.putFloat(obj, j, f);
        }

        public final double zzo(Object obj, long j) {
            return this.zzabs.getDouble(obj, j);
        }

        public final void zza(Object obj, long j, double d) {
            this.zzabs.putDouble(obj, j, d);
        }

        public final void zza(byte[] bArr, long j, long j2, long j3) {
            this.zzabs.copyMemory(bArr, zziu.zzabd + j, (Object) null, j2, j3);
        }
    }

    static boolean zzhh() {
        return zzsr;
    }

    static abstract class zzd {
        Unsafe zzabs;

        zzd(Unsafe unsafe) {
            this.zzabs = unsafe;
        }

        public abstract void zza(long j, byte b);

        public abstract void zza(Object obj, long j, double d);

        public abstract void zza(Object obj, long j, float f);

        public abstract void zza(Object obj, long j, boolean z);

        public abstract void zza(byte[] bArr, long j, long j2, long j3);

        public abstract void zze(Object obj, long j, byte b);

        public abstract boolean zzm(Object obj, long j);

        public abstract float zzn(Object obj, long j);

        public abstract double zzo(Object obj, long j);

        public abstract byte zzy(Object obj, long j);

        public final int zzk(Object obj, long j) {
            return this.zzabs.getInt(obj, j);
        }

        public final void zzb(Object obj, long j, int i) {
            this.zzabs.putInt(obj, j, i);
        }

        public final long zzl(Object obj, long j) {
            return this.zzabs.getLong(obj, j);
        }

        public final void zza(Object obj, long j, long j2) {
            this.zzabs.putLong(obj, j, j2);
        }
    }

    static boolean zzhi() {
        return zzabc;
    }

    static final class zza extends zzd {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        public final void zza(long j, byte b) {
            Memory.pokeByte((int) (j & -1), b);
        }

        public final byte zzy(Object obj, long j) {
            if (zziu.zzabr) {
                return zziu.zzq(obj, j);
            }
            return zziu.zzr(obj, j);
        }

        public final void zze(Object obj, long j, byte b) {
            if (zziu.zzabr) {
                zziu.zza(obj, j, b);
            } else {
                zziu.zzb(obj, j, b);
            }
        }

        public final boolean zzm(Object obj, long j) {
            if (zziu.zzabr) {
                return zziu.zzs(obj, j);
            }
            return zziu.zzt(obj, j);
        }

        public final void zza(Object obj, long j, boolean z) {
            if (zziu.zzabr) {
                zziu.zzb(obj, j, z);
            } else {
                zziu.zzc(obj, j, z);
            }
        }

        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        public final void zza(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }

        public final void zza(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & -1), bArr, (int) j, (int) j3);
        }
    }

    static <T> T zzh(Class<T> cls) {
        try {
            return zzzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int zzi(Class<?> cls) {
        if (zzsr) {
            return zzabb.zzabs.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzj(Class<?> cls) {
        if (zzsr) {
            return zzabb.zzabs.arrayIndexScale(cls);
        }
        return -1;
    }

    static int zzk(Object obj, long j) {
        return zzabb.zzk(obj, j);
    }

    static void zzb(Object obj, long j, int i) {
        zzabb.zzb(obj, j, i);
    }

    static long zzl(Object obj, long j) {
        return zzabb.zzl(obj, j);
    }

    static void zza(Object obj, long j, long j2) {
        zzabb.zza(obj, j, j2);
    }

    static boolean zzm(Object obj, long j) {
        return zzabb.zzm(obj, j);
    }

    static void zza(Object obj, long j, boolean z) {
        zzabb.zza(obj, j, z);
    }

    static float zzn(Object obj, long j) {
        return zzabb.zzn(obj, j);
    }

    static void zza(Object obj, long j, float f) {
        zzabb.zza(obj, j, f);
    }

    static double zzo(Object obj, long j) {
        return zzabb.zzo(obj, j);
    }

    static void zza(Object obj, long j, double d) {
        zzabb.zza(obj, j, d);
    }

    static Object zzp(Object obj, long j) {
        return zzabb.zzabs.getObject(obj, j);
    }

    static void zza(Object obj, long j, Object obj2) {
        zzabb.zzabs.putObject(obj, j, obj2);
    }

    static byte zza(byte[] bArr, long j) {
        return zzabb.zzy(bArr, zzabd + j);
    }

    static void zza(byte[] bArr, long j, byte b) {
        zzabb.zze(bArr, zzabd + j, b);
    }

    static void zza(byte[] bArr, long j, long j2, long j3) {
        zzabb.zza(bArr, j, j2, j3);
    }

    static void zza(long j, byte b) {
        zzabb.zza(j, b);
    }

    static long zzb(ByteBuffer byteBuffer) {
        return zzabb.zzl(byteBuffer, zzabq);
    }

    static Unsafe zzhj() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zziv());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean zzhk() {
        Unsafe unsafe = zzzc;
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
            if (zzeg.zzck()) {
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

    private static boolean zzhl() {
        Unsafe unsafe = zzzc;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (zzhm() == null) {
                return false;
            }
            if (zzeg.zzck()) {
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

    private static boolean zzk(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!zzeg.zzck()) {
            return false;
        }
        try {
            Class<?> cls3 = zzrm;
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

    private static Field zzhm() {
        Field zzb2;
        if (zzeg.zzck() && (zzb2 = zzb(Buffer.class, "effectiveDirectAddress")) != null) {
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
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
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
        zzb(obj, j2, ((255 & b) << i) | (zzk(obj, j2) & ((255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    public static void zzb(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        zzb(obj, j2, ((255 & b) << i) | (zzk(obj, j2) & ((255 << i) ^ -1)));
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
        r1 = zzabb;
     */
    static {
        /*
            java.lang.Class<double[]> r0 = double[].class
            java.lang.Class<float[]> r1 = float[].class
            java.lang.Class<long[]> r2 = long[].class
            java.lang.Class<int[]> r3 = int[].class
            java.lang.Class<boolean[]> r4 = boolean[].class
            java.lang.Class<com.google.android.gms.internal.vision.zziu> r5 = com.google.android.gms.internal.vision.zziu.class
            java.lang.String r5 = r5.getName()
            java.util.logging.Logger r5 = java.util.logging.Logger.getLogger(r5)
            logger = r5
            sun.misc.Unsafe r5 = zzhj()
            zzzc = r5
            java.lang.Class r5 = com.google.android.gms.internal.vision.zzeg.zzcl()
            zzrm = r5
            java.lang.Class r5 = java.lang.Long.TYPE
            boolean r5 = zzk(r5)
            zzaaz = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            boolean r5 = zzk(r5)
            zzaba = r5
            sun.misc.Unsafe r5 = zzzc
            r6 = 0
            if (r5 != 0) goto L_0x0038
            goto L_0x005d
        L_0x0038:
            boolean r5 = com.google.android.gms.internal.vision.zzeg.zzck()
            if (r5 == 0) goto L_0x0056
            boolean r5 = zzaaz
            if (r5 == 0) goto L_0x004a
            com.google.android.gms.internal.vision.zziu$zzb r6 = new com.google.android.gms.internal.vision.zziu$zzb
            sun.misc.Unsafe r5 = zzzc
            r6.<init>(r5)
            goto L_0x005d
        L_0x004a:
            boolean r5 = zzaba
            if (r5 == 0) goto L_0x005d
            com.google.android.gms.internal.vision.zziu$zza r6 = new com.google.android.gms.internal.vision.zziu$zza
            sun.misc.Unsafe r5 = zzzc
            r6.<init>(r5)
            goto L_0x005d
        L_0x0056:
            com.google.android.gms.internal.vision.zziu$zzc r6 = new com.google.android.gms.internal.vision.zziu$zzc
            sun.misc.Unsafe r5 = zzzc
            r6.<init>(r5)
        L_0x005d:
            zzabb = r6
            boolean r5 = zzhl()
            zzabc = r5
            boolean r5 = zzhk()
            zzsr = r5
            java.lang.Class<byte[]> r5 = byte[].class
            int r5 = zzi(r5)
            long r5 = (long) r5
            zzabd = r5
            int r5 = zzi(r4)
            long r5 = (long) r5
            zzabe = r5
            int r4 = zzj(r4)
            long r4 = (long) r4
            zzabf = r4
            int r4 = zzi(r3)
            long r4 = (long) r4
            zzabg = r4
            int r3 = zzj(r3)
            long r3 = (long) r3
            zzabh = r3
            int r3 = zzi(r2)
            long r3 = (long) r3
            zzabi = r3
            int r2 = zzj(r2)
            long r2 = (long) r2
            zzabj = r2
            int r2 = zzi(r1)
            long r2 = (long) r2
            zzabk = r2
            int r1 = zzj(r1)
            long r1 = (long) r1
            zzabl = r1
            int r1 = zzi(r0)
            long r1 = (long) r1
            zzabm = r1
            int r0 = zzj(r0)
            long r0 = (long) r0
            zzabn = r0
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = zzi(r0)
            long r0 = (long) r0
            zzabo = r0
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            int r0 = zzj(r0)
            long r0 = (long) r0
            zzabp = r0
            java.lang.reflect.Field r0 = zzhm()
            if (r0 == 0) goto L_0x00de
            com.google.android.gms.internal.vision.zziu$zzd r1 = zzabb
            if (r1 != 0) goto L_0x00d7
            goto L_0x00de
        L_0x00d7:
            sun.misc.Unsafe r1 = r1.zzabs
            long r0 = r1.objectFieldOffset(r0)
            goto L_0x00e0
        L_0x00de:
            r0 = -1
        L_0x00e0:
            zzabq = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x00ec
            r0 = 1
            goto L_0x00ed
        L_0x00ec:
            r0 = 0
        L_0x00ed:
            zzabr = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zziu.<clinit>():void");
    }
}
