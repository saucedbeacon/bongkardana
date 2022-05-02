package com.alipay.plus.android.ab.sdk.monitor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.log.MonitorWrapper;
import java.util.Map;

public abstract class AbTestingMonitor {
    public static final String EVENT_BIZ_TYPE = "AMCS-AB-TESTING";

    public static class Events {
        public static final String AB_FETCH_FAILURE = "ab_update_failure";
        public static final String AB_FETCH_START = "ab_update_start";
        public static final String AB_FETCH_SUCCESS = "ab_update_success";
        public static final String AB_INITIALIZED = "ab_initialized";
        public static final String AB_SYNC_GETDATA = "sync_get_ab_data";
    }

    public static class IAPLogMonitor extends AbTestingMonitor {
        /* access modifiers changed from: protected */
        public void behavior(@NonNull String str, @NonNull String str2, @Nullable Map<String, String> map) {
            MonitorWrapper.behaviour(str, str2, map);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void behavior(@NonNull String str, @NonNull String str2, @Nullable Map<String, String> map);

    public final void behavior(@NonNull String str, @Nullable Map<String, String> map) {
        behavior(str, EVENT_BIZ_TYPE, map);
    }
}
