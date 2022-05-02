package com.alipay.mobile.security.bio.utils;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

public class StressTestUtil {
    static final String KEY_STRESS_TEST_KEY = "stress.test";
    static final String KEY_STRESS_TEST_NAME = "zface";
    static boolean isStressTest = false;

    public static boolean isStressTest() {
        return isStressTest;
    }

    public static void init(Context context, Map<String, String> map) {
        isStressTest = false;
        if (DeviceUtil.isDebug(context) && map != null && map.containsKey(KEY_STRESS_TEST_KEY)) {
            String remove = map.remove(KEY_STRESS_TEST_KEY);
            if (!TextUtils.isEmpty(remove) && remove.equalsIgnoreCase("zface")) {
                isStressTest = true;
            }
        }
    }
}
