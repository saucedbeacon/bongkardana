package com.alipay.multimedia.adjuster.builder;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.griver.h5.permission.GriverJSAPIPermission;
import com.alipay.multimedia.adjuster.api.data.ITraceId;
import com.alipay.multimedia.adjuster.config.ConfigMgr;
import com.alipay.multimedia.adjuster.utils.AliCdnUtils;
import com.alipay.multimedia.adjuster.utils.Log;

public class UriBuilder {
    private static final String AFTS_CDN_HOST_DEV = "http://mmtcdp.stable.alipay.net:443";
    private static final String AFTS_MASTER_HOST_DEV = "https://mdgwdev.alipay.net";
    private static final String DEFAULT_BIZTYPE = "mm_other";
    private static final String DEFAULT_TRACEID = "afts_traceId";
    private static final String TAG = "UriBuilder";
    private static final Log logger = Log.getLogger(TAG);
    private static volatile ITraceId mITraceIdBuilder;

    public static boolean isOnline() {
        return true;
    }

    private static String buildAftsFileUrlInner(String str, String str2, String str3, boolean z) {
        if (isAftsUrl(str) || !AliCdnUtils.isHttp(Uri.parse(str))) {
            return str;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = DEFAULT_BIZTYPE;
        }
        String substring = str.substring(str.lastIndexOf("//") + 2, str.length());
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("/uri/file/");
        sb.append(substring);
        if (substring.contains("?")) {
            sb.append("&bz=");
            sb.append(str3);
        } else {
            sb.append("?bz=");
            sb.append(str3);
            sb.append("&tid=");
            sb.append(genTraceId());
        }
        if (z) {
            sb.append("&tid=");
            sb.append(genTraceId());
        }
        return sb.toString();
    }

    public static String buildAftsFilecCdnUrl(String str, String str2, boolean z) {
        return buildAftsFileUrlInner(str, getAftsCdnHost(), str2, z);
    }

    public static String buildAftsFileMasterUrl(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String aftsMasterHost = getAftsMasterHost();
        String[] aftsCdnPrefixs = getAftsCdnPrefixs();
        if (aftsCdnPrefixs != null && aftsCdnPrefixs.length > 0) {
            int length = aftsCdnPrefixs.length;
            for (int i = 0; i < length; i++) {
                String str3 = aftsCdnPrefixs[i];
                if (str.contains(str3)) {
                    String replace = str.replace(GriverJSAPIPermission.PROTOCOL_HTTP, GriverJSAPIPermission.PROTOCOL_HTTPS);
                    if (!str3.startsWith("http")) {
                        str3 = "https://".concat(String.valueOf(str3));
                    }
                    return replace.replace(str3, aftsMasterHost);
                }
            }
        }
        return buildAftsFileUrlInner(str, aftsMasterHost, str2, z);
    }

    private static String genTraceId() {
        String str;
        try {
            str = mITraceIdBuilder != null ? mITraceIdBuilder.genTraceId() : null;
        } catch (Exception unused) {
            str = DEFAULT_TRACEID;
        }
        if (TextUtils.isEmpty(str)) {
            return DEFAULT_TRACEID;
        }
        return str;
    }

    private static boolean isAftsUrl(String str) {
        String[] aftsCdnPrefixs = getAftsCdnPrefixs();
        if (!TextUtils.isEmpty(str) && aftsCdnPrefixs != null && aftsCdnPrefixs.length > 0) {
            for (String contains : aftsCdnPrefixs) {
                if (str.contains(contains)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String getAftsCdnHost() {
        return isOnline() ? ConfigMgr.getInc().getCdnConfigItem().aftsCdnHost : AFTS_CDN_HOST_DEV;
    }

    public static String getAftsMasterHost() {
        return isOnline() ? ConfigMgr.getInc().getCdnConfigItem().aftsMasterHost : AFTS_MASTER_HOST_DEV;
    }

    public static String[] getAftsCdnPrefixs() {
        return ConfigMgr.getInc().getCdnConfigItem().aftsCdnPrefixs;
    }

    public static void registerITraceId(ITraceId iTraceId) {
        mITraceIdBuilder = iTraceId;
    }
}
