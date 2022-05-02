package com.iap.ac.config.lite.g;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.log.ACMonitor;
import com.iap.ac.android.common.log.IACMonitor;
import com.iap.ac.android.common.log.event.LogEvent;
import com.iap.ac.android.common.log.event.PageLogEvent;
import com.iap.ac.android.loglite.api.AnalyticsConfig;
import com.iap.ac.android.loglite.api.CommonAnalyticsAgent;
import com.iap.ac.android.loglite.core.AnalyticsContext;
import com.iap.ac.config.lite.c.e;
import com.iap.ac.config.lite.common.AmcsConstants;
import com.iap.ac.config.lite.delegate.ConfigMonitor;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class b {
    /* access modifiers changed from: private */
    public static final String b = e.b("LogService");
    private static boolean c = false;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public CommonAnalyticsAgent f11070a;

    class a implements IACMonitor {
        a() {
        }

        public void flush() {
            b.this.f11070a.flushLogs();
        }

        public void logEvent(LogEvent logEvent) {
            if (logEvent != null) {
                String a2 = b.b;
                StringBuilder sb = new StringBuilder("logBehavior to lite log, bizCode:");
                sb.append(logEvent.bizCode);
                ACLog.i(a2, sb.toString());
                b.this.f11070a.sendBehaviorLog(logEvent.eventName, logEvent.bizCode, logEvent.params);
                return;
            }
            ACLog.i(b.b, "sendBehavior log error, event is null");
        }

        public void logPageEvent(PageLogEvent pageLogEvent) {
        }

        public void setGlobalParameters(Map<String, String> map) {
            AnalyticsContext.getInstance().setGlobalExtParam(map);
        }
    }

    /* renamed from: com.iap.ac.config.lite.g.b$b  reason: collision with other inner class name */
    static class C0101b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final b f11072a = new b();
    }

    protected b() {
    }

    @NonNull
    public static b b() {
        return C0101b.f11072a;
    }

    public void a(Context context, String str, String str2) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.getMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 32);
                onCancelLoad.setMax(-1702403699, oncanceled);
                onCancelLoad.getMin(-1702403699, oncanceled);
            }
        }
        synchronized (this) {
            if (!c) {
                if (!e.a("com.iap.ac.android.loglite.api.AnalyticsConfig") || !e.a("com.iap.ac.android.loglite.api.AnalyticsHelper")) {
                    ACLog.e(b, "lite log init error, without dependent libraries");
                    return;
                }
                AnalyticsConfig.init(context, str, str2);
                AnalyticsConfig.addCrashWhiteList("com.iap.ac");
                AnalyticsConfig.registerBizTypeToUploadUrl(ConfigMonitor.EVENT_BIZ_TYPE, str2);
                ACLog.i(b, "Log component initialize finish");
                this.f11070a = new CommonAnalyticsAgent(AmcsConstants.BIZ_CODE_AMCSLITE_FOR_MULTI_INSTANCE);
                ACMonitor.setACMonitorImpl(new a(), AmcsConstants.BIZ_CODE_AMCSLITE_FOR_MULTI_INSTANCE);
                c = true;
            }
        }
    }
}
