package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

public final class zzgl {
    String content;
    String message;
    int statusCode;
    zzgd zzwy;
    String zzxv;

    public zzgl(int i, String str, zzgd zzgd) {
        zzlp.checkArgument(i >= 0);
        this.statusCode = i;
        this.zzxv = str;
        this.zzwy = (zzgd) zzlp.checkNotNull(zzgd);
    }

    public zzgl(zzgj zzgj) {
        this(zzgj.getStatusCode(), zzgj.getStatusMessage(), zzgj.zzfm());
        try {
            String zzfu = zzgj.zzfu();
            this.content = zzfu;
            if (zzfu.length() == 0) {
                this.content = null;
            }
        } catch (IOException e) {
            zzmj.zzb(e);
        }
        StringBuilder zzc = zzgi.zzc(zzgj);
        if (this.content != null) {
            zzc.append(zziv.zzadd);
            zzc.append(this.content);
        }
        this.message = zzc.toString();
    }

    public final zzgl zzae(String str) {
        this.message = str;
        return this;
    }

    public final zzgl zzaf(String str) {
        this.content = str;
        return this;
    }
}
