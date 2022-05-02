package com.iap.ac.android.acs.plugin.ui.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.common.log.ACLog;
import java.util.Locale;
import java.util.regex.Pattern;

public class UIUtils {
    private UIUtils() {
    }

    public static int getScreenWidth(@NonNull Context context) {
        return getMetrics(context).widthPixels;
    }

    public static int getScreenHeight(@NonNull Context context) {
        return getMetrics(context).heightPixels;
    }

    public static int dp2px(@NonNull Context context, int i) {
        double d = (double) (((float) i) * getMetrics(context).density);
        Double.isNaN(d);
        return (int) (d + 0.5d);
    }

    public static int px2dp(@NonNull Context context, int i) {
        double d = (double) (((float) i) / getMetrics(context).density);
        Double.isNaN(d);
        return (int) (d + 0.5d);
    }

    public static boolean isActivityDisabled(@Nullable Activity activity) {
        if (activity == null) {
            ACLog.e(Constants.TAG, "UIUtils#isActivityDisabled, activity is null");
            return true;
        } else if (activity.isFinishing()) {
            ACLog.e(Constants.TAG, "UIUtils#isActivityDisabled, activity is finishing");
            return true;
        } else if (Build.VERSION.SDK_INT < 17 || !activity.isDestroyed()) {
            return false;
        } else {
            ACLog.e(Constants.TAG, "UIUtils#isActivityDisabled, activity is destroyed");
            return true;
        }
    }

    public static void showSoftInput(@NonNull final Context context, @NonNull final View view) {
        view.postDelayed(new Runnable() {
            public final void run() {
                InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
                if (inputMethodManager != null) {
                    try {
                        inputMethodManager.showSoftInput(view, 0);
                    } catch (Throwable th) {
                        ACLog.e(Constants.TAG, "show soft input error", th);
                    }
                }
            }
        }, 300);
    }

    public static void hideSoftInput(@NonNull Context context, @NonNull View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null) {
            try {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 2);
            } catch (Throwable th) {
                ACLog.e(Constants.TAG, "hide soft input error", th);
            }
        }
    }

    public static boolean isNumeric(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    public static String encryptPhoneNumber(@Nullable String str) {
        return (TextUtils.isEmpty(str) || str.length() <= 7) ? str : str.replaceAll("(?<=\\d{3})\\d(?=\\d{4})", "*");
    }

    public static String getLocale(@NonNull Context context) {
        Resources resources = context.getResources();
        if (resources == null) {
            ACLog.e(Constants.TAG, "UIUtils#getLocale, resources is null");
            return "";
        }
        Configuration configuration = resources.getConfiguration();
        if (configuration == null) {
            ACLog.e(Constants.TAG, "UIUtils#getLocale, configuration is null");
            return "";
        }
        Locale locale = null;
        if (Build.VERSION.SDK_INT < 24) {
            locale = configuration.locale;
        } else if (!configuration.getLocales().isEmpty()) {
            locale = configuration.getLocales().get(0);
        }
        if (locale == null) {
            ACLog.e(Constants.TAG, "UIUtils#getLocale, locale is null");
            return "";
        }
        ACLog.d(Constants.TAG, "UIUtils#getLocale, locale: ".concat(String.valueOf(locale)));
        return locale.toString();
    }

    private static DisplayMetrics getMetrics(@NonNull Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (!(windowManager == null || windowManager.getDefaultDisplay() == null)) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics;
    }
}
