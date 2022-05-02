package o;

import com.mixpanel.android.util.RemoteService;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public final class onFocusSearchFailed implements RemoteService {
    private static boolean getMax = false;
    private static int getMin = 0;
    private static long length = -1816622556869657657L;
    private static char[] setMax = {22416, 11350, 40973, 9405, 47329};
    private static int setMin = 1;

    static /* synthetic */ boolean length() {
        try {
            int i = getMin + 23;
            try {
                setMin = i % 128;
                int i2 = i % 2;
                boolean z = getMax;
                int i3 = getMin + 49;
                setMin = i3 % 128;
                int i4 = i3 % 2;
                return z;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    static /* synthetic */ boolean setMin(boolean z) {
        int i = setMin + 19;
        getMin = i % 128;
        boolean z2 = i % 2 != 0;
        getMax = z;
        if (z2) {
            Object[] objArr = null;
            int length2 = objArr.length;
        }
        try {
            int i2 = getMin + 33;
            setMin = i2 % 128;
            int i3 = i2 % 2;
            return z;
        } catch (Exception e) {
            throw e;
        }
    }

    public final void getMin() {
        new Thread(new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:15:0x0031 A[Catch:{ Exception -> 0x0034 }] */
            /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r3 = this;
                    java.lang.String r0 = "api.mixpanel.com"
                    java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch:{ Exception -> 0x0034 }
                    java.lang.String r1 = "decide.mixpanel.com"
                    java.net.InetAddress r1 = java.net.InetAddress.getByName(r1)     // Catch:{ Exception -> 0x0034 }
                    boolean r2 = r0.isLoopbackAddress()     // Catch:{ Exception -> 0x0034 }
                    if (r2 != 0) goto L_0x0027
                    boolean r0 = r0.isAnyLocalAddress()     // Catch:{ Exception -> 0x0034 }
                    if (r0 != 0) goto L_0x0027
                    boolean r0 = r1.isLoopbackAddress()     // Catch:{ Exception -> 0x0034 }
                    if (r0 != 0) goto L_0x0027
                    boolean r0 = r1.isAnyLocalAddress()     // Catch:{ Exception -> 0x0034 }
                    if (r0 == 0) goto L_0x0025
                    goto L_0x0027
                L_0x0025:
                    r0 = 0
                    goto L_0x0028
                L_0x0027:
                    r0 = 1
                L_0x0028:
                    o.onFocusSearchFailed.setMin((boolean) r0)     // Catch:{ Exception -> 0x0034 }
                    boolean r0 = o.onFocusSearchFailed.length()     // Catch:{ Exception -> 0x0034 }
                    if (r0 == 0) goto L_0x0034
                    o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ Exception -> 0x0034 }
                L_0x0034:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o.onFocusSearchFailed.AnonymousClass3.run():void");
            }
        }).start();
        try {
            int i = setMin + 39;
            getMin = i % 128;
            int i2 = i % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r0 != false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (length(r5) == false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r4 = ((android.net.ConnectivityManager) r4.getSystemService("connectivity")).getActiveNetworkInfo();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r4 != null) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0038, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (r2 == true) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        r4 = r4.isConnectedOrConnecting();
        o.findOnePartiallyOrCompletelyInvisibleChild.getMax();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        r4 = getMin + 111;
        setMin = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        o.findOnePartiallyOrCompletelyInvisibleChild.getMax();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0052, code lost:
        o.findOnePartiallyOrCompletelyInvisibleChild.getMax();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (getMax != false) goto L_0x0021;
     */
    @android.annotation.SuppressLint({"MissingPermission"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean setMin(android.content.Context r4, o.prepareForDrop r5) {
        /*
            r3 = this;
            int r0 = setMin
            int r0 = r0 + 39
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            r1 = 49
            if (r0 == 0) goto L_0x0011
            r0 = 49
            goto L_0x0013
        L_0x0011:
            r0 = 79
        L_0x0013:
            r2 = 0
            if (r0 == r1) goto L_0x001b
            boolean r0 = getMax
            if (r0 == 0) goto L_0x0022
            goto L_0x0021
        L_0x001b:
            boolean r0 = getMax
            r1 = 0
            int r1 = r1.length     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0022
        L_0x0021:
            return r2
        L_0x0022:
            boolean r5 = length(r5)
            if (r5 == 0) goto L_0x0029
            return r2
        L_0x0029:
            r5 = 1
            java.lang.String r0 = "connectivity"
            java.lang.Object r4 = r4.getSystemService(r0)     // Catch:{ SecurityException -> 0x0052 }
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4     // Catch:{ SecurityException -> 0x0052 }
            android.net.NetworkInfo r4 = r4.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x0052 }
            if (r4 != 0) goto L_0x0039
            r2 = 1
        L_0x0039:
            if (r2 == r5) goto L_0x0044
            boolean r4 = r4.isConnectedOrConnecting()     // Catch:{ SecurityException -> 0x0052 }
            o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ SecurityException -> 0x0052 }
            r5 = r4
            goto L_0x0055
        L_0x0044:
            int r4 = getMin
            int r4 = r4 + 111
            int r0 = r4 % 128
            setMin = r0
            int r4 = r4 % 2
            o.findOnePartiallyOrCompletelyInvisibleChild.getMax()     // Catch:{ SecurityException -> 0x0052 }
            goto L_0x0055
        L_0x0052:
            o.findOnePartiallyOrCompletelyInvisibleChild.getMax()
        L_0x0055:
            int r4 = getMin
            int r4 = r4 + 39
            int r0 = r4 % 128
            setMin = r0
            int r4 = r4 % 2
            return r5
        L_0x0060:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onFocusSearchFailed.setMin(android.content.Context, o.prepareForDrop):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if ((r4 == null) != true) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        if (r4 != null) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean length(o.prepareForDrop r4) {
        /*
            int r0 = getMin
            int r0 = r0 + 43
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            r1 = 81
            r2 = 1
            if (r0 != 0) goto L_0x0012
            r0 = 81
            goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            r3 = 0
            if (r0 == r2) goto L_0x0023
            r0 = 83
            int r0 = r0 / r3
            if (r4 == 0) goto L_0x001d
            r0 = 0
            goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            if (r0 == r2) goto L_0x003a
            goto L_0x0025
        L_0x0021:
            r4 = move-exception
            throw r4
        L_0x0023:
            if (r4 == 0) goto L_0x003a
        L_0x0025:
            boolean r4 = r4.getMax()     // Catch:{ Exception -> 0x0036 }
            if (r4 == 0) goto L_0x003a
            int r4 = getMin
            int r4 = r4 + 115
            int r0 = r4 % 128
            setMin = r0
            int r4 = r4 % 2
            goto L_0x0045
        L_0x0036:
            o.findOnePartiallyOrCompletelyInvisibleChild.setMax()
            goto L_0x004f
        L_0x003a:
            int r4 = getMin
            int r4 = r4 + 121
            int r0 = r4 % 128
            setMin = r0
            int r4 = r4 % 2
            r2 = 0
        L_0x0045:
            int r4 = getMin     // Catch:{ Exception -> 0x0050 }
            int r4 = r4 + r1
            int r0 = r4 % 128
            setMin = r0     // Catch:{ Exception -> 0x0050 }
            int r4 = r4 % 2
            r3 = r2
        L_0x004f:
            return r3
        L_0x0050:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onFocusSearchFailed.length(o.prepareForDrop):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v39, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v41, resolved type: javax.net.ssl.HttpsURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v47, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v54, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v55, resolved type: java.io.OutputStream} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r9v3, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r3v4, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r9v27 */
    /* JADX WARNING: type inference failed for: r9v28 */
    /* JADX WARNING: type inference failed for: r9v44 */
    /* JADX WARNING: type inference failed for: r9v46 */
    /* JADX WARNING: type inference failed for: r9v50 */
    /* JADX WARNING: type inference failed for: r9v56 */
    /* JADX WARNING: type inference failed for: r9v57 */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0130, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0131, code lost:
        r7 = r3;
        r9 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0135, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0136, code lost:
        r9 = r3;
        r10 = r9;
        r11 = r10;
        r9 = r9;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x016f A[SYNTHETIC, Splitter:B:100:0x016f] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0176 A[SYNTHETIC, Splitter:B:104:0x0176] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0190 A[SYNTHETIC, Splitter:B:112:0x0190] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0197 A[SYNTHETIC, Splitter:B:116:0x0197] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01a6 A[SYNTHETIC, Splitter:B:124:0x01a6] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0015 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0130 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:5:0x0024] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0135 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:5:0x0024] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0149 A[Catch:{ all -> 0x0158 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0157 A[Catch:{ all -> 0x0158 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0168 A[SYNTHETIC, Splitter:B:96:0x0168] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] getMax(java.lang.String r16, java.util.Map<java.lang.String, java.lang.Object> r17, javax.net.ssl.SSLSocketFactory r18) throws com.mixpanel.android.util.RemoteService.ServiceUnavailableException, java.io.IOException {
        /*
            r15 = this;
            r0 = r18
            int r1 = setMin
            int r1 = r1 + 15
            int r2 = r1 % 128
            getMin = r2
            int r1 = r1 % 2
            o.findOnePartiallyOrCompletelyInvisibleChild.getMax()
            r1 = 1
            r2 = 0
            r3 = 0
            r6 = r3
            r4 = 0
            r5 = 0
        L_0x0015:
            r7 = 3
            if (r4 >= r7) goto L_0x01b5
            int r8 = setMin
            int r8 = r8 + 47
            int r9 = r8 % 128
            getMin = r9
            int r8 = r8 % 2
            if (r5 != 0) goto L_0x01b5
            java.net.URL r7 = new java.net.URL     // Catch:{ EOFException -> 0x015b, IOException -> 0x0135, all -> 0x0130 }
            r8 = r16
            r7.<init>(r8)     // Catch:{ EOFException -> 0x015d, IOException -> 0x0135, all -> 0x0130 }
            java.net.URLConnection r7 = r7.openConnection()     // Catch:{ EOFException -> 0x015d, IOException -> 0x0135, all -> 0x0130 }
            java.lang.Object r7 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r7)     // Catch:{ EOFException -> 0x015d, IOException -> 0x0135, all -> 0x0130 }
            java.net.URLConnection r7 = (java.net.URLConnection) r7     // Catch:{ EOFException -> 0x015d, IOException -> 0x0135, all -> 0x0130 }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ EOFException -> 0x015d, IOException -> 0x0135, all -> 0x0130 }
            if (r0 == 0) goto L_0x0061
            int r9 = getMin
            int r9 = r9 + 39
            int r10 = r9 % 128
            setMin = r10
            int r9 = r9 % 2
            boolean r9 = r7 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            if (r9 == 0) goto L_0x0061
            int r9 = getMin
            int r9 = r9 + 27
            int r10 = r9 % 128
            setMin = r10
            int r9 = r9 % 2
            if (r9 != 0) goto L_0x005b
            r9 = r7
            javax.net.ssl.HttpsURLConnection r9 = (javax.net.ssl.HttpsURLConnection) r9     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            r9.setSSLSocketFactory(r0)     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            int r9 = r3.length     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            goto L_0x0061
        L_0x005b:
            r9 = r7
            javax.net.ssl.HttpsURLConnection r9 = (javax.net.ssl.HttpsURLConnection) r9     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            r9.setSSLSocketFactory(r0)     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
        L_0x0061:
            r9 = 2000(0x7d0, float:2.803E-42)
            r7.setConnectTimeout(r9)     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            r9 = 30000(0x7530, float:4.2039E-41)
            r7.setReadTimeout(r9)     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            if (r17 == 0) goto L_0x0109
            android.net.Uri$Builder r9 = new android.net.Uri$Builder     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            r9.<init>()     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            java.util.Set r10 = r17.entrySet()     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
        L_0x007a:
            boolean r11 = r10.hasNext()     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            r12 = 74
            if (r11 == 0) goto L_0x0085
            r11 = 24
            goto L_0x0087
        L_0x0085:
            r11 = 74
        L_0x0087:
            if (r11 == r12) goto L_0x00a1
            java.lang.Object r11 = r10.next()     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            java.lang.Object r12 = r11.getKey()     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            java.lang.Object r11 = r11.getValue()     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            java.lang.String r11 = r11.toString()     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            r9.appendQueryParameter(r12, r11)     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            goto L_0x007a
        L_0x00a1:
            android.net.Uri r9 = r9.build()     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            java.lang.String r9 = r9.getEncodedQuery()     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            byte[] r10 = r9.getBytes()     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            int r10 = r10.length     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            r7.setFixedLengthStreamingMode(r10)     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            r7.setDoOutput(r1)     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            java.lang.String r10 = "POST"
            r7.setRequestMethod(r10)     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            java.io.OutputStream r10 = r7.getOutputStream()     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            java.io.BufferedOutputStream r11 = new java.io.BufferedOutputStream     // Catch:{ EOFException -> 0x0105, IOException -> 0x0101, all -> 0x00fd }
            r11.<init>(r10)     // Catch:{ EOFException -> 0x0105, IOException -> 0x0101, all -> 0x00fd }
            java.lang.String r12 = ""
            r13 = 48
            int r12 = android.text.TextUtils.indexOf(r12, r13, r2)     // Catch:{ EOFException -> 0x00fa, IOException -> 0x00f7, all -> 0x00f3 }
            int r12 = r12 + r1
            int r13 = android.view.View.combineMeasuredStates(r2, r2)     // Catch:{ EOFException -> 0x00fa, IOException -> 0x00f7, all -> 0x00f3 }
            int r13 = r13 + 22469
            char r13 = (char) r13     // Catch:{ EOFException -> 0x00fa, IOException -> 0x00f7, all -> 0x00f3 }
            int r14 = android.view.ViewConfiguration.getJumpTapTimeout()     // Catch:{ EOFException -> 0x00fa, IOException -> 0x00f7, all -> 0x00f3 }
            int r14 = r14 >> 16
            int r14 = 5 - r14
            java.lang.String r12 = setMax(r12, r13, r14)     // Catch:{ EOFException -> 0x00fa, IOException -> 0x00f7, all -> 0x00f3 }
            java.lang.String r12 = r12.intern()     // Catch:{ EOFException -> 0x00fa, IOException -> 0x00f7, all -> 0x00f3 }
            byte[] r9 = r9.getBytes(r12)     // Catch:{ EOFException -> 0x00fa, IOException -> 0x00f7, all -> 0x00f3 }
            r11.write(r9)     // Catch:{ EOFException -> 0x00fa, IOException -> 0x00f7, all -> 0x00f3 }
            r11.flush()     // Catch:{ EOFException -> 0x00fa, IOException -> 0x00f7, all -> 0x00f3 }
            r11.close()     // Catch:{ EOFException -> 0x00fa, IOException -> 0x00f7, all -> 0x00f3 }
            r10.close()     // Catch:{ EOFException -> 0x0105, IOException -> 0x0101, all -> 0x00fd }
            goto L_0x0109
        L_0x00f3:
            r0 = move-exception
            r9 = r3
            goto L_0x018d
        L_0x00f7:
            r0 = move-exception
            r9 = r3
            goto L_0x012c
        L_0x00fa:
            r9 = r3
            goto L_0x0161
        L_0x00fd:
            r0 = move-exception
            r9 = r3
            goto L_0x018e
        L_0x0101:
            r0 = move-exception
            r9 = r3
            r11 = r9
            goto L_0x012c
        L_0x0105:
            r9 = r3
            r11 = r9
            goto L_0x0161
        L_0x0109:
            java.io.InputStream r9 = r7.getInputStream()     // Catch:{ EOFException -> 0x012e, IOException -> 0x0128, all -> 0x0125 }
            byte[] r6 = setMin((java.io.InputStream) r9)     // Catch:{ EOFException -> 0x0123, IOException -> 0x0120, all -> 0x011c }
            r9.close()     // Catch:{ EOFException -> 0x0123, IOException -> 0x0120, all -> 0x011c }
            if (r7 == 0) goto L_0x0119
            r7.disconnect()
        L_0x0119:
            r5 = 1
            goto L_0x0015
        L_0x011c:
            r0 = move-exception
            r10 = r3
            goto L_0x018e
        L_0x0120:
            r0 = move-exception
            r10 = r3
            goto L_0x012b
        L_0x0123:
            r10 = r3
            goto L_0x0160
        L_0x0125:
            r0 = move-exception
            r9 = r3
            goto L_0x0133
        L_0x0128:
            r0 = move-exception
            r9 = r3
            r10 = r9
        L_0x012b:
            r11 = r10
        L_0x012c:
            r3 = r7
            goto L_0x0139
        L_0x012e:
            r9 = r3
            goto L_0x015f
        L_0x0130:
            r0 = move-exception
            r7 = r3
            r9 = r7
        L_0x0133:
            r10 = r9
            goto L_0x018e
        L_0x0135:
            r0 = move-exception
            r9 = r3
            r10 = r9
            r11 = r10
        L_0x0139:
            int r4 = r3.getResponseCode()     // Catch:{ all -> 0x0158 }
            r5 = 500(0x1f4, float:7.0E-43)
            if (r4 < r5) goto L_0x0157
            int r4 = r3.getResponseCode()     // Catch:{ all -> 0x0158 }
            r5 = 599(0x257, float:8.4E-43)
            if (r4 > r5) goto L_0x0157
            com.mixpanel.android.util.RemoteService$ServiceUnavailableException r0 = new com.mixpanel.android.util.RemoteService$ServiceUnavailableException     // Catch:{ all -> 0x0158 }
            java.lang.String r4 = "Service Unavailable"
            java.lang.String r5 = "Retry-After"
            java.lang.String r5 = r3.getHeaderField(r5)     // Catch:{ all -> 0x0158 }
            r0.<init>(r4, r5)     // Catch:{ all -> 0x0158 }
            throw r0     // Catch:{ all -> 0x0158 }
        L_0x0157:
            throw r0     // Catch:{ all -> 0x0158 }
        L_0x0158:
            r0 = move-exception
            r7 = r3
            goto L_0x018d
        L_0x015b:
            r8 = r16
        L_0x015d:
            r7 = r3
            r9 = r7
        L_0x015f:
            r10 = r9
        L_0x0160:
            r11 = r10
        L_0x0161:
            o.findOnePartiallyOrCompletelyInvisibleChild.length()     // Catch:{ all -> 0x018c }
            int r4 = r4 + 1
            if (r11 == 0) goto L_0x016d
            r11.close()     // Catch:{ IOException -> 0x016c }
            goto L_0x016d
        L_0x016c:
        L_0x016d:
            if (r10 == 0) goto L_0x0174
            r10.close()     // Catch:{ IOException -> 0x0173 }
            goto L_0x0174
        L_0x0173:
        L_0x0174:
            if (r9 == 0) goto L_0x017b
            r9.close()     // Catch:{ IOException -> 0x017a }
            goto L_0x017b
        L_0x017a:
        L_0x017b:
            if (r7 == 0) goto L_0x0015
            int r9 = getMin
            int r9 = r9 + 107
            int r10 = r9 % 128
            setMin = r10
            int r9 = r9 % 2
            r7.disconnect()
            goto L_0x0015
        L_0x018c:
            r0 = move-exception
        L_0x018d:
            r3 = r11
        L_0x018e:
            if (r3 == 0) goto L_0x0195
            r3.close()     // Catch:{ IOException -> 0x0194 }
            goto L_0x0195
        L_0x0194:
        L_0x0195:
            if (r10 == 0) goto L_0x019c
            r10.close()     // Catch:{ IOException -> 0x019b }
            goto L_0x019c
        L_0x019b:
        L_0x019c:
            r3 = 6
            if (r9 == 0) goto L_0x01a1
            r4 = 6
            goto L_0x01a3
        L_0x01a1:
            r4 = 64
        L_0x01a3:
            if (r4 == r3) goto L_0x01a6
            goto L_0x01ab
        L_0x01a6:
            r9.close()     // Catch:{ IOException -> 0x01aa }
            goto L_0x01ab
        L_0x01aa:
        L_0x01ab:
            if (r7 == 0) goto L_0x01ae
            r2 = 1
        L_0x01ae:
            if (r2 == r1) goto L_0x01b1
            goto L_0x01b4
        L_0x01b1:
            r7.disconnect()
        L_0x01b4:
            throw r0
        L_0x01b5:
            if (r4 < r7) goto L_0x01c4
            int r0 = getMin
            int r0 = r0 + 73
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            o.findOnePartiallyOrCompletelyInvisibleChild.getMax()
        L_0x01c4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onFocusSearchFailed.getMax(java.lang.String, java.util.Map, javax.net.ssl.SSLSocketFactory):byte[]");
    }

    private static byte[] setMin(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        int i = setMin + 125;
        getMin = i % 128;
        int i2 = i % 2;
        while (true) {
            int read = inputStream.read(bArr, 0, 8192);
            if (!(read == -1)) {
                try {
                    int i3 = setMin + 31;
                    try {
                        getMin = i3 % 128;
                        int i4 = i3 % 2;
                        byteArrayOutputStream.write(bArr, 0, read);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    private static String setMax(int i, char c, int i2) {
        int i3;
        char[] cArr;
        int i4;
        int i5 = getMin + 7;
        setMin = i5 % 128;
        if (!(i5 % 2 == 0)) {
            cArr = new char[i2];
            i3 = 0;
        } else {
            cArr = new char[i2];
            i3 = 1;
        }
        while (i3 < i2) {
            int i6 = getMin + 49;
            setMin = i6 % 128;
            if (!(i6 % 2 != 0)) {
                cArr[i3] = (char) ((int) ((((long) setMax[i % i3]) / (((long) i3) ^ length)) + ((long) c)));
                i4 = i3 + 78;
            } else {
                try {
                    try {
                        cArr[i3] = (char) ((int) ((((long) setMax[i + i3]) ^ (((long) i3) * length)) ^ ((long) c)));
                        i4 = i3 + 1;
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
        return new String(cArr);
    }
}
