package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class zzfj {
    private static final Logger logger = Logger.getLogger(zzfj.class.getName());
    private final zzfp zzvk;
    private final zzis zzvm;
    private final String zzvn;
    private final String zzvo;
    private final String zzvp;
    private final String zzvq;
    private final zzgh zzvr;
    private final boolean zzvs;
    private final boolean zzvt;

    protected zzfj(zza zza2) {
        zzgh zzgh;
        this.zzvk = zza2.zzvk;
        this.zzvn = zzj(zza2.zzvn);
        this.zzvo = zzk(zza2.zzvo);
        this.zzvp = zza2.zzvp;
        if (zzlx.zzaz(zza2.zzvq)) {
            logger.logp(Level.WARNING, "com.google.api.client.googleapis.services.AbstractGoogleClient", "<init>", "Application name is not set. Call Builder#setApplicationName.");
        }
        this.zzvq = zza2.zzvq;
        if (zza2.zzvl == null) {
            zzgh = zza2.zzvj.zza((zzgg) null);
        } else {
            zzgh = zza2.zzvj.zza(zza2.zzvl);
        }
        this.zzvr = zzgh;
        this.zzvm = zza2.zzvm;
        this.zzvs = false;
        this.zzvt = false;
    }

    public static abstract class zza {
        final zzgn zzvj;
        zzfp zzvk;
        zzgg zzvl;
        final zzis zzvm;
        String zzvn;
        String zzvo;
        String zzvp;
        String zzvq;

        protected zza(zzgn zzgn, String str, String str2, zzis zzis, zzgg zzgg) {
            this.zzvj = (zzgn) zzlp.checkNotNull(zzgn);
            this.zzvm = zzis;
            zzf(str);
            zzg(str2);
            this.zzvl = zzgg;
        }

        public zza zzf(String str) {
            this.zzvn = zzfj.zzj(str);
            return this;
        }

        public zza zzg(String str) {
            this.zzvo = zzfj.zzk(str);
            return this;
        }

        public zza zzh(String str) {
            this.zzvp = str;
            return this;
        }

        public zza zza(zzfp zzfp) {
            this.zzvk = zzfp;
            return this;
        }

        public zza zzi(String str) {
            this.zzvq = str;
            return this;
        }
    }

    public final String zzet() {
        String valueOf = String.valueOf(this.zzvn);
        String valueOf2 = String.valueOf(this.zzvo);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    public final String zzeu() {
        return this.zzvq;
    }

    public final zzgh zzev() {
        return this.zzvr;
    }

    public zzis zzew() {
        return this.zzvm;
    }

    /* access modifiers changed from: protected */
    public void zza(zzfl<?> zzfl) throws IOException {
        zzfp zzfp = this.zzvk;
        if (zzfp != null) {
            zzfp.zza(zzfl);
        }
    }

    static String zzj(String str) {
        zzlp.checkNotNull(str, "root URL cannot be null.");
        return !str.endsWith("/") ? String.valueOf(str).concat("/") : str;
    }

    static String zzk(String str) {
        zzlp.checkNotNull(str, "service path cannot be null");
        if (str.length() == 1) {
            zzlp.checkArgument("/".equals(str), "service path must equal \"/\" if it is of length 1.");
            return "";
        } else if (str.length() <= 0) {
            return str;
        } else {
            if (!str.endsWith("/")) {
                str = String.valueOf(str).concat("/");
            }
            return str.startsWith("/") ? str.substring(1) : str;
        }
    }
}
