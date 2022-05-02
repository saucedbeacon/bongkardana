package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

final class zzg {
    private long zzA;
    private long zzB;
    @Nullable
    private String zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private final zzfu zza;
    private final String zzb;
    @Nullable
    private String zzc;
    @Nullable
    private String zzd;
    @Nullable
    private String zze;
    @Nullable
    private String zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    @Nullable
    private String zzj;
    private long zzk;
    @Nullable
    private String zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;
    private long zzp;
    private boolean zzq;
    @Nullable
    private String zzr;
    @Nullable
    private Boolean zzs;
    private long zzt;
    @Nullable
    private List<String> zzu;
    @Nullable
    private String zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    @WorkerThread
    zzg(zzfu zzfu, String str) {
        Preconditions.checkNotNull(zzfu);
        Preconditions.checkNotEmpty(str);
        this.zza = zzfu;
        this.zzb = str;
        zzfu.zzav().zzg();
    }

    @WorkerThread
    public final void zzA(long j) {
        this.zza.zzav().zzg();
        this.zzD |= this.zzm != j;
        this.zzm = j;
    }

    @WorkerThread
    public final long zzB() {
        this.zza.zzav().zzg();
        return this.zzn;
    }

    @WorkerThread
    public final void zzC(long j) {
        this.zza.zzav().zzg();
        this.zzD |= this.zzn != j;
        this.zzn = j;
    }

    @WorkerThread
    public final long zzD() {
        this.zza.zzav().zzg();
        return this.zzt;
    }

    @WorkerThread
    public final void zzE(long j) {
        this.zza.zzav().zzg();
        this.zzD |= this.zzt != j;
        this.zzt = j;
    }

    @WorkerThread
    public final boolean zzF() {
        this.zza.zzav().zzg();
        return this.zzo;
    }

    @WorkerThread
    public final void zzG(boolean z) {
        this.zza.zzav().zzg();
        this.zzD |= this.zzo != z;
        this.zzo = z;
    }

    @WorkerThread
    public final void zzH(long j) {
        boolean z = true;
        Preconditions.checkArgument(j >= 0);
        this.zza.zzav().zzg();
        boolean z2 = this.zzD;
        if (this.zzg == j) {
            z = false;
        }
        this.zzD = z | z2;
        this.zzg = j;
    }

    @WorkerThread
    public final long zzI() {
        this.zza.zzav().zzg();
        return this.zzg;
    }

    @WorkerThread
    public final long zzJ() {
        this.zza.zzav().zzg();
        return this.zzE;
    }

    @WorkerThread
    public final void zzK(long j) {
        this.zza.zzav().zzg();
        this.zzD |= this.zzE != j;
        this.zzE = j;
    }

    @WorkerThread
    public final long zzL() {
        this.zza.zzav().zzg();
        return this.zzF;
    }

    @WorkerThread
    public final void zzM(long j) {
        this.zza.zzav().zzg();
        this.zzD |= this.zzF != j;
        this.zzF = j;
    }

    @WorkerThread
    public final void zzN() {
        this.zza.zzav().zzg();
        long j = this.zzg + 1;
        if (j > 2147483647L) {
            this.zza.zzau().zze().zzb("Bundle index overflow. appId", zzem.zzl(this.zzb));
            j = 0;
        }
        this.zzD = true;
        this.zzg = j;
    }

    @WorkerThread
    public final long zzO() {
        this.zza.zzav().zzg();
        return this.zzw;
    }

    @WorkerThread
    public final void zzP(long j) {
        this.zza.zzav().zzg();
        this.zzD |= this.zzw != j;
        this.zzw = j;
    }

    @WorkerThread
    public final long zzQ() {
        this.zza.zzav().zzg();
        return this.zzx;
    }

    @WorkerThread
    public final void zzR(long j) {
        this.zza.zzav().zzg();
        this.zzD |= this.zzx != j;
        this.zzx = j;
    }

    @WorkerThread
    public final long zzS() {
        this.zza.zzav().zzg();
        return this.zzy;
    }

    @WorkerThread
    public final void zzT(long j) {
        this.zza.zzav().zzg();
        this.zzD |= this.zzy != j;
        this.zzy = j;
    }

    @WorkerThread
    public final long zzU() {
        this.zza.zzav().zzg();
        return this.zzz;
    }

    @WorkerThread
    public final void zzV(long j) {
        this.zza.zzav().zzg();
        this.zzD |= this.zzz != j;
        this.zzz = j;
    }

    @WorkerThread
    public final long zzW() {
        this.zza.zzav().zzg();
        return this.zzB;
    }

    @WorkerThread
    public final void zzX(long j) {
        this.zza.zzav().zzg();
        this.zzD |= this.zzB != j;
        this.zzB = j;
    }

    @WorkerThread
    public final long zzY() {
        this.zza.zzav().zzg();
        return this.zzA;
    }

    @WorkerThread
    public final void zzZ(long j) {
        this.zza.zzav().zzg();
        this.zzD |= this.zzA != j;
        this.zzA = j;
    }

    @WorkerThread
    public final boolean zza() {
        this.zza.zzav().zzg();
        return this.zzD;
    }

    @WorkerThread
    @Nullable
    public final String zzaa() {
        this.zza.zzav().zzg();
        return this.zzC;
    }

    @WorkerThread
    @Nullable
    public final String zzab() {
        this.zza.zzav().zzg();
        String str = this.zzC;
        zzac((String) null);
        return str;
    }

    @WorkerThread
    public final void zzac(@Nullable String str) {
        this.zza.zzav().zzg();
        this.zzD |= !zzku.zzS(this.zzC, str);
        this.zzC = str;
    }

