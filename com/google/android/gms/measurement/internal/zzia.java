package com.google.android.gms.measurement.internal;

import android.os.Build;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class zzia extends zzgo {
    private final SSLSocketFactory zza;

    zzia(zzfu zzfu) {
        super(zzfu);
        this.zza = Build.VERSION.SDK_INT < 19 ? new zzkw(HttpsURLConnection.getDefaultSSLSocketFactory()) : null;
    }

    /* access modifiers changed from: protected */
    public final boolean zza() {
        return false;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    @VisibleForTesting
    public final HttpURLConnection zzd(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            SSLSocketFactory sSLSocketFactory = this.zza;
            if (sSLSocketFactory != null && (openConnection instanceof HttpsURLConnection)) {
                ((HttpsURLConnection) openConnection).setSSLSocketFactory(sSLSocketFactory);
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            this.zzs.zzc();
            httpURLConnection.setConnectTimeout(60000);
            this.zzs.zzc();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain HTTP connection");
    }
}
