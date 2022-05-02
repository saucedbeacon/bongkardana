package com.iap.ac.android.acs.plugin.downgrade.amcs;

import androidx.annotation.Nullable;
import org.json.JSONObject;

public class NotFoundJSAPIConfigManager extends BaseDowngradeConfigManager {
    private static final String SECTION_KEY_ACS_JSAPI_ACTION_MAP = "jsapi_downgrade_map";
    private static final String SECTION_NAME_ACS_NOT_FOUND_JSAPI = "acs_not_found_jsapi_downgrade_config";
    private static NotFoundJSAPIConfigManager sInstance;

    /* access modifiers changed from: protected */
    public String getSectionName() {
        return SECTION_NAME_ACS_NOT_FOUND_JSAPI;
    }

    public static NotFoundJSAPIConfigManager getInstance() {
        if (sInstance == null) {
            synchronized (NotFoundJSAPIConfigManager.class) {
                if (sInstance == null) {
                    sInstance = new NotFoundJSAPIConfigManager();
                }
            }
        }
        return sInstance;
    }

    private NotFoundJSAPIConfigManager() {
    }

    @Nullable
    public JSONObject getNotFoundJSAPIConfig() {
        return (JSONObject) getKeyOrDefault(SECTION_KEY_ACS_JSAPI_ACTION_MAP, null);
    }
}
