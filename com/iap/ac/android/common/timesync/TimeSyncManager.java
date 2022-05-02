package com.iap.ac.android.common.timesync;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.timesync.component.ITimeSyncCallback;
import com.iap.ac.android.common.timesync.component.ITimeSyncService;
import com.iap.ac.android.common.timesync.component.defaults.DefaultTimeSyncServiceImpl;
import java.util.HashMap;
import java.util.Map;

public class TimeSyncManager {
    private static final String TAG = TimeSyncManager.class.getName();
    private static volatile Map<String, TimeSyncManager> instanceMap = new HashMap();
    private ITimeSyncService timeSyncComponent;

    private TimeSyncManager(Context context) {
        this.timeSyncComponent = createTimeSyncComponent(context);
    }

    private ITimeSyncService createTimeSyncComponent(Context context) {
        return new DefaultTimeSyncServiceImpl(context);
    }

    public static TimeSyncManager getInstance(Context context, @NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        TimeSyncManager timeSyncManager = instanceMap.get(str);
        if (timeSyncManager == null) {
            if (context == null) {
                ACLog.e(TAG, "context is null, can not create TimeSyncManager instance");
                return null;
            }
            synchronized (TimeSyncManager.class) {
                if (timeSyncManager == null) {
                    timeSyncManager = new TimeSyncManager(context);
                    instanceMap.put(str, timeSyncManager);
                }
            }
        }
        return timeSyncManager;
    }

    public synchronized void setServerTime(long j, long j2) {
        if (this.timeSyncComponent == null) {
            ACLog.e(TAG, "set server time failed because timeSyncComponent is null");
        } else {
            this.timeSyncComponent.setServerTime(j, j2);
        }
    }

    public synchronized void syncTime(@Nullable ITimeSyncCallback iTimeSyncCallback) {
        if (this.timeSyncComponent == null) {
            ACLog.e(TAG, "set server time failed because timeSyncComponent is null");
            return;
        }
        ACLog.i(TAG, "syncTime begin, callback is:".concat(String.valueOf(iTimeSyncCallback)));
        this.timeSyncComponent.syncTime(iTimeSyncCallback);
    }

    public long getServerTime() {
        ITimeSyncService iTimeSyncService = this.timeSyncComponent;
        if (iTimeSyncService != null) {
            return iTimeSyncService.getServerTime();
        }
        ACLog.e(TAG, "can not get server time because timeSyncComponent is null, return local time");
        return System.currentTimeMillis();
    }

    public long getLastSyncTime() {
        ITimeSyncService iTimeSyncService = this.timeSyncComponent;
        if (iTimeSyncService != null) {
            return iTimeSyncService.getLastSyncTime();
        }
        ACLog.e(TAG, "can not get server time because timeSyncComponent is null, return local time");
        return -1;
    }
}
