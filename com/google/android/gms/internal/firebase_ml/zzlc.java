package com.google.android.gms.internal.firebase_ml;

final class zzlc extends zzkz {
    private final char zzaea;

    zzlc(char c) {
        this.zzaea = c;
    }

    public final boolean zzb(char c) {
        return c == this.zzaea;
    }

    public final String toString() {
        String zzd = zzla.zzc(this.zzaea);
        StringBuilder sb = new StringBuilder(String.valueOf(zzd).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(zzd);
        sb.append("')");
        return sb.toString();
    }
}
