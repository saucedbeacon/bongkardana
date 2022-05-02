package o;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import id.dana.R;
import java.lang.ref.WeakReference;
import o.setEnv;
import o.setUseAmcsLite;

public abstract class setEnv<T extends setEnv<T, S>, S extends setUseAmcsLite> {
    private static final TimeInterpolator equals = new DecelerateInterpolator(2.0f);
    private static final PointF toDoubleRange = new PointF(0.0f, 0.0f);
    private static final access$1402 toString = new access$1402("", "", R.drawable.dana_logo_blue);
    private static final getEnv values = new getUseSecurityGuard();
    protected setUseAmcsLite.setMin IsOverlapping = null;
    protected WeakReference<Activity> getMax;
    protected TimeInterpolator getMin = equals;
    protected access$1402 isInside = toString;
    protected long length = 200;
    protected getEnv setMax = values;
    protected PointF setMin = toDoubleRange;
    protected View toFloatRange;
    protected boolean toIntRange = true;

    /* access modifiers changed from: protected */
    public abstract T getMax();

    public setEnv(Activity activity) {
        this.getMax = new WeakReference<>(activity);
    }

    public final T setMin(getEnv getenv) {
        this.setMax = getenv;
        return getMax();
    }

    public final T getMax(@NonNull View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        setMax(new PointF((float) (iArr[0] + (view.getWidth() / 2)), (float) (iArr[1] + (view.getHeight() / 2))));
        return getMax();
    }

    public final T setMax(@NonNull View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        setMax(new PointF((float) (iArr[0] + view.getWidth()), (float) (iArr[1] + (view.getHeight() / 2))));
        return getMax();
    }

    private T setMax(PointF pointF) {
        this.setMin = pointF;
        double d = (double) pointF.y;
        Display defaultDisplay = this.getMax.get().getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        double d2 = (double) ((float) displayMetrics.heightPixels);
        Double.isNaN(d2);
        this.toIntRange = d < d2 * 0.5d;
        return getMax();
    }

    public final T getMin(access$1402 access_1402) {
        this.isInside = access_1402;
        return getMax();
    }

    public final T setMax() {
        this.toFloatRange = this.getMax.get().getLayoutInflater().inflate(R.layout.view_gesture_animation, (ViewGroup) null);
        return getMax();
    }
}
