package com.google.android.gms.internal.firebase_ml;

public enum zzvk {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zztq.class, zztq.class, zztq.zzbvs),
    ENUM(Integer.TYPE, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    
    private final Class<?> zzcba;
    private final Class<?> zzcbb;
    private final Object zzcbc;

    private zzvk(Class<?> cls, Class<?> cls2, Object obj) {
        this.zzcba = cls;
        this.zzcbb = cls2;
        this.zzcbc = obj;
    }

    public final Class<?> zztw() {
        return this.zzcbb;
    }
}
