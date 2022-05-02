package com.alibaba.griver.base.common.env;

import android.app.Activity;
import android.app.Application;
import android.content.res.Resources;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import java.lang.ref.WeakReference;

public class GriverRVEnvironmentServiceImpl implements RVEnvironmentService {
    @Nullable
    public String extractAppIdFromUrl(String str) {
        return null;
    }

    public String getAppCurrency() {
        return null;
    }

    public String getAppExternalStoragePath() {
        return null;
    }

    public String getAppGroup() {
        return null;
    }

    public int getAppLayoutDirection() {
        return 0;
    }

    public String getAppRegion() {
        return null;
    }

    public String getProductId() {
        return "Android-Container";
    }

    public Application getApplicationContext() {
        return GriverEnv.getApplicationContext();
    }

    public WeakReference<Activity> getTopActivity() {
        return GriverEnv.getTopActivity();
    }

    public int getLpid() {
        return GriverEnv.getLpid();
    }

    public boolean isBackgroundRunning() {
        return GriverEnv.isBackgroundRunning();
    }

    public Resources getResources(@Nullable String str) {
        return GriverEnv.getResources();
    }

    public void openUrl(String str) {
        GriverEnv.openUrl(str);
    }

    public String getProductVersion() {
        return GriverEnv.getProductVersion();
    }

    public String convertPlatform(String str) {
        return GriverEnv.convertPlatform(str);
    }

    public String defaultPlatform() {
        return GriverEnv.defaultPlatform();
    }

    public String getAppName() {
        return GriverEnv.getAppName();
    }

    public String getAppLanguage() {
        return GriverEnv.getAppLanguage();
    }
}
