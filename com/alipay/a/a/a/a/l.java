package com.alipay.a.a.a.a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import com.google.common.net.HttpHeaders;
import com.j256.ormlite.stmt.query.SimpleComparison;
import id.dana.sendmoney.summary.SummaryActivity;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

public final class l implements Callable<p> {
    private static final HttpRequestRetryHandler e = new z();

    /* renamed from: a  reason: collision with root package name */
    protected h f9242a;
    protected Context b;
    protected j c;
    String d;
    private HttpUriRequest f;
    private HttpContext g = new BasicHttpContext();
    private CookieStore h = new BasicCookieStore();
    private CookieManager i;
    private AbstractHttpEntity j;
    private HttpHost k;
    private URL l;
    private int m = 0;
    private boolean n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f9243o = false;
    private String p = null;
    private String q;

    public l(h hVar, j jVar) {
        this.f9242a = hVar;
        this.b = hVar.f9236a;
        this.c = jVar;
    }

    private URI b() {
        String str = this.c.f9240a;
        String str2 = this.d;
        if (str2 != null) {
            str = str2;
        }
        if (str != null) {
            return new URI(str);
        }
        throw new RuntimeException("url should not be null");
    }

    private HttpUriRequest c() {
        HttpUriRequest httpUriRequest = this.f;
        if (httpUriRequest != null) {
            return httpUriRequest;
        }
        if (this.j == null) {
            byte[] bArr = this.c.b;
            String a2 = this.c.a(HeaderConstant.HEADER_VALUE_CONTENT_ENCODING_GZIP);
            if (bArr != null) {
                if (TextUtils.equals(a2, SummaryActivity.CHECKED)) {
                    this.j = b.a(bArr);
                } else {
                    this.j = new ByteArrayEntity(bArr);
                }
                this.j.setContentType(this.c.c);
            }
        }
        AbstractHttpEntity abstractHttpEntity = this.j;
        if (abstractHttpEntity != null) {
            HttpPost httpPost = new HttpPost(b());
            httpPost.setEntity(abstractHttpEntity);
            this.f = httpPost;
        } else {
            this.f = new HttpGet(b());
        }
        return this.f;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0255, code lost:
        r14.m = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0268, code lost:
        throw new com.alipay.a.a.a.a.g(0, java.lang.String.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0269, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x026a, code lost:
        e();
        r14.c.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x027f, code lost:
        throw new com.alipay.a.a.a.a.g(6, java.lang.String.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0280, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0281, code lost:
        e();
        r14.c.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0298, code lost:
        throw new com.alipay.a.a.a.a.g(9, java.lang.String.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0299, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x029a, code lost:
        e();
        r14.c.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02b1, code lost:
        throw new com.alipay.a.a.a.a.g(8, java.lang.String.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02b3, code lost:
        e();
        r14.c.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02c9, code lost:
        throw new com.alipay.a.a.a.a.g(5, java.lang.String.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02cb, code lost:
        e();
        r14.c.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02e1, code lost:
        throw new com.alipay.a.a.a.a.g(4, java.lang.String.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02e2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02e3, code lost:
        e();
        r14.c.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02f8, code lost:
        throw new com.alipay.a.a.a.a.g(3, java.lang.String.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02f9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02fa, code lost:
        e();
        r14.c.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x030f, code lost:
        throw new com.alipay.a.a.a.a.g(3, java.lang.String.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0310, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0311, code lost:
        e();
        r14.c.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0326, code lost:
        throw new com.alipay.a.a.a.a.g(6, java.lang.String.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0327, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0328, code lost:
        e();
        r14.c.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x033d, code lost:
        throw new com.alipay.a.a.a.a.g(2, java.lang.String.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x033e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x033f, code lost:
        e();
        r14.c.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0354, code lost:
        throw new com.alipay.a.a.a.a.g(2, java.lang.String.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0355, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0361, code lost:
        throw new java.lang.RuntimeException("Url parser error!", r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0362, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0363, code lost:
        e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0367, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x024d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x024e, code lost:
        e();
        r2 = r14.m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0253, code lost:
        if (r2 <= 0) goto L_0x0255;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x0216 */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0269 A[ExcHandler: IOException (r0v22 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:2:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0280 A[ExcHandler: UnknownHostException (r0v20 'e' java.net.UnknownHostException A[CUSTOM_DECLARE]), Splitter:B:2:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0299 A[ExcHandler: HttpHostConnectException (r0v18 'e' org.apache.http.conn.HttpHostConnectException A[CUSTOM_DECLARE]), Splitter:B:2:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02b2 A[ExcHandler: NoHttpResponseException (r0v16 'e' org.apache.http.NoHttpResponseException A[CUSTOM_DECLARE]), Splitter:B:2:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02ca A[ExcHandler: SocketTimeoutException (r0v14 'e' java.net.SocketTimeoutException A[CUSTOM_DECLARE]), Splitter:B:2:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02e2 A[ExcHandler: ConnectTimeoutException (r0v12 'e' org.apache.http.conn.ConnectTimeoutException A[CUSTOM_DECLARE]), Splitter:B:2:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02f9 A[ExcHandler: ConnectionPoolTimeoutException (r0v10 'e' org.apache.http.conn.ConnectionPoolTimeoutException A[CUSTOM_DECLARE]), Splitter:B:2:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0310 A[ExcHandler: SSLException (r0v8 'e' javax.net.ssl.SSLException A[CUSTOM_DECLARE]), Splitter:B:2:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0327 A[ExcHandler: SSLPeerUnverifiedException (r0v6 'e' javax.net.ssl.SSLPeerUnverifiedException A[CUSTOM_DECLARE]), Splitter:B:2:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x033e A[ExcHandler: SSLHandshakeException (r0v4 'e' javax.net.ssl.SSLHandshakeException A[CUSTOM_DECLARE]), Splitter:B:2:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0355 A[ExcHandler: URISyntaxException (r0v2 'e' java.net.URISyntaxException A[CUSTOM_DECLARE]), Splitter:B:2:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0362 A[ExcHandler: g (r0v1 'e' com.alipay.a.a.a.a.g A[CUSTOM_DECLARE]), Splitter:B:2:0x0006] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x022a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032 A[Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e1 A[Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e2 A[Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ea A[Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ed A[Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010d A[Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0143 A[Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0150 A[Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01c3 A[Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01f4 A[Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01fb A[Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x024d A[ExcHandler: NullPointerException (r1v20 'e' java.lang.NullPointerException A[CUSTOM_DECLARE]), Splitter:B:2:0x0006] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.alipay.a.a.a.a.p call() {
        /*
            r14 = this;
            java.lang.String r0 = "connectivity"
        L_0x0002:
            r1 = 3
            r2 = 6
            r3 = 2
            r4 = 0
            android.content.Context r5 = r14.b     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.lang.Object r5 = r5.getSystemService(r0)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            android.net.NetworkInfo[] r5 = r5.getAllNetworkInfo()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r6 = 1
            if (r5 != 0) goto L_0x0017
        L_0x0015:
            r5 = 0
            goto L_0x0030
        L_0x0017:
            int r7 = r5.length     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r8 = 0
        L_0x0019:
            if (r8 >= r7) goto L_0x0015
            r9 = r5[r8]     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            if (r9 == 0) goto L_0x002d
            boolean r10 = r9.isAvailable()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            if (r10 == 0) goto L_0x002d
            boolean r9 = r9.isConnectedOrConnecting()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            if (r9 == 0) goto L_0x002d
            r5 = 1
            goto L_0x0030
        L_0x002d:
            int r8 = r8 + 1
            goto L_0x0019
        L_0x0030:
            if (r5 == 0) goto L_0x022a
            com.alipay.a.a.a.a.j r5 = r14.c     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.util.ArrayList<org.apache.http.Header> r5 = r5.d     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            if (r5 == 0) goto L_0x0056
            boolean r7 = r5.isEmpty()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            if (r7 != 0) goto L_0x0056
            java.util.Iterator r5 = r5.iterator()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
        L_0x0042:
            boolean r7 = r5.hasNext()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            if (r7 == 0) goto L_0x0056
            java.lang.Object r7 = r5.next()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            org.apache.http.Header r7 = (org.apache.http.Header) r7     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            org.apache.http.client.methods.HttpUriRequest r8 = r14.c()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r8.addHeader(r7)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            goto L_0x0042
        L_0x0056:
            org.apache.http.client.methods.HttpUriRequest r5 = r14.c()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            com.alipay.a.a.a.a.b.a((org.apache.http.HttpRequest) r5)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            org.apache.http.client.methods.HttpUriRequest r5 = r14.c()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            com.alipay.a.a.a.a.b.b((org.apache.http.HttpRequest) r5)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            org.apache.http.client.methods.HttpUriRequest r5 = r14.c()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.lang.String r7 = "cookie"
            android.webkit.CookieManager r8 = r14.i()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            com.alipay.a.a.a.a.j r9 = r14.c     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.lang.String r9 = r9.f9240a     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.lang.String r8 = r8.getCookie(r9)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r5.addHeader(r7, r8)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            org.apache.http.protocol.HttpContext r5 = r14.g     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.lang.String r7 = "http.cookie-store"
            org.apache.http.client.CookieStore r8 = r14.h     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r5.setAttribute(r7, r8)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            com.alipay.a.a.a.a.h r5 = r14.f9242a     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            com.alipay.a.a.a.a.b r5 = r5.b     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            org.apache.http.client.HttpRequestRetryHandler r7 = e     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            org.apache.http.client.HttpClient r5 = r5.b     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            org.apache.http.impl.client.DefaultHttpClient r5 = (org.apache.http.impl.client.DefaultHttpClient) r5     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r5.setHttpRequestRetryHandler(r7)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r14.f()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            org.apache.http.client.methods.HttpUriRequest r5 = r14.f     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r5.getURI()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            com.alipay.a.a.a.a.h r5 = r14.f9242a     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            com.alipay.a.a.a.a.b r5 = r5.b     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            org.apache.http.params.HttpParams r5 = r5.getParams()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.lang.String r9 = "http.route.default-proxy"
            android.content.Context r10 = r14.b     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.lang.Object r10 = r10.getSystemService(r0)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            android.net.ConnectivityManager r10 = (android.net.ConnectivityManager) r10     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            android.net.NetworkInfo r10 = r10.getActiveNetworkInfo()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r11 = 0
            if (r10 == 0) goto L_0x00ca
            boolean r10 = r10.isAvailable()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            if (r10 == 0) goto L_0x00ca
            java.lang.String r10 = android.net.Proxy.getDefaultHost()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            int r12 = android.net.Proxy.getDefaultPort()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            if (r10 == 0) goto L_0x00ca
            org.apache.http.HttpHost r13 = new org.apache.http.HttpHost     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r13.<init>(r10, r12)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            goto L_0x00cb
        L_0x00ca:
            r13 = r11
        L_0x00cb:
            if (r13 == 0) goto L_0x00e2
            java.lang.String r10 = r13.getHostName()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.lang.String r12 = "127.0.0.1"
            boolean r10 = android.text.TextUtils.equals(r10, r12)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            if (r10 == 0) goto L_0x00e2
            int r10 = r13.getPort()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r12 = 8087(0x1f97, float:1.1332E-41)
            if (r10 != r12) goto L_0x00e2
            goto L_0x00e3
        L_0x00e2:
            r11 = r13
        L_0x00e3:
            r5.setParameter(r9, r11)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            org.apache.http.HttpHost r5 = r14.k     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            if (r5 == 0) goto L_0x00ed
            org.apache.http.HttpHost r5 = r14.k     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            goto L_0x0105
        L_0x00ed:
            java.net.URL r5 = r14.h()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            org.apache.http.HttpHost r9 = new org.apache.http.HttpHost     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.lang.String r10 = r5.getHost()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            int r11 = r14.g()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.lang.String r5 = r5.getProtocol()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r9.<init>(r10, r11, r5)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r14.k = r9     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r5 = r9
        L_0x0105:
            int r9 = r14.g()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r10 = 80
            if (r9 != r10) goto L_0x011a
            org.apache.http.HttpHost r5 = new org.apache.http.HttpHost     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.net.URL r9 = r14.h()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.lang.String r9 = r9.getHost()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r5.<init>(r9)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
        L_0x011a:
            com.alipay.a.a.a.a.h r9 = r14.f9242a     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            com.alipay.a.a.a.a.b r9 = r9.b     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            org.apache.http.client.methods.HttpUriRequest r10 = r14.f     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            org.apache.http.protocol.HttpContext r11 = r14.g     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            org.apache.http.HttpResponse r5 = r9.execute((org.apache.http.HttpHost) r5, (org.apache.http.HttpRequest) r10, (org.apache.http.protocol.HttpContext) r11)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            com.alipay.a.a.a.a.h r11 = r14.f9242a     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            long r9 = r9 - r7
            long r7 = r11.d     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            long r7 = r7 + r9
            r11.d = r7     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            int r7 = r11.f     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            int r7 = r7 + r6
            r11.f = r7     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            org.apache.http.client.CookieStore r7 = r14.h     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.util.List r7 = r7.getCookies()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            com.alipay.a.a.a.a.j r8 = r14.c     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            boolean r8 = r8.e     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            if (r8 == 0) goto L_0x014a
            android.webkit.CookieManager r8 = r14.i()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r8.removeAllCookie()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
        L_0x014a:
            boolean r8 = r7.isEmpty()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            if (r8 != 0) goto L_0x01af
            java.util.Iterator r7 = r7.iterator()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
        L_0x0154:
            boolean r8 = r7.hasNext()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            if (r8 == 0) goto L_0x01af
            java.lang.Object r8 = r7.next()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            org.apache.http.cookie.Cookie r8 = (org.apache.http.cookie.Cookie) r8     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.lang.String r9 = r8.getDomain()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            if (r9 == 0) goto L_0x0154
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r9.<init>()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.lang.String r10 = r8.getName()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r9.append(r10)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.lang.String r10 = "="
            r9.append(r10)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.lang.String r10 = r8.getValue()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r9.append(r10)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.lang.String r10 = "; domain="
            r9.append(r10)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.lang.String r10 = r8.getDomain()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r9.append(r10)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            boolean r8 = r8.isSecure()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            if (r8 == 0) goto L_0x0193
            java.lang.String r8 = "; Secure"
            goto L_0x0195
        L_0x0193:
            java.lang.String r8 = ""
        L_0x0195:
            r9.append(r8)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.lang.String r8 = r9.toString()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            android.webkit.CookieManager r9 = r14.i()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            com.alipay.a.a.a.a.j r10 = r14.c     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.lang.String r10 = r10.f9240a     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r9.setCookie(r10, r8)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            android.webkit.CookieSyncManager r8 = android.webkit.CookieSyncManager.getInstance()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r8.sync()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            goto L_0x0154
        L_0x01af:
            org.apache.http.StatusLine r7 = r5.getStatusLine()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            int r7 = r7.getStatusCode()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            org.apache.http.StatusLine r8 = r5.getStatusLine()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.lang.String r8 = r8.getReasonPhrase()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r9 = 200(0xc8, float:2.8E-43)
            if (r7 == r9) goto L_0x01e6
            r9 = 304(0x130, float:4.26E-43)
            if (r7 != r9) goto L_0x01c8
            goto L_0x01c9
        L_0x01c8:
            r6 = 0
        L_0x01c9:
            if (r6 == 0) goto L_0x01cc
            goto L_0x01e6
        L_0x01cc:
            com.alipay.a.a.a.a.g r6 = new com.alipay.a.a.a.a.g     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            org.apache.http.StatusLine r7 = r5.getStatusLine()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            int r7 = r7.getStatusCode()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            org.apache.http.StatusLine r5 = r5.getStatusLine()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.lang.String r5 = r5.getReasonPhrase()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r6.<init>(r7, r5)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            throw r6     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
        L_0x01e6:
            com.alipay.a.a.a.a.p r5 = r14.a(r5, r7, r8)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            r6 = -1
            if (r5 == 0) goto L_0x01fb
            byte[] r8 = r5.a()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            if (r8 == 0) goto L_0x01fb
            byte[] r8 = r5.a()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            int r8 = r8.length     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            long r8 = (long) r8     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            goto L_0x01fc
        L_0x01fb:
            r8 = r6
        L_0x01fc:
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0216
            boolean r6 = r5 instanceof com.alipay.a.a.a.a.k     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            if (r6 == 0) goto L_0x0216
            r6 = r5
            com.alipay.a.a.a.a.k r6 = (com.alipay.a.a.a.a.k) r6     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            com.alipay.a.a.a.a.i r6 = r6.d     // Catch:{ Exception -> 0x0216, g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d }
            java.lang.String r7 = "Content-Length"
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f9239a     // Catch:{ Exception -> 0x0216, g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d }
            java.lang.Object r6 = r6.get(r7)     // Catch:{ Exception -> 0x0216, g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0216, g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d }
            java.lang.Long.parseLong(r6)     // Catch:{ Exception -> 0x0216, g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d }
        L_0x0216:
            com.alipay.a.a.a.a.j r6 = r14.c     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.lang.String r6 = r6.f9240a     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            if (r6 == 0) goto L_0x0229
            java.lang.String r6 = r14.f()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            if (r6 != 0) goto L_0x0229
            r14.f()     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
        L_0x0229:
            return r5
        L_0x022a:
            com.alipay.a.a.a.a.g r5 = new com.alipay.a.a.a.a.g     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            java.lang.String r7 = "The network is not available"
            r5.<init>(r6, r7)     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
            throw r5     // Catch:{ g -> 0x0362, URISyntaxException -> 0x0355, SSLHandshakeException -> 0x033e, SSLPeerUnverifiedException -> 0x0327, SSLException -> 0x0310, ConnectionPoolTimeoutException -> 0x02f9, ConnectTimeoutException -> 0x02e2, SocketTimeoutException -> 0x02ca, NoHttpResponseException -> 0x02b2, HttpHostConnectException -> 0x0299, UnknownHostException -> 0x0280, IOException -> 0x0269, NullPointerException -> 0x024d, Exception -> 0x0236 }
        L_0x0236:
            r0 = move-exception
            r14.e()
            com.alipay.a.a.a.a.j r1 = r14.c
            r1.a()
            com.alipay.a.a.a.a.g r1 = new com.alipay.a.a.a.a.g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r2, r0)
            throw r1
        L_0x024d:
            r1 = move-exception
            r14.e()
            int r2 = r14.m
            if (r2 > 0) goto L_0x025b
            int r2 = r2 + 1
            r14.m = r2
            goto L_0x0002
        L_0x025b:
            com.alipay.a.a.a.a.g r0 = new com.alipay.a.a.a.a.g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r2, r1)
            throw r0
        L_0x0269:
            r0 = move-exception
            r14.e()
            com.alipay.a.a.a.a.j r1 = r14.c
            r1.a()
            com.alipay.a.a.a.a.g r1 = new com.alipay.a.a.a.a.g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r2, r0)
            throw r1
        L_0x0280:
            r0 = move-exception
            r14.e()
            com.alipay.a.a.a.a.j r1 = r14.c
            r1.a()
            com.alipay.a.a.a.a.g r1 = new com.alipay.a.a.a.a.g
            r2 = 9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r2, r0)
            throw r1
        L_0x0299:
            r0 = move-exception
            r14.e()
            com.alipay.a.a.a.a.j r1 = r14.c
            r1.a()
            com.alipay.a.a.a.a.g r1 = new com.alipay.a.a.a.a.g
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r2, r0)
            throw r1
        L_0x02b2:
            r0 = move-exception
            r14.e()
            com.alipay.a.a.a.a.j r1 = r14.c
            r1.a()
            com.alipay.a.a.a.a.g r1 = new com.alipay.a.a.a.a.g
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r2, r0)
            throw r1
        L_0x02ca:
            r0 = move-exception
            r14.e()
            com.alipay.a.a.a.a.j r1 = r14.c
            r1.a()
            com.alipay.a.a.a.a.g r1 = new com.alipay.a.a.a.a.g
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r2, r0)
            throw r1
        L_0x02e2:
            r0 = move-exception
            r14.e()
            com.alipay.a.a.a.a.j r2 = r14.c
            r2.a()
            com.alipay.a.a.a.a.g r2 = new com.alipay.a.a.a.a.g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.<init>(r1, r0)
            throw r2
        L_0x02f9:
            r0 = move-exception
            r14.e()
            com.alipay.a.a.a.a.j r2 = r14.c
            r2.a()
            com.alipay.a.a.a.a.g r2 = new com.alipay.a.a.a.a.g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.<init>(r1, r0)
            throw r2
        L_0x0310:
            r0 = move-exception
            r14.e()
            com.alipay.a.a.a.a.j r1 = r14.c
            r1.a()
            com.alipay.a.a.a.a.g r1 = new com.alipay.a.a.a.a.g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r2, r0)
            throw r1
        L_0x0327:
            r0 = move-exception
            r14.e()
            com.alipay.a.a.a.a.j r1 = r14.c
            r1.a()
            com.alipay.a.a.a.a.g r1 = new com.alipay.a.a.a.a.g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r2, r0)
            throw r1
        L_0x033e:
            r0 = move-exception
            r14.e()
            com.alipay.a.a.a.a.j r1 = r14.c
            r1.a()
            com.alipay.a.a.a.a.g r1 = new com.alipay.a.a.a.a.g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.<init>(r2, r0)
            throw r1
        L_0x0355:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.Throwable r0 = r0.getCause()
            java.lang.String r2 = "Url parser error!"
            r1.<init>(r2, r0)
            throw r1
        L_0x0362:
            r0 = move-exception
            r14.e()
            goto L_0x0368
        L_0x0367:
            throw r0
        L_0x0368:
            goto L_0x0367
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.a.a.a.a.l.call():com.alipay.a.a.a.a.p");
    }

    private void e() {
        HttpUriRequest httpUriRequest = this.f;
        if (httpUriRequest != null) {
            httpUriRequest.abort();
        }
    }

    private String f() {
        if (!TextUtils.isEmpty(this.q)) {
            return this.q;
        }
        String a2 = this.c.a("operationType");
        this.q = a2;
        return a2;
    }

    private int g() {
        URL h2 = h();
        return h2.getPort() == -1 ? h2.getDefaultPort() : h2.getPort();
    }

    private URL h() {
        URL url = this.l;
        if (url != null) {
            return url;
        }
        URL url2 = new URL(this.c.f9240a);
        this.l = url2;
        return url2;
    }

    private static HashMap<String, String> a(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        for (String str2 : str.split(";")) {
            String[] split = str2.indexOf(61) == -1 ? new String[]{"Content-Type", str2} : str2.split(SimpleComparison.EQUAL_TO_OPERATION);
            hashMap.put(split[0], split[1]);
        }
        return hashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a3 A[SYNTHETIC, Splitter:B:23:0x00a3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.alipay.a.a.a.a.p a(org.apache.http.HttpResponse r11, int r12, java.lang.String r13) {
        /*
            r10 = this;
            java.lang.String r0 = "ArrayOutputStream close error!"
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.getId()
            org.apache.http.HttpEntity r1 = r11.getEntity()
            r2 = 0
            if (r1 == 0) goto L_0x00b3
            org.apache.http.StatusLine r3 = r11.getStatusLine()
            int r3 = r3.getStatusCode()
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 != r4) goto L_0x00b3
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.getId()
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00a0 }
            r3.<init>()     // Catch:{ all -> 0x00a0 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x009d }
            r10.a(r1, r3)     // Catch:{ all -> 0x009d }
            byte[] r1 = r3.toByteArray()     // Catch:{ all -> 0x009d }
            r6 = 0
            r10.f9243o = r6     // Catch:{ all -> 0x009d }
            com.alipay.a.a.a.a.h r6 = r10.f9242a     // Catch:{ all -> 0x009d }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x009d }
            long r7 = r7 - r4
            long r4 = r6.e     // Catch:{ all -> 0x009d }
            long r4 = r4 + r7
            r6.e = r4     // Catch:{ all -> 0x009d }
            com.alipay.a.a.a.a.h r4 = r10.f9242a     // Catch:{ all -> 0x009d }
            int r5 = r1.length     // Catch:{ all -> 0x009d }
            long r5 = (long) r5     // Catch:{ all -> 0x009d }
            long r7 = r4.c     // Catch:{ all -> 0x009d }
            long r7 = r7 + r5
            r4.c = r7     // Catch:{ all -> 0x009d }
            com.alipay.a.a.a.a.k r4 = new com.alipay.a.a.a.a.k     // Catch:{ all -> 0x009d }
            com.alipay.a.a.a.a.i r5 = a((org.apache.http.HttpResponse) r11)     // Catch:{ all -> 0x009d }
            r4.<init>(r5, r12, r13, r1)     // Catch:{ all -> 0x009d }
            long r12 = b(r11)     // Catch:{ all -> 0x009d }
            org.apache.http.HttpEntity r11 = r11.getEntity()     // Catch:{ all -> 0x009d }
            org.apache.http.Header r11 = r11.getContentType()     // Catch:{ all -> 0x009d }
            if (r11 == 0) goto L_0x007f
            java.lang.String r11 = r11.getValue()     // Catch:{ all -> 0x009d }
            java.util.HashMap r11 = a((java.lang.String) r11)     // Catch:{ all -> 0x009d }
            java.lang.String r1 = "charset"
            java.lang.Object r1 = r11.get(r1)     // Catch:{ all -> 0x009d }
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x009d }
            java.lang.String r1 = "Content-Type"
            java.lang.Object r11 = r11.get(r1)     // Catch:{ all -> 0x009d }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x009d }
            r9 = r2
            r2 = r11
            r11 = r9
            goto L_0x0080
        L_0x007f:
            r11 = r2
        L_0x0080:
            r4.a(r2)     // Catch:{ all -> 0x009d }
            r4.c = r11     // Catch:{ all -> 0x009d }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x009d }
            r4.f9241a = r1     // Catch:{ all -> 0x009d }
            r4.b = r12     // Catch:{ all -> 0x009d }
            r3.close()     // Catch:{ IOException -> 0x0092 }
            r2 = r4
            goto L_0x00bc
        L_0x0092:
            r11 = move-exception
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.Throwable r11 = r11.getCause()
            r12.<init>(r0, r11)
            throw r12
        L_0x009d:
            r11 = move-exception
            r2 = r3
            goto L_0x00a1
        L_0x00a0:
            r11 = move-exception
        L_0x00a1:
            if (r2 == 0) goto L_0x00b2
            r2.close()     // Catch:{ IOException -> 0x00a7 }
            goto L_0x00b2
        L_0x00a7:
            r11 = move-exception
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.Throwable r11 = r11.getCause()
            r12.<init>(r0, r11)
            throw r12
        L_0x00b2:
            throw r11
        L_0x00b3:
            if (r1 != 0) goto L_0x00bc
            org.apache.http.StatusLine r11 = r11.getStatusLine()
            r11.getStatusCode()
        L_0x00bc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.a.a.a.a.l.a(org.apache.http.HttpResponse, int, java.lang.String):com.alipay.a.a.a.a.p");
    }

    private static i a(HttpResponse httpResponse) {
        i iVar = new i();
        for (Header header : httpResponse.getAllHeaders()) {
            iVar.f9239a.put(header.getName(), header.getValue());
        }
        return iVar;
    }

    private static long b(HttpResponse httpResponse) {
        Header firstHeader = httpResponse.getFirstHeader("Cache-Control");
        if (firstHeader != null) {
            String[] split = firstHeader.getValue().split(SimpleComparison.EQUAL_TO_OPERATION);
            if (split.length >= 2) {
                try {
                    return a(split);
                } catch (NumberFormatException unused) {
                }
            }
        }
        Header firstHeader2 = httpResponse.getFirstHeader(HttpHeaders.EXPIRES);
        if (firstHeader2 != null) {
            return b.b(firstHeader2.getValue()) - System.currentTimeMillis();
        }
        return 0;
    }

    private static long a(String[] strArr) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if ("max-age".equalsIgnoreCase(strArr[i2])) {
                int i3 = i2 + 1;
                if (strArr[i3] != null) {
                    try {
                        return Long.parseLong(strArr[i3]);
                    } catch (Exception unused) {
                    }
                } else {
                    continue;
                }
            }
        }
        return 0;
    }

    public final j a() {
        return this.c;
    }

    private void a(HttpEntity httpEntity, OutputStream outputStream) {
        InputStream a2 = b.a(httpEntity);
        long contentLength = httpEntity.getContentLength();
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int read = a2.read(bArr);
                if (read == -1 || this.c.f) {
                    outputStream.flush();
                } else {
                    outputStream.write(bArr, 0, read);
                    if (this.c.a() != null) {
                        int i2 = (contentLength > 0 ? 1 : (contentLength == 0 ? 0 : -1));
                    }
                }
            }
            outputStream.flush();
            m.a(a2);
        } catch (Exception e2) {
            e2.getCause();
            StringBuilder sb = new StringBuilder("HttpWorker Request Error!");
            sb.append(e2.getLocalizedMessage());
            throw new IOException(sb.toString());
        } catch (Throwable th) {
            m.a(a2);
            throw th;
        }
    }

    private CookieManager i() {
        CookieManager cookieManager = this.i;
        if (cookieManager != null) {
            return cookieManager;
        }
        CookieManager instance = CookieManager.getInstance();
        this.i = instance;
        return instance;
    }
}
