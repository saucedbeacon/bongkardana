package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zaz;
import java.util.Set;

public final class zaaa implements zaaw {
    /* access modifiers changed from: private */
    public final zaaz zaa;
    private boolean zab = false;

    public zaaa(zaaz zaaz) {
        this.zaa = zaaz;
    }

    public final void zaa() {
    }

    public final void zaa(@Nullable Bundle bundle) {
    }

    public final void zaa(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zaa(T t) {
        return zab(t);
    }

    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zab(T t) {
        try {
            this.zaa.zad.zae.zaa(t);
            zaar zaar = this.zaa.zad;
            Api.Client client = zaar.zab.get(t.getClientKey());
            Preconditions.checkNotNull(client, "Appropriate Api was not requested.");
            if (client.isConnected() || !this.zaa.zab.containsKey(t.getClientKey())) {
                boolean z = client instanceof zaz;
                Api.AnyClient anyClient = client;
                if (z) {
                    zaz zaz = (zaz) client;
                    anyClient = zaz.zaa();
                }
                t.run(anyClient);
                return t;
            }
            t.setFailedResult(new Status(17));
            return t;
        } catch (DeadObjectException unused) {
            this.zaa.zaa((zaay) new zaad(this, this));
        }
    }

    public final boolean zab() {
        if (this.zab) {
            return false;
        }
        Set<zaci> set = this.zaa.zad.zad;
        if (set == null || set.isEmpty()) {
            this.zaa.zaa((ConnectionResult) null);
            return true;
        }
        this.zab = true;
        for (zaci zaa2 : set) {
            zaa2.zaa();
        }
        return false;
    }

    public final void zac() {
        if (this.zab) {
            this.zab = false;
            this.zaa.zaa((zaay) new zaac(this, this));
        }
    }

    public final void zaa(int i) {
        this.zaa.zaa((ConnectionResult) null);
        this.zaa.zae.zaa(i, this.zab);
    }

    /* access modifiers changed from: package-private */
    public final void zad() {
        if (this.zab) {
            this.zab = false;
            this.zaa.zad.zae.zaa();
            zab();
        }
    }
}
