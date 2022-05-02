package o;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.iap.android.common.product.delegate.UserInfoManager;
import o.convertFocusDirectionToLayoutDirection;
import o.setInitialPrefetchItemCount;
import org.json.JSONObject;

public final class setExtras {
    private static final String UPDATE_COUNT = "Update Count";

    private setExtras() {
    }

    public static void track(Context context, String str, JSONObject jSONObject) {
        convertFocusDirectionToLayoutDirection instance = getInstance(context);
        if (instance != null) {
            instance.setMin(str, jSONObject);
            if (!instance.getMax()) {
                instance.getMax.length(new setInitialPrefetchItemCount.getMin(instance.getMin));
            }
        }
    }

    public static void registerSuperProperties(Context context, JSONObject jSONObject) {
        convertFocusDirectionToLayoutDirection instance = getInstance(context);
        if (instance != null && !instance.getMax()) {
            instance.equals.setMin(jSONObject);
        }
    }

    public static void optOutTracking(Context context) {
        convertFocusDirectionToLayoutDirection instance = getInstance(context);
        if (instance != null && !instance.getMax()) {
            instance.length();
        }
    }

    public static void optInTracking(Context context) {
        convertFocusDirectionToLayoutDirection instance = getInstance(context);
        if (instance != null && instance.getMax()) {
            instance.getMax(UserInfoManager.instance().getUserId());
        }
    }

    public static void reset(Context context) {
        convertFocusDirectionToLayoutDirection instance = getInstance(context);
        if (instance != null) {
            JSONObject jSONObject = new JSONObject();
            instance.equals.getMax(jSONObject);
            if (!instance.getMax()) {
                instance.getMax.length(new setInitialPrefetchItemCount.getMin(instance.getMin));
            }
            instance.setMin();
            instance.setMax(jSONObject);
        }
    }

    public static void identify(Context context, String str, boolean z) {
        convertFocusDirectionToLayoutDirection instance = getInstance(context);
        if (instance != null && !TextUtils.isEmpty(str)) {
            instance.setMin(str);
            if (z) {
                instance.setMax.setMax(str);
            }
            if (!instance.getMax()) {
                instance.getMax.length(new setInitialPrefetchItemCount.getMin(instance.getMin));
            }
        }
    }

    public static void setPeople(Context context, JSONObject jSONObject) {
        convertFocusDirectionToLayoutDirection instance = getInstance(context);
        convertFocusDirectionToLayoutDirection.getMax getmax = instance.setMax;
        if (getmax != null) {
            getmax.setMax(jSONObject);
            getmax.getMax(UPDATE_COUNT, 1.0d);
            if (!instance.getMax()) {
                instance.getMax.length(new setInitialPrefetchItemCount.getMin(instance.getMin));
            }
        }
    }

    public static void alias(Context context, String str, boolean z) {
        convertFocusDirectionToLayoutDirection instance = getInstance(context);
        if (instance != null && !TextUtils.isEmpty(str)) {
            instance.getMin(str, (String) null);
            if (z) {
                instance.setMax.setMax(instance.equals.setMax());
            }
            if (!instance.getMax()) {
                instance.getMax.length(new setInitialPrefetchItemCount.getMin(instance.getMin));
            }
        }
    }

    public static String getDistinctId(Context context) {
        convertFocusDirectionToLayoutDirection instance = getInstance(context);
        if (instance != null) {
            return instance.equals.setMax();
        }
        return null;
    }

    private static convertFocusDirectionToLayoutDirection getInstance(Context context) {
        return convertFocusDirectionToLayoutDirection.getMin(context, "ded2d68965bbd813d33d686ee165bae7");
    }

    public static void startTimer(Context context, String str) {
        convertFocusDirectionToLayoutDirection instance = getInstance(context);
        if (instance != null) {
            instance.length(str);
        }
    }

    public static void setPeopleOnce(Context context, JSONObject jSONObject) {
        convertFocusDirectionToLayoutDirection instance = getInstance(context);
        convertFocusDirectionToLayoutDirection.getMax getmax = instance.setMax;
        if (getmax != null) {
            getmax.getMax(jSONObject);
            if (!instance.getMax()) {
                instance.getMax.length(new setInitialPrefetchItemCount.getMin(instance.getMin));
            }
        }
    }
}
