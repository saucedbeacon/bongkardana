package com.iap.ac.android.acs.plugin.downgrade.amcs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeUtils;
import com.iap.ac.android.common.config.ACConfig;
import com.iap.ac.android.common.log.ACLog;
import org.json.JSONObject;

public abstract class BaseDowngradeConfigManager {
    private final String TAG = ApiDowngradeUtils.logTag(getClass().getSimpleName());

    /* access modifiers changed from: protected */
    public abstract String getSectionName();

    private JSONObject fetchJsonSection() {
        return ACConfig.getInstance("ac_biz").getSectionConfig(getSectionName());
    }

    /* access modifiers changed from: protected */
    public <T> T getKeyOrDefault(@NonNull String str, @Nullable T t) {
        JSONObject fetchJsonSection = fetchJsonSection();
        if (fetchJsonSection == null) {
            return t;
        }
        try {
            T t2 = fetchJsonSection.get(str);
            String str2 = this.TAG;
            StringBuilder sb = new StringBuilder("get value from config center, key: ");
            sb.append(str);
            sb.append(", value: ");
            sb.append(t2);
            ACLog.d(str2, sb.toString());
            return t2;
        } catch (Exception e) {
            ACLog.e(this.TAG, "getKeyOrDefault exception: ".concat(String.valueOf(e)));
            String str3 = this.TAG;
            StringBuilder sb2 = new StringBuilder("get value from config center fail, key: ");
            sb2.append(str);
            sb2.append(", use default value: ");
            sb2.append(t);
            ACLog.w(str3, sb2.toString());
            return t;
        }
    }
}
