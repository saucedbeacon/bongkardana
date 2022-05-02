package com.iap.ac.android.mpm.base.model.hook;

public class HookConstants {

    public class HookAction {
        public static final String HOOK_ACTIOIN_PREPARE_MERCHANT_AUTH = "PREPARE_MERCHANT_AUTH";
        public static final String HOOK_ACTION_DECODE = "DECODE";
        public static final String HOOK_ACTION_OPEN = "OPEN";
        public static final String HOOK_ACTION_PAY = "PAY";

        public HookAction() {
        }
    }

    public class HookCategory {
        public static final String HOOK_CATEGORY_TRADEPAY = "TRADE_PAY";
        public static final String HOOK_CATEGORY_URL = "URL";

        public HookCategory() {
        }
    }
}
