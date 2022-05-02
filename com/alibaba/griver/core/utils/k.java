package com.alibaba.griver.core.utils;

import android.app.Activity;
import android.os.Bundle;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.core.GriverParam;
import com.zoloz.builder.service.WebServiceProxy;

public class k {
    public static boolean a(Bundle bundle) {
        boolean z = BundleUtils.getBoolean(bundle, RVParams.isTinyApp, false);
        boolean equalsIgnoreCase = "yes".equalsIgnoreCase(BundleUtils.getString(bundle, GriverParam.USE_SW));
        if (z || equalsIgnoreCase) {
            return true;
        }
        return false;
    }

    public static void a(Activity activity, Bundle bundle, boolean z) {
        String string = BundleUtils.getString(bundle, "adjustResize");
        if (!"yes".equalsIgnoreCase(GriverConfig.getConfigWithProcessCache(WebServiceProxy.ADJUST_RESIZE, "")) && "yes".equalsIgnoreCase(string)) {
            GriverLogger.d("WebViewUtils", "useResize ".concat(String.valueOf(string)));
            GriverLogger.d("WebViewUtils", " AndroidBug5497Workaround ");
            a.a(activity, z);
        }
    }
}
