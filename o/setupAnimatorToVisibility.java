package o;

import java.util.Arrays;
import o.getAnimatedVisibility;

public final class setupAnimatorToVisibility implements Runnable {
    private final getAnimatedVisibility setMax;

    public setupAnimatorToVisibility(getAnimatedVisibility getanimatedvisibility) {
        this.setMax = getanimatedvisibility;
    }

    public final void run() {
        getAnimatedVisibility getanimatedvisibility = this.setMax;
        synchronized (getanimatedvisibility) {
            getanimatedvisibility.equals = false;
            getAnimatedVisibility.length length = getanimatedvisibility.isInside;
            synchronized (length) {
                Arrays.fill(length.setMin, false);
                length.getMax = true;
            }
        }
    }
}
