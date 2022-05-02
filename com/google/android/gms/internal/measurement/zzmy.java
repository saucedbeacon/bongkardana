package com.google.android.gms.internal.measurement;

public enum zzmy {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(false),
    STRING(""),
    BYTE_STRING(zzjd.zzb),
    ENUM((String) null),
    MESSAGE((String) null);
    
    private final Object zzj;

    private zzmy(Object obj) {
        this.zzj = obj;
    }
}
