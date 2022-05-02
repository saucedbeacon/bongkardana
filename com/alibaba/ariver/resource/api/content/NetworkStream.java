package com.alibaba.ariver.resource.api.content;

import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Map;

public class NetworkStream extends InputStream {
    public static final String TAG = "AriverRes:NetworkStream";

    /* renamed from: a  reason: collision with root package name */
    private String f10170a;
    private InputStream b;
    private HttpURLConnection c;
    @Nullable
    private Listener d;
    private int e;
    private boolean f;
    private Map<String, String> g;

    public interface Listener {
        void onInputClose(NetworkStream networkStream);

        void onInputException();

        void onInputOpen(NetworkStream networkStream);

        void onResourceError(NetworkStream networkStream, int i);
    }

    public NetworkStream(String str, @Nullable Listener listener) {
        this(str, false, listener);
    }

    public NetworkStream(String str, boolean z, @Nullable Listener listener) {
        this.f10170a = str;
        this.d = listener;
        this.f = z;
        this.b = a();
    }

    public NetworkStream(String str, boolean z, @Nullable Listener listener, Map map) {
        this.f10170a = str;
        this.d = listener;
        this.f = z;
        this.g = map;
        this.b = a();
    }

    public int getStatusCode() {
        return this.e;
    }

    public InputStream getRealStream() {
        return this.b;
    }

