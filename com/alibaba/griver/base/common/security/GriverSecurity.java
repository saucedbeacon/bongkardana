package com.alibaba.griver.base.common.security;

import com.alibaba.griver.api.common.security.GriverEncryptProxy;
import com.alibaba.griver.base.common.logger.GriverLogger;

public class GriverSecurity implements GriverEncryptProxy {

    /* renamed from: a  reason: collision with root package name */
    private static final GriverSecurity f10221a = new GriverSecurity();
    private GriverEncryptProxy b = new GriverEncryptProxy() {
        public String encrypt(String str) {
            GriverLogger.d("GriverSecurity", "use default encrypt, return original content");
            return str;
        }

        public String decrypt(String str) {
            GriverLogger.d("GriverSecurity", "use default encrypt, return original content");
            return str;
        }
    };

    private GriverSecurity() {
    }

    public static GriverSecurity getInstance() {
        return f10221a;
    }

    public String encrypt(String str) {
        return this.b.encrypt(str);
    }

    public String decrypt(String str) {
        return this.b.decrypt(str);
    }

    public void setEncryptProxy(GriverEncryptProxy griverEncryptProxy) {
        if (griverEncryptProxy != null) {
            this.b = griverEncryptProxy;
        } else {
            GriverLogger.e("GriverSecurity", "should not set null proxy to GriverSecurity");
        }
    }
}
