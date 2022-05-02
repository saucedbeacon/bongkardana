package o;

import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;

public final class IComponent<T> extends getStaticDataEncryptComp<T> {
    static final setMax[] getMin = new setMax[0];
    static final setMax[] setMax = new setMax[0];
    Throwable getMax;
    final AtomicReference<setMax<T>[]> length = new AtomicReference<>(setMax);

    @CheckReturnValue
    @NonNull
    public static <T> IComponent<T> setMax() {
        return new IComponent<>();
    }

    IComponent() {
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        setMax setmax = new setMax(griverProgressBar, this);
        griverProgressBar.onSubscribe(setmax);
        if (!setMin(setmax)) {
            Throwable th = this.getMax;
            if (th != null) {
                griverProgressBar.onError(th);
            } else {
                griverProgressBar.onComplete();
            }
        } else if (setmax.isDisposed()) {
            getMax(setmax);
        }
    }

    private boolean setMin(setMax<T> setmax) {
        setMax[] setmaxArr;
        setMax[] setmaxArr2;
        do {
            setmaxArr = (setMax[]) this.length.get();
            if (setmaxArr == getMin) {
                return false;
            }
            int length2 = setmaxArr.length;
            setmaxArr2 = new setMax[(length2 + 1)];
            System.arraycopy(setmaxArr, 0, setmaxArr2, 0, length2);
            setmaxArr2[length2] = setmax;
        } while (!this.length.compareAndSet(setmaxArr, setmaxArr2));
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void getMax(setMax<T> setmax) {
        setMax<T>[] setmaxArr;
        setMax[] setmaxArr2;
        do {
            setmaxArr = (setMax[]) this.length.get();
            if (setmaxArr != getMin && setmaxArr != setMax) {
                int length2 = setmaxArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        break;
                    } else if (setmaxArr[i2] == setmax) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length2 == 1) {
                        setmaxArr2 = setMax;
                    } else {
                        setMax[] setmaxArr3 = new setMax[(length2 - 1)];
                        System.arraycopy(setmaxArr, 0, setmaxArr3, 0, i);
                        System.arraycopy(setmaxArr, i + 1, setmaxArr3, i, (length2 - i) - 1);
                        setmaxArr2 = setmaxArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.length.compareAndSet(setmaxArr, setmaxArr2));
    }

    public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
        if (this.length.get() == getMin) {
            updateRunnable.dispose();
        }
    }

    public final void onNext(T t) {
        setRefreshAnimation.getMax(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        for (setMax onNext : (setMax[]) this.length.get()) {
            onNext.onNext(t);
        }
    }

    public final void onError(Throwable th) {
        setRefreshAnimation.getMax(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        setMax<T>[] setmaxArr = this.length.get();
        setMax<T>[] setmaxArr2 = getMin;
        if (setmaxArr == setmaxArr2) {
            SecuritySignature.getMax(th);
            return;
        }
        this.getMax = th;
        for (setMax onError : (setMax[]) this.length.getAndSet(setmaxArr2)) {
            onError.onError(th);
        }
    }

    public final void onComplete() {
        setMax<T>[] setmaxArr = this.length.get();
        setMax<T>[] setmaxArr2 = getMin;
        if (setmaxArr != setmaxArr2) {
            for (setMax onComplete : (setMax[]) this.length.getAndSet(setmaxArr2)) {
                onComplete.onComplete();
            }
        }
    }

    static final class setMax<T> extends AtomicBoolean implements GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = 3562861878281475070L;
        final GriverProgressBar<? super T> downstream;
        final IComponent<T> parent;

        setMax(GriverProgressBar<? super T> griverProgressBar, IComponent<T> iComponent) {
            this.downstream = griverProgressBar;
            this.parent = iComponent;
        }

        public final void onNext(T t) {
            if (!get()) {
                this.downstream.onNext(t);
            }
        }

        public final void onError(Throwable th) {
            if (get()) {
                SecuritySignature.getMax(th);
            } else {
                this.downstream.onError(th);
            }
        }

        public final void onComplete() {
            if (!get()) {
                this.downstream.onComplete();
            }
        }

        public final void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.getMax(this);
            }
        }

        public final boolean isDisposed() {
            return get();
        }
    }
}
