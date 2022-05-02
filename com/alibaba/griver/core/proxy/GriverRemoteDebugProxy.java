package com.alibaba.griver.core.proxy;

import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.remotedebug.core.RVRemoteDebugProxy;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.base.common.config.GriverConfig;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class GriverRemoteDebugProxy implements RVRemoteDebugProxy {
    public boolean enableTyroBlock(String str) {
        return true;
    }

    public boolean supportRemoteDebug(String str) {
        return true;
    }

    public boolean tyroRequestHasPermission(String str, String str2) {
        return true;
    }

    public String getRemoteDebugWebSocketUrl(String str, String str2) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1133290409, oncanceled);
            onCancelLoad.getMin(-1133290409, oncanceled);
        }
        String format = String.format("%s/group/connect/%s?scene=tinyAppDebug&roleType=TINYAPP&roleId=%s", new Object[]{GriverConfig.getConfig(GriverConfigConstants.KEY_WEBSOCKET_HOST_URL, ""), str2, str});
        RVLogger.d("GriverRemoteDebugProxy", "getRemoteDebugWebSocketUrl == ".concat(String.valueOf(format)));
        return format;
    }

    public String getRemoteDebugWebSocketUrlForDebug(String str, String str2) {
        String format = String.format("%s/group/connect/%s?scene=tinyAppDebug&roleType=TINYAPP&roleId=%s", new Object[]{GriverConfig.getConfig(GriverConfigConstants.KEY_WEBSOCKET_HOST_URL, ""), str2, str});
        RVLogger.d("GriverRemoteDebugProxy", "getRemoteDebugWebSocketUrlForDebug == ".concat(String.valueOf(format)));
        return format;
    }
}
