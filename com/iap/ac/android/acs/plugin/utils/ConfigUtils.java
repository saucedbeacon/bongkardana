package com.iap.ac.android.acs.plugin.utils;

import android.text.TextUtils;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.remoteconfig.cpm.CPMConfig;
import com.iap.ac.android.biz.common.model.remoteconfig.cpm.RegionCodeTypeMapConfig;
import com.iap.ac.android.biz.common.model.remoteconfig.mpm.HookUrlConfig;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import java.util.Arrays;
import java.util.List;

public class ConfigUtils {
    public static List<HookUrlConfig> parseHookeUrlConfigList(String str) {
        try {
            return Arrays.asList((HookUrlConfig[]) JsonUtils.fromJson(str, HookUrlConfig[].class));
        } catch (Throwable th) {
            ACLog.e(Constants.TAG, "parseHookUrlConfigList exception: ".concat(String.valueOf(th)));
            return null;
        }
    }

    public static List<RegionCodeTypeMapConfig> parseRegionCodeTypeMapList(String str) {
        try {
            return Arrays.asList((RegionCodeTypeMapConfig[]) JsonUtils.fromJson(str, RegionCodeTypeMapConfig[].class));
        } catch (Throwable th) {
            ACLog.e(Constants.TAG, "parseRegionCodeTypeMapList exception: ".concat(String.valueOf(th)));
            return null;
        }
    }

    public static List<CPMConfig> parseCpmConfigList(String str) {
        try {
            return Arrays.asList((CPMConfig[]) JsonUtils.fromJson(str, CPMConfig[].class));
        } catch (Throwable th) {
            ACLog.e(Constants.TAG, "parseCpmConfigList exception: ".concat(String.valueOf(th)));
            return null;
        }
    }

    public static String toJson(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return JsonUtils.toJson(obj);
        } catch (Throwable th) {
            ACLog.e(Constants.TAG, "ConfigUtils, toJson exception: ".concat(String.valueOf(th)));
            return null;
        }
    }

    public static <T> T fromJson(String str, Class<T> cls) {
        if (!TextUtils.isEmpty(str) && cls != null) {
            try {
                return JsonUtils.fromJson(str, cls);
            } catch (Throwable th) {
                ACLog.e(Constants.TAG, "ConfigUtils, fromJson exception: ".concat(String.valueOf(th)));
            }
        }
        return null;
    }
}
