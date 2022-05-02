package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

public final class zzfh implements zzga, zzgg {
    private final boolean zzvh;

    public zzfh() {
        this(false);
    }

    private zzfh(boolean z) {
        this.zzvh = false;
    }

    public final void zza(zzge zzge) {
        zzge.zza((zzga) this);
    }

    public final void zzb(zzge zzge) throws IOException {
        String requestMethod = zzge.getRequestMethod();
        boolean z = true;
        if (requestMethod.equals("POST") || ((!requestMethod.equals("GET") || zzge.zzfi().zzfg().length() <= 2048) && zzge.zzfh().zzag(requestMethod))) {
            z = false;
        }
        if (z) {
            String requestMethod2 = zzge.getRequestMethod();
            zzge.zzac("POST");
            zzge.zzfm().zzb("X-HTTP-Method-Override", requestMethod2);
            if (requestMethod2.equals("GET")) {
                zzge.zza((zzfz) new zzgq((zzfw) zzge.zzfi().clone()));
                zzge.zzfi().clear();
            } else if (zzge.zzfj() == null) {
                zzge.zza((zzfz) new zzfv());
            }
        }
    }
}
