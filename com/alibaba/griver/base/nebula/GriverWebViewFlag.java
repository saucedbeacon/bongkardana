package com.alibaba.griver.base.nebula;

import com.alibaba.ariver.kernel.common.utils.RVLogger;

public class GriverWebViewFlag {
    public static final int CREATE_SCENARIO_INIT = 3;
    public static final int CREATE_SCENARIO_INIT_UC = 2;
    public static final int CREATE_SCENARIO_INIT_UC_UNZIP = 1;
    public static final int CREATE_SCENARIO_INIT_UC_UNZIP_BG = 0;
    public static boolean initUcNormal = true;
    public static int sCreateScene = -1;
    public static long sCreateTimestamp = -1;
    public static boolean sUcFirstWebView = false;
    public static boolean sUseUCParallelInit = false;
    public static boolean sUseWebViewPool = false;
    public static long swFirstJsApiCallTime = 0;
    public static long ucDelayPreCreate = 0;
    public static boolean ucReady = false;

    public static void setInitScenario(long j, int i) {
        int i2 = sCreateScene;
        if (i2 < 0 || i2 >= i) {
            sCreateScene = i;
            sCreateTimestamp = j;
            return;
        }
        StringBuilder sb = new StringBuilder("setInitScenario fail, sCreateScene: ");
        sb.append(sCreateScene);
        sb.append(", sCreateTimestamp: ");
        sb.append(sCreateTimestamp);
        RVLogger.d("H5PageData", sb.toString());
    }
}
