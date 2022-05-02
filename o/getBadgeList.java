package o;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.wireless.security.open.SecException;
import com.iap.ac.config.lite.ConfigCenter;
import com.j256.ormlite.stmt.query.SimpleComparison;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.net.URL;
import java.util.Locale;
import java.util.Map;

public final class getBadgeList {
    public static final int DEFAULT_LEGACY_CONFIG_VERSION = 0;
    private static final String KEY_CLIENT_KEY = "clientKey";
    private static final String KEY_USER_ID = "userId";
    private static final String LEGACY_CONFIG_VERSION = "legacyConfigVersion";
    private static final String STR = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final String TAG = "CommonUtil";

    public static String getStringNoNull(String str) {
        return str == null ? "" : str;
    }

    private getBadgeList() {
    }

    public static String getLanguage() {
        return Locale.getDefault().toString().endsWith("ID") ? "id_ID" : "en_US";
    }

    public static String getClientKey(BackKeyDownPoint backKeyDownPoint, String str) {
        try {
            String string = backKeyDownPoint.getString("clientKey");
            if (string != null) {
                string = string.trim();
            }
            return string;
        } catch (SecException e) {
            updateActionSheetContent.e(DanaLogConstants.TAG.COMMON_TAG, "[GetClientKey]: Exception \t defaultValue".concat(String.valueOf(str)), e);
            return str;
        }
    }

    public static String getUserId(BackKeyDownPoint backKeyDownPoint, String str) {
        try {
            String string = backKeyDownPoint.getString("userId");
            if (string != null) {
                string = string.trim();
            }
            return string;
        } catch (SecException e) {
            updateActionSheetContent.w("CommonUtil", e.getMessage());
            return str;
        }
    }

    public static void setClientKey(BackKeyDownPoint backKeyDownPoint, String str) {
        if (str != null) {
            try {
                if (!str.trim().isEmpty()) {
                    backKeyDownPoint.putString("clientKey", str);
                    return;
                }
            } catch (SecException e) {
                updateActionSheetContent.e(DanaLogConstants.TAG.COMMON_TAG, "[SetClientKey]:SecException ", e);
                return;
            }
        }
        backKeyDownPoint.removeString("clientKey");
    }

    public static void setUserId(BackKeyDownPoint backKeyDownPoint, String str) {
        if (str != null) {
            try {
                if (!str.trim().isEmpty()) {
                    backKeyDownPoint.putString("userId", str);
                    return;
                }
            } catch (SecException e) {
                updateActionSheetContent.w("CommonUtil", e.getMessage());
                return;
            }
        }
        backKeyDownPoint.removeString("userId");
    }

    public static String getNonce(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(STR.charAt(setEntryInfo.randomInt(62)));
        }
        return sb.toString();
    }

    @Nullable
    public static String getEncodedParam(String str) {
        try {
            Uri parse = Uri.parse(str);
            String stringNoNull = getStringNoNull(parse.getPath());
            String stringNoNull2 = getStringNoNull(parse.getQuery());
            if (TextUtils.isEmpty(stringNoNull)) {
                return stringNoNull2;
            }
            if (TextUtils.isEmpty(stringNoNull2)) {
                return stringNoNull;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(stringNoNull);
            sb.append("?");
            sb.append(stringNoNull2);
            return sb.toString();
        } catch (Exception e) {
            updateActionSheetContent.e(DanaLogConstants.TAG.COMMON_TAG, "EncodingParam ", e);
            return null;
        }
    }

    public static int getLegacyConfigVersion() {
        return ConfigCenter.getInstance().getIntConfig(LEGACY_CONFIG_VERSION, 0);
    }

    public static boolean isDomainMatch(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        String domain = getDomain(str2);
        if (domain == null || TextUtils.isEmpty(domain)) {
            return false;
        }
        if (domain.equals(str)) {
            return true;
        }
        return domain.endsWith(".".concat(String.valueOf(str)));
    }

    @Nullable
    public static String getDomain(String str) {
        try {
            return new URL(str).getHost();
        } catch (Exception unused) {
            return null;
        }
    }

    public static long getNowDateInEpoch() {
        return System.currentTimeMillis() / 1000;
    }

    public static String joinUrl(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str) || map == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        boolean z = !str.contains("?");
        for (Map.Entry next : map.entrySet()) {
            if (z) {
                z = false;
                sb.append("?");
            } else {
                sb.append("&");
            }
            sb.append((String) next.getKey());
            sb.append(SimpleComparison.EQUAL_TO_OPERATION);
            sb.append((String) next.getValue());
        }
        return sb.toString();
    }
}
