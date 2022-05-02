package com.google.android.gms.internal.firebase_ml;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

final class zzie implements Iterator<Map.Entry<String, Object>> {
    private int zzacb = -1;
    private zzij zzacc;
    private Object zzacd;
    private boolean zzace;
    private boolean zzacf;
    private zzij zzacg;
    private final /* synthetic */ zzic zzach;

    zzie(zzic zzic) {
        this.zzach = zzic;
    }

    public final boolean hasNext() {
        if (!this.zzacf) {
            this.zzacf = true;
            this.zzacd = null;
            while (this.zzacd == null) {
                int i = this.zzacb + 1;
                this.zzacb = i;
                if (i >= this.zzach.zzwv.zzabn.size()) {
                    break;
                }
                zzij zzal = this.zzach.zzwv.zzal(this.zzach.zzwv.zzabn.get(this.zzacb));
                this.zzacc = zzal;
                this.zzacd = zzal.zzh(this.zzach.object);
            }
        }
        if (this.zzacd != null) {
            return true;
        }
        return false;
    }

    public final void remove() {
        zzlp.checkState(this.zzacg != null && !this.zzace);
        this.zzace = true;
        this.zzacg.zzb(this.zzach.object, (Object) null);
    }

    public final /* synthetic */ Object next() {
        if (hasNext()) {
            zzij zzij = this.zzacc;
            this.zzacg = zzij;
            Object obj = this.zzacd;
            this.zzacf = false;
            this.zzace = false;
            this.zzacc = null;
            this.zzacd = null;
            return new zzif(this.zzach, zzij, obj);
        }
        throw new NoSuchElementException();
    }
}
