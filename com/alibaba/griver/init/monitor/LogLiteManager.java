package com.alibaba.griver.init.monitor;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.griver.base.common.config.GriverInnerConfig;
import com.alibaba.griver.init.IAPConfig;
import com.iap.ac.android.loglite.api.AnalyticsConfig;

public class LogLiteManager {
    public static void init(Application application, IAPConfig iAPConfig) {
        AnalyticsConfig.init(application, iAPConfig.getExtra().getLogProductId(), iAPConfig.getExtra().getLogUploadURL());
        String config = GriverInnerConfig.getConfig("log_upload_strategy");
        if (!TextUtils.isEmpty(config)) {
            AnalyticsConfig.setStrategyConfig(config);
        }
    }
}
