package com.alibaba.griver.base.common.utils;

import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.logger.GriverLogger;

public class GriverConfigUtils {
    public static int transferStringConfigToInt(String str, int i) {
        try {
            return Integer.valueOf(GriverConfig.getConfig(str, String.valueOf(i))).intValue();
        } catch (Exception e) {
            GriverLogger.e("GriverConfigUtils", "parse config failed", e);
            return i;
        }
    }
}
