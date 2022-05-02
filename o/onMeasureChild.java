package o;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.RequestCoordinator;

public final class onMeasureChild implements RequestCoordinator, getResolvedLayoutParams {
    @GuardedBy("requestLock")
    private boolean equals;
    @Nullable
    private final RequestCoordinator getMax;
    public volatile getResolvedLayoutParams getMin;
    public volatile getResolvedLayoutParams length;
    @GuardedBy("requestLock")
    private RequestCoordinator.RequestState setMax = RequestCoordinator.RequestState.CLEARED;
    private final Object setMin;
    @GuardedBy("requestLock")
    private RequestCoordinator.RequestState toFloatRange = RequestCoordinator.RequestState.CLEARED;

    public onMeasureChild(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        this.setMin = obj;
        this.getMax = requestCoordinator;
    }

    public final boolean setMax(getResolvedLayoutParams getresolvedlayoutparams) {
        boolean z;
        synchronized (this.setMin) {
            z = IsOverlapping() && (getresolvedlayoutparams.equals(this.getMin) || this.setMax != RequestCoordinator.RequestState.SUCCESS);
        }
        return z;
    }

    @GuardedBy("requestLock")
    private boolean IsOverlapping() {
        RequestCoordinator requestCoordinator = this.getMax;
        return requestCoordinator == null || requestCoordinator.setMax(this);
    }

    public final boolean getMin(getResolvedLayoutParams getresolvedlayoutparams) {
        boolean z;
        synchronized (this.setMin) {
            z = toDoubleRange() && getresolvedlayoutparams.equals(this.getMin) && !toIntRange();
        }
        return z;
    }

    public final boolean setMin(getResolvedLayoutParams getresolvedlayoutparams) {
        boolean z;
        synchronized (this.setMin) {
            z = isInside() && getresolvedlayoutparams.equals(this.getMin) && this.setMax != RequestCoordinator.RequestState.PAUSED;
        }
        return z;
    }

    @GuardedBy("requestLock")
    private boolean isInside() {
        RequestCoordinator requestCoordinator = this.getMax;
        return requestCoordinator == null || requestCoordinator.setMin(this);
    }

    @GuardedBy("requestLock")
    private boolean toDoubleRange() {
        RequestCoordinator requestCoordinator = this.getMax;
        return requestCoordinator == null || requestCoordinator.getMin(this);
    }

    public final boolean toIntRange() {
        boolean z;
        synchronized (this.setMin) {
            if (!this.length.toIntRange()) {
                if (!this.getMin.toIntRange()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void length(o.getResolvedLayoutParams r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.setMin
            monitor-enter(r0)
            o.getResolvedLayoutParams r1 = r2.length     // Catch:{ all -> 0x002d }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x0011
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch:{ all -> 0x002d }
            r2.toFloatRange = r3     // Catch:{ all -> 0x002d }
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x0011:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.SUCCESS     // Catch:{ all -> 0x002d }
            r2.setMax = r3     // Catch:{ all -> 0x002d }
            com.bumptech.glide.request.RequestCoordinator r3 = r2.getMax     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x001e
            com.bumptech.glide.request.RequestCoordinator r3 = r2.getMax     // Catch:{ all -> 0x002d }
            r3.length(r2)     // Catch:{ all -> 0x002d }
        L_0x001e:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = r2.toFloatRange     // Catch:{ all -> 0x002d }
            boolean r3 = r3.isComplete()     // Catch:{ all -> 0x002d }
            if (r3 != 0) goto L_0x002b
            o.getResolvedLayoutParams r3 = r2.length     // Catch:{ all -> 0x002d }
            r3.getMin()     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x002d:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onMeasureChild.length(o.getResolvedLayoutParams):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IsOverlapping(o.getResolvedLayoutParams r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.setMin
            monitor-enter(r0)
            o.getResolvedLayoutParams r1 = r2.getMin     // Catch:{ all -> 0x0020 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0020 }
            if (r3 != 0) goto L_0x0011
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch:{ all -> 0x0020 }
            r2.toFloatRange = r3     // Catch:{ all -> 0x0020 }
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x0011:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch:{ all -> 0x0020 }
            r2.setMax = r3     // Catch:{ all -> 0x0020 }
            com.bumptech.glide.request.RequestCoordinator r3 = r2.getMax     // Catch:{ all -> 0x0020 }
            if (r3 == 0) goto L_0x001e
            com.bumptech.glide.request.RequestCoordinator r3 = r2.getMax     // Catch:{ all -> 0x0020 }
            r3.IsOverlapping(r2)     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onMeasureChild.IsOverlapping(o.getResolvedLayoutParams):void");
    }

    public final RequestCoordinator toFloatRange() {
        RequestCoordinator floatRange;
        synchronized (this.setMin) {
            floatRange = this.getMax != null ? this.getMax.toFloatRange() : this;
        }
        return floatRange;
    }

    public final void length() {
        synchronized (this.setMin) {
            this.equals = true;
            try {
                if (!(this.setMax == RequestCoordinator.RequestState.SUCCESS || this.toFloatRange == RequestCoordinator.RequestState.RUNNING)) {
                    this.toFloatRange = RequestCoordinator.RequestState.RUNNING;
                    this.length.length();
                }
                if (this.equals && this.setMax != RequestCoordinator.RequestState.RUNNING) {
                    this.setMax = RequestCoordinator.RequestState.RUNNING;
                    this.getMin.length();
                }
            } finally {
                this.equals = false;
            }
        }
    }

    public final void getMin() {
        synchronized (this.setMin) {
            this.equals = false;
            this.setMax = RequestCoordinator.RequestState.CLEARED;
            this.toFloatRange = RequestCoordinator.RequestState.CLEARED;
            this.length.getMin();
            this.getMin.getMin();
        }
    }

    public final void setMax() {
        synchronized (this.setMin) {
            if (!this.toFloatRange.isComplete()) {
                this.toFloatRange = RequestCoordinator.RequestState.PAUSED;
                this.length.setMax();
            }
            if (!this.setMax.isComplete()) {
                this.setMax = RequestCoordinator.RequestState.PAUSED;
                this.getMin.setMax();
            }
        }
    }

    public final boolean getMax() {
        boolean z;
        synchronized (this.setMin) {
            z = this.setMax == RequestCoordinator.RequestState.RUNNING;
        }
        return z;
    }

    public final boolean setMin() {
        boolean z;
        synchronized (this.setMin) {
            z = this.setMax == RequestCoordinator.RequestState.SUCCESS;
        }
        return z;
    }

    public final boolean equals() {
        boolean z;
        synchronized (this.setMin) {
            z = this.setMax == RequestCoordinator.RequestState.CLEARED;
        }
        return z;
    }

    public final boolean getMax(getResolvedLayoutParams getresolvedlayoutparams) {
        if (getresolvedlayoutparams instanceof onMeasureChild) {
            onMeasureChild onmeasurechild = (onMeasureChild) getresolvedlayoutparams;
            if (this.getMin != null ? this.getMin.getMax(onmeasurechild.getMin) : onmeasurechild.getMin == null) {
                if (this.length == null) {
                    if (onmeasurechild.length == null) {
                        return true;
                    }
                } else if (this.length.getMax(onmeasurechild.length)) {
                    return true;
                }
            }
        }
        return false;
    }
}
