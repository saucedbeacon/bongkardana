package com.alipay.imobile.network.quake.transport.http;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.log.MonitorWrapper;
import com.alipay.imobile.network.quake.Quake;
import com.alipay.imobile.network.quake.Request;
import com.alipay.imobile.network.quake.exception.ClientException;
import com.alipay.imobile.network.quake.exception.ServerException;
import com.alipay.imobile.network.quake.protocol.Protocol;
import com.alipay.imobile.network.quake.request.HttpRequest;
import com.alipay.imobile.network.quake.transport.http.HttpResponse;
import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import com.alipay.mobile.common.rpc.RpcException;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.iap.ac.android.rpc.constant.RpcLogEvent;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public class UrlTransport extends AbstractHttpTransport {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private final a f9386a;
    @Nullable
    private final SSLSocketFactory b;

    public interface a {
        String a(String str);
    }

    public UrlTransport() {
        this.f9386a = null;
        this.b = null;
    }

    public UrlTransport(int i) {
        super(i);
        this.f9386a = null;
        this.b = null;
    }

    public UrlTransport(@Nullable a aVar, @Nullable SSLSocketFactory sSLSocketFactory) {
        this.f9386a = aVar;
        this.b = sSLSocketFactory;
    }

    public UrlTransport(@Nullable a aVar, @Nullable SSLSocketFactory sSLSocketFactory, int i) {
        super(i);
        this.f9386a = aVar;
        this.b = sSLSocketFactory;
    }

    private HttpResponse a(HttpURLConnection httpURLConnection) throws IOException {
        List<String> list;
        int responseCode = httpURLConnection.getResponseCode();
        HttpResponse.Builder builder = new HttpResponse.Builder();
        builder.protocol("HTTP/1.1");
        builder.code(responseCode);
        builder.message(httpURLConnection.getResponseMessage());
        if (a(responseCode)) {
            builder.body(b(httpURLConnection));
        }
        for (Map.Entry next : httpURLConnection.getHeaderFields().entrySet()) {
            if (!(next.getKey() == null || (list = (List) next.getValue()) == null || list.isEmpty())) {
                for (String addHeader : list) {
                    builder.addHeader((String) next.getKey(), addHeader);
                }
            }
        }
        return builder.build();
    }

    private HttpURLConnection a(URL url, Request request) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection a2 = a(url);
        int timeoutMs = request.getTimeoutMs();
        a2.setRequestProperty(HttpHeaders.USER_AGENT, getUserAgent());
        a2.setConnectTimeout(timeoutMs);
        a2.setReadTimeout(timeoutMs);
        a2.setUseCaches(false);
        a2.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.b) != null) {
            ((HttpsURLConnection) a2).setSSLSocketFactory(sSLSocketFactory);
        }
        return a2;
    }

    private static void a(HttpURLConnection httpURLConnection, Request request) throws IOException, RpcException {
        Protocol protocol = request.getProtocol();
        byte[] serialize = protocol.serialize(request);
        if (serialize != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", protocol.getBodyContentType());
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            if (request.isCompressed()) {
                try {
                    byte[] compressedEntity = getCompressedEntity(serialize);
                    if (compressedEntity != null) {
                        httpURLConnection.addRequestProperty("Content-Encoding", HeaderConstant.HEADER_VALUE_CONTENT_ENCODING_GZIP);
                        serialize = compressedEntity;
                    }
                } catch (IOException unused) {
                    throw new ClientException((Integer) 9, "gzip body failed");
                }
            }
            dataOutputStream.write(serialize);
            dataOutputStream.close();
        }
    }

    private static boolean a(int i) {
        return (i < 200 || i == 204 || i == 304) ? false : true;
    }

    private static HttpResponseBody b(HttpURLConnection httpURLConnection) {
        InputStream errorStream;
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (IOException unused) {
            errorStream = httpURLConnection.getErrorStream();
        }
        return new HttpResponseBody(httpURLConnection.getContentType(), (long) httpURLConnection.getContentLength(), httpURLConnection.getContentEncoding(), errorStream);
    }

    public static void setConnectionParametersForRequest(HttpURLConnection httpURLConnection, HttpRequest httpRequest) throws IOException, RpcException {
        switch (httpRequest.getMethod()) {
            case -1:
                Protocol protocol = httpRequest.getProtocol();
                byte[] serialize = protocol.serialize(httpRequest);
                if (serialize != null) {
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.addRequestProperty("Content-Type", protocol.getBodyContentType());
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(serialize);
                    dataOutputStream.close();
                    return;
                }
                return;
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                a(httpURLConnection, (Request) httpRequest);
                return;
            case 2:
                httpURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.PUT);
                a(httpURLConnection, (Request) httpRequest);
                return;
            case 3:
                httpURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.DELETE);
                return;
            case 4:
                httpURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.HEAD);
                return;
            case 5:
                httpURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.OPTIONS);
                return;
            case 6:
                httpURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.TRACE);
                return;
            case 7:
                httpURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.PATCH);
                a(httpURLConnection, (Request) httpRequest);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    /* access modifiers changed from: protected */
    public HttpURLConnection a(URL url) throws IOException {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }

    /* access modifiers changed from: protected */
    public HttpResponse performRequest(Request request, Map<String, String> map) throws IOException, RpcException {
        String url = request.getUrl();
        a aVar = this.f9386a;
        if (aVar != null) {
            String a2 = aVar.a(url);
            if (a2 != null) {
                url = a2;
            } else {
                throw new IOException("URL blocked by rewriter: ".concat(String.valueOf(url)));
            }
        }
        try {
            HttpURLConnection a3 = a(new URL(url), request);
            HashMap hashMap = new HashMap();
            Map<String, String> externalInfo = request.getExternalInfo();
            hashMap.putAll(map);
            hashMap.putAll(externalInfo);
            for (Map.Entry entry : hashMap.entrySet()) {
                a3.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            if (request instanceof HttpRequest) {
                setConnectionParametersForRequest(a3, (HttpRequest) request);
            } else {
                a3.setRequestMethod("POST");
                a(a3, request);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            a3.connect();
            if ((a3 instanceof HttpsURLConnection) && Quake.instance().getSSLPinningManager() != null) {
                Quake.instance().getSSLPinningManager().validateCertificates((HttpsURLConnection) a3);
            }
            int responseCode = a3.getResponseCode();
            HashMap hashMap2 = new HashMap(4);
            hashMap2.put("duration", String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            hashMap2.put(RpcLogEvent.PARAM_KEY_OPERATION_TYPE, request.getActionType());
            request.addSofaId(hashMap2);
            request.addRpcTraceId(hashMap2);
            MonitorWrapper.behaviour("iap_net_cost", hashMap2);
            if (responseCode != -1) {
                return a(a3);
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (MalformedURLException e) {
            StringBuilder sb = new StringBuilder("Illegal url config: ");
            sb.append(e.getMessage());
            throw new ServerException((Integer) 3002, sb.toString());
        }
    }
}
