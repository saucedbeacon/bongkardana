package com.alibaba.griver.base.common.network;

import com.alibaba.griver.api.common.network.GriverTransportExtension;

public class GriverURLTransport implements GriverTransportExtension {
    private static int equals = 1;
    private static char[] getMax = {341, 340, 326, 301, 312};
    private static int getMin = 0;
    private static int length = 256;
    private static boolean setMax = true;
    private static boolean setMin = true;

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Throwable, int[], char[], com.alibaba.griver.api.common.network.HttpResponse] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        if (r3 <= 0) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r3 <= 0) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00fd, code lost:
        if (android.text.TextUtils.isEmpty(r0.getRequestProperty("Content-Type")) != false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010a, code lost:
        if (android.text.TextUtils.isEmpty(r0.getRequestProperty("Content-Type")) != false) goto L_0x010c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.alibaba.griver.api.common.network.HttpResponse request(com.alibaba.griver.api.common.network.HttpRequest r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.getUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r1 = "GriverURLTransport"
            r2 = 0
            if (r0 == 0) goto L_0x0013
            java.lang.String r10 = "request url is null, return null"
            com.alibaba.griver.base.common.logger.GriverLogger.w(r1, r10, r2)
            return r2
        L_0x0013:
            java.lang.String r0 = r10.getUrl()
            java.net.URL r3 = new java.net.URL
            r3.<init>(r0)
            java.net.URLConnection r0 = r3.openConnection()
            java.lang.Object r0 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r0)
            java.net.URLConnection r0 = (java.net.URLConnection) r0
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
            int r3 = r10.getTimeout()
            r4 = 60000(0xea60, float:8.4078E-41)
            if (r3 > 0) goto L_0x0066
            int r3 = equals
            int r3 = r3 + 41
            int r5 = r3 % 128
            getMin = r5
            int r3 = r3 % 2
            r5 = 80
            if (r3 == 0) goto L_0x0042
            r3 = 80
            goto L_0x0044
        L_0x0042:
            r3 = 19
        L_0x0044:
            java.lang.String r6 = "mini_request_timeout"
            if (r3 == r5) goto L_0x004f
            int r3 = com.alibaba.griver.base.common.utils.GriverConfigUtils.transferStringConfigToInt(r6, r4)
            if (r3 > 0) goto L_0x0066
            goto L_0x0056
        L_0x004f:
            int r3 = com.alibaba.griver.base.common.utils.GriverConfigUtils.transferStringConfigToInt(r6, r4)
            int r5 = r2.length     // Catch:{ all -> 0x0064 }
            if (r3 > 0) goto L_0x0066
        L_0x0056:
            int r3 = getMin
            int r3 = r3 + 93
            int r5 = r3 % 128
            equals = r5
            int r3 = r3 % 2
            r3 = 60000(0xea60, float:8.4078E-41)
            goto L_0x0066
        L_0x0064:
            r10 = move-exception
            throw r10
        L_0x0066:
            java.lang.String r4 = "accept"
            java.lang.String r5 = "*/*"
            r0.setRequestProperty(r4, r5)
            java.lang.String r4 = "connection"
            java.lang.String r5 = "Keep-Alive"
            r0.setRequestProperty(r4, r5)
            int r4 = android.view.ViewConfiguration.getScrollBarSize()
            int r4 = r4 >> 8
            int r4 = 127 - r4
            r5 = 5
            byte[] r5 = new byte[r5]
            r5 = {-123, -124, -125, -126, -127} // fill-array
            java.lang.String r2 = setMax(r4, r2, r5, r2)
            java.lang.String r2 = r2.intern()
            java.lang.String r4 = "Accept-Charset"
            r0.setRequestProperty(r4, r2)
            r0.setConnectTimeout(r3)
            r0.setReadTimeout(r3)
            java.lang.String r2 = r10.getMethod()
            r0.setRequestMethod(r2)
            java.util.Map r2 = r10.getHeaders()
            if (r2 == 0) goto L_0x00d6
            int r3 = r2.size()
            if (r3 <= 0) goto L_0x00d6
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            int r3 = equals
            int r3 = r3 + 99
            int r4 = r3 % 128
            getMin = r4
            int r3 = r3 % 2
        L_0x00ba:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00d6
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r0.setRequestProperty(r4, r3)
            goto L_0x00ba
        L_0x00d6:
            java.lang.String r2 = r10.getMethod()
            java.lang.String r3 = "POST"
            boolean r2 = r3.equalsIgnoreCase(r2)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0195
            int r2 = equals
            int r2 = r2 + 89
            int r5 = r2 % 128
            getMin = r5
            int r2 = r2 % 2
            java.lang.String r5 = "Content-Type"
            if (r2 == 0) goto L_0x0102
            java.lang.String r2 = r0.getRequestProperty(r5)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r6 = 68
            int r6 = r6 / r3
            if (r2 == 0) goto L_0x0111
            goto L_0x010c
        L_0x0100:
            r10 = move-exception
            throw r10
        L_0x0102:
            java.lang.String r2 = r0.getRequestProperty(r5)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0111
        L_0x010c:
            java.lang.String r2 = "application/json;charset=utf-8"
            r0.setRequestProperty(r5, r2)
        L_0x0111:
            r0.setDoOutput(r4)
            r0.setDoInput(r4)
            r0.connect()
            java.io.OutputStream r2 = r0.getOutputStream()
            com.alibaba.griver.api.common.network.UploadRequest r5 = r10.getUploadRequest()
            if (r5 == 0) goto L_0x0126
            r5 = 0
            goto L_0x0127
        L_0x0126:
            r5 = 1
        L_0x0127:
            if (r5 == r4) goto L_0x0175
            com.alibaba.griver.api.common.network.UploadRequest r5 = r10.getUploadRequest()
            java.io.InputStream r5 = r5.getInputStream()
            r6 = 21
            if (r5 == 0) goto L_0x0138
            r5 = 17
            goto L_0x013a
        L_0x0138:
            r5 = 21
        L_0x013a:
            if (r5 == r6) goto L_0x0175
            com.alibaba.griver.api.common.network.UploadRequest r10 = r10.getUploadRequest()
            java.io.InputStream r5 = r10.getInputStream()
            byte[] r6 = r10.getHeaders()
            byte[] r10 = r10.getEnds()
            if (r6 == 0) goto L_0x0150
            r7 = 0
            goto L_0x0151
        L_0x0150:
            r7 = 1
        L_0x0151:
            if (r7 == 0) goto L_0x0154
            goto L_0x015a
        L_0x0154:
            int r7 = r6.length
            if (r7 <= 0) goto L_0x015a
            r2.write(r6)
        L_0x015a:
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]
        L_0x015e:
            int r7 = r5.read(r6)
            r8 = -1
            if (r7 == r8) goto L_0x0169
            r2.write(r6, r3, r7)
            goto L_0x015e
        L_0x0169:
            if (r10 == 0) goto L_0x0171
            int r6 = r10.length
            if (r6 <= 0) goto L_0x0171
            r2.write(r10)
        L_0x0171:
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r5)
            goto L_0x018c
        L_0x0175:
            byte[] r5 = r10.getRequestData()
            r6 = 75
            if (r5 == 0) goto L_0x0180
            r5 = 75
            goto L_0x0182
        L_0x0180:
            r5 = 92
        L_0x0182:
            if (r5 == r6) goto L_0x0185
            goto L_0x018c
        L_0x0185:
            byte[] r10 = r10.getRequestData()
            r2.write(r10)
        L_0x018c:
            r2.flush()
            r2.close()
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r2)
        L_0x0195:
            com.alibaba.griver.api.common.network.HttpResponse r10 = new com.alibaba.griver.api.common.network.HttpResponse
            r10.<init>()
            int r2 = r0.getResponseCode()     // Catch:{ Exception -> 0x01ac }
            r10.setStatusCode(r2)     // Catch:{ Exception -> 0x01ac }
            int r2 = equals
            int r2 = r2 + 115
            int r5 = r2 % 128
            getMin = r5
            int r2 = r2 % 2
            goto L_0x01b2
        L_0x01ac:
            r2 = move-exception
            java.lang.String r5 = "get status code error: "
            com.alibaba.griver.base.common.logger.GriverLogger.e(r1, r5, r2)
        L_0x01b2:
            int r2 = r10.getStatusCode()     // Catch:{ Exception -> 0x01dc }
            r5 = 200(0xc8, float:2.8E-43)
            if (r2 == r5) goto L_0x01bb
            r3 = 1
        L_0x01bb:
            if (r3 == r4) goto L_0x01be
            goto L_0x01d4
        L_0x01be:
            int r2 = r10.getStatusCode()     // Catch:{ Exception -> 0x01dc }
            r3 = 202(0xca, float:2.83E-43)
            if (r2 == r3) goto L_0x01d4
            int r2 = r10.getStatusCode()     // Catch:{ Exception -> 0x01dc }
            r3 = 201(0xc9, float:2.82E-43)
            if (r2 != r3) goto L_0x01cf
            goto L_0x01d4
        L_0x01cf:
            java.io.InputStream r2 = r0.getErrorStream()     // Catch:{ Exception -> 0x01dc }
            goto L_0x01d8
        L_0x01d4:
            java.io.InputStream r2 = r0.getInputStream()     // Catch:{ Exception -> 0x01dc }
        L_0x01d8:
            r10.setInputStream(r2)     // Catch:{ Exception -> 0x01dc }
            goto L_0x01e2
        L_0x01dc:
            r2 = move-exception
            java.lang.String r3 = "get input stream: "
            com.alibaba.griver.base.common.logger.GriverLogger.e(r1, r3, r2)
        L_0x01e2:
            java.util.Map r0 = r0.getHeaderFields()
            r10.setHeaders(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.common.network.GriverURLTransport.request(com.alibaba.griver.api.common.network.HttpRequest):com.alibaba.griver.api.common.network.HttpResponse");
    }

    private static String setMax(int i, int[] iArr, byte[] bArr, char[] cArr) {
        char[] cArr2 = getMax;
        int i2 = length;
        int i3 = 0;
        if (setMin) {
            int length2 = bArr.length;
            char[] cArr3 = new char[length2];
            int i4 = 0;
            while (true) {
                if (i4 >= length2) {
                    return new String(cArr3);
                }
                cArr3[i4] = (char) (cArr2[bArr[(length2 - 1) - i4] + i] - i2);
                i4++;
            }
        } else if (setMax) {
            int length3 = cArr.length;
            char[] cArr4 = new char[length3];
            while (true) {
                if ((i3 < length3 ? 'Z' : 16) == 16) {
                    break;
                }
                int i5 = equals + 41;
                getMin = i5 % 128;
                if (i5 % 2 != 0) {
                    cArr4[i3] = (char) (cArr2[cArr[(length3 * 1) >>> i3] / i] >> i2);
                    i3 += 86;
                } else {
                    cArr4[i3] = (char) (cArr2[cArr[(length3 - 1) - i3] - i] - i2);
                    i3++;
                }
            }
            String str = new String(cArr4);
            int i6 = getMin + 91;
            equals = i6 % 128;
            if (i6 % 2 != 0) {
                return str;
            }
            Object obj = null;
            super.hashCode();
            return str;
        } else {
            int length4 = iArr.length;
            char[] cArr5 = new char[length4];
            while (i3 < length4) {
                cArr5[i3] = (char) (cArr2[iArr[(length4 - 1) - i3] - i] - i2);
                i3++;
            }
            return new String(cArr5);
        }
    }
}
