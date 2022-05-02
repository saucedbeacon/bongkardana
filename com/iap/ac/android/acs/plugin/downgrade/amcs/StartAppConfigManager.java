package com.iap.ac.android.acs.plugin.downgrade.amcs;

import androidx.annotation.Nullable;
import org.json.JSONObject;

public class StartAppConfigManager extends BaseDowngradeConfigManager {
    private static final String SECTION_KEY_ACS_APP_MAP = "app_map";
    private static final String SECTION_NAME_ACS_START_APP = "acs_start_app";
    private static StartAppConfigManager sInstance;

    /* access modifiers changed from: protected */
    public String getSectionName() {
        return SECTION_NAME_ACS_START_APP;
    }

    public static StartAppConfigManager getInstance() {
        if (sInstance == null) {
            synchronized (StartAppConfigManager.class) {
                if (sInstance == null) {
                    sInstance = new StartAppConfigManager();
                }
            }
        }
        return sInstance;
    }

    private StartAppConfigManager() {
    }

    @Nullable
    public JSONObject getStartAppMap() {
        return (JSONObject) getKeyOrDefault(SECTION_KEY_ACS_APP_MAP, null);
    }
}
