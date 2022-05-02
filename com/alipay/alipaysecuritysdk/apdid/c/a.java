package com.alipay.alipaysecuritysdk.apdid.c;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.alipaysecuritysdk.apdid.g.d;
import com.alipay.alipaysecuritysdk.common.c.b;
import com.alipay.alipaysecuritysdk.common.e.e;
import com.alipay.alipaysecuritysdk.common.e.f;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocket;
import java.net.URL;
import java.net.URLEncoder;
import o.getTabbarModel;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f9254a = "";
    private static int equals = 1;
    private static int getMax;
    private static boolean getMin;
    private static boolean length;
    private static char[] setMax;
    private static int setMin;

    static void getMax() {
        getMax = 156;
        getMin = true;
        length = true;
        setMax = new char[]{241, 240, 226, 201, 212};
    }

    static {
        getMax();
        int i = setMin + 67;
        equals = i % 128;
        int i2 = i % 2;
    }

    public static void a(Context context, final String str, final String str2) {
        int i = equals + 49;
        setMin = i % 128;
        boolean z = false;
        if ((i % 2 != 0 ? '+' : '_') != '_') {
            int i2 = 73 / 0;
            if (context == null) {
                return;
            }
        } else if (context == null) {
            return;
        }
        try {
            String c = d.c(context);
            if (c != null) {
                int i3 = equals + 49;
                setMin = i3 % 128;
                int i4 = i3 % 2;
                if (!c.equals("")) {
                    StringBuilder sb = new StringBuilder("https://");
                    sb.append(c);
                    sb.append("/postToken.json");
                    f9254a = sb.toString();
                    final String packageName = context.getPackageName();
                    b(str, packageName, str2);
                    if (e.c(str)) {
                        z = true;
                    }
                    if (z) {
                        if (e.c(str2)) {
                            return;
                        }
                    }
                    f.a().b(new Runnable() {
                        public final void run() {
                            a.a(str, packageName, str2);
                        }
                    });
                }
            }
        } catch (Exception e) {
            b.a("SEC_SDK-apdid", (Throwable) e);
        }
    }

    private static String b(String str, String str2, String str3) {
        String str4;
        try {
            str4 = new URL(com.alipay.alipaysecuritysdk.apdid.a.a.a().gateway).getHost();
            int i = equals + 61;
            setMin = i % 128;
            int i2 = i % 2;
        } catch (Exception e) {
            b.a("SEC_SDK-apdid", (Throwable) e);
            str4 = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f9254a);
        sb.append("?tk=");
        sb.append(URLEncoder.encode(str, getTabbarModel.ENC));
        sb.append("&ck=");
        sb.append(URLEncoder.encode(str3, getTabbarModel.ENC));
        sb.append("&app=");
        sb.append(str2);
        sb.append("&t=");
        sb.append(System.currentTimeMillis());
        sb.append("&host=");
        sb.append(str4);
        String obj = sb.toString();
        int i3 = setMin + 69;
        equals = i3 % 128;
        int i4 = i3 % 2;
        return obj;
    }

    private static HttpClient a(HttpParams httpParams) {
        DefaultHttpClient defaultHttpClient;
        char[] cArr = null;
        try {
            HttpProtocolParams.setVersion(httpParams, HttpVersion.HTTP_1_1);
            HttpProtocolParams.setContentCharset(httpParams, length(cArr, 127 - TextUtils.getOffsetBefore("", 0), new byte[]{-123, -124, -125, -126, -127}, cArr).intern());
            SchemeRegistry schemeRegistry = new SchemeRegistry();
            schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
            schemeRegistry.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), WebSocket.DEFAULT_WSS_PORT));
            defaultHttpClient = new DefaultHttpClient(new ThreadSafeClientConnManager(httpParams, schemeRegistry), httpParams);
        } catch (Exception e) {
            DefaultHttpClient defaultHttpClient2 = new DefaultHttpClient(httpParams);
            b.a("SEC_SDK-apdid", "send agent request, create https socket error.create default socket.", e);
            defaultHttpClient = defaultHttpClient2;
        }
        int i = setMin + 25;
        equals = i % 128;
        if ((i % 2 == 0 ? 11 : 'C') != 11) {
            return defaultHttpClient;
        }
        int length2 = cArr.length;
        return defaultHttpClient;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x007c A[SYNTHETIC, Splitter:B:28:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008e A[SYNTHETIC, Splitter:B:36:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void a(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "SEC_SDK-apdid"
            r1 = 0
            org.apache.http.params.BasicHttpParams r2 = new org.apache.http.params.BasicHttpParams     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            r2.<init>()     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            java.lang.String r3 = "http.connection.timeout"
            r4 = 30000(0x7530, float:4.2039E-41)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            r2.setParameter(r3, r5)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            java.lang.String r3 = "http.socket.timeout"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            r2.setParameter(r3, r4)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            org.apache.http.client.HttpClient r2 = a(r2)     // Catch:{ Exception -> 0x0075, all -> 0x0072 }
            org.apache.http.client.methods.HttpGet r3 = new org.apache.http.client.methods.HttpGet     // Catch:{ Exception -> 0x0070 }
            java.lang.String r6 = b(r6, r7, r8)     // Catch:{ Exception -> 0x0070 }
            r3.<init>(r6)     // Catch:{ Exception -> 0x0070 }
            org.apache.http.HttpResponse r6 = r2.execute(r3)     // Catch:{ Exception -> 0x0070 }
            org.apache.http.StatusLine r7 = r6.getStatusLine()     // Catch:{ Exception -> 0x0070 }
            int r7 = r7.getStatusCode()     // Catch:{ Exception -> 0x0070 }
            r8 = 200(0xc8, float:2.8E-43)
            r3 = 87
            if (r7 != r8) goto L_0x003d
            r7 = 1
            goto L_0x003f
        L_0x003d:
            r7 = 87
        L_0x003f:
            if (r7 == r3) goto L_0x0049
            org.apache.http.HttpEntity r6 = r6.getEntity()     // Catch:{ Exception -> 0x0070 }
            org.apache.http.util.EntityUtils.toString(r6)     // Catch:{ Exception -> 0x0070 }
            goto L_0x0057
        L_0x0049:
            org.apache.http.StatusLine r7 = r6.getStatusLine()     // Catch:{ Exception -> 0x0070 }
            r7.getStatusCode()     // Catch:{ Exception -> 0x0070 }
            org.apache.http.StatusLine r6 = r6.getStatusLine()     // Catch:{ Exception -> 0x0070 }
            r6.getReasonPhrase()     // Catch:{ Exception -> 0x0070 }
        L_0x0057:
            org.apache.http.conn.ClientConnectionManager r6 = r2.getConnectionManager()     // Catch:{ Exception -> 0x006b }
            if (r6 == 0) goto L_0x006a
            int r7 = equals
            int r7 = r7 + 11
            int r8 = r7 % 128
            setMin = r8
            int r7 = r7 % 2
            r6.shutdown()     // Catch:{ Exception -> 0x006b }
        L_0x006a:
            return
        L_0x006b:
            r6 = move-exception
            com.alipay.alipaysecuritysdk.common.c.b.a((java.lang.String) r0, (java.lang.Throwable) r6)
            return
        L_0x0070:
            r6 = move-exception
            goto L_0x0077
        L_0x0072:
            r6 = move-exception
            r2 = r1
            goto L_0x008c
        L_0x0075:
            r6 = move-exception
            r2 = r1
        L_0x0077:
            com.alipay.alipaysecuritysdk.common.c.b.a((java.lang.String) r0, (java.lang.Throwable) r6)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x008a
            org.apache.http.conn.ClientConnectionManager r6 = r2.getConnectionManager()     // Catch:{ Exception -> 0x0086 }
            if (r6 == 0) goto L_0x008a
            r6.shutdown()     // Catch:{ Exception -> 0x0086 }
            goto L_0x008a
        L_0x0086:
            r6 = move-exception
            com.alipay.alipaysecuritysdk.common.c.b.a((java.lang.String) r0, (java.lang.Throwable) r6)
        L_0x008a:
            return
        L_0x008b:
            r6 = move-exception
        L_0x008c:
            if (r2 == 0) goto L_0x00ba
            org.apache.http.conn.ClientConnectionManager r7 = r2.getConnectionManager()     // Catch:{ Exception -> 0x00b6 }
            if (r7 == 0) goto L_0x00ba
            int r8 = setMin
            int r8 = r8 + 53
            int r2 = r8 % 128
            equals = r2
            int r8 = r8 % 2
            r2 = 56
            if (r8 != 0) goto L_0x00a5
            r8 = 49
            goto L_0x00a7
        L_0x00a5:
            r8 = 56
        L_0x00a7:
            if (r8 == r2) goto L_0x00b2
            r7.shutdown()     // Catch:{ Exception -> 0x00b6 }
            super.hashCode()     // Catch:{ all -> 0x00b0 }
            goto L_0x00ba
        L_0x00b0:
            r6 = move-exception
            throw r6
        L_0x00b2:
            r7.shutdown()     // Catch:{ Exception -> 0x00b6 }
            goto L_0x00ba
        L_0x00b6:
            r7 = move-exception
            com.alipay.alipaysecuritysdk.common.c.b.a((java.lang.String) r0, (java.lang.Throwable) r7)
        L_0x00ba:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.apdid.c.a.a(java.lang.String, java.lang.String, java.lang.String):void");
    }

    private static String length(int[] iArr, int i, byte[] bArr, char[] cArr) {
        int i2 = setMin + 123;
        equals = i2 % 128;
        int i3 = i2 % 2;
        char[] cArr2 = setMax;
        int i4 = getMax;
        if (length) {
            int i5 = equals + 45;
            setMin = i5 % 128;
            int i6 = i5 % 2;
            int length2 = bArr.length;
            char[] cArr3 = new char[length2];
            for (int i7 = 0; i7 < length2; i7++) {
                cArr3[i7] = (char) (cArr2[bArr[(length2 - 1) - i7] + i] - i4);
            }
            return new String(cArr3);
        } else if (getMin) {
            int length3 = cArr.length;
            char[] cArr4 = new char[length3];
            int i8 = equals + 69;
            setMin = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (true) {
                if (i10 >= length3) {
                    return new String(cArr4);
                }
                cArr4[i10] = (char) (cArr2[cArr[(length3 - 1) - i10] - i] - i4);
                i10++;
            }
        } else {
            int length4 = iArr.length;
            char[] cArr5 = new char[length4];
            for (int i11 = 0; i11 < length4; i11++) {
                cArr5[i11] = (char) (cArr2[iArr[(length4 - 1) - i11] - i] - i4);
            }
            String str = new String(cArr5);
            int i12 = equals + 117;
            setMin = i12 % 128;
            if (i12 % 2 == 0) {
                return str;
            }
            int i13 = 37 / 0;
            return str;
        }
    }
}
