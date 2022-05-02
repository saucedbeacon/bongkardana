package com.alipay.mobile.security.bio.utils;

import android.app.Activity;
import android.content.Context;
import android.provider.Settings;
import android.view.Window;
import android.view.WindowManager;

public class ScreenUtil {
    public static int getScreenBrightness(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        } catch (Exception unused) {
            return 255;
        }
    }

    public static void setScreenMode(Context context, int i) {
        try {
            Settings.System.putInt(context.getContentResolver(), "screen_brightness_mode", i);
        } catch (Exception unused) {
        }
    }

    public static void saveScreenBrightness(Context context, int i) {
        try {
            Settings.System.putInt(context.getContentResolver(), "screen_brightness", i);
        } catch (Exception unused) {
        }
    }

    public static void setScreenBrightness(Activity activity, int i) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = ((float) i) / 255.0f;
            window.setAttributes(attributes);
        }
    }
}
