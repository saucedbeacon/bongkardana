package com.google.android.gms.internal.firebase_messaging;

import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import kotlin.text.Typography;

final class zzab implements ObjectEncoderContext {
    private static long getMax = 0;
    private static int getMin = 1;
    private static int length;
    private static char[] setMax;
    private static final Charset zza = Charset.forName(setMax(View.MeasureSpec.getSize(0), (char) (13791 - Color.alpha(0)), 4 - MotionEvent.axisFromString("")).intern());
    private static final FieldDescriptor zzg;
    private static final FieldDescriptor zzh;
    private static final ObjectEncoder<Map.Entry<Object, Object>> zzi = zzaa.zza;
    private OutputStream zzb;
    private final Map<Class<?>, ObjectEncoder<?>> zzc;
    private final Map<Class<?>, ValueEncoder<?>> zzd;
    private final ObjectEncoder<Object> zze;
    private final zzaf zzf = new zzaf(this);

    static {
        setMin();
        FieldDescriptor.Builder builder = FieldDescriptor.builder("key");
        zzv zzv = new zzv();
        zzv.zza(1);
        zzg = builder.withProperty(zzv.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("value");
        zzv zzv2 = new zzv();
        zzv2.zza(2);
        zzh = builder2.withProperty(zzv2.zzb()).build();
        int i = length + 39;
        getMin = i % 128;
        int i2 = i % 2;
    }

    zzab(OutputStream outputStream, Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.zzb = outputStream;
        this.zzc = map;
        this.zzd = map2;
        this.zze = objectEncoder;
    }

    static void setMin() {
        setMax = new char[]{13706, 43552, 2767, 60147, 19275};
        getMax = -949781720958066773L;
    }

    private final <T> zzab zzh(ObjectEncoder<T> objectEncoder, FieldDescriptor fieldDescriptor, T t, boolean z) throws IOException {
        long zzi2 = zzi(objectEncoder, t);
        if ((z ? '6' : 'Q') == '6') {
            int i = getMin + 113;
            length = i % 128;
            int i2 = i % 2;
            if (zzi2 == 0) {
                try {
                    int i3 = length + 17;
                    getMin = i3 % 128;
                    int i4 = i3 % 2;
                    int i5 = getMin + 25;
                    length = i5 % 128;
                    if (i5 % 2 == 0) {
                        return this;
                    }
                    Object[] objArr = null;
                    int length2 = objArr.length;
                    return this;
                } catch (Exception e) {
                    throw e;
                }
            }
        }
        zzn((zzl(fieldDescriptor) << 3) | 2);
        zzo(zzi2);
        objectEncoder.encode(t, this);
        return this;
    }

    private final <T> long zzi(ObjectEncoder<T> objectEncoder, T t) throws IOException {
        OutputStream outputStream;
        zzw zzw = new zzw();
        try {
            outputStream = this.zzb;
            this.zzb = zzw;
            objectEncoder.encode(t, this);
            this.zzb = outputStream;
            long zza2 = zzw.zza();
            zzw.close();
            int i = getMin + 9;
            length = i % 128;
            if (i % 2 == 0) {
                return zza2;
            }
            Object obj = null;
            super.hashCode();
            return zza2;
        } catch (Throwable th) {
            try {
                zzw.close();
            } catch (Throwable th2) {
                zzt.zza(th, th2);
            }
            throw th;
        }
    }

    private static ByteBuffer zzk(int i) {
        int i2 = getMin + 5;
        length = i2 % 128;
        if (!(i2 % 2 != 0)) {
            return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            int i3 = 99 / 0;
            return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        } catch (Exception e) {
            throw e;
        }
    }

    private static int zzl(FieldDescriptor fieldDescriptor) {
        int i = getMin + 53;
        length = i % 128;
        int i2 = i % 2;
        try {
            zzz zzz = (zzz) fieldDescriptor.getProperty(zzz.class);
            if (zzz != null) {
                int zza2 = zzz.zza();
                int i3 = getMin + 45;
                length = i3 % 128;
                if (!(i3 % 2 != 0)) {
                    return zza2;
                }
                Object[] objArr = null;
                int length2 = objArr.length;
                return zza2;
            }
            throw new EncodingException("Field has no @Protobuf config");
        } catch (Exception e) {
            throw e;
        }
    }

    private final void zzo(long j) throws IOException {
        while (true) {
            if ((-128 & j) == 0) {
                this.zzb.write(((int) j) & 127);
                return;
            }
            try {
                int i = length + 121;
                getMin = i % 128;
                int i2 = i % 2;
                this.zzb.write((((int) j) & 127) | 128);
                j >>>= 7;
                int i3 = getMin + 47;
                length = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e) {
                throw e;
            }
        }
    }

    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, double d) throws IOException {
        int i = getMin + 97;
        length = i % 128;
        if (!(i % 2 == 0)) {
            try {
                zzb(fieldDescriptor, d, true);
            } catch (Exception e) {
                throw e;
            }
        } else {
            zzb(fieldDescriptor, d, true);
        }
        return this;
    }

