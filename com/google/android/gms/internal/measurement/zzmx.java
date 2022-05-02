package com.google.android.gms.internal.measurement;

public enum zzmx {
    DOUBLE(zzmy.DOUBLE, 1),
    FLOAT(zzmy.FLOAT, 5),
    INT64(zzmy.LONG, 0),
    UINT64(zzmy.LONG, 0),
    INT32(zzmy.INT, 0),
    FIXED64(zzmy.LONG, 1),
    FIXED32(zzmy.INT, 5),
    BOOL(zzmy.BOOLEAN, 0),
    STRING(zzmy.STRING, 2),
    GROUP(zzmy.MESSAGE, 3),
    MESSAGE(zzmy.MESSAGE, 2),
    BYTES(zzmy.BYTE_STRING, 2),
    UINT32(zzmy.INT, 0),
    ENUM(zzmy.ENUM, 0),
    SFIXED32(zzmy.INT, 5),
    SFIXED64(zzmy.LONG, 1),
    SINT32(zzmy.INT, 0),
    SINT64(zzmy.LONG, 0);
    
    private final zzmy zzs;

    private zzmx(zzmy zzmy, int i) {
        this.zzs = zzmy;
    }

    public final zzmy zza() {
        return this.zzs;
    }
}