    public int read() {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            try {
                return inputStream.read();
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("read stream in ");
                sb.append(this.f10170a);
                sb.append(" exception!");
                RVLogger.e(TAG, sb.toString(), th);
            }
        }
        return -1;
    }

    public int available() {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            return inputStream.available();
        }
        return super.available();
    }

    public void close() {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            inputStream.close();
        } else {
            super.close();
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
        Listener listener = this.d;
        if (listener != null) {
            listener.onInputClose(this);
        }
    }

    public void mark(int i) {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            inputStream.mark(i);
        } else {
            super.mark(i);
        }
    }

    public boolean markSupported() {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return super.markSupported();
    }

    public synchronized void reset() {
        if (this.b != null) {
            this.b.reset();
        } else {
            super.reset();
        }
    }

    public long skip(long j) {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            return inputStream.skip(j);
        }
        return super.skip(j);
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            if (this.b != null) {
                return this.b.read(bArr, i, i2);
            }
            return super.read(bArr, i, i2);
        } catch (Throwable unused) {
            RVLogger.e(TAG, "read stream error!");
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045 A[SYNTHETIC, Splitter:B:13:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0095 A[Catch:{ Exception -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a1 A[Catch:{ Exception -> 0x006d }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.io.InputStream a() {
        /*
            r6 = this;
            java.lang.String r0 = "AriverRes:NetworkStream"
            r1 = 0
            java.lang.Class<com.alibaba.ariver.kernel.common.network.RVTransportService> r2 = com.alibaba.ariver.kernel.common.network.RVTransportService.class
            java.lang.Object r2 = com.alibaba.ariver.kernel.common.RVProxy.get(r2)     // Catch:{ Exception -> 0x00ab }
            com.alibaba.ariver.kernel.common.network.RVTransportService r2 = (com.alibaba.ariver.kernel.common.network.RVTransportService) r2     // Catch:{ Exception -> 0x00ab }
            if (r2 == 0) goto L_0x0041
            com.alibaba.ariver.kernel.common.network.http.RVHttpRequest$Builder r3 = com.alibaba.ariver.kernel.common.network.http.RVHttpRequest.newBuilder()     // Catch:{ Exception -> 0x00ab }
            java.lang.String r4 = r6.f10170a     // Catch:{ Exception -> 0x00ab }
            com.alibaba.ariver.kernel.common.network.http.RVHttpRequest$Builder r3 = r3.url(r4)     // Catch:{ Exception -> 0x00ab }
            boolean r4 = r6.f     // Catch:{ Exception -> 0x00ab }
            com.alibaba.ariver.kernel.common.network.http.RVHttpRequest$Builder r3 = r3.setPackageRequest(r4)     // Catch:{ Exception -> 0x00ab }
            r4 = 1
            com.alibaba.ariver.kernel.common.network.http.RVHttpRequest$Builder r3 = r3.useCache(r4)     // Catch:{ Exception -> 0x00ab }
            java.util.Map<java.lang.String, java.lang.String> r4 = r6.g     // Catch:{ Exception -> 0x00ab }
            if (r4 == 0) goto L_0x002b
            java.util.Map<java.lang.String, java.lang.String> r4 = r6.g     // Catch:{ Exception -> 0x00ab }
            r3.headers(r4)     // Catch:{ Exception -> 0x00ab }
        L_0x002b:
            com.alibaba.ariver.kernel.common.network.http.RVHttpRequest r3 = r3.build()     // Catch:{ Exception -> 0x00ab }
            com.alibaba.ariver.kernel.common.network.http.RVHttpResponse r2 = r2.httpRequest(r3)     // Catch:{ Exception -> 0x00ab }
            if (r2 == 0) goto L_0x0041
            java.io.InputStream r3 = r2.getResStream()     // Catch:{ Exception -> 0x00ab }
            int r2 = r2.getStatusCode()     // Catch:{ Exception -> 0x00ab }
            r6.e = r2     // Catch:{ Exception -> 0x00ab }
            r2 = r3
            goto L_0x0043
        L_0x0041:
            r2 = r1
            r3 = r2
        L_0x0043:
            if (r3 != 0) goto L_0x0072
            java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x006d }
            java.lang.String r4 = r6.f10170a     // Catch:{ Exception -> 0x006d }
            r3.<init>(r4)     // Catch:{ Exception -> 0x006d }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ Exception -> 0x006d }
            java.lang.Object r3 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r3)     // Catch:{ Exception -> 0x006d }
            java.net.URLConnection r3 = (java.net.URLConnection) r3     // Catch:{ Exception -> 0x006d }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Exception -> 0x006d }
            r6.c = r3     // Catch:{ Exception -> 0x006d }
            java.io.InputStream r3 = r3.getInputStream()     // Catch:{ Exception -> 0x006d }
            java.net.HttpURLConnection r4 = r6.c     // Catch:{ Exception -> 0x006d }
            int r4 = r4.getResponseCode()     // Catch:{ Exception -> 0x006d }
            r6.e = r4     // Catch:{ Exception -> 0x006d }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x006d }
            r4.<init>(r3)     // Catch:{ Exception -> 0x006d }
            r2 = r4
            goto L_0x0072
        L_0x006d:
            r1 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto L_0x00ac
        L_0x0072:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x006d }
            java.lang.String r4 = "initStream "
            r3.<init>(r4)     // Catch:{ Exception -> 0x006d }
            java.lang.String r4 = r6.f10170a     // Catch:{ Exception -> 0x006d }
            r3.append(r4)     // Catch:{ Exception -> 0x006d }
            java.lang.String r4 = " get statusCode: "
            r3.append(r4)     // Catch:{ Exception -> 0x006d }
            int r4 = r6.e     // Catch:{ Exception -> 0x006d }
            r3.append(r4)     // Catch:{ Exception -> 0x006d }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x006d }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r3)     // Catch:{ Exception -> 0x006d }
            int r3 = r6.e     // Catch:{ Exception -> 0x006d }
            r4 = 400(0x190, float:5.6E-43)
            if (r3 < r4) goto L_0x00a1
            com.alibaba.ariver.resource.api.content.NetworkStream$Listener r3 = r6.d     // Catch:{ Exception -> 0x006d }
            if (r3 == 0) goto L_0x00a0
            com.alibaba.ariver.resource.api.content.NetworkStream$Listener r3 = r6.d     // Catch:{ Exception -> 0x006d }
            int r4 = r6.e     // Catch:{ Exception -> 0x006d }
            r3.onResourceError(r6, r4)     // Catch:{ Exception -> 0x006d }
        L_0x00a0:
            return r1
        L_0x00a1:
            com.alibaba.ariver.resource.api.content.NetworkStream$Listener r1 = r6.d     // Catch:{ Exception -> 0x006d }
            if (r1 == 0) goto L_0x00ca
            com.alibaba.ariver.resource.api.content.NetworkStream$Listener r1 = r6.d     // Catch:{ Exception -> 0x006d }
            r1.onInputOpen(r6)     // Catch:{ Exception -> 0x006d }
            goto L_0x00ca
        L_0x00ab:
            r2 = move-exception
        L_0x00ac:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r6.f10170a
            r3.append(r4)
            java.lang.String r4 = " failed to init stream "
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r0, r3, r2)
            com.alibaba.ariver.resource.api.content.NetworkStream$Listener r0 = r6.d
            if (r0 == 0) goto L_0x00c9
            r0.onInputException()
        L_0x00c9:
            r2 = r1
        L_0x00ca:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.resource.api.content.NetworkStream.a():java.io.InputStream");
    }
}
