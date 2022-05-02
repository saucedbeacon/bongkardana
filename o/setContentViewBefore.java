package o;

import android.app.Activity;
import android.provider.Settings;
import android.view.WindowManager;

public final class setContentViewBefore {
    public static void setMin(Activity activity) {
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        float min = getMin(activity);
        float floatValue = setAnimationProgress.getMin.floatValue();
        if (min < floatValue) {
            attributes.screenBrightness = floatValue;
            activity.getWindow().setAttributes(attributes);
        }
    }

    private static float getMin(Activity activity) {
        try {
            return ((float) Settings.System.getInt(activity.getContentResolver(), "screen_brightness")) / 255.0f;
        } catch (Settings.SettingNotFoundException unused) {
            return 0.0f;
        }
    }
}
