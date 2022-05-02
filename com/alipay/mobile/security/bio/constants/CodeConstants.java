package com.alipay.mobile.security.bio.constants;

import java.util.HashMap;
import java.util.Map;

public class CodeConstants {
    public static String ANDROID_VERSION_LOW = "Z1004";
    public static String ERROR_CAMERA = "Z1002";
    public static String ERROR_LOAD_SO = "Z1001";
    public static String INVALID_ARGUMENT = "Z1010";
    public static String LIVENESS_ERROR = "Z1013";
    public static String NETWORK_ERROR = "Z1012";
    public static String NETWORK_TIMEOUT = "Z1011";
    public static String OUT_TIME = "Z1006";
    public static String OVER_TIME = "Z1005";
    public static String SERVER_FAIL = "Z1007";
    public static String SERVER_PARAM_ERROR = "Z1000";
    public static String USER_BACK = "Z1009";
    public static String USER_QUITE = "Z1008";
    public static String USER_UNSURPPORT_CPU = "Z1003";
    public static final String ZTECH_SYSTEM_ERROR = "ztech_system_error";
    private static Map map = new HashMap() {
        {
            put(CodeConstants.SERVER_PARAM_ERROR, "抱歉，系统出错了，请您稍后再试");
            put(CodeConstants.ERROR_LOAD_SO, "抱歉，系统出错了，请您稍后再试");
            put(CodeConstants.USER_QUITE, "用户主动退出");
            put(CodeConstants.OVER_TIME, "刷脸超时");
            put(CodeConstants.ERROR_CAMERA, "无法启动相机");
            put(CodeConstants.OUT_TIME, "本次操作失败");
            put(CodeConstants.USER_BACK, "验证中断");
            put(CodeConstants.USER_UNSURPPORT_CPU, "当前设备不支持刷脸");
            put(CodeConstants.ANDROID_VERSION_LOW, "当前系统不支持刷脸");
            put(CodeConstants.INVALID_ARGUMENT, "业务参数错误");
            put(CodeConstants.NETWORK_TIMEOUT, "网络超时");
            put(CodeConstants.SERVER_FAIL, "本次操作失败");
            put(CodeConstants.NETWORK_ERROR, "网络异常");
            put(CodeConstants.LIVENESS_ERROR, "本次操作失败");
        }
    };

    public static String getMessage(String str) {
        return String.format("%s(%s)", new Object[]{map.get(str), str});
    }
}
