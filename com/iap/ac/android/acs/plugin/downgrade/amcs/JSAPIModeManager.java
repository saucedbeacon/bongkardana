package com.iap.ac.android.acs.plugin.downgrade.amcs;

import androidx.annotation.NonNull;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.common.log.ACLog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

public class JSAPIModeManager extends BaseDowngradeConfigManager {
    private static JSAPIModeManager sInstance;

    /* access modifiers changed from: protected */
    public String getSectionName() {
        return Constants.SECTION_KEY_JSAPI_MODE;
    }

    public static JSAPIModeManager getInstance() {
        if (sInstance == null) {
            synchronized (JSAPIModeManager.class) {
                if (sInstance == null) {
                    sInstance = new JSAPIModeManager();
                }
            }
        }
        return sInstance;
    }

    private JSAPIModeManager() {
    }

    @NonNull
    public List<String> getWhiteList() {
        return getListOrDefault(Constants.SECTION_KEY_WHITE_LIST);
    }

    @NonNull
    public List<String> getBlackList() {
        return getListOrDefault(Constants.SECTION_KEY_BLACK_LIST);
    }

    @NonNull
    private List<String> getListOrDefault(@NonNull String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = (JSONArray) getKeyOrDefault(str, null);
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("JSAPIModeManager#getListOrDefault, parse ");
            sb.append(str);
            sb.append(" error: ");
            sb.append(th);
            ACLog.e(Constants.TAG, sb.toString());
            arrayList.clear();
        }
        return arrayList;
    }
}
