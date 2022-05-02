package com.alipay.iap.android.aplog.core.layout;

import androidx.annotation.NonNull;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.core.layout.mas.MasLog;
import com.alipay.iap.android.aplog.log.BaseLogInfo;
import java.util.HashMap;
import java.util.Map;

public class LogLayoutManager<T extends BaseLogInfo> {
    public static final String TAG = "LogLayoutManager";
    static LogLayoutManager layoutManager;
    private Layout<T> masLayout = new MASLayout();
    private Map<String, MasLog<T>> masLogMap = new HashMap();

    interface Layout<T extends BaseLogInfo> {
        LogLayout layout(T t, MasLog<T> masLog);
    }

    private LogLayoutManager() {
    }

    public static LogLayoutManager createInstance() {
        if (layoutManager == null) {
            layoutManager = new LogLayoutManager();
        }
        return layoutManager;
    }

    public static LogLayoutManager getInstance() {
        LogLayoutManager logLayoutManager = layoutManager;
        if (logLayoutManager != null) {
            return logLayoutManager;
        }
        throw new IllegalStateException("need createInstance before use");
    }

    public LogLayout getLogLayout(@NonNull T t, @NonNull String str) {
        if (!shouldwrite(t)) {
            return null;
        }
        if (this.masLayout != null && this.masLogMap.get(t.getLogCategory()) != null) {
            return this.masLayout.layout(t, this.masLogMap.get(t.getLogCategory()));
        }
        throw new IllegalStateException("no layout type found: ".concat(String.valueOf(str)));
    }

    public boolean shouldwrite(BaseLogInfo baseLogInfo) {
        return LoggerFactory.getLogContext().getFilter().shouldWrite(baseLogInfo.getLogCategory());
    }

    public void registerMasLog(String str, MasLog<T> masLog) {
        this.masLogMap.put(str, masLog);
    }
}
