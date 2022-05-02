package com.iap.ac.android.rpc.http.impl;

import android.content.Context;
import android.os.Build;
import android.security.KeyChain;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.interfaces.AbstractHttpTransport;
import com.iap.ac.android.common.rpc.interfaces.HttpsTransportEventListener;
import com.iap.ac.android.common.rpc.model.HttpMethod;
import com.iap.ac.android.common.rpc.model.HttpRequest;
import com.iap.ac.android.common.rpc.model.HttpResponse;
import com.iap.ac.android.rpc.http.error.HttpError;
import com.iap.ac.android.rpc.http.utils.HttpTransportUtils;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import kotlin.text.Typography;

public class HttpUrlTransport implements AbstractHttpTransport {
    public static final String DEFAULT_CONTENT_TYPE = "application/x-www-form-urlencoded";
    public static final int DEFAULT_TIMEOUT_MS = 30000;
    public static final String HEADER_ACCEPT_LANGUAGE = "Accept-Language";
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    private static final String PROTOCOL_HTTPS = "https";
    private static final String TAG = HttpTransportUtils.logTag("HttpUrlTransport");
    private static char[] getMax = null;
    private static int getMin = 0;
    private static int setMin = 1;
    @Nullable
    private CookieManager cookieManager;
    private HttpsTransportEventListener httpsTransportEventListener = new HttpsTransportEventListener() {
        public void onConnect(HttpsURLConnection httpsURLConnection) {
        }
    };
    private boolean mEnableCache;

    static void getMax() {
        getMax = new char[]{'.', '[', 'T', '@', '9'};
    }

    static {
        getMax();
        int i = getMin + 117;
        setMin = i % 128;
        if (i % 2 == 0) {
            int i2 = 89 / 0;
        }
    }

