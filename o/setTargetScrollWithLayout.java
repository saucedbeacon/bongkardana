package o;

import o.GriverProgressBar;

public abstract class setTargetScrollWithLayout<T, U, V> extends getDistanceToRefresh implements GriverProgressBar<T>, getStackTrace<U, V> {
    protected Throwable getMax;
    public volatile boolean getMin;
    protected final GriverProgressBar<? super V> length;
    protected volatile boolean setMax;
    public final getRefreshViewHeight<U> setMin;

    public void setMin(GriverProgressBar<? super V> griverProgressBar, U u) {
    }

    public setTargetScrollWithLayout(GriverProgressBar<? super V> griverProgressBar, getRefreshViewHeight<U> getrefreshviewheight) {
        this.length = griverProgressBar;
        this.setMin = getrefreshviewheight;
    }

    public final boolean setMin() {
        return this.getMin;
    }

    public final boolean getMax() {
        return this.setMax;
    }

    public final boolean length() {
        return this.isInside.getAndIncrement() == 0;
    }

    public final boolean setMax() {
        return this.isInside.get() == 0 && this.isInside.compareAndSet(0, 1);
    }

    /* access modifiers changed from: protected */
    public final void length(U u, GriverProgressBar.UpdateRunnable updateRunnable) {
        GriverProgressBar<? super V> griverProgressBar = this.length;
        getRefreshViewHeight<U> getrefreshviewheight = this.setMin;
        if (this.isInside.get() != 0 || !this.isInside.compareAndSet(0, 1)) {
            getrefreshviewheight.offer(u);
            if (!length()) {
                return;
            }
        } else {
            setMin(griverProgressBar, u);
            if (this.isInside.addAndGet(-1) == 0) {
                return;
            }
        }
        decryptString.getMax(getrefreshviewheight, griverProgressBar, updateRunnable, this);
    }

    public final void getMax(U u, GriverProgressBar.UpdateRunnable updateRunnable) {
        GriverProgressBar<? super V> griverProgressBar = this.length;
        getRefreshViewHeight<U> getrefreshviewheight = this.setMin;
        if (this.isInside.get() != 0 || !this.isInside.compareAndSet(0, 1)) {
            getrefreshviewheight.offer(u);
            if (!length()) {
                return;
            }
        } else if (getrefreshviewheight.isEmpty()) {
            setMin(griverProgressBar, u);
            if (this.isInside.addAndGet(-1) == 0) {
                return;
            }
        } else {
            getrefreshviewheight.offer(u);
        }
        decryptString.getMax(getrefreshviewheight, griverProgressBar, updateRunnable, this);
    }

    public final Throwable getMin() {
        return this.getMax;
    }

    public final int setMax(int i) {
        return this.isInside.addAndGet(i);
    }
}
