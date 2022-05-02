package com.alipay.iap.android.common.errorcode;

public class IAPAECodeEncoding {
    public static final String IAP_COMMON_BIZ_ERROR = createErrorCode("050");
    private static final String IAP_ERROR_IDENTITY = "AE";
    private static final String IAP_ERROR_VERSION = "1";
    public static final String IAP_GATEWAY_OVERFLOW_ERROR = createErrorCode("020");
    public static final String IAP_ILLEGAL_ARGUMENT = createErrorCode("004");
    private static final String IAP_MOBILE_IDENTITY = "02221000";
    public static final String IAP_NETWORK_ERROR = createErrorCode("000");
    public static final String IAP_NETWORK_UNAVAILABLE_ERROR = createErrorCode("001");
    public static final String IAP_REQUEST_TIMEOUT = createErrorCode("002");
    public static final String IAP_RPC_DATA_PARSE_FAILED_ERROR = createErrorCode("003");

    public static String createErrorCode(String str) {
        return createErrorCode(str, (IAPErrorLevel) null, (IAPErrorType) null);
    }

    public static String createErrorCode(String str, IAPErrorLevel iAPErrorLevel) {
        return createErrorCode(str, iAPErrorLevel, (IAPErrorType) null);
    }

    public static String createErrorCode(String str, IAPErrorType iAPErrorType) {
        return createErrorCode(str, (IAPErrorLevel) null, iAPErrorType);
    }

    public static String createErrorCode(String str, IAPErrorLevel iAPErrorLevel, IAPErrorType iAPErrorType) {
        if (str == null) {
            return null;
        }
        if (iAPErrorLevel == null) {
            iAPErrorLevel = IAPErrorLevel.error;
        }
        if (iAPErrorType == null) {
            iAPErrorType = IAPErrorType.system;
        }
        StringBuilder sb = new StringBuilder("AE1");
        sb.append(iAPErrorLevel.getValue());
        sb.append(iAPErrorType.getValue());
        sb.append(IAP_MOBILE_IDENTITY);
        sb.append(str);
        return sb.toString();
    }
}
