package com.iap.ac.android.acs.plugin.downgrade.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.acs.multilanguage.utils.FileUtils;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.common.log.ACLog;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class ApiDowngradeUtils {
    private static final String ACS_API_DOWNGRADE_ENABLED = "ac_api_downgrade_enabled";
    private static final String FORMATTED_REGEX = "${%s}";
    private static final String TAG = logTag(ApiDowngradeUtils.class.getSimpleName());
    private static final Pattern mPattern = Pattern.compile("(?<=\\$\\{)[^}]+");

    @NonNull
    public static String logTag(@NonNull String str) {
        return "IAPConnectPlugin-ApiDowngrade-".concat(String.valueOf(str));
    }

    public static String dirInAssets() {
        StringBuilder sb = new StringBuilder("acs_jsapi_downgrade");
        sb.append(File.separator);
        return sb.toString();
    }

    public static String processKeyword(@Nullable String str, @Nullable JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            ACLog.w(TAG, "patternKeyword(): the rawString is empty");
            return str;
        }
        HashMap hashMap = new HashMap();
        Matcher matcher = mPattern.matcher(str);
        while (matcher.find()) {
            String group = matcher.group();
            String str2 = "";
            if (!TextUtils.isEmpty(group) && jSONObject != null) {
                String[] split = group.split("\\.");
                int length = split.length - 1;
                for (int i = 0; i < length && jSONObject != null; i++) {
                    jSONObject = jSONObject.optJSONObject(split[i].trim());
                }
                if (jSONObject != null) {
                    str2 = jSONObject.optString(split[length].trim(), str2);
                }
            }
            hashMap.put(formatWithRegex(group), str2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            str = str.replace((CharSequence) entry.getKey(), (CharSequence) entry.getValue());
        }
        return str;
    }

    private static String formatWithRegex(@NonNull String str) {
        if (mPattern.matcher(str).matches()) {
            return str;
        }
        return String.format(FORMATTED_REGEX, new Object[]{str});
    }

    public static JSONObject readJSONFromAssets(@NonNull Context context, @NonNull String str) {
        try {
            return new JSONObject(FileUtils.readConfigFromAsset(context, str));
        } catch (Exception e) {
            ACLog.w(TAG, "readSceneSchemeFromLocal() failed for: ".concat(String.valueOf(e)));
            return null;
        }
    }

    public static void runOnMain(@NonNull Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public static Map<String, String> parseJSONParamsToMap(@Nullable JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
        }
        return hashMap;
    }

    public static boolean isApiDowngradeEnabled() {
        boolean booleanValue = ((Boolean) ConfigCenter.INSTANCE.getKeyOrDefault(ACS_API_DOWNGRADE_ENABLED, Boolean.TRUE)).booleanValue();
        ACLog.d(TAG, "isApiDowngradeEnabled(), enabled: ".concat(String.valueOf(booleanValue)));
        return booleanValue;
    }
}
