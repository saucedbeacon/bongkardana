package o;

import android.os.SystemClock;
import com.alipay.iap.android.common.log.MonitorWrapper;
import com.alipay.mobile.rome.longlinkservice.ConnectionListenerAdapter;
import com.alipay.mobile.rome.longlinkservice.LongLinkSyncService;
import com.iap.ac.config.lite.common.KVBuilder;
import java.util.Map;

public final class onLoadResult {
    private static final String TAG = "SyncTriggerMonitor";
    /* access modifiers changed from: private */
    public static long lastSyncConnectionFailedTime = 0;
    private static boolean syncMonitorRegistered = false;

    public static void monitorSyncConnectState() {
        monitorSyncConnectState(10000);
    }

    public static void monitorSyncConnectState(final long j) {
        updateActionSheetContent.d(TAG, "monitorSyncConnectState");
        if (syncMonitorRegistered) {
            updateActionSheetContent.d(TAG, "monitorSyncConnectState. already registered!");
            return;
        }
        MonitorWrapper.behaviour("sync_start", (Map<String, String>) null);
        syncMonitorRegistered = true;
        LongLinkSyncService.getInstance().addConnectionListener(new ConnectionListenerAdapter() {
            public final void onConnecting() {
                updateActionSheetContent.d(onLoadResult.TAG, "onConnecting");
            }

            public final void onConnected(long j) {
                updateActionSheetContent.d(onLoadResult.TAG, "onConnected. totalDuration = ".concat(String.valueOf(j)));
                long unused = onLoadResult.lastSyncConnectionFailedTime = 0;
            }

            public final void onConnectFailed(String str) {
                updateActionSheetContent.e(onLoadResult.TAG, "onConnectFailed. errorMessage = ".concat(String.valueOf(str)));
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - onLoadResult.lastSyncConnectionFailedTime > j) {
                    MonitorWrapper.behaviour("sync_fail", KVBuilder.newBuilder().put("errorMessage", str).build());
                } else {
                    updateActionSheetContent.i(onLoadResult.TAG, "Sync connect failed during 10s, will skip report this failure");
                }
                long unused = onLoadResult.lastSyncConnectionFailedTime = elapsedRealtime;
            }

            public final void onDisconnected() {
                updateActionSheetContent.d(onLoadResult.TAG, "onDisconnected");
            }
        });
    }
}
