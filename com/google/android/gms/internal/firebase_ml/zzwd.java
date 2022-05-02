package com.google.android.gms.internal.firebase_ml;

final class zzwd {
    private static final zzwb zzccb = zzuj();
    private static final zzwb zzccc = new zzwe();

    static zzwb zzuh() {
        return zzccb;
    }

    static zzwb zzui() {
        return zzccc;
    }

    private static zzwb zzuj() {
        try {
            return (zzwb) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
