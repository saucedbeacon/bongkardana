package com.iap.ac.android.acs.plugin.downgrade.utils;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.multilanguage.MultiLanguageKit;
import com.iap.ac.android.acs.multilanguage.callback.OnFetchCallback;
import com.iap.ac.android.acs.multilanguage.utils.LanguageFormatter;
import com.iap.ac.android.acs.multilanguage.utils.LanguagePackageUtil;
import com.iap.ac.android.acs.plugin.downgrade.constant.ApiDowngradeConstant;
import com.iap.ac.android.common.log.ACLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class MultiLanguageFetcherUtil {
    private static final String DOWNGRADE_LANG_PKG_ID = "ac_jsapi_downgrade";
    private static final String LANG_PACKAGE_BIZ_TYPE = "acs_apidowngrade";
    private static final String TAG = ApiDowngradeUtils.logTag("MultiLanguageFetcherUtil");

    public static void fetchI18NContent(@NonNull Context context, @NonNull final Map<String, String> map, @NonNull final OnFetchCallback onFetchCallback) {
        MultiLanguageKit.getInstance(LANG_PACKAGE_BIZ_TYPE).fetchLanguagePackage(context, DOWNGRADE_LANG_PKG_ID, new OnFetchCallback() {
            public final void onFetchOnError(@NonNull String str, @NonNull String str2) {
                MultiLanguageFetcherUtil.processContentInLanguage(map, LanguagePackageUtil.getCurrentLanguage(), new HashMap(), onFetchCallback);
            }

            public final void onFetchSuccess(@NonNull String str, @NonNull Map<String, String> map) {
                MultiLanguageFetcherUtil.processContentInLanguage(map, str, map, onFetchCallback);
            }
        });
    }

    /* access modifiers changed from: private */
    public static void processContentInLanguage(@NonNull Map<String, String> map, @NonNull String str, @NonNull Map<String, String> map2, @NonNull OnFetchCallback onFetchCallback) {
        try {
            for (Map.Entry next : map.entrySet()) {
                JSONObject takeI18NFullContent = takeI18NFullContent((String) next.getValue());
                if (takeI18NFullContent != null) {
                    map2.put(next.getKey(), findI18NContentInLanguage(takeI18NFullContent, str));
                }
            }
            onFetchCallback.onFetchSuccess(str, map2);
        } catch (Exception e) {
            onFetchCallback.onFetchOnError("40002", ApiDowngradeConstant.Error.ERR_DOWNGRADE_FAILED);
            ACLog.e(TAG, "processContentInLanguage() error: ".concat(String.valueOf(e)));
        }
    }

    private static String findI18NContentInLanguage(JSONObject jSONObject, String str) {
        if (TextUtils.isEmpty(str)) {
            ACLog.e(TAG, "findI18NContentInLanguage() the languageCode is null");
            return "";
        }
        ACLog.d(TAG, "start findI18NContentInLanguage() the languageCode is ".concat(String.valueOf(str)));
        String optString = jSONObject.optString(str);
        if (TextUtils.isEmpty(optString)) {
            str = LanguagePackageUtil.splitPrefix(LanguagePackageUtil.convertConnectSymbol(str));
            optString = jSONObject.optString(str);
        }
        if (TextUtils.isEmpty(optString)) {
            optString = jSONObject.optString(LanguageFormatter.formatWithPattern(str));
        }
        return TextUtils.isEmpty(optString) ? jSONObject.optString("default") : optString;
    }

    private static JSONObject takeI18NFullContent(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static boolean isMultiLanguageInMedusa(String str) {
        return takeI18NFullContent(str) == null;
    }
}
