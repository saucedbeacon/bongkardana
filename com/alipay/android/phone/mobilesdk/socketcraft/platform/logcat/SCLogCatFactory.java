package com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat;

import com.alipay.android.phone.mobilesdk.socketcraft.platform.PlatformUtil;

public class SCLogCatFactory {
    private static SCLogCatInterface SOSCKT_CRAFT_LOG;

    public static void setLogImpl(SCLogCatInterface sCLogCatInterface) {
        SOSCKT_CRAFT_LOG = sCLogCatInterface;
    }

    public static SCLogCatInterface getSCLog() {
        SCLogCatInterface sCLogCatInterface = SOSCKT_CRAFT_LOG;
        if (sCLogCatInterface != null) {
            return sCLogCatInterface;
        }
        synchronized (SCLogCatFactory.class) {
            if (SOSCKT_CRAFT_LOG != null) {
                SCLogCatInterface sCLogCatInterface2 = SOSCKT_CRAFT_LOG;
                return sCLogCatInterface2;
            }
            if (!PlatformUtil.isAndroidPlatform()) {
                SOSCKT_CRAFT_LOG = PlatformUtil.createJavaLogImpl();
            } else if (PlatformUtil.isAndroidMPaaSPlatform()) {
                SOSCKT_CRAFT_LOG = PlatformUtil.createAndroidMPaaSLogImpl();
            } else {
                SOSCKT_CRAFT_LOG = PlatformUtil.createAndroidLogImpl();
            }
            SCLogCatInterface sCLogCatInterface3 = SOSCKT_CRAFT_LOG;
            return sCLogCatInterface3;
        }
    }
}
