package com.alipay.a.a.a.a;

import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocket;
import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import com.alipay.mobile.verifyidentity.business.securitycommon.widget.ConvertUtils;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.net.URI;
import java.security.Security;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultRedirectHandler;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;

public final class b implements HttpClient {

    /* renamed from: a  reason: collision with root package name */
    public static long f9229a = 160;
    private static String[] c = {"text/", "application/xml", "application/json"};
    /* access modifiers changed from: private */
    public static final HttpRequestInterceptor d = new HttpRequestInterceptor() {
        public final void process(HttpRequest httpRequest, HttpContext httpContext) {
            if (Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper()) {
                throw new RuntimeException("This thread forbids HTTP requests");
            }
        }
    };
    final HttpClient b;
    private RuntimeException e = new IllegalStateException("AndroidHttpClient created and never closed");
    /* access modifiers changed from: private */
    public volatile C0071b f;

    /* renamed from: com.alipay.a.a.a.a.b$b  reason: collision with other inner class name */
    static class C0071b {

        /* renamed from: a  reason: collision with root package name */
        final String f10646a;
        final int b;
    }

    private b(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.b = new DefaultHttpClient(clientConnectionManager, httpParams) {
            /* access modifiers changed from: protected */
            public final BasicHttpProcessor createHttpProcessor() {
                BasicHttpProcessor createHttpProcessor = b.super.createHttpProcessor();
                createHttpProcessor.addRequestInterceptor(b.d);
                createHttpProcessor.addRequestInterceptor(new a(b.this, (byte) 0));
                return createHttpProcessor;
            }

            /* access modifiers changed from: protected */
            public final HttpContext createHttpContext() {
                BasicHttpContext basicHttpContext = new BasicHttpContext();
                basicHttpContext.setAttribute("http.authscheme-registry", getAuthSchemes());
                basicHttpContext.setAttribute("http.cookiespec-registry", getCookieSpecs());
                basicHttpContext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
                return basicHttpContext;
            }

            /* access modifiers changed from: protected */
            public final RedirectHandler createRedirectHandler() {
                return new DefaultRedirectHandler() {

                    /* renamed from: a  reason: collision with root package name */
                    int f10643a;

                    public final boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext) {
                        int statusCode;
                        this.f10643a++;
                        boolean isRedirectRequested = AnonymousClass2.super.isRedirectRequested(httpResponse, httpContext);
                        if (isRedirectRequested || this.f10643a >= 5 || ((statusCode = httpResponse.getStatusLine().getStatusCode()) != 301 && statusCode != 302)) {
                            return isRedirectRequested;
                        }
                        return true;
                    }
                };
            }

            /* access modifiers changed from: protected */
            public final ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy() {
                return new ConnectionKeepAliveStrategy() {
                    public final long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
                        return 180000;
                    }
                };
            }
        };
    }

    public static void a(HttpRequest httpRequest) {
        httpRequest.addHeader(HttpHeaders.ACCEPT_ENCODING, HeaderConstant.HEADER_VALUE_CONTENT_ENCODING_GZIP);
    }

    public static void b(HttpRequest httpRequest) {
        httpRequest.addHeader(HttpHeaders.CONNECTION, "Keep-Alive");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r2 = (r2 = r2.getContentEncoding()).getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.InputStream a(org.apache.http.HttpEntity r2) {
        /*
            java.io.InputStream r0 = r2.getContent()
            if (r0 != 0) goto L_0x0007
            return r0
        L_0x0007:
            org.apache.http.Header r2 = r2.getContentEncoding()
            if (r2 != 0) goto L_0x000e
            return r0
        L_0x000e:
            java.lang.String r2 = r2.getValue()
            if (r2 != 0) goto L_0x0015
            return r0
        L_0x0015:
            java.lang.String r1 = "gzip"
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L_0x0023
            java.util.zip.GZIPInputStream r2 = new java.util.zip.GZIPInputStream
            r2.<init>(r0)
            r0 = r2
        L_0x0023:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.a.a.a.a.b.a(org.apache.http.HttpEntity):java.io.InputStream");
    }

    public final HttpParams getParams() {
        return this.b.getParams();
    }

    public final ClientConnectionManager getConnectionManager() {
        return this.b.getConnectionManager();
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest) {
        return this.b.execute(httpUriRequest);
    }

    public final HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return this.b.execute(httpUriRequest, httpContext);
    }

    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        return this.b.execute(httpHost, httpRequest);
    }

    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return this.b.execute(httpHost, httpRequest, httpContext);
    }

    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) {
        return this.b.execute(httpUriRequest, responseHandler);
    }

    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return this.b.execute(httpUriRequest, responseHandler, httpContext);
    }

    public final <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return this.b.execute(httpHost, httpRequest, responseHandler);
    }

    public final <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return this.b.execute(httpHost, httpRequest, responseHandler, httpContext);
    }

    public static AbstractHttpEntity a(byte[] bArr) {
        if (((long) bArr.length) < f9229a) {
            return new ByteArrayEntity(bArr);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        AbstractHttpEntity byteArrayEntity = new ByteArrayEntity(byteArrayOutputStream.toByteArray());
        byteArrayEntity.setContentEncoding(HeaderConstant.HEADER_VALUE_CONTENT_ENCODING_GZIP);
        byteArrayEntity.getContentLength();
        return byteArrayEntity;
    }

    class a implements HttpRequestInterceptor {
        private a() {
        }

        /* synthetic */ a(b bVar, byte b) {
            this();
        }

        public final void process(HttpRequest httpRequest, HttpContext httpContext) {
            C0071b a2 = b.this.f;
            if (a2 != null && Log.isLoggable(a2.f10646a, a2.b) && (httpRequest instanceof HttpUriRequest)) {
                b.a((HttpUriRequest) httpRequest);
            }
        }
    }

    private static boolean b(HttpUriRequest httpUriRequest) {
        Header[] headers = httpUriRequest.getHeaders("content-encoding");
        if (headers != null) {
            for (Header value : headers) {
                if (HeaderConstant.HEADER_VALUE_CONTENT_ENCODING_GZIP.equalsIgnoreCase(value.getValue())) {
                    return true;
                }
            }
        }
        Header[] headers2 = httpUriRequest.getHeaders("content-type");
        if (headers2 != null) {
            for (Header header : headers2) {
                for (String startsWith : c) {
                    if (header.getValue().startsWith(startsWith)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static long b(String str) {
        return f.a(str);
    }

    public static b a(String str) {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setUseExpectContinue(basicHttpParams, false);
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, true);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 20000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        HttpClientParams.setRedirecting(basicHttpParams, true);
        HttpClientParams.setAuthenticating(basicHttpParams, false);
        HttpProtocolParams.setUserAgent(basicHttpParams, str);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme("https", SSLCertificateSocketFactory.getHttpSocketFactory(30000, (SSLSessionCache) null), WebSocket.DEFAULT_WSS_PORT));
        ThreadSafeClientConnManager threadSafeClientConnManager = new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry);
        ConnManagerParams.setTimeout(basicHttpParams, DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(10));
        ConnManagerParams.setMaxTotalConnections(basicHttpParams, 50);
        Security.setProperty("networkaddress.cache.ttl", "-1");
        HttpsURLConnection.setDefaultHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        return new b(threadSafeClientConnManager, basicHttpParams);
    }

    static /* synthetic */ String a(HttpUriRequest httpUriRequest) {
        HttpEntity entity;
        StringBuilder sb = new StringBuilder();
        sb.append("curl ");
        for (Header header : httpUriRequest.getAllHeaders()) {
            if (!header.getName().equals(HttpHeaders.AUTHORIZATION) && !header.getName().equals("Cookie")) {
                sb.append("--header \"");
                sb.append(header.toString().trim());
                sb.append("\" ");
            }
        }
        URI uri = httpUriRequest.getURI();
        if (httpUriRequest instanceof RequestWrapper) {
            HttpUriRequest original = ((RequestWrapper) httpUriRequest).getOriginal();
            if (original instanceof HttpUriRequest) {
                uri = original.getURI();
            }
        }
        sb.append("\"");
        sb.append(uri);
        sb.append("\"");
        if ((httpUriRequest instanceof HttpEntityEnclosingRequest) && (entity = ((HttpEntityEnclosingRequest) httpUriRequest).getEntity()) != null && entity.isRepeatable()) {
            if (entity.getContentLength() < ConvertUtils.KB) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                entity.writeTo(byteArrayOutputStream);
                if (b(httpUriRequest)) {
                    String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                    StringBuilder sb2 = new StringBuilder("echo '");
                    sb2.append(encodeToString);
                    sb2.append("' | base64 -d > /tmp/$$.bin; ");
                    sb.insert(0, sb2.toString());
                    sb.append(" --data-binary @/tmp/$$.bin");
                } else {
                    String obj = byteArrayOutputStream.toString();
                    sb.append(" --data-ascii \"");
                    sb.append(obj);
                    sb.append("\"");
                }
            } else {
                sb.append(" [TOO MUCH DATA TO INCLUDE]");
            }
        }
        return sb.toString();
    }
}
