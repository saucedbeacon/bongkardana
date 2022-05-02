package com.ta.audid.f;

import id.dana.sendmoney.summary.SummaryActivity;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static f f9840a = null;
    private static long getMax = 0;
    private static char[] getMin = null;
    private static int length = 1;
    private static int setMax;

    static void getMin() {
        getMin = new char[]{'U', 58546, 51594, 44703, 37792};
        getMax = 7376324139821491430L;
    }

    static {
        getMin();
        System.setProperty("http.keepAlive", SummaryActivity.CHECKED);
        try {
            int i = setMax + 67;
            length = i % 128;
            int i2 = i % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(38:3|4|5|6|(7:8|(5:10|11|(1:13)(1:14)|(1:16)|34)(2:17|(1:19)(1:20))|22|(1:24)(1:25)|(4:27|28|(1:30)|34)(1:31)|33|34)|35|(2:37|38)(0)|44|(5:46|47|48|49|50)(3:55|56|57)|58|(1:60)|61|(1:63)(1:64)|(3:66|67|68)|69|71|72|(6:74|75|76|77|78|(22:80|81|82|(2:89|90)|93|94|97|98|(3:100|(3:102|(1:104)(1:105)|(1:107))|108)|109|110|111|112|113|114|115|(3:116|(1:118)(1:119)|(1:121)(1:122))|123|167|168|(1:170)|220))|87|(0)|93|94|97|98|(0)|109|110|111|112|113|114|115|(4:116|(0)(0)|(0)(0)|121)|123|167|168|(0)|220) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        if ((f9840a == null) != true) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006f, code lost:
        if (android.text.TextUtils.isEmpty(r4.getHost()) == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0092, code lost:
        if (r5 != null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0098, code lost:
        if (r5 != null) goto L_0x009a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x0246 */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0221 A[Catch:{ Exception -> 0x0246 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0268 A[Catch:{ IOException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x026b A[Catch:{ IOException -> 0x0284 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x026f A[Catch:{ IOException -> 0x0284 }, LOOP:0: B:116:0x025f->B:121:0x026f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0273 A[EDGE_INSN: B:122:0x0273->B:123:? ?: BREAK  , SYNTHETIC, Splitter:B:122:0x0273] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02d8 A[SYNTHETIC, Splitter:B:154:0x02d8] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02e4 A[SYNTHETIC, Splitter:B:164:0x02e4] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0311 A[SYNTHETIC, Splitter:B:182:0x0311] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0328 A[SYNTHETIC, Splitter:B:192:0x0328] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x034c A[SYNTHETIC, Splitter:B:205:0x034c] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x02c5 A[EDGE_INSN: B:231:0x02c5->B:149:0x02c5 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d0 A[SYNTHETIC, Splitter:B:89:0x01d0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ta.audid.f.b a(java.lang.String r17, java.lang.String r18, boolean r19) {
        /*
            r0 = r18
            java.lang.String r1 = ""
            com.ta.audid.f.b r2 = new com.ta.audid.f.b
            r2.<init>()
            boolean r3 = android.text.TextUtils.isEmpty(r17)
            if (r3 == 0) goto L_0x0010
            return r2
        L_0x0010:
            r3 = 0
            java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0383, IOException -> 0x037c, all -> 0x0375 }
            r5 = r17
            r4.<init>(r5)     // Catch:{ MalformedURLException -> 0x0383, IOException -> 0x037c, all -> 0x0375 }
            java.net.URLConnection r5 = r4.openConnection()     // Catch:{ MalformedURLException -> 0x0383, IOException -> 0x037c, all -> 0x0375 }
            java.lang.Object r5 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r5)     // Catch:{ MalformedURLException -> 0x0383, IOException -> 0x037c, all -> 0x0375 }
            java.net.URLConnection r5 = (java.net.URLConnection) r5     // Catch:{ MalformedURLException -> 0x0383, IOException -> 0x037c, all -> 0x0375 }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ MalformedURLException -> 0x0383, IOException -> 0x037c, all -> 0x0375 }
            boolean r6 = r5 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ MalformedURLException -> 0x0383, IOException -> 0x037c, all -> 0x0375 }
            r7 = 0
            r8 = 2
            r9 = 1
            if (r6 == 0) goto L_0x0084
            int r6 = setMax
            int r6 = r6 + 45
            int r10 = r6 % 128
            length = r10
            int r6 = r6 % r8
            if (r6 != 0) goto L_0x0041
            com.ta.audid.f.f r6 = f9840a     // Catch:{ MalformedURLException -> 0x0383, IOException -> 0x037c, all -> 0x0375 }
            int r10 = r7.length     // Catch:{ MalformedURLException -> 0x0383, IOException -> 0x037c, all -> 0x0375 }
            if (r6 != 0) goto L_0x003d
            r6 = 0
            goto L_0x003e
        L_0x003d:
            r6 = 1
        L_0x003e:
            if (r6 == r9) goto L_0x007c
            goto L_0x004b
        L_0x0041:
            com.ta.audid.f.f r6 = f9840a     // Catch:{ MalformedURLException -> 0x0383, IOException -> 0x037c, all -> 0x0375 }
            if (r6 != 0) goto L_0x0047
            r6 = 1
            goto L_0x0048
        L_0x0047:
            r6 = 0
        L_0x0048:
            if (r6 == r9) goto L_0x004b
            goto L_0x007c
        L_0x004b:
            int r6 = length
            int r6 = r6 + 9
            int r10 = r6 % 128
            setMax = r10
            int r6 = r6 % r8
            if (r6 == 0) goto L_0x0058
            r6 = 0
            goto L_0x0059
        L_0x0058:
            r6 = 1
        L_0x0059:
            if (r6 == r9) goto L_0x0067
            java.lang.String r6 = r4.getHost()     // Catch:{ MalformedURLException -> 0x0383, IOException -> 0x037c, all -> 0x0375 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ MalformedURLException -> 0x0383, IOException -> 0x037c, all -> 0x0375 }
            int r10 = r7.length     // Catch:{ MalformedURLException -> 0x0383, IOException -> 0x037c, all -> 0x0375 }
            if (r6 != 0) goto L_0x007c
            goto L_0x0071
        L_0x0067:
            java.lang.String r6 = r4.getHost()     // Catch:{ MalformedURLException -> 0x0383, IOException -> 0x037c, all -> 0x0375 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ MalformedURLException -> 0x0383, IOException -> 0x037c, all -> 0x0375 }
            if (r6 != 0) goto L_0x007c
        L_0x0071:
            com.ta.audid.f.f r6 = new com.ta.audid.f.f     // Catch:{ MalformedURLException -> 0x0383, IOException -> 0x037c, all -> 0x0375 }
            java.lang.String r4 = r4.getHost()     // Catch:{ MalformedURLException -> 0x0383, IOException -> 0x037c, all -> 0x0375 }
            r6.<init>(r4)     // Catch:{ MalformedURLException -> 0x0383, IOException -> 0x037c, all -> 0x0375 }
            f9840a = r6     // Catch:{ MalformedURLException -> 0x0383, IOException -> 0x037c, all -> 0x0375 }
        L_0x007c:
            r4 = r5
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4     // Catch:{ MalformedURLException -> 0x0383, IOException -> 0x037c, all -> 0x0375 }
            com.ta.audid.f.f r6 = f9840a     // Catch:{ MalformedURLException -> 0x0383, IOException -> 0x037c, all -> 0x0375 }
            r4.setSSLSocketFactory(r6)     // Catch:{ MalformedURLException -> 0x0383, IOException -> 0x037c, all -> 0x0375 }
        L_0x0084:
            int r4 = length
            int r4 = r4 + 69
            int r6 = r4 % 128
            setMax = r6
            int r4 = r4 % r8
            if (r4 == 0) goto L_0x0098
            super.hashCode()     // Catch:{ all -> 0x0095 }
            if (r5 == 0) goto L_0x0374
            goto L_0x009a
        L_0x0095:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0098:
            if (r5 == 0) goto L_0x0374
        L_0x009a:
            r5.setDoInput(r9)
            if (r19 == 0) goto L_0x00b2
            r5.setDoOutput(r9)     // Catch:{ Exception -> 0x00af }
            java.lang.String r4 = "POST"
            r5.setRequestMethod(r4)     // Catch:{ ProtocolException -> 0x00a8 }
            goto L_0x00b7
        L_0x00a8:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.ta.audid.g.m.e(r1, r0, r3)
            return r2
        L_0x00af:
            r0 = move-exception
            goto L_0x02fd
        L_0x00b2:
            java.lang.String r4 = "GET"
            r5.setRequestMethod(r4)     // Catch:{ ProtocolException -> 0x036e }
        L_0x00b7:
            r5.setUseCaches(r3)
            r4 = 10000(0x2710, float:1.4013E-41)
            r5.setConnectTimeout(r4)
            r5.setReadTimeout(r4)
            r5.setInstanceFollowRedirects(r9)
            java.lang.String r4 = "Content-Type"
            java.lang.String r6 = "application/x-www-form-urlencoded"
            r5.setRequestProperty(r4, r6)
            r10 = 0
            int r4 = android.widget.ExpandableListView.getPackedPositionChild(r10)
            r6 = -1
            int r4 = -1 - r4
            int r12 = android.view.ViewConfiguration.getScrollDefaultDelay()
            int r12 = r12 >> 16
            char r12 = (char) r12
            int r13 = android.view.View.MeasureSpec.getMode(r3)
            int r13 = r13 + 5
            java.lang.String r4 = getMin(r4, r12, r13)
            java.lang.String r4 = r4.intern()
            java.lang.String r12 = "Charset"
            r5.setRequestProperty(r12, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            com.ta.audid.a r12 = com.ta.audid.a.a()
            java.lang.String r12 = r12.getAppkey()
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 != 0) goto L_0x0114
            int r13 = setMax
            int r13 = r13 + 39
            int r14 = r13 % 128
            length = r14
            int r13 = r13 % r8
            java.lang.String r13 = "x-audid-appkey"
            r5.setRequestProperty(r13, r12)
            r4.append(r12)
        L_0x0114:
            com.ta.audid.a r12 = com.ta.audid.a.a()
            android.content.Context r12 = r12.getContext()
            java.lang.String r12 = r12.getPackageName()
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            r14 = 30
            if (r13 != 0) goto L_0x012a
            r13 = 6
            goto L_0x012c
        L_0x012a:
            r13 = 30
        L_0x012c:
            if (r13 == r14) goto L_0x0154
            java.lang.String r13 = "x-audid-appname"
            int r14 = android.view.KeyEvent.getMaxKeyCode()     // Catch:{ Exception -> 0x0154 }
            int r14 = r14 >> 16
            int r15 = android.text.TextUtils.getTrimmedLength(r1)     // Catch:{ Exception -> 0x0154 }
            char r15 = (char) r15     // Catch:{ Exception -> 0x0154 }
            int r16 = android.view.View.resolveSize(r3, r3)     // Catch:{ Exception -> 0x0154 }
            int r7 = r16 + 5
            java.lang.String r7 = getMin(r14, r15, r7)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r7 = r7.intern()     // Catch:{ Exception -> 0x0154 }
            java.lang.String r7 = java.net.URLEncoder.encode(r12, r7)     // Catch:{ Exception -> 0x0154 }
            r5.setRequestProperty(r13, r7)     // Catch:{ Exception -> 0x0154 }
            r4.append(r12)     // Catch:{ Exception -> 0x0154 }
        L_0x0154:
            java.lang.String r7 = "2.1.2"
            java.lang.String r12 = "x-audid-sdk"
            r5.setRequestProperty(r12, r7)
            r4.append(r7)
            com.ta.audid.a r7 = com.ta.audid.a.a()
            java.lang.String r7 = r7.b()
            java.lang.String r12 = "x-audid-timestamp"
            r5.setRequestProperty(r12, r7)
            java.lang.Object[] r13 = new java.lang.Object[r9]
            java.lang.String r14 = java.lang.String.valueOf(r7)
            java.lang.String r15 = "timestamp:"
            java.lang.String r14 = r15.concat(r14)
            r13[r3] = r14
            com.ta.audid.g.m.d(r1, r13)
            r4.append(r7)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = com.ta.audid.g.e.h(r4)
            byte[] r4 = r4.getBytes()
            java.lang.String r4 = com.ta.utdid2.a.a.b.encodeToString(r4, r8)
            java.lang.String r7 = "signature"
            r5.setRequestProperty(r7, r4)
            long r13 = java.lang.System.currentTimeMillis()
            r5.connect()     // Catch:{ all -> 0x0338 }
            if (r0 == 0) goto L_0x01cd
            int r4 = setMax     // Catch:{ Exception -> 0x01ca }
            int r4 = r4 + 59
            int r15 = r4 % 128
            length = r15
            int r4 = r4 % r8
            int r4 = r18.length()     // Catch:{ all -> 0x01c6 }
            if (r4 <= 0) goto L_0x01cd
            java.io.DataOutputStream r4 = new java.io.DataOutputStream     // Catch:{ all -> 0x01c6 }
            java.io.OutputStream r15 = r5.getOutputStream()     // Catch:{ all -> 0x01c6 }
            r4.<init>(r15)     // Catch:{ all -> 0x01c6 }
            r4.writeBytes(r0)     // Catch:{ all -> 0x01c3 }
            r4.flush()     // Catch:{ all -> 0x01c3 }
            goto L_0x01ce
        L_0x01c3:
            r0 = move-exception
            goto L_0x033a
        L_0x01c6:
            r0 = move-exception
            r7 = 0
            goto L_0x033b
        L_0x01ca:
            r0 = move-exception
            goto L_0x0337
        L_0x01cd:
            r4 = 0
        L_0x01ce:
            if (r4 == 0) goto L_0x01dd
            r4.close()     // Catch:{ IOException -> 0x01d4 }
            goto L_0x01dd
        L_0x01d4:
            r0 = move-exception
            r4 = r0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r3] = r4
            com.ta.audid.g.m.d(r1, r0)
        L_0x01dd:
            int r0 = r5.getResponseCode()     // Catch:{ Exception -> 0x01ea }
            r2.httpResponseCode = r0     // Catch:{ Exception -> 0x01ea }
            java.lang.String r0 = r5.getHeaderField(r7)     // Catch:{ Exception -> 0x01ea }
            r2.h = r0     // Catch:{ Exception -> 0x01ea }
            goto L_0x01f2
        L_0x01ea:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r9]
            r4[r3] = r0
            com.ta.audid.g.m.d(r1, r4)
        L_0x01f2:
            java.lang.String r0 = r5.getHeaderField(r12)     // Catch:{ Exception -> 0x0246 }
            long r6 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0246 }
            r2.timestamp = r6     // Catch:{ Exception -> 0x0246 }
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0246 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0246 }
            java.lang.String r6 = "repsonse.timestamp:"
            r4.<init>(r6)     // Catch:{ Exception -> 0x0246 }
            long r6 = r2.timestamp     // Catch:{ Exception -> 0x0246 }
            r4.append(r6)     // Catch:{ Exception -> 0x0246 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0246 }
            r0[r3] = r4     // Catch:{ Exception -> 0x0246 }
            com.ta.audid.g.m.d(r1, r0)     // Catch:{ Exception -> 0x0246 }
            com.ta.audid.a r0 = com.ta.audid.a.a()     // Catch:{ Exception -> 0x0246 }
            long r6 = r0.a()     // Catch:{ Exception -> 0x0246 }
            long r8 = r2.timestamp     // Catch:{ Exception -> 0x0246 }
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0246
            long r8 = r2.timestamp     // Catch:{ Exception -> 0x0246 }
            r10 = 1800000(0x1b7740, double:8.89318E-318)
            long r15 = r6 + r10
            int r0 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x023d
            long r8 = r2.timestamp     // Catch:{ Exception -> 0x0246 }
            long r6 = r6 - r10
            r0 = 43
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x0238
            r6 = 43
            goto L_0x023a
        L_0x0238:
            r6 = 94
        L_0x023a:
            if (r6 == r0) goto L_0x023d
            goto L_0x0246
        L_0x023d:
            com.ta.audid.a r0 = com.ta.audid.a.a()     // Catch:{ Exception -> 0x0246 }
            long r6 = r2.timestamp     // Catch:{ Exception -> 0x0246 }
            r0.a((long) r6)     // Catch:{ Exception -> 0x0246 }
        L_0x0246:
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01ca }
            long r6 = r6 - r13
            r2.rt = r6     // Catch:{ Exception -> 0x01ca }
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x01ca }
            r6.<init>()     // Catch:{ Exception -> 0x01ca }
            r7 = 2048(0x800, float:2.87E-42)
            java.io.DataInputStream r8 = new java.io.DataInputStream     // Catch:{ IOException -> 0x028b, all -> 0x0286 }
            java.io.InputStream r0 = r5.getInputStream()     // Catch:{ IOException -> 0x028b, all -> 0x0286 }
            r8.<init>(r0)     // Catch:{ IOException -> 0x028b, all -> 0x0286 }
            byte[] r0 = new byte[r7]     // Catch:{ IOException -> 0x0284 }
        L_0x025f:
            int r9 = r8.read(r0, r3, r7)     // Catch:{ IOException -> 0x0284 }
            r10 = 77
            r11 = -1
            if (r9 == r11) goto L_0x026b
            r11 = 84
            goto L_0x026d
        L_0x026b:
            r11 = 77
        L_0x026d:
            if (r11 == r10) goto L_0x0273
            r6.write(r0, r3, r9)     // Catch:{ IOException -> 0x0284 }
            goto L_0x025f
        L_0x0273:
            r8.close()     // Catch:{ Exception -> 0x0278 }
            goto L_0x02ef
        L_0x0278:
            r0 = move-exception
            r4 = r0
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r3] = r4
            com.ta.audid.g.m.d(r1, r0)
            goto L_0x02ef
        L_0x0284:
            r0 = move-exception
            goto L_0x028d
        L_0x0286:
            r0 = move-exception
            r2 = r0
            r7 = 0
            goto L_0x0326
        L_0x028b:
            r0 = move-exception
            r8 = 0
        L_0x028d:
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x0323 }
            r10[r3] = r0     // Catch:{ all -> 0x0323 }
            com.ta.audid.g.m.d(r1, r10)     // Catch:{ all -> 0x0323 }
            java.io.DataInputStream r9 = new java.io.DataInputStream     // Catch:{ Exception -> 0x0305 }
            java.io.InputStream r0 = r5.getErrorStream()     // Catch:{ Exception -> 0x0305 }
            r9.<init>(r0)     // Catch:{ Exception -> 0x0305 }
            byte[] r0 = new byte[r7]     // Catch:{ Exception -> 0x0302, all -> 0x02fe }
        L_0x02a0:
            int r5 = r9.read(r0, r3, r7)     // Catch:{ Exception -> 0x0302, all -> 0x02fe }
            r8 = -1
            if (r5 == r8) goto L_0x02c5
            int r10 = setMax
            int r10 = r10 + 45
            int r11 = r10 % 128
            length = r11
            r4 = 2
            int r10 = r10 % r4
            r11 = 86
            if (r10 != 0) goto L_0x02b8
            r10 = 86
            goto L_0x02ba
        L_0x02b8:
            r10 = 64
        L_0x02ba:
            if (r10 == r11) goto L_0x02c0
            r6.write(r0, r3, r5)     // Catch:{ Exception -> 0x0302, all -> 0x02fe }
            goto L_0x02a0
        L_0x02c0:
            r10 = 1
            r6.write(r0, r10, r5)     // Catch:{ Exception -> 0x0302, all -> 0x02fe }
            goto L_0x02a0
        L_0x02c5:
            int r0 = setMax
            int r0 = r0 + 5
            int r5 = r0 % 128
            length = r5
            r4 = 2
            int r0 = r0 % r4
            if (r0 != 0) goto L_0x02d4
            r4 = 1
            r12 = 0
            goto L_0x02d6
        L_0x02d4:
            r4 = 1
            r12 = 1
        L_0x02d6:
            if (r12 == r4) goto L_0x02e4
            r9.close()     // Catch:{ Exception -> 0x02e1 }
            r4 = 0
            int r0 = r4.length     // Catch:{ all -> 0x02de }
            goto L_0x02ef
        L_0x02de:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x02e1:
            r0 = move-exception
            r4 = 1
            goto L_0x02e8
        L_0x02e4:
            r9.close()     // Catch:{ Exception -> 0x02e1 }
            goto L_0x02ef
        L_0x02e8:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r0
            com.ta.audid.g.m.d(r1, r4)
        L_0x02ef:
            int r0 = r6.size()     // Catch:{ Exception -> 0x00af }
            if (r0 <= 0) goto L_0x0374
            byte[] r0 = r6.toByteArray()
            r2.data = r0
            goto L_0x0374
        L_0x02fd:
            throw r0
        L_0x02fe:
            r0 = move-exception
            r2 = r0
            r7 = r9
            goto L_0x0326
        L_0x0302:
            r0 = move-exception
            r7 = r9
            goto L_0x0307
        L_0x0305:
            r0 = move-exception
            r7 = r8
        L_0x0307:
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0320 }
            r5[r3] = r0     // Catch:{ all -> 0x0320 }
            com.ta.audid.g.m.d(r1, r5)     // Catch:{ all -> 0x0320 }
            if (r7 == 0) goto L_0x031f
            r7.close()     // Catch:{ Exception -> 0x0315 }
            goto L_0x031f
        L_0x0315:
            r0 = move-exception
            r4 = r0
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r3] = r4
            com.ta.audid.g.m.d(r1, r0)
        L_0x031f:
            return r2
        L_0x0320:
            r0 = move-exception
            r2 = r0
            goto L_0x0326
        L_0x0323:
            r0 = move-exception
            r2 = r0
            r7 = r8
        L_0x0326:
            if (r7 == 0) goto L_0x0336
            r7.close()     // Catch:{ Exception -> 0x032c }
            goto L_0x0336
        L_0x032c:
            r0 = move-exception
            r4 = r0
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r3] = r4
            com.ta.audid.g.m.d(r1, r0)
        L_0x0336:
            throw r2
        L_0x0337:
            throw r0
        L_0x0338:
            r0 = move-exception
            r4 = 0
        L_0x033a:
            r7 = r4
        L_0x033b:
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x035b }
            r5[r3] = r0     // Catch:{ all -> 0x035b }
            com.ta.audid.g.m.d(r1, r5)     // Catch:{ all -> 0x035b }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x035b }
            long r4 = r4 - r13
            r2.rt = r4     // Catch:{ all -> 0x035b }
            if (r7 == 0) goto L_0x035a
            r7.close()     // Catch:{ IOException -> 0x0350 }
            goto L_0x035a
        L_0x0350:
            r0 = move-exception
            r4 = r0
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r3] = r4
            com.ta.audid.g.m.d(r1, r0)
        L_0x035a:
            return r2
        L_0x035b:
            r0 = move-exception
            r2 = r0
            if (r7 == 0) goto L_0x036d
            r7.close()     // Catch:{ IOException -> 0x0363 }
            goto L_0x036d
        L_0x0363:
            r0 = move-exception
            r4 = r0
            r5 = 1
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r3] = r4
            com.ta.audid.g.m.d(r1, r0)
        L_0x036d:
            throw r2
        L_0x036e:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.ta.audid.g.m.e(r1, r0, r3)
        L_0x0374:
            return r2
        L_0x0375:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.ta.audid.g.m.e(r1, r0, r3)
            return r2
        L_0x037c:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.ta.audid.g.m.e(r1, r0, r3)
            return r2
        L_0x0383:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.ta.audid.g.m.e(r1, r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.audid.f.c.a(java.lang.String, java.lang.String, boolean):com.ta.audid.f.b");
    }

    private static String getMin(int i, char c, int i2) {
        try {
            int i3 = length + 9;
            try {
                setMax = i3 % 128;
                int i4 = 0;
                if (i3 % 2 != 0) {
                }
                char[] cArr = new char[i2];
                while (true) {
                    if ((i4 < i2 ? 'L' : 15) == 15) {
                        return new String(cArr);
                    }
                    int i5 = setMax + 37;
                    length = i5 % 128;
                    int i6 = i5 % 2;
                    cArr[i4] = (char) ((int) ((((long) getMin[i + i4]) ^ (((long) i4) * getMax)) ^ ((long) c)));
                    i4++;
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
