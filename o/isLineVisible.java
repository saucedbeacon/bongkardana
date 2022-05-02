package o;

import android.app.Activity;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;

public final class isLineVisible {
    public static int length(Activity activity, float f) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return (int) Math.ceil((double) (f * displayMetrics.density));
    }

    public static dispatchApplyWindowInsetsToBehaviors getMax() {
        return (dispatchApplyWindowInsetsToBehaviors) ((dispatchApplyWindowInsetsToBehaviors) new dispatchApplyWindowInsetsToBehaviors().isInside()).length((updatePostLayout<Bitmap>[]) new updatePostLayout[]{new setDpMargin()});
    }
}
