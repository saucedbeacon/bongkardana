package com.alibaba.griver.core.utils;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.utils.IOUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.Map;

public class e {
    private static String a(Page page) {
        StringBuilder sb = new StringBuilder("bridge_token_");
        sb.append(page.getNodeId());
        return sb.toString();
    }

    public static String a(Map<String, String> map, Page page, String str) {
        String readAsset = IOUtils.readAsset(((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getResources((String) null), "GriverBridge/h5_bridge.js");
        if (TextUtils.isEmpty(readAsset)) {
            RVLogger.d("WebRenderUtils", "no bridge data defined!");
            return readAsset;
        }
        StringBuilder sb = new StringBuilder();
        for (String next : map.keySet()) {
            sb.append(";AlipayJSBridge.");
            sb.append(next);
            sb.append(SimpleComparison.EQUAL_TO_OPERATION);
            sb.append(map.get(next));
            sb.append(";");
        }
        if (!TextUtils.isEmpty(sb.toString())) {
            readAsset = readAsset.replace("AlipayJSBridge.startupParams='{startupParams}'", sb.toString());
        } else {
            RVLogger.d("WebRenderUtils", "no params data defined!");
        }
        return a(readAsset.replace("console.log(\"begin load AlipayJSBridge\");", "console.log(\"begin load AlipayJSBridge from core raw\");").replace("'{APVIEWID}'", str).replace("{bridge_token}", page != null ? a(page) : ""));
    }

    private static String a(String str) {
        String configWithProcessCache = GriverConfig.getConfigWithProcessCache(GriverConfigConstants.KEY_H5_PATCH_JS_BRIDGE, "");
        if (TextUtils.isEmpty(configWithProcessCache)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\n");
        sb.append(configWithProcessCache);
        return sb.toString();
    }
}
