package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.nio.charset.Charset;

public abstract class zzfs implements zzfz {
    private zzgf zzwk;
    private long zzwl;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    protected zzfs(String str) {
        this(str == null ? null : new zzgf(str));
    }

    public final boolean zzff() {
        return true;
    }

    private zzfs(zzgf zzgf) {
        this.zzwl = -1;
        this.zzwk = zzgf;
    }

    public final long getLength() throws IOException {
        if (this.zzwl == -1) {
            this.zzwl = zzik.zzb(this);
        }
        return this.zzwl;
    }

    /* access modifiers changed from: protected */
    public final Charset zzfe() {
        zzgf zzgf = this.zzwk;
        return (zzgf == null || zzgf.zzfs() == null) ? zzhy.UTF_8 : this.zzwk.zzfs();
    }

    public final String getType() {
        zzgf zzgf = this.zzwk;
        if (zzgf == null) {
            return null;
        }
        return zzgf.zzfg();
    }
}
