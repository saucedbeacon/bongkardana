package com.google.android.gms.internal.firebase_ml;

import com.google.firebase.perf.FirebasePerformance;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;

final class zzgu extends zzgm {
    private final HttpURLConnection zzyv;

    zzgu(HttpURLConnection httpURLConnection) {
        this.zzyv = httpURLConnection;
        httpURLConnection.setInstanceFollowRedirects(false);
    }

    public final void addHeader(String str, String str2) {
        this.zzyv.addRequestProperty(str, str2);
    }

    public final void zza(int i, int i2) {
        this.zzyv.setReadTimeout(i2);
        this.zzyv.setConnectTimeout(i);
    }

    public final zzgp zzfx() throws IOException {
        HttpURLConnection httpURLConnection = this.zzyv;
        if (zzfw() != null) {
            String contentType = getContentType();
            if (contentType != null) {
                addHeader("Content-Type", contentType);
            }
            String contentEncoding = getContentEncoding();
            if (contentEncoding != null) {
                addHeader("Content-Encoding", contentEncoding);
            }
            long contentLength = getContentLength();
            if (contentLength >= 0) {
                httpURLConnection.setRequestProperty("Content-Length", Long.toString(contentLength));
            }
            String requestMethod = httpURLConnection.getRequestMethod();
            if ("POST".equals(requestMethod) || FirebasePerformance.HttpMethod.PUT.equals(requestMethod)) {
                httpURLConnection.setDoOutput(true);
                if (contentLength < 0 || contentLength > 2147483647L) {
                    httpURLConnection.setChunkedStreamingMode(0);
                } else {
                    httpURLConnection.setFixedLengthStreamingMode((int) contentLength);
                }
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    zzfw().writeTo(outputStream);
                    try {
                    } catch (IOException e) {
                        throw e;
                    }
                } finally {
                    try {
                        outputStream.close();
                    } catch (IOException unused) {
                    }
                }
            } else {
                Object[] objArr = {requestMethod};
                if (!(contentLength == 0)) {
                    throw new IllegalArgumentException(zzlx.zzb("%s with non-zero content length is not supported", objArr));
                }
            }
        }
        try {
            httpURLConnection.connect();
            return new zzgx(httpURLConnection);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
