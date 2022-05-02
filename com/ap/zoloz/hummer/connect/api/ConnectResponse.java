package com.ap.zoloz.hummer.connect.api;

import java.util.HashMap;
import java.util.Map;

public class ConnectResponse {
    public static final int CONNECT_FAIL = 2006;
    public static final int CONNECT_INTERRUPT = 1003;
    public static final int CONNECT_QUERY_USABLE_FAIL = 2007;
    public static final int CONNECT_SUCCESS = 1000;
    public static final String NETWORK_BAD = "Z9001";
    public static final String NETWORK_FAIL_MSG = "Not connected to internet";
    public static final String SYSTEM_ERROR = "Z9000";
    public static final String SYSTEM_ERROR_MSG = "System Error";
    public static final String USER_QUIT = "Z9002";
    public static final String USER_QUIT_MSG = "User wants to quit";
    public static final String ZOLOZ_CONNECT_FAIL = "Z9004";
    public static final String ZOLOZ_CONNECT_FAIL_MSG = "Zoloz CONNECT fail";
    public static final String ZOLOZ_CONNECT_NOT_USABLE = "Z9005";
    public static final String ZOLOZ_CONNECT_NOT_USABLE_MSG = "Zoloz usable fail";
    public static final String ZOLOZ_CONNECT_SUCCESS = "Z9003";
    public static final String ZOLOZ_CONNECT_SUCCESS_MSG = "Zoloz CONNECT success";
    public int code;
    public Map<String, String> extInfo = new HashMap();
    public String result;
    public String subCode;

    public String toString() {
        StringBuilder sb = new StringBuilder("ConnectResponse{code = ");
        sb.append(this.code);
        sb.append("subCode = ");
        sb.append(this.subCode);
        sb.append(", result = ");
        sb.append(this.result);
        sb.append(", extInfo = ");
        sb.append(this.extInfo.toString());
        sb.append('}');
        return sb.toString();
    }
}
