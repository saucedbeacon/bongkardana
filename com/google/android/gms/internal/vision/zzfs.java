package com.google.android.gms.internal.vision;

import java.lang.reflect.Type;

public enum zzfs {
    DOUBLE(0, zzfu.SCALAR, zzgh.DOUBLE),
    FLOAT(1, zzfu.SCALAR, zzgh.FLOAT),
    INT64(2, zzfu.SCALAR, zzgh.LONG),
    UINT64(3, zzfu.SCALAR, zzgh.LONG),
    INT32(4, zzfu.SCALAR, zzgh.INT),
    FIXED64(5, zzfu.SCALAR, zzgh.LONG),
    FIXED32(6, zzfu.SCALAR, zzgh.INT),
    BOOL(7, zzfu.SCALAR, zzgh.BOOLEAN),
    STRING(8, zzfu.SCALAR, zzgh.STRING),
    MESSAGE(9, zzfu.SCALAR, zzgh.MESSAGE),
    BYTES(10, zzfu.SCALAR, zzgh.BYTE_STRING),
    UINT32(11, zzfu.SCALAR, zzgh.INT),
    ENUM(12, zzfu.SCALAR, zzgh.ENUM),
    SFIXED32(13, zzfu.SCALAR, zzgh.INT),
    SFIXED64(14, zzfu.SCALAR, zzgh.LONG),
    SINT32(15, zzfu.SCALAR, zzgh.INT),
    SINT64(16, zzfu.SCALAR, zzgh.LONG),
    GROUP(17, zzfu.SCALAR, zzgh.MESSAGE),
    DOUBLE_LIST(18, zzfu.VECTOR, zzgh.DOUBLE),
    FLOAT_LIST(19, zzfu.VECTOR, zzgh.FLOAT),
    INT64_LIST(20, zzfu.VECTOR, zzgh.LONG),
    UINT64_LIST(21, zzfu.VECTOR, zzgh.LONG),
    INT32_LIST(22, zzfu.VECTOR, zzgh.INT),
    FIXED64_LIST(23, zzfu.VECTOR, zzgh.LONG),
    FIXED32_LIST(24, zzfu.VECTOR, zzgh.INT),
    BOOL_LIST(25, zzfu.VECTOR, zzgh.BOOLEAN),
    STRING_LIST(26, zzfu.VECTOR, zzgh.STRING),
    MESSAGE_LIST(27, zzfu.VECTOR, zzgh.MESSAGE),
    BYTES_LIST(28, zzfu.VECTOR, zzgh.BYTE_STRING),
    UINT32_LIST(29, zzfu.VECTOR, zzgh.INT),
    ENUM_LIST(30, zzfu.VECTOR, zzgh.ENUM),
    SFIXED32_LIST(31, zzfu.VECTOR, zzgh.INT),
    SFIXED64_LIST(32, zzfu.VECTOR, zzgh.LONG),
    SINT32_LIST(33, zzfu.VECTOR, zzgh.INT),
    SINT64_LIST(34, zzfu.VECTOR, zzgh.LONG),
    DOUBLE_LIST_PACKED(35, zzfu.PACKED_VECTOR, zzgh.DOUBLE),
    FLOAT_LIST_PACKED(36, zzfu.PACKED_VECTOR, zzgh.FLOAT),
    INT64_LIST_PACKED(37, zzfu.PACKED_VECTOR, zzgh.LONG),
    UINT64_LIST_PACKED(38, zzfu.PACKED_VECTOR, zzgh.LONG),
    INT32_LIST_PACKED(39, zzfu.PACKED_VECTOR, zzgh.INT),
    FIXED64_LIST_PACKED(40, zzfu.PACKED_VECTOR, zzgh.LONG),
    FIXED32_LIST_PACKED(41, zzfu.PACKED_VECTOR, zzgh.INT),
    BOOL_LIST_PACKED(42, zzfu.PACKED_VECTOR, zzgh.BOOLEAN),
    UINT32_LIST_PACKED(43, zzfu.PACKED_VECTOR, zzgh.INT),
    ENUM_LIST_PACKED(44, zzfu.PACKED_VECTOR, zzgh.ENUM),
    SFIXED32_LIST_PACKED(45, zzfu.PACKED_VECTOR, zzgh.INT),
    SFIXED64_LIST_PACKED(46, zzfu.PACKED_VECTOR, zzgh.LONG),
    SINT32_LIST_PACKED(47, zzfu.PACKED_VECTOR, zzgh.INT),
    SINT64_LIST_PACKED(48, zzfu.PACKED_VECTOR, zzgh.LONG),
    GROUP_LIST(49, zzfu.VECTOR, zzgh.MESSAGE),
    MAP(50, zzfu.MAP, zzgh.VOID);
    
    private static final zzfs[] zzvu = null;
    private static final Type[] zzvv = null;

    /* renamed from: id  reason: collision with root package name */
    private final int f10824id;
    private final zzgh zzvq;
    private final zzfu zzvr;
    private final Class<?> zzvs;
    private final boolean zzvt;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        r5 = com.google.android.gms.internal.vision.zzft.zzvy[r6.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzfs(int r4, com.google.android.gms.internal.vision.zzfu r5, com.google.android.gms.internal.vision.zzgh r6) {
        /*
            r1 = this;
            r1.<init>(r2, r3)
            r1.f10824id = r4
            r1.zzvr = r5
            r1.zzvq = r6
            int[] r2 = com.google.android.gms.internal.vision.zzft.zzvx
            int r3 = r5.ordinal()
            r2 = r2[r3]
            r3 = 2
            r4 = 1
            if (r2 == r4) goto L_0x0022
            if (r2 == r3) goto L_0x001b
            r2 = 0
            r1.zzvs = r2
            goto L_0x0028
        L_0x001b:
            java.lang.Class r2 = r6.zzfq()
            r1.zzvs = r2
            goto L_0x0028
        L_0x0022:
            java.lang.Class r2 = r6.zzfq()
            r1.zzvs = r2
        L_0x0028:
            r2 = 0
            com.google.android.gms.internal.vision.zzfu r0 = com.google.android.gms.internal.vision.zzfu.SCALAR
            if (r5 != r0) goto L_0x003d
            int[] r5 = com.google.android.gms.internal.vision.zzft.zzvy
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
            r1.zzvt = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.zzfs.<init>(java.lang.String, int, int, com.google.android.gms.internal.vision.zzfu, com.google.android.gms.internal.vision.zzgh):void");
    }

    public final int id() {
        return this.f10824id;
    }

    static {
        int i;
        zzvv = new Type[0];
        zzfs[] values = values();
        zzvu = new zzfs[values.length];
        for (zzfs zzfs : values) {
            zzvu[zzfs.f10824id] = zzfs;
        }
    }
}
