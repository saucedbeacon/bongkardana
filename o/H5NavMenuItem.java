package o;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import o.TitleBarRightButtonView;

public final class H5NavMenuItem {
    public static <T, R> boolean setMin(TitleBarRightButtonView.AnonymousClass4<T> r1, GriverProgressBar<? super R> griverProgressBar, RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<? extends R>> redDotDrawable) {
        if (!(r1 instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) r1).call();
            if (call == null) {
                EmptyDisposable.complete((GriverProgressBar<?>) griverProgressBar);
                return true;
            }
            try {
                TitleBarRightButtonView.AnonymousClass4 r12 = (TitleBarRightButtonView.AnonymousClass4) setRefreshAnimation.getMax(redDotDrawable.apply(call), "The mapper returned a null ObservableSource");
                if (r12 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) r12).call();
                        if (call2 == null) {
                            EmptyDisposable.complete((GriverProgressBar<?>) griverProgressBar);
                            return true;
                        }
                        setMax setmax = new setMax(griverProgressBar, call2);
                        griverProgressBar.onSubscribe(setmax);
                        setmax.run();
                    } catch (Throwable th) {
                        registerNode.getMax(th);
                        EmptyDisposable.error(th, (GriverProgressBar<?>) griverProgressBar);
                        return true;
                    }
                } else {
                    r12.subscribe(griverProgressBar);
                }
                return true;
            } catch (Throwable th2) {
                registerNode.getMax(th2);
                EmptyDisposable.error(th2, (GriverProgressBar<?>) griverProgressBar);
                return true;
            }
        } catch (Throwable th3) {
            registerNode.getMax(th3);
            EmptyDisposable.error(th3, (GriverProgressBar<?>) griverProgressBar);
            return true;
        }
    }

    public static final class setMin<T, R> extends TitleBarRightButtonView.AnonymousClass1<R> {
        final T getMax;
        final RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<? extends R>> getMin;

        public setMin(T t, RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<? extends R>> redDotDrawable) {
            this.getMax = t;
            this.getMin = redDotDrawable;
        }

        public final void subscribeActual(GriverProgressBar<? super R> griverProgressBar) {
            try {
                TitleBarRightButtonView.AnonymousClass4 r0 = (TitleBarRightButtonView.AnonymousClass4) setRefreshAnimation.getMax(this.getMin.apply(this.getMax), "The mapper returned a null ObservableSource");
                if (r0 instanceof Callable) {
                    try {
                        Object call = ((Callable) r0).call();
                        if (call == null) {
                            EmptyDisposable.complete((GriverProgressBar<?>) griverProgressBar);
                            return;
                        }
                        setMax setmax = new setMax(griverProgressBar, call);
                        griverProgressBar.onSubscribe(setmax);
                        setmax.run();
                    } catch (Throwable th) {
                        registerNode.getMax(th);
                        EmptyDisposable.error(th, (GriverProgressBar<?>) griverProgressBar);
                    }
                } else {
                    r0.subscribe(griverProgressBar);
                }
            } catch (Throwable th2) {
                EmptyDisposable.error(th2, (GriverProgressBar<?>) griverProgressBar);
            }
        }
    }

    public static final class setMax<T> extends AtomicInteger implements setRefreshTips<T>, Runnable {
        static final int FUSED = 1;
        static final int ON_COMPLETE = 3;
        static final int ON_NEXT = 2;
        static final int START = 0;
        private static final long serialVersionUID = 3880992722410194083L;
        final GriverProgressBar<? super T> observer;
        final T value;

        public setMax(GriverProgressBar<? super T> griverProgressBar, T t) {
            this.observer = griverProgressBar;
            this.value = t;
        }

        public final boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public final boolean offer(T t, T t2) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Nullable
        public final T poll() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.value;
        }

        public final boolean isEmpty() {
            return get() != 1;
        }

        public final void clear() {
            lazySet(3);
        }

        public final void dispose() {
            set(3);
        }

        public final boolean isDisposed() {
            return get() == 3;
        }

        public final int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        public final void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.observer.onNext(this.value);
                if (get() == 2) {
                    lazySet(3);
                    this.observer.onComplete();
                }
            }
        }
    }
}
