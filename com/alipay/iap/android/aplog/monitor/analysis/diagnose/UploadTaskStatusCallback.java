package com.alipay.iap.android.aplog.monitor.analysis.diagnose;

public interface UploadTaskStatusCallback {
    public static final String NETWORK_ANY = "any";
    public static final String NETWORK_MOBILE = "mobile";
    public static final String TYPE_APPLOG = "applog";

    public enum Code {
        NONE,
        ZIPPING_ERROR,
        TRAFIC_LIMIT,
        NO_SPACE,
        NO_TARGET_FILE,
        NET_NOT_MATCH,
        NO_SDCARD,
        PARAM_INVALID,
        NETWORK_ERROR,
        UNKNOWN_ERROR,
        RESULT_SUCCESS,
        RESULT_FAILURE,
        TASK_BY_PUSH,
        TASK_BY_CONFIG,
        TASK_BY_POSITIVE,
        TASK_BY_MANUAL,
        FILE_UPLOADING,
        FILE_UPLOADING_RETRY,
        FILE_ZIPPING
    }

    public enum UploadStatus {
        CLIENT_SUBMIT_RECEIVED,
        CLIENT_SUBMIT_UPLOAD_SUCCESS,
        CLIENT_SUBMIT_UPLOAD_FAIL
    }

    void onFail(Code code, String str);

    void onSuccess(String str);
}
