package o;

import android.app.Activity;
import android.util.DisplayMetrics;

public final class setRefreshing {
    public static int setMax(Activity activity, float f) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return (int) Math.ceil((double) (f * displayMetrics.density));
    }
}
