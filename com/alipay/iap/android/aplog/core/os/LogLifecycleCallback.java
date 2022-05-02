package com.alipay.iap.android.aplog.core.os;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.iap.android.aplog.api.LogEventType;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.core.filter.StrategyManager;
import com.alipay.iap.android.aplog.core.logger.TraceLogger;
import com.alipay.iap.android.aplog.log.behavior.AliveReportLog;
import com.alipay.iap.android.aplog.log.behavior.AutoBehaviourLog;
import com.alipay.iap.android.aplog.util.ReflectUtil;
import java.util.HashMap;
import java.util.Iterator;

@TargetApi(14)
public class LogLifecycleCallback implements Application.ActivityLifecycleCallbacks {
    private static long LAST_RECORD_TIME = 0;
    public static final String TAG = "LogLifecycleCallback";
    public static boolean isBackground = false;
    private static int sAlive;
    private static int sForeground;
    private static int sVisible;
    private HashMap<String, AutoBehaviourLog> currentLogs = new HashMap<>();

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public LogLifecycleCallback(Context context) {
        try {
            AnonymousClass1 r0 = new BroadcastReceiver() {
                public void onReceive(Context context, Intent intent) {
                    if (intent != null && "android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                        LogLifecycleCallback.this.setForeground(false);
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            context.registerReceiver(r0, intentFilter);
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().warn("LoggingLifecycleCallback", th);
        }
    }

    /* access modifiers changed from: private */
    public void setForeground(boolean z) {
        try {
            ReflectUtil.invokeMethod("com.alipay.iap.android.aplog.core.logger.NativeCrashHandlerApi", "setForeground", new Class[]{Boolean.TYPE}, (Object) null, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            LoggerFactory.getTraceLogger().error(TAG, TextUtils.isEmpty(e.getMessage()) ? "reflect setForeground fail" : e.getMessage());
        }
    }

    public static boolean isOverAliveInterval() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - LAST_RECORD_TIME <= LoggerFactory.getLogContext().getLogAliveInterval()) {
            return false;
        }
        LAST_RECORD_TIME = currentTimeMillis;
        return true;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        sAlive++;
        setForeground(true);
        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(activity.getClass().getName());
        sb.append(" onActivityCreated ");
        traceLogger.debug(TAG, sb.toString());
    }

    public void onActivityStarted(Activity activity) {
        sVisible++;
        setForeground(true);
        if (sVisible > 0) {
            isBackground = false;
            onAppInForeground(activity);
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            StringBuilder sb = new StringBuilder();
            sb.append(activity.getPackageName());
            sb.append(" go to foreground");
            traceLogger.debug(TAG, sb.toString());
        }
        if (activity != null && shouldLog(activity.getClass().getName())) {
            AutoBehaviourLog autoBehaviourLog = new AutoBehaviourLog((Context) activity);
            autoBehaviourLog.setSeedID(activity.getClass().getName());
            TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
            StringBuilder sb2 = new StringBuilder("put activity: ");
            sb2.append(activity.getClass().getName());
            traceLogger2.debug(TAG, sb2.toString());
            this.currentLogs.put(activity.getClass().getName(), autoBehaviourLog);
        }
    }

    public void onActivityResumed(Activity activity) {
        sForeground++;
        setForeground(true);
        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(activity.getClass().getName());
        sb.append(" onActivityResumed ");
        traceLogger.debug(TAG, sb.toString());
        if (isOverAliveInterval()) {
            LoggerFactory.getLogContext().appendLog(new AliveReportLog());
        }
    }

    public void onActivityPaused(Activity activity) {
        sForeground--;
    }

    public void onActivityStopped(Activity activity) {
        AutoBehaviourLog remove;
        sVisible--;
        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(activity.getClass().getName());
        sb.append(" onActivityStopped ");
        traceLogger.debug(TAG, sb.toString());
        if (sVisible <= 0) {
            isBackground = true;
            onAppInBackground(activity);
            setForeground(false);
            LoggerFactory.getLogContext().notifyClientEvent(LogEventType.ENVENT_GOTOBACKGROUND, (Object) null);
            TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(activity.getPackageName());
            sb2.append(" go back to background ");
            traceLogger2.debug(TAG, sb2.toString());
        }
        if (activity != null && shouldLog(activity.getClass().getName()) && (remove = this.currentLogs.remove(activity.getClass().getName())) != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(System.currentTimeMillis());
            remove.setEndTime(sb3.toString());
            TraceLogger traceLogger3 = LoggerFactory.getTraceLogger();
            StringBuilder sb4 = new StringBuilder("remove  activity: ");
            sb4.append(activity.getClass().getName());
            traceLogger3.debug(TAG, sb4.toString());
            LoggerFactory.getLogContext().appendLog(remove);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        int i = sAlive - 1;
        sAlive = i;
        if (i <= 0) {
            try {
                ReflectUtil.invokeMethod("com.alipay.iap.android.aplog.core.logger.NativeCrashHandlerApi", "onExit", (Class<?>[]) null, (Object) null, (Object[]) null);
            } catch (Exception e) {
                LoggerFactory.getTraceLogger().error(TAG, TextUtils.isEmpty(e.getMessage()) ? "reflect onExit fail" : e.getMessage());
            }
        }
        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(activity.getClass().getName());
        sb.append(" onActivityDestroyed ");
        traceLogger.debug(TAG, sb.toString());
    }

    private boolean shouldLog(String str) {
        if (LoggerFactory.getLogContext().getAutoLogActivities() == null || LoggerFactory.getLogContext().getAutoLogActivities().size() <= 0) {
            return false;
        }
        Iterator<String> it = LoggerFactory.getLogContext().getAutoLogActivities().iterator();
        while (it.hasNext()) {
            if (it.next().equals(str)) {
                return true;
            }
        }
        return false;
    }

    private void onAppInBackground(Context context) {
        try {
            ReflectUtil.invokeMethod("com.alipay.iap.android.aplog.monitor.ANRBinder", "stopAnrWatch", (Class<?>[]) null, (Object) null, (Object[]) null);
        } catch (Exception e) {
            LoggerFactory.getTraceLogger().error(TAG, TextUtils.isEmpty(e.getMessage()) ? "stopAnrWatch error" : e.getMessage());
        }
        LoggerFactory.getLogContext().flush();
    }

    private void onAppInForeground(Context context) {
        if (StrategyManager.getInstance().isPerformanceLogEnable()) {
            try {
                ReflectUtil.invokeMethod("com.alipay.iap.android.aplog.monitor.ANRBinder", "startAnrWatch", new Class[]{Context.class}, (Object) null, new Object[]{context});
            } catch (Exception e) {
                LoggerFactory.getTraceLogger().error(TAG, TextUtils.isEmpty(e.getMessage()) ? "startAnrWatch error" : e.getMessage());
            }
        }
    }
}
