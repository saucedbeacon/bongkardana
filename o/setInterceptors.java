package o;

import android.text.TextUtils;
import com.j256.ormlite.stmt.query.SimpleComparison;

public final class setInterceptors {
    private setInterceptors() {
    }

    public static String getDynamicUrl(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        String concat = str.charAt(0) != '/' ? "/".concat(String.valueOf(str)) : str;
        if (TextUtils.isEmpty(str2)) {
            return concat;
        }
        if (containsQueryString(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(concat);
            sb.append(str2.replace("?", "&"));
            return sb.toString();
        } else if (str.endsWith("?")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(concat);
            sb2.append(str2.replace("?", ""));
            return sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(concat);
            sb3.append(str2);
            return sb3.toString();
        }
    }

    public static boolean isDeepLink(String str) {
        return !TextUtils.isEmpty(str) && str.trim().contains("https://link.dana.id/");
    }

    private static boolean containsQueryString(String str) {
        return str.contains("?") && str.contains(SimpleComparison.EQUAL_TO_OPERATION);
    }
}