    @NonNull
    public final ObjectEncoderContext inline(@Nullable Object obj) throws IOException {
        int i = getMin + 35;
        length = i % 128;
        if (i % 2 == 0) {
            try {
                zzf(obj);
            } catch (Exception e) {
                throw e;
            }
        } else {
            zzf(obj);
            Object[] objArr = null;
            int length2 = objArr.length;
        }
        return this;
    }

    @NonNull
    public final ObjectEncoderContext nested(@NonNull FieldDescriptor fieldDescriptor) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if ((r6 != 0.0d) != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        if (r6 == 0.0d) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.firebase.encoders.ObjectEncoderContext zzb(@androidx.annotation.NonNull com.google.firebase.encoders.FieldDescriptor r5, double r6, boolean r8) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 31
            if (r8 == 0) goto L_0x0007
            r8 = 31
            goto L_0x0009
        L_0x0007:
            r8 = 55
        L_0x0009:
            r1 = 1
            if (r8 == r0) goto L_0x000d
            goto L_0x002a
        L_0x000d:
            int r8 = length
            int r8 = r8 + 121
            int r0 = r8 % 128
            getMin = r0
            int r8 = r8 % 2
            r2 = 0
            if (r8 != 0) goto L_0x0025
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0021
            r8 = 0
            goto L_0x0022
        L_0x0021:
            r8 = 1
        L_0x0022:
            if (r8 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0025:
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x002a
        L_0x0029:
            return r4
        L_0x002a:
            int r5 = zzl(r5)
            int r5 = r5 << 3
            r5 = r5 | r1
            r4.zzn(r5)
            java.io.OutputStream r5 = r4.zzb
            r8 = 8
            java.nio.ByteBuffer r8 = zzk(r8)
            java.nio.ByteBuffer r6 = r8.putDouble(r6)
            byte[] r6 = r6.array()
            r5.write(r6)
            int r5 = length     // Catch:{ Exception -> 0x0052 }
            int r5 = r5 + 49
            int r6 = r5 % 128
            getMin = r6     // Catch:{ Exception -> 0x0052 }
            int r5 = r5 % 2
            return r4
        L_0x0052:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_messaging.zzab.zzb(com.google.firebase.encoders.FieldDescriptor, double, boolean):com.google.firebase.encoders.ObjectEncoderContext");
    }

    static final /* synthetic */ void zzg(Map.Entry entry, ObjectEncoderContext objectEncoderContext) throws IOException {
        try {
            int i = getMin + 91;
            length = i % 128;
            int i2 = i % 2;
            objectEncoderContext.add(zzg, entry.getKey());
            objectEncoderContext.add(zzh, entry.getValue());
            int i3 = getMin + 95;
            length = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    private final <T> zzab zzj(ValueEncoder<T> valueEncoder, FieldDescriptor fieldDescriptor, T t, boolean z) throws IOException {
        try {
            int i = getMin + 75;
            length = i % 128;
            if ((i % 2 != 0 ? ':' : '8') != '8') {
                this.zzf.zza(fieldDescriptor, z);
                valueEncoder.encode(t, this.zzf);
                Object[] objArr = null;
                int length2 = objArr.length;
            } else {
                this.zzf.zza(fieldDescriptor, z);
                valueEncoder.encode(t, this.zzf);
            }
            return this;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r2 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        throw new com.google.firebase.encoders.EncodingException("Field has no @Protobuf config");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (r2 != null) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.firebase_messaging.zzz zzm(com.google.firebase.encoders.FieldDescriptor r2) {
        /*
            int r0 = getMin
            int r0 = r0 + 117
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
            r1 = 39
            if (r0 == 0) goto L_0x0011
            r0 = 39
            goto L_0x0013
        L_0x0011:
            r0 = 40
        L_0x0013:
            if (r0 == r1) goto L_0x0020
            java.lang.Class<com.google.android.gms.internal.firebase_messaging.zzz> r0 = com.google.android.gms.internal.firebase_messaging.zzz.class
            java.lang.annotation.Annotation r2 = r2.getProperty(r0)
            com.google.android.gms.internal.firebase_messaging.zzz r2 = (com.google.android.gms.internal.firebase_messaging.zzz) r2
            if (r2 == 0) goto L_0x0049
            goto L_0x002e
        L_0x0020:
            java.lang.Class<com.google.android.gms.internal.firebase_messaging.zzz> r0 = com.google.android.gms.internal.firebase_messaging.zzz.class
            java.lang.annotation.Annotation r2 = r2.getProperty(r0)
            com.google.android.gms.internal.firebase_messaging.zzz r2 = (com.google.android.gms.internal.firebase_messaging.zzz) r2
            r0 = 12
            int r0 = r0 / 0
            if (r2 == 0) goto L_0x0049
        L_0x002e:
            int r0 = length
            int r0 = r0 + 33
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            r1 = 77
            if (r0 != 0) goto L_0x003f
            r0 = 77
            goto L_0x0041
        L_0x003f:
            r0 = 21
        L_0x0041:
            if (r0 == r1) goto L_0x0044
            return r2
        L_0x0044:
            r0 = 0
            int r0 = r0.length     // Catch:{ all -> 0x0047 }
            return r2
        L_0x0047:
            r2 = move-exception
            throw r2
        L_0x0049:
            com.google.firebase.encoders.EncodingException r2 = new com.google.firebase.encoders.EncodingException
            java.lang.String r0 = "Field has no @Protobuf config"
            r2.<init>(r0)
            throw r2
        L_0x0051:
            r2 = move-exception
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_messaging.zzab.zzm(com.google.firebase.encoders.FieldDescriptor):com.google.android.gms.internal.firebase_messaging.zzz");
    }

    private final void zzn(int i) throws IOException {
        while (true) {
            if ((((long) (i & -128)) != 0 ? 16 : '@') != 16) {
                break;
            }
            try {
                int i2 = length + 39;
                getMin = i2 % 128;
                int i3 = i2 % 2;
                this.zzb.write((i & 127) | 128);
                i >>>= 7;
                int i4 = getMin + 77;
                length = i4 % 128;
                int i5 = i4 % 2;
            } catch (Exception e) {
                throw e;
            }
        }
        this.zzb.write(i & 127);
        int i6 = length + 97;
        getMin = i6 % 128;
        if (i6 % 2 == 0) {
            Object obj = null;
            super.hashCode();
        }
    }

    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, float f) throws IOException {
        int i = getMin + 111;
        length = i % 128;
        zzc(fieldDescriptor, f, (i % 2 != 0 ? Typography.less : 8) != '<');
        return this;
    }

    @NonNull
    public final ObjectEncoderContext nested(@NonNull String str) throws IOException {
        int i = length + 43;
        getMin = i % 128;
        char c = i % 2 == 0 ? Typography.dollar : 31;
        ObjectEncoderContext nested = nested(FieldDescriptor.of(str));
        if (c == '$') {
            Object obj = null;
            super.hashCode();
        }
        return nested;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        if (r0 != true) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002f, code lost:
        if ((r6 != 0 ? 9 : 'E') != 9) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.firebase_messaging.zzab zzd(@androidx.annotation.NonNull com.google.firebase.encoders.FieldDescriptor r5, int r6, boolean r7) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L_0x0006
            r7 = 1
            goto L_0x0007
        L_0x0006:
            r7 = 0
        L_0x0007:
            r2 = 2
            if (r7 == r1) goto L_0x000b
            goto L_0x0032
        L_0x000b:
            int r7 = getMin
            int r7 = r7 + 119
            int r3 = r7 % 128
            length = r3
            int r7 = r7 % r2
            if (r7 == 0) goto L_0x0018
            r7 = 0
            goto L_0x0019
        L_0x0018:
            r7 = 1
        L_0x0019:
            if (r7 == r1) goto L_0x0026
            r7 = 62
            int r7 = r7 / r0
            if (r6 == 0) goto L_0x0021
            r0 = 1
        L_0x0021:
            if (r0 == r1) goto L_0x0032
            goto L_0x0031
        L_0x0024:
            r5 = move-exception
            throw r5
        L_0x0026:
            r7 = 9
            if (r6 == 0) goto L_0x002d
            r0 = 9
            goto L_0x002f
        L_0x002d:
            r0 = 69
        L_0x002f:
            if (r0 == r7) goto L_0x0032
        L_0x0031:
            return r4
        L_0x0032:
            com.google.android.gms.internal.firebase_messaging.zzz r5 = zzm(r5)
            com.google.android.gms.internal.firebase_messaging.zzy r7 = com.google.android.gms.internal.firebase_messaging.zzy.DEFAULT
            com.google.android.gms.internal.firebase_messaging.zzy r7 = r5.zzb()
            int r7 = r7.ordinal()
            if (r7 == 0) goto L_0x008b
            if (r7 == r1) goto L_0x0070
            if (r7 == r2) goto L_0x0047
            goto L_0x0097
        L_0x0047:
            int r5 = r5.zza()     // Catch:{ Exception -> 0x006e }
            int r5 = r5 << 3
            r5 = r5 | 5
            r4.zzn(r5)     // Catch:{ Exception -> 0x006e }
            java.io.OutputStream r5 = r4.zzb     // Catch:{ Exception -> 0x006e }
            r7 = 4
            java.nio.ByteBuffer r7 = zzk(r7)     // Catch:{ Exception -> 0x006e }
            java.nio.ByteBuffer r6 = r7.putInt(r6)     // Catch:{ Exception -> 0x006e }
            byte[] r6 = r6.array()     // Catch:{ Exception -> 0x006e }
            r5.write(r6)     // Catch:{ Exception -> 0x006e }
            int r5 = length
            int r5 = r5 + 11
            int r6 = r5 % 128
            getMin = r6
            int r5 = r5 % r2
            goto L_0x0097
        L_0x006e:
            r5 = move-exception
            throw r5
        L_0x0070:
            int r5 = r5.zza()
            int r5 = r5 << 3
            r4.zzn(r5)
            int r5 = r6 + r6
            int r6 = r6 >> 31
            r5 = r5 ^ r6
            r4.zzn(r5)
            int r5 = getMin
            int r5 = r5 + 29
            int r6 = r5 % 128
            length = r6
            int r5 = r5 % r2
            goto L_0x0097
        L_0x008b:
            int r5 = r5.zza()
            int r5 = r5 << 3
            r4.zzn(r5)
            r4.zzn(r6)
        L_0x0097:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_messaging.zzab.zzd(com.google.firebase.encoders.FieldDescriptor, int, boolean):com.google.android.gms.internal.firebase_messaging.zzab");
    }

    @NonNull
    public final /* synthetic */ ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, int i) throws IOException {
        int i2 = length + 115;
        getMin = i2 % 128;
        int i3 = i2 % 2;
        zzd(fieldDescriptor, i, true);
        int i4 = getMin + 69;
        length = i4 % 128;
        if (i4 % 2 == 0) {
            return this;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final ObjectEncoderContext zzc(@NonNull FieldDescriptor fieldDescriptor, float f, boolean z) throws IOException {
        if (!(!z)) {
            int i = getMin + 87;
            length = i % 128;
            int i2 = i % 2;
            if ((f == 0.0f ? Typography.less : '%') == '<') {
                try {
                    int i3 = getMin + 21;
                    length = i3 % 128;
                    if ((i3 % 2 != 0 ? 'Y' : '2') == '2') {
                        return this;
                    }
                    Object[] objArr = null;
                    int length2 = objArr.length;
                    return this;
                } catch (Exception e) {
                    throw e;
                }
            }
        }
        zzn((zzl(fieldDescriptor) << 3) | 5);
        this.zzb.write(zzk(4).putFloat(f).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
        if ((r4 == null ? 'a' : '0') != '0') goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003b, code lost:
        r0 = r3.zzc.get(r4.getClass());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0047, code lost:
        if (r0 == null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0049, code lost:
        r0.encode(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r4 = java.lang.String.valueOf(r4.getClass());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r4).length() + 15);
        r2.append("No encoder for ");
        r2.append(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0075, code lost:
        throw new com.google.firebase.encoders.EncodingException(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0076, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0077, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0078, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0079, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if ((r4 == null ? 'F' : '\'') != 'F') goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.firebase_messaging.zzab zzf(@androidx.annotation.Nullable java.lang.Object r4) throws java.io.IOException {
        /*
            r3 = this;
            int r0 = length
            int r0 = r0 + 87
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x001c
            r0 = 0
            int r0 = r0.length     // Catch:{ all -> 0x001a }
            r0 = 70
            if (r4 != 0) goto L_0x0015
            r1 = 70
            goto L_0x0017
        L_0x0015:
            r1 = 39
        L_0x0017:
            if (r1 == r0) goto L_0x0027
            goto L_0x003b
        L_0x001a:
            r4 = move-exception
            throw r4
        L_0x001c:
            r0 = 48
            if (r4 != 0) goto L_0x0023
            r1 = 97
            goto L_0x0025
        L_0x0023:
            r1 = 48
        L_0x0025:
            if (r1 == r0) goto L_0x003b
        L_0x0027:
            int r4 = length
            int r4 = r4 + 73
            int r0 = r4 % 128
            getMin = r0
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x003a
            r4 = 96
            int r4 = r4 / 0
            return r3
        L_0x0038:
            r4 = move-exception
            throw r4
        L_0x003a:
            return r3
        L_0x003b:
            java.util.Map<java.lang.Class<?>, com.google.firebase.encoders.ObjectEncoder<?>> r0 = r3.zzc
            java.lang.Class r1 = r4.getClass()
            java.lang.Object r0 = r0.get(r1)
            com.google.firebase.encoders.ObjectEncoder r0 = (com.google.firebase.encoders.ObjectEncoder) r0
            if (r0 == 0) goto L_0x004d
            r0.encode(r4, r3)
            return r3
        L_0x004d:
            com.google.firebase.encoders.EncodingException r0 = new com.google.firebase.encoders.EncodingException
            java.lang.Class r4 = r4.getClass()     // Catch:{ Exception -> 0x0078 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0076 }
            java.lang.String r1 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0078 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x0078 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0078 }
            int r1 = r1 + 15
            r2.<init>(r1)     // Catch:{ Exception -> 0x0078 }
            java.lang.String r1 = "No encoder for "
            r2.append(r1)     // Catch:{ Exception -> 0x0078 }
            r2.append(r4)     // Catch:{ Exception -> 0x0078 }
            java.lang.String r4 = r2.toString()     // Catch:{ Exception -> 0x0078 }
            r0.<init>(r4)     // Catch:{ Exception -> 0x0078 }
            throw r0     // Catch:{ Exception -> 0x0078 }
        L_0x0076:
            r4 = move-exception
            throw r4
        L_0x0078:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_messaging.zzab.zzf(java.lang.Object):com.google.android.gms.internal.firebase_messaging.zzab");
    }

    @NonNull
    public final /* synthetic */ ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, long j) throws IOException {
        try {
            int i = getMin + 63;
            length = i % 128;
            int i2 = i % 2;
            zze(fieldDescriptor, j, true);
            int i3 = getMin + 105;
            length = i3 % 128;
            if ((i3 % 2 != 0 ? 'A' : ']') == ']') {
                return this;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return this;
        } catch (Exception e) {
            throw e;
        }
    }

    @NonNull
    public final ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException {
        int i = length + 77;
        getMin = i % 128;
        boolean z = false;
        if (i % 2 == 0) {
            zza(fieldDescriptor, obj, false);
        } else {
            zza(fieldDescriptor, obj, true);
        }
        int i2 = length + 33;
        getMin = i2 % 128;
        if (i2 % 2 != 0) {
            z = true;
        }
        if (z) {
            return this;
        }
        Object obj2 = null;
        super.hashCode();
        return this;
    }

    @NonNull
    public final /* synthetic */ ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, boolean z) throws IOException {
        int i = getMin + 105;
        length = i % 128;
        if (i % 2 != 0) {
        }
        zzd(fieldDescriptor, z ? 1 : 0, true);
        return this;
    }

    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, double d) throws IOException {
        int i = getMin + 47;
        length = i % 128;
        int i2 = i % 2;
        try {
            zzb(FieldDescriptor.of(str), d, true);
            int i3 = getMin + 91;
            length = i3 % 128;
            if ((i3 % 2 != 0 ? ':' : 'I') != ':') {
                return this;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return this;
        } catch (Exception e) {
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if ((r8 != 0) != true) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r8 != 0) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.firebase_messaging.zzab zze(@androidx.annotation.NonNull com.google.firebase.encoders.FieldDescriptor r7, long r8, boolean r10) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            if (r10 == 0) goto L_0x0042
            int r10 = length
            int r10 = r10 + 15
            int r2 = r10 % 128
            getMin = r2
            int r10 = r10 % r0
            r2 = 4
            if (r10 != 0) goto L_0x0013
            r10 = 72
            goto L_0x0014
        L_0x0013:
            r10 = 4
        L_0x0014:
            r3 = 0
            r4 = 0
            if (r10 == r2) goto L_0x001e
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x0027
            goto L_0x0042
        L_0x001e:
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 == 0) goto L_0x0024
            r10 = 1
            goto L_0x0025
        L_0x0024:
            r10 = 0
        L_0x0025:
            if (r10 == r1) goto L_0x0042
        L_0x0027:
            int r7 = length     // Catch:{ Exception -> 0x0040 }
            int r7 = r7 + 15
            int r8 = r7 % 128
            getMin = r8     // Catch:{ Exception -> 0x003e }
            int r7 = r7 % r0
            if (r7 != 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            if (r1 == 0) goto L_0x003d
            r7 = 0
            super.hashCode()     // Catch:{ all -> 0x003b }
            return r6
        L_0x003b:
            r7 = move-exception
            throw r7
        L_0x003d:
            return r6
        L_0x003e:
            r7 = move-exception
            throw r7
        L_0x0040:
            r7 = move-exception
            throw r7
        L_0x0042:
            com.google.android.gms.internal.firebase_messaging.zzz r7 = zzm(r7)
            com.google.android.gms.internal.firebase_messaging.zzy r10 = com.google.android.gms.internal.firebase_messaging.zzy.DEFAULT
            com.google.android.gms.internal.firebase_messaging.zzy r10 = r7.zzb()
            int r10 = r10.ordinal()
            if (r10 == 0) goto L_0x0089
            if (r10 == r1) goto L_0x0075
            if (r10 == r0) goto L_0x0057
            goto L_0x0095
        L_0x0057:
            int r7 = r7.zza()
            int r7 = r7 << 3
            r7 = r7 | r1
            r6.zzn(r7)
            java.io.OutputStream r7 = r6.zzb
            r10 = 8
            java.nio.ByteBuffer r10 = zzk(r10)
            java.nio.ByteBuffer r8 = r10.putLong(r8)
            byte[] r8 = r8.array()
            r7.write(r8)
            goto L_0x0095
        L_0x0075:
            int r7 = r7.zza()
            int r7 = r7 << 3
            r6.zzn(r7)
            long r0 = r8 + r8
            r7 = 63
            long r7 = r8 >> r7
            long r7 = r7 ^ r0
            r6.zzo(r7)
            goto L_0x0095
        L_0x0089:
            int r7 = r7.zza()
            int r7 = r7 << 3
            r6.zzn(r7)
            r6.zzo(r8)
        L_0x0095:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_messaging.zzab.zze(com.google.firebase.encoders.FieldDescriptor, long, boolean):com.google.android.gms.internal.firebase_messaging.zzab");
    }

    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, int i) throws IOException {
        int i2 = length + 43;
        getMin = i2 % 128;
        if (i2 % 2 == 0) {
        }
        zzd(FieldDescriptor.of(str), i, true);
        int i3 = length + 35;
        getMin = i3 % 128;
        if ((i3 % 2 == 0 ? ' ' : 23) == 23) {
            return this;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return this;
    }

    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, long j) throws IOException {
        FieldDescriptor of;
        boolean z;
        int i = length + 109;
        getMin = i % 128;
        if ((i % 2 == 0 ? 29 : ':') != ':') {
            of = FieldDescriptor.of(str);
            z = false;
        } else {
            of = FieldDescriptor.of(str);
            z = true;
        }
        zze(of, j, z);
        return this;
    }

    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, @Nullable Object obj) throws IOException {
        int i = getMin + 73;
        length = i % 128;
        int i2 = i % 2;
        zza(FieldDescriptor.of(str), obj, true);
        int i3 = getMin + 63;
        length = i3 % 128;
        if (!(i3 % 2 != 0)) {
            return this;
        }
        int i4 = 75 / 0;
        return this;
    }

    @NonNull
    public final ObjectEncoderContext add(@NonNull String str, boolean z) throws IOException {
        try {
            int i = length + 83;
            try {
                getMin = i % 128;
                int i2 = i % 2;
                zzd(FieldDescriptor.of(str), z ? 1 : 0, true);
                int i3 = length + 113;
                getMin = i3 % 128;
                int i4 = i3 % 2;
                return this;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* access modifiers changed from: package-private */
    public final ObjectEncoderContext zza(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj, boolean z) throws IOException {
        int i = getMin + 21;
        length = i % 128;
        int i2 = i % 2;
        if ((obj == null ? 'U' : 'N') == 'U') {
            int i3 = length + 29;
            getMin = i3 % 128;
            int i4 = i3 % 2;
            return this;
        } else if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if ((z ? '%' : 2) != 2) {
                try {
                    if (charSequence.length() == 0) {
                        return this;
                    }
                } catch (Exception e) {
                    throw e;
                }
            }
            zzn((zzl(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(zza);
            zzn(bytes.length);
            this.zzb.write(bytes);
            return this;
        } else {
            boolean z2 = false;
            if ((obj instanceof Collection ? '8' : '2') != '2') {
                for (Object zza2 : (Collection) obj) {
                    zza(fieldDescriptor, zza2, false);
                }
                int i5 = getMin + 17;
                length = i5 % 128;
                int i6 = i5 % 2;
                return this;
            } else if (obj instanceof Map) {
                for (Map.Entry zzh2 : ((Map) obj).entrySet()) {
                    try {
                        zzh(zzi, fieldDescriptor, zzh2, false);
                    } catch (Exception e2) {
                        throw e2;
                    }
                }
                return this;
            } else if (obj instanceof Double) {
                zzb(fieldDescriptor, ((Double) obj).doubleValue(), z);
                return this;
            } else if (obj instanceof Float) {
                zzc(fieldDescriptor, ((Float) obj).floatValue(), z);
                return this;
            } else {
                Object[] objArr = null;
                if (obj instanceof Number) {
                    int i7 = getMin + 119;
                    length = i7 % 128;
                    if (i7 % 2 != 0) {
                        zze(fieldDescriptor, ((Number) obj).longValue(), z);
                        int length2 = objArr.length;
                        return this;
                    }
                    zze(fieldDescriptor, ((Number) obj).longValue(), z);
                    return this;
                } else if (obj instanceof Boolean) {
                    zzd(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z);
                    return this;
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    if (!z) {
                        z2 = true;
                    }
                    if (!z2 && bArr.length == 0) {
                        return this;
                    }
                    zzn((zzl(fieldDescriptor) << 3) | 2);
                    zzn(bArr.length);
                    this.zzb.write(bArr);
                    return this;
                } else {
                    ObjectEncoder objectEncoder = this.zzc.get(obj.getClass());
                    if (objectEncoder != null) {
                        int i8 = length + 103;
                        getMin = i8 % 128;
                        if (i8 % 2 == 0) {
                            zzh(objectEncoder, fieldDescriptor, obj, z);
                            int length3 = objArr.length;
                            return this;
                        }
                        zzh(objectEncoder, fieldDescriptor, obj, z);
                        return this;
                    }
                    ValueEncoder valueEncoder = this.zzd.get(obj.getClass());
                    if (valueEncoder == null) {
                        if (obj instanceof zzx) {
                            z2 = true;
                        }
                        if (z2) {
                            int i9 = getMin + 121;
                            length = i9 % 128;
                            if (i9 % 2 != 0) {
                                zzd(fieldDescriptor, ((zzx) obj).getNumber(), true);
                                return this;
                            }
                            zzd(fieldDescriptor, ((zzx) obj).getNumber(), true);
                            return this;
                        } else if (obj instanceof Enum) {
                            zzd(fieldDescriptor, ((Enum) obj).ordinal(), true);
                            return this;
                        } else {
                            zzh(this.zze, fieldDescriptor, obj, z);
                            return this;
                        }
                    } else {
                        zzj(valueEncoder, fieldDescriptor, obj, z);
                        return this;
                    }
                }
            }
        }
    }

    private static String setMax(int i, char c, int i2) {
        int i3;
        char[] cArr;
        int i4;
        int i5 = getMin + 99;
        length = i5 % 128;
        if (i5 % 2 == 0) {
            cArr = new char[i2];
            i3 = 0;
        } else {
            cArr = new char[i2];
            i3 = 1;
        }
        while (true) {
            if (i3 < i2) {
                try {
                    int i6 = getMin + 47;
                    length = i6 % 128;
                    if (i6 % 2 != 0) {
                        cArr[i3] = (char) ((int) ((((long) setMax[i << i3]) & (((long) i3) / getMax)) | ((long) c)));
                        i4 = i3 + 114;
                    } else {
                        cArr[i3] = (char) ((int) ((((long) setMax[i + i3]) ^ (((long) i3) * getMax)) ^ ((long) c)));
                        i4 = i3 + 1;
                    }
                } catch (Exception e) {
                    throw e;
                }
            } else {
                String str = new String(cArr);
                int i7 = getMin + 41;
                length = i7 % 128;
                int i8 = i7 % 2;
                return str;
            }
        }
    }
}
