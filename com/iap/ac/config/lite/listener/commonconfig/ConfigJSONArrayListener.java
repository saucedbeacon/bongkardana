package com.iap.ac.config.lite.listener.commonconfig;

import org.json.JSONArray;

public abstract class ConfigJSONArrayListener extends AbstractTypedConfigListener<JSONArray> {
    public ConfigJSONArrayListener() {
        super(JSONArray.class);
    }
}
