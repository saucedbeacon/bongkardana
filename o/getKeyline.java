package o;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.RequestCoordinator;

public final class getKeyline implements RequestCoordinator, getResolvedLayoutParams {
    public volatile getResolvedLayoutParams getMax;
    @GuardedBy("requestLock")
    private RequestCoordinator.RequestState getMin = RequestCoordinator.RequestState.CLEARED;
    public volatile getResolvedLayoutParams length;
    @Nullable
    private final RequestCoordinator setMax;
    private final Object setMin;
    @GuardedBy("requestLock")
    private RequestCoordinator.RequestState toFloatRange = RequestCoordinator.RequestState.CLEARED;

    public getKeyline(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        this.setMin = obj;
        this.setMax = requestCoordinator;
    }

    public final void length() {
        synchronized (this.setMin) {
            if (this.getMin != RequestCoordinator.RequestState.RUNNING) {
                this.getMin = RequestCoordinator.RequestState.RUNNING;
                this.length.length();
            }
        }
    }

    public final void getMin() {
        synchronized (this.setMin) {
            this.getMin = RequestCoordinator.RequestState.CLEARED;
            this.length.getMin();
            if (this.toFloatRange != RequestCoordinator.RequestState.CLEARED) {
                this.toFloatRange = RequestCoordinator.RequestState.CLEARED;
                this.getMax.getMin();
            }
        }
    }

    public final void setMax() {
        synchronized (this.setMin) {
            if (this.getMin == RequestCoordinator.RequestState.RUNNING) {
                this.getMin = RequestCoordinator.RequestState.PAUSED;
                this.length.setMax();
            }
            if (this.toFloatRange == RequestCoordinator.RequestState.RUNNING) {
                this.toFloatRange = RequestCoordinator.RequestState.PAUSED;
                this.getMax.setMax();
            }
        }
    }

    public final boolean getMax() {
        boolean z;
        synchronized (this.setMin) {
            if (this.getMin != RequestCoordinator.RequestState.RUNNING) {
                if (this.toFloatRange != RequestCoordinator.RequestState.RUNNING) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public final boolean setMin() {
        boolean z;
        synchronized (this.setMin) {
            if (this.getMin != RequestCoordinator.RequestState.SUCCESS) {
                if (this.toFloatRange != RequestCoordinator.RequestState.SUCCESS) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public final boolean equals() {
        boolean z;
        synchronized (this.setMin) {
            z = this.getMin == RequestCoordinator.RequestState.CLEARED && this.toFloatRange == RequestCoordinator.RequestState.CLEARED;
        }
        return z;
    }

    public final boolean getMax(getResolvedLayoutParams getresolvedlayoutparams) {
        if (getresolvedlayoutparams instanceof getKeyline) {
            getKeyline getkeyline = (getKeyline) getresolvedlayoutparams;
            if (!this.length.getMax(getkeyline.length) || !this.getMax.getMax(getkeyline.getMax)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean setMax(getResolvedLayoutParams getresolvedlayoutparams) {
        boolean z;
        synchronized (this.setMin) {
            z = IsOverlapping() && isInside(getresolvedlayoutparams);
        }
        return z;
    }

    @GuardedBy("requestLock")
    private boolean IsOverlapping() {
        RequestCoordinator requestCoordinator = this.setMax;
        return requestCoordinator == null || requestCoordinator.setMax(this);
    }

    public final boolean getMin(getResolvedLayoutParams getresolvedlayoutparams) {
        boolean z;
        synchronized (this.setMin) {
            z = toDoubleRange() && isInside(getresolvedlayoutparams);
        }
        return z;
    }

    public final boolean setMin(getResolvedLayoutParams getresolvedlayoutparams) {
        boolean z;
        synchronized (this.setMin) {
            z = isInside() && isInside(getresolvedlayoutparams);
        }
        return z;
    }

    @GuardedBy("requestLock")
    private boolean isInside() {
        RequestCoordinator requestCoordinator = this.setMax;
        return requestCoordinator == null || requestCoordinator.setMin(this);
    }

    @GuardedBy("requestLock")
    private boolean toDoubleRange() {
        RequestCoordinator requestCoordinator = this.setMax;
        return requestCoordinator == null || requestCoordinator.getMin(this);
    }

    @GuardedBy("requestLock")
    private boolean isInside(getResolvedLayoutParams getresolvedlayoutparams) {
        if (!getresolvedlayoutparams.equals(this.length)) {
            return this.getMin == RequestCoordinator.RequestState.FAILED && getresolvedlayoutparams.equals(this.getMax);
        }
        return true;
    }

    public final boolean toIntRange() {
        boolean z;
        synchronized (this.setMin) {
            if (!this.length.toIntRange()) {
                if (!this.getMax.toIntRange()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public final void length(getResolvedLayoutParams getresolvedlayoutparams) {
        synchronized (this.setMin) {
            if (getresolvedlayoutparams.equals(this.length)) {
                this.getMin = RequestCoordinator.RequestState.SUCCESS;
            } else if (getresolvedlayoutparams.equals(this.getMax)) {
                this.toFloatRange = RequestCoordinator.RequestState.SUCCESS;
            }
            if (this.setMax != null) {
                this.setMax.length(this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IsOverlapping(o.getResolvedLayoutParams r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.setMin
            monitor-enter(r0)
            o.getResolvedLayoutParams r1 = r2.getMax     // Catch:{ all -> 0x002f }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002f }
            if (r3 != 0) goto L_0x0020
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch:{ all -> 0x002f }
            r2.getMin = r3     // Catch:{ all -> 0x002f }
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = r2.toFloatRange     // Catch:{ all -> 0x002f }
            com.bumptech.glide.request.RequestCoordinator$RequestState r1 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch:{ all -> 0x002f }
            if (r3 == r1) goto L_0x001e
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.RUNNING     // Catch:{ all -> 0x002f }
            r2.toFloatRange = r3     // Catch:{ all -> 0x002f }
            o.getResolvedLayoutParams r3 = r2.getMax     // Catch:{ all -> 0x002f }
            r3.length()     // Catch:{ all -> 0x002f }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x0020:
            com.bumptech.glide.request.RequestCoordinator$RequestState r3 = com.bumptech.glide.request.RequestCoordinator.RequestState.FAILED     // Catch:{ all -> 0x002f }
            r2.toFloatRange = r3     // Catch:{ all -> 0x002f }
            com.bumptech.glide.request.RequestCoordinator r3 = r2.setMax     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x002d
            com.bumptech.glide.request.RequestCoordinator r3 = r2.setMax     // Catch:{ all -> 0x002f }
            r3.IsOverlapping(r2)     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x002f:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getKeyline.IsOverlapping(o.getResolvedLayoutParams):void");
    }

    public final RequestCoordinator toFloatRange() {
        RequestCoordinator floatRange;
        synchronized (this.setMin) {
            floatRange = this.setMax != null ? this.setMax.toFloatRange() : this;
        }
        return floatRange;
    }
}
