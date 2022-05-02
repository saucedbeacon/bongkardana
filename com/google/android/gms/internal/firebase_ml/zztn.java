package com.google.android.gms.internal.firebase_ml;

final class zztn {
    private static final Class<?> zzbvl = zzcf("libcore.io.Memory");
    private static final boolean zzbvm = (zzcf("org.robolectric.Robolectric") != null);

    static boolean zzrx() {
        return zzbvl != null && !zzbvm;
    }

    static Class<?> zzry() {
        return zzbvl;
    }

    private static <T> Class<T> zzcf(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
