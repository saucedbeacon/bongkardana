package com.google.android.gms.internal.firebase_ml;

public final class zzfe {
    public static final String VERSION;
    public static final Integer zzve = 1;
    public static final Integer zzvf = 26;
    private static final Integer zzvg = 0;

    static {
        String valueOf = String.valueOf(zzve);
        String valueOf2 = String.valueOf(zzvf);
        String valueOf3 = String.valueOf(zzvg);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append(valueOf);
        sb.append(".");
        sb.append(valueOf2);
        sb.append(".");
        sb.append(valueOf3);
        sb.append("-SNAPSHOT");
        VERSION = sb.toString().toString();
    }
}
