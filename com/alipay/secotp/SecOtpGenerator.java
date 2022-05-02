package com.alipay.secotp;

public class SecOtpGenerator {

    /* renamed from: a  reason: collision with root package name */
    private static SecOtpGenerator f9525a;

    static {
        try {
            System.loadLibrary("c9fdbe");
        } catch (Throwable unused) {
        }
    }

    private SecOtpGenerator() {
    }

    public static SecOtpGenerator getInstance() {
        if (f9525a == null) {
            synchronized (SecOtpGenerator.class) {
                if (f9525a == null) {
                    f9525a = new SecOtpGenerator();
                }
            }
        }
        return f9525a;
    }

    public native boolean checkConfigure(String str);

    public native int deleteConfigure(String str);

    public native String generatePayCode(String str, String str2, long j) throws SecOtpException;

    public native int initialize(String str);

    public native int saveConfigure(String str, String str2, String str3, long j);
}
