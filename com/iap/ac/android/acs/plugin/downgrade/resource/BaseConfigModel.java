package com.iap.ac.android.acs.plugin.downgrade.resource;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.iap.ac.android.acs.plugin.utils.ConfigUtils;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.common.log.ACLog;
import java.lang.reflect.ParameterizedType;
import org.json.JSONObject;

public abstract class BaseConfigModel<T> {
    public T mode;

    /* access modifiers changed from: protected */
    public abstract String getSectionName();

    public BaseConfigModel(Context context, @Nullable String str) {
        String readConfigFromAsset = Utils.readConfigFromAsset(context, getPresetConfigFileName(str));
        if (!TextUtils.isEmpty(readConfigFromAsset)) {
            try {
                JSONObject jSONObject = new JSONObject(readConfigFromAsset);
                if (jSONObject.has(getSectionName())) {
                    this.mode = ConfigUtils.fromJson(jSONObject.getJSONObject(getSectionName()).toString(), getGenericClass());
                }
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("BaseConfigModel error, parse mode null with json: ");
                sb.append(readConfigFromAsset);
                sb.append(",e:");
                sb.append(th);
                ACLog.d(Constants.TAG, sb.toString());
            }
        } else {
            ACLog.d(Constants.TAG, "BaseConfigModel error, parse mode null with json: ".concat(String.valueOf(readConfigFromAsset)));
        }
    }

    private String getPresetConfigFileName(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return "iapconnect_config.json";
        }
        StringBuilder sb = new StringBuilder("iapconnect_config_");
        sb.append(str.toLowerCase());
        sb.append(".json");
        return sb.toString();
    }

    private Class<T> getGenericClass() {
        ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
        if (parameterizedType == null || parameterizedType.getActualTypeArguments().length <= 0) {
            return null;
        }
        return (Class) parameterizedType.getActualTypeArguments()[0];
    }

    public boolean isValid() {
        return this.mode != null;
    }
}
