package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setCustomTitleElementsColor<T> extends onLoadMoreStateChanged<T, T> {
    final setMinDuration<? extends T> getMax;

    public setCustomTitleElementsColor(TitleBarRightButtonView.AnonymousClass1<T> r1, setMinDuration<? extends T> setminduration) {
        super(r1);
        this.getMax = setminduration;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        setMin setmin = new setMin(griverProgressBar);
        griverProgressBar.onSubscribe(setmin);
        this.setMin.subscribe(setmin);
        this.getMax.getMin(setmin.otherObserver);
    }

    static final class setMin<T> extends AtomicInteger implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
        static final int OTHER_STATE_HAS_VALUE = 1;
        private static final long serialVersionUID = -4592979584110982903L;
        volatile boolean disposed;
        final GriverProgressBar<? super T> downstream;
        final InterfacePluginInfo error = new InterfacePluginInfo();
        final AtomicReference<GriverProgressBar.UpdateRunnable> mainDisposable = new AtomicReference<>();
        volatile boolean mainDone;
        final setMax<T> otherObserver = new setMax<>(this);
        volatile int otherState;
        volatile getRefreshViewHeight<T> queue;
        T singleItem;

        setMin(GriverProgressBar<? super T> griverProgressBar) {
            this.downstream = griverProgressBar;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.setOnce(this.mainDisposable, updateRunnable);
        }

        public final void onNext(T t) {
            if (compareAndSet(0, 1)) {
                this.downstream.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                getOrCreateQueue().offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        public final void onError(Throwable th) {
            if (this.error.addThrowable(th)) {
                DisposableHelper.dispose(this.otherObserver);
                drain();
                return;
            }
            SecuritySignature.getMax(th);
        }

        public final void onComplete() {
            this.mainDone = true;
            drain();
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.mainDisposable.get());
        }

        public final void dispose() {
            this.disposed = true;
            DisposableHelper.dispose(this.mainDisposable);
            DisposableHelper.dispose(this.otherObserver);
            if (getAndIncrement() == 0) {
                this.queue = null;
                this.singleItem = null;
            }
        }

        /* access modifiers changed from: package-private */
        public final void otherSuccess(T t) {
            if (compareAndSet(0, 1)) {
                this.downstream.onNext(t);
                this.otherState = 2;
            } else {
                this.singleItem = t;
                this.otherState = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        /* access modifiers changed from: package-private */
        public final void otherError(Throwable th) {
            if (this.error.addThrowable(th)) {
                DisposableHelper.dispose(this.mainDisposable);
                drain();
                return;
            }
            SecuritySignature.getMax(th);
        }

        /* access modifiers changed from: package-private */
        public final getRefreshViewHeight<T> getOrCreateQueue() {
            getRefreshViewHeight<T> getrefreshviewheight = this.queue;
            if (getrefreshviewheight != null) {
                return getrefreshviewheight;
            }
            setTitleBackgroundImage settitlebackgroundimage = new setTitleBackgroundImage(TitleBarRightButtonView.AnonymousClass1.bufferSize());
            this.queue = settitlebackgroundimage;
            return settitlebackgroundimage;
        }

        /* access modifiers changed from: package-private */
        public final void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        /* access modifiers changed from: package-private */
        public final void drainLoop() {
            GriverProgressBar<? super T> griverProgressBar = this.downstream;
            int i = 1;
            while (!this.disposed) {
                if (this.error.get() != null) {
                    this.singleItem = null;
                    this.queue = null;
                    griverProgressBar.onError(this.error.terminate());
                    return;
                }
                int i2 = this.otherState;
                if (i2 == 1) {
                    T t = this.singleItem;
                    this.singleItem = null;
                    this.otherState = 2;
                    griverProgressBar.onNext(t);
                    i2 = 2;
                }
                boolean z = this.mainDone;
                getRefreshViewHeight<T> getrefreshviewheight = this.queue;
                T poll = getrefreshviewheight != null ? getrefreshviewheight.poll() : null;
                boolean z2 = poll == null;
                if (z && z2 && i2 == 2) {
                    this.queue = null;
                    griverProgressBar.onComplete();
                    return;
                } else if (!z2) {
                    griverProgressBar.onNext(poll);
                } else {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
            this.singleItem = null;
            this.queue = null;
        }

        static final class setMax<T> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements TitleBarRightButtonView.CornerMarkingUIController<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            final setMin<T> parent;

            setMax(setMin<T> setmin) {
                this.parent = setmin;
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                DisposableHelper.setOnce(this, updateRunnable);
            }

            public final void onSuccess(T t) {
                this.parent.otherSuccess(t);
            }

            public final void onError(Throwable th) {
                this.parent.otherError(th);
            }
        }
    }
}
