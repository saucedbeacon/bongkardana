package com.alibaba.griver.base.common.proxy;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.griver.base.common.account.GriverAccount;
import com.alibaba.griver.base.common.logger.GriverLogger;
import java.util.Map;

public class GriverFileAbilityImpl implements RVFileAbilityProxy {
    public boolean hasFolderPermission(String str) {
        return true;
    }

    public boolean saveIdWithPath(String str, String str2) {
        try {
            StringBuilder sb = new StringBuilder("save id with path, id: ");
            sb.append(str);
            sb.append(", path: ");
            sb.append(str2);
            GriverLogger.d("GriverFileAbilityImpl", sb.toString());
            SharedPreferences a2 = a(((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext());
            if (a2 == null) {
                return false;
            }
            a2.edit().putString(str, str2).commit();
            return true;
        } catch (Exception e) {
            GriverLogger.e("GriverFileAbilityImpl", "savePathAndLocalId exception:", e);
            return false;
        }
    }

    public String queryPathByLocalId(String str) {
        try {
            GriverLogger.d("GriverFileAbilityImpl", "query path by id: ".concat(String.valueOf(str)));
            SharedPreferences a2 = a(((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext());
            if (a2 != null) {
                return a2.getString(str, "");
            }
        } catch (Exception e) {
            GriverLogger.e("GriverFileAbilityImpl", "queryPathByLocalId exception:", e);
        }
        return "";
    }

    public String queryLocalIdByPath(String str) {
        try {
            Map<String, ?> all = a(((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext()).getAll();
            if (all == null) {
                return "";
            }
            for (String next : all.keySet()) {
                if (((String) all.get(next)).equals(str)) {
                    return next;
                }
            }
            return "";
        } catch (Exception e) {
            GriverLogger.e("GriverFileAbilityImpl", "queryLocalIdByPath exception:", e);
            return "";
        }
    }

    public String getUserId() {
        return GriverAccount.getUserId();
    }

    @Nullable
    private SharedPreferences a(Context context) {
        if (context != null) {
            return context.getSharedPreferences("griver_local_storage_GriverFileAbilityImpl", 0);
        }
        return null;
    }
}
