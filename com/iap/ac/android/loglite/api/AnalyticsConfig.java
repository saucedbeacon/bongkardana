package com.iap.ac.android.loglite.api;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iap.ac.android.loglite.core.AnalyticsContext;
import java.util.Map;

public class AnalyticsConfig {
    public static void addCrashWhiteList(String str) {
        AnalyticsContext.getInstance().addCrashWhiteList(str);
    }

    public static void init(Context context, String str, String str2) {
        AnalyticsContext.init(context, str, str2);
    }

    public static void registerBizTypeToUploadUrl(String str, String str2) {
        AnalyticsContext.getInstance().registerBizTypeToUploadUrl(str, str2);
    }

    public static void setEncryptEnabled(boolean z) {
        AnalyticsContext.getInstance().setNeedEncryptLog(z);
    }

    public static void setGlobalExtParam(Map<String, String> map) {
        AnalyticsContext.getInstance().setGlobalExtParam(map);
    }

    public static void setStrategyConfig(String str) {
        AnalyticsContext.getInstance().setStrategyConfig(str);
    }

    public static void update(@NonNull String str, @NonNull String str2) {
        AnalyticsContext.getInstance().update(str, str2);
    }
}
