package o;

import androidx.annotation.NonNull;

final class onNewStateAttachHandlers<Z> implements fireTrigger<Z> {
    private boolean equals;
    private final length getMax;
    private final boolean getMin;
    private int isInside;
    final fireTrigger<Z> length;
    private final boolean setMax;
    private final setPivotY setMin;

    interface length {
        void setMax(setPivotY setpivoty, onNewStateAttachHandlers<?> onnewstateattachhandlers);
    }

    onNewStateAttachHandlers(fireTrigger<Z> firetrigger, boolean z, boolean z2, setPivotY setpivoty, length length2) {
        if (firetrigger != null) {
            this.length = firetrigger;
            this.getMin = z;
            this.setMax = z2;
            this.setMin = setpivoty;
            if (length2 != null) {
                this.getMax = length2;
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    /* access modifiers changed from: package-private */
    public final boolean getMax() {
        return this.getMin;
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
        if (this.isInside > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.equals) {
            this.equals = true;
            if (this.setMax) {
                this.length.length();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void toIntRange() {
        if (!this.equals) {
            this.isInside++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* access modifiers changed from: package-private */
    public final void equals() {
        boolean z;
        synchronized (this) {
            if (this.isInside > 0) {
                z = true;
                int i = this.isInside - 1;
                this.isInside = i;
                if (i != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.getMax.setMax(this.setMin, this);
        }
    }

    public final synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder("EngineResource{isMemoryCacheable=");
        sb.append(this.getMin);
        sb.append(", listener=");
        sb.append(this.getMax);
        sb.append(", key=");
        sb.append(this.setMin);
        sb.append(", acquired=");
        sb.append(this.isInside);
        sb.append(", isRecycled=");
        sb.append(this.equals);
        sb.append(", resource=");
        sb.append(this.length);
        sb.append('}');
        return sb.toString();
    }
}
