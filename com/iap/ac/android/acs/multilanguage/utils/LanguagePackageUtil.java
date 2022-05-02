package com.iap.ac.android.acs.multilanguage.utils;

import android.text.TextUtils;
import android.util.LruCache;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import com.alibaba.griver.h5.permission.GriverJSAPIPermission;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.iap.ac.android.common.log.ACLog;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class LanguagePackageUtil {
    private static final String TAG = LanguagePackageUtil.class.getSimpleName();

    public static LruCache<String, Map<String, String>> resizeCache(LruCache<String, Map<String, String>> lruCache, int i) {
        if (lruCache.maxSize() == i || i <= 0) {
            return lruCache;
        }
        Map<String, Map<String, String>> snapshot = lruCache.snapshot();
        LruCache<String, Map<String, String>> lruCache2 = new LruCache<>(i);
        for (Map.Entry next : snapshot.entrySet()) {
            lruCache2.put(next.getKey(), next.getValue());
        }
        return lruCache2;
    }

    public static String formatLanguagePackageUrl(@NonNull String str) {
        return !URLUtil.isNetworkUrl(str) ? GriverJSAPIPermission.PROTOCOL_HTTPS.concat(String.valueOf(str)) : str;
    }

    public static Map<String, String> convertToMap(@NonNull String str, @NonNull String str2) throws Exception {
        ACLog.d(logTag(TAG), "take languageCode :".concat(String.valueOf(str2)));
        HashMap hashMap = new HashMap();
        JSONObject takeInLanguageCode = takeInLanguageCode(new JSONObject(str), str2);
        if (takeInLanguageCode == null) {
            StringBuilder sb = new StringBuilder("convertToMap skipped, for get empty value with the languageCode \"");
            sb.append(str2);
            sb.append("\" in cacheInLocal: ");
            sb.append(str);
            String obj = sb.toString();
            MultiLanguageLogger.newLogger(MultiLanguageLogger.BL_AC_LANG_FETCH_FROM_LOCAL).addParams("errorMessage", obj).event();
            ACLog.w(logTag(TAG), obj);
            return hashMap;
        }
        Iterator<String> keys = takeInLanguageCode.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, takeInLanguageCode.optString(next));
        }
        return hashMap;
    }

    protected static JSONObject takeInLanguageCode(@NonNull JSONObject jSONObject, @NonNull String str) throws Exception {
        Iterator<String> keys = jSONObject.keys();
        String convertConnectSymbol = convertConnectSymbol(str);
        String formatWithPattern = LanguageFormatter.formatWithPattern(convertConnectSymbol);
        JSONObject jSONObject2 = null;
        JSONObject jSONObject3 = null;
        while (keys.hasNext()) {
            String next = keys.next();
            String convertConnectSymbol2 = convertConnectSymbol(next);
            if (convertConnectSymbol.equalsIgnoreCase(convertConnectSymbol2)) {
                jSONObject2 = jSONObject.getJSONObject(next);
            }
            if (formatWithPattern != null && !formatWithPattern.equalsIgnoreCase(convertConnectSymbol) && formatWithPattern.equalsIgnoreCase(convertConnectSymbol2)) {
                jSONObject3 = jSONObject.getJSONObject(next);
            }
        }
        if (jSONObject2 == null) {
            return jSONObject3;
        }
        if (jSONObject3 == null) {
            return jSONObject2;
        }
        JSONObject jSONObject4 = new JSONObject(jSONObject3.toString());
        Iterator<String> keys2 = jSONObject2.keys();
        while (keys2.hasNext()) {
            String next2 = keys2.next();
            jSONObject4.put(next2, jSONObject2.getString(next2));
        }
        return jSONObject4;
    }

    @NonNull
    public static String convertConnectSymbol(@NonNull String str) {
        return str.replace("_", "-");
    }

    public static boolean needsCheckUpdate(String str, int i) {
        long j;
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException unused) {
            j = 0;
        }
        return System.currentTimeMillis() - j > TimeUnit.HOURS.toMillis((long) i);
    }

    @NonNull
    public static JSONObject requestFromServer(String str) throws Exception {
        return new JSONObject(convertStreamToString(FirebasePerfUrlConnection.openStream(new URL(str))));
    }

    public static String convertStreamToString(InputStream inputStream) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append("\n");
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    @NonNull
    public static String splitPrefix(@NonNull String str) {
        String[] split = str.split("-");
        return split.length > 1 ? split[0] : str;
    }

    @NonNull
    public static String getCurrentLanguage() {
        String language = Locale.getDefault().getLanguage();
        String country = Locale.getDefault().getCountry();
        if (TextUtils.isEmpty(country)) {
            return language;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(language);
        sb.append("-");
        sb.append(country);
        return sb.toString();
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    public static String mapToJsonString(@NonNull Map<?, ?> map) {
        return new JSONObject(map).toString();
    }

    public static String logTag(@NonNull String str) {
        return "LanguagePackage_".concat(String.valueOf(str));
    }

    public static String logPrefix(String str) {
        StringBuilder sb = new StringBuilder("[language-package-id = ");
        sb.append(str);
        sb.append("] ");
        return sb.toString();
    }
}
