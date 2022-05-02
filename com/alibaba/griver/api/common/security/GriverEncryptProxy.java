package com.alibaba.griver.api.common.security;

import com.alibaba.ariver.kernel.common.Proxiable;

public interface GriverEncryptProxy extends Proxiable {
    String decrypt(String str);

    String encrypt(String str);
}
