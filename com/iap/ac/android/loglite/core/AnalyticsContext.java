package com.iap.ac.android.loglite.core;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.alibaba.griver.base.common.utils.MD5Util;
import com.alipay.iap.android.aplog.api.LogCategory;
import com.alipay.iap.android.aplog.api.LogEventType;
import com.google.common.base.Ascii;
import com.iap.ac.android.common.instance.InstanceInfo;
import com.iap.ac.android.loglite.api.AnalyticsHelper;
import com.iap.ac.android.loglite.config.ConfigurationManager;
import com.iap.ac.android.loglite.config.LogStrategyInfo;
import com.iap.ac.android.loglite.storage.AnalyticsFileStorage;
import com.iap.ac.android.loglite.storage.AnalyticsStorage;
import com.iap.ac.android.loglite.storage.AnalyticsStorageManager;
import com.iap.ac.android.loglite.upload.HttpUploader;
import com.iap.ac.android.loglite.utils.AnonymizationUtil;
import com.iap.ac.android.loglite.utils.BizCodeMatchUtils;
import com.iap.ac.android.loglite.utils.ContextInfo;
import com.iap.ac.android.loglite.utils.Hex;
import com.iap.ac.android.loglite.utils.LoggerWrapper;
import id.dana.lib.gcontainer.app.bridge.logging.H5GetLogInfoBridge;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class AnalyticsContext {
    public static final String KEY_MONTH = "month_";
    public static final String KEY_WEEK = "week_";
    public static AnalyticsContext r;

    /* renamed from: a  reason: collision with root package name */
    public Application f9730a;
    public String b;
    public String c;
    public String d;
    public Map<String, String> e;
    public Map<String, String> f;
    public ContextInfo g;
    public AnalyticsStorageManager h;
    public Set<String> i;
    public ConfigurationManager j;
    public HttpUploader k;
    public Map<String, String> l;
    public ExecutorService m;
    public boolean n = false;

    /* renamed from: o  reason: collision with root package name */
    public LogEncryptClient f9731o;
    public AnonymizationUtil p;
    public Set<String> q;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ File f9732a;

        public a(File file) {
            this.f9732a = file;
        }

        public void run() {
            String logHost;
            HttpUploader httpUploader = AnalyticsContext.this.k;
            File file = this.f9732a;
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                StringBuilder sb = new StringBuilder(" do not need upload HttpUploader,uploadDir= ");
                sb.append(file.getAbsolutePath());
                LoggerWrapper.i(com.alipay.iap.android.aplog.core.uploader.HttpUploader.TAG, sb.toString());
                return;
            }
            StringBuilder sb2 = new StringBuilder(" will upload, count of all mdap files= ");
            sb2.append(listFiles.length);
            sb2.append(" ,uploadDir= ");
            sb2.append(file.getAbsolutePath());
            LoggerWrapper.i(com.alipay.iap.android.aplog.core.uploader.HttpUploader.TAG, sb2.toString());
            Arrays.sort(listFiles, Collections.reverseOrder());
            int i = 0;
            int i2 = 0;
            while (i < listFiles.length && i < 64) {
                File file2 = listFiles[i];
                if (file2 != null && file2.exists() && file2.isFile()) {
                    String name = file2.getName();
                    try {
                        AnalyticsContext instance = AnalyticsContext.getInstance();
                        logHost = instance.getLogHost();
                        String str = instance.getConfigurationManager().b;
                        if (!TextUtils.isEmpty(str)) {
                            logHost = str;
                        }
                        String urlByBizType = instance.getUrlByBizType(httpUploader.a(name));
                        if (!TextUtils.isEmpty(urlByBizType)) {
                            logHost = urlByBizType;
                        }
                    } catch (Exception e) {
                        LoggerWrapper.w(com.alipay.iap.android.aplog.core.uploader.HttpUploader.TAG, (Throwable) e);
                    } catch (Throwable th) {
                        i2++;
                        String obj = th.toString();
                        StringBuilder sb3 = new StringBuilder(" upload failed: ");
                        sb3.append(name);
                        sb3.append(" at ");
                        sb3.append(obj);
                        sb3.append(", uploadDir= ");
                        sb3.append(file.getAbsolutePath());
                        LoggerWrapper.e(com.alipay.iap.android.aplog.core.uploader.HttpUploader.TAG, sb3.toString());
                        if (i2 == 1) {
                            if ((th instanceof NullPointerException) || (th.getCause() != null && (th.getCause() instanceof NullPointerException))) {
                                LoggerWrapper.e(com.alipay.iap.android.aplog.core.uploader.HttpUploader.TAG, "uploadLog", th);
                            }
                            if (name.contains(LogCategory.LOG_CATEGORY_HIGHAVAIL)) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("errorMessage", obj);
                                AnalyticsHelper.sendPerformanceLog("keyBiztraceLogUploadFail", hashMap);
                            }
                        }
                    }
                    httpUploader.a(file2, logHost);
                    StringBuilder sb4 = new StringBuilder(" HttpUploader upload success: ");
                    sb4.append(name);
                    sb4.append(" ,uploadDir= ");
                    sb4.append(file);
                    sb4.append(",upload url = ");
                    sb4.append(logHost);
                    LoggerWrapper.i(com.alipay.iap.android.aplog.core.uploader.HttpUploader.TAG, sb4.toString());
                }
                i++;
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException unused) {
            }
            AnalyticsContext.this.uploadLog(new File(AnalyticsContext.this.f9730a.getFilesDir(), AnalyticsFileStorage.g));
        }
    }

    public AnalyticsContext(Application application, String str, String str2) {
        this.g = new ContextInfo(application);
        this.f9730a = application;
        this.b = str;
        this.c = str2;
        this.i = new HashSet();
        this.h = new AnalyticsStorageManager(application);
        this.j = new ConfigurationManager();
        this.k = new HttpUploader();
        this.p = new AnonymizationUtil();
        this.l = new ConcurrentHashMap();
        this.q = new CopyOnWriteArraySet();
        LoggerWrapper.init(application);
        refreshSessionId();
        a();
        c();
        this.m = Executors.newSingleThreadExecutor();
        CrashReporter.a();
        d();
        b();
    }

    public static AnalyticsContext getInstance() {
        AnalyticsContext analyticsContext = r;
        if (analyticsContext != null) {
            return analyticsContext;
        }
        throw new IllegalStateException("You should call init before getInstance");
    }

    public static synchronized void init(Context context, String str, String str2) {
        synchronized (AnalyticsContext.class) {
            if (r == null) {
                r = new AnalyticsContext((Application) context.getApplicationContext(), str, str2);
            }
        }
    }

    @VisibleForTesting
    public void a(String str, String str2, int i2, SharedPreferences.Editor editor) {
        if (str2.startsWith(str)) {
            int indexOf = str2.indexOf("_") + 1;
            if (Integer.parseInt(str2.substring(indexOf, str2.indexOf("_", indexOf))) < i2) {
                editor.remove(str2);
            } else {
                this.q.add(str2);
            }
        }
    }

    public void addCrashWhiteList(String str) {
        this.i.add(str);
    }

    @VisibleForTesting
    public void b() {
        SharedPreferences sharedPreferences = this.f9730a.getSharedPreferences("logLiteUVStatistics", 0);
        Map<String, ?> all = sharedPreferences.getAll();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Calendar instance = Calendar.getInstance();
        int i2 = instance.get(2) + 1;
        int i3 = instance.get(3);
        int i4 = instance.get(1);
        for (String next : all.keySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(i4);
            sb.append(BizCodeMatchUtils.a(i2));
            a(KEY_MONTH, next, Integer.parseInt(sb.toString()), edit);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i4);
            sb2.append(BizCodeMatchUtils.a(i3));
            a(KEY_WEEK, next, Integer.parseInt(sb2.toString()), edit);
        }
        edit.apply();
    }

    public final void c() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9730a.getFilesDir());
        String str = File.separator;
        sb.append(str);
        sb.append("liteLog");
        File file = new File(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f9730a.getFilesDir());
        sb2.append(str);
        sb2.append("loglite");
        sb2.append(str);
        sb2.append(this.b);
        File file2 = new File(sb2.toString());
        if (!file2.exists()) {
            file2.mkdirs();
            file.renameTo(file2);
        }
    }

    public final void d() {
        this.m.execute(new b());
    }

    public void flushLogs() {
        for (AnalyticsStorage a2 : this.h.f9738a.values()) {
            a2.a();
        }
    }

    public String getAnonymizationInfo(String str) {
        AnonymizationUtil anonymizationUtil = this.p;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String str2 = anonymizationUtil.f9740a.get(str);
        if (TextUtils.isEmpty(str2)) {
            try {
                byte[] digest = MessageDigest.getInstance(MD5Util.ALGORIGTHM_MD5).digest(str.getBytes());
                char[] cArr = Hex.f9744a;
                int length = digest.length;
                char[] cArr2 = new char[(length << 1)];
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    int i4 = i2 + 1;
                    cArr2[i2] = cArr[(digest[i3] & 240) >>> 4];
                    i2 = i4 + 1;
                    cArr2[i4] = cArr[digest[i3] & Ascii.SI];
                }
                str2 = new String(cArr2);
                anonymizationUtil.f9740a.put(str, str2);
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2.getMessage());
            }
        }
        return str2;
    }

    public Application getApplication() {
        return this.f9730a;
    }

    public ConfigurationManager getConfigurationManager() {
        return this.j;
    }

    public ContextInfo getContextInfo() {
        return this.g;
    }

    public Map<String, String> getExtraParamMap() {
        return this.e;
    }

    public Map<String, String> getGlobalExtParam() {
        return this.f;
    }

    public String getInstanceId() {
        if (!this.j.d) {
            return "-";
        }
        String instanceId = InstanceInfo.getInstanceId(this.f9730a);
        if (TextUtils.isEmpty(instanceId)) {
            return "-";
        }
        return getInstance().getConfigurationManager().f ? getAnonymizationInfo(instanceId) : instanceId;
    }

    public LogEncryptClient getLogEncryptClient() {
        return this.f9731o;
    }

    public String getLogHost() {
        String str;
        synchronized (this) {
            str = this.c;
        }
        return str;
    }

    public String getOriginalInstanceId() {
        String instanceId = InstanceInfo.getInstanceId(this.f9730a);
        return TextUtils.isEmpty(instanceId) ? "-" : instanceId;
    }

    public String getProductId() {
        String str;
        synchronized (this) {
            str = this.b;
        }
        return str;
    }

    public String getSessionId() {
        return this.d;
    }

    public AnalyticsStorageManager getStorageManager() {
        return this.h;
    }

    public String getUrlByBizType(String str) {
        String str2 = this.l.get(str);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        for (String next : this.l.keySet()) {
            if (BizCodeMatchUtils.a(next, str)) {
                return this.l.get(next);
            }
        }
        return str2;
    }

    public boolean hasSendUVStatisticsWithKey(String str) {
        return this.q.contains(str);
    }

    public boolean isNeedEncryptLog() {
        return this.n && this.f9731o != null;
    }

    public void recordHasSendUV(String str) {
        this.q.add(str);
        SharedPreferences.Editor edit = this.f9730a.getSharedPreferences("logLiteUVStatistics", 0).edit();
        edit.putInt(str, 1);
        edit.apply();
    }

    public void refreshSessionId() {
        this.d = UUID.randomUUID().toString();
    }

    public void registerBizTypeToUploadUrl(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.l.put(str, str2);
        }
    }

    public void setGlobalExtParam(Map<String, String> map) {
        if (LoggerWrapper.isDebuggable(this.f9730a)) {
            this.f = map;
        }
    }

    public void setNeedEncryptLog(boolean z) {
        this.n = z;
        if (z) {
            this.f9731o = new DefaultLogEncryptClient();
        } else {
            this.f9731o = null;
        }
    }

    public void setStrategyConfig(String str) {
        JSONObject optJSONObject;
        ConfigurationManager configurationManager = this.j;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("uploadUrl");
            if (!TextUtils.isEmpty(optString)) {
                configurationManager.b = optString;
            }
            configurationManager.c = jSONObject.optBoolean("collectOpenId", false);
            configurationManager.d = jSONObject.optBoolean("collectInstanceId", false);
            configurationManager.f = jSONObject.optBoolean("anonymization", true);
            configurationManager.e = jSONObject.optBoolean("collectCustomerId", false);
            configurationManager.g = jSONObject.optBoolean("customerIdAnonymization", true);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.equals(next, "uploadUrl") && (optJSONObject = jSONObject.optJSONObject(next)) != null) {
                    LogStrategyInfo logStrategyInfo = new LogStrategyInfo();
                    logStrategyInfo.isWrite = optJSONObject.optBoolean("write");
                    logStrategyInfo.maxLogCount = optJSONObject.optInt(LogEventType.CATEGOTY_MAX_LOG_COUNT);
                    configurationManager.f9729a.put(next, logStrategyInfo);
                }
            }
            configurationManager.a();
        } catch (Exception e2) {
            LoggerWrapper.w("ConfigurationManager", (Throwable) e2);
        }
    }

    public void update(@NonNull String str, @NonNull String str2) {
        synchronized (this) {
            this.b = str;
            this.c = str2;
        }
    }

    public void uploadLog(File file) {
        this.m.execute(new a(file));
    }

    public final void a() {
        String str;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.e = concurrentHashMap;
        concurrentHashMap.put(H5GetLogInfoBridge.RESULT_TIMEZONE, TimeZone.getDefault().getID());
        try {
            str = Build.BRAND.toLowerCase();
        } catch (Throwable unused) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        if (!TextUtils.isEmpty(str)) {
            this.e.put(H5GetLogInfoBridge.RESULT_BRAND, str);
        }
    }
}
