package o;

import android.animation.TimeInterpolator;

final class setListSelectionHidden implements Runnable {
    private final TimeInterpolator getMin;
    private final setSelector setMin;

    public setListSelectionHidden(setSelector setselector, TimeInterpolator timeInterpolator) {
        this.setMin = setselector;
        this.getMin = timeInterpolator;
    }

    public final void run() {
        this.setMin.length.setMax(this.getMin);
    }
}
