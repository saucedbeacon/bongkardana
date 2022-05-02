package com.iap.ac.android.acs.plugin.utils;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.common.log.ACLog;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

public class SchemeUtil {
    private static final String BACKING_SCHEME = "acsback://";
    private static final String CONFIG_KEY_ACS_THIRDPARTY_URI_PREFIX = "ACS_THIRDPARTY_URI_PREFIX";

    public static boolean checkUriInWhiteList(@NonNull String str) {
        return isKeyStartWith(str, (JSONArray) ConfigCenter.INSTANCE.getKeyOrDefault(CONFIG_KEY_ACS_THIRDPARTY_URI_PREFIX, new JSONArray()));
    }

    private static boolean isKeyStartWith(@NonNull String str, @Nullable JSONArray jSONArray) {
        if (!(jSONArray == null || jSONArray.length() == 0)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                if (str.startsWith(jSONArray.optString(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkUriCanBeProcessed(Activity activity, String str) {
        return checkUriCanBeProcessed(activity, str, (String) null);
    }

    public static boolean checkUriCanBeProcessed(Activity activity, String str, String str2) {
        try {
            Intent intent = new Intent();
            if (TextUtils.isEmpty(str2)) {
                str2 = "android.intent.action.VIEW";
            }
            intent.setAction(str2);
            intent.setData(Uri.parse(str));
            List<ResolveInfo> queryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
            if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            ACLog.e(Constants.TAG, "checkUriCanBeProcessed Exception", e);
            return false;
        }
    }

    public static Uri buildSchemeWithBacking(String str, String str2) {
        Uri parse = Uri.parse(str);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
        boolean z = true;
        for (String next : queryParameterNames) {
            if (TextUtils.equals(next, str2)) {
                clearQuery.appendQueryParameter(next, BACKING_SCHEME);
                z = false;
            } else {
                clearQuery.appendQueryParameter(next, parse.getQueryParameter(next));
            }
        }
        if (z) {
            clearQuery.appendQueryParameter(str2, BACKING_SCHEME);
        }
        return clearQuery.build();
    }
}
