package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

public class zzgi extends IOException {
    private final String content;
    private final int statusCode;
    private final transient zzgd zzwy;
    private final String zzxv;

    public zzgi(zzgj zzgj) {
        this(new zzgl(zzgj));
    }

    protected zzgi(zzgl zzgl) {
        super(zzgl.message);
        this.statusCode = zzgl.statusCode;
        this.zzxv = zzgl.zzxv;
        this.zzwy = zzgl.zzwy;
        this.content = zzgl.content;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public static StringBuilder zzc(zzgj zzgj) {
        StringBuilder sb = new StringBuilder();
        int statusCode2 = zzgj.getStatusCode();
        if (statusCode2 != 0) {
            sb.append(statusCode2);
        }
        String statusMessage = zzgj.getStatusMessage();
        if (statusMessage != null) {
            if (statusCode2 != 0) {
                sb.append(' ');
            }
            sb.append(statusMessage);
        }
        return sb;
    }
}
