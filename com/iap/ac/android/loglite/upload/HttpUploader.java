package com.iap.ac.android.loglite.upload;

import com.iap.ac.android.common.log.ACMonitor;
import com.iap.ac.android.loglite.api.AnalyticsHelper;
import com.iap.ac.android.loglite.utils.LoggerWrapper;
import java.util.HashMap;
import o.dispatchOnCancelled;
import o.onActivityPreCreated;
import o.onCancelLoad;
import o.onCanceled;

public class HttpUploader {
    private static int getMax = 1;
    private static long getMin = -2242177002991040833L;
    private static int setMax;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        if ((!r0.endsWith(r3)) != true) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if ((!r0.endsWith(r3) ? '\'' : '?') != '\'') goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.io.File r17, java.lang.String r18) throws java.lang.IllegalStateException {
        /*
            r16 = this;
            int r0 = setMax
            int r0 = r0 + 49
            int r1 = r0 % 128
            getMax = r1
            r1 = 2
            int r0 = r0 % r1
            java.lang.String r2 = "HttpUploader"
            java.lang.String r3 = "crash"
            java.lang.String r4 = "_"
            r5 = 0
            r6 = 1
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = r17.getName()
            boolean r7 = r0.endsWith(r3)
            r8 = 58
            int r8 = r8 / r5
            r8 = 39
            if (r7 != 0) goto L_0x0026
            r7 = 39
            goto L_0x0028
        L_0x0026:
            r7 = 63
        L_0x0028:
            if (r7 == r8) goto L_0x003e
            goto L_0x006e
        L_0x002b:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x002e:
            java.lang.String r0 = r17.getName()
            boolean r7 = r0.endsWith(r3)
            if (r7 != 0) goto L_0x003a
            r7 = 1
            goto L_0x003b
        L_0x003a:
            r7 = 0
        L_0x003b:
            if (r7 == r6) goto L_0x003e
            goto L_0x006e
        L_0x003e:
            int r7 = getMax
            int r7 = r7 + 111
            int r8 = r7 % 128
            setMax = r8
            int r7 = r7 % r1
            r8 = 75
            if (r7 == 0) goto L_0x004d
            r7 = 1
            goto L_0x004f
        L_0x004d:
            r7 = 75
        L_0x004f:
            if (r7 == r8) goto L_0x0061
            int r7 = r0.indexOf(r4)     // Catch:{ Exception -> 0x005f }
            int r7 = r7 / r6
            int r8 = r0.indexOf(r4, r7)     // Catch:{ Exception -> 0x005f }
        L_0x005a:
            java.lang.String r3 = r0.substring(r7, r8)     // Catch:{ Exception -> 0x005f }
            goto L_0x006e
        L_0x005f:
            r0 = move-exception
            goto L_0x006b
        L_0x0061:
            int r7 = r0.indexOf(r4)     // Catch:{ Exception -> 0x005f }
            int r7 = r7 + r6
            int r8 = r0.indexOf(r4, r7)     // Catch:{ Exception -> 0x005f }
            goto L_0x005a
        L_0x006b:
            com.iap.ac.android.loglite.utils.LoggerWrapper.w((java.lang.String) r2, (java.lang.Throwable) r0)
        L_0x006e:
            java.lang.String r0 = "$=$"
            boolean r7 = r3.contains(r0)
            r8 = 51
            r9 = 30
            if (r7 == 0) goto L_0x007d
            r7 = 30
            goto L_0x007f
        L_0x007d:
            r7 = 51
        L_0x007f:
            if (r7 == r8) goto L_0x008e
            int r7 = setMax
            int r7 = r7 + 23
            int r8 = r7 % 128
            getMax = r8
            int r7 = r7 % r1
            java.lang.String r3 = r3.replace(r0, r4)
        L_0x008e:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "uploadFileByHttp:"
            java.lang.String r0 = r4.concat(r0)
            com.iap.ac.android.loglite.utils.LoggerWrapper.d(r2, r0)
            java.lang.String r0 = com.iap.ac.android.loglite.utils.FileUtil.readFile(r17)     // Catch:{ all -> 0x0342 }
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r4 = 59
            if (r2 != 0) goto L_0x00ab
            r2 = 72
            goto L_0x00ad
        L_0x00ab:
            r2 = 59
        L_0x00ad:
            if (r2 == r4) goto L_0x0335
            com.iap.ac.android.loglite.core.AnalyticsContext r2 = com.iap.ac.android.loglite.core.AnalyticsContext.getInstance()
            boolean r2 = r2.isNeedEncryptLog()
            r7 = 3
            if (r2 == 0) goto L_0x013e
            java.lang.String r2 = "\\$\\$"
            java.lang.String[] r0 = r0.split(r2)
            com.iap.ac.android.loglite.core.AnalyticsContext r2 = com.iap.ac.android.loglite.core.AnalyticsContext.getInstance()
            com.iap.ac.android.loglite.core.LogEncryptClient r2 = r2.getLogEncryptClient()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            int r10 = r0.length
            r11 = 0
        L_0x00cf:
            if (r11 >= r10) goto L_0x013a
            int r12 = getMax
            int r12 = r12 + 71
            int r13 = r12 % 128
            setMax = r13
            int r12 = r12 % r1
            r12 = r0[r11]
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 != 0) goto L_0x0137
            java.lang.String r13 = "1_"
            boolean r13 = r12.startsWith(r13)
            if (r13 == 0) goto L_0x012f
            int r13 = getMax
            int r13 = r13 + 95
            int r14 = r13 % 128
            setMax = r14
            int r13 = r13 % r1
            if (r13 == 0) goto L_0x010d
            java.lang.String r12 = r12.substring(r7)     // Catch:{ all -> 0x0137 }
            java.lang.String r12 = r2.decrypt(r12)     // Catch:{ all -> 0x0137 }
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0137 }
            r14 = 96
            if (r13 != 0) goto L_0x0108
            r13 = 59
            goto L_0x010a
        L_0x0108:
            r13 = 96
        L_0x010a:
            if (r13 == r14) goto L_0x0137
            goto L_0x0122
        L_0x010d:
            java.lang.String r12 = r12.substring(r1)     // Catch:{ all -> 0x0137 }
            java.lang.String r12 = r2.decrypt(r12)     // Catch:{ all -> 0x0137 }
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0137 }
            if (r13 != 0) goto L_0x011e
            r13 = 89
            goto L_0x0120
        L_0x011e:
            r13 = 30
        L_0x0120:
            if (r13 == r9) goto L_0x0137
        L_0x0122:
            int r13 = setMax
            int r13 = r13 + 25
            int r14 = r13 % 128
            getMax = r14
            int r13 = r13 % r1
            r8.append(r12)     // Catch:{ all -> 0x0137 }
            goto L_0x0137
        L_0x012f:
            r8.append(r12)
            java.lang.String r12 = "$$"
            r8.append(r12)
        L_0x0137:
            int r11 = r11 + 1
            goto L_0x00cf
        L_0x013a:
            java.lang.String r0 = r8.toString()
        L_0x013e:
            byte[] r0 = com.iap.ac.android.loglite.utils.LoggingUtil.gzipDataByString(r0)
            java.lang.String r2 = r17.getName()
            r4 = r16
            java.lang.String r2 = r4.a(r2)
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.lang.String r9 = "Content-type"
            java.lang.String r10 = "text/xml"
            r8.put(r9, r10)
            java.lang.String r9 = "Content-Encoding"
            java.lang.String r10 = "gzip"
            r8.put(r9, r10)
            java.lang.String r9 = "bizCode"
            r8.put(r9, r2)
            com.iap.ac.android.loglite.core.AnalyticsContext r2 = com.iap.ac.android.loglite.core.AnalyticsContext.getInstance()
            java.lang.String r2 = r2.getProductId()
            java.lang.String r9 = "productId"
            r8.put(r9, r2)
            java.lang.String r2 = "event"
            java.lang.String r9 = "default"
            r8.put(r2, r9)
            com.iap.ac.android.loglite.core.AnalyticsContext r2 = com.iap.ac.android.loglite.core.AnalyticsContext.getInstance()
            com.iap.ac.android.loglite.utils.ContextInfo r2 = r2.getContextInfo()
            java.lang.String r2 = r2.b
            java.lang.String r9 = "productVersion"
            r8.put(r9, r2)
            com.iap.ac.android.loglite.core.AnalyticsContext r2 = com.iap.ac.android.loglite.core.AnalyticsContext.getInstance()
            java.lang.String r2 = r2.getInstanceId()
            java.lang.String r9 = "utdId"
            r8.put(r9, r2)
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0324 }
            java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x0324 }
            r11 = r18
            r2.<init>(r11)     // Catch:{ all -> 0x0324 }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ all -> 0x0324 }
            java.lang.Object r2 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r2)     // Catch:{ all -> 0x0324 }
            java.net.URLConnection r2 = (java.net.URLConnection) r2     // Catch:{ all -> 0x0324 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ all -> 0x0324 }
            r2.setDoOutput(r6)     // Catch:{ all -> 0x0324 }
            r2.setDoOutput(r6)     // Catch:{ all -> 0x0324 }
            r2.setUseCaches(r5)     // Catch:{ all -> 0x0324 }
            java.lang.String r11 = "POST"
            r2.setRequestMethod(r11)     // Catch:{ all -> 0x0324 }
            r11 = 20000(0x4e20, float:2.8026E-41)
            r2.setConnectTimeout(r11)     // Catch:{ all -> 0x0324 }
            r2.setReadTimeout(r11)     // Catch:{ all -> 0x0324 }
            java.lang.String r11 = "Content-Length"
            int r12 = r0.length     // Catch:{ all -> 0x0324 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0324 }
            r2.setRequestProperty(r11, r12)     // Catch:{ all -> 0x0324 }
            java.util.Set r11 = r8.keySet()     // Catch:{ all -> 0x0324 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0324 }
            int r12 = setMax
            int r12 = r12 + 23
            int r13 = r12 % 128
            getMax = r13
            int r12 = r12 % r1
        L_0x01de:
            boolean r12 = r11.hasNext()     // Catch:{ all -> 0x0324 }
            if (r12 == 0) goto L_0x01f4
            java.lang.Object r12 = r11.next()     // Catch:{ all -> 0x0324 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0324 }
            java.lang.Object r13 = r8.get(r12)     // Catch:{ all -> 0x0324 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0324 }
            r2.setRequestProperty(r12, r13)     // Catch:{ all -> 0x0324 }
            goto L_0x01de
        L_0x01f4:
            java.io.BufferedOutputStream r8 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0324 }
            java.io.OutputStream r11 = r2.getOutputStream()     // Catch:{ all -> 0x0324 }
            r8.<init>(r11)     // Catch:{ all -> 0x0324 }
            r8.write(r0)     // Catch:{ all -> 0x0324 }
            r8.flush()     // Catch:{ all -> 0x0324 }
            r8.close()     // Catch:{ all -> 0x0324 }
            int r8 = r2.getResponseCode()     // Catch:{ all -> 0x0324 }
            java.lang.String r11 = "bizHighAvail"
            boolean r11 = r11.equals(r3)     // Catch:{ all -> 0x0324 }
            if (r11 == 0) goto L_0x023d
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0324 }
            long r11 = r11 - r9
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x0324 }
            r9.<init>()     // Catch:{ all -> 0x0324 }
            java.lang.String r10 = "timeCost"
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0324 }
            r9.put(r10, r11)     // Catch:{ all -> 0x0324 }
            java.lang.String r10 = "resultCode"
            java.lang.String r11 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0324 }
            r9.put(r10, r11)     // Catch:{ all -> 0x0324 }
            java.lang.String r10 = "keyBiztraceLogUploadCost"
            com.iap.ac.android.loglite.api.AnalyticsHelper.sendPerformanceLog(r10, r9)     // Catch:{ all -> 0x0324 }
            int r9 = setMax
            int r9 = r9 + 95
            int r10 = r9 % 128
            getMax = r10
            int r9 = r9 % r1
        L_0x023d:
            r9 = 200(0xc8, float:2.8E-43)
            if (r9 != r8) goto L_0x0314
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0324 }
            r10.<init>()     // Catch:{ all -> 0x0324 }
            java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch:{ all -> 0x0324 }
            java.io.InputStreamReader r12 = new java.io.InputStreamReader     // Catch:{ all -> 0x0324 }
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ all -> 0x0324 }
            r13 = 9
            char[] r13 = new char[r13]     // Catch:{ all -> 0x0324 }
            r14 = 27424(0x6b20, float:3.8429E-41)
            r13[r5] = r14     // Catch:{ all -> 0x0324 }
            r14 = 61753(0xf139, float:8.6534E-41)
            r13[r6] = r14     // Catch:{ all -> 0x0324 }
            r14 = 51994(0xcb1a, float:7.2859E-41)
            r13[r1] = r14     // Catch:{ all -> 0x0324 }
            r14 = 26841(0x68d9, float:3.7612E-41)
            r13[r7] = r14     // Catch:{ all -> 0x0324 }
            r7 = 4
            r14 = 27509(0x6b75, float:3.8548E-41)
            r13[r7] = r14     // Catch:{ all -> 0x0324 }
            r7 = 5
            r14 = 47058(0xb7d2, float:6.5942E-41)
            r13[r7] = r14     // Catch:{ all -> 0x0324 }
            r7 = 6
            r14 = 17954(0x4622, float:2.5159E-41)
            r13[r7] = r14     // Catch:{ all -> 0x0324 }
            r7 = 7
            r14 = 48329(0xbcc9, float:6.7723E-41)
            r13[r7] = r14     // Catch:{ all -> 0x0324 }
            r7 = 8
            r14 = 29156(0x71e4, float:4.0856E-41)
            r13[r7] = r14     // Catch:{ all -> 0x0324 }
            java.lang.String r7 = getMax(r13)     // Catch:{ all -> 0x0324 }
            java.lang.String r7 = r7.intern()     // Catch:{ all -> 0x0324 }
            r12.<init>(r2, r7)     // Catch:{ all -> 0x0324 }
            r11.<init>(r12)     // Catch:{ all -> 0x0324 }
        L_0x028e:
            java.lang.String r2 = r11.readLine()     // Catch:{ all -> 0x0324 }
            if (r2 == 0) goto L_0x02a6
            r10.append(r2)     // Catch:{ all -> 0x0324 }
            java.lang.String r2 = "\n"
            r10.append(r2)     // Catch:{ all -> 0x0324 }
            int r2 = setMax
            int r2 = r2 + 97
            int r7 = r2 % 128
            getMax = r7
            int r2 = r2 % r1
            goto L_0x028e
        L_0x02a6:
            r11.close()     // Catch:{ all -> 0x0324 }
            java.lang.String r1 = r10.toString()     // Catch:{ all -> 0x0324 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x02f8 }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x02f8 }
            java.lang.String r1 = "code"
            int r1 = r2.getInt(r1)     // Catch:{ JSONException -> 0x02f8 }
            if (r1 != r9) goto L_0x02bb
            r5 = 1
        L_0x02bb:
            if (r5 != r6) goto L_0x02d3
            r17.delete()     // Catch:{ all -> 0x02c1 }
            return
        L_0x02c1:
            r0 = move-exception
            r1 = r0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "delete file error: "
            java.lang.String r2 = r3.concat(r2)
            r0.<init>(r2, r1)
            throw r0
        L_0x02d3:
            java.lang.String r12 = java.lang.String.valueOf(r8)     // Catch:{ JSONException -> 0x02f8 }
            java.lang.String r13 = java.lang.String.valueOf(r1)     // Catch:{ JSONException -> 0x02f8 }
            java.lang.String r14 = "mdap response code error"
            int r2 = r0.length     // Catch:{ JSONException -> 0x02f8 }
            java.lang.String r15 = java.lang.String.valueOf(r2)     // Catch:{ JSONException -> 0x02f8 }
            r10 = r16
            r11 = r3
            r10.a(r11, r12, r13, r14, r15)     // Catch:{ JSONException -> 0x02f8 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ JSONException -> 0x02f8 }
            java.lang.String r5 = "responseContent code is "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ JSONException -> 0x02f8 }
            java.lang.String r1 = r5.concat(r1)     // Catch:{ JSONException -> 0x02f8 }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x02f8 }
            throw r2     // Catch:{ JSONException -> 0x02f8 }
        L_0x02f8:
            java.lang.String r12 = java.lang.String.valueOf(r8)
            int r0 = r0.length
            java.lang.String r15 = java.lang.String.valueOf(r0)
            java.lang.String r13 = "unknown"
            java.lang.String r14 = "get responseContent code error,JSONException"
            r10 = r16
            r11 = r3
            r10.a(r11, r12, r13, r14, r15)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "get responseContent code error,JSONException"
            r0.<init>(r1)
            throw r0
        L_0x0314:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0324 }
            java.lang.String r1 = "response code is "
            java.lang.String r2 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0324 }
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x0324 }
            r0.<init>(r1)     // Catch:{ all -> 0x0324 }
            throw r0     // Catch:{ all -> 0x0324 }
        L_0x0324:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "POST request error: "
            java.lang.String r2 = r3.concat(r2)
            r1.<init>(r2, r0)
            throw r1
        L_0x0335:
            r4 = r16
            r17.delete()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "file content is empty"
            r0.<init>(r1)
            throw r0
        L_0x0342:
            r0 = move-exception
            r4 = r16
            r1 = r0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "read file error: "
            java.lang.String r2 = r3.concat(r2)
            r0.<init>(r2, r1)
            goto L_0x0357
        L_0x0356:
            throw r0
        L_0x0357:
            goto L_0x0356
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.loglite.upload.HttpUploader.a(java.io.File, java.lang.String):void");
    }

    public final String a(String str) {
        int i = 0;
        if (!(str != null)) {
            int i2 = getMax + 55;
            setMax = i2 % 128;
            int i3 = i2 % 2;
        } else {
            i = str.length();
        }
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            try {
                onCancelLoad.setMax(1962228152, oncanceled);
                onCancelLoad.getMin(1962228152, oncanceled);
            } catch (Exception e) {
                throw e;
            }
        }
        if ((!str.endsWith("crash") ? 22 : '%') != 22) {
            return "crash";
        }
        int i4 = getMax + 111;
        setMax = i4 % 128;
        int i5 = i4 % 2;
        try {
            return str.substring(str.indexOf("_", str.indexOf("_") + 1) + 1);
        } catch (Exception e2) {
            LoggerWrapper.w(com.alipay.iap.android.aplog.core.uploader.HttpUploader.TAG, (Throwable) e2);
            return "crash";
        }
    }

    public final void a(String str, String str2, String str3, String str4, String str5) {
        int i = setMax + 125;
        getMax = i % 128;
        int i2 = i % 2;
        if (!str.equals("performance")) {
            HashMap hashMap = new HashMap();
            hashMap.put("httpCode", str2);
            hashMap.put("mdapCode", str3);
            hashMap.put(ACMonitor.EVENT_PARAM_KEY_ERROR_MSG, str4);
            hashMap.put("zipLength", str5);
            AnalyticsHelper.sendPerformanceLog("uploadLogFail", hashMap);
            try {
                int i3 = getMax + 51;
                setMax = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e) {
                throw e;
            }
        }
    }

    private static String getMax(char[] cArr) {
        int i = getMax + 15;
        setMax = i % 128;
        int i2 = i % 2;
        try {
            char[] length = onActivityPreCreated.length(getMin, cArr);
            int i3 = 4;
            while (true) {
                if ((i3 < length.length ? 'L' : 'I') != 'L') {
                    return new String(length, 4, length.length - 4);
                }
                int i4 = getMax + 117;
                setMax = i4 % 128;
                if (!(i4 % 2 == 0)) {
                    try {
                        length[i3] = (char) ((int) (((long) (length[i3] & length[i3 >>> 2])) + (((long) (i3 / 5)) / getMin)));
                        i3 += 114;
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    length[i3] = (char) ((int) (((long) (length[i3] ^ length[i3 % 4])) ^ (((long) (i3 - 4)) * getMin)));
                    i3++;
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
