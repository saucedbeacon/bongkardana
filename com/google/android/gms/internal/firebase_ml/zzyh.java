package com.google.android.gms.internal.firebase_ml;

public enum zzyh {
    DOUBLE(zzyo.DOUBLE, 1),
    FLOAT(zzyo.FLOAT, 5),
    INT64(zzyo.LONG, 0),
    UINT64(zzyo.LONG, 0),
    INT32(zzyo.INT, 0),
    FIXED64(zzyo.LONG, 1),
    FIXED32(zzyo.INT, 5),
    BOOL(zzyo.BOOLEAN, 0),
    STRING(zzyo.STRING, 2),
    GROUP(zzyo.MESSAGE, 3),
    MESSAGE(zzyo.MESSAGE, 2),
    BYTES(zzyo.BYTE_STRING, 2),
    UINT32(zzyo.INT, 0),
    ENUM(zzyo.ENUM, 0),
    SFIXED32(zzyo.INT, 5),
    SFIXED64(zzyo.LONG, 1),
    SINT32(zzyo.INT, 0),
    SINT64(zzyo.LONG, 0);
    
    private final zzyo zzcgb;
    private final int zzcgc;

    private zzyh(zzyo zzyo, int i) {
        this.zzcgb = zzyo;
        this.zzcgc = i;
    }

    public final zzyo zzvt() {
        return this.zzcgb;
    }

    public final int zzvu() {
        return this.zzcgc;
    }
}
