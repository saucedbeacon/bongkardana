package com.alibaba.griver.base.common.utils;

import android.os.Bundle;
import com.alibaba.fastjson.JSON;
import com.alibaba.griver.base.common.logger.GriverLogger;
import java.net.URLEncoder;
import o.getTabbarModel;

public class MonitorUtils {
    public static String getSourceInfoFromStartupParams(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("sourceInfo")) {
            return "";
        }
        try {
            return URLEncoder.encode(JSON.toJSONString(bundle.get("sourceInfo")), getTabbarModel.ENC);
        } catch (Exception e) {
            GriverLogger.e("MonitorUtils", "ENCODE ERROR", e);
            return "";
        }
    }
}
