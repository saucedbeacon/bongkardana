package com.iap.ac.android.acs.plugin.downgrade.router.amcs;

import com.iap.ac.android.acs.plugin.downgrade.amcs.BaseDowngradeConfigManager;
import com.iap.ac.android.acs.plugin.downgrade.amcs.StartAppConfigManager;

public class APDisableJSAPIConfigManager extends BaseDowngradeConfigManager {
    public static final String AP_DISABLED_JSAPI_STATUS = "ap_disabled_jsapi_status";
    public static final String SECTION_AC_CONFIG = "ACConfig";
    private static APDisableJSAPIConfigManager sInstance;

    public String getSectionName() {
        return SECTION_AC_CONFIG;
    }

    public static APDisableJSAPIConfigManager getInstance() {
        if (sInstance == null) {
            synchronized (StartAppConfigManager.class) {
                if (sInstance == null) {
                    sInstance = new APDisableJSAPIConfigManager();
                }
            }
        }
        return sInstance;
    }

    private APDisableJSAPIConfigManager() {
    }

    public boolean toggleAPIDisableJSAPI() {
        return ((Boolean) getKeyOrDefault(AP_DISABLED_JSAPI_STATUS, Boolean.TRUE)).booleanValue();
    }
}
