package com.iap.ac.android.loglite.storage;

import android.app.Application;
import android.text.TextUtils;
import com.alipay.iap.android.aplog.api.LogCategory;
import com.iap.ac.android.common.account.ACUserInfoManager;
import com.iap.ac.android.loglite.api.AnalyticsHelper;
import com.iap.ac.android.loglite.api.InnerAnalyticsHelper;
import com.iap.ac.android.loglite.b.a;
import com.iap.ac.android.loglite.b.c;
import com.iap.ac.android.loglite.b.d;
import com.iap.ac.android.loglite.core.AnalyticsContext;
import com.iap.ac.android.loglite.interceptor.LoggerInterceptor;
import com.iap.ac.android.loglite.log.AntEvent;
import com.iap.ac.android.loglite.log.LogEvent;
import com.iap.ac.android.loglite.utils.BizCodeMatchUtils;
import com.iap.ac.android.loglite.utils.LoggerWrapper;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

public class AnalyticsStorageManager {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, AnalyticsStorage> f9738a = new ConcurrentHashMap();
    public Set<LoggerInterceptor> b = new CopyOnWriteArraySet();

    public AnalyticsStorageManager(Application application) {
        a(application);
    }

    public final void a(Application application) {
        this.f9738a.put(LogCategory.LOG_BEHAVIOUR_MANUAL, new c(application, LogCategory.LOG_BEHAVIOUR_MANUAL));
        this.f9738a.put("performance", new d(application, "performance"));
        this.f9738a.put(LogCategory.LOG_CATEGORY_HIGHAVAIL, new d(application, LogCategory.LOG_CATEGORY_HIGHAVAIL));
        this.f9738a.put("crash", new CrashFileStorage(application, "crash"));
        this.f9738a.put("antEvent", new a(application, (String) null));
    }

    public void a(LogEvent logEvent) {
        AnalyticsStorage analyticsStorage;
        if (AnalyticsContext.getInstance().getConfigurationManager().b(logEvent.e(), logEvent.c())) {
            String f = logEvent.f();
            long length = (long) f.length();
            if (length <= 102400) {
                String e = logEvent.e();
                if (logEvent instanceof AntEvent) {
                    analyticsStorage = this.f9738a.get("antEvent");
                } else {
                    analyticsStorage = this.f9738a.get(e);
                }
                if (analyticsStorage != null) {
                    analyticsStorage.a(logEvent);
                    Calendar instance = Calendar.getInstance();
                    int i = instance.get(2) + 1;
                    int i2 = instance.get(4);
                    int i3 = instance.get(3);
                    int i4 = instance.get(1);
                    StringBuilder sb = new StringBuilder(AnalyticsContext.KEY_MONTH);
                    sb.append(i4);
                    sb.append(BizCodeMatchUtils.a(i));
                    sb.append("_");
                    String openId = ACUserInfoManager.getInstance(logEvent.e).getOpenId();
                    String str = "-";
                    if (TextUtils.isEmpty(openId)) {
                        openId = str;
                    }
                    sb.append(openId);
                    sb.append(AnalyticsContext.getInstance().getOriginalInstanceId());
                    String obj = sb.toString();
                    StringBuilder sb2 = new StringBuilder(AnalyticsContext.KEY_WEEK);
                    sb2.append(i4);
                    sb2.append(BizCodeMatchUtils.a(i3));
                    sb2.append("_");
                    String openId2 = ACUserInfoManager.getInstance(logEvent.e).getOpenId();
                    if (!TextUtils.isEmpty(openId2)) {
                        str = openId2;
                    }
                    sb2.append(str);
                    sb2.append(AnalyticsContext.getInstance().getOriginalInstanceId());
                    String obj2 = sb2.toString();
                    if (!AnalyticsContext.getInstance().hasSendUVStatisticsWithKey(obj)) {
                        AnalyticsContext.getInstance().recordHasSendUV(obj);
                        HashMap hashMap = new HashMap();
                        hashMap.put("month", String.valueOf(i));
                        InnerAnalyticsHelper.sendBehaviorLog("UVStatistics", logEvent.c(), hashMap);
                    }
                    if (!AnalyticsContext.getInstance().hasSendUVStatisticsWithKey(obj2)) {
                        AnalyticsContext.getInstance().recordHasSendUV(obj2);
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("month", String.valueOf(i));
                        hashMap2.put("week", String.valueOf(i3));
                        hashMap2.put("weekOfMonth", String.valueOf(i2));
                        InnerAnalyticsHelper.sendBehaviorLog("UVStatistics", logEvent.c(), hashMap2);
                    }
                    if (!this.b.isEmpty()) {
                        for (LoggerInterceptor onSendLog : this.b) {
                            onSendLog.onSendLog(f);
                        }
                    }
                    LoggerWrapper.i("AnalyticsStorageManager", "write log-- ".concat(String.valueOf(f)));
                    return;
                }
                return;
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("logLength", String.valueOf(length));
            AnalyticsHelper.sendPerformanceLog("logTooLong", hashMap3);
        }
    }
}
