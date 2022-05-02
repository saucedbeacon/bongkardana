package com.alipay.mobile.security.bio.exception;

public class BioObjectNotInitialException extends RuntimeException {
    public BioObjectNotInitialException(String str) {
        super("BIO:".concat(String.valueOf(str)));
    }
}
