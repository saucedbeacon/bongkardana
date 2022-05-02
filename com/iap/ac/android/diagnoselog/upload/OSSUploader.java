package com.iap.ac.android.diagnoselog.upload;

import com.google.common.net.HttpHeaders;
import com.iap.ac.android.diagnoselog.api.OnLogUploadListener;
import com.iap.ac.android.diagnoselog.core.UserDiagnosing;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

public class OSSUploader implements IDiagnoseUploader {

    /* renamed from: a  reason: collision with root package name */
    public UserDiagnosing.UploadStatusChangeListener f11049a;
    public OnLogUploadListener b;
    public ThreadPoolExecutor c;

    public OSSUploader(ThreadPoolExecutor threadPoolExecutor, UserDiagnosing.UploadStatusChangeListener uploadStatusChangeListener, OnLogUploadListener onLogUploadListener) {
        this.c = threadPoolExecutor;
        this.f11049a = uploadStatusChangeListener;
        this.b = onLogUploadListener;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x021c A[SYNTHETIC, Splitter:B:61:0x021c] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x023f A[SYNTHETIC, Splitter:B:66:0x023f] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0246  */
    @androidx.annotation.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.io.File r20, com.iap.ac.android.diagnoselog.core.UserDiagnosing.DiagnoseTask r21, boolean r22) {
        /*
            r19 = this;
            r1 = r19
            r2 = r21
            java.lang.String r3 = "fail"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "--------------------------"
            r0.<init>(r4)
            long r4 = java.lang.System.currentTimeMillis()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r4 = 0
            r5 = 0
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0209 }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ all -> 0x0209 }
            r8 = r20
            r7.<init>(r8)     // Catch:{ all -> 0x0209 }
            r6.<init>(r7)     // Catch:{ all -> 0x0209 }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0202 }
            java.net.URL r7 = new java.net.URL     // Catch:{ all -> 0x0202 }
            java.lang.String r11 = r2.d     // Catch:{ all -> 0x0202 }
            r7.<init>(r11)     // Catch:{ all -> 0x0202 }
            java.net.Proxy r11 = java.net.Proxy.NO_PROXY     // Catch:{ all -> 0x0202 }
            java.net.URLConnection r7 = r7.openConnection(r11)     // Catch:{ all -> 0x0202 }
            java.lang.Object r7 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r7)     // Catch:{ all -> 0x0202 }
            java.net.URLConnection r7 = (java.net.URLConnection) r7     // Catch:{ all -> 0x0202 }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ all -> 0x0202 }
            long r11 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0200 }
            long r11 = r11 - r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0200 }
            java.lang.String r10 = ", fileName: "
            r9.<init>(r10)     // Catch:{ all -> 0x0200 }
            java.lang.String r10 = r20.getName()     // Catch:{ all -> 0x0200 }
            r9.append(r10)     // Catch:{ all -> 0x0200 }
            java.lang.String r10 = ", connectSpend: "
            r9.append(r10)     // Catch:{ all -> 0x0200 }
            r9.append(r11)     // Catch:{ all -> 0x0200 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0200 }
            java.lang.String r10 = "OSSUploader"
            com.iap.ac.android.loglite.utils.LoggerWrapper.i(r10, r9)     // Catch:{ all -> 0x0200 }
            r10 = 1
            r7.setDoInput(r10)     // Catch:{ all -> 0x0200 }
            r7.setDoOutput(r10)     // Catch:{ all -> 0x0200 }
            r7.setUseCaches(r5)     // Catch:{ all -> 0x0200 }
            java.lang.String r11 = "POST"
            r7.setRequestMethod(r11)     // Catch:{ all -> 0x0200 }
            r7.setUseCaches(r5)     // Catch:{ all -> 0x0200 }
            java.lang.String r11 = "Accept"
            java.lang.String r12 = "*/*"
            r7.setRequestProperty(r11, r12)     // Catch:{ all -> 0x0200 }
            java.lang.String r11 = "Accept-Encoding"
            java.lang.String r12 = "gzip, deflate"
            r7.setRequestProperty(r11, r12)     // Catch:{ all -> 0x0200 }
            java.lang.String r11 = "Cache-Control"
            java.lang.String r12 = "no-cache"
            r7.setRequestProperty(r11, r12)     // Catch:{ all -> 0x0200 }
            java.lang.String r11 = "Content-Type"
            java.lang.String r12 = "multipart/form-data; boundary="
            java.lang.String r13 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0200 }
            java.lang.String r12 = r12.concat(r13)     // Catch:{ all -> 0x0200 }
            r7.setRequestProperty(r11, r12)     // Catch:{ all -> 0x0200 }
            r7.connect()     // Catch:{ all -> 0x0200 }
            java.io.DataOutputStream r11 = new java.io.DataOutputStream     // Catch:{ all -> 0x0200 }
            java.io.OutputStream r12 = r7.getOutputStream()     // Catch:{ all -> 0x0200 }
            r11.<init>(r12)     // Catch:{ all -> 0x0200 }
            org.json.JSONObject r4 = r2.e     // Catch:{ all -> 0x01fa }
            java.lang.String r12 = r2.f11046a     // Catch:{ all -> 0x01fa }
            java.util.Map r4 = r1.a(r4, r12)     // Catch:{ all -> 0x01fa }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ all -> 0x01fa }
            boolean r12 = r4.isEmpty()     // Catch:{ all -> 0x01fa }
            java.lang.String r13 = "\"\r\n"
            java.lang.String r14 = "--"
            java.lang.String r15 = "\r\n"
            if (r12 != 0) goto L_0x0117
            java.util.Set r12 = r4.entrySet()     // Catch:{ all -> 0x01fa }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x01fa }
        L_0x00c3:
            boolean r16 = r12.hasNext()     // Catch:{ all -> 0x01fa }
            if (r16 == 0) goto L_0x0117
            java.lang.Object r16 = r12.next()     // Catch:{ all -> 0x01fa }
            java.util.Map$Entry r16 = (java.util.Map.Entry) r16     // Catch:{ all -> 0x01fa }
            java.lang.Object r16 = r16.getKey()     // Catch:{ all -> 0x01fa }
            r10 = r16
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x01fa }
            java.lang.Object r16 = r4.get(r10)     // Catch:{ all -> 0x01fa }
            r5 = r16
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x01fa }
            r16 = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fa }
            r4.<init>(r14)     // Catch:{ all -> 0x01fa }
            r4.append(r0)     // Catch:{ all -> 0x01fa }
            r4.append(r15)     // Catch:{ all -> 0x01fa }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01fa }
            r11.writeBytes(r4)     // Catch:{ all -> 0x01fa }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fa }
            java.lang.String r8 = "Content-Disposition: form-data; name=\""
            r4.<init>(r8)     // Catch:{ all -> 0x01fa }
            r4.append(r10)     // Catch:{ all -> 0x01fa }
            r4.append(r13)     // Catch:{ all -> 0x01fa }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01fa }
            r11.writeBytes(r4)     // Catch:{ all -> 0x01fa }
            r11.writeBytes(r15)     // Catch:{ all -> 0x01fa }
            r11.writeBytes(r5)     // Catch:{ all -> 0x01fa }
            r11.writeBytes(r15)     // Catch:{ all -> 0x01fa }
            r8 = r20
            r4 = r16
            r5 = 0
            r10 = 1
            goto L_0x00c3
        L_0x0117:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fa }
            r4.<init>(r14)     // Catch:{ all -> 0x01fa }
            r4.append(r0)     // Catch:{ all -> 0x01fa }
            r4.append(r15)     // Catch:{ all -> 0x01fa }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01fa }
            r11.writeBytes(r4)     // Catch:{ all -> 0x01fa }
            java.lang.String r4 = r20.getName()     // Catch:{ all -> 0x01fa }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fa }
            java.lang.String r8 = "Content-Disposition: form-data; name=\"file\"; filename=\""
            r5.<init>(r8)     // Catch:{ all -> 0x01fa }
            r5.append(r4)     // Catch:{ all -> 0x01fa }
            r5.append(r13)     // Catch:{ all -> 0x01fa }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x01fa }
            r11.writeBytes(r4)     // Catch:{ all -> 0x01fa }
            java.lang.String r4 = "Content-Type: application/zip\r\n"
            r11.writeBytes(r4)     // Catch:{ all -> 0x01fa }
            r11.writeBytes(r15)     // Catch:{ all -> 0x01fa }
            com.iap.ac.android.diagnoselog.core.LogUploadInfo r4 = new com.iap.ac.android.diagnoselog.core.LogUploadInfo     // Catch:{ all -> 0x01fa }
            r4.<init>()     // Catch:{ all -> 0x01fa }
            long r12 = r20.length()     // Catch:{ all -> 0x01fa }
            r4.totalBytes = r12     // Catch:{ all -> 0x01fa }
            r12 = 0
            r4.bytesUploaded = r12     // Catch:{ all -> 0x01fa }
            r5 = 8192(0x2000, float:1.14794E-41)
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x01fa }
            r8 = 0
            r10 = 0
        L_0x015e:
            int r12 = r6.read(r5)     // Catch:{ all -> 0x01fa }
            if (r12 < 0) goto L_0x019a
            int r13 = r8 / 5
            if (r13 <= 0) goto L_0x017a
            int r13 = r8 - r10
            r16 = r8
            r8 = 5
            if (r13 < r8) goto L_0x017a
            com.iap.ac.android.diagnoselog.api.OnLogUploadListener r8 = r1.b     // Catch:{ all -> 0x01fa }
            if (r8 == 0) goto L_0x017a
            r8.onProgress(r4)     // Catch:{ all -> 0x01fa }
            r13 = r9
            r10 = r16
            goto L_0x017b
        L_0x017a:
            r13 = r9
        L_0x017b:
            long r8 = r4.bytesUploaded     // Catch:{ all -> 0x01fa }
            float r8 = (float) r8     // Catch:{ all -> 0x01fa }
            r16 = r10
            long r9 = r4.totalBytes     // Catch:{ all -> 0x01fa }
            float r9 = (float) r9     // Catch:{ all -> 0x01fa }
            float r8 = r8 / r9
            r9 = 1120403456(0x42c80000, float:100.0)
            float r8 = r8 * r9
            int r8 = (int) r8     // Catch:{ all -> 0x01fa }
            r9 = 0
            r11.write(r5, r9, r12)     // Catch:{ all -> 0x01fa }
            long r9 = r4.bytesUploaded     // Catch:{ all -> 0x01fa }
            r18 = r13
            long r12 = (long) r12     // Catch:{ all -> 0x01fa }
            long r9 = r9 + r12
            r4.bytesUploaded = r9     // Catch:{ all -> 0x01fa }
            r10 = r16
            r9 = r18
            goto L_0x015e
        L_0x019a:
            r18 = r9
            r11.writeBytes(r15)     // Catch:{ all -> 0x01fa }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fa }
            r4.<init>(r14)     // Catch:{ all -> 0x01fa }
            r4.append(r0)     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = "--\r\n"
            r4.append(r0)     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x01fa }
            r11.writeBytes(r0)     // Catch:{ all -> 0x01fa }
            r11.flush()     // Catch:{ all -> 0x01fa }
            int r0 = r7.getResponseCode()     // Catch:{ all -> 0x01fa }
            r4 = 204(0xcc, float:2.86E-43)
            if (r0 != r4) goto L_0x01cf
            com.iap.ac.android.diagnoselog.core.UserDiagnosing$UploadStatusChangeListener r0 = r1.f11049a     // Catch:{ all -> 0x01fa }
            java.lang.String r4 = r2.f11046a     // Catch:{ all -> 0x01fa }
            java.lang.String r5 = "finish"
            com.iap.ac.android.diagnoselog.core.UserDiagnosing$a r0 = (com.iap.ac.android.diagnoselog.core.UserDiagnosing.a) r0     // Catch:{ all -> 0x01fa }
            r8 = r18
            r0.a(r4, r5, r8)     // Catch:{ all -> 0x01fa }
            r5 = 1
            r17 = 1
            goto L_0x01e5
        L_0x01cf:
            com.iap.ac.android.diagnoselog.core.UserDiagnosing$UploadStatusChangeListener r4 = r1.f11049a     // Catch:{ all -> 0x01fa }
            java.lang.String r5 = r2.f11046a     // Catch:{ all -> 0x01fa }
            java.lang.String r8 = "responseCode = "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01fa }
            java.lang.String r0 = r8.concat(r0)     // Catch:{ all -> 0x01fa }
            com.iap.ac.android.diagnoselog.core.UserDiagnosing$a r4 = (com.iap.ac.android.diagnoselog.core.UserDiagnosing.a) r4     // Catch:{ all -> 0x01fa }
            r4.a(r5, r3, r0)     // Catch:{ all -> 0x01fa }
            r17 = r22
            r5 = 0
        L_0x01e5:
            java.lang.String r0 = r2.f11046a     // Catch:{ all -> 0x01f8 }
            com.iap.ac.android.diagnoselog.api.OnLogUploadListener r4 = r1.b     // Catch:{ all -> 0x01f8 }
            if (r4 == 0) goto L_0x01ee
            r4.onFinished(r5, r0)     // Catch:{ all -> 0x01f8 }
        L_0x01ee:
            com.iap.ac.android.loglite.utils.FileUtil.safeClose(r6)
            com.iap.ac.android.loglite.utils.FileUtil.safeClose(r11)
            r7.disconnect()     // Catch:{ all -> 0x0243 }
            goto L_0x0244
        L_0x01f8:
            r0 = move-exception
            goto L_0x01fe
        L_0x01fa:
            r0 = move-exception
            r17 = r22
            r5 = 0
        L_0x01fe:
            r4 = r7
            goto L_0x020f
        L_0x0200:
            r0 = move-exception
            goto L_0x0204
        L_0x0202:
            r0 = move-exception
            r7 = r4
        L_0x0204:
            r17 = r22
            r11 = r4
            r4 = r7
            goto L_0x020e
        L_0x0209:
            r0 = move-exception
            r17 = r22
            r6 = r4
            r11 = r6
        L_0x020e:
            r5 = 0
        L_0x020f:
            java.lang.String r7 = r0.getMessage()     // Catch:{ all -> 0x024a }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x024a }
            if (r7 == 0) goto L_0x021c
            java.lang.String r0 = "there are an error on oss upload"
            goto L_0x022e
        L_0x021c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x024a }
            java.lang.String r8 = "oss upload error,"
            r7.<init>(r8)     // Catch:{ all -> 0x024a }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x024a }
            r7.append(r0)     // Catch:{ all -> 0x024a }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x024a }
        L_0x022e:
            com.iap.ac.android.diagnoselog.core.UserDiagnosing$UploadStatusChangeListener r7 = r1.f11049a     // Catch:{ all -> 0x024a }
            java.lang.String r2 = r2.f11046a     // Catch:{ all -> 0x024a }
            com.iap.ac.android.diagnoselog.core.UserDiagnosing$a r7 = (com.iap.ac.android.diagnoselog.core.UserDiagnosing.a) r7     // Catch:{ all -> 0x024a }
            r7.a(r2, r3, r0)     // Catch:{ all -> 0x024a }
            com.iap.ac.android.loglite.utils.FileUtil.safeClose(r6)
            com.iap.ac.android.loglite.utils.FileUtil.safeClose(r11)
            if (r4 == 0) goto L_0x0244
            r4.disconnect()     // Catch:{ all -> 0x0243 }
            goto L_0x0244
        L_0x0243:
        L_0x0244:
            if (r17 == 0) goto L_0x0249
            r20.delete()
        L_0x0249:
            return r5
        L_0x024a:
            r0 = move-exception
            com.iap.ac.android.loglite.utils.FileUtil.safeClose(r6)
            com.iap.ac.android.loglite.utils.FileUtil.safeClose(r11)
            if (r4 == 0) goto L_0x0256
            r4.disconnect()     // Catch:{ all -> 0x0256 }
        L_0x0256:
            goto L_0x0258
        L_0x0257:
            throw r0
        L_0x0258:
            goto L_0x0257
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.diagnoselog.upload.OSSUploader.a(java.io.File, com.iap.ac.android.diagnoselog.core.UserDiagnosing$DiagnoseTask, boolean):boolean");
    }

    public final Map<String, String> a(JSONObject jSONObject, String str) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            hashMap.put("key", jSONObject.optString("key"));
            hashMap.put("OSSAccessKeyId", jSONObject.optString("OSSAccessKeyId"));
            hashMap.put("policy", jSONObject.optString("policy"));
            hashMap.put("Signature", jSONObject.optString("Signature"));
            StringBuilder sb = new StringBuilder("attachment;filename=");
            sb.append(str);
            sb.append(".zip");
            hashMap.put(HttpHeaders.CONTENT_DISPOSITION, sb.toString());
        }
        return hashMap;
    }
}
