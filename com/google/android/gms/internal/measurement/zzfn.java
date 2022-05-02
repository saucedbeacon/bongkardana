package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

public final class zzfn extends zzjz<zzfo, zzfn> implements zzlj {
    private zzfn() {
        super(zzfo.zzj);
    }

    public final List<zzfs> zza() {
        return Collections.unmodifiableList(((zzfo) this.zza).zza());
    }

    public final int zzb() {
        return ((zzfo) this.zza).zzb();
    }

    public final zzfs zzc(int i) {
        return ((zzfo) this.zza).zzc(i);
    }

    public final zzfn zzd(int i, zzfs zzfs) {
        if (this.zzb) {
            zzax();
            this.zzb = false;
        }
        zzfo.zzn((zzfo) this.zza, i, zzfs);
        return this;
    }

    public final zzfn zze(int i, zzfr zzfr) {
        if (this.zzb) {
            zzax();
            this.zzb = false;
        }
        zzfo.zzn((zzfo) this.zza, i, (zzfs) zzfr.zzaA());
        return this;
    }

    public final zzfn zzf(zzfs zzfs) {
        if (this.zzb) {
            zzax();
            this.zzb = false;
        }
        zzfo.zzo((zzfo) this.zza, zzfs);
        return this;
    }

    public final zzfn zzg(zzfr zzfr) {
        if (this.zzb) {
            zzax();
            this.zzb = false;
        }
        zzfo.zzo((zzfo) this.zza, (zzfs) zzfr.zzaA());
        return this;
    }

    public final zzfn zzh(Iterable<? extends zzfs> iterable) {
        if (this.zzb) {
            zzax();
            this.zzb = false;
        }
        zzfo.zzp((zzfo) this.zza, iterable);
        return this;
    }

    public final zzfn zzi() {
        if (this.zzb) {
            zzax();
            this.zzb = false;
        }
        ((zzfo) this.zza).zze = zzfo.zzbE();
        return this;
    }

    public final zzfn zzj(int i) {
        if (this.zzb) {
            zzax();
            this.zzb = false;
        }
        zzfo.zzr((zzfo) this.zza, i);
        return this;
    }

    public final String zzk() {
        return ((zzfo) this.zza).zzd();
    }

    public final zzfn zzl(String str) {
        if (this.zzb) {
            zzax();
            this.zzb = false;
        }
        zzfo.zzs((zzfo) this.zza, str);
        return this;
    }

    public final boolean zzm() {
        return ((zzfo) this.zza).zze();
    }

    public final long zzn() {
        return ((zzfo) this.zza).zzf();
    }

    public final zzfn zzo(long j) {
        if (this.zzb) {
            zzax();
            this.zzb = false;
        }
        zzfo.zzt((zzfo) this.zza, j);
        return this;
    }

    public final long zzp() {
        return ((zzfo) this.zza).zzh();
    }

    public final zzfn zzq(long j) {
        if (this.zzb) {
            zzax();
            this.zzb = false;
        }
        zzfo.zzu((zzfo) this.zza, j);
        return this;
    }

    /* synthetic */ zzfn(zzff zzff) {
        super(zzfo.zzj);
    }
}
