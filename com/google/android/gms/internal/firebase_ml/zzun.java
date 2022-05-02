package com.google.android.gms.internal.firebase_ml;

final class zzun {
    private static final zzum<?> zzbwq = new zzuo();
    private static final zzum<?> zzbwr = zzsp();

    private static zzum<?> zzsp() {
        try {
            return (zzum) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static zzum<?> zzsq() {
        return zzbwq;
    }

    static zzum<?> zzsr() {
        zzum<?> zzum = zzbwr;
        if (zzum != null) {
            return zzum;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
