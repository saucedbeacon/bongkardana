package com.alipay.imobile.network.quake.transport.http;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.imobile.network.quake.NetworkResponse;
import com.alipay.imobile.network.quake.Quake;
import com.alipay.imobile.network.quake.QuakeConfig;
import com.alipay.imobile.network.quake.Request;
import com.alipay.imobile.network.quake.cache.Cache;
import com.alipay.imobile.network.quake.exception.ClientException;
import com.alipay.imobile.network.quake.exception.ServerException;
import com.alipay.imobile.network.quake.f;
import com.alipay.imobile.network.quake.rpc.RpcRequest;
import com.alipay.imobile.network.quake.transport.HttpDate;
import com.alipay.imobile.network.quake.transport.TrafficFlowMonitor;
import com.alipay.imobile.network.quake.transport.Transporter;
import com.alipay.imobile.network.quake.transport.TransporterCallBack;
import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import com.alipay.imobile.network.quake.transport.storage.ByteArrayPool;
import com.alipay.imobile.network.quake.transport.storage.PoolingByteArrayOutputStream;
import com.alipay.imobile.network.quake.transport.strategy.RetryPolicy;
import com.alipay.imobile.network.quake.util.NetworkUtils;
import com.alipay.imobile.network.quake.util.SignUtil;
import com.alipay.imobile.network.quake.util.e;
import com.alipay.mobile.common.rpc.RpcException;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public abstract class AbstractHttpTransport implements Transporter {
    protected static final int DEFAULT_CONNECTION_POOL = 5;
    private static final ExecutorService f = new ThreadPoolExecutor(5, 10, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), e.c("Quake http ConnectionPool"));

    /* renamed from: a  reason: collision with root package name */
    private final CookieJar f9375a;
    private final TrafficFlowMonitor b;
    private String c;
    private String d;
    private ExecutorService e;
    protected final Context mAppContext;
    protected final ByteArrayPool mPool;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        Request f9376a;
        TransporterCallBack b;
        long c;

        private a(Request request, TransporterCallBack transporterCallBack, long j) {
            this.f9376a = request;
            this.b = transporterCallBack;
            this.c = j;
        }

        public void run() {
            try {
                NetworkResponse executeRequest = AbstractHttpTransport.this.executeRequest(this.f9376a);
                String str = Quake.TAG;
                StringBuilder sb = new StringBuilder("http:requestLifetime,");
                sb.append(SystemClock.elapsedRealtime() - this.c);
                LoggerWrapper.i(str, sb.toString());
                if (this.b != null) {
                    this.b.onCompeleted(this.f9376a, executeRequest);
                }
            } catch (RpcException e) {
                TransporterCallBack transporterCallBack = this.b;
                if (transporterCallBack != null) {
                    transporterCallBack.onException(this.f9376a, e);
                }
            }
            this.f9376a = null;
        }
    }

    public AbstractHttpTransport() {
        this(4096);
    }

    public AbstractHttpTransport(int i) {
        TrafficFlowMonitor trafficFlowMonitor;
        this.mPool = new ByteArrayPool(i);
        f a2 = f.a();
        this.mAppContext = a2.d();
        QuakeConfig e2 = a2.e();
        if (e2 != null) {
            this.f9375a = e2.getCookieJar();
            trafficFlowMonitor = e2.getTrafficFlowMonitor();
        } else {
            trafficFlowMonitor = null;
            this.f9375a = null;
        }
        this.b = trafficFlowMonitor;
        this.e = f;
    }

    private String a(List<Cookie> list) {
        LoggerWrapper.d(Quake.TAG, "obtain cookie header");
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            Cookie cookie = list.get(i);
            sb.append(cookie.name());
            sb.append('=');
            sb.append(cookie.value());
        }
        return sb.toString();
    }

    private void a(Map<String, String> map, Request request) {
        if (map != null && request != null) {
            String signRequest = signRequest(request);
            if (!TextUtils.isEmpty(signRequest)) {
                map.put("sign", signRequest);
            }
        }
    }

    private void a(Map<String, String> map, Cache.Entry entry) {
        if (entry != null && map != null) {
            if (entry.dataVersion != null) {
                map.put("If-None-Match", entry.dataVersion);
            }
            if (entry.lastModified > 0) {
                map.put("If-Modified-Since", HttpDate.format(new Date(entry.lastModified)));
            }
        }
    }

    private byte[] a(HttpResponseBody httpResponseBody) throws IOException, RpcException {
        PoolingByteArrayOutputStream poolingByteArrayOutputStream = new PoolingByteArrayOutputStream(this.mPool, (int) httpResponseBody.contentLength());
        try {
            writeData(httpResponseBody.byteStream(), httpResponseBody.contentEncoding(), 0, poolingByteArrayOutputStream);
            return poolingByteArrayOutputStream.toByteArray();
        } finally {
            try {
                httpResponseBody.consumeContent();
            } catch (IOException e2) {
                LoggerWrapper.e(Quake.TAG, "Error occured when calling consumingContent", e2);
            }
            poolingByteArrayOutputStream.close();
        }
    }

    protected static void attemptRetryOnException(String str, Request request, RpcException rpcException) throws RpcException {
        RetryPolicy retryPolicy = request.getRetryPolicy();
        int timeoutMs = request.getTimeoutMs();
        try {
            retryPolicy.retry(rpcException);
            request.addMarker(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(timeoutMs)}));
        } catch (RpcException e2) {
            request.addMarker(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(timeoutMs)}));
            throw e2;
        }
    }

    private void b(Map<String, String> map, Request request) {
        String obtainCookie = obtainCookie(request);
        if (LoggerWrapper.isDebuggable()) {
            String replace = obtainCookie.replace("%", "");
            String str = Quake.TAG;
            StringBuilder sb = new StringBuilder("add cookie=");
            sb.append(replace);
            sb.append(". url=");
            sb.append(request.getUrl());
            LoggerWrapper.i(str, sb.toString());
        }
        if (!TextUtils.isEmpty(obtainCookie)) {
            map.put("Cookie", obtainCookie);
        }
    }

    public static Map<String, String> convertHeaders(HttpHeaders httpHeaders) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int a2 = httpHeaders.a();
        for (int i = 0; i < a2; i++) {
            treeMap.put(httpHeaders.a(i), httpHeaders.b(i));
        }
        return treeMap;
    }

    public static byte[] getCompressedEntity(byte[] bArr) throws IOException {
        LoggerWrapper.i(Quake.TAG, "gzip...");
        if (bArr.length < 160) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        String str = Quake.TAG;
        StringBuilder sb = new StringBuilder("gzip size:");
        sb.append(bArr.length);
        sb.append("->");
        sb.append(byteArray.length);
        LoggerWrapper.i(str, sb.toString());
        return byteArray;
    }

    protected static InputStream getUngzippedContent(InputStream inputStream, String str) throws IOException {
        if (inputStream == null) {
            return null;
        }
        return (!TextUtils.isEmpty(str) && str.contains(HeaderConstant.HEADER_VALUE_CONTENT_ENCODING_GZIP)) ? new GZIPInputStream(inputStream) : inputStream;
    }

    /* access modifiers changed from: protected */
    public void addRequestHeaders(Map<String, String> map, Request request) {
        Map<String, String> externalInfo = request.getProtocol().getExternalInfo(request);
        if (externalInfo != null) {
            map.putAll(externalInfo);
        }
        map.put(HttpHeaders.ACCEPT_ENCODING, HeaderConstant.HEADER_VALUE_CONTENT_ENCODING_GZIP);
        map.put(HttpHeaders.CONNECTION, "Keep-Alive");
        a(map, request.getCacheEntry());
        b(map, request);
        String a2 = e.a(this.mAppContext);
        if (!TextUtils.isEmpty(a2)) {
            map.put("Accept-Language", a2);
        }
        a(map, request);
        if (e.b(this.mAppContext)) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry next : map.entrySet()) {
                sb.append((String) next.getKey());
                sb.append(":");
                sb.append((String) next.getValue());
                sb.append(", ");
            }
            if (LoggerWrapper.isDebuggable()) {
                LoggerWrapper.i(Quake.TAG, "Added request headers : ".concat(String.valueOf(sb.toString().replace("%", ""))));
            }
        }
    }

    /* access modifiers changed from: protected */
    public CookieJar cookieJar() {
        return this.f9375a;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0204, code lost:
        com.alipay.iap.android.common.log.LoggerWrapper.d(com.alipay.imobile.network.quake.Quake.TAG, "", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0212, code lost:
        throw new com.alipay.imobile.network.quake.exception.ServerException((java.lang.Integer) 5000, (java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0213, code lost:
        r0 = new com.alipay.imobile.network.quake.exception.ServerException((java.lang.Integer) 4, r4);
        r1 = "redirect";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0220, code lost:
        com.alipay.iap.android.common.log.LoggerWrapper.e(com.alipay.imobile.network.quake.Quake.TAG, "", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x022e, code lost:
        throw new com.alipay.imobile.network.quake.exception.ServerException((java.lang.Integer) 5000, (java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x022f, code lost:
        com.alipay.iap.android.common.log.LoggerWrapper.e(com.alipay.imobile.network.quake.Quake.TAG, "", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x023d, code lost:
        throw new com.alipay.imobile.network.quake.exception.ServerException((java.lang.Integer) 5000, (java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x023e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        r7 = 301;
        r17 = null;
        r26 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0249, code lost:
        throw new com.alipay.imobile.network.quake.exception.ServerException((java.lang.Integer) 3, (java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0257, code lost:
        throw new com.alipay.imobile.network.quake.exception.ServerException((java.lang.Integer) 3002, "Illegal url config");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0258, code lost:
        r0 = new com.alipay.imobile.network.quake.exception.TimeoutException(4, "connect time out");
        r1 = "connection";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0267, code lost:
        r0 = new com.alipay.imobile.network.quake.exception.TimeoutException(5, "socket time out");
        r1 = "socket";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0098, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x018d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x019b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x019c, code lost:
        r7 = 301;
        r26 = 0;
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01a5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a6, code lost:
        r7 = 301;
        r26 = 0;
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ab, code lost:
        r17 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b3, code lost:
        r1 = r1.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b7, code lost:
        if (r1 == r7) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01be, code lost:
        r4 = com.alipay.imobile.network.quake.Quake.TAG;
        r5 = new java.lang.Object[2];
        r5[r26] = java.lang.Integer.valueOf(r1);
        r5[1] = r35.getUrl();
        com.alipay.iap.android.common.log.LoggerWrapper.e(r4, com.alipay.iap.android.common.log.LoggerWrapper.buildMessage("Unexpected response code %d for %s", r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01d9, code lost:
        r4 = com.alipay.imobile.network.quake.Quake.TAG;
        r5 = new java.lang.Object[2];
        r5[r26] = r35.getOriginUrl();
        r5[1] = r35.getUrl();
        com.alipay.iap.android.common.log.LoggerWrapper.i(r4, com.alipay.iap.android.common.log.LoggerWrapper.buildMessage("Request at %s has been redirected to %s", r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01f3, code lost:
        r4 = "the status code from server is ".concat(java.lang.String.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01fb, code lost:
        if (r17 != null) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01fd, code lost:
        if (r1 == r7) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        r1 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x023e A[ExcHandler: SSLHandshakeException (r0v5 'e' javax.net.ssl.SSLHandshakeException A[CUSTOM_DECLARE]), Splitter:B:11:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:113:? A[ExcHandler: MalformedURLException (unused java.net.MalformedURLException), SYNTHETIC, Splitter:B:2:0x001f] */
    /* JADX WARNING: Removed duplicated region for block: B:116:? A[ExcHandler: ConnectTimeoutException (unused org.apache.http.conn.ConnectTimeoutException), SYNTHETIC, Splitter:B:2:0x001f] */
    /* JADX WARNING: Removed duplicated region for block: B:118:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:2:0x001f] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x022f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.alipay.imobile.network.quake.NetworkResponse executeRequest(com.alipay.imobile.network.quake.Request r35) throws com.alipay.mobile.common.rpc.RpcException {
        /*
            r34 = this;
            r7 = r34
            r8 = r35
            java.lang.String r9 = "Mgw-TraceId"
            java.lang.String r10 = "ts"
            java.lang.String r11 = "the status code from server is "
            r34.isNetworkAvailable()
            r35.checkLogin()
            long r12 = android.os.SystemClock.elapsedRealtime()
        L_0x0016:
            java.lang.String r0 = r35.getUrl()
            r7.isTrafficConsumeAccept(r0)
            r16 = 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x01a5 }
            r2.<init>()     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x01a5 }
            android.content.Context r0 = r7.mAppContext     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x01a5 }
            com.alipay.imobile.network.quake.ext.proxy.a r0 = com.alipay.imobile.network.quake.ext.proxy.a.a((android.content.Context) r0)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x01a5 }
            java.lang.String r0 = r0.b()     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x01a5 }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x01a5 }
            if (r3 != 0) goto L_0x0044
            java.lang.String r3 = "did"
            r8.addExternalInfo(r3, r0)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x003a }
            goto L_0x0044
        L_0x003a:
            r0 = move-exception
            r1 = 0
        L_0x003c:
            r7 = 301(0x12d, float:4.22E-43)
            r17 = 0
            r26 = 0
            goto L_0x01ad
        L_0x0044:
            android.content.Context r0 = r7.mAppContext     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x01a5 }
            com.alipay.iap.android.common.timesync.TimeSyncManager r0 = com.alipay.iap.android.common.timesync.TimeSyncManager.getInstance(r0)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x01a5 }
            if (r0 == 0) goto L_0x0051
            long r17 = r0.getServerTime()     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x003a }
            goto L_0x0055
        L_0x0051:
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x01a5 }
        L_0x0055:
            java.lang.String r3 = java.lang.String.valueOf(r17)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x01a5 }
            r2.append(r3)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x01a5 }
            r8.addExternalInfo(r10, r3)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x01a5 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x01a5 }
            r1.<init>()     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x01a5 }
            r1.put(r10, r3)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x01a5 }
            r7.addRequestHeaders(r1, r8)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x01a5 }
            com.alipay.imobile.network.quake.transport.http.HttpResponse r3 = r7.performRequest(r8, r1)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x01a5 }
            int r1 = r3.a()     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x019b }
            com.alipay.imobile.network.quake.transport.http.HttpHeaders r18 = r3.b()     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x019b }
            java.util.Map r14 = convertHeaders(r18)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x019b }
            java.lang.String r15 = "Server-Time"
            java.lang.Object r15 = r14.get(r15)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x019b }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x019b }
            if (r15 == 0) goto L_0x00bb
            java.lang.Long r18 = java.lang.Long.valueOf(r15)     // Catch:{ Exception -> 0x009b }
            long r4 = r18.longValue()     // Catch:{ Exception -> 0x009b }
            if (r0 == 0) goto L_0x00bb
            long r18 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x009b }
            long r6 = r18 - r12
            r0.setServerTime(r6, r4)     // Catch:{ Exception -> 0x009b }
            goto L_0x00bb
        L_0x0098:
            r0 = move-exception
            r1 = r3
            goto L_0x003c
        L_0x009b:
            r0 = move-exception
            java.lang.String r4 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x0098 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x0098 }
            java.lang.String r6 = "get Server-Time error,time:"
            r5.<init>(r6)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x0098 }
            r5.append(r15)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x0098 }
            java.lang.String r6 = ",error="
            r5.append(r6)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x0098 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x0098 }
            r5.append(r0)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x0098 }
            java.lang.String r0 = r5.toString()     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x0098 }
            com.alipay.iap.android.common.log.LoggerWrapper.e(r4, r0)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x0098 }
        L_0x00bb:
            java.lang.Object r0 = r14.get(r9)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x019b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x019b }
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x019b }
            if (r4 == 0) goto L_0x00c9
            java.lang.String r0 = "-"
        L_0x00c9:
            boolean r4 = com.alipay.iap.android.common.log.LoggerWrapper.isDebuggable()     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x019b }
            if (r4 == 0) goto L_0x00e3
            java.lang.String r4 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x0098 }
            java.lang.String r5 = "RPC ==> current rpc_trace_id: %1$s and sofa_id: %2$s"
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x0098 }
            r15 = 0
            r7[r15] = r2     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x0098 }
            r7[r16] = r0     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x0098 }
            java.lang.String r2 = com.alipay.iap.android.common.log.LoggerWrapper.buildMessage(r5, r7)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x0098 }
            com.alipay.iap.android.common.log.LoggerWrapper.i(r4, r2)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x0098 }
            goto L_0x00e4
        L_0x00e3:
            r6 = 2
        L_0x00e4:
            r8.addExternalInfo(r9, r0)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x019b }
            r7 = r34
            r7.extractCookiesFromResponse(r3, r8)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x019b }
            r0 = 304(0x130, float:4.26E-43)
            if (r1 != r0) goto L_0x0126
            com.alipay.imobile.network.quake.cache.Cache$Entry r0 = r35.getCacheEntry()     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x0098 }
            if (r0 != 0) goto L_0x010c
            com.alipay.imobile.network.quake.NetworkResponse r0 = new com.alipay.imobile.network.quake.NetworkResponse     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x0098 }
            r20 = 304(0x130, float:4.26E-43)
            r21 = 0
            r23 = 1
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x0098 }
            long r24 = r1 - r12
            r19 = r0
            r22 = r14
            r19.<init>(r20, r21, r22, r23, r24)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x0098 }
            return r0
        L_0x010c:
            com.alipay.imobile.network.quake.NetworkResponse r1 = new com.alipay.imobile.network.quake.NetworkResponse     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x0098 }
            r28 = 304(0x130, float:4.26E-43)
            byte[] r2 = r0.data     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x0098 }
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.extData     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x0098 }
            r31 = 1
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x0098 }
            long r32 = r4 - r12
            r27 = r1
            r29 = r2
            r30 = r0
            r27.<init>(r28, r29, r30, r31, r32)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x0098 }
            return r1
        L_0x0126:
            r5 = 301(0x12d, float:4.22E-43)
            if (r1 == r5) goto L_0x012e
            r2 = 302(0x12e, float:4.23E-43)
            if (r1 != r2) goto L_0x0139
        L_0x012e:
            java.lang.String r0 = "Location"
            java.lang.Object r0 = r14.get(r0)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x019b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x019b }
            r8.setRedirectUrl(r0)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x019b }
        L_0x0139:
            com.alipay.imobile.network.quake.transport.http.HttpResponseBody r0 = r3.c()     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x019b }
            if (r0 == 0) goto L_0x0146
            byte[] r0 = r7.a((com.alipay.imobile.network.quake.transport.http.HttpResponseBody) r0)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x0098 }
            r15 = r0
            r4 = 0
            goto L_0x014a
        L_0x0146:
            r4 = 0
            byte[] r0 = new byte[r4]     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x019b }
            r15 = r0
        L_0x014a:
            long r17 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x018f }
            long r23 = r17 - r12
            r2 = r1
            r1 = r34
            r17 = r2
            r25 = r3
            r2 = r23
            r26 = 0
            r4 = r35
            r7 = 301(0x12d, float:4.22E-43)
            r5 = r15
            r6 = r17
            r1.logRequests(r2, r4, r5, r6)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x018d }
            r0 = 200(0xc8, float:2.8E-43)
            r1 = r17
            if (r1 < r0) goto L_0x017f
            r0 = 299(0x12b, float:4.19E-43)
            if (r1 > r0) goto L_0x017f
            com.alipay.imobile.network.quake.NetworkResponse r0 = new com.alipay.imobile.network.quake.NetworkResponse     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x018d }
            r22 = 0
            r18 = r0
            r19 = r1
            r20 = r15
            r21 = r14
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x018d }
            return r0
        L_0x017f:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x018d }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x018d }
            java.lang.String r1 = r11.concat(r1)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x018d }
            r0.<init>(r1)     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x018d }
            throw r0     // Catch:{ SocketTimeoutException -> 0x0267, ConnectTimeoutException -> 0x0258, MalformedURLException -> 0x024a, SSLHandshakeException -> 0x023e, IOException -> 0x018d }
        L_0x018d:
            r0 = move-exception
            goto L_0x0196
        L_0x018f:
            r0 = move-exception
            r25 = r3
            r7 = 301(0x12d, float:4.22E-43)
            r26 = 0
        L_0x0196:
            r17 = r15
            r1 = r25
            goto L_0x01ad
        L_0x019b:
            r0 = move-exception
            r25 = r3
            r7 = 301(0x12d, float:4.22E-43)
            r26 = 0
            r1 = r25
            goto L_0x01ab
        L_0x01a5:
            r0 = move-exception
            r7 = 301(0x12d, float:4.22E-43)
            r26 = 0
            r1 = 0
        L_0x01ab:
            r17 = 0
        L_0x01ad:
            r2 = 5000(0x1388, float:7.006E-42)
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x022f
            int r1 = r1.a()
            if (r1 == r7) goto L_0x01d9
            r4 = 302(0x12e, float:4.23E-43)
            if (r1 != r4) goto L_0x01be
            goto L_0x01d9
        L_0x01be:
            java.lang.String r4 = com.alipay.imobile.network.quake.Quake.TAG
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r5[r26] = r6
            java.lang.String r6 = r35.getUrl()
            r5[r16] = r6
            java.lang.String r6 = "Unexpected response code %d for %s"
            java.lang.String r5 = com.alipay.iap.android.common.log.LoggerWrapper.buildMessage(r6, r5)
            com.alipay.iap.android.common.log.LoggerWrapper.e(r4, r5)
            goto L_0x01f3
        L_0x01d9:
            r5 = 2
            java.lang.String r4 = com.alipay.imobile.network.quake.Quake.TAG
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = r35.getOriginUrl()
            r5[r26] = r6
            java.lang.String r6 = r35.getUrl()
            r5[r16] = r6
            java.lang.String r6 = "Request at %s has been redirected to %s"
            java.lang.String r5 = com.alipay.iap.android.common.log.LoggerWrapper.buildMessage(r6, r5)
            com.alipay.iap.android.common.log.LoggerWrapper.i(r4, r5)
        L_0x01f3:
            java.lang.String r4 = java.lang.String.valueOf(r1)
            java.lang.String r4 = r11.concat(r4)
            if (r17 == 0) goto L_0x0220
            if (r1 == r7) goto L_0x0213
            r5 = 302(0x12e, float:4.23E-43)
            if (r1 != r5) goto L_0x0204
            goto L_0x0213
        L_0x0204:
            java.lang.String r1 = com.alipay.imobile.network.quake.Quake.TAG
            com.alipay.iap.android.common.log.LoggerWrapper.d(r1, r3, r0)
            com.alipay.imobile.network.quake.exception.ServerException r1 = new com.alipay.imobile.network.quake.exception.ServerException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.<init>((java.lang.Integer) r2, (java.lang.Throwable) r0)
            throw r1
        L_0x0213:
            com.alipay.imobile.network.quake.exception.ServerException r0 = new com.alipay.imobile.network.quake.exception.ServerException
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>((java.lang.Integer) r1, (java.lang.String) r4)
            java.lang.String r1 = "redirect"
            goto L_0x0277
        L_0x0220:
            java.lang.String r1 = com.alipay.imobile.network.quake.Quake.TAG
            com.alipay.iap.android.common.log.LoggerWrapper.e(r1, r3, r0)
            com.alipay.imobile.network.quake.exception.ServerException r1 = new com.alipay.imobile.network.quake.exception.ServerException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.<init>((java.lang.Integer) r2, (java.lang.Throwable) r0)
            throw r1
        L_0x022f:
            java.lang.String r1 = com.alipay.imobile.network.quake.Quake.TAG
            com.alipay.iap.android.common.log.LoggerWrapper.e(r1, r3, r0)
            com.alipay.imobile.network.quake.exception.ServerException r1 = new com.alipay.imobile.network.quake.exception.ServerException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.<init>((java.lang.Integer) r2, (java.lang.Throwable) r0)
            throw r1
        L_0x023e:
            r0 = move-exception
            com.alipay.imobile.network.quake.exception.ServerException r1 = new com.alipay.imobile.network.quake.exception.ServerException
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.<init>((java.lang.Integer) r2, (java.lang.Throwable) r0)
            throw r1
        L_0x024a:
            com.alipay.imobile.network.quake.exception.ServerException r0 = new com.alipay.imobile.network.quake.exception.ServerException
            r1 = 3002(0xbba, float:4.207E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "Illegal url config"
            r0.<init>((java.lang.Integer) r1, (java.lang.String) r2)
            throw r0
        L_0x0258:
            com.alipay.imobile.network.quake.exception.TimeoutException r0 = new com.alipay.imobile.network.quake.exception.TimeoutException
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "connect time out"
            r0.<init>(r1, r2)
            java.lang.String r1 = "connection"
            goto L_0x0277
        L_0x0267:
            com.alipay.imobile.network.quake.exception.TimeoutException r0 = new com.alipay.imobile.network.quake.exception.TimeoutException
            r1 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "socket time out"
            r0.<init>(r1, r2)
            java.lang.String r1 = "socket"
        L_0x0277:
            attemptRetryOnException(r1, r8, r0)
            r7 = r34
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.transport.http.AbstractHttpTransport.executeRequest(com.alipay.imobile.network.quake.Request):com.alipay.imobile.network.quake.NetworkResponse");
    }

    /* access modifiers changed from: protected */
    public void extractCookiesFromResponse(HttpResponse httpResponse, Request request) throws MalformedURLException {
        CookieJar cookieJar = this.f9375a;
        if (cookieJar == null || cookieJar == CookieJar.NO_COOKIES) {
            LoggerWrapper.d(Quake.TAG, "cancel saving cookie, have no cookie jar");
        } else if (httpResponse == null || request == null) {
            LoggerWrapper.d(Quake.TAG, "cancel saving cookie, cause of httpResponse and request is null");
        } else {
            URL url = new URL(request.getUrl());
            List<Cookie> parseAll = Cookie.parseAll(url, httpResponse.a("Set-Cookie"));
            if (parseAll.isEmpty()) {
                LoggerWrapper.d(Quake.TAG, "cancel saving cookie, cause of cookies is empty");
            } else {
                this.f9375a.saveFromResponse(url, parseAll);
            }
        }
    }

    /* access modifiers changed from: protected */
    public ExecutorService getExecutorService() {
        return this.e;
    }

    public String getUserAgent() {
        return com.alipay.imobile.network.quake.transport.strategy.a.a();
    }

    /* access modifiers changed from: protected */
    public void isNetworkAvailable() throws RpcException {
        if (!NetworkUtils.isNetworkAvailable(this.mAppContext)) {
            throw new ClientException((Integer) 2, "The network is not available");
        }
    }

    /* access modifiers changed from: protected */
    public boolean isTrafficConsumeAccept(String str) {
        TrafficFlowMonitor trafficFlowMonitor = this.b;
        if (trafficFlowMonitor == null) {
            return true;
        }
        return trafficFlowMonitor.isTrafficConsumeAccept(str);
    }

    /* access modifiers changed from: protected */
    public void logRequests(long j, Request request, byte[] bArr, int i) {
        if (LoggerWrapper.isDebuggable()) {
            String str = Quake.TAG;
            Object[] objArr = new Object[5];
            objArr[0] = request;
            objArr[1] = Long.valueOf(j);
            objArr[2] = bArr != null ? Integer.valueOf(bArr.length) : "null";
            objArr[3] = Integer.valueOf(i);
            objArr[4] = Integer.valueOf(request.getRetryPolicy().getCurrentRetryCount());
            LoggerWrapper.v(str, LoggerWrapper.buildMessage("HTTP response for request=<%s> [lifetime=%d], [size=%s], [status=%d], [retryCount=%s]", objArr));
        }
    }

    /* access modifiers changed from: protected */
    public String obtainCookie(Request request) {
        CookieJar cookieJar = this.f9375a;
        if (cookieJar == null || cookieJar == CookieJar.NO_COOKIES) {
            LoggerWrapper.d(Quake.TAG, "cancel load cookie, have no cookie jar");
            return null;
        }
        try {
            return a(this.f9375a.loadForRequest(new URL(request.getUrl())));
        } catch (MalformedURLException e2) {
            LoggerWrapper.e(Quake.TAG, "", e2);
            throw new ClientException((Integer) 9, "can not load cookie");
        }
    }

    /* access modifiers changed from: protected */
    public abstract HttpResponse performRequest(Request request, Map<String, String> map) throws IOException, RpcException;

    /* access modifiers changed from: protected */
    public void setExecutorService(ExecutorService executorService) {
        if (executorService == null) {
            LoggerWrapper.i(Quake.TAG, "ignoring setting executor service because of new executor is null.");
        } else {
            this.e = executorService;
        }
    }

    public void setUserAgent(String str) {
        if (!TextUtils.isEmpty(str)) {
            com.alipay.imobile.network.quake.transport.strategy.a.a(str);
        }
    }

    /* access modifiers changed from: protected */
    public String signRequest(Request request) {
        if (TextUtils.isEmpty(this.c)) {
            this.c = f.a().j();
            this.d = f.a().k();
        }
        SignUtil.SignInfo signInfo = null;
        if (request instanceof RpcRequest) {
            signInfo = ((RpcRequest) request).getSignInfo();
        }
        if (signInfo == null) {
            signInfo = new SignUtil.SignInfo(this.c, this.d);
        }
        LoggerWrapper.v(Quake.TAG, "before sign in AbstractHttpTransport");
        return SignUtil.a(request, this.mAppContext, signInfo);
    }

    public void submitRequest(Request request, TransporterCallBack transporterCallBack) {
        if (!request.isCanceled()) {
            getExecutorService().submit(new a(request, transporterCallBack, SystemClock.elapsedRealtime()));
        }
    }

    /* access modifiers changed from: protected */
    public long writeData(InputStream inputStream, String str, long j, OutputStream outputStream) throws IOException, RpcException {
        if (outputStream == null) {
            throw new RpcException("Output stream may not be null");
        } else if (inputStream != null) {
            InputStream ungzippedContent = getUngzippedContent(new com.alipay.imobile.network.quake.transport.storage.a(inputStream), str);
            if (ungzippedContent != null) {
                try {
                    byte[] buf = this.mPool.getBuf(2048);
                    while (true) {
                        int read = ungzippedContent.read(buf);
                        if (read == -1) {
                            break;
                        }
                        outputStream.write(buf, 0, read);
                        j += (long) read;
                    }
                    outputStream.flush();
                    if (buf != null) {
                        this.mPool.returnBuf(buf);
                    }
                    if (ungzippedContent != null) {
                        try {
                            ungzippedContent.close();
                        } catch (IOException e2) {
                            LoggerWrapper.e(Quake.TAG, "", e2);
                        }
                    }
                    return j;
                } catch (Exception e3) {
                    LoggerWrapper.e(Quake.TAG, "", e3);
                    IOException iOException = new IOException("http transport get data from entity error!");
                    iOException.initCause(e3);
                    throw iOException;
                } catch (Throwable th) {
                    if (0 != 0) {
                        this.mPool.returnBuf((byte[]) null);
                    }
                    if (ungzippedContent != null) {
                        try {
                            ungzippedContent.close();
                        } catch (IOException e4) {
                            LoggerWrapper.e(Quake.TAG, "", e4);
                        }
                    }
                    throw th;
                }
            } else {
                throw new ServerException((Integer) 6, "the content of the network response is null.");
            }
        } else {
            throw new ServerException((Integer) 6, "the content of the network response is null.");
        }
    }
}
