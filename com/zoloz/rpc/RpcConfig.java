package com.zoloz.rpc;

import com.zoloz.rpccommon.IRpcInterface;
import com.zoloz.rpccommon.RpcInterceptor;
import java.util.HashMap;

public class RpcConfig {
    public static boolean needCatchRpc = false;
    public static boolean needDebugRpc = false;
    private static RpcConfig sInstance = new RpcConfig();
    private String appId;
    private int connectTimeout;
    private HashMap<String, String> headers;
    private boolean isEncodeParam;
    private boolean keepAlive = true;
    private int readTimeout;
    private String remoteInitUrl;
    private String remoteUrl;
    private RpcInterceptor rpcInterceptor;
    private IRpcInterface rpcProxyImpl;
    private String workspaceId;

    public static RpcConfig getInstance() {
        return sInstance;
    }

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public void setWorkspaceId(String str) {
        this.workspaceId = str;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public int getReadTimeout() {
        return this.readTimeout;
    }

    public void setReadTimeout(int i) {
        this.readTimeout = i;
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public void setConnectTimeout(int i) {
        this.connectTimeout = i;
    }

    public String getRemoteUrl() {
        return this.remoteUrl;
    }

    public void setRemoteUrl(String str) {
        this.remoteUrl = str;
    }

    public boolean isEncodeParam() {
        return this.isEncodeParam;
    }

    public void setEncodeParam(boolean z) {
        this.isEncodeParam = z;
    }

    public void registerImpl(IRpcInterface iRpcInterface) {
        this.rpcProxyImpl = iRpcInterface;
    }

    public IRpcInterface getRpcProxyImpl() {
        return this.rpcProxyImpl;
    }

    public boolean isKeepAlive() {
        return this.keepAlive;
    }

    public void setKeepAlive(boolean z) {
        this.keepAlive = z;
    }

    public String getRemoteInitUrl() {
        return this.remoteInitUrl;
    }

    public void setRemoteInitUrl(String str) {
        this.remoteInitUrl = str;
    }

    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    public void setHeaders(HashMap<String, String> hashMap) {
        this.headers = hashMap;
    }
}
