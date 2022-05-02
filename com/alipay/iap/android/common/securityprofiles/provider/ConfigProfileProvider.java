package com.alipay.iap.android.common.securityprofiles.provider;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.log.LoggerWrapper;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigProfileProvider implements ProfileProvider {
    private static final String TAG = "ConfigProfileProvider";
    private JSONObject mProfile;

    public ConfigProfileProvider(@NonNull String str) {
        try {
            this.mProfile = new JSONObject(str);
        } catch (JSONException e) {
            LoggerWrapper.e(TAG, "Cannot parse profile from json!", e);
        }
    }

    @Nullable
    public String getProfileData(@NonNull Context context, @NonNull String str) {
        JSONObject jSONObject = this.mProfile;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optString(str);
    }
}
