package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

public final class zzgv implements zzgs {
    private final Proxy zzyw;

    public zzgv() {
        this((Proxy) null);
    }

    public zzgv(Proxy proxy) {
        this.zzyw = proxy;
    }

    public final HttpURLConnection zza(URL url) throws IOException {
        Proxy proxy = this.zzyw;
        return (HttpURLConnection) (proxy == null ? url.openConnection() : url.openConnection(proxy));
    }
}
