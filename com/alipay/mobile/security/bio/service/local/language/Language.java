package com.alipay.mobile.security.bio.service.local.language;

import o.startH5OpenAuth;

public enum Language {
    UNKNOWN(0, startH5OpenAuth.KEY_EN),
    ZH_HANS(1, "zh-Hans"),
    ZH_HANT(2, "zh-Hant"),
    ZH_HK(3, "zh-HK"),
    EN(4, startH5OpenAuth.KEY_EN);
    
    String name;
    int value;

    private Language(int i, String str) {
        this.value = i;
        this.name = str;
    }
}
