package com.alipay.mobile.verifyidentity.business.activity;

public class ActivityInterfaceManager {
    private static ActivityInterface common = new DefaultActivityInterface();
    private static ActivityInterface otp = new DefaultActivityInterface();
    private static ActivityInterface pin = new DefaultActivityInterface();

    public static void injectOtpActivityInterface(ActivityInterface activityInterface) {
        if (activityInterface != null) {
            otp = activityInterface;
        }
    }

    public static void injectPinActivityInterface(ActivityInterface activityInterface) {
        if (activityInterface != null) {
            pin = activityInterface;
        }
    }

    public static void injectCommonActivityInterface(ActivityInterface activityInterface) {
        if (activityInterface != null) {
            common = activityInterface;
        }
    }

    public static ActivityInterface getOtpActivityInterface() {
        return otp;
    }

    public static ActivityInterface getPinActivityInterface() {
        return pin;
    }

    public static ActivityInterface getCommonActivityInterface() {
        return common;
    }
}
