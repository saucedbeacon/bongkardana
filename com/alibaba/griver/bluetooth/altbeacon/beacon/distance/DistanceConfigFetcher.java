package com.alibaba.griver.bluetooth.altbeacon.beacon.distance;

public class DistanceConfigFetcher {

    /* renamed from: a  reason: collision with root package name */
    private int f10249a = -1;
    private String b;
    private String c;
    protected Exception mException;
    protected String mResponse;

    public DistanceConfigFetcher(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public int getResponseCode() {
        return this.f10249a;
    }

    public String getResponseString() {
        return this.mResponse;
    }

    public Exception getException() {
        return this.mException;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b8 A[EDGE_INSN: B:49:0x00b8->B:37:0x00b8 ?: BREAK  
    EDGE_INSN: B:50:0x00b8->B:37:0x00b8 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x000d A[LOOP:0: B:1:0x000d->B:48:0x000d, LOOP_END, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void request() {
        /*
            r11 = this;
            r0 = 0
            r11.mResponse = r0
            java.lang.String r1 = r11.b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
            r5 = r0
            r4 = 0
        L_0x000d:
            r6 = 1
            java.lang.String r7 = "DistanceConfigFetcher"
            if (r4 == 0) goto L_0x002a
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r8 = r11.b
            r1[r3] = r8
            java.lang.String r8 = "Location"
            java.lang.String r9 = r5.getHeaderField(r8)
            r1[r6] = r9
            java.lang.String r9 = "Following redirect from %s to %s"
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.d(r7, r9, r1)
            java.lang.String r1 = r5.getHeaderField(r8)
        L_0x002a:
            int r4 = r4 + 1
            r8 = -1
            r11.f10249a = r8
            java.net.URL r8 = new java.net.URL     // Catch:{ Exception -> 0x0035 }
            r8.<init>(r1)     // Catch:{ Exception -> 0x0035 }
            goto L_0x0044
        L_0x0035:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.String r10 = r11.b
            r9[r3] = r10
            java.lang.String r10 = "Can't construct URL from: %s"
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.e(r7, r10, r9)
            r11.mException = r8
            r8 = r0
        L_0x0044:
            if (r8 != 0) goto L_0x004e
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r8 = "URL is null.  Cannot make request"
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.d(r7, r8, r6)
            goto L_0x00a6
        L_0x004e:
            java.net.URLConnection r8 = r8.openConnection()     // Catch:{ SecurityException -> 0x0099, FileNotFoundException -> 0x008c, IOException -> 0x007f }
            java.lang.Object r8 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r8)     // Catch:{ SecurityException -> 0x0099, FileNotFoundException -> 0x008c, IOException -> 0x007f }
            java.net.URLConnection r8 = (java.net.URLConnection) r8     // Catch:{ SecurityException -> 0x0099, FileNotFoundException -> 0x008c, IOException -> 0x007f }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ SecurityException -> 0x0099, FileNotFoundException -> 0x008c, IOException -> 0x007f }
            java.lang.String r5 = "User-Agent"
            java.lang.String r9 = r11.c     // Catch:{ SecurityException -> 0x007d, FileNotFoundException -> 0x007b, IOException -> 0x0079 }
            r8.addRequestProperty(r5, r9)     // Catch:{ SecurityException -> 0x007d, FileNotFoundException -> 0x007b, IOException -> 0x0079 }
            int r5 = r8.getResponseCode()     // Catch:{ SecurityException -> 0x007d, FileNotFoundException -> 0x007b, IOException -> 0x0079 }
            r11.f10249a = r5     // Catch:{ SecurityException -> 0x007d, FileNotFoundException -> 0x007b, IOException -> 0x0079 }
            java.lang.String r5 = "response code is %s"
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ SecurityException -> 0x007d, FileNotFoundException -> 0x007b, IOException -> 0x0079 }
            int r9 = r8.getResponseCode()     // Catch:{ SecurityException -> 0x007d, FileNotFoundException -> 0x007b, IOException -> 0x0079 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ SecurityException -> 0x007d, FileNotFoundException -> 0x007b, IOException -> 0x0079 }
            r6[r3] = r9     // Catch:{ SecurityException -> 0x007d, FileNotFoundException -> 0x007b, IOException -> 0x0079 }
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.d(r7, r5, r6)     // Catch:{ SecurityException -> 0x007d, FileNotFoundException -> 0x007b, IOException -> 0x0079 }
            goto L_0x00a5
        L_0x0079:
            r5 = move-exception
            goto L_0x0082
        L_0x007b:
            r5 = move-exception
            goto L_0x008f
        L_0x007d:
            r5 = move-exception
            goto L_0x009c
        L_0x007f:
            r6 = move-exception
            r8 = r5
            r5 = r6
        L_0x0082:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r9 = "Can't reach server"
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.w(r5, r7, r9, r6)
            r11.mException = r5
            goto L_0x00a5
        L_0x008c:
            r6 = move-exception
            r8 = r5
            r5 = r6
        L_0x008f:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r9 = "No data exists at \"+urlString"
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.w(r5, r7, r9, r6)
            r11.mException = r5
            goto L_0x00a5
        L_0x0099:
            r6 = move-exception
            r8 = r5
            r5 = r6
        L_0x009c:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r9 = "Can't reach sever.  Have you added android.permission.INTERNET to your manifest?"
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.w(r5, r7, r9, r6)
            r11.mException = r5
        L_0x00a5:
            r5 = r8
        L_0x00a6:
            r6 = 10
            if (r4 >= r6) goto L_0x00b8
            int r6 = r11.f10249a
            r8 = 302(0x12e, float:4.23E-43)
            if (r6 == r8) goto L_0x000d
            r8 = 301(0x12d, float:4.22E-43)
            if (r6 == r8) goto L_0x000d
            r8 = 303(0x12f, float:4.25E-43)
            if (r6 == r8) goto L_0x000d
        L_0x00b8:
            java.lang.Exception r0 = r11.mException
            if (r0 != 0) goto L_0x00e8
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00de }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00de }
            java.io.InputStream r4 = r5.getInputStream()     // Catch:{ Exception -> 0x00de }
            r1.<init>(r4)     // Catch:{ Exception -> 0x00de }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00de }
        L_0x00ca:
            java.lang.String r1 = r0.readLine()     // Catch:{ Exception -> 0x00de }
            if (r1 == 0) goto L_0x00d4
            r2.append(r1)     // Catch:{ Exception -> 0x00de }
            goto L_0x00ca
        L_0x00d4:
            r0.close()     // Catch:{ Exception -> 0x00de }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x00de }
            r11.mResponse = r0     // Catch:{ Exception -> 0x00de }
            return
        L_0x00de:
            r0 = move-exception
            r11.mException = r0
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "error reading beacon data"
            com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager.w(r0, r7, r2, r1)
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.bluetooth.altbeacon.beacon.distance.DistanceConfigFetcher.request():void");
    }
}
