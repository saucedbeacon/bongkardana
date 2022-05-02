package com.iap.ac.android.biz.common.model;

public @interface ResultCode {
    public static final String INVALID_NETWORK = "INVALID_NETWORK";
    public static final String INVALID_NETWORK_MESSAGE = "Oops! System busy. Try again later!";
    public static final String PARAM_ILLEGAL = "PARAM_ILLEGAL";
    public static final String PARAM_ILLEGAL_MESSAGE = "Oops! System busy. Try again later!";
    public static final String PROCESSING = "PROCESSING";
    public static final String PROCESSING_MESSAGE = "processing.";
    public static final String SDK_NOT_SUPPORT = "SDK_NOT_SUPPORT";
    public static final String SDK_NOT_SUPPORT_MESSAGE = "Your app version is low, please upgrade to the latest version";
    public static final String SUCCESS = "SUCCESS";
    public static final String SUCCESS_MESSAGE = "success.";
    public static final String UNKNOWN_EXCEPTION = "UNKNOWN_EXCEPTION";
    public static final String UNKNOWN_EXCEPTION_MESSAGE = "Oops! System busy. Try again later!";
    public static final String USER_CANCEL = "USER_CANCEL";
    public static final String USER_CANCEL_MESSAGE = "The user has cancelled this business.";
}
