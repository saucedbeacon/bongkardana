package com.alipay.iap.android.wallet.acl.base;

import java.util.Map;

public interface Result {
    public static final String ERROR_CODE = "ERROR_CODE";
    public static final String ERROR_CODE_APP_SERVICE_ERROR = "1002";
    public static final String ERROR_CODE_SYSTEM_ERROR = "1005";
    public static final String ERROR_CODE_TIMEOUT = "1003";
    public static final String ERROR_CODE_UNKNOWN_ERROR = "1000";
    public static final String ERROR_CODE_USER_CANCEL = "1001";

    Map<String, String> getExtendedInfo();

    ResultError getResultError();

    boolean isHasError();

    void setExtendedInfo(Map<String, String> map);

    void setHasError(boolean z);

    void setHasError(boolean z, String str);

    void setResultError(ResultError resultError);
}
