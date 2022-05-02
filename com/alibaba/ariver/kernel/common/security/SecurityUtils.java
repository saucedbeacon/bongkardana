package com.alibaba.ariver.kernel.common.security;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.remotedebug.RDConstant;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.griver.api.common.config.GriverConfigConstants;

public class SecurityUtils {
    public static boolean checkUrlCanStart(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str2.startsWith(RDConstant.JAVASCRIPT_SCHEME)) {
            RVConfigService rVConfigService = (RVConfigService) RVProxy.get(RVConfigService.class);
            if (rVConfigService != null) {
                JSONArray configJSONArray = rVConfigService.getConfigJSONArray("h5_enableInterceptJavascriptInScheme");
                if (configJSONArray == null || !configJSONArray.contains(str)) {
                    RVLogger.d("AriverKernel:SecurityUtils", "H5StartAppBaseAdvice intercept javascript success");
                    return false;
                }
            } else {
                RVLogger.d("AriverKernel:SecurityUtils", "H5StartAppBaseAdvice intercept javascript success");
                return false;
            }
        }
        return true;
    }

    public static boolean checkUrlCanStartInPushWindow(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith(RDConstant.JAVASCRIPT_SCHEME)) {
            return true;
        }
        RVConfigService rVConfigService = (RVConfigService) RVProxy.get(RVConfigService.class);
        if (rVConfigService == null) {
            return false;
        }
        return "yes".equalsIgnoreCase(rVConfigService.getConfig(GriverConfigConstants.KEY_ENABLE_INTERCEPT_JS_IN_PUSHWINDOW, "no"));
    }
}
