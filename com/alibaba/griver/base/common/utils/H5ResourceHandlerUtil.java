package com.alibaba.griver.base.common.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.proxy.LocalIdTool;

public class H5ResourceHandlerUtil {
    public static final String AUDIO = "audio";
    public static final String IMAGE = "image";
    public static final String OTHER = "other";
    public static final String RESOURCE = "https://resource/";
    public static final String VIDEO = "video";

    public static String localIdToUrl(String str, String str2) {
        StringBuilder sb = new StringBuilder(RESOURCE);
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        return sb.toString();
    }

    public static String apUrlToFilePath(String str) {
        Uri parseUrl;
        String[] split;
        if (!TextUtils.isEmpty(str) && str.startsWith(RESOURCE) && ((str.endsWith(IMAGE) || str.endsWith("video") || str.endsWith("audio") || str.endsWith(OTHER)) && (parseUrl = H5UrlHelper.parseUrl(str)) != null && !TextUtils.isEmpty(parseUrl.getPath()) && (split = parseUrl.getPath().replace("/", "").split("\\.")) != null && split.length > 1)) {
            String str2 = split[0];
            try {
                if (!TextUtils.isEmpty(str2)) {
                    return LocalIdTool.get().decodeToPath(str2);
                }
            } catch (Exception e) {
                RVLogger.e("", (Throwable) e);
            }
        }
        return str;
    }
}
