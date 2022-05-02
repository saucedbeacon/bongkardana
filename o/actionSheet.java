package o;

import android.text.TextUtils;

public final class actionSheet {
    public static boolean length(Object... objArr) {
        for (String str : objArr) {
            if (str == null || ((str instanceof String) && TextUtils.isEmpty(str))) {
                return false;
            }
        }
        return true;
    }
}