    public HttpUrlTransport(boolean z, Context context) {
        this.mEnableCache = z;
        this.cookieManager = CookieManager.getInstance();
        if (Build.VERSION.SDK_INT < 21) {
            try {
                CookieSyncManager.createInstance(context).sync();
                int i = getMin + 115;
                setMin = i % 128;
                if ((i % 2 == 0 ? Typography.quote : Typography.less) != '<') {
                    Object obj = null;
                    super.hashCode();
                    return;
                }
                return;
            } catch (Throwable th) {
                ACLog.w(TAG, "Take it easy. just try initialize compatible with exception: ", th);
            }
        }
        try {
            int i2 = getMin + 97;
            setMin = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    @Nullable
    public HttpResponse performRequest(@NonNull HttpRequest httpRequest) throws Exception {
        int i;
        HttpResponse httpResponse;
        int i2 = getMin + 3;
        setMin = i2 % 128;
        int i3 = i2 % 2;
        ACLog.v(TAG, "performRequest request = ".concat(String.valueOf(httpRequest)));
        if (!TextUtils.isEmpty(httpRequest.url)) {
            try {
                URL url = new URL(httpRequest.url);
                HttpURLConnection openConnection = openConnection(url, httpRequest);
                addHeaders(openConnection, httpRequest.headers);
                addHeaderCookie(openConnection, url);
                addHeaderAcceptLanguage(openConnection);
                setConnectionRequestType(openConnection, httpRequest.method, httpRequest.data);
                try {
                    i = openConnection.getResponseCode();
                    int i4 = setMin + 119;
                    getMin = i4 % 128;
                    int i5 = i4 % 2;
                } catch (IOException e) {
                    ACLog.d(TAG, e.getMessage());
                    i = openConnection.getResponseCode();
                }
                if (i == -1) {
                    int i6 = getMin + 41;
                    setMin = i6 % 128;
                    int i7 = i6 % 2;
                    throw HttpTransportUtils.createException(HttpError.RetrieveStatusCodeError, "Could not retrieve response code from HttpUrlConnection.");
                }
                String responseMessage = openConnection.getResponseMessage();
                if (hasResponseBody(i)) {
                    httpResponse = new HttpResponse(i, responseMessage, getContent(openConnection), openConnection.getHeaderFields());
                } else {
                    httpResponse = new HttpResponse(i, responseMessage, (byte[]) null, openConnection.getHeaderFields());
                }
                setCookie(openConnection);
                ACLog.v(TAG, "performRequest response = ".concat(String.valueOf(httpResponse)));
                return httpResponse;
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            throw HttpTransportUtils.createException(HttpError.UrlIsEmpty, "request.url is empty!");
        }
    }

    private HttpURLConnection openConnection(@NonNull URL url, @NonNull HttpRequest httpRequest) throws IOException, NoSuchAlgorithmException, KeyManagementException {
        int i = setMin + 69;
        getMin = i % 128;
        int i2 = i % 2;
        HttpURLConnection createConnection = createConnection(url);
        if (httpRequest.timeoutMilliseconds <= 0) {
            httpRequest.timeoutMilliseconds = 30000;
        }
        createConnection.setConnectTimeout(httpRequest.timeoutMilliseconds);
        createConnection.setReadTimeout(httpRequest.timeoutMilliseconds);
        createConnection.setUseCaches(this.mEnableCache);
        createConnection.setDefaultUseCaches(this.mEnableCache);
        boolean z = true;
        createConnection.setDoInput(true);
        boolean z2 = false;
        if (!(httpRequest.notFollowRedirects)) {
            int i3 = getMin + 115;
            setMin = i3 % 128;
            if (i3 % 2 == 0) {
                z = false;
            }
            z2 = z;
        }
        try {
            createConnection.setInstanceFollowRedirects(z2);
            if ((PROTOCOL_HTTPS.equals(url.getProtocol()) ? '?' : 'N') != 'N') {
                int i4 = setMin + 117;
                getMin = i4 % 128;
                int i5 = i4 % 2;
                ACLog.i(TAG, "Https protocol, will set SSLContext.");
                SSLContext instance = SSLContext.getInstance("TLS");
                instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
                ((HttpsURLConnection) createConnection).setSSLSocketFactory(instance.getSocketFactory());
                ACLog.i(TAG, "Https protocol, set SSLContext & SSLSocketFactory successfully.");
            }
            return createConnection;
        } catch (Exception e) {
            throw e;
        }
    }

    private static void addHeaders(@NonNull HttpURLConnection httpURLConnection, @Nullable Map<String, ?> map) {
        int i = getMin + 21;
        setMin = i % 128;
        int i2 = i % 2;
        if (map == null) {
            int i3 = setMin + 103;
            getMin = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
        while (true) {
            if ((it.hasNext() ? ' ' : 29) != 29) {
                int i5 = getMin + 51;
                setMin = i5 % 128;
                int i6 = i5 % 2;
                Map.Entry next = it.next();
                String str = (String) next.getKey();
                if (!(!TextUtils.isEmpty(httpURLConnection.getRequestProperty(str)))) {
                    httpURLConnection.addRequestProperty(str, String.valueOf(next.getValue()));
                }
            } else {
                return;
            }
        }
    }

    private void addHeaderCookie(@NonNull HttpURLConnection httpURLConnection, URL url) {
        int i = getMin + 101;
        setMin = i % 128;
        int i2 = i % 2;
        try {
            if (!(this.cookieManager == null)) {
                String cookie = this.cookieManager.getCookie(url.toString());
                if ((!TextUtils.isEmpty(cookie) ? 19 : 'H') == 19) {
                    httpURLConnection.addRequestProperty("Cookie", cookie);
                }
                int i3 = setMin + 83;
                getMin = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 40 / 0;
                    return;
                }
                return;
            }
            ACLog.e(TAG, "cookieManager is null!");
        } catch (Exception e) {
            throw e;
        }
    }

    private static void addHeaderAcceptLanguage(@NonNull HttpURLConnection httpURLConnection) {
        int i = setMin + 9;
        getMin = i % 128;
        int i2 = i % 2;
        if (!(!TextUtils.isEmpty(httpURLConnection.getRequestProperty("Accept-Language")))) {
            httpURLConnection.addRequestProperty("Accept-Language", HttpTransportUtils.getLanguage());
            int i3 = getMin + 39;
            setMin = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    private void setConnectionRequestType(@NonNull HttpURLConnection httpURLConnection, @Nullable HttpMethod httpMethod, @Nullable String str) throws IOException {
        int i = setMin + 17;
        getMin = i % 128;
        int i2 = i % 2;
        boolean z = false;
        Object obj = null;
        if (!(httpMethod != null)) {
            int i3 = getMin + 119;
            setMin = i3 % 128;
            if (!(i3 % 2 == 0)) {
                httpMethod = HttpMethod.GET;
            } else {
                httpMethod = HttpMethod.GET;
                super.hashCode();
            }
        }
        httpURLConnection.setRequestMethod(httpMethod.method);
        if (httpMethod != HttpMethod.POST) {
            int i4 = getMin + 51;
            setMin = i4 % 128;
            if (i4 % 2 == 0) {
                HttpMethod httpMethod2 = HttpMethod.PUT;
                super.hashCode();
                if (httpMethod != httpMethod2) {
                    z = true;
                }
                if (z) {
                    return;
                }
            } else if (httpMethod != HttpMethod.PUT) {
                return;
            }
        }
        if ((!TextUtils.isEmpty(str) ? ']' : Typography.greater) == ']') {
            addBody(httpURLConnection, str.getBytes(setMax(new int[]{0, 5, 7, 0}, new byte[]{0, 1, 0, 1, 1}, KeyChain.isKeyAlgorithmSupported("")).intern()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if ((r5 >= 29311 ? '4' : 'J') != '4') goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r5 >= 200) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean hasResponseBody(int r5) {
        /*
            r4 = this;
            int r0 = setMin     // Catch:{ Exception -> 0x0059 }
            int r0 = r0 + 79
            int r1 = r0 % 128
            getMin = r1     // Catch:{ Exception -> 0x0059 }
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            if (r0 == r2) goto L_0x0021
            r0 = 29311(0x727f, float:4.1073E-41)
            r3 = 52
            if (r5 < r0) goto L_0x001c
            r0 = 52
            goto L_0x001e
        L_0x001c:
            r0 = 74
        L_0x001e:
            if (r0 == r3) goto L_0x0025
            goto L_0x0058
        L_0x0021:
            r0 = 200(0xc8, float:2.8E-43)
            if (r5 < r0) goto L_0x0058
        L_0x0025:
            r0 = 204(0xcc, float:2.86E-43)
            r3 = 13
            if (r5 == r0) goto L_0x002e
            r0 = 13
            goto L_0x0030
        L_0x002e:
            r0 = 58
        L_0x0030:
            if (r0 == r3) goto L_0x0033
            goto L_0x0058
        L_0x0033:
            int r0 = setMin
            int r0 = r0 + 67
            int r3 = r0 % 128
            getMin = r3
            int r0 = r0 % 2
            r0 = 304(0x130, float:4.26E-43)
            if (r5 == r0) goto L_0x0058
            int r5 = setMin
            int r5 = r5 + 11
            int r0 = r5 % 128
            getMin = r0
            int r5 = r5 % 2
            int r5 = getMin     // Catch:{ Exception -> 0x0056 }
            int r5 = r5 + 39
            int r0 = r5 % 128
            setMin = r0     // Catch:{ Exception -> 0x0059 }
            int r5 = r5 % 2
            return r2
        L_0x0056:
            r5 = move-exception
            throw r5
        L_0x0058:
            return r1
        L_0x0059:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.rpc.http.impl.HttpUrlTransport.hasResponseBody(int):boolean");
    }

    @Nullable
    private byte[] getContent(@NonNull HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream;
        int i = setMin + 115;
        getMin = i % 128;
        if ((i % 2 != 0 ? '8' : 1) != '8') {
            try {
                inputStream = httpURLConnection.getInputStream();
            } catch (IOException unused) {
                inputStream = httpURLConnection.getErrorStream();
            }
        } else {
            int i2 = 48 / 0;
            inputStream = httpURLConnection.getInputStream();
        }
        try {
            int i3 = setMin + 111;
            getMin = i3 % 128;
            int i4 = i3 % 2;
            try {
                return HttpTransportUtils.readBytes(inputStream);
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private void setCookie(@NonNull HttpURLConnection httpURLConnection) {
        int i = getMin + 79;
        setMin = i % 128;
        int i2 = i % 2;
        Object[] objArr = null;
        if ((this.cookieManager == null ? '-' : 16) != 16) {
            int i3 = setMin + 47;
            getMin = i3 % 128;
            if (i3 % 2 != 0) {
                ACLog.e(TAG, "cookieManager is null!");
                super.hashCode();
                return;
            }
            ACLog.e(TAG, "cookieManager is null!");
            return;
        }
        try {
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            List list = headerFields.get("Set-Cookie");
            List list2 = headerFields.get(HttpHeaders.SET_COOKIE2);
            String obj = httpURLConnection.getURL().toString();
            ArrayList<String> arrayList = new ArrayList<>();
            if (list != null) {
                arrayList.addAll(list);
            }
            if (list2 != null) {
                int i4 = setMin + 5;
                getMin = i4 % 128;
                if (!(i4 % 2 != 0)) {
                    arrayList.addAll(list2);
                } else {
                    arrayList.addAll(list2);
                    int length = objArr.length;
                }
            }
            for (String cookie : arrayList) {
                this.cookieManager.setCookie(obj, cookie);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                int i5 = setMin + 123;
                getMin = i5 % 128;
                int i6 = i5 % 2;
                try {
                    this.cookieManager.flush();
                } catch (Exception e) {
                    throw e;
                }
            } else {
                CookieSyncManager.getInstance().sync();
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private HttpURLConnection createConnection(URL url) throws IOException {
        HttpURLConnection httpURLConnection;
        int i = setMin + 53;
        getMin = i % 128;
        if ((i % 2 != 0 ? 25 : '2') != '2') {
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
            Object[] objArr = null;
            int length = objArr.length;
        } else {
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        }
        int i2 = getMin + 5;
        setMin = i2 % 128;
        int i3 = i2 % 2;
        return httpURLConnection;
    }

    private void addBody(@NonNull HttpURLConnection httpURLConnection, @NonNull byte[] bArr) throws IOException {
        int i = getMin + 77;
        setMin = i % 128;
        int i2 = i % 2;
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.setDoOutput(true);
        if ((TextUtils.isEmpty(httpURLConnection.getRequestProperty("Content-Type")) ? 30 : 'a') == 30) {
            httpURLConnection.addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        }
        httpURLConnection.connect();
        if (httpURLConnection instanceof HttpsURLConnection) {
            try {
                this.httpsTransportEventListener.onConnect((HttpsURLConnection) httpURLConnection);
            } catch (Exception e) {
                throw e;
            }
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
        try {
            int i3 = getMin + 3;
            setMin = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public void setEventListener(@NonNull HttpsTransportEventListener httpsTransportEventListener2) {
        try {
            int i = setMin + 91;
            getMin = i % 128;
            int i2 = i % 2;
            this.httpsTransportEventListener = httpsTransportEventListener2;
            int i3 = getMin + 5;
            setMin = i3 % 128;
            if ((i3 % 2 == 0 ? (char) 31 : 28) != 28) {
                Object[] objArr = null;
                int length = objArr.length;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    private static String setMax(int[] iArr, byte[] bArr, boolean z) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = new char[i2];
        System.arraycopy(getMax, i, cArr, 0, i2);
        if (bArr != null) {
            char[] cArr2 = new char[i2];
            char c = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                if (!(bArr[i5] != 1)) {
                    try {
                        int i6 = getMin + 7;
                        setMin = i6 % 128;
                        int i7 = i6 % 2;
                        cArr2[i5] = (char) (((cArr[i5] << 1) + 1) - c);
                        int i8 = setMin + 47;
                        getMin = i8 % 128;
                        int i9 = i8 % 2;
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    cArr2[i5] = (char) ((cArr[i5] << 1) - c);
                }
                c = cArr2[i5];
            }
            cArr = cArr2;
        }
        if (i4 > 0) {
            int i10 = getMin + 63;
            setMin = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr, 0, cArr3, 0, i2);
            int i12 = i2 - i4;
            System.arraycopy(cArr3, 0, cArr, i12, i4);
            System.arraycopy(cArr3, i4, cArr, 0, i12);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            for (int i13 = 0; i13 < i2; i13++) {
                cArr4[i13] = cArr[(i2 - i13) - 1];
            }
            cArr = cArr4;
        }
        if (i3 > 0) {
            try {
                int i14 = getMin + 19;
                setMin = i14 % 128;
                if (i14 % 2 == 0) {
                }
                int i15 = 0;
                while (true) {
                    if ((i15 < i2 ? 5 : '.') != 5) {
                        break;
                    }
                    int i16 = setMin + 75;
                    getMin = i16 % 128;
                    if (!(i16 % 2 != 0)) {
                        cArr[i15] = (char) (cArr[i15] - iArr[2]);
                        i15++;
                    } else {
                        cArr[i15] = (char) (cArr[i15] / iArr[2]);
                        i15 += 56;
                    }
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        return new String(cArr);
    }
}
