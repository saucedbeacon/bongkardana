package com.alipay.iap.android.f2fpay.common;

public class F2FPayConstants {
    public static final String TAG = "IAPF2FPAY";

    public static class OrderStatus {
        public static final String DECODE_FAILED = "decode_failed";
        public static final String FAILED = "failed";
        public static final String PENDING = "pending";
        public static final String SUCCESS = "success";
    }

    public static class StorageKeyList {
        public static final String KEY_OTP_SEED_EXPIRED_TIME = "OTP_SEED_EXPIRED_TIME";
    }

    public static class SyncBiz {
        public static final String F2FPAY_SYNC_GLOBAL = "F2FPAY_GLOBAL_SYNC_NOTIFY";
        public static final String F2FPAY_SYNC_USER = "F2FPAY_USER_SYNC_NOTIFY";
        public static final String SYNC_MODEL_FC_INIT = "INIT";
        public static final String SYNC_MODEL_KEY_FUNCTION_CODE = "functionCode";
    }
}
