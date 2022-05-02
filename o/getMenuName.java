package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class getMenuName {
    private static boolean length = false;
    private static Boolean setMax = null;
    private static boolean setMin = false;

    public static boolean setMin(Context context) {
        if (!length && setMax == null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("io.branch.sdk.TestMode")) {
                    Resources resources = context.getResources();
                    length = Boolean.parseBoolean(resources.getString(resources.getIdentifier("io.branch.sdk.TestMode", "string", context.getPackageName())));
                } else {
                    length = applicationInfo.metaData.getBoolean("io.branch.sdk.TestMode", false);
                }
            } catch (Exception unused) {
            }
            setMax = Boolean.valueOf(length);
        }
        return length;
    }

    public static String getMin(Context context) {
        String str = length() ? "io.branch.sdk.BranchKey.test" : "io.branch.sdk.BranchKey";
        String str2 = null;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData != null && (str2 = applicationInfo.metaData.getString(str)) == null && length()) {
                Bundle bundle = applicationInfo.metaData;
                str2 = "key_live_maIkM32pF0ULJer3wXep0aihxukdG5Sq";
            }
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        try {
            Resources resources = context.getResources();
            return resources.getString(resources.getIdentifier(str, "string", context.getPackageName()));
        } catch (Exception unused2) {
            return str2;
        }
    }

    public static boolean length() {
        return length;
    }

    public static void setMax(boolean z) {
        length = z;
    }

    public static boolean getMax() {
        return setMin || length();
    }

    static JSONObject getMax(JSONObject jSONObject) {
        return getMin(jSONObject);
    }

    private static JSONObject getMin(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("source", "android");
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
