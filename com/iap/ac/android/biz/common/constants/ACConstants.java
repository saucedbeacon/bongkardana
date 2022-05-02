package com.iap.ac.android.biz.common.constants;

public class ACConstants {
    public static final String PARAMETER_KEY_AC_DECODE_CONFIG = "acDecodeConfig";
    public static final String PARAMETER_KEY_AC_MERCHANT_TYPE = "merchantType";
    public static final String PARAMETER_KEY_SCENE = "scene";
    public static final String PARAMETER_KEY_SOURCE_APP_PACKAGE_NAME = "sourceApp";

    public static class MerchantType {
        public static final String IS_APP = "APP";
        public static final String IS_H5 = "H5";
    }

    public static class Scene {
        public static final String SOURCE_FROM_OTHER_APP = "from_other_app";
        public static final String SOURCE_FROM_SCAN = "from_scan";
        public static final String SOURCE_FROM_WEBVIEW = "from_webview";
    }
}
