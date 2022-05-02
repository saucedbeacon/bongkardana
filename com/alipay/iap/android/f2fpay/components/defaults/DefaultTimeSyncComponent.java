package com.alipay.iap.android.f2fpay.components.defaults;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.ap.mobileprod.biz.f2fpay.rpc.F2fPayTickSyncFacade;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.rpcintegration.RPCProxyHost;
import com.alipay.iap.android.common.timesync.TimeSyncManager;
import com.alipay.iap.android.f2fpay.common.F2FPayAsyncTask;
import com.alipay.iap.android.f2fpay.common.F2FPayConstants;
import com.alipay.iap.android.f2fpay.components.IF2FPayTimeSyncComponent;
import com.alipay.iap.android.f2fpay.util.DeviceUtils;
import com.alipayplus.mobile.component.common.facade.base.request.BaseServiceRequest;
import com.alipayplus.mobile.component.f2fpay.service.result.F2fPayTickSyncResult;
import java.util.concurrent.TimeUnit;

public class DefaultTimeSyncComponent extends DefaultBaseComponent implements IF2FPayTimeSyncComponent {

    /* renamed from: a  reason: collision with root package name */
    private static final long f9319a = TimeUnit.HOURS.toMillis(6);
    protected long mPreviousSyncTimestamp = -1;

    static class SyncTimeResult {
        public int rpcTimeCostMillisecond;
        public String serverTimeMillisecond;

        private SyncTimeResult() {
        }
    }

    private boolean a() {
        long lastSyncTime = TimeSyncManager.getInstance(getContext()).getLastSyncTime();
        return lastSyncTime < 0 || System.currentTimeMillis() - lastSyncTime >= f9319a;
    }

    @SuppressLint({"DefaultLocale"})
    public long getServerTime() {
        long serverTime = TimeSyncManager.getInstance(getContext()).getServerTime();
        LoggerWrapper.i(F2FPayConstants.TAG, String.format("localTime = %d, serverTime = %d", new Object[]{Long.valueOf(System.currentTimeMillis()), Long.valueOf(serverTime)}));
        return serverTime;
    }

    @SuppressLint({"CommitPrefEdits", "DefaultLocale"})
    public void setServerTime(String str, int i) {
        LoggerWrapper.i(F2FPayConstants.TAG, String.format("setServerTime = %s, currentClientTimestamp = %d, rpcRequestCost: %d", new Object[]{str, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i)}));
        if (!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str)) {
            long parseLong = Long.parseLong(str) + ((long) (i / 2));
            keyValueAccessor().save("serverTimeGap", (int) (System.currentTimeMillis() - parseLong));
            this.mPreviousSyncTimestamp = SystemClock.elapsedRealtime();
            TimeSyncManager.getInstance(getContext()).setServerTime((long) i, Long.parseLong(str));
        }
    }

    public SyncTimeResult syncTimeTickRpc() throws Exception {
        long currentTimeMillis = System.currentTimeMillis();
        BaseServiceRequest baseServiceRequest = new BaseServiceRequest();
        baseServiceRequest.userId = getUserDelegate().getUserId();
        F2fPayTickSyncResult tick = ((F2fPayTickSyncFacade) RPCProxyHost.getInterfaceProxy(F2fPayTickSyncFacade.class)).tick(baseServiceRequest);
        int currentTimeMillis2 = (int) (System.currentTimeMillis() - currentTimeMillis);
        if (tick == null || !tick.success) {
            LoggerWrapper.e(F2FPayConstants.TAG, "Server tick sync FAILED!");
            return null;
        }
        SyncTimeResult syncTimeResult = new SyncTimeResult();
        syncTimeResult.rpcTimeCostMillisecond = currentTimeMillis2;
        if (tick != null) {
            syncTimeResult.serverTimeMillisecond = tick.serviceTime;
        }
        return syncTimeResult;
    }

    public void synchronizeTime() {
        if (DeviceUtils.isOnline(getContext()) && a()) {
            try {
                SyncTimeResult syncTimeTickRpc = syncTimeTickRpc();
                if (syncTimeTickRpc != null) {
                    setServerTime(syncTimeTickRpc.serverTimeMillisecond, syncTimeTickRpc.rpcTimeCostMillisecond);
                }
            } catch (Exception e) {
                LoggerWrapper.e(F2FPayConstants.TAG, "synchronizeTime", e);
            }
        }
    }

    public void synchronizeTimeInWorker() {
        F2FPayAsyncTask.asyncTask((Runnable) new Runnable() {
            public void run() {
                DefaultTimeSyncComponent.this.synchronizeTime();
            }
        });
    }
}
