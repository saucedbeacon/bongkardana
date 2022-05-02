package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.annotation.NonNull;

public final class setActionOn {
    public static boolean getMax(Activity activity) {
        for (ResolveInfo resolveInfo : activity.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=")), 65536)) {
            if (resolveInfo.activityInfo.applicationInfo.packageName.equalsIgnoreCase("com.android.vending")) {
                return true;
            }
        }
        return false;
    }

    public static boolean getMin(Context context, Intent intent) {
        return !context.getPackageManager().queryIntentActivities(intent, 65536).isEmpty();
    }

    public static int length(@NonNull Context context) {
        Display display;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            return windowManager.getCurrentWindowMetrics().getWindowInsets().getInsets(WindowInsets.Type.navigationBars()).bottom;
        }
        try {
            display = context.getDisplay();
        } catch (NoSuchMethodError unused) {
            display = windowManager.getDefaultDisplay();
        }
        Point point = new Point();
        Point point2 = new Point();
        if (display != null) {
            display.getSize(point);
            display.getRealSize(point2);
        }
        if (point.x < point2.x) {
            return point2.x - point.x;
        }
        if (point.y < point2.y) {
            return point2.y - point.y;
        }
        return 0;
    }
}
