package com.iap.ac.android.acs.multilanguage.core.model;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class LanguageUpdateModel {
    public String appName;
    public String fileName;
    public String url;
    public String version;

    public static LanguageUpdateModel convertToModel(JSONObject jSONObject) throws JSONException {
        LanguageUpdateModel languageUpdateModel = new LanguageUpdateModel();
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("version");
                if (!TextUtils.isEmpty(optString)) {
                    String optString2 = optJSONObject.optString("url");
                    if (!TextUtils.isEmpty(optString2)) {
                        languageUpdateModel.version = optString;
                        languageUpdateModel.url = optString2;
                        languageUpdateModel.appName = optJSONObject.optString("appName");
                        languageUpdateModel.fileName = optJSONObject.optString("fileName");
                        return languageUpdateModel;
                    }
                    throw new JSONException("the response url in data is null");
                }
                throw new JSONException("the response version in data is null");
            }
            throw new JSONException("the response data is null");
        }
        throw new JSONException("the response json is null");
    }
}
