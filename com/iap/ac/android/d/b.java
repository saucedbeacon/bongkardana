package com.iap.ac.android.d;

import android.content.Context;
import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.annotation.NonNull;
import com.iap.ac.android.common.log.ACLog;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.Typography;
import o.onActivityPostCreated;

public class b {
    private static int IsOverlapping = 1;
    private static char getMax = '忹';
    private static char getMin = '퉏';
    private static char length = '頜';
    private static int setMax = 0;
    private static char setMin = '唎';

    /* renamed from: a  reason: collision with root package name */
    public CookieManager f11038a;
    public boolean b;
    public List<c> c;

    public b(boolean z, @NonNull Context context) {
        try {
            this.c = new ArrayList();
            try {
                this.b = z;
                this.f11038a = CookieManager.getInstance();
                if (Build.VERSION.SDK_INT < 21) {
                    try {
                        CookieSyncManager.createInstance(context).sync();
                        int i = IsOverlapping + 17;
                        setMax = i % 128;
                        if ((i % 2 != 0 ? Typography.greater : 11) == '>') {
                            Object obj = null;
                            super.hashCode();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        ACLog.w("HttpClient", "Take it easy. just try initialize compatible with exception: ", th);
                    }
                }
                int i2 = setMax + 9;
                IsOverlapping = i2 % 128;
                if (!(i2 % 2 != 0)) {
                    int i3 = 56 / 0;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r6v1, types: [java.security.SecureRandom, javax.net.ssl.TrustManager[], javax.net.ssl.KeyManager[], byte[]] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0177, code lost:
        if ((r1 == com.iap.ac.android.biz.common.model.http.HttpMethod.PUT ? 14 : 'F') != 'F') goto L_0x0179;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0211  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.iap.ac.android.biz.common.model.http.HttpResponse a(@androidx.annotation.NonNull com.iap.ac.android.d.f r15) throws java.lang.Exception {
        /*
            r14 = this;
            java.lang.String r0 = "HttpUtils"
            com.iap.ac.android.biz.common.model.http.HttpRequest r15 = r15.b
            java.lang.String r1 = java.lang.String.valueOf(r15)
            java.lang.String r2 = "performRequest request = "
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r2 = "HttpClient"
            com.iap.ac.android.common.log.ACLog.v(r2, r1)
            java.lang.String r1 = r15.url
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x02dd
            java.net.URL r1 = new java.net.URL
            java.lang.String r3 = r15.url
            r1.<init>(r3)
            java.net.URLConnection r3 = r1.openConnection()
            java.lang.Object r3 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r3)
            java.net.URLConnection r3 = (java.net.URLConnection) r3
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            boolean r4 = java.net.HttpURLConnection.getFollowRedirects()
            r3.setInstanceFollowRedirects(r4)
            int r4 = r15.timeoutMilliseconds
            if (r4 > 0) goto L_0x004c
            int r4 = IsOverlapping
            int r4 = r4 + 109
            int r5 = r4 % 128
            setMax = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L_0x0048
            r4 = 18626(0x48c2, float:2.61E-41)
            goto L_0x004a
        L_0x0048:
            r4 = 5000(0x1388, float:7.006E-42)
        L_0x004a:
            r15.timeoutMilliseconds = r4
        L_0x004c:
            int r4 = r15.timeoutMilliseconds
            r3.setConnectTimeout(r4)
            int r4 = r15.timeoutMilliseconds
            r3.setReadTimeout(r4)
            boolean r4 = r14.b
            r3.setUseCaches(r4)
            boolean r4 = r14.b
            r3.setDefaultUseCaches(r4)
            r4 = 1
            r3.setDoInput(r4)
            boolean r5 = r15.notFollowRedirects
            r5 = r5 ^ r4
            r3.setInstanceFollowRedirects(r5)
            java.lang.String r5 = r1.getProtocol()
            java.lang.String r6 = "https"
            boolean r5 = r6.equals(r5)
            r6 = 0
            if (r5 == 0) goto L_0x0094
            java.lang.String r5 = "Https protocol, will set SSLContext."
            com.iap.ac.android.common.log.ACLog.i(r2, r5)
            java.lang.String r5 = "TLS"
            javax.net.ssl.SSLContext r5 = javax.net.ssl.SSLContext.getInstance(r5)
            r5.init(r6, r6, r6)
            r7 = r3
            javax.net.ssl.HttpsURLConnection r7 = (javax.net.ssl.HttpsURLConnection) r7
            javax.net.ssl.SSLSocketFactory r5 = r5.getSocketFactory()
            r7.setSSLSocketFactory(r5)
            java.lang.String r5 = "Https protocol, set SSLContext & SSLSocketFactory successfully."
            com.iap.ac.android.common.log.ACLog.i(r2, r5)
        L_0x0094:
            java.util.Map<java.lang.String, java.lang.String> r5 = r15.headers
            r7 = 0
            if (r5 == 0) goto L_0x00f1
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x00a1:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x00f1
            int r8 = IsOverlapping
            int r8 = r8 + 107
            int r9 = r8 % 128
            setMax = r9
            int r8 = r8 % 2
            if (r8 == 0) goto L_0x00cf
            java.lang.Object r8 = r5.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = r3.getRequestProperty(r9)
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            r11 = 99
            int r11 = r11 / r7
            if (r10 == 0) goto L_0x00a1
            goto L_0x00e5
        L_0x00cd:
            r15 = move-exception
            throw r15
        L_0x00cf:
            java.lang.Object r8 = r5.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = r3.getRequestProperty(r9)
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x00a1
        L_0x00e5:
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r3.addRequestProperty(r9, r8)
            goto L_0x00a1
        L_0x00f1:
            android.webkit.CookieManager r5 = r14.f11038a
            if (r5 != 0) goto L_0x00f7
            r8 = 1
            goto L_0x00f8
        L_0x00f7:
            r8 = 0
        L_0x00f8:
            java.lang.String r9 = "cookieManager is null!"
            r10 = 13
            if (r8 == 0) goto L_0x0102
            com.iap.ac.android.common.log.ACLog.e(r2, r9)
            goto L_0x0128
        L_0x0102:
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r5.getCookie(r1)
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            r8 = 48
            if (r5 != 0) goto L_0x0115
            r5 = 48
            goto L_0x0117
        L_0x0115:
            r5 = 54
        L_0x0117:
            if (r5 == r8) goto L_0x011a
            goto L_0x0128
        L_0x011a:
            int r5 = setMax
            int r5 = r5 + r10
            int r8 = r5 % 128
            IsOverlapping = r8
            int r5 = r5 % 2
            java.lang.String r5 = "Cookie"
            r3.addRequestProperty(r5, r1)
        L_0x0128:
            java.lang.String r1 = "Accept-Language"
            java.lang.String r5 = r3.getRequestProperty(r1)
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x013f
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.String r5 = r5.toString()
            r3.addRequestProperty(r1, r5)
        L_0x013f:
            com.iap.ac.android.biz.common.model.http.HttpMethod r1 = r15.method
            java.lang.String r15 = r15.data
            if (r1 != 0) goto L_0x0163
            int r1 = IsOverlapping
            int r1 = r1 + 123
            int r5 = r1 % 128
            setMax = r5
            int r1 = r1 % 2
            if (r1 == 0) goto L_0x0157
            com.iap.ac.android.biz.common.model.http.HttpMethod r1 = com.iap.ac.android.biz.common.model.http.HttpMethod.GET
            int r5 = r6.length     // Catch:{ all -> 0x0155 }
            goto L_0x0159
        L_0x0155:
            r15 = move-exception
            throw r15
        L_0x0157:
            com.iap.ac.android.biz.common.model.http.HttpMethod r1 = com.iap.ac.android.biz.common.model.http.HttpMethod.GET
        L_0x0159:
            int r5 = IsOverlapping
            int r5 = r5 + 11
            int r8 = r5 % 128
            setMax = r8
            int r5 = r5 % 2
        L_0x0163:
            java.lang.String r5 = r1.method
            r3.setRequestMethod(r5)
            com.iap.ac.android.biz.common.model.http.HttpMethod r5 = com.iap.ac.android.biz.common.model.http.HttpMethod.POST
            if (r1 == r5) goto L_0x0179
            com.iap.ac.android.biz.common.model.http.HttpMethod r5 = com.iap.ac.android.biz.common.model.http.HttpMethod.PUT
            r8 = 70
            if (r1 != r5) goto L_0x0175
            r1 = 14
            goto L_0x0177
        L_0x0175:
            r1 = 70
        L_0x0177:
            if (r1 == r8) goto L_0x01c9
        L_0x0179:
            boolean r1 = android.text.TextUtils.isEmpty(r15)
            r5 = 40
            if (r1 != 0) goto L_0x0184
            r1 = 46
            goto L_0x0186
        L_0x0184:
            r1 = 40
        L_0x0186:
            if (r1 == r5) goto L_0x01c9
            r1 = 6
            char[] r1 = new char[r1]
            r1 = {-32763, 22409, -1137, -15372, 20335, -4231} // fill-array
            java.lang.String r1 = setMax(r1)
            java.lang.String r1 = r1.intern()
            byte[] r15 = r15.getBytes(r1)
            int r1 = r15.length
            r3.setFixedLengthStreamingMode(r1)
            r3.setDoOutput(r4)
            java.lang.String r1 = "Content-Type"
            java.lang.String r5 = r3.getRequestProperty(r1)
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x01af
            r5 = 0
            goto L_0x01b0
        L_0x01af:
            r5 = 1
        L_0x01b0:
            if (r5 == r4) goto L_0x01b7
            java.lang.String r5 = "application/x-www-form-urlencoded"
            r3.addRequestProperty(r1, r5)
        L_0x01b7:
            r3.connect()
            java.io.DataOutputStream r1 = new java.io.DataOutputStream
            java.io.OutputStream r5 = r3.getOutputStream()
            r1.<init>(r5)
            r1.write(r15)
            r1.close()
        L_0x01c9:
            int r15 = r3.getResponseCode()     // Catch:{ IOException -> 0x01ce }
            goto L_0x01da
        L_0x01ce:
            r15 = move-exception
            java.lang.String r15 = r15.getMessage()
            com.iap.ac.android.common.log.ACLog.d(r2, r15)
            int r15 = r3.getResponseCode()
        L_0x01da:
            r1 = -1
            if (r15 == r1) goto L_0x02d5
            java.lang.String r5 = r3.getResponseMessage()
            r8 = 200(0xc8, float:2.8E-43)
            r11 = 85
            if (r15 < r8) goto L_0x01ea
            r8 = 13
            goto L_0x01ec
        L_0x01ea:
            r8 = 85
        L_0x01ec:
            if (r8 == r10) goto L_0x01ef
            goto L_0x020e
        L_0x01ef:
            r8 = 204(0xcc, float:2.86E-43)
            if (r15 == r8) goto L_0x020e
            r8 = 304(0x130, float:4.26E-43)
            if (r15 == r8) goto L_0x020e
            int r8 = setMax
            int r8 = r8 + 119
            int r10 = r8 % 128
            IsOverlapping = r10
            int r8 = r8 % 2
            r10 = 80
            if (r8 != 0) goto L_0x0208
            r8 = 80
            goto L_0x020a
        L_0x0208:
            r8 = 62
        L_0x020a:
            if (r8 == r10) goto L_0x020e
            r8 = 1
            goto L_0x020f
        L_0x020e:
            r8 = 0
        L_0x020f:
            if (r8 == 0) goto L_0x024e
            com.iap.ac.android.biz.common.model.http.HttpResponse r8 = new com.iap.ac.android.biz.common.model.http.HttpResponse
            java.io.InputStream r10 = r3.getInputStream()     // Catch:{ IOException -> 0x0218 }
            goto L_0x021c
        L_0x0218:
            java.io.InputStream r10 = r3.getErrorStream()
        L_0x021c:
            if (r10 != 0) goto L_0x021f
            goto L_0x0246
        L_0x021f:
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream
            r6.<init>()
            r12 = 1024(0x400, float:1.435E-42)
            byte[] r12 = new byte[r12]
        L_0x0228:
            int r13 = r10.read(r12)     // Catch:{ all -> 0x0232 }
            if (r13 == r1) goto L_0x0238
            r6.write(r12, r7, r13)     // Catch:{ all -> 0x0232 }
            goto L_0x0228
        L_0x0232:
            r1 = move-exception
            java.lang.String r12 = "readBytes exception"
            com.iap.ac.android.common.log.ACLog.e(r0, r12, r1)
        L_0x0238:
            byte[] r6 = r6.toByteArray()
            r10.close()     // Catch:{ IOException -> 0x0240 }
            goto L_0x0246
        L_0x0240:
            r1 = move-exception
            java.lang.String r10 = "Take it easy, just cannot close stream."
            com.iap.ac.android.common.log.ACLog.w(r0, r10, r1)
        L_0x0246:
            java.util.Map r0 = r3.getHeaderFields()
            r8.<init>(r15, r5, r6, r0)
            goto L_0x0257
        L_0x024e:
            com.iap.ac.android.biz.common.model.http.HttpResponse r8 = new com.iap.ac.android.biz.common.model.http.HttpResponse
            java.util.Map r0 = r3.getHeaderFields()
            r8.<init>(r15, r5, r6, r0)
        L_0x0257:
            android.webkit.CookieManager r15 = r14.f11038a
            if (r15 != 0) goto L_0x025c
            r7 = 1
        L_0x025c:
            if (r7 == r4) goto L_0x02c4
            java.util.Map r15 = r3.getHeaderFields()
            java.lang.String r0 = "Set-Cookie"
            java.lang.Object r0 = r15.get(r0)
            java.util.List r0 = (java.util.List) r0
            java.lang.String r1 = "Set-Cookie2"
            java.lang.Object r15 = r15.get(r1)
            java.util.List r15 = (java.util.List) r15
            java.net.URL r1 = r3.getURL()
            java.lang.String r1 = r1.toString()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r0 == 0) goto L_0x028e
            int r4 = setMax
            int r4 = r4 + 91
            int r5 = r4 % 128
            IsOverlapping = r5
            int r4 = r4 % 2
            r3.addAll(r0)
        L_0x028e:
            if (r15 == 0) goto L_0x0293
            r3.addAll(r15)
        L_0x0293:
            java.util.Iterator r15 = r3.iterator()
        L_0x0297:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x02a9
            java.lang.Object r0 = r15.next()
            java.lang.String r0 = (java.lang.String) r0
            android.webkit.CookieManager r3 = r14.f11038a
            r3.setCookie(r1, r0)
            goto L_0x0297
        L_0x02a9:
            int r15 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            r1 = 36
            if (r15 < r0) goto L_0x02b2
            goto L_0x02b4
        L_0x02b2:
            r11 = 36
        L_0x02b4:
            if (r11 == r1) goto L_0x02bc
            android.webkit.CookieManager r15 = r14.f11038a
            r15.flush()
            goto L_0x02c7
        L_0x02bc:
            android.webkit.CookieSyncManager r15 = android.webkit.CookieSyncManager.getInstance()
            r15.sync()
            goto L_0x02c7
        L_0x02c4:
            com.iap.ac.android.common.log.ACLog.e(r2, r9)
        L_0x02c7:
            java.lang.String r15 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "performRequest response = "
            java.lang.String r15 = r0.concat(r15)
            com.iap.ac.android.common.log.ACLog.v(r2, r15)
            return r8
        L_0x02d5:
            com.iap.ac.android.biz.common.http.HttpException r15 = new com.iap.ac.android.biz.common.http.HttpException
            java.lang.String r0 = "Could not retrieve response code from HttpUrlConnection."
            r15.<init>(r0)
            throw r15
        L_0x02dd:
            com.iap.ac.android.biz.common.http.HttpException r15 = new com.iap.ac.android.biz.common.http.HttpException
            java.lang.String r0 = "request.url is empty!"
            r15.<init>(r0)
            goto L_0x02e6
        L_0x02e5:
            throw r15
        L_0x02e6:
            goto L_0x02e5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.d.b.a(com.iap.ac.android.d.f):com.iap.ac.android.biz.common.model.http.HttpResponse");
    }

    private static String setMax(char[] cArr) {
        int i = IsOverlapping + 71;
        setMax = i % 128;
        int i2 = i % 2;
        char[] cArr2 = new char[cArr.length];
        char[] cArr3 = new char[2];
        int i3 = 0;
        while (true) {
            if (!(i3 < cArr.length)) {
                return new String(cArr2, 1, cArr2[0]);
            }
            cArr3[0] = cArr[i3];
            int i4 = i3 + 1;
            cArr3[1] = cArr[i4];
            try {
                onActivityPostCreated.setMax(cArr3, getMax, setMin, getMin, length);
                cArr2[i3] = cArr3[0];
                cArr2[i4] = cArr3[1];
                i3 += 2;
                int i5 = setMax + 29;
                IsOverlapping = i5 % 128;
                int i6 = i5 % 2;
            } catch (Exception e) {
                throw e;
            }
        }
    }
}
