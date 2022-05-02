package com.iap.ac.android.acs.plugin.downgrade.amcs;

import org.json.JSONObject;

public class NavigateSceneConfigManager extends BaseDowngradeConfigManager {
    private static final String SECTION_ACS_NAVIGATE_SCENE = "acs_navigate_scene";
    private static final String SECTION_KEY_BEFORE_ACTION = "before_actions";
    private static final String SECTION_KEY_FAILURE_ACTION = "failure_actions";
    private static final String SECTION_KEY_SCENE_SCHEME_MAP = "scene_scheme_map";
    private static NavigateSceneConfigManager sInstance;

    /* access modifiers changed from: protected */
    public String getSectionName() {
        return SECTION_ACS_NAVIGATE_SCENE;
    }

    public static NavigateSceneConfigManager getInstance() {
        if (sInstance == null) {
            synchronized (StartAppConfigManager.class) {
                if (sInstance == null) {
                    sInstance = new NavigateSceneConfigManager();
                }
            }
        }
        return sInstance;
    }

    private NavigateSceneConfigManager() {
    }

    public JSONObject getBeforeAction() {
        return (JSONObject) getKeyOrDefault(SECTION_KEY_BEFORE_ACTION, null);
    }

    public JSONObject getSceneSchemeMap() {
        return (JSONObject) getKeyOrDefault(SECTION_KEY_SCENE_SCHEME_MAP, null);
    }

    public JSONObject getFailureAction() {
        return (JSONObject) getKeyOrDefault(SECTION_KEY_FAILURE_ACTION, null);
    }
}
