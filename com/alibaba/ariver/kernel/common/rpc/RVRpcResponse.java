package com.alibaba.ariver.kernel.common.rpc;

import java.util.Map;

public class RVRpcResponse {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f10113a;
    private Object b;
    private String c;

    public RVRpcResponse(Map<String, String> map, Object obj) {
        this.f10113a = map;
        this.b = obj;
    }

    public RVRpcResponse(Map<String, String> map, Object obj, String str) {
        this.f10113a = map;
        this.b = obj;
        this.c = str;
    }

    public Map<String, String> getHeaders() {
        return this.f10113a;
    }

    public Object getResponse() {
        return this.b;
    }

    public String getTimeCost() {
        return this.c;
    }
}
