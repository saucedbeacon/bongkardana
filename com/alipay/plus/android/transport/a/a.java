package com.alipay.plus.android.transport.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.plus.android.transport.sdk.AbstractHttpTransport;
import com.alipay.plus.android.transport.sdk.HttpError;
import com.alipay.plus.android.transport.sdk.HttpRequest;
import com.alipay.plus.android.transport.sdk.HttpResponse;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;

public class a implements AbstractHttpTransport {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10768a = com.alipay.plus.android.transport.b.a.a("HttpUrlTransport");
    private static int length = 0;
    private static char[] setMax = null;
    private static int setMin = 1;
    private boolean b;
    private CookieManager c = new CookieManager();

    static {
        length();
        int i = length + 65;
        setMin = i % 128;
        int i2 = i % 2;
    }

    public a(boolean z) {
        this.b = z;
    }

    private HttpURLConnection a(URL url) throws IOException {
        HttpURLConnection httpURLConnection;
        int i = setMin + 59;
        length = i % 128;
        if ((i % 2 != 0 ? 'K' : '9') != '9') {
            try {
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
                httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
                Object[] objArr = null;
                int length2 = objArr.length;
            } catch (Exception e) {
                throw e;
            }
        } else {
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        }
        int i2 = setMin + 19;
        length = i2 % 128;
        if ((i2 % 2 != 0 ? 'V' : 22) == 22) {
            return httpURLConnection;
        }
        int i3 = 21 / 0;
        return httpURLConnection;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r7.timeoutMilliseconds <= 0) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if ((r7.timeoutMilliseconds <= 0) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.net.HttpURLConnection a(@androidx.annotation.NonNull java.net.URL r6, @androidx.annotation.NonNull com.alipay.plus.android.transport.sdk.HttpRequest r7) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.KeyManagementException {
        /*
            r5 = this;
            int r0 = length
            int r0 = r0 + 55
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0021
            java.net.HttpURLConnection r0 = r5.a((java.net.URL) r6)
            int r3 = r7.timeoutMilliseconds
            r4 = 12
            int r4 = r4 / r1
            if (r3 > 0) goto L_0x001b
            r3 = 1
            goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            if (r3 == 0) goto L_0x002d
            goto L_0x0029
        L_0x001f:
            r6 = move-exception
            throw r6
        L_0x0021:
            java.net.HttpURLConnection r0 = r5.a((java.net.URL) r6)
            int r3 = r7.timeoutMilliseconds
            if (r3 > 0) goto L_0x002d
        L_0x0029:
            r3 = 20000(0x4e20, float:2.8026E-41)
            r7.timeoutMilliseconds = r3
        L_0x002d:
            int r3 = r7.timeoutMilliseconds
            r0.setConnectTimeout(r3)
            int r3 = r7.timeoutMilliseconds
            r0.setReadTimeout(r3)
            boolean r3 = r5.b
            r0.setUseCaches(r3)
            boolean r3 = r5.b
            r0.setDefaultUseCaches(r3)
            r0.setDoInput(r2)
            boolean r7 = r7.notFollowRedirects
            if (r7 != 0) goto L_0x004a
            r7 = 1
            goto L_0x0055
        L_0x004a:
            int r7 = length
            int r7 = r7 + 109
            int r3 = r7 % 128
            setMin = r3
            int r7 = r7 % 2
            r7 = 0
        L_0x0055:
            r0.setInstanceFollowRedirects(r7)     // Catch:{ Exception -> 0x008d }
            java.lang.String r7 = "https"
            java.lang.String r6 = r6.getProtocol()     // Catch:{ Exception -> 0x008b }
            boolean r6 = r7.equals(r6)     // Catch:{ Exception -> 0x008b }
            if (r6 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = 1
        L_0x0066:
            if (r1 == r2) goto L_0x008a
            java.lang.String r6 = f10768a
            java.lang.String r7 = "Https protocol, will set SSLContext."
            com.alipay.iap.android.common.log.LoggerWrapper.i(r6, r7)
            java.lang.String r6 = "TLS"
            javax.net.ssl.SSLContext r6 = javax.net.ssl.SSLContext.getInstance(r6)
            r7 = 0
            r6.init(r7, r7, r7)
            r7 = r0
            javax.net.ssl.HttpsURLConnection r7 = (javax.net.ssl.HttpsURLConnection) r7
            javax.net.ssl.SSLSocketFactory r6 = r6.getSocketFactory()
            r7.setSSLSocketFactory(r6)
            java.lang.String r6 = f10768a
            java.lang.String r7 = "Https protocol, set SSLContext & SSLSocketFactory successfully."
            com.alipay.iap.android.common.log.LoggerWrapper.i(r6, r7)
        L_0x008a:
            return r0
        L_0x008b:
            r6 = move-exception
            throw r6
        L_0x008d:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.plus.android.transport.a.a.a(java.net.URL, com.alipay.plus.android.transport.sdk.HttpRequest):java.net.HttpURLConnection");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        if ((r7 == null ? '^' : 27) != 27) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        if ((r7 == null) != true) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(@androidx.annotation.NonNull java.net.HttpURLConnection r6, @androidx.annotation.Nullable com.alipay.plus.android.transport.sdk.HttpMethod r7, @androidx.annotation.Nullable java.lang.String r8) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = setMin
            int r0 = r0 + 109
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r3 = 0
            if (r0 == 0) goto L_0x0025
            super.hashCode()     // Catch:{ all -> 0x0023 }
            r0 = 27
            if (r7 != 0) goto L_0x001e
            r4 = 94
            goto L_0x0020
        L_0x001e:
            r4 = 27
        L_0x0020:
            if (r4 == r0) goto L_0x0039
            goto L_0x002d
        L_0x0023:
            r6 = move-exception
            throw r6
        L_0x0025:
            if (r7 != 0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            if (r0 == r2) goto L_0x002d
            goto L_0x0039
        L_0x002d:
            int r7 = setMin
            int r7 = r7 + 67
            int r0 = r7 % 128
            length = r0
            int r7 = r7 % 2
            com.alipay.plus.android.transport.sdk.HttpMethod r7 = com.alipay.plus.android.transport.sdk.HttpMethod.GET
        L_0x0039:
            java.lang.String r0 = r7.method
            r6.setRequestMethod(r0)
            com.alipay.plus.android.transport.sdk.HttpMethod r0 = com.alipay.plus.android.transport.sdk.HttpMethod.POST
            if (r7 == r0) goto L_0x0046
            com.alipay.plus.android.transport.sdk.HttpMethod r0 = com.alipay.plus.android.transport.sdk.HttpMethod.PUT
            if (r7 != r0) goto L_0x0095
        L_0x0046:
            boolean r7 = android.text.TextUtils.isEmpty(r8)
            if (r7 != 0) goto L_0x0095
            int r7 = length
            int r7 = r7 + r2
            int r0 = r7 % 128
            setMin = r0
            int r7 = r7 % 2
            if (r7 != 0) goto L_0x0058
            r1 = 1
        L_0x0058:
            r7 = 4
            int[] r7 = new int[r7]
            r7 = {0, 5, 83, 5} // fill-array
            if (r1 == 0) goto L_0x0076
            r0 = 114(0x72, float:1.6E-43)
            boolean r0 = android.telephony.PhoneNumberUtils.isDialable(r0)
            java.lang.String r7 = setMin(r7, r3, r0)
            java.lang.String r7 = r7.intern()
            byte[] r7 = r8.getBytes(r7)
            r5.a((java.net.HttpURLConnection) r6, (byte[]) r7)
            goto L_0x008b
        L_0x0076:
            r0 = 48
            boolean r0 = android.telephony.PhoneNumberUtils.isDialable(r0)
            java.lang.String r7 = setMin(r7, r3, r0)
            java.lang.String r7 = r7.intern()
            byte[] r7 = r8.getBytes(r7)
            r5.a((java.net.HttpURLConnection) r6, (byte[]) r7)
        L_0x008b:
            int r6 = setMin
            int r6 = r6 + 87
            int r7 = r6 % 128
            length = r7
            int r6 = r6 % 2
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.plus.android.transport.a.a.a(java.net.HttpURLConnection, com.alipay.plus.android.transport.sdk.HttpMethod, java.lang.String):void");
    }

    private void a(@NonNull HttpURLConnection httpURLConnection, URL url) {
        List<String> list;
        int i = length + 81;
        setMin = i % 128;
        boolean z = false;
        if ((i % 2 == 0 ? '.' : '[') != '.') {
            try {
                list = this.c.get(url.toURI(), Collections.emptyMap()).get("Set-cookie");
                if (list != null) {
                    z = true;
                }
                if (!z) {
                    return;
                }
            } catch (IOException | URISyntaxException e) {
                String str = f10768a;
                StringBuilder sb = new StringBuilder("Saving cookies failed for ");
                sb.append(url.toString());
                LoggerWrapper.w(str, sb.toString(), e);
                return;
            }
        } else {
            list = this.c.get(url.toURI(), Collections.emptyMap()).get("Set-cookie");
            int i2 = 92 / 0;
            if (list == null) {
                return;
            }
        }
        if (!list.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            for (String append : list) {
                sb2.append(append);
                int i3 = length + 103;
                setMin = i3 % 128;
                int i4 = i3 % 2;
            }
            httpURLConnection.addRequestProperty("Cookie", sb2.toString());
            int i5 = length + 51;
            setMin = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static void a(@NonNull HttpURLConnection httpURLConnection, @Nullable Map<String, ?> map) {
        int i = length + 31;
        setMin = i % 128;
        int i2 = i % 2;
        if (map != null) {
            Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
            int i3 = length + 109;
            setMin = i3 % 128;
            while (true) {
                try {
                    int i4 = i3 % 2;
                    if (it.hasNext()) {
                        int i5 = setMin + 77;
                        length = i5 % 128;
                        int i6 = i5 % 2;
                        Map.Entry next = it.next();
                        String str = (String) next.getKey();
                        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty(str))) {
                            httpURLConnection.addRequestProperty(str, String.valueOf(next.getValue()));
                        }
                        try {
                            i3 = setMin + 85;
                            length = i3 % 128;
                        } catch (Exception e) {
                            throw e;
                        }
                    } else {
                        return;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
    }

    private void a(@NonNull HttpURLConnection httpURLConnection, @NonNull byte[] bArr) throws IOException {
        int i = setMin + 45;
        length = i % 128;
        int i2 = i % 2;
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        char c2 = 1;
        httpURLConnection.setDoOutput(true);
        if ((TextUtils.isEmpty(httpURLConnection.getRequestProperty("Content-Type")) ? 10 : '@') == 10) {
            int i3 = length + 109;
            setMin = i3 % 128;
            if (i3 % 2 != 0) {
                c2 = '*';
            }
            httpURLConnection.addRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            if (c2 != '*') {
                int i4 = 32 / 0;
            }
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    private boolean a(int i) {
        boolean z = false;
        if ((i >= 200 ? 'a' : ';') == 'a') {
            try {
                int i2 = length + 69;
                setMin = i2 % 128;
                if (i2 % 2 != 0 ? i != 204 : i != 22888) {
                    if ((i != 304 ? '0' : 12) != 12) {
                        int i3 = length + 19;
                        setMin = i3 % 128;
                        if (i3 % 2 == 0) {
                            z = true;
                        }
                        boolean z2 = !z;
                        int i4 = setMin + 63;
                        length = i4 % 128;
                        if (i4 % 2 == 0) {
                            return z2;
                        }
                        Object[] objArr = null;
                        int length2 = objArr.length;
                        return z2;
                    }
                }
            } catch (Exception e) {
                throw e;
            }
        }
        return false;
    }

    @Nullable
    private byte[] a(@NonNull HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream;
        int i = setMin + 115;
        length = i % 128;
        int i2 = i % 2;
        try {
            inputStream = httpURLConnection.getInputStream();
            int i3 = length + 13;
            setMin = i3 % 128;
            int i4 = i3 % 2;
        } catch (IOException unused) {
            inputStream = httpURLConnection.getErrorStream();
        }
        return com.alipay.plus.android.transport.b.a.a(inputStream);
    }

    private void b(@NonNull HttpURLConnection httpURLConnection) {
        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
        List list = headerFields.get("Set-Cookie");
        List list2 = headerFields.get(HttpHeaders.SET_COOKIE2);
        URL url = httpURLConnection.getURL();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int i = setMin + 115;
            length = i % 128;
            char c2 = i % 2 != 0 ? 27 : ',';
            arrayList.addAll(list);
            if (c2 == 27) {
                Object obj = null;
                super.hashCode();
            }
        }
        if (list2 != null) {
            int i2 = length + 71;
            setMin = i2 % 128;
            int i3 = i2 % 2;
            arrayList.addAll(list2);
        }
        try {
            this.c.put(url.toURI(), Collections.singletonMap("Set-cookie", arrayList));
        } catch (IOException | URISyntaxException e) {
            String str = f10768a;
            StringBuilder sb = new StringBuilder("Saving cookies failed for ");
            sb.append(url.toString());
            LoggerWrapper.w(str, sb.toString(), e);
        }
    }

    private static void c(@NonNull HttpURLConnection httpURLConnection) {
        int i = length + 99;
        setMin = i % 128;
        int i2 = i % 2;
        if ((TextUtils.isEmpty(httpURLConnection.getRequestProperty("Accept-Language")) ? 'I' : '_') != '_') {
            int i3 = setMin + 81;
            length = i3 % 128;
            if ((i3 % 2 != 0 ? 10 : '+') != '+') {
                try {
                    httpURLConnection.addRequestProperty("Accept-Language", com.alipay.plus.android.transport.b.a.a());
                    Object obj = null;
                    super.hashCode();
                } catch (Exception e) {
                    throw e;
                }
            } else {
                httpURLConnection.addRequestProperty("Accept-Language", com.alipay.plus.android.transport.b.a.a());
            }
        }
    }

    static void length() {
        setMax = new char[]{139, 128, 153, Typography.section, 168};
    }

    @Nullable
    public HttpResponse performRequest(@NonNull HttpRequest httpRequest) throws Exception {
        int i;
        int i2 = length + 1;
        setMin = i2 % 128;
        int i3 = i2 % 2;
        LoggerWrapper.v(f10768a, "performRequest request = ".concat(String.valueOf(httpRequest)));
        boolean z = false;
        if (!TextUtils.isEmpty(httpRequest.url)) {
            URL url = new URL(httpRequest.url);
            HttpURLConnection a2 = a(url, httpRequest);
            a(a2, (Map<String, ?>) httpRequest.headers);
            a(a2, url);
            c(a2);
            a(a2, httpRequest.method, httpRequest.data);
            try {
                i = a2.getResponseCode();
            } catch (IOException e) {
                LoggerWrapper.d(f10768a, e.getMessage());
                i = a2.getResponseCode();
            }
            byte[] bArr = null;
            if ((i == -1 ? '^' : 'Q') != 'Q') {
                try {
                    int i4 = length + 15;
                    setMin = i4 % 128;
                    if (i4 % 2 == 0) {
                        z = true;
                    }
                    if (!z) {
                        throw com.alipay.plus.android.transport.b.a.a(HttpError.RetrieveStatusCodeError, "Could not retrieve response code from HttpUrlConnection.");
                    }
                    try {
                        Exception a3 = com.alipay.plus.android.transport.b.a.a(HttpError.RetrieveStatusCodeError, "Could not retrieve response code from HttpUrlConnection.");
                        super.hashCode();
                        throw a3;
                    } catch (Exception e2) {
                        throw e2;
                    }
                } catch (Exception e3) {
                    throw e3;
                }
            } else {
                String responseMessage = a2.getResponseMessage();
                HttpResponse httpResponse = a(i) ? new HttpResponse(i, responseMessage, a(a2), a2.getHeaderFields()) : new HttpResponse(i, responseMessage, bArr, a2.getHeaderFields());
                b(a2);
                LoggerWrapper.v(f10768a, "performRequest response = ".concat(String.valueOf(httpResponse)));
                return httpResponse;
            }
        } else {
            throw com.alipay.plus.android.transport.b.a.a(HttpError.UrlIsEmpty, "request.url is empty!");
        }
    }

    private static String setMin(int[] iArr, byte[] bArr, boolean z) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        try {
            char[] cArr = new char[i2];
            System.arraycopy(setMax, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                char c2 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = setMin + 109;
                    length = i6 % 128;
                    int i7 = i6 % 2;
                    if ((bArr[i5] == 1 ? 31 : 'Z') != 'Z') {
                        cArr2[i5] = (char) (((cArr[i5] << 1) + 1) - c2);
                    } else {
                        cArr2[i5] = (char) ((cArr[i5] << 1) - c2);
                    }
                    c2 = cArr2[i5];
                }
                cArr = cArr2;
            }
            if ((i4 > 0 ? (char) 21 : 12) == 21) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i8 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i8, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i8);
            }
            if ((z ? 'P' : ',') == 'P') {
                int i9 = length + 83;
                setMin = i9 % 128;
                int i10 = i9 % 2;
                char[] cArr4 = new char[i2];
                int i11 = 0;
                while (i11 < i2) {
                    int i12 = setMin + 63;
                    length = i12 % 128;
                    if ((i12 % 2 != 0 ? 'I' : 10) != 10) {
                        cArr4[i11] = cArr[(i2 >>> i11) % 1];
                        i11 += 54;
                    } else {
                        cArr4[i11] = cArr[(i2 - i11) - 1];
                        i11++;
                    }
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                for (int i13 = 0; i13 < i2; i13++) {
                    cArr[i13] = (char) (cArr[i13] - iArr[2]);
                }
            }
            return new String(cArr);
        } catch (Exception e) {
            throw e;
        }
    }
}
