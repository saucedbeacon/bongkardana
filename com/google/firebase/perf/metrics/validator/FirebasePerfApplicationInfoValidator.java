package com.google.firebase.perf.metrics.validator;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.v1.ApplicationInfo;

public class FirebasePerfApplicationInfoValidator extends PerfMetricValidator {
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final ApplicationInfo applicationInfo;

    FirebasePerfApplicationInfoValidator(ApplicationInfo applicationInfo2) {
        this.applicationInfo = applicationInfo2;
    }

    public boolean isValidPerfMetric() {
        if (isValidApplicationInfo()) {
            return true;
        }
        logger.warn("ApplicationInfo is invalid");
        return false;
    }

    private boolean isValidApplicationInfo() {
        ApplicationInfo applicationInfo2 = this.applicationInfo;
        if (applicationInfo2 == null) {
            logger.warn("ApplicationInfo is null");
            return false;
        } else if (!applicationInfo2.hasGoogleAppId()) {
            logger.warn("GoogleAppId is null");
            return false;
        } else if (!this.applicationInfo.hasAppInstanceId()) {
            logger.warn("AppInstanceId is null");
            return false;
        } else if (!this.applicationInfo.hasApplicationProcessState()) {
            logger.warn("ApplicationProcessState is null");
            return false;
        } else if (!this.applicationInfo.hasAndroidAppInfo()) {
            return true;
        } else {
            if (!this.applicationInfo.getAndroidAppInfo().hasPackageName()) {
                logger.warn("AndroidAppInfo.packageName is null");
                return false;
            } else if (this.applicationInfo.getAndroidAppInfo().hasSdkVersion()) {
                return true;
            } else {
                logger.warn("AndroidAppInfo.sdkVersion is null");
                return false;
            }
        }
    }
}
