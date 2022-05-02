package com.ap.zoloz.hummer.api;

import java.util.Map;

public class EkycResponse {
    public static final int EKYC_FAIL = 2006;
    public static final int EKYC_INTERRUPT = 1003;
    public static final int EKYC_PENDING = 3000;
    public static final int EKYC_SUCCESS = 1000;
    public static final String SYSTEM_ERROR = "Z7000";
    public static final String SYSTEM_ERROR_MSG = "System Error";
    public static final String USER_QUIT = "Z7002";
    public static final String USER_QUIT_MSG = "User wants to quit";
    public static final String ZOLOZ_EKYC_FAIL = "Z7004";
    public static final String ZOLOZ_EKYC_FAIL_MSG = "Zoloz eKYC fail";
    public static final String ZOLOZ_EKYC_PENDING = "Z7005";
    public static final String ZOLOZ_EKYC_PENDING_MSG = "Zoloz eKYC is pending";
    public static final String ZOLOZ_EKYC_SUCCESS = "Z7003";
    public static final String ZOLOZ_EKYC_SUCCESS_MSG = "Zoloz eKYC success";
    public int code;
    public String eKYCId;
    public Map<String, String> extInfo;
    public String result;
    public String subCode;
}
