package com.iap.ac.config.lite.delegate;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.log.ACMonitor;
import com.iap.ac.android.common.log.event.LogEvent;
import com.iap.ac.config.lite.c.e;
import com.iap.ac.config.lite.common.AmcsConstants;
import java.util.Map;

public abstract class ConfigMonitor {
    public static final String EVENT_BIZ_TYPE = "AMCS-LITE";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f9802a = e.b("ConfigMonitor");
    String bizCode;

    public static class ACLogMonitor extends ConfigMonitor {
        /* access modifiers changed from: protected */
        public void behavior(@NonNull String str, @NonNull String str2, @Nullable Map<String, String> map) {
            LogEvent logEvent = new LogEvent(str, map);
            logEvent.bizCode = str2;
            ACLog.d(ConfigMonitor.f9802a, String.format("Monitor event [%s] with bizCode [%s]", new Object[]{str, this.bizCode}));
            if (TextUtils.isEmpty(this.bizCode)) {
                ACMonitor.getInstance(AmcsConstants.BIZ_CODE_AMCSLITE_FOR_MULTI_INSTANCE).logEvent(logEvent);
            } else {
                ACMonitor.getInstance(this.bizCode).logEvent(logEvent);
            }
        }
    }

    public static class Events {
        public static final String CONFIG_BY_KEYS_UPDATE_FAILURE = "config_by_keys_update_failure";
        public static final String CONFIG_BY_KEYS_UPDATE_START = "config_by_keys_update_start";
        public static final String CONFIG_BY_KEYS_UPDATE_SUCCESS = "config_by_keys_update_success";
        public static final String CONFIG_DECRYPT_FAIL = "config_decrypt_fail";
        public static final String CONFIG_DNS_CHECK_FAILED = "config_dns_check_failed";
        public static final String CONFIG_INITIALIZED = "config_initialized";
        public static final String CONFIG_MERGE_RESULT = "config_merge_result";
        public static final String CONFIG_RATE_LIMITED = "config_rate_limited";
        public static final String CONFIG_TOTAL_UPDATE_START = "config_total_update_start";
        public static final String CONFIG_TOTAL_UPDATE_SUCCESS = "config_total_update_success";
        public static final String CONFIG_UPDATE_BY_DNS = "config_update_by_dns";
        public static final String CONFIG_UPDATE_FAILURE = "config_update_failure";
        public static final String CONFIG_UPDATE_RETRY = "config_update_retry";
        public static final String CONFIG_UPDATE_START = "config_update_start";
        public static final String CONFIG_UPDATE_SUCCESS = "config_update_success";
    }

    public static class Keywords {
        public static final String KEY_WORD_IS_RETRY = "isRetry";
        public static final String KEY_WORD_NEED_ENCRYPT = "needEncrypt";
    }

    public static class MockMonitor extends ConfigMonitor {
        private static final String b = e.b("MockMonitor");

        public void behavior(@NonNull String str, @NonNull String str2, @Nullable Map<String, String> map) {
            ACLog.d(b, String.format("behavior: event = %s, bizType = %s, extParams = %s", new Object[]{str, str2, String.valueOf(map)}));
        }
    }

    /* access modifiers changed from: protected */
    public abstract void behavior(@NonNull String str, @NonNull String str2, @Nullable Map<String, String> map);

    public final void behavior(@NonNull String str, @Nullable Map<String, String> map) {
        behavior(str, EVENT_BIZ_TYPE, map);
    }

    public void setBizCode(String str) {
        this.bizCode = str;
    }
}
