package com.alibaba.ariver.remotedebug.core;

public class DefaultRemoteDebugProxyImpl implements RVRemoteDebugProxy {
    public boolean enableTyroBlock(String str) {
        return true;
    }

    public String getRemoteDebugWebSocketUrl(String str, String str2) {
        return null;
    }

    public String getRemoteDebugWebSocketUrlForDebug(String str, String str2) {
        return null;
    }

    public boolean supportRemoteDebug(String str) {
        return true;
    }

    public boolean tyroRequestHasPermission(String str, String str2) {
        return true;
    }
}
