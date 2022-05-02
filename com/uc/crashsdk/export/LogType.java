package com.uc.crashsdk.export;

import com.alipay.iap.android.aplog.util.zip.LZMA_Base;

public class LogType {
    public static final int JAVA = 16;
    public static final String JAVA_TYPE = "java";
    public static final int NATIVE = 1;
    public static final String NATIVE_TYPE = "jni";
    public static final int UNEXP = 256;
    public static final String UNEXP_TYPE = "unexp";

    public static int addType(int i, int i2) {
        return i | (i2 & LZMA_Base.kMatchMaxLen);
    }

    public static boolean isForJava(int i) {
        return (i & 16) != 0;
    }

    public static boolean isForNative(int i) {
        return (i & 1) != 0;
    }

    public static boolean isForUnexp(int i) {
        return (i & 256) != 0;
    }

    public static int removeType(int i, int i2) {
        return i & ((i2 & LZMA_Base.kMatchMaxLen) ^ -1);
    }
}
