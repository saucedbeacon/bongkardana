package o;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import io.branch.referral.Branch;
import io.branch.referral.Defines;
import java.util.Locale;
import o.TinyMenuPopupWindow;
import org.json.JSONException;
import org.json.JSONObject;

public final class getMid {
    private static getMid getMin;
    public final TinyMenuPopupWindow.FavoriteAndRecentAppAdapter length = new getMin();
    public final Context setMax;

    public static getMid setMin(Context context) {
        if (getMin == null) {
            getMin = new getMid(context);
        }
        return getMin;
    }

    public static getMid getMin() {
        return getMin;
    }

    private getMid(Context context) {
        this.setMax = context;
    }

    public static void length(startTinyAppAndCloseCurrent starttinyappandclosecurrent, JSONObject jSONObject) {
        if (starttinyappandclosecurrent != null) {
            try {
                jSONObject.put(Defines.Jsonkey.LATDAttributionWindow.getKey(), startTinyAppAndCloseCurrent.length("bnc_latd_attributon_window", 0));
            } catch (JSONException unused) {
            }
        }
    }

    public final boolean setMax() {
        return TinyMenuPopupWindow.FavoriteAndRecentAppAdapter.setMax(this.setMax);
    }

    public static boolean setMin() {
        return Branch.setMax() || getMenuName.getMax();
    }

    private static String setMax(Context context) {
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                return WebSettings.getDefaultUserAgent(context);
            } catch (Exception unused) {
            }
        }
        return "";
    }

    class getMin extends TinyMenuPopupWindow.FavoriteAndRecentAppAdapter {
        public getMin() {
        }
    }

    public static boolean setMin(String str) {
        return TextUtils.isEmpty(str) || str.equals("bnc_no_value");
    }

    public final void setMax(Context context, startTinyAppAndCloseCurrent starttinyappandclosecurrent, JSONObject jSONObject) {
        try {
            TinyMenuPopupWindow.FavoriteAndRecentAppAdapter.getMin getmin = new TinyMenuPopupWindow.FavoriteAndRecentAppAdapter.getMin(this.setMax, setMin());
            if (setMin(getmin.setMax) || !getmin.getMax()) {
                jSONObject.put(Defines.Jsonkey.UnidentifiedDevice.getKey(), true);
            } else {
                jSONObject.put(Defines.Jsonkey.AndroidID.getKey(), getmin.setMax);
            }
            String str = Build.MANUFACTURER;
            if (!setMin(str)) {
                jSONObject.put(Defines.Jsonkey.Brand.getKey(), str);
            }
            String str2 = Build.MODEL;
            if (!setMin(str2)) {
                jSONObject.put(Defines.Jsonkey.Model.getKey(), str2);
            }
            DisplayMetrics floatRange = TinyMenuPopupWindow.FavoriteAndRecentAppAdapter.toFloatRange(this.setMax);
            jSONObject.put(Defines.Jsonkey.ScreenDpi.getKey(), floatRange.densityDpi);
            jSONObject.put(Defines.Jsonkey.ScreenHeight.getKey(), floatRange.heightPixels);
            jSONObject.put(Defines.Jsonkey.ScreenWidth.getKey(), floatRange.widthPixels);
            if (!setMin("Android")) {
                jSONObject.put(Defines.Jsonkey.OS.getKey(), "Android");
            }
            jSONObject.put(Defines.Jsonkey.OSVersion.getKey(), Build.VERSION.SDK_INT);
            String str3 = "";
            String country = Locale.getDefault() != null ? Locale.getDefault().getCountry() : str3;
            if (!TextUtils.isEmpty(country)) {
                jSONObject.put(Defines.Jsonkey.Country.getKey(), country);
            }
            if (Locale.getDefault() != null) {
                str3 = Locale.getDefault().getLanguage();
            }
            if (!TextUtils.isEmpty(str3)) {
                jSONObject.put(Defines.Jsonkey.Language.getKey(), str3);
            }
            String min = TinyMenuPopupWindow.FavoriteAndRecentAppAdapter.setMin();
            if (!TextUtils.isEmpty(min)) {
                jSONObject.put(Defines.Jsonkey.LocalIP.getKey(), min);
            }
            if (starttinyappandclosecurrent != null) {
                if (!setMin(startTinyAppAndCloseCurrent.setMin("bnc_device_fingerprint_id"))) {
                    jSONObject.put(Defines.Jsonkey.DeviceFingerprintID.getKey(), startTinyAppAndCloseCurrent.setMin("bnc_device_fingerprint_id"));
                }
                String min2 = startTinyAppAndCloseCurrent.setMin("bnc_identity");
                if (!setMin(min2)) {
                    jSONObject.put(Defines.Jsonkey.DeveloperIdentity.getKey(), min2);
                }
            }
            if (starttinyappandclosecurrent != null && starttinyappandclosecurrent.toFloatRange()) {
                String intRange = startTinyAppAndCloseCurrent.length(this.setMax).toIntRange(Defines.ModuleNameKeys.imei.getKey());
                if (TextUtils.isEmpty(intRange)) {
                    intRange = null;
                }
                if (!setMin(intRange)) {
                    jSONObject.put(Defines.ModuleNameKeys.imei.getKey(), intRange);
                }
            }
            jSONObject.put(Defines.Jsonkey.AppVersion.getKey(), TinyMenuPopupWindow.FavoriteAndRecentAppAdapter.setMin(this.setMax));
            jSONObject.put(Defines.Jsonkey.SDK.getKey(), "android");
            jSONObject.put(Defines.Jsonkey.SdkVersion.getKey(), "4.1.0");
            jSONObject.put(Defines.Jsonkey.UserAgent.getKey(), setMax(context));
        } catch (JSONException unused) {
        }
    }
}
