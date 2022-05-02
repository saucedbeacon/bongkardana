package o;

import android.animation.Animator;
import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewAnimationUtils;

public final class setHalfScreen {

    public interface length {
        void onRevealAnimationStart();

        void onUnRevealAnimationEnd();
    }

    @TargetApi(21)
    public static Animator getMin(View view, int i, boolean z) {
        float f;
        int left = view.getLeft();
        int bottom = view.getBottom();
        int width = view.getWidth();
        int height = view.getHeight();
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            double d = (double) width;
            Double.isNaN(d);
            Double.isNaN(d);
            double d2 = (double) (height * height);
            Double.isNaN(d2);
            f = (float) Math.sqrt((d * d) + d2);
        }
        if (z) {
            double d3 = (double) width;
            Double.isNaN(d3);
            Double.isNaN(d3);
            double d4 = (double) (height * height);
            Double.isNaN(d4);
            f2 = (float) Math.sqrt((d3 * d3) + d4);
        }
        Animator duration = ViewAnimationUtils.createCircularReveal(view, left, bottom, f, f2).setDuration((long) i);
        duration.setInterpolator(new setWrappedDrawable());
        return duration;
    }
}
