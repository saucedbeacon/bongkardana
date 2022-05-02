package o;

import android.app.Activity;
import android.net.Uri;
import id.dana.utils.deeplink.DeepLinkConstant;

public final class updateFavoriteMenuItem {
    public static boolean getMax;
    public static String getMin;
    private static boolean length;
    private static boolean setMax;
    private static boolean setMin;

    private static boolean length(Activity activity) {
        return getMax(activity, DeepLinkConstant.DeepLinkPath.CASHOUT);
    }

    private static boolean setMin(Activity activity) {
        return getMax(activity, DeepLinkConstant.DeepLinkPath.LUCKY_MONEY);
    }

    private static boolean getMax(Activity activity) {
        return getMax(activity, DeepLinkConstant.DeepLinkPath.SPIN_THE_WHEEL);
    }

    private static boolean setMax(Activity activity) {
        if ((activity.getIntent().getFlags() & 1048576) == 1048576 || activity.getIntent() == null || !"android.nfc.action.TECH_DISCOVERED".equals(activity.getIntent().getAction())) {
            return false;
        }
        return true;
    }

    public static boolean getMin() {
        return getMax;
    }

    public static boolean setMax() {
        return setMax;
    }

    public static boolean setMin() {
        return setMin;
    }

    public static boolean getMax() {
        return length;
    }

    public static boolean length() {
        return setMax || setMin || length || getMax;
    }

    public static void getMin(Activity activity) {
        Uri uri;
        if (activity != null) {
            if (activity == null || (uri = activity.getIntent().getData()) == null) {
                uri = null;
            }
            if (uri != null) {
                getMin = uri.getQueryParameter(DeepLinkConstant.DeepLinkParams.ORDER_ID);
            }
            getMax = setMax(activity);
            setMax = length(activity);
            setMin = setMin(activity);
            length = getMax(activity);
        }
    }

    private static boolean getMax(Activity activity, String str) {
        Uri uri;
        String str2 = null;
        if (activity == null || (uri = activity.getIntent().getData()) == null) {
            uri = null;
        }
        if (uri != null) {
            str2 = uri.getPath();
        }
        return str2 != null && str2.equals(str);
    }
}
