package o;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

public final class click {
    public static void getMin(Activity activity, String str, boolean z) {
        if (z) {
            try {
                activity.startActivity(new Intent("android.intent.action.CALL", Uri.parse("tel:".concat(String.valueOf(str)))));
            } catch (SecurityException unused) {
            }
        }
    }
}
