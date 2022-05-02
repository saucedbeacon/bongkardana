package o;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class GriverSplashView<T> extends onLoadMoreStateChanged<T, T> implements GriverProgressBar<T> {
    static final getMax[] getMin = new getMax[0];
    static final getMax[] toIntRange = new getMax[0];
    volatile boolean FastBitmap$CoordinateSystem;
    int IsOverlapping;
    volatile long equals;
    final AtomicReference<getMax<T>[]> getMax;
    setMax<T> isInside;
    final int length;
    final AtomicBoolean setMax = new AtomicBoolean();
    Throwable toDoubleRange;
    final setMax<T> toFloatRange;

    public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
    }

    public GriverSplashView(TitleBarRightButtonView.AnonymousClass1<T> r1, int i) {
        super(r1);
        this.length = i;
        setMax<T> setmax = new setMax<>(i);
        this.toFloatRange = setmax;
        this.isInside = setmax;
        this.getMax = new AtomicReference<>(getMin);
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        getMax[] getmaxArr;
        getMax[] getmaxArr2;
        getMax getmax = new getMax(griverProgressBar, this);
        griverProgressBar.onSubscribe(getmax);
        do {
            getmaxArr = (getMax[]) this.getMax.get();
            if (getmaxArr == toIntRange) {
                break;
            }
            int length2 = getmaxArr.length;
            getmaxArr2 = new getMax[(length2 + 1)];
            System.arraycopy(getmaxArr, 0, getmaxArr2, 0, length2);
            getmaxArr2[length2] = getmax;
        } while (!this.getMax.compareAndSet(getmaxArr, getmaxArr2));
        if (this.setMax.get() || !this.setMax.compareAndSet(false, true)) {
            getMin(getmax);
        } else {
            this.setMin.subscribe(this);
        }
    }

    private void getMin(getMax<T> getmax) {
        if (getmax.getAndIncrement() == 0) {
            long j = getmax.index;
            int i = getmax.offset;
            setMax<T> setmax = getmax.node;
            GriverProgressBar<? super T> griverProgressBar = getmax.downstream;
            int i2 = this.length;
            int i3 = 1;
            while (!getmax.disposed) {
                boolean z = this.FastBitmap$CoordinateSystem;
                boolean z2 = this.equals == j;
                if (z && z2) {
                    getmax.node = null;
                    Throwable th = this.toDoubleRange;
                    if (th != null) {
                        griverProgressBar.onError(th);
                        return;
                    } else {
                        griverProgressBar.onComplete();
                        return;
                    }
                } else if (!z2) {
                    if (i == i2) {
                        setmax = setmax.getMin;
                        i = 0;
                    }
                    griverProgressBar.onNext(setmax.setMin[i]);
                    i++;
                    j++;
                } else {
                    getmax.index = j;
                    getmax.offset = i;
                    getmax.node = setmax;
                    i3 = getmax.addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                }
            }
            getmax.node = null;
        }
    }

    public final void onNext(T t) {
        int i = this.IsOverlapping;
        if (i == this.length) {
            setMax<T> setmax = new setMax<>(i);
            setmax.setMin[0] = t;
            this.IsOverlapping = 1;
            this.isInside.getMin = setmax;
            this.isInside = setmax;
        } else {
            this.isInside.setMin[i] = t;
            this.IsOverlapping = i + 1;
        }
        this.equals++;
        for (getMax min : (getMax[]) this.getMax.get()) {
            getMin(min);
        }
    }

    public final void onError(Throwable th) {
        this.toDoubleRange = th;
        this.FastBitmap$CoordinateSystem = true;
        for (getMax min : (getMax[]) this.getMax.getAndSet(toIntRange)) {
            getMin(min);
        }
    }

    public final void onComplete() {
        this.FastBitmap$CoordinateSystem = true;
        for (getMax min : (getMax[]) this.getMax.getAndSet(toIntRange)) {
            getMin(min);
        }
    }

    static final class getMax<T> extends AtomicInteger implements GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = 6770240836423125754L;
        volatile boolean disposed;
        final GriverProgressBar<? super T> downstream;
        long index;
        setMax<T> node;
        int offset;
        final GriverSplashView<T> parent;

        getMax(GriverProgressBar<? super T> griverProgressBar, GriverSplashView<T> griverSplashView) {
            this.downstream = griverProgressBar;
            this.parent = griverSplashView;
            this.node = griverSplashView.toFloatRange;
        }

        public final void dispose() {
            getMax[] getmaxArr;
            getMax[] getmaxArr2;
            if (!this.disposed) {
                this.disposed = true;
                GriverSplashView<T> griverSplashView = this.parent;
                do {
                    getmaxArr = (getMax[]) griverSplashView.getMax.get();
                    int length = getmaxArr.length;
                    if (length != 0) {
                        int i = -1;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            } else if (getmaxArr[i2] == this) {
                                i = i2;
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (i < 0) {
                            return;
                        }
                        if (length == 1) {
                            getmaxArr2 = GriverSplashView.getMin;
                        } else {
                            getMax[] getmaxArr3 = new getMax[(length - 1)];
                            System.arraycopy(getmaxArr, 0, getmaxArr3, 0, i);
                            System.arraycopy(getmaxArr, i + 1, getmaxArr3, i, (length - i) - 1);
                            getmaxArr2 = getmaxArr3;
                        }
                    } else {
                        return;
                    }
                } while (!griverSplashView.getMax.compareAndSet(getmaxArr, getmaxArr2));
            }
        }

        public final boolean isDisposed() {
            return this.disposed;
        }
    }

    static final class setMax<T> {
        volatile setMax<T> getMin;
        final T[] setMin;

        setMax(int i) {
            this.setMin = (Object[]) new Object[i];
        }
    }
}
