package o;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JG\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00040\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\bH\u0016¨\u0006\u000f"}, d2 = {"Lcom/twilio/verify/networking/NetworkAdapter;", "Lcom/twilio/verify/networking/NetworkProvider;", "()V", "execute", "", "request", "Lcom/twilio/verify/networking/Request;", "success", "Lkotlin/Function1;", "Lcom/twilio/verify/networking/Response;", "Lkotlin/ParameterName;", "name", "response", "error", "Lcom/twilio/verify/networking/NetworkException;", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class detachAndScrapAttachedViews implements shouldReMeasureChild {
    private static int getMin = 0;
    private static char length = '\u0003';
    private static int setMax = 1;
    private static char[] setMin = {'U', 'T', 'F', '-', '8', 'V', 'W', 'X', 'Y'};

    /* JADX WARNING: Removed duplicated region for block: B:82:0x01bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMin(@org.jetbrains.annotations.NotNull o.scrapOrRecycleView r18, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super o.removeAndRecycleScrapInt, kotlin.Unit> r19, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super com.twilio.verify.networking.NetworkException, kotlin.Unit> r20) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "request"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r3)
            java.lang.String r3 = "success"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r3)
            java.lang.String r3 = "error"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r3)
            r3 = 0
            java.net.URL r4 = r0.getMin     // Catch:{ Exception -> 0x01a9 }
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ Exception -> 0x01a9 }
            java.lang.Object r4 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r4)     // Catch:{ Exception -> 0x01a9 }
            java.net.URLConnection r4 = (java.net.URLConnection) r4     // Catch:{ Exception -> 0x01a9 }
            if (r4 == 0) goto L_0x019f
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4     // Catch:{ Exception -> 0x01a9 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Exception -> 0x01a9 }
            r5 = r4
            javax.net.ssl.HttpsURLConnection r5 = (javax.net.ssl.HttpsURLConnection) r5     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            com.twilio.verify.networking.HttpMethod r6 = r0.getMax     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.lang.String r6 = r6.getMethod()     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r5.setRequestMethod(r6)     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.util.Map<java.lang.String, java.lang.String> r5 = r0.setMax     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.util.Set r5 = r5.entrySet()     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            int r6 = setMax
            int r6 = r6 + 109
            int r7 = r6 % 128
            getMin = r7
            r7 = 2
            int r6 = r6 % r7
        L_0x0049:
            boolean r6 = r5.hasNext()     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r8 = 0
            r9 = 1
            if (r6 == 0) goto L_0x0053
            r6 = 0
            goto L_0x0054
        L_0x0053:
            r6 = 1
        L_0x0054:
            if (r6 == 0) goto L_0x0182
            java.lang.String r5 = r18.getMax()     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r6 = 72
            if (r5 == 0) goto L_0x0061
            r10 = 72
            goto L_0x0063
        L_0x0061:
            r10 = 89
        L_0x0063:
            if (r10 == r6) goto L_0x0067
            goto L_0x00e3
        L_0x0067:
            int r6 = setMax
            int r6 = r6 + 77
            int r10 = r6 % 128
            getMin = r10
            int r6 = r6 % r7
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            int r5 = r5.length()     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            if (r5 <= 0) goto L_0x007a
            r5 = 0
            goto L_0x007b
        L_0x007a:
            r5 = 1
        L_0x007b:
            r5 = r5 ^ r9
            if (r5 != r9) goto L_0x00e3
            r5 = r4
            javax.net.ssl.HttpsURLConnection r5 = (javax.net.ssl.HttpsURLConnection) r5     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r5.setDoOutput(r9)     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r5 = r4
            javax.net.ssl.HttpsURLConnection r5 = (javax.net.ssl.HttpsURLConnection) r5     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.io.OutputStream r5 = r5.getOutputStream()     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.lang.String r6 = "httpUrlConnection.outputStream"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.io.BufferedWriter r6 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.io.OutputStreamWriter r10 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r11 = 5
            char[] r12 = new char[r11]     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r12[r8] = r9     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r12[r9] = r7     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r12[r7] = r8     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r9 = 3
            r12[r9] = r11     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r9 = 4
            r11 = 121(0x79, float:1.7E-43)
            r12[r9] = r11     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.lang.String r9 = ""
            r11 = 48
            int r8 = android.text.TextUtils.lastIndexOf(r9, r11, r8, r8)     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            int r8 = r8 + 6
            long r13 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r15 = 0
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            int r9 = r9 + 64
            byte r9 = (byte) r9     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.lang.String r8 = getMax(r12, r8, r9)     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.lang.String r8 = r8.intern()     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r10.<init>(r5, r8)     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.io.Writer r10 = (java.io.Writer) r10     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r6.<init>(r10)     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.lang.String r0 = r18.getMax()     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r6.write(r0)     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r6.flush()     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r6.close()     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r5.close()     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            int r0 = setMax
            int r0 = r0 + 73
            int r5 = r0 % 128
            getMin = r5
            int r0 = r0 % r7
        L_0x00e3:
            r0 = r4
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            int r0 = r0.getResponseCode()     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r5 = 300(0x12c, float:4.2E-43)
            r6 = 8192(0x2000, float:1.14794E-41)
            if (r0 >= r5) goto L_0x0137
            r0 = r4
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.lang.String r5 = "httpUrlConnection.inputStream"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r5)     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.nio.charset.Charset r5 = kotlin.text.Charsets.UTF_8     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r7.<init>(r0, r5)     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.io.Reader r7 = (java.io.Reader) r7     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r0.<init>(r7, r6)     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r5 = r0
            java.io.Closeable r5 = (java.io.Closeable) r5     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r0 = r5
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0     // Catch:{ all -> 0x012e }
            java.io.Reader r0 = (java.io.Reader) r0     // Catch:{ all -> 0x012e }
            java.lang.String r0 = kotlin.io.TextStreamsKt.readText(r0)     // Catch:{ all -> 0x012e }
            kotlin.io.CloseableKt.closeFinally(r5, r3)     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            o.removeAndRecycleScrapInt r3 = new o.removeAndRecycleScrapInt     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r5 = r4
            javax.net.ssl.HttpsURLConnection r5 = (javax.net.ssl.HttpsURLConnection) r5     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.util.Map r5 = r5.getHeaderFields()     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.lang.String r6 = "httpUrlConnection.headerFields"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r3.<init>(r0, r5)     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r1.invoke(r3)     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            goto L_0x0173
        L_0x012e:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x0131 }
        L_0x0131:
            r0 = move-exception
            r3 = r0
            kotlin.io.CloseableKt.closeFinally(r5, r1)     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            throw r3     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
        L_0x0137:
            r1 = r4
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.io.InputStream r1 = r1.getErrorStream()     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.lang.String r5 = "httpUrlConnection.errorStream"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r5)     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.nio.charset.Charset r5 = kotlin.text.Charsets.UTF_8     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r7.<init>(r1, r5)     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.io.Reader r7 = (java.io.Reader) r7     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r1.<init>(r7, r6)     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.io.Closeable r1 = (java.io.Closeable) r1     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r5 = r1
            java.io.BufferedReader r5 = (java.io.BufferedReader) r5     // Catch:{ all -> 0x0179 }
            java.io.Reader r5 = (java.io.Reader) r5     // Catch:{ all -> 0x0179 }
            java.lang.String r5 = kotlin.io.TextStreamsKt.readText(r5)     // Catch:{ all -> 0x0179 }
            kotlin.io.CloseableKt.closeFinally(r1, r3)     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            com.twilio.verify.networking.NetworkException r1 = new com.twilio.verify.networking.NetworkException     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            o.stopIgnoringView r3 = new o.stopIgnoringView     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r6 = r4
            javax.net.ssl.HttpsURLConnection r6 = (javax.net.ssl.HttpsURLConnection) r6     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.util.Map r6 = r6.getHeaderFields()     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r3.<init>(r0, r5, r6)     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r1.<init>((o.stopIgnoringView) r3)     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r2.invoke(r1)     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
        L_0x0173:
            if (r4 == 0) goto L_0x0178
            r4.disconnect()
        L_0x0178:
            return
        L_0x0179:
            r0 = move-exception
            r3 = r0
            throw r3     // Catch:{ all -> 0x017c }
        L_0x017c:
            r0 = move-exception
            r5 = r0
            kotlin.io.CloseableKt.closeFinally(r1, r3)     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            throw r5     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
        L_0x0182:
            java.lang.Object r6 = r5.next()     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.lang.Object r8 = r6.getKey()     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            r4.setRequestProperty(r8, r6)     // Catch:{ Exception -> 0x019c, all -> 0x0199 }
            goto L_0x0049
        L_0x0199:
            r0 = move-exception
            r3 = r4
            goto L_0x01ba
        L_0x019c:
            r0 = move-exception
            r3 = r4
            goto L_0x01aa
        L_0x019f:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x01a9 }
            java.lang.String r1 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
            r0.<init>(r1)     // Catch:{ Exception -> 0x01a9 }
            throw r0     // Catch:{ Exception -> 0x01a9 }
        L_0x01a7:
            r0 = move-exception
            goto L_0x01ba
        L_0x01a9:
            r0 = move-exception
        L_0x01aa:
            com.twilio.verify.networking.NetworkException r1 = new com.twilio.verify.networking.NetworkException     // Catch:{ all -> 0x01a7 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x01a7 }
            r1.<init>((java.lang.Throwable) r0)     // Catch:{ all -> 0x01a7 }
            r2.invoke(r1)     // Catch:{ all -> 0x01a7 }
            if (r3 == 0) goto L_0x01b9
            r3.disconnect()
        L_0x01b9:
            return
        L_0x01ba:
            if (r3 == 0) goto L_0x01bf
            r3.disconnect()
        L_0x01bf:
            goto L_0x01c1
        L_0x01c0:
            throw r0
        L_0x01c1:
            goto L_0x01c0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.detachAndScrapAttachedViews.getMin(o.scrapOrRecycleView, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if ((r13 * 3) != 0) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if ((r13 % 2) != 0) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMax(char[] r12, int r13, byte r14) {
        /*
            int r0 = getMin
            int r0 = r0 + 89
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0017
            char[] r0 = setMin
            char r1 = length
            char[] r2 = new char[r13]
            int r3 = r13 * 3
            if (r3 == 0) goto L_0x0047
            goto L_0x0021
        L_0x0017:
            char[] r0 = setMin     // Catch:{ Exception -> 0x00d9 }
            char r1 = length     // Catch:{ Exception -> 0x00d7 }
            char[] r2 = new char[r13]     // Catch:{ Exception -> 0x00d7 }
            int r3 = r13 % 2
            if (r3 == 0) goto L_0x0047
        L_0x0021:
            int r3 = getMin
            int r3 = r3 + 37
            int r4 = r3 % 128
            setMax = r4
            int r3 = r3 % 2
            r4 = 28
            if (r3 != 0) goto L_0x0032
            r3 = 11
            goto L_0x0034
        L_0x0032:
            r3 = 28
        L_0x0034:
            if (r3 == r4) goto L_0x003f
            int r13 = r13 + 108
            char r3 = r12[r13]
            int r3 = r3 >>> r14
            char r3 = (char) r3
            r2[r13] = r3
            goto L_0x0047
        L_0x003f:
            int r13 = r13 + -1
            char r3 = r12[r13]
            int r3 = r3 - r14
            char r3 = (char) r3
            r2[r13] = r3
        L_0x0047:
            r3 = 1
            if (r13 <= r3) goto L_0x00d1
            int r4 = getMin
            int r4 = r4 + 75
            int r5 = r4 % 128
            setMax = r5
            int r4 = r4 % 2
            r4 = 0
            r5 = 0
        L_0x0056:
            if (r5 >= r13) goto L_0x00d1
            int r6 = setMax
            int r6 = r6 + 117
            int r7 = r6 % 128
            getMin = r7
            int r6 = r6 % 2
            char r6 = r12[r5]
            int r7 = r5 + 1
            char r8 = r12[r7]
            if (r6 != r8) goto L_0x0073
            int r6 = r6 - r14
            char r6 = (char) r6
            r2[r5] = r6
            int r8 = r8 - r14
            char r6 = (char) r8
            r2[r7] = r6
            goto L_0x00ce
        L_0x0073:
            int r9 = o.onActivityPreStopped.setMin(r6, r1)
            int r6 = o.onActivityPreStopped.length(r6, r1)
            int r10 = o.onActivityPreStopped.setMin(r8, r1)
            int r8 = o.onActivityPreStopped.length(r8, r1)
            if (r6 != r8) goto L_0x0087
            r11 = 1
            goto L_0x0088
        L_0x0087:
            r11 = 0
        L_0x0088:
            if (r11 == r3) goto L_0x00b6
            if (r9 != r10) goto L_0x00a5
            int r6 = o.onActivityPreStopped.setMax(r6, r1)
            int r8 = o.onActivityPreStopped.setMax(r8, r1)
            int r6 = o.onActivityPreStopped.getMax(r9, r6, r1)
            int r8 = o.onActivityPreStopped.getMax(r10, r8, r1)
            char r6 = r0[r6]
            r2[r5] = r6
            char r6 = r0[r8]
            r2[r7] = r6
            goto L_0x00ce
        L_0x00a5:
            int r8 = o.onActivityPreStopped.getMax(r9, r8, r1)
            int r6 = o.onActivityPreStopped.getMax(r10, r6, r1)
            char r8 = r0[r8]
            r2[r5] = r8
            char r6 = r0[r6]
            r2[r7] = r6
            goto L_0x00ce
        L_0x00b6:
            int r9 = o.onActivityPreStopped.setMax(r9, r1)     // Catch:{ Exception -> 0x00d7 }
            int r10 = o.onActivityPreStopped.setMax(r10, r1)     // Catch:{ Exception -> 0x00d7 }
            int r6 = o.onActivityPreStopped.getMax(r9, r6, r1)     // Catch:{ Exception -> 0x00d7 }
            int r8 = o.onActivityPreStopped.getMax(r10, r8, r1)     // Catch:{ Exception -> 0x00d7 }
            char r6 = r0[r6]     // Catch:{ Exception -> 0x00d7 }
            r2[r5] = r6     // Catch:{ Exception -> 0x00d7 }
            char r6 = r0[r8]     // Catch:{ Exception -> 0x00d7 }
            r2[r7] = r6     // Catch:{ Exception -> 0x00d7 }
        L_0x00ce:
            int r5 = r5 + 2
            goto L_0x0056
        L_0x00d1:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r2)
            return r12
        L_0x00d7:
            r12 = move-exception
            throw r12
        L_0x00d9:
            r12 = move-exception
            goto L_0x00dc
        L_0x00db:
            throw r12
        L_0x00dc:
            goto L_0x00db
        */
        throw new UnsupportedOperationException("Method not decompiled: o.detachAndScrapAttachedViews.getMax(char[], int, byte):java.lang.String");
    }
}
