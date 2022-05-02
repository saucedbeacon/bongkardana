package com.alipay.plus.push.core.api.util;

import android.content.Context;

public class MetaDataUtil {
    public static String getMetaData(Context context, String str) {
        try {
            Object obj = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get(str);
            if (obj == null) {
                return null;
            }
            return obj.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
