package com.alipay.mobile.security.bio.constants;

import java.util.HashMap;
import java.util.Map;

public class ZcodeConstants {
    public static String NETWORK_TIMEOUT = "Z1011";
    public static String ZCODE_AUTH_BIO_ERROR = "Z1022";
    public static String ZCODE_ERROR_CAMERA_NO_DEVICE = "Z1002";
    public static String ZCODE_ERROR_CAMERA_OPEN_FAILED = "Z1020";
    public static String ZCODE_ERROR_CAMERA_STREAM_ERROR = "Z1021";
    public static String ZCODE_FIRST_LOGIN = "Z1015";
    public static String ZCODE_IFAA_ERROR = "Z1014";
    public static String ZCODE_INIT_TOYGER_ERROR = "Z1001";
    public static String ZCODE_INTERUPT_RESUME = "Z1009";
    public static String ZCODE_LIVENESS_ERROR = "Z1013";
    public static String ZCODE_MODEL_LOAD_ERROR = "Z1023";
    public static String ZCODE_NETWORK_ERROR = "Z1012";
    public static String ZCODE_NO_CAMERA_PERMISSION = "Z1019";
    public static String ZCODE_NO_FRANT_CAMERA = "Z1018";
    public static String ZCODE_OS_VERSION_LOW = "Z1004";
    public static String ZCODE_OUT_TIME = "Z1006";
    public static String ZCODE_OVER_TIME = "Z1005";
    public static String ZCODE_PROGURD_ERROR = "Z1010";
    public static String ZCODE_RETRY_ALERT = "Z1016";
    public static String ZCODE_SYSTEM_EXC = "Z1000";
    public static String ZCODE_UNSUPPORTED_CPU = "Z1003";
    public static String ZCODE_USER_BACK = "Z1008";
    public static String ZCODE_ZIM_IS_BUSY = "Z1024";
    private static Map map = new HashMap() {
        {
            put(ZcodeConstants.ZCODE_SYSTEM_EXC, "抱歉，系统出错了，请您稍后再试");
            put(ZcodeConstants.ZCODE_INIT_TOYGER_ERROR, "抱歉，系统出错了，请您稍后再试");
            put(ZcodeConstants.ZCODE_USER_BACK, "退出刷脸");
            put(ZcodeConstants.ZCODE_OVER_TIME, "刷脸超时");
            put(ZcodeConstants.ZCODE_ERROR_CAMERA_NO_DEVICE, "摄像头异常，请重新插拔摄像头并重启设备");
            put(ZcodeConstants.ZCODE_ERROR_CAMERA_OPEN_FAILED, "摄像头异常，请重启设备后再试");
            put(ZcodeConstants.ZCODE_ERROR_CAMERA_STREAM_ERROR, "摄像头异常，请重启设备后再试");
            put(ZcodeConstants.ZCODE_OUT_TIME, "尝试次数过多，请稍后再试");
            put(ZcodeConstants.ZCODE_INTERUPT_RESUME, "刷脸服务已中断");
            put(ZcodeConstants.ZCODE_UNSUPPORTED_CPU, "当前设备不支持刷脸");
            put(ZcodeConstants.ZCODE_OS_VERSION_LOW, "当前系统不支持刷脸");
            put(ZcodeConstants.ZCODE_PROGURD_ERROR, "系统异常");
            put(ZcodeConstants.NETWORK_TIMEOUT, "网络超时");
            put(ZcodeConstants.ZCODE_NETWORK_ERROR, "网络异常");
            put(ZcodeConstants.ZCODE_LIVENESS_ERROR, "抱歉，系统出错了，请再试一次");
            put(ZcodeConstants.ZCODE_IFAA_ERROR, "本地比对失败");
            put(ZcodeConstants.ZCODE_FIRST_LOGIN, "首登退出");
            put(ZcodeConstants.ZCODE_RETRY_ALERT, "退出刷脸");
            put(ZcodeConstants.ZCODE_NO_FRANT_CAMERA, "无前置摄像头");
            put(ZcodeConstants.ZCODE_NO_CAMERA_PERMISSION, "没有摄像头权限");
            put(ZcodeConstants.ZCODE_MODEL_LOAD_ERROR, "抱歉，系统出错了，请再试一次");
            put(ZcodeConstants.ZCODE_AUTH_BIO_ERROR, "抱歉，系统出错了，请再试一次");
            put(ZcodeConstants.ZCODE_ZIM_IS_BUSY, "抱歉，上次调用刷脸未处理完成");
        }
    };

    public static String getMessage(String str) {
        return String.format("%s(%s)", new Object[]{map.get(str), str});
    }
}
