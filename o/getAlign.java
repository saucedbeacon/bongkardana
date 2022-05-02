package o;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.net.URL;

public final class getAlign {
    private static final String TAG = "CookieUtil";

    static String getBaseUrlPrefix() {
        return "https://m.dana.id";
    }

    private getAlign() {
    }

    public static void setCookie(String str, String str2) {
        CookieManager instance = CookieManager.getInstance();
        instance.setCookie(str, str2);
        if (Build.VERSION.SDK_INT >= 21) {
            instance.flush();
        } else {
            CookieSyncManager.getInstance().sync();
        }
    }

    @Nullable
    public static useMultiplexLink getCookie() {
        return getCookie(getBaseUrlPrefix());
    }

    @Nullable
    private static useMultiplexLink getCookie(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new useMultiplexLink(CookieManager.getInstance().getCookie(str).toCharArray());
        } catch (Exception | UnsatisfiedLinkError e) {
            updateActionSheetContent.w(TAG, e.getMessage());
            return null;
        }
    }

    @NonNull
    public static useMultiplexLink getCtokenWithoutKey() {
        return new useMultiplexLink(replace(getCtokenFromCookie(), "ctoken=", "").toCharArray());
    }

    @NonNull
    private static String replace(useMultiplexLink usemultiplexlink, String str, String str2) {
        if (TextUtils.isEmpty(usemultiplexlink)) {
            return "";
        }
        if (usemultiplexlink.toString().contains(str)) {
            return usemultiplexlink.toString().replace(str, str2);
        }
        return usemultiplexlink.toString();
    }

    public static useMultiplexLink getCtokenFromCookie() {
        return getCookie(getBaseUrlPrefix(), "ctoken");
    }

    @NonNull
    private static useMultiplexLink getCookie(String str, String str2) {
        useMultiplexLink cookie = getCookie(str);
        if (cookie == null || TextUtils.isEmpty(cookie)) {
            return new useMultiplexLink("".toCharArray());
        }
        for (String str3 : cookie.toString().split(";")) {
            String[] split = str3.split(SimpleComparison.EQUAL_TO_OPERATION);
            if (split.length == 2 && split[0].trim().equalsIgnoreCase(str2)) {
                return new useMultiplexLink(str3.trim().toCharArray());
            }
        }
        return new useMultiplexLink("".toCharArray());
    }

    public static String getUrlWithCtoken(String str) {
        return replaceOrAddParameter(str, getCtokenFromCookie(str).toString());
    }

    public static String replaceOrAddParameter(String str, String str2) {
        StringBuilder sb = new StringBuilder("replaceOrAddParameter\t url:");
        sb.append(str);
        sb.append("\t ctokenValue: ");
        sb.append(str2);
        updateActionSheetContent.d(TAG, sb.toString());
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str.contains(str2)) {
            return str;
        }
        int indexOf = str.indexOf("ctoken=");
        if (indexOf != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str.substring(0, indexOf));
            sb2.append(str2);
            int indexOf2 = str.indexOf("&", indexOf);
            if (indexOf2 != -1) {
                sb2.append(str.substring(indexOf2));
            }
            return sb2.toString();
        } else if (str.contains("?")) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("&");
            sb3.append(str2);
            return sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append("?");
            sb4.append(str2);
            return sb4.toString();
        }
    }

    public static useMultiplexLink getCtokenFromCookie(String str) {
        useMultiplexLink cookie = getCookie(str, "ctoken");
        updateActionSheetContent.d(TAG, "getCtokenFromCookie :".concat(String.valueOf(cookie)));
        return cookie;
    }

    public static boolean isAliDomains(String str) {
        String domain = getDomain(str);
        String domain2 = getDomain(getBaseUrlPrefix());
        if (domain == null || TextUtils.isEmpty(domain) || domain2 == null || !domain.endsWith(domain2)) {
            return false;
        }
        return true;
    }

    @Nullable
    private static String getDomain(String str) {
        try {
            return new URL(str).getHost();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getUserId() {
        useMultiplexLink cookie;
        if (!hasUserIdInCookie() || (cookie = getCookie(getBaseUrlPrefix())) == null) {
            return "";
        }
        String str = "";
        for (String str2 : cookie.toString().split(";")) {
            if (!TextUtils.isEmpty(str2) && str2.contains("userId")) {
                str = str2.trim().replace("userId=", "");
            }
        }
        return str;
    }

    private static boolean hasUserIdInCookie() {
        useMultiplexLink cookie = getCookie(getBaseUrlPrefix());
        return cookie != null && !TextUtils.isEmpty(cookie) && cookie.toString().contains("userId");
    }

    public static void clearCookies(Context context) {
        if (isOsEqualOrAboveLolipop()) {
            clearCookiesForAboveLolipop();
        } else {
            clearCookiesBelowLolipop(context);
        }
    }

    private static boolean isOsEqualOrAboveLolipop() {
        return Build.VERSION.SDK_INT >= 22;
    }

    private static void clearCookiesBelowLolipop(Context context) {
        CookieSyncManager createInstance = CookieSyncManager.createInstance(context);
        createInstance.startSync();
        CookieManager instance = CookieManager.getInstance();
        instance.removeAllCookie();
        instance.removeSessionCookie();
        createInstance.stopSync();
        createInstance.sync();
    }

    @RequiresApi(api = 21)
    private static void clearCookiesForAboveLolipop() {
        CookieManager.getInstance().removeAllCookies((ValueCallback) null);
        CookieManager.getInstance().flush();
    }
}
