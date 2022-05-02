package com.alipay.mobile.rome.syncsdk.util;

public final class AppStatusUtils {

    /* renamed from: a  reason: collision with root package name */
    public static ScreenStatus f9456a = ScreenStatus.SCREEN_ON;
    private static AppStatus b = AppStatus.BACKGROUND;

    public enum ScreenStatus {
        SCREEN_ON,
        SCREEN_OFF
    }

    public enum AppStatus {
        BACKGROUND("b"),
        FOREGROUND("f");
        
        private String value;

        private AppStatus(String str) {
            this.value = str;
        }

        public static String getValue(AppStatus appStatus) {
            for (AppStatus appStatus2 : values()) {
                if (appStatus2 == appStatus) {
                    return appStatus.value;
                }
            }
            return null;
        }
    }

    public static void a(AppStatus appStatus) {
        b = appStatus;
    }

    public static AppStatus a() {
        return b;
    }
}
