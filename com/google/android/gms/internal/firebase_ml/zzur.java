package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.Type;

public enum zzur {
    DOUBLE(0, zzut.SCALAR, zzvk.DOUBLE),
    FLOAT(1, zzut.SCALAR, zzvk.FLOAT),
    INT64(2, zzut.SCALAR, zzvk.LONG),
    UINT64(3, zzut.SCALAR, zzvk.LONG),
    INT32(4, zzut.SCALAR, zzvk.INT),
    FIXED64(5, zzut.SCALAR, zzvk.LONG),
    FIXED32(6, zzut.SCALAR, zzvk.INT),
    BOOL(7, zzut.SCALAR, zzvk.BOOLEAN),
    STRING(8, zzut.SCALAR, zzvk.STRING),
    MESSAGE(9, zzut.SCALAR, zzvk.MESSAGE),
    BYTES(10, zzut.SCALAR, zzvk.BYTE_STRING),
    UINT32(11, zzut.SCALAR, zzvk.INT),
    ENUM(12, zzut.SCALAR, zzvk.ENUM),
    SFIXED32(13, zzut.SCALAR, zzvk.INT),
    SFIXED64(14, zzut.SCALAR, zzvk.LONG),
    SINT32(15, zzut.SCALAR, zzvk.INT),
    SINT64(16, zzut.SCALAR, zzvk.LONG),
    GROUP(17, zzut.SCALAR, zzvk.MESSAGE),
    DOUBLE_LIST(18, zzut.VECTOR, zzvk.DOUBLE),
    FLOAT_LIST(19, zzut.VECTOR, zzvk.FLOAT),
    INT64_LIST(20, zzut.VECTOR, zzvk.LONG),
    UINT64_LIST(21, zzut.VECTOR, zzvk.LONG),
    INT32_LIST(22, zzut.VECTOR, zzvk.INT),
    FIXED64_LIST(23, zzut.VECTOR, zzvk.LONG),
    FIXED32_LIST(24, zzut.VECTOR, zzvk.INT),
    BOOL_LIST(25, zzut.VECTOR, zzvk.BOOLEAN),
    STRING_LIST(26, zzut.VECTOR, zzvk.STRING),
    MESSAGE_LIST(27, zzut.VECTOR, zzvk.MESSAGE),
    BYTES_LIST(28, zzut.VECTOR, zzvk.BYTE_STRING),
    UINT32_LIST(29, zzut.VECTOR, zzvk.INT),
    ENUM_LIST(30, zzut.VECTOR, zzvk.ENUM),
    SFIXED32_LIST(31, zzut.VECTOR, zzvk.INT),
    SFIXED64_LIST(32, zzut.VECTOR, zzvk.LONG),
    SINT32_LIST(33, zzut.VECTOR, zzvk.INT),
    SINT64_LIST(34, zzut.VECTOR, zzvk.LONG),
    DOUBLE_LIST_PACKED(35, zzut.PACKED_VECTOR, zzvk.DOUBLE),
    FLOAT_LIST_PACKED(36, zzut.PACKED_VECTOR, zzvk.FLOAT),
    INT64_LIST_PACKED(37, zzut.PACKED_VECTOR, zzvk.LONG),
    UINT64_LIST_PACKED(38, zzut.PACKED_VECTOR, zzvk.LONG),
    INT32_LIST_PACKED(39, zzut.PACKED_VECTOR, zzvk.INT),
    FIXED64_LIST_PACKED(40, zzut.PACKED_VECTOR, zzvk.LONG),
    FIXED32_LIST_PACKED(41, zzut.PACKED_VECTOR, zzvk.INT),
    BOOL_LIST_PACKED(42, zzut.PACKED_VECTOR, zzvk.BOOLEAN),
    UINT32_LIST_PACKED(43, zzut.PACKED_VECTOR, zzvk.INT),
    ENUM_LIST_PACKED(44, zzut.PACKED_VECTOR, zzvk.ENUM),
    SFIXED32_LIST_PACKED(45, zzut.PACKED_VECTOR, zzvk.INT),
    SFIXED64_LIST_PACKED(46, zzut.PACKED_VECTOR, zzvk.LONG),
    SINT32_LIST_PACKED(47, zzut.PACKED_VECTOR, zzvk.INT),
    SINT64_LIST_PACKED(48, zzut.PACKED_VECTOR, zzvk.LONG),
    GROUP_LIST(49, zzut.VECTOR, zzvk.MESSAGE),
    MAP(50, zzut.MAP, zzvk.VOID);
    
    private static final zzur[] zzbzb = null;
    private static final Type[] zzbzc = null;

    /* renamed from: id  reason: collision with root package name */
    private final int f10800id;
    private final zzvk zzbyx;
    private final zzut zzbyy;
    private final Class<?> zzbyz;
    private final boolean zzbza;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        r5 = com.google.android.gms.internal.firebase_ml.zzuu.zzbzl[r6.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzur(int r4, com.google.android.gms.internal.firebase_ml.zzut r5, com.google.android.gms.internal.firebase_ml.zzvk r6) {
        /*
            r1 = this;
            r1.<init>(r2, r3)
            r1.f10800id = r4
            r1.zzbyy = r5
            r1.zzbyx = r6
            int[] r2 = com.google.android.gms.internal.firebase_ml.zzuu.zzbzk
            int r3 = r5.ordinal()
            r2 = r2[r3]
            r3 = 2
            r4 = 1
            if (r2 == r4) goto L_0x0022
            if (r2 == r3) goto L_0x001b
            r2 = 0
            r1.zzbyz = r2
            goto L_0x0028
        L_0x001b:
            java.lang.Class r2 = r6.zztw()
            r1.zzbyz = r2
            goto L_0x0028
        L_0x0022:
            java.lang.Class r2 = r6.zztw()
            r1.zzbyz = r2
        L_0x0028:
            r2 = 0
            com.google.android.gms.internal.firebase_ml.zzut r0 = com.google.android.gms.internal.firebase_ml.zzut.SCALAR
            if (r5 != r0) goto L_0x003d
            int[] r5 = com.google.android.gms.internal.firebase_ml.zzuu.zzbzl
            int r6 = r6.ordinal()
            r5 = r5[r6]
            if (r5 == r4) goto L_0x003d
            if (r5 == r3) goto L_0x003d
            r3 = 3
            if (r5 == r3) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r4 = 0
        L_0x003e:
            r1.zzbza = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzur.<init>(java.lang.String, int, int, com.google.android.gms.internal.firebase_ml.zzut, com.google.android.gms.internal.firebase_ml.zzvk):void");
    }

    public final int id() {
        return this.f10800id;
    }

    static {
        int i;
        zzbzc = new Type[0];
        zzur[] values = values();
        zzbzb = new zzur[values.length];
        for (zzur zzur : values) {
            zzbzb[zzur.f10800id] = zzur;
        }
    }
}
