package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzc {
    final zzf zza;
    zzg zzb;
    final zzab zzc = new zzab();
    private final zzz zzd = new zzz();

    public zzc() {
        zzf zzf = new zzf();
        this.zza = zzf;
        this.zzb = zzf.zzb.zzc();
        zzf zzf2 = this.zza;
        zzf2.zzd.zza("internal.registerCallback", new zza(this));
        zzf zzf3 = this.zza;
        zzf3.zzd.zza("internal.eventLogger", new zzb(this));
    }

    public final void zza(String str, Callable<? extends zzai> callable) {
        this.zza.zzd.zza(str, callable);
    }

    public final boolean zzb(zzaa zzaa) throws zzd {
        try {
            this.zzc.zzb(zzaa);
            this.zza.zzc.zze("runtime.counter", new zzah(Double.valueOf(0.0d)));
            this.zzd.zzb(this.zzb.zzc(), this.zzc);
            return zzc() || zzd();
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final boolean zzc() {
        return !this.zzc.zzc().equals(this.zzc.zza());
    }

    public final boolean zzd() {
        return !this.zzc.zzf().isEmpty();
    }

    public final zzab zze() {
        return this.zzc;
    }

    public final void zzf(zzgo zzgo) throws zzd {
        zzai zzai;
        try {
            this.zzb = this.zza.zzb.zzc();
            if (!(this.zza.zza(this.zzb, (zzgt[]) zzgo.zza().toArray(new zzgt[0])) instanceof zzag)) {
                for (zzgm next : zzgo.zzb().zza()) {
                    List<zzgt> zzb2 = next.zzb();
                    String zza2 = next.zza();
                    Iterator<zzgt> it = zzb2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            zzap zza3 = this.zza.zza(this.zzb, it.next());
                            if (zza3 instanceof zzam) {
                                zzg zzg = this.zzb;
                                if (!zzg.zzd(zza2)) {
                                    zzai = null;
                                } else {
                                    zzap zzh = zzg.zzh(zza2);
                                    if (!(zzh instanceof zzai)) {
                                        String valueOf = String.valueOf(zza2);
                                        throw new IllegalStateException(valueOf.length() != 0 ? "Invalid function name: ".concat(valueOf) : new String("Invalid function name: "));
                                    }
                                    zzai = (zzai) zzh;
                                }
                                if (zzai == null) {
                                    String valueOf2 = String.valueOf(zza2);
                                    throw new IllegalStateException(valueOf2.length() != 0 ? "Rule function is undefined: ".concat(valueOf2) : new String("Rule function is undefined: "));
                                }
                                zzai.zza(this.zzb, Collections.singletonList(zza3));
                            } else {
                                throw new IllegalArgumentException("Invalid rule definition");
                            }
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzai zzg() throws Exception {
        return new zzu(this.zzd);
    }
}
