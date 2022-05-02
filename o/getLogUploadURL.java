package o;

import android.animation.ValueAnimator;
import id.dana.showcase.view.ShowcaseView;

public final class getLogUploadURL implements ValueAnimator.AnimatorUpdateListener {
    private final ShowcaseView length;

    public getLogUploadURL(ShowcaseView showcaseView) {
        this.length = showcaseView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.length.invalidate();
    }
}
