package com.google.firebase.crashlytics.internal.network;

import android.graphics.Color;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.URLUtil;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.Typography;

public class HttpGetRequest {
    private static final int DEFAULT_TIMEOUT_MS = 10000;
    private static final String METHOD_GET = "GET";
    private static final int READ_BUFFER_SIZE = 8192;
    private static int getMax = 55;
    private static int getMin = 1;
    private static int length;
    private final Map<String, String> headers = new HashMap();
    private final Map<String, String> queryParams;
    private final String url;

    public HttpGetRequest(String str, Map<String, String> map) {
        this.url = str;
        this.queryParams = map;
    }

    public HttpGetRequest header(String str, String str2) {
        try {
            int i = length + 77;
            getMin = i % 128;
            if (!(i % 2 == 0)) {
                this.headers.put(str, str2);
            } else {
                this.headers.put(str, str2);
                int i2 = 10 / 0;
            }
            return this;
        } catch (Exception e) {
            throw e;
        }
    }

    public HttpGetRequest header(Map.Entry<String, String> entry) {
        try {
            int i = length + 29;
            getMin = i % 128;
            if (!(i % 2 == 0)) {
                return header(entry.getKey(), entry.getValue());
            }
            HttpGetRequest header = header(entry.getKey(), entry.getValue());
            Object obj = null;
            super.hashCode();
            return header;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c2 A[SYNTHETIC, Splitter:B:43:0x00c2] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.crashlytics.internal.network.HttpResponse execute() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            java.lang.String r1 = r6.url     // Catch:{ all -> 0x00be }
            java.util.Map<java.lang.String, java.lang.String> r2 = r6.queryParams     // Catch:{ all -> 0x00be }
            java.lang.String r1 = r6.createUrlWithParams(r1, r2)     // Catch:{ all -> 0x00be }
            com.google.firebase.crashlytics.internal.Logger r2 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch:{ all -> 0x00be }
            java.lang.String r3 = "GET Request URL: "
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00be }
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x00be }
            r2.v(r3)     // Catch:{ all -> 0x00be }
            java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x00be }
            r2.<init>(r1)     // Catch:{ all -> 0x00be }
            java.net.URLConnection r1 = r2.openConnection()     // Catch:{ all -> 0x00be }
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch:{ all -> 0x00be }
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.setReadTimeout(r2)     // Catch:{ all -> 0x00bc }
            r1.setConnectTimeout(r2)     // Catch:{ all -> 0x00bc }
            java.lang.String r2 = "GET"
            r1.setRequestMethod(r2)     // Catch:{ all -> 0x00bc }
            java.util.Map<java.lang.String, java.lang.String> r2 = r6.headers     // Catch:{ all -> 0x00bc }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x00bc }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00bc }
        L_0x003c:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00bc }
            if (r3 == 0) goto L_0x0084
            int r3 = length
            int r3 = r3 + 5
            int r4 = r3 % 128
            getMin = r4
            int r3 = r3 % 2
            r4 = 21
            if (r3 != 0) goto L_0x0053
            r3 = 50
            goto L_0x0055
        L_0x0053:
            r3 = 21
        L_0x0055:
            if (r3 == r4) goto L_0x006e
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00bc }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00bc }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x00bc }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00bc }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00bc }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00bc }
            r1.addRequestProperty(r4, r3)     // Catch:{ all -> 0x00bc }
            int r3 = r0.length     // Catch:{ all -> 0x00bc }
            goto L_0x003c
        L_0x006e:
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00bc }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00bc }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x00bc }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00bc }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00bc }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00bc }
            r1.addRequestProperty(r4, r3)     // Catch:{ all -> 0x00bc }
            goto L_0x003c
        L_0x0084:
            r1.connect()     // Catch:{ all -> 0x00bc }
            int r2 = r1.getResponseCode()     // Catch:{ all -> 0x00bc }
            java.io.InputStream r3 = r1.getInputStream()     // Catch:{ all -> 0x00bc }
            r4 = 1
            if (r3 == 0) goto L_0x0094
            r5 = 0
            goto L_0x0095
        L_0x0094:
            r5 = 1
        L_0x0095:
            if (r5 == r4) goto L_0x009f
            java.lang.String r0 = r6.readStream(r3)     // Catch:{ all -> 0x009c }
            goto L_0x009f
        L_0x009c:
            r2 = move-exception
            r0 = r3
            goto L_0x00c0
        L_0x009f:
            if (r3 == 0) goto L_0x00b1
            int r4 = getMin     // Catch:{ Exception -> 0x00af }
            int r4 = r4 + 7
            int r5 = r4 % 128
            length = r5     // Catch:{ Exception -> 0x00af }
            int r4 = r4 % 2
            r3.close()
            goto L_0x00b1
        L_0x00af:
            r0 = move-exception
            throw r0
        L_0x00b1:
            if (r1 == 0) goto L_0x00b6
            r1.disconnect()
        L_0x00b6:
            com.google.firebase.crashlytics.internal.network.HttpResponse r1 = new com.google.firebase.crashlytics.internal.network.HttpResponse
            r1.<init>(r2, r0)
            return r1
        L_0x00bc:
            r2 = move-exception
            goto L_0x00c0
        L_0x00be:
            r2 = move-exception
            r1 = r0
        L_0x00c0:
            if (r0 == 0) goto L_0x00d2
            r0.close()     // Catch:{ Exception -> 0x00d0 }
            int r0 = length
            int r0 = r0 + 59
            int r3 = r0 % 128
            getMin = r3
            int r0 = r0 % 2
            goto L_0x00d2
        L_0x00d0:
            r0 = move-exception
            throw r0
        L_0x00d2:
            if (r1 == 0) goto L_0x00e1
            int r0 = getMin
            int r0 = r0 + 105
            int r3 = r0 % 128
            length = r3
            int r0 = r0 % 2
            r1.disconnect()
        L_0x00e1:
            goto L_0x00e3
        L_0x00e2:
            throw r2
        L_0x00e3:
            goto L_0x00e2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.network.HttpGetRequest.execute():com.google.firebase.crashlytics.internal.network.HttpResponse");
    }

    private String createUrlWithParams(String str, Map<String, String> map) {
        String createParamsString = createParamsString(map);
        try {
            if (createParamsString.isEmpty()) {
                int i = length + 15;
                getMin = i % 128;
                int i2 = i % 2;
                return str;
            }
            if (!(!str.contains("?"))) {
                try {
                    int i3 = getMin + 29;
                    length = i3 % 128;
                    int i4 = i3 % 2;
                    if ((!str.endsWith("&") ? '.' : '-') == '.') {
                        createParamsString = "&".concat(String.valueOf(createParamsString));
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(createParamsString);
                    return sb.toString();
                } catch (Exception e) {
                    throw e;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("?");
                sb2.append(createParamsString);
                return sb2.toString();
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private String createParamsString(Map<String, String> map) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry next = it.next();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((String) next.getKey());
        sb2.append(SimpleComparison.EQUAL_TO_OPERATION);
        if ((next.getValue() != null ? Typography.dollar : 'a') != '$') {
            int i = getMin + 75;
            length = i % 128;
            int i2 = i % 2;
            str = "";
        } else {
            str = (String) next.getValue();
        }
        try {
            sb2.append(str);
            sb.append(sb2.toString());
            while (it.hasNext()) {
                Map.Entry next2 = it.next();
                StringBuilder sb3 = new StringBuilder("&");
                sb3.append((String) next2.getKey());
                sb3.append(SimpleComparison.EQUAL_TO_OPERATION);
                if (next2.getValue() != null) {
                    int i3 = length + 21;
                    getMin = i3 % 128;
                    if (i3 % 2 == 0) {
                        str2 = (String) next2.getValue();
                        int i4 = 81 / 0;
                    } else {
                        str2 = (String) next2.getValue();
                    }
                } else {
                    str2 = "";
                }
                sb3.append(str2);
                sb.append(sb3.toString());
                int i5 = length + 41;
                getMin = i5 % 128;
                int i6 = i5 % 2;
            }
            return sb.toString();
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.String] */
    private String readStream(InputStream inputStream) throws IOException {
        boolean z = false;
        ? r6 = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, getMax(123 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 5 - View.resolveSize(0, 0), new char[]{17, 16, 2, 65513, 65524}, URLUtil.isCookielessProxyUrl(r6), -16777211 - Color.rgb(0, 0, 0)).intern()));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if ((read != -1 ? '#' : ';') != '#') {
                break;
            }
            int i = getMin + 39;
            length = i % 128;
            int i2 = i % 2;
            sb.append(cArr, 0, read);
        }
        String obj = sb.toString();
        int i3 = length + 3;
        getMin = i3 % 128;
        if (i3 % 2 == 0) {
            z = true;
        }
        if (!z) {
            return obj;
        }
        int length2 = r6.length;
        return obj;
    }

    private static String getMax(int i, int i2, char[] cArr, boolean z, int i3) {
        char[] cArr2 = new char[i3];
        boolean z2 = false;
        int i4 = 0;
        while (true) {
            boolean z3 = true;
            if (i4 >= i3) {
                break;
            }
            try {
                int i5 = length + 81;
                getMin = i5 % 128;
                if (i5 % 2 == 0) {
                    z3 = false;
                }
                if (z3) {
                    cArr2[i4] = (char) (cArr[i4] + i);
                    cArr2[i4] = (char) (cArr2[i4] - getMax);
                    i4++;
                } else {
                    cArr2[i4] = (char) (cArr[i4] + i);
                    cArr2[i4] = (char) (cArr2[i4] >> getMax);
                    i4 += 62;
                }
            } catch (Exception e) {
                throw e;
            }
        }
        if (i2 > 0) {
            int i6 = getMin + 91;
            length = i6 % 128;
            int i7 = i6 % 2;
            char[] cArr3 = new char[i3];
            try {
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                int i8 = i3 - i2;
                System.arraycopy(cArr3, 0, cArr2, i8, i2);
                System.arraycopy(cArr3, i2, cArr2, 0, i8);
            } catch (Exception e2) {
                throw e2;
            }
        }
        if ((z ? Typography.quote : 'M') != 'M') {
            char[] cArr4 = new char[i3];
            int i9 = 0;
            while (true) {
                if ((i9 < i3 ? Typography.quote : '+') == '+') {
                    break;
                }
                cArr4[i9] = cArr2[(i3 - i9) - 1];
                i9++;
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i10 = length + 117;
        getMin = i10 % 128;
        if (i10 % 2 == 0) {
            z2 = true;
        }
        if (!z2) {
            return str;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return str;
    }
}
