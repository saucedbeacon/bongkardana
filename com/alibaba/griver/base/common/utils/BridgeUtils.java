package com.alibaba.griver.base.common.utils;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;

public class BridgeUtils {
    public static boolean contextIsValid(BridgeCallback bridgeCallback) {
        if (GriverEnv.getApplicationContext() != null) {
            return true;
        }
        GriverLogger.w("BridgeUtils", "context is null, callback error");
        if (bridgeCallback == null) {
            return false;
        }
        bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        return false;
    }
}
