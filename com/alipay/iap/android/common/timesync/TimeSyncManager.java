package com.alipay.iap.android.common.timesync;

import android.content.Context;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.timesync.component.ITimeSyncCallback;
import com.alipay.iap.android.common.timesync.component.ITimeSyncService;
import com.alipay.iap.android.common.timesync.component.defaults.DefaultTimeSyncServiceImpl;

public class TimeSyncManager {
    private static final String TAG = TimeSyncManager.class.getName();
    private static volatile TimeSyncManager instance = null;
    private ITimeSyncService timeSyncComponent;

    private TimeSyncManager(Context context) {
        this.timeSyncComponent = createTimeSyncComponent(context);
    }

    private ITimeSyncService createTimeSyncComponent(Context context) {
        return new DefaultTimeSyncServiceImpl(context);
    }

    public static TimeSyncManager getInstance(Context context) {
        if (instance == null) {
            if (context == null) {
                LoggerWrapper.e(TAG, "context is null, can not create TimeSyncManager instance");
                return null;
            }
            synchronized (TimeSyncManager.class) {
                if (instance == null) {
                    instance = new TimeSyncManager(context);
                }
            }
        }
        return instance;
    }

    public synchronized void setServerTime(long j, long j2) {
        if (this.timeSyncComponent == null) {
            LoggerWrapper.e(TAG, "set server time failed because timeSyncComponent is null");
        } else {
            this.timeSyncComponent.setServerTime(j, j2);
        }
    }

    public synchronized void syncTime(@Nullable ITimeSyncCallback iTimeSyncCallback) {
        if (this.timeSyncComponent == null) {
            LoggerWrapper.e(TAG, "set server time failed because timeSyncComponent is null");
            return;
        }
        LoggerWrapper.i(TAG, "syncTime begin, callback is:".concat(String.valueOf(iTimeSyncCallback)));
        this.timeSyncComponent.syncTime(iTimeSyncCallback);
    }

    public long getServerTime() {
        ITimeSyncService iTimeSyncService = this.timeSyncComponent;
        if (iTimeSyncService != null) {
            return iTimeSyncService.getServerTime();
        }
        LoggerWrapper.e(TAG, "can not get server time because timeSyncComponent is null, return local time");
        return System.currentTimeMillis();
    }

    public long getLastSyncTime() {
        ITimeSyncService iTimeSyncService = this.timeSyncComponent;
        if (iTimeSyncService != null) {
            return iTimeSyncService.getLastSyncTime();
        }
        LoggerWrapper.e(TAG, "can not get server time because timeSyncComponent is null, return local time");
        return -1;
    }
}
