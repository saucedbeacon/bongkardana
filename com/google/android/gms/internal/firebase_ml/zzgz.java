package com.google.android.gms.internal.firebase_ml;

import com.google.firebase.perf.FirebasePerformance;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class zzgz extends zzgn {
    private static final String[] zzyf;
    private final HostnameVerifier hostnameVerifier;
    private final zzgs zzzd;
    private final SSLSocketFactory zzze;

    public zzgz() {
        this((zzgs) null, (SSLSocketFactory) null, (HostnameVerifier) null);
    }

    private zzgz(zzgs zzgs, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier2) {
        zzgv zzgv;
        if (System.getProperty("com.google.api.client.should_use_proxy") != null) {
            zzgv = new zzgv(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("https.proxyHost"), Integer.parseInt(System.getProperty("https.proxyPort")))));
        } else {
            zzgv = new zzgv();
        }
        this.zzzd = zzgv;
        this.zzze = null;
        this.hostnameVerifier = null;
    }

    public final boolean zzag(String str) {
        return Arrays.binarySearch(zzyf, str) >= 0;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ zzgm zzc(String str, String str2) throws IOException {
        Object[] objArr = {str};
        if (zzag(str)) {
            HttpURLConnection zza = this.zzzd.zza(new URL(str2));
            zza.setRequestMethod(str);
            boolean z = zza instanceof HttpsURLConnection;
            return new zzgu(zza);
        }
        throw new IllegalArgumentException(zzlx.zzb("HTTP method %s not supported", objArr));
    }

    static {
        String[] strArr = {FirebasePerformance.HttpMethod.DELETE, "GET", FirebasePerformance.HttpMethod.HEAD, FirebasePerformance.HttpMethod.OPTIONS, "POST", FirebasePerformance.HttpMethod.PUT, FirebasePerformance.HttpMethod.TRACE};
        zzyf = strArr;
        Arrays.sort(strArr);
    }
}
