package com.alibaba.griver.h5;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.api.common.config.GriverConfigProxy;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.h5.app.a;
import com.alibaba.griver.h5.app.b;

public class GriverH5 {
    public static void openUrl(Context context, String str, Bundle bundle) {
        b.a(context, str, bundle);
    }

    public static void preInstallH5Auto() {
        if (!ProcessUtils.isMainProcess()) {
            GriverLogger.w("GriverH5", "do not save cloud configuration in non-main process");
            return;
        }
        a.a(GriverConfig.getConfig(GriverConfigConstants.KEY_APP_SHARED_PACKAGES, "[]", new GriverConfigProxy.OnConfigChangeListener() {
            public final void onChange(String str) {
                a.a(str);
            }
        }));
        a.a(GriverConfig.getSectionConfigWithListener(GriverConfigConstants.KEY_APP_CONFIGURATION, new GriverConfigProxy.OnSectionConfigChangeListener() {
            public final void onChange(JSONObject jSONObject) {
                a.a(jSONObject);
            }
        }));
    }
}
