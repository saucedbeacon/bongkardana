package com.iap.ac.android.acs.plugin.downgrade.amcs;

import androidx.annotation.Nullable;
import org.json.JSONObject;

public class ImplementedJSAPIConfigManager extends BaseDowngradeConfigManager {
    private static final String SECTION_KEY_ACS_JSAPI_ACTION_MAP = "jsapi_intercept_map";
    private static final String SECTION_NAME_ACS_IMPLEMENTED_JSAPI = "acs_implemented_jsapi_intercept_config";
    private static ImplementedJSAPIConfigManager sInstance;

    /* access modifiers changed from: protected */
    public String getSectionName() {
        return SECTION_NAME_ACS_IMPLEMENTED_JSAPI;
    }

    public static ImplementedJSAPIConfigManager getInstance() {
        if (sInstance == null) {
            synchronized (ImplementedJSAPIConfigManager.class) {
                if (sInstance == null) {
                    sInstance = new ImplementedJSAPIConfigManager();
                }
            }
        }
        return sInstance;
    }

    private ImplementedJSAPIConfigManager() {
    }

    @Nullable
    public JSONObject getImplementedJSAPIConfig() {
        return (JSONObject) getKeyOrDefault(SECTION_KEY_ACS_JSAPI_ACTION_MAP, null);
    }
}
