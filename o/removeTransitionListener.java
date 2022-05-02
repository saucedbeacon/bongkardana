package o;

import androidx.annotation.NonNull;
import o.addPreDrawListener;
import o.isPointInChildBounds;
import o.setPositiveButtonIcon;

public final class removeTransitionListener<Z> implements fireTrigger<Z>, addPreDrawListener.getMin {
    private static final setPositiveButtonIcon.length<removeTransitionListener<?>> getMax = addPreDrawListener.getMin(20, new addPreDrawListener.getMax<removeTransitionListener<?>>() {
        public final /* synthetic */ Object setMax() {
            return new removeTransitionListener();
        }
    });
    private boolean getMin;
    private fireTrigger<Z> length;
    private final isPointInChildBounds setMax = new isPointInChildBounds.length();
    private boolean setMin;

    @NonNull
    public static <Z> removeTransitionListener<Z> getMin(fireTrigger<Z> firetrigger) {
        removeTransitionListener<Z> max = getMax.getMax();
        if (max != null) {
            removeTransitionListener<Z> removetransitionlistener = max;
            removetransitionlistener.getMin = false;
            removetransitionlistener.setMin = true;
            removetransitionlistener.length = firetrigger;
            return removetransitionlistener;
        }
        throw new NullPointerException("Argument must not be null");
    }

    removeTransitionListener() {
    }

    public final synchronized void getMax() {
        this.setMax.setMax();
        if (this.setMin) {
            this.setMin = false;
            if (this.getMin) {
                length();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    @NonNull
    public final Class<Z> getMin() {
        return this.length.getMin();
    }

    @NonNull
    public final Z setMin() {
        return this.length.setMin();
    }

    public final int setMax() {
        return this.length.setMax();
    }

    public final synchronized void length() {
        this.setMax.setMax();
        this.getMin = true;
        if (!this.setMin) {
            this.length.length();
            this.length = null;
            getMax.getMin(this);
        }
    }

    @NonNull
    public final isPointInChildBounds j_() {
        return this.setMax;
    }
}
