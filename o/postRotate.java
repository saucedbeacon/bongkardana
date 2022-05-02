package o;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.content.res.Resources;
import android.view.animation.DecelerateInterpolator;
import id.dana.R;
import id.dana.showcase.view.PointerView;
import java.lang.ref.WeakReference;
import o.PhotoView;
import o.postRotate;

public abstract class postRotate<T extends postRotate> {
    public static final int getMax = ((int) (Resources.getSystem().getDisplayMetrics().density * 12.0f));
    private static final TimeInterpolator values = new DecelerateInterpolator(2.0f);
    protected TimeInterpolator IsOverlapping = values;
    protected int equals = R.color.f18542131099729;
    protected boolean getMin = true;
    protected PhotoView.FlingRunnable isInside;
    protected int length;
    protected WeakReference<Activity> setMax;
    protected int setMin;
    protected long toFloatRange = 300;
    protected float toIntRange = PointerView.DEFAULT_CONTAINER_PADDING;

    /* access modifiers changed from: protected */
    public abstract T getMax();

    /* access modifiers changed from: protected */
    public abstract onLongPress getMin();

    postRotate(Activity activity) {
        int i = getMax;
        this.length = i;
        this.setMin = i;
        this.setMax = new WeakReference<>(activity);
    }

    public T setMin(float f) {
        this.toIntRange = f;
        return getMax();
    }

    public T length(boolean z) {
        this.getMin = z;
        return getMax();
    }

    public T setMax(TimeInterpolator timeInterpolator) {
        this.IsOverlapping = timeInterpolator;
        return getMax();
    }

    public T setMin(int i) {
        this.equals = i;
        return getMax();
    }

    public T setMin(PhotoView.FlingRunnable flingRunnable) {
        this.isInside = flingRunnable;
        return getMax();
    }

    public T length(int i) {
        this.length = i;
        return getMax();
    }

    public T setMax(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1562619999, oncanceled);
            onCancelLoad.getMin(-1562619999, oncanceled);
        }
        this.setMin = i;
        return getMax();
    }
}
