package com.google.android.gms.internal.measurement;

public enum zzjv {
    DOUBLE(0, 1, zzko.DOUBLE),
    FLOAT(1, 1, zzko.FLOAT),
    INT64(2, 1, zzko.LONG),
    UINT64(3, 1, zzko.LONG),
    INT32(4, 1, zzko.INT),
    FIXED64(5, 1, zzko.LONG),
    FIXED32(6, 1, zzko.INT),
    BOOL(7, 1, zzko.BOOLEAN),
    STRING(8, 1, zzko.STRING),
    MESSAGE(9, 1, zzko.MESSAGE),
    BYTES(10, 1, zzko.BYTE_STRING),
    UINT32(11, 1, zzko.INT),
    ENUM(12, 1, zzko.ENUM),
    SFIXED32(13, 1, zzko.INT),
    SFIXED64(14, 1, zzko.LONG),
    SINT32(15, 1, zzko.INT),
    SINT64(16, 1, zzko.LONG),
    GROUP(17, 1, zzko.MESSAGE),
    DOUBLE_LIST(18, 2, zzko.DOUBLE),
    FLOAT_LIST(19, 2, zzko.FLOAT),
    INT64_LIST(20, 2, zzko.LONG),
    UINT64_LIST(21, 2, zzko.LONG),
    INT32_LIST(22, 2, zzko.INT),
    FIXED64_LIST(23, 2, zzko.LONG),
    FIXED32_LIST(24, 2, zzko.INT),
    BOOL_LIST(25, 2, zzko.BOOLEAN),
    STRING_LIST(26, 2, zzko.STRING),
    MESSAGE_LIST(27, 2, zzko.MESSAGE),
    BYTES_LIST(28, 2, zzko.BYTE_STRING),
    UINT32_LIST(29, 2, zzko.INT),
    ENUM_LIST(30, 2, zzko.ENUM),
    SFIXED32_LIST(31, 2, zzko.INT),
    SFIXED64_LIST(32, 2, zzko.LONG),
    SINT32_LIST(33, 2, zzko.INT),
    SINT64_LIST(34, 2, zzko.LONG),
    DOUBLE_LIST_PACKED(35, 3, zzko.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zzko.FLOAT),
    INT64_LIST_PACKED(37, 3, zzko.LONG),
    UINT64_LIST_PACKED(38, 3, zzko.LONG),
    INT32_LIST_PACKED(39, 3, zzko.INT),
    FIXED64_LIST_PACKED(40, 3, zzko.LONG),
    FIXED32_LIST_PACKED(41, 3, zzko.INT),
    BOOL_LIST_PACKED(42, 3, zzko.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zzko.INT),
    ENUM_LIST_PACKED(44, 3, zzko.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zzko.INT),
    SFIXED64_LIST_PACKED(46, 3, zzko.LONG),
    SINT32_LIST_PACKED(47, 3, zzko.INT),
    SINT64_LIST_PACKED(48, 3, zzko.LONG),
    GROUP_LIST(49, 2, zzko.MESSAGE),
    MAP(50, 4, zzko.VOID);
    
    private static final zzjv[] zzac = null;
    private final zzko zzZ;
    private final int zzaa;
    private final Class<?> zzab;

    static {
        int i;
        zzac = new zzjv[r1];
        for (zzjv zzjv : values()) {
            zzac[zzjv.zzaa] = zzjv;
        }
    }

    private zzjv(int i, int i2, zzko zzko) {
        this.zzaa = i;
        this.zzZ = zzko;
        zzko zzko2 = zzko.VOID;
        int i3 = i2 - 1;
        if (i3 == 1) {
            this.zzab = zzko.zza();
        } else if (i3 != 3) {
            this.zzab = null;
        } else {
            this.zzab = zzko.zza();
        }
        if (i2 == 1) {
            zzko.ordinal();
        }
    }

    public final int zza() {
        return this.zzaa;
    }
}
