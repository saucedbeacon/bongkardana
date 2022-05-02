package com.alipay.plus.android.config.sdk.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSONObject;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.plus.android.config.sdk.ConfigMerger;
import com.alipay.plus.android.config.sdk.listener.ConfigChangeType;
import com.alipay.plus.android.config.sdk.listener.commonconfig.ICommonConfigListener;
import com.alipay.plus.android.config.sdk.listener.sectionconfig.ChangedDetails;
import java.util.List;
import java.util.Set;

public class b extends c<ICommonConfigListener> {
    private static final String b = e.a("CommonConfigListener");

    private void a(@NonNull ConfigChangeType configChangeType, @NonNull Set<String> set, @Nullable JSONObject jSONObject) {
        if (!set.isEmpty()) {
            for (String next : set) {
                List<ICommonConfigListener> list = (List) this.f9511a.get(next);
                if (list != null) {
                    Object obj = jSONObject != null ? jSONObject.get(next) : null;
                    for (ICommonConfigListener onCommonConfigChanged : list) {
                        onCommonConfigChanged.onCommonConfigChanged(next, obj, configChangeType);
                    }
                }
            }
        }
    }

    public synchronized void a(@NonNull String str, @Nullable JSONObject jSONObject, @NonNull ChangedDetails changedDetails) {
        if (!ConfigMerger.isCommonConfigSection(str)) {
            LoggerWrapper.e(b, "*** section is not Common-Config!!! section = ".concat(String.valueOf(str)));
            return;
        }
        a(ConfigChangeType.Added, changedDetails.addedKeys, jSONObject);
        a(ConfigChangeType.Modified, changedDetails.modifiedKeys, jSONObject);
        a(ConfigChangeType.Deleted, changedDetails.deletedKeys, jSONObject);
    }
}
