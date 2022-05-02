package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

final class zzho extends zzhc {
    private final zzrm zzaad;
    private final zzhm zzzz;

    zzho(zzhm zzhm, zzrm zzrm) {
        this.zzzz = zzhm;
        this.zzaad = zzrm;
        zzrm.setLenient(true);
    }

    public final void flush() throws IOException {
        this.zzaad.flush();
    }

    public final void writeBoolean(boolean z) throws IOException {
        this.zzaad.zzba(z);
    }

    public final void zzgi() throws IOException {
        this.zzaad.zzpz();
    }

    public final void zzgk() throws IOException {
        this.zzaad.zzqb();
    }

    public final void zzaj(String str) throws IOException {
        this.zzaad.zzcc(str);
    }

    public final void zzgl() throws IOException {
        this.zzaad.zzqd();
    }

    public final void zzaf(int i) throws IOException {
        this.zzaad.zzu((long) i);
    }

    public final void zze(long j) throws IOException {
        this.zzaad.zzu(j);
    }

    public final void zza(BigInteger bigInteger) throws IOException {
        this.zzaad.zza(bigInteger);
    }

    public final void zza(double d) throws IOException {
        this.zzaad.zzb(d);
    }

    public final void zzj(float f) throws IOException {
        this.zzaad.zzb((double) f);
    }

    public final void zza(BigDecimal bigDecimal) throws IOException {
        this.zzaad.zza(bigDecimal);
    }

    public final void zzgh() throws IOException {
        this.zzaad.zzpy();
    }

    public final void zzgj() throws IOException {
        this.zzaad.zzqa();
    }

    public final void writeString(String str) throws IOException {
        this.zzaad.zzcd(str);
    }

    public final void zzgm() throws IOException {
        this.zzaad.setIndent("  ");
    }
}
