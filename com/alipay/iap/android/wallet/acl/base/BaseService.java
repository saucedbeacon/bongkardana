package com.alipay.iap.android.wallet.acl.base;

public interface BaseService {

    public static class NoServiceMetaInfoException extends Exception {
        public NoServiceMetaInfoException(String str) {
            super(str);
        }
    }

    public static class ServiceRegisterException extends Exception {
        public ServiceRegisterException(String str) {
            super(str);
        }

        public ServiceRegisterException(String str, Exception exc) {
            super(str, exc);
        }
    }
}
