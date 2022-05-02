package o;

import android.content.Context;
import android.provider.Settings;

public final class setWrapMode {
    public static String setMin(Context context) {
        try {
            return setHorizontalStyle.setMin(context);
        } catch (Exception unused) {
            return "null";
        }
    }

    public static String getMax(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception unused) {
            return "null";
        }
    }
}
