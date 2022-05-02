package com.alibaba.griver.api.common.security;

import com.alibaba.griver.api.common.GriverExtension;

public interface GriverSecurityExtension extends GriverExtension {
    String decrypt(String str, String str2);

    String encrypt(String str);

    String getIdentifier();
}
