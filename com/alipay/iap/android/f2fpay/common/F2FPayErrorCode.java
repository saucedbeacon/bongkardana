package com.alipay.iap.android.f2fpay.common;

import com.iap.ac.android.acs.plugin.utils.MonitorUtil;

public class F2FPayErrorCode {
    public static final String BIZ_ERROR = createErrorCode(DOMAIN, MonitorUtil.ERROR_CODE_EMPTY, "2");
    public static final String DOMAIN = "F2FPay";
    public static final String ILLEGAL_ACCESS = createErrorCode(DOMAIN, "05", "2");
    public static final String OTHER_ERROR = createErrorCode(DOMAIN, "0", "0");
    public static final String OTP_INFO_ERROR = createErrorCode(DOMAIN, "11", "2");

    public static String createErrorCode(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("_");
        sb.append(str3);
        return sb.toString();
    }
}
