package com.google.android.gms.internal.firebase_ml;

final class zzws {
    private static final zzwq zzccw = zzuq();
    private static final zzwq zzccx = new zzwp();

    static zzwq zzuo() {
        return zzccw;
    }

    static zzwq zzup() {
        return zzccx;
    }

    private static zzwq zzuq() {
        try {
            return (zzwq) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
