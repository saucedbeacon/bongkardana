package com.alipay.mobile.security.bio.security;

import java.security.SecureRandom;

public class RandomHelper {
    public static byte[] random(int i) {
        if (i > 0) {
            byte[] bArr = new byte[i];
            new SecureRandom().nextBytes(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("number can not below zero");
    }
}
