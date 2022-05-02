package com.alipay.iap.android.aplog.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;

public class ContextInfo {
    private Context context;
    private String productVersion;
    private String releaseType = "release";

    public ContextInfo(Context context2) {
        this.context = context2;
        initProductInfo();
    }

    private void initProductInfo() {
        if (this.productVersion == null) {
            PackageInfo packageInfo = null;
            try {
                if (this.context != null) {
                    packageInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0);
                }
            } catch (Throwable unused) {
            }
            if (packageInfo != null) {
                this.productVersion = packageInfo.versionName;
            }
        }
    }

    public String getProductVersion() {
        return this.productVersion;
    }

    public String getReleaseType() {
        return this.releaseType;
    }

    public void setReleaseType(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.releaseType = str;
        }
    }
}
