package o;

import android.os.ConditionVariable;

public final class setSharedElementEnterTransition implements Runnable {
    private final ConditionVariable getMax;

    public setSharedElementEnterTransition(ConditionVariable conditionVariable) {
        this.getMax = conditionVariable;
    }

    public final void run() {
        this.getMax.open();
    }
}
