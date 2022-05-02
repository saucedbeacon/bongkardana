package com.iap.ac.config.lite.c;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.config.lite.ConfigMerger;
import com.iap.ac.config.lite.listener.ConfigChangeType;
import com.iap.ac.config.lite.listener.commonconfig.ICommonConfigListener;
import com.iap.ac.config.lite.listener.sectionconfig.ChangedDetails;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

public class b extends c<ICommonConfigListener> {
    private static final String b = e.b("CommonConfigListener");

    public synchronized void a(@NonNull String str, @Nullable JSONObject jSONObject, @NonNull ChangedDetails changedDetails) {
        if (!ConfigMerger.isCommonConfigSection(str)) {
            ACLog.e(b, "*** section is not Common-Config!!! section = ".concat(String.valueOf(str)));
            return;
        }
        a(ConfigChangeType.ADDED, changedDetails.addedKeys, jSONObject);
        a(ConfigChangeType.MODIFIED, changedDetails.modifiedKeys, jSONObject);
        a(ConfigChangeType.DELETED, changedDetails.deletedKeys, jSONObject);
    }

    private void a(@NonNull ConfigChangeType configChangeType, @NonNull Set<String> set, @Nullable JSONObject jSONObject) {
        if (!set.isEmpty()) {
            for (String next : set) {
                List<ICommonConfigListener> list = this.f9797a.get(next);
                if (list != null) {
                    Object opt = jSONObject != null ? jSONObject.opt(next) : null;
                    for (ICommonConfigListener onCommonConfigChanged : list) {
                        onCommonConfigChanged.onCommonConfigChanged(next, opt, configChangeType);
                    }
                }
            }
        }
    }
}
