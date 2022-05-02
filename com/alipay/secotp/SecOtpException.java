package com.alipay.secotp;

public class SecOtpException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private int f9524a = 0;

    public SecOtpException(String str, int i) {
        super(str);
        this.f9524a = i;
    }

    public int getCode() {
        return this.f9524a;
    }
}
