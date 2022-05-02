package o;

import android.view.animation.Interpolator;

abstract class ActionMenuItemView implements Interpolator {
    private final float getMax;
    private final float[] setMax;

    protected ActionMenuItemView(float[] fArr) {
        this.setMax = fArr;
        this.getMax = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.setMax;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.getMax;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.setMax;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
