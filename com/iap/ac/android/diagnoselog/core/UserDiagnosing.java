package com.iap.ac.android.diagnoselog.core;

import android.content.Context;
import com.iap.ac.android.common.rpc.RPCProxyHost;
import com.iap.ac.android.diagnoselog.api.OnLogUploadListener;
import com.iap.ac.android.diagnoselog.rpc.DlTaskStatus;
import com.iap.ac.android.diagnoselog.rpc.UpdateTaskStatusReq;
import com.iap.ac.android.diagnoselog.upload.IDiagnoseUploader;
import com.iap.ac.android.diagnoselog.upload.OSSUploader;
import com.iap.ac.android.loglite.api.AnalyticsHelper;
import com.iap.ac.android.loglite.utils.LoggerWrapper;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class UserDiagnosing {

    /* renamed from: a  reason: collision with root package name */
    public final OnLogUploadListener f11045a;
    public ThreadPoolExecutor b;
    public SimpleDateFormat c;
    public IDiagnoseUploader d;
    public DecimalFormat e = new DecimalFormat("#0.00");
    public SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
    public Context g;

    public static class DiagnoseTask {

        /* renamed from: a  reason: collision with root package name */
        public String f11046a = "";
        public long b;
        public long c;
        public String d = "";
        public JSONObject e;
    }

    public interface UploadStatusChangeListener {
    }

    public class a implements UploadStatusChangeListener {
        public a() {
        }

        public void a(String str, String str2, String str3) {
            UserDiagnosing userDiagnosing = UserDiagnosing.this;
            userDiagnosing.b.execute(new b(str, str2, str3));
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11048a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public b(String str, String str2, String str3) {
            this.f11048a = str;
            this.b = str2;
            this.c = str3;
        }

        public void run() {
            StringBuilder sb = new StringBuilder("before update -> ");
            sb.append(this.f11048a);
            sb.append(",status = ");
            sb.append(this.b);
            sb.append(",message = ");
            sb.append(this.c);
            LoggerWrapper.i("UserDiagnosing", sb.toString());
            HashMap hashMap = new HashMap();
            hashMap.put("status", this.b);
            hashMap.put("statusMessage", this.c);
            AnalyticsHelper.sendBehaviorLog("dl_updateStatus", hashMap);
            String str = this.f11048a;
            String str2 = this.b;
            String str3 = this.c;
            try {
                DlTaskStatus dlTaskStatus = (DlTaskStatus) RPCProxyHost.getInterfaceProxy(DlTaskStatus.class);
                if (dlTaskStatus != null) {
                    UpdateTaskStatusReq updateTaskStatusReq = new UpdateTaskStatusReq();
                    updateTaskStatusReq.setTaskId(str);
                    updateTaskStatusReq.setTaskStatus(str2);
                    updateTaskStatusReq.setTaskStatusMessage(str3);
                    if (dlTaskStatus.updateTaskStatus(updateTaskStatusReq).isSuccess().booleanValue()) {
                        LoggerWrapper.i("UserDiagnosing", "updateTaskStatus success");
                    }
                }
            } catch (Exception e) {
                LoggerWrapper.w("UserDiagnosing", (Throwable) e);
            }
        }
    }

    public UserDiagnosing(Context context, ThreadPoolExecutor threadPoolExecutor, OnLogUploadListener onLogUploadListener) {
        this.g = context;
        this.f11045a = onLogUploadListener;
        this.c = new SimpleDateFormat("yyyyMMddHH", Locale.getDefault());
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new ArrayBlockingQueue(8), new ThreadPoolExecutor.DiscardOldestPolicy());
        this.b = threadPoolExecutor2;
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        this.d = new OSSUploader(this.b, new a(), onLogUploadListener);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r23) {
        /*
            r22 = this;
            r1 = r22
            java.lang.String r2 = "UserDiagnosing"
            com.iap.ac.android.diagnoselog.core.DiagnoseLogContext r0 = com.iap.ac.android.diagnoselog.core.DiagnoseLogContext.b()
            com.iap.ac.android.diagnoselog.storage.DiagnoseStorage r0 = r0.f9702a
            com.iap.ac.android.diagnoselog.storage.DiagnoseFileStorage r0 = (com.iap.ac.android.diagnoselog.storage.DiagnoseFileStorage) r0
            r0.a()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0046 }
            r4 = r23
            r0.<init>(r4)     // Catch:{ JSONException -> 0x0046 }
            com.iap.ac.android.diagnoselog.core.UserDiagnosing$DiagnoseTask r4 = new com.iap.ac.android.diagnoselog.core.UserDiagnosing$DiagnoseTask     // Catch:{ JSONException -> 0x0046 }
            r4.<init>()     // Catch:{ JSONException -> 0x0046 }
            java.lang.String r5 = "taskId"
            java.lang.String r5 = r0.optString(r5)     // Catch:{ JSONException -> 0x0044 }
            r4.f11046a = r5     // Catch:{ JSONException -> 0x0044 }
            java.lang.String r5 = "startTime"
            long r5 = r0.optLong(r5)     // Catch:{ JSONException -> 0x0044 }
            r4.b = r5     // Catch:{ JSONException -> 0x0044 }
            java.lang.String r5 = "endTime"
            long r5 = r0.optLong(r5)     // Catch:{ JSONException -> 0x0044 }
            r4.c = r5     // Catch:{ JSONException -> 0x0044 }
            java.lang.String r5 = "uploadUrl"
            java.lang.String r5 = r0.optString(r5)     // Catch:{ JSONException -> 0x0044 }
            r4.d = r5     // Catch:{ JSONException -> 0x0044 }
            java.lang.String r5 = "uploadParams"
            org.json.JSONObject r0 = r0.optJSONObject(r5)     // Catch:{ JSONException -> 0x0044 }
            r4.e = r0     // Catch:{ JSONException -> 0x0044 }
            goto L_0x004b
        L_0x0044:
            r0 = move-exception
            goto L_0x0048
        L_0x0046:
            r0 = move-exception
            r4 = 0
        L_0x0048:
            com.iap.ac.android.loglite.utils.LoggerWrapper.w((java.lang.String) r2, (java.lang.Throwable) r0)
        L_0x004b:
            if (r4 == 0) goto L_0x0296
            java.lang.String r0 = r4.d
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r5 = "fail"
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = r4.f11046a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "task "
            r2.<init>(r3)
            java.lang.String r3 = r4.f11046a
            r2.append(r3)
            java.lang.String r3 = " uploadUrl isEmpty"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.a(r0, r5, r2)
            return
        L_0x0072:
            java.lang.String r0 = r4.f11046a
            com.iap.ac.android.diagnoselog.core.DiagnoseLogContext r6 = com.iap.ac.android.diagnoselog.core.DiagnoseLogContext.b()
            android.app.Application r6 = r6.d
            java.lang.String r7 = "dlagnoseLogSpFile"
            r8 = 0
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r7, r8)
            java.lang.String r9 = "diagnoseTaskId"
            java.lang.String r10 = ""
            java.lang.String r6 = r6.getString(r9, r10)
            boolean r0 = android.text.TextUtils.equals(r0, r6)
            if (r0 != 0) goto L_0x0296
            java.io.File r0 = new java.io.File
            android.content.Context r6 = r1.g
            java.io.File r6 = r6.getFilesDir()
            java.lang.String r11 = "diagnoseLogs"
            r0.<init>(r6, r11)
            boolean r6 = r0.exists()
            r11 = 0
            if (r6 == 0) goto L_0x01a7
            boolean r6 = r0.isDirectory()
            if (r6 == 0) goto L_0x01a7
            java.io.File[] r0 = r0.listFiles()
            if (r0 == 0) goto L_0x01a7
            int r6 = r0.length
            if (r6 == 0) goto L_0x01a7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            int r15 = r0.length
            r16 = r14
            r3 = 0
            r13 = r11
        L_0x00c2:
            if (r3 >= r15) goto L_0x012e
            r8 = r0[r3]
            if (r8 == 0) goto L_0x0120
            boolean r17 = r8.exists()     // Catch:{ all -> 0x0106 }
            if (r17 == 0) goto L_0x0120
            boolean r17 = r8.isFile()     // Catch:{ all -> 0x0106 }
            if (r17 == 0) goto L_0x0120
            long r17 = r8.length()     // Catch:{ all -> 0x0106 }
            int r19 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r19 == 0) goto L_0x0120
            java.lang.String r11 = r8.getName()     // Catch:{ all -> 0x0106 }
            java.lang.String r12 = "_"
            java.lang.String[] r11 = r11.split(r12)     // Catch:{ all -> 0x0106 }
            r12 = 0
            r11 = r11[r12]     // Catch:{ all -> 0x0106 }
            long r11 = java.lang.Long.parseLong(r11)     // Catch:{ all -> 0x0106 }
            r19 = r9
            r20 = r10
            long r9 = r4.b     // Catch:{ all -> 0x010a }
            int r21 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r21 < 0) goto L_0x0124
            long r9 = r4.c     // Catch:{ all -> 0x010a }
            int r21 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r21 >= 0) goto L_0x0124
            r6.add(r8)     // Catch:{ all -> 0x010a }
            long r8 = r8.length()     // Catch:{ all -> 0x010a }
            long r13 = r13 + r8
            goto L_0x0124
        L_0x0106:
            r19 = r9
            r20 = r10
        L_0x010a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "match log file error "
            r9.<init>(r10)
            java.lang.String r8 = r8.getAbsolutePath()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.iap.ac.android.loglite.utils.LoggerWrapper.e(r2, r8)
            goto L_0x0124
        L_0x0120:
            r19 = r9
            r20 = r10
        L_0x0124:
            int r3 = r3 + 1
            r9 = r19
            r10 = r20
            r8 = 0
            r11 = 0
            goto L_0x00c2
        L_0x012e:
            r19 = r9
            r20 = r10
            java.lang.String r0 = "("
            r2 = r16
            r2.append(r0)
            java.text.SimpleDateFormat r0 = r1.f
            long r8 = r4.b
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            java.lang.String r0 = r0.format(r3)
            r2.append(r0)
            java.lang.String r0 = " ~ "
            r2.append(r0)
            java.text.SimpleDateFormat r0 = r1.f
            long r8 = r4.c
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            java.lang.String r0 = r0.format(r3)
            r2.append(r0)
            java.lang.String r0 = " ) "
            r2.append(r0)
            int r0 = r6.size()
            if (r0 > 0) goto L_0x0176
            java.lang.String r0 = "not match any file"
            r2.append(r0)
            java.lang.String r0 = r4.f11046a
            java.lang.String r2 = r2.toString()
            r1.a(r0, r5, r2)
            goto L_0x01ac
        L_0x0176:
            java.lang.String r0 = "match "
            r2.append(r0)
            int r0 = r6.size()
            r2.append(r0)
            java.lang.String r0 = " log files,and files total length is "
            r2.append(r0)
            java.text.DecimalFormat r0 = r1.e
            float r3 = (float) r13
            r8 = 1149239296(0x44800000, float:1024.0)
            float r3 = r3 / r8
            float r3 = r3 / r8
            double r8 = (double) r3
            java.lang.String r0 = r0.format(r8)
            r2.append(r0)
            java.lang.String r0 = "MB"
            r2.append(r0)
            java.lang.String r0 = r4.f11046a
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "uploading"
            r1.a(r0, r3, r2)
            goto L_0x01ac
        L_0x01a7:
            r19 = r9
            r20 = r10
            r6 = 0
        L_0x01ac:
            if (r6 == 0) goto L_0x026d
            int r0 = r6.size()
            if (r0 <= 0) goto L_0x026d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.f11046a
            r2.append(r3)
            r3 = 95
            r2.append(r3)
            long r8 = java.lang.System.currentTimeMillis()
            r2.append(r8)
            java.lang.String r3 = ".zip"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            android.content.Context r9 = r1.g
            java.io.File r9 = r9.getCacheDir()
            r8.append(r9)
            java.lang.String r9 = "/diagnoseLogZip"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r3.<init>(r8, r2)
            com.iap.ac.android.diagnoselog.a.d r2 = new com.iap.ac.android.diagnoselog.a.d
            r2.<init>(r1)
            java.lang.String r8 = r3.getAbsolutePath()     // Catch:{ all -> 0x023f }
            r9 = 0
            com.iap.ac.android.diagnoselog.util.ProcessUtil.a(r6, r8, r9, r2)     // Catch:{ all -> 0x0240 }
            boolean r2 = r3.exists()
            if (r2 == 0) goto L_0x0239
            boolean r2 = r3.isFile()
            if (r2 == 0) goto L_0x0239
            long r10 = r3.length()
            r12 = 0
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x0239
            long r10 = r3.length()
            r12 = 20971520(0x1400000, double:1.03613076E-316)
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x0246
            java.lang.String r2 = "zipped file is "
            r0.append(r2)
            long r2 = r3.length()
            float r2 = (float) r2
            r3 = 1149239296(0x44800000, float:1024.0)
            float r2 = r2 / r3
            float r2 = r2 / r3
            r0.append(r2)
            java.lang.String r2 = "MB,that is too large"
            r0.append(r2)
            goto L_0x0245
        L_0x0239:
            java.lang.String r2 = "zip file not exist"
            r0.append(r2)
            goto L_0x0245
        L_0x023f:
            r9 = 0
        L_0x0240:
            java.lang.String r2 = "zip file fail"
            r0.append(r2)
        L_0x0245:
            r3 = r9
        L_0x0246:
            if (r3 == 0) goto L_0x0257
            com.iap.ac.android.diagnoselog.upload.IDiagnoseUploader r0 = r1.d
            com.iap.ac.android.diagnoselog.upload.OSSUploader r0 = (com.iap.ac.android.diagnoselog.upload.OSSUploader) r0
            java.util.concurrent.ThreadPoolExecutor r2 = r0.c
            com.iap.ac.android.diagnoselog.b.a r5 = new com.iap.ac.android.diagnoselog.b.a
            r5.<init>(r0, r3, r4)
            r2.execute(r5)
            goto L_0x026b
        L_0x0257:
            java.lang.String r2 = r4.f11046a
            java.lang.String r0 = r0.toString()
            r1.a(r2, r5, r0)
            com.iap.ac.android.diagnoselog.api.OnLogUploadListener r0 = r1.f11045a
            if (r0 == 0) goto L_0x026b
            r2 = r20
            r3 = 0
            r0.onFinished(r3, r2)
            goto L_0x027e
        L_0x026b:
            r3 = 0
            goto L_0x027e
        L_0x026d:
            r2 = r20
            r3 = 0
            java.lang.String r0 = r4.f11046a
            java.lang.String r6 = "there are no match log files"
            r1.a(r0, r5, r6)
            com.iap.ac.android.diagnoselog.api.OnLogUploadListener r0 = r1.f11045a
            if (r0 == 0) goto L_0x027e
            r0.onFinished(r3, r2)
        L_0x027e:
            com.iap.ac.android.diagnoselog.core.DiagnoseLogContext r0 = com.iap.ac.android.diagnoselog.core.DiagnoseLogContext.b()
            java.lang.String r2 = r4.f11046a
            android.app.Application r0 = r0.d
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r7, r3)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r3 = r19
            r0.putString(r3, r2)
            r0.apply()
        L_0x0296:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.diagnoselog.core.UserDiagnosing.a(java.lang.String):void");
    }

    public final void a(String str, String str2, String str3) {
        this.b.execute(new b(str, str2, str3));
    }
}
