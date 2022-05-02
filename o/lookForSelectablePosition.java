package o;

import android.animation.TimeInterpolator;

final class lookForSelectablePosition implements Runnable {
    private final setSelector getMax;
    private final TimeInterpolator getMin;

    public lookForSelectablePosition(setSelector setselector, TimeInterpolator timeInterpolator) {
        this.getMax = setselector;
        this.getMin = timeInterpolator;
    }

    public final void run() {
        this.getMax.length.setMin(this.getMin);
    }
}
