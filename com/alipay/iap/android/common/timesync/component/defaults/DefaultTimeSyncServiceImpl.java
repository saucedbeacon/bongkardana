package com.alipay.iap.android.common.timesync.component.defaults;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.rpcintegration.RPCProxyHost;
import com.alipay.iap.android.common.task.async.IAPAsyncTask;
import com.alipay.iap.android.common.timesync.component.ITimeSyncCallback;
import com.alipay.iap.android.common.timesync.component.ITimeSyncService;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipayplus.mobile.component.common.rpc.basic.BasicTimeRpcFacade;
import com.alipayplus.mobile.component.common.rpc.basic.request.BasicTimeTickRpcRequest;
import com.alipayplus.mobile.component.common.rpc.basic.result.BasicTimeTickRpcResult;
import java.util.Locale;

public class DefaultTimeSyncServiceImpl implements ITimeSyncService {
    private static final String SHARED_PREFERENCES_NAME = "Alipay_time_sp";
    private static final String SP_SYNC_TIME = "sp_sync_time";
    private static final String SP_TIME_GAP = "sp_time_gap";
    /* access modifiers changed from: private */
    public static final String TAG = DefaultTimeSyncServiceImpl.class.getName();
    private static SharedPreferences sharedPreferences;
    private long mLastSyncTime = 0;
    private long mTimeGap = 0;

    public DefaultTimeSyncServiceImpl(Context context) {
        sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES_NAME, 0);
    }

    public void syncTime(@Nullable final ITimeSyncCallback iTimeSyncCallback) {
        IAPAsyncTask.asyncTask((Runnable) new Runnable() {
            public void run() {
                BasicTimeRpcFacade basicTimeRpcFacade = (BasicTimeRpcFacade) RPCProxyHost.getInterfaceProxy(BasicTimeRpcFacade.class);
                if (basicTimeRpcFacade == null) {
                    LoggerWrapper.e(DefaultTimeSyncServiceImpl.TAG, "getInterfaceProxy for BasicTimeRpcFacade error with null");
                    return;
                }
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    BasicTimeTickRpcResult tick = basicTimeRpcFacade.tick(new BasicTimeTickRpcRequest());
                    String access$000 = DefaultTimeSyncServiceImpl.TAG;
                    StringBuilder sb = new StringBuilder("syncTime in DefaultTimeSyncServiceImpl, callback is:");
                    sb.append(iTimeSyncCallback);
                    LoggerWrapper.i(access$000, sb.toString());
                    if (tick != null && tick.serviceTime > 0) {
                        DefaultTimeSyncServiceImpl.this.setServerTime(System.currentTimeMillis() - currentTimeMillis, tick.serviceTime);
                        if (iTimeSyncCallback != null && ITimeSyncCallback.class.isAssignableFrom(iTimeSyncCallback.getClass())) {
                            iTimeSyncCallback.onComplete(0);
                        }
                    } else if (iTimeSyncCallback != null && ITimeSyncCallback.class.isAssignableFrom(iTimeSyncCallback.getClass())) {
                        iTimeSyncCallback.onComplete(5001);
                    }
                } catch (RpcException e) {
                    String access$0002 = DefaultTimeSyncServiceImpl.TAG;
                    StringBuilder sb2 = new StringBuilder("syncTime error:");
                    sb2.append(e.getMessage());
                    LoggerWrapper.e(access$0002, sb2.toString());
                    ITimeSyncCallback iTimeSyncCallback = iTimeSyncCallback;
                    if (iTimeSyncCallback != null && ITimeSyncCallback.class.isAssignableFrom(iTimeSyncCallback.getClass())) {
                        iTimeSyncCallback.onComplete(5001);
                    }
                }
            }
        });
    }

    public void setServerTime(long j, long j2) {
        LoggerWrapper.i(TAG, String.format(Locale.getDefault(), "set serverTime = %d, requestCostTime = %d", new Object[]{Long.valueOf(j2), Long.valueOf(j)}));
        if (sharedPreferences == null) {
            LoggerWrapper.e(TAG, "can not set server time because of none access to storage");
            return;
        }
        synchronized (this) {
            long currentTimeMillis = System.currentTimeMillis();
            this.mLastSyncTime = currentTimeMillis;
            this.mTimeGap = currentTimeMillis - (j2 + (j / 2));
            sharedPreferences.edit().putLong(SP_TIME_GAP, this.mTimeGap).putLong(SP_SYNC_TIME, this.mLastSyncTime).apply();
        }
    }

    public long getServerTime() {
        if (sharedPreferences == null) {
            LoggerWrapper.e(TAG, "can not get server time because of none access to storage");
            return System.currentTimeMillis();
        }
        synchronized (this) {
            if (this.mTimeGap <= 0) {
                this.mTimeGap = sharedPreferences.getLong(SP_TIME_GAP, 0);
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.mTimeGap;
        LoggerWrapper.i(TAG, String.format(Locale.getDefault(), "get serverTime = %d, localTime = %d", new Object[]{Long.valueOf(j), Long.valueOf(currentTimeMillis)}));
        return j;
    }

    public long getLastSyncTime() {
        if (sharedPreferences == null) {
            LoggerWrapper.e(TAG, "can not get the latest sync time because of none access to storage");
            return -1;
        }
        synchronized (this) {
            if (this.mLastSyncTime <= 0) {
                this.mLastSyncTime = sharedPreferences.getLong(SP_SYNC_TIME, -1);
            }
        }
        LoggerWrapper.i(TAG, String.format(Locale.getDefault(), "get lastSyncTime = %d", new Object[]{Long.valueOf(this.mLastSyncTime)}));
        return this.mLastSyncTime;
    }
}
