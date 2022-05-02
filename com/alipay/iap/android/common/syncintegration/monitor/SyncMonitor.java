package com.alipay.iap.android.common.syncintegration.monitor;

import android.os.SystemClock;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.log.MonitorWrapper;
import com.alipay.mobile.rome.longlinkservice.ConnectionListenerAdapter;
import com.alipay.mobile.rome.longlinkservice.LongLinkSyncService;
import java.util.HashMap;
import java.util.Map;

public class SyncMonitor {
    private static final String SYNC_FAIL = "sync_fail";
    private static final String SYNC_START = "sync_start";
    private static final String TAG = "SyncMonitor";
    /* access modifiers changed from: private */
    public static long lastSyncConnectionFailedTime = 0;
    private static boolean syncMonitorRegistered = false;

    public static void monitorSyncConnectState() {
        monitorSyncConnectState(10000);
    }

    public static void monitorSyncConnectState(final long j) {
        LoggerWrapper.d(TAG, "monitorSyncConnectState");
        if (syncMonitorRegistered) {
            LoggerWrapper.d(TAG, "monitorSyncConnectState. already registered!");
            return;
        }
        MonitorWrapper.behaviour(SYNC_START, (Map<String, String>) null);
        syncMonitorRegistered = true;
        LongLinkSyncService.getInstance().addConnectionListener(new ConnectionListenerAdapter() {
            public final void onConnecting() {
                LoggerWrapper.d(SyncMonitor.TAG, "onConnecting");
            }

            public final void onConnected(long j) {
                LoggerWrapper.d(SyncMonitor.TAG, "onConnected. totalDuration = ".concat(String.valueOf(j)));
                long unused = SyncMonitor.lastSyncConnectionFailedTime = 0;
            }

            public final void onConnectFailed(String str) {
                LoggerWrapper.e(SyncMonitor.TAG, "onConnectFailed. errorMessage = ".concat(String.valueOf(str)));
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - SyncMonitor.lastSyncConnectionFailedTime > j) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("errorMessage", str);
                    MonitorWrapper.behaviour(SyncMonitor.SYNC_FAIL, hashMap);
                } else {
                    LoggerWrapper.i(SyncMonitor.TAG, "Sync connect failed during 10s, will skip report this failure");
                }
                long unused = SyncMonitor.lastSyncConnectionFailedTime = elapsedRealtime;
            }

            public final void onDisconnected() {
                LoggerWrapper.d(SyncMonitor.TAG, "onDisconnected");
            }
        });
    }
}
