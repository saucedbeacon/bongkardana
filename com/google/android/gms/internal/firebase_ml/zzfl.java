package com.google.android.gms.internal.firebase_ml;

import com.google.firebase.perf.FirebasePerformance;
import java.io.IOException;

public class zzfl<T> extends zzii {
    private final zzfj zzvx;
    private final String zzvy;
    private final String zzvz;
    private final zzfz zzwa;
    private zzgd zzwb = new zzgd();
    private zzgd zzwc;
    private int zzwd = -1;
    private String zzwe;
    private Class<T> zzwf;

    protected zzfl(zzfj zzfj, String str, String str2, zzfz zzfz, Class<T> cls) {
        this.zzwf = (Class) zzlp.checkNotNull(cls);
        this.zzvx = (zzfj) zzlp.checkNotNull(zzfj);
        this.zzvy = (String) zzlp.checkNotNull(str);
        this.zzvz = (String) zzlp.checkNotNull(str2);
        this.zzwa = zzfz;
        String zzeu = zzfj.zzeu();
        if (zzeu != null) {
            zzgd zzgd = this.zzwb;
            StringBuilder sb = new StringBuilder(String.valueOf(zzeu).length() + 23);
            sb.append(zzeu);
            sb.append(" Google-API-Java-Client");
            zzgd.zzab(sb.toString());
        } else {
            this.zzwb.zzab("Google-API-Java-Client");
        }
        this.zzwb.zzb("X-Goog-Api-Client", zzfn.zzfa().zzl(zzfj.getClass().getSimpleName()));
    }

    public zzfj zzex() {
        return this.zzvx;
    }

    public final zzgd zzey() {
        return this.zzwb;
    }

    /* access modifiers changed from: protected */
    public IOException zzb(zzgj zzgj) {
        return new zzgi(zzgj);
    }

    public final T zzez() throws IOException {
        zzlp.checkArgument(true);
        zzlp.checkArgument(true);
        zzge zza = zzex().zzev().zza(this.zzvy, new zzfw(zzgo.zza(this.zzvx.zzet(), this.zzvz, (Object) this, true)), this.zzwa);
        new zzfh().zzb(zza);
        zza.zza(zzex().zzew());
        if (this.zzwa == null && (this.zzvy.equals("POST") || this.zzvy.equals(FirebasePerformance.HttpMethod.PUT) || this.zzvy.equals(FirebasePerformance.HttpMethod.PATCH))) {
            zza.zza((zzfz) new zzfv());
        }
        zza.zzfm().putAll(this.zzwb);
        zza.zza((zzfy) new zzfu());
        zza.zza((zzgk) new zzfk(this, zza.zzfo(), zza));
        zzgj zzfr = zza.zzfr();
        this.zzwc = zzfr.zzfm();
        this.zzwd = zzfr.getStatusCode();
        this.zzwe = zzfr.getStatusMessage();
        return zzfr.zza(this.zzwf);
    }

    /* renamed from: zzc */
    public zzfl<T> zzb(String str, Object obj) {
        return (zzfl) super.zzb(str, obj);
    }
}
