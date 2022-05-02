package o;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import androidx.annotation.RequiresApi;
import o.setScrimColor;

public class setDrawerShadow {
    protected float getMax = 1.0f;
    protected float getMin = 1.0f;
    public ValueAnimator.AnimatorUpdateListener setMax;

    public setDrawerShadow() {
    }

    @RequiresApi(11)
    public setDrawerShadow(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.setMax = animatorUpdateListener;
    }

    public final float length() {
        return this.getMax;
    }

    public final float getMin() {
        return this.getMin;
    }

    @RequiresApi(11)
    public final void getMin(int i, setScrimColor.setMin setmin) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phaseX", new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(setmin);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(this.setMax);
        ofFloat.start();
    }

    @RequiresApi(11)
    public final void getMax(int i, int i2, setScrimColor.setMin setmin, setScrimColor.setMin setmin2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phaseX", new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(setmin);
        ofFloat.setDuration((long) i);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "phaseY", new float[]{0.0f, 1.0f});
        ofFloat2.setInterpolator(setmin2);
        ofFloat2.setDuration((long) i2);
        if (i > i2) {
            ofFloat.addUpdateListener(this.setMax);
        } else {
            ofFloat2.addUpdateListener(this.setMax);
        }
        ofFloat.start();
        ofFloat2.start();
    }

    @RequiresApi(11)
    public final void getMax(int i, setScrimColor.setMin setmin) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phaseY", new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(setmin);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(this.setMax);
        ofFloat.start();
    }
}
