package com.alipay.multimedia.adjuster.api;

import com.alipay.multimedia.adjuster.api.data.IConfig;
import com.alipay.multimedia.adjuster.api.data.ITraceId;
import com.alipay.multimedia.adjuster.data.APMImageInfo;
import com.alipay.multimedia.adjuster.data.UrlInfo;
import com.alipay.multimedia.adjuster.mgr.APMCdnManager;
import com.alipay.multimedia.adjuster.utils.Log;
import com.alipay.multimedia.adjuster.utils.Logger;
import java.util.ArrayList;

public class APMAdjuster {
    public static void registerConfig(IConfig iConfig) {
        APMCdnManager.getIns().registerConfig(iConfig);
    }

    public static void registerITraceId(ITraceId iTraceId) {
        APMCdnManager.getIns().registerITraceId(iTraceId);
    }

    public static void registerLogger(Logger logger) {
        Log.setLogger(logger);
    }

    public static ArrayList<String> buildHighAvailabilityUrls(String str, String str2) {
        return APMCdnManager.getIns().buildHighAvailabilityUrls(str, str2, true);
    }

    public static ArrayList<String> buildHighAvailabilityUrls(String str, String str2, boolean z) {
        return APMCdnManager.getIns().buildHighAvailabilityUrls(str, str2, z);
    }

    public static boolean canExecAdapterForUrl(String str) {
        return APMCdnManager.getIns().canExecAdapterForUrl(str);
    }

    public static String parseImageUrlForAliCdn(String str, APMImageInfo.Format format, UrlInfo.Size size, UrlInfo.Size size2, APMImageInfo.CutType cutType) {
        return APMCdnManager.getIns().parseImageUrlForAliCdn(str, format, size, size2, cutType);
    }
}