    @WorkerThread
    public final long zzad() {
        this.zza.zzav().zzg();
        return this.zzp;
    }

    @WorkerThread
    public final void zzae(long j) {
        this.zza.zzav().zzg();
        this.zzD |= this.zzp != j;
        this.zzp = j;
    }

    @WorkerThread
    public final boolean zzaf() {
        this.zza.zzav().zzg();
        return this.zzq;
    }

    @WorkerThread
    public final void zzag(boolean z) {
        this.zza.zzav().zzg();
        this.zzD |= this.zzq != z;
        this.zzq = z;
    }

    @WorkerThread
    @Nullable
    public final Boolean zzah() {
        this.zza.zzav().zzg();
        return this.zzs;
    }

    @WorkerThread
    public final void zzai(@Nullable Boolean bool) {
        this.zza.zzav().zzg();
        boolean z = this.zzD;
        Boolean bool2 = this.zzs;
        int i = zzku.zza;
        this.zzD = z | (!((bool2 == null && bool == null) ? true : bool2 == null ? false : bool2.equals(bool)));
        this.zzs = bool;
    }

    @WorkerThread
    @Nullable
    public final List<String> zzaj() {
        this.zza.zzav().zzg();
        return this.zzu;
    }

    @WorkerThread
    public final void zzak(@Nullable List<String> list) {
        this.zza.zzav().zzg();
        List<String> list2 = this.zzu;
        int i = zzku.zza;
        if (list2 != null || list != null) {
            if (list2 == null || !list2.equals(list)) {
                this.zzD = true;
                this.zzu = list != null ? new ArrayList(list) : null;
            }
        }
    }

    @WorkerThread
    public final void zzb() {
        this.zza.zzav().zzg();
        this.zzD = false;
    }

    @WorkerThread
    public final String zzc() {
        this.zza.zzav().zzg();
        return this.zzb;
    }

    @WorkerThread
    @Nullable
    public final String zzd() {
        this.zza.zzav().zzg();
        return this.zzc;
    }

    @WorkerThread
    public final void zze(@Nullable String str) {
        this.zza.zzav().zzg();
        this.zzD |= !zzku.zzS(this.zzc, str);
        this.zzc = str;
    }

    @WorkerThread
    @Nullable
    public final String zzf() {
        this.zza.zzav().zzg();
        return this.zzd;
    }

    @WorkerThread
    public final void zzg(@Nullable String str) {
        this.zza.zzav().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzD |= true ^ zzku.zzS(this.zzd, str);
        this.zzd = str;
    }

    @WorkerThread
    @Nullable
    public final String zzh() {
        this.zza.zzav().zzg();
        return this.zzr;
    }

    @WorkerThread
    public final void zzi(@Nullable String str) {
        this.zza.zzav().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzD |= true ^ zzku.zzS(this.zzr, str);
        this.zzr = str;
    }

    @WorkerThread
    @Nullable
    public final String zzj() {
        this.zza.zzav().zzg();
        return this.zzv;
    }

    @WorkerThread
    public final void zzk(@Nullable String str) {
        this.zza.zzav().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzD |= true ^ zzku.zzS(this.zzv, str);
        this.zzv = str;
    }

    @WorkerThread
    @Nullable
    public final String zzl() {
        this.zza.zzav().zzg();
        return this.zze;
    }

    @WorkerThread
    public final void zzm(@Nullable String str) {
        this.zza.zzav().zzg();
        this.zzD |= !zzku.zzS(this.zze, str);
        this.zze = str;
    }

    @WorkerThread
    @Nullable
    public final String zzn() {
        this.zza.zzav().zzg();
        return this.zzf;
    }

    @WorkerThread
    public final void zzo(@Nullable String str) {
        this.zza.zzav().zzg();
        this.zzD |= !zzku.zzS(this.zzf, str);
        this.zzf = str;
    }

    @WorkerThread
    public final long zzp() {
        this.zza.zzav().zzg();
        return this.zzh;
    }

    @WorkerThread
    public final void zzq(long j) {
        this.zza.zzav().zzg();
        this.zzD |= this.zzh != j;
        this.zzh = j;
    }

    @WorkerThread
    public final long zzr() {
        this.zza.zzav().zzg();
        return this.zzi;
    }

    @WorkerThread
    public final void zzs(long j) {
        this.zza.zzav().zzg();
        this.zzD |= this.zzi != j;
        this.zzi = j;
    }

    @WorkerThread
    @Nullable
    public final String zzt() {
        this.zza.zzav().zzg();
        return this.zzj;
    }

    @WorkerThread
    public final void zzu(@Nullable String str) {
        this.zza.zzav().zzg();
        this.zzD |= !zzku.zzS(this.zzj, str);
        this.zzj = str;
    }

    @WorkerThread
    public final long zzv() {
        this.zza.zzav().zzg();
        return this.zzk;
    }

    @WorkerThread
    public final void zzw(long j) {
        this.zza.zzav().zzg();
        this.zzD |= this.zzk != j;
        this.zzk = j;
    }

    @WorkerThread
    @Nullable
    public final String zzx() {
        this.zza.zzav().zzg();
        return this.zzl;
    }

    @WorkerThread
    public final void zzy(@Nullable String str) {
        this.zza.zzav().zzg();
        this.zzD |= !zzku.zzS(this.zzl, str);
        this.zzl = str;
    }

    @WorkerThread
    public final long zzz() {
        this.zza.zzav().zzg();
        return this.zzm;
    }
}
