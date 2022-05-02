package com.alibaba.griver.base.common.utils;

public class UCUtils {
    public static boolean UCExist() {
        return ReflectUtils.classExist("com.alibaba.griver.uc.UcServiceImpl");
    }

    public static boolean isDynamicDelivery() {
        return ReflectUtils.classExist("com.google.android.play.core.splitinstall.SplitInstallManager");
    }
}
