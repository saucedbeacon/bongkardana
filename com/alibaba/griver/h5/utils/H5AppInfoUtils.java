package com.alibaba.griver.h5.utils;

import android.net.Uri;
import com.alibaba.griver.base.common.logger.GriverLogger;

public class H5AppInfoUtils {
    public static String getVhost(String str) {
        try {
            Uri parse = Uri.parse(str);
            StringBuilder sb = new StringBuilder();
            sb.append(parse.getScheme());
            sb.append("://");
            sb.append(parse.getHost());
            String obj = sb.toString();
            GriverLogger.d("H5AppInfoUtils", "vhost = ".concat(String.valueOf(obj)));
            return obj;
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("getVhost");
            sb2.append(e.getMessage());
            GriverLogger.w("H5AppInfoUtils", sb2.toString());
            return null;
        }
    }
}
