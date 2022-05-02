package com.alipay.mobile.security.bio.service.local.rpc;

import com.alipay.mobile.security.bio.service.local.LocalService;
import java.util.Map;

public abstract class BioRPCService extends LocalService {
    public void addRequestHeaders(Object obj, Map<String, String> map) {
    }

    public abstract <T> T getRpcProxy(Class<T> cls);

    public void setExtProperties(Map<String, Object> map) {
    }

    public abstract void setRemoteUrl(String str);
}
