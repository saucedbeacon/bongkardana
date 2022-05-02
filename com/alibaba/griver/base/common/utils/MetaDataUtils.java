package com.alibaba.griver.base.common.utils;

import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;

public class MetaDataUtils {
    public static String getMetaData(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            ApplicationInfo applicationInfo = GriverEnv.getApplicationContext().getPackageManager().getApplicationInfo(GriverEnv.getApplicationContext().getPackageName(), 128);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                String string = applicationInfo.metaData.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    return string;
                }
            }
        } catch (Exception e) {
            GriverLogger.e("MetaDataUtils", "getMetaData failed", e);
        }
        return "";
    }
}
