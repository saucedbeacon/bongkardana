package com.alipay.mobile.security.bio.service;

import com.alipay.mobile.security.bio.api.BioCallback;
import com.alipay.mobile.security.bio.utils.SignHelper;
import java.util.HashMap;
import java.util.UUID;

public class BioAppManager extends BioService {
    private HashMap<String, BioAppDescription> appDescMap;
    private HashMap<String, BioCallback> callbackMap;

    public void onCreate(BioServiceManager bioServiceManager) {
        super.onCreate(bioServiceManager);
        this.appDescMap = new HashMap<>();
        this.callbackMap = new HashMap<>();
    }

    private static String getUniqueTag() {
        UUID randomUUID = UUID.randomUUID();
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append("_");
        sb.append(Math.random() * 10000.0d);
        sb.append(randomUUID.toString());
        return SignHelper.MD5(sb.toString());
    }

    public String put(BioAppDescription bioAppDescription, BioCallback bioCallback) {
        String uniqueTag = getUniqueTag();
        bioAppDescription.setTag(uniqueTag);
        this.appDescMap.put(uniqueTag, bioAppDescription);
        this.callbackMap.put(uniqueTag, bioCallback);
        return uniqueTag;
    }

    public BioAppDescription getBioAppDescription(String str) {
        return this.appDescMap.get(str);
    }

    public BioCallback getBioCallback(String str) {
        return this.callbackMap.get(str);
    }

    public void onDestroy() {
        this.appDescMap.clear();
        this.callbackMap.clear();
        super.onDestroy();
    }
}
