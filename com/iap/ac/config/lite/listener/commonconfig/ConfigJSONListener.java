package com.iap.ac.config.lite.listener.commonconfig;

import org.json.JSONObject;

public abstract class ConfigJSONListener extends AbstractTypedConfigListener<JSONObject> {
    public ConfigJSONListener() {
        super(JSONObject.class);
    }
}
