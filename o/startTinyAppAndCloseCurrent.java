package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class startTinyAppAndCloseCurrent {
    public static String getMax = null;
    private static boolean isInside = false;
    public static startTinyAppAndCloseCurrent setMin;
    public static JSONObject toFloatRange;
    private static String toIntRange;
    private final JSONObject IsOverlapping = new JSONObject();
    public final JSONObject equals = new JSONObject();
    public final JSONObject getMin = new JSONObject();
    SharedPreferences.Editor length;
    public SharedPreferences setMax;

    private startTinyAppAndCloseCurrent(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("branch_referral_shared_pref", 0);
        this.setMax = sharedPreferences;
        this.length = sharedPreferences.edit();
    }

    public static startTinyAppAndCloseCurrent length(Context context) {
        if (setMin == null) {
            setMin = new startTinyAppAndCloseCurrent(context);
        }
        return setMin;
    }

    public static String setMin() {
        if (URLUtil.isHttpsUrl(toIntRange)) {
            return toIntRange;
        }
        return Build.VERSION.SDK_INT >= 20 ? "https://api2.branch.io/" : "https://api.branch.io/";
    }

    public final boolean getMax(String str) {
        getMax = str;
        String string = setMin.setMax.getString("bnc_branch_key", "bnc_no_value");
        if (str != null && string != null && string.equals(str)) {
            return false;
        }
        String string2 = setMin.setMax.getString("bnc_link_click_id", "bnc_no_value");
        String string3 = setMin.setMax.getString("bnc_link_click_identifier", "bnc_no_value");
        String string4 = setMin.setMax.getString("bnc_app_link", "bnc_no_value");
        String string5 = setMin.setMax.getString("bnc_push_identifier", "bnc_no_value");
        this.length.clear();
        setMin.length.putString("bnc_link_click_id", string2);
        setMin.length.apply();
        setMin.length.putString("bnc_link_click_identifier", string3);
        setMin.length.apply();
        setMin.length.putString("bnc_app_link", string4);
        setMin.length.apply();
        setMin.length.putString("bnc_push_identifier", string5);
        setMin.length.apply();
        setMin.length.apply();
        setMin.length.putString("bnc_branch_key", str);
        setMin.length.apply();
        return true;
    }

    public static boolean getMax() {
        return isInside("bnc_triggered_by_fb_app_link");
    }

    public static void setMax() {
        setMin.length.putBoolean("bnc_is_full_app_conversion", Boolean.FALSE.booleanValue());
        setMin.length.apply();
    }

    public static boolean getMin() {
        return isInside("bnc_is_full_app_conversion");
    }

    public static boolean length() {
        return isInside("bnc_limit_facebook_tracking");
    }

    static void length(ArrayList<String> arrayList) {
        if (arrayList.size() == 0) {
            setMin.length.putString("bnc_buckets", "bnc_no_value");
            setMin.length.apply();
            return;
        }
        setMin.length.putString("bnc_buckets", getMax(arrayList));
        setMin.length.apply();
    }

    public static void getMax(String str, int i) {
        ArrayList<String> intRange = toIntRange();
        if (!intRange.contains(str)) {
            intRange.add(str);
            length(intRange);
        }
        setMin.length.putInt("bnc_credit_base_".concat(String.valueOf(str)), i);
        setMin.length.apply();
    }

    public static int getMin(String str) {
        return setMin.setMax.getInt("bnc_credit_base_".concat(String.valueOf(str)), 0);
    }

    static void getMin(ArrayList<String> arrayList) {
        if (arrayList.size() == 0) {
            setMin.length.putString("bnc_actions", "bnc_no_value");
            setMin.length.apply();
            return;
        }
        setMin.length.putString("bnc_actions", getMax(arrayList));
        setMin.length.apply();
    }

    private static String getMax(ArrayList<String> arrayList) {
        Iterator<String> it = arrayList.iterator();
        String str = "";
        while (it.hasNext()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(it.next());
            sb.append(",");
            str = sb.toString();
        }
        return str.substring(0, str.length() - 1);
    }

    public static int length(String str, int i) {
        return setMin.setMax.getInt(str, i);
    }

    public static long setMax(String str) {
        return setMin.setMax.getLong(str, 0);
    }

    public static String setMin(String str) {
        return setMin.setMax.getString(str, "bnc_no_value");
    }

    public static boolean isInside(String str) {
        return setMin.setMax.getBoolean(str, false);
    }

    public static void getMin(String str, int i) {
        setMin.length.putInt(str, i);
        setMin.length.apply();
    }

    public static void getMin(String str, long j) {
        setMin.length.putLong(str, j);
        setMin.length.apply();
    }

    public static void length(String str, String str2) {
        setMin.length.putString(str, str2);
        setMin.length.apply();
    }

    public static void getMax(String str, Boolean bool) {
        setMin.length.putBoolean(str, bool.booleanValue());
        setMin.length.apply();
    }

    public static JSONObject equals() {
        JSONObject jSONObject = toFloatRange;
        if (jSONObject != null) {
            return jSONObject;
        }
        String string = setMin.setMax.getString("bnc_branch_analytical_data", "bnc_no_value");
        JSONObject jSONObject2 = new JSONObject();
        if (!TextUtils.isEmpty(string) && !string.equals("bnc_no_value")) {
            try {
                return new JSONObject(string);
            } catch (JSONException unused) {
            }
        }
        return jSONObject2;
    }

    public final void getMax(@NonNull String str, @NonNull String str2) {
        if (str != null) {
            if (this.getMin.has(str) && str2 == null) {
                this.getMin.remove(str);
            }
            try {
                this.getMin.put(str, str2);
            } catch (JSONException unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final String equals(String str) {
        if (str == null) {
            return null;
        }
        try {
            return this.equals.get(str).toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String toIntRange(String str) {
        if (str == null) {
            return null;
        }
        try {
            return this.IsOverlapping.get(str).toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean toFloatRange() {
        try {
            return this.IsOverlapping.length() != 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void toFloatRange(String str) {
        if (getMenuName.getMax() || isInside) {
            TextUtils.isEmpty(str);
        }
    }

    public static void IsOverlapping(String str) {
        TextUtils.isEmpty(str);
    }

    public static void FastBitmap$CoordinateSystem(String str) {
        TextUtils.isEmpty(str);
    }

    public static void setMin(boolean z) {
        isInside = z;
    }

    public static void length(String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-1683677000, oncanceled);
            onCancelLoad.getMin(-1683677000, oncanceled);
        }
        setMin.length.putString("bnc_app_version", str);
        setMin.length.apply();
    }

    public static void setMax(Boolean bool) {
        setMin.length.putBoolean("bnc_triggered_by_fb_app_link", bool.booleanValue());
        setMin.length.apply();
    }

    static ArrayList<String> toIntRange() {
        String string = setMin.setMax.getString("bnc_buckets", "bnc_no_value");
        if (string.equals("bnc_no_value")) {
            return new ArrayList<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, string.split(","));
        return arrayList;
    }

    static ArrayList<String> IsOverlapping() {
        String string = setMin.setMax.getString("bnc_actions", "bnc_no_value");
        if (string.equals("bnc_no_value")) {
            return new ArrayList<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, string.split(","));
        return arrayList;
    }
}
