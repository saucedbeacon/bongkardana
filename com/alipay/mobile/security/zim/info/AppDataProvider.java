package com.alipay.mobile.security.zim.info;

import android.content.Context;

public interface AppDataProvider {
    String getApdidToken(Context context);

    String getAppName(Context context);

    String getAppVersion(Context context);

    String getDeviceModel();

    String getDeviceType();

    String getOsVersion();
}
