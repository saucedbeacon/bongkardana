package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

public abstract class zzgm {
    private String zzxx;
    private String zzxy;
    private long zzyc = -1;
    private zziw zzyd;

    public abstract void addHeader(String str, String str2) throws IOException;

    public void zza(int i, int i2) throws IOException {
    }

    public abstract zzgp zzfx() throws IOException;

    public final void setContentLength(long j) throws IOException {
        this.zzyc = j;
    }

    public final long getContentLength() {
        return this.zzyc;
    }

    public final void setContentEncoding(String str) throws IOException {
        this.zzxx = str;
    }

    public final String getContentEncoding() {
        return this.zzxx;
    }

    public final void setContentType(String str) throws IOException {
        this.zzxy = str;
    }

    public final String getContentType() {
        return this.zzxy;
    }

    public final void zza(zziw zziw) throws IOException {
        this.zzyd = zziw;
    }

    public final zziw zzfw() {
        return this.zzyd;
    }
}
