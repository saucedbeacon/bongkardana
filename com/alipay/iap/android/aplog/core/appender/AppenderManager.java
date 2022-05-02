package com.alipay.iap.android.aplog.core.appender;

import androidx.annotation.NonNull;
import com.alipay.iap.android.aplog.api.LogCategory;
import com.alipay.iap.android.aplog.api.LogContext;
import com.alipay.iap.android.aplog.api.LogEventType;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.core.layout.LogLayout;
import com.alipay.iap.android.aplog.log.FlushLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class AppenderManager {
    public static final String TAG = "AppenderManager";
    private static Map<String, Appender> appenderHashMap = new ConcurrentHashMap();
    private static AppenderManager appenderManager;
    private LogContext logContext;
    private List<OnAppendLogListener> onAppendLogListeners = new ArrayList();

    private AppenderManager(LogContext logContext2) {
        LogContext logContext3 = logContext2;
        this.logContext = logContext3;
        appenderHashMap.put(LogCategory.LOG_BEHAVIOUR_AUTO, new MdapFileLogAppender(logContext3, LogCategory.LOG_BEHAVIOUR_AUTO));
        appenderHashMap.put(LogCategory.LOG_BEHAVIOUR_MANUAL, new MdapFileLogAppender(logContext3, LogCategory.LOG_BEHAVIOUR_MANUAL));
        appenderHashMap.put(LogCategory.LOG_SPM, new MdapFileLogAppender(logContext3, LogCategory.LOG_SPM));
        appenderHashMap.put("performance", new MdapFileLogAppender(logContext3, "performance"));
        appenderHashMap.put(LogCategory.LOG_ALIVEREPORT, new MdapFileLogAppender(logContext3, LogCategory.LOG_ALIVEREPORT));
        appenderHashMap.put("crash", new MdapFileLogAppender(logContext3, "crash"));
        appenderHashMap.put("applog", new DiagnoseLogAppender(logContext2, "applog", TimeUnit.HOURS.toMillis(1), TimeUnit.DAYS.toMillis(7), 31457280, 65536));
        appenderHashMap.put("unknown", new LogFileLogAppender(logContext2, "unknown", TimeUnit.HOURS.toMillis(1), TimeUnit.DAYS.toMillis(7), 20971520, 65536));
    }

    public static AppenderManager createInstance(LogContext logContext2) {
        if (appenderManager == null) {
            appenderManager = new AppenderManager(logContext2);
        }
        return appenderManager;
    }

    public static AppenderManager getInstance() {
        AppenderManager appenderManager2 = appenderManager;
        if (appenderManager2 != null) {
            return appenderManager2;
        }
        throw new IllegalStateException("need createInstance before use");
    }

    public void addOnAppendLogListener(OnAppendLogListener onAppendLogListener) {
        this.onAppendLogListeners.add(onAppendLogListener);
    }

    public void removeOnAppendLogListener(OnAppendLogListener onAppendLogListener) {
        this.onAppendLogListeners.remove(onAppendLogListener);
    }

    public void appendLog(@NonNull LogLayout logLayout) {
        Map<String, Appender> map = appenderHashMap;
        if (map != null) {
            if (map.get(logLayout.getLogCategory()) == null) {
                appenderHashMap.put(logLayout.getLogCategory(), new MdapFileLogAppender(this.logContext, logLayout.getLogCategory()));
            }
            appenderHashMap.get(logLayout.getLogCategory()).onAppend(logLayout.getContent());
            if (!this.onAppendLogListeners.isEmpty()) {
                for (int i = 0; i < this.onAppendLogListeners.size(); i++) {
                    this.onAppendLogListeners.get(i).onAppendLog(logLayout.getContent());
                }
            }
        }
    }

    public void appendEvent(LogEvent logEvent) {
        if (logEvent != null && logEvent.getLogEventType() != null) {
            String logEventType = logEvent.getLogEventType();
            char c = 65535;
            int hashCode = logEventType.hashCode();
            if (hashCode != -998121387) {
                if (hashCode != 97532676) {
                    if (hashCode == 2123940242 && logEventType.equals(LogEventType.CATEGORY_UPLOAD_BY_TYPE)) {
                        c = 2;
                    }
                } else if (logEventType.equals("flush")) {
                    c = 0;
                }
            } else if (logEventType.equals(LogEventType.CATEGORY_FLUSH_BY_TYPE)) {
                c = 1;
            }
            if (c == 0) {
                flush();
            } else if (c == 1) {
                flush(logEvent.getLogCategory());
            } else if (c == 2) {
                LoggerFactory.getLogContext().upload(logEvent.getLogCategory());
            }
        }
    }

    public void appendFlushLog(FlushLog flushLog) {
        if (flushLog != null && flushLog.getLogEventType() != null) {
            String logEventType = flushLog.getLogEventType();
            char c = 65535;
            int hashCode = logEventType.hashCode();
            if (hashCode != -998121387) {
                if (hashCode == 97532676 && logEventType.equals("flush")) {
                    c = 0;
                }
            } else if (logEventType.equals(LogEventType.CATEGORY_FLUSH_BY_TYPE)) {
                c = 1;
            }
            if (c == 0) {
                flush();
            } else if (c == 1) {
                flush(flushLog.getLogCategory());
            }
        }
    }

    public void flush(String str) {
        if (appenderHashMap.containsKey(str)) {
            appenderHashMap.get(str).flush();
        }
    }

    public void flush() {
        for (String str : appenderHashMap.keySet()) {
            appenderHashMap.get(str).flush();
        }
    }

    public DiagnoseLogAppender getDiagnoseLogAppender() {
        Appender appender = appenderHashMap.get("applog");
        if (appender instanceof DiagnoseLogAppender) {
            return (DiagnoseLogAppender) appender;
        }
        return null;
    }
}
