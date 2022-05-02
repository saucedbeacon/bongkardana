package com.zoloz.rpc.encryption;

import java.util.HashMap;
import java.util.Map;

public class EncryptionProxyManager {
    private Map<String, Class<BaseEncryptionFacade>> mAllEncryptionFacade = new HashMap();

    public void init() {
        add("com.zoloz.zhub.common.factor.facade.HummerGWFacade", "forward", "com.zoloz.zhub.factor.next", RpcFacade$4f4246c9f280f2d14d63a719db1c557b.class);
        add("com.alipay.bis.common.service.facade.gw.zim.ZimDispatchPbGwFacade", "initStandard", "com.zoloz.zhub.zim.init.pb.v2", RpcFacade$f60fd6a58d1add367082dd7569a2be55.class);
        add("com.alipay.bis.common.service.facade.gw.zim.ZimDispatchPbGwFacade", "validateStandard", "com.zoloz.zhub.zim.verify.pb.v2", RpcFacade$6549271a060d0fd8b7d704bf0e4fb0ca.class);
    }

    public EncryptionProxyManager() {
        init();
    }

    private void add(String str, String str2, String str3, Class<BaseEncryptionFacade> cls) {
        Map<String, Class<BaseEncryptionFacade>> map = this.mAllEncryptionFacade;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        map.put(sb.toString(), cls);
    }

    public Class<BaseEncryptionFacade> getFacade(String str, String str2, String str3) {
        Map<String, Class<BaseEncryptionFacade>> map = this.mAllEncryptionFacade;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return map.get(sb.toString());
    }
}
