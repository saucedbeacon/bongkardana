package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.NebulaPopMenu;
import o.TitleBarRightButtonView;

public final class addMenu<T, U, V> extends onLoadMoreStateChanged<T, T> {
    final RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<V>> getMax;
    final TitleBarRightButtonView.AnonymousClass4<U> getMin;
    final TitleBarRightButtonView.AnonymousClass4<? extends T> setMax;

    interface getMax extends NebulaPopMenu.AnonymousClass2.getMin {
        void onTimeoutError(long j, Throwable th);
    }

    public addMenu(TitleBarRightButtonView.AnonymousClass1<T> r1, TitleBarRightButtonView.AnonymousClass4<U> r2, RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<V>> redDotDrawable, TitleBarRightButtonView.AnonymousClass4<? extends T> r4) {
        super(r1);
        this.getMin = r2;
        this.getMax = redDotDrawable;
        this.setMax = r4;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        if (this.setMax == null) {
            getMin getmin = new getMin(griverProgressBar, this.getMax);
            griverProgressBar.onSubscribe(getmin);
            getmin.startFirstTimeout(this.getMin);
            this.setMin.subscribe(getmin);
            return;
        }
        setMin setmin = new setMin(griverProgressBar, this.getMax, this.setMax);
        griverProgressBar.onSubscribe(setmin);
        setmin.startFirstTimeout(this.getMin);
        this.setMin.subscribe(setmin);
    }

    static final class getMin<T> extends AtomicLong implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable, getMax {
        private static final long serialVersionUID = 3764492702657003550L;
        final GriverProgressBar<? super T> downstream;
        final RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<?>> itemTimeoutIndicator;
        final setLoadMoreTipColor task = new setLoadMoreTipColor();
        final AtomicReference<GriverProgressBar.UpdateRunnable> upstream = new AtomicReference<>();

        getMin(GriverProgressBar<? super T> griverProgressBar, RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<?>> redDotDrawable) {
            this.downstream = griverProgressBar;
            this.itemTimeoutIndicator = redDotDrawable;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.setOnce(this.upstream, updateRunnable);
        }

        public final void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    GriverProgressBar.UpdateRunnable updateRunnable = (GriverProgressBar.UpdateRunnable) this.task.get();
                    if (updateRunnable != null) {
                        updateRunnable.dispose();
                    }
                    this.downstream.onNext(t);
                    try {
                        TitleBarRightButtonView.AnonymousClass4 r7 = (TitleBarRightButtonView.AnonymousClass4) setRefreshAnimation.getMax(this.itemTimeoutIndicator.apply(t), "The itemTimeoutIndicator returned a null ObservableSource.");
                        length length = new length(j2, this);
                        if (this.task.replace(length)) {
                            r7.subscribe(length);
                        }
                    } catch (Throwable th) {
                        registerNode.getMax(th);
                        this.upstream.get().dispose();
                        getAndSet(Long.MAX_VALUE);
                        this.downstream.onError(th);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void startFirstTimeout(TitleBarRightButtonView.AnonymousClass4<?> r4) {
            if (r4 != null) {
                length length = new length(0, this);
                if (this.task.replace(length)) {
                    r4.subscribe(length);
                }
            }
        }

        public final void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                return;
            }
            SecuritySignature.getMax(th);
        }

        public final void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
            }
        }

        public final void onTimeout(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.upstream);
                this.downstream.onError(new TimeoutException());
            }
        }

        public final void onTimeoutError(long j, Throwable th) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.upstream);
                this.downstream.onError(th);
                return;
            }
            SecuritySignature.getMax(th);
        }

        public final void dispose() {
            DisposableHelper.dispose(this.upstream);
            this.task.dispose();
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }
    }

    static final class setMin<T> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable, getMax {
        private static final long serialVersionUID = -7508389464265974549L;
        final GriverProgressBar<? super T> downstream;
        TitleBarRightButtonView.AnonymousClass4<? extends T> fallback;
        final AtomicLong index;
        final RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<?>> itemTimeoutIndicator;
        final setLoadMoreTipColor task = new setLoadMoreTipColor();
        final AtomicReference<GriverProgressBar.UpdateRunnable> upstream;

        setMin(GriverProgressBar<? super T> griverProgressBar, RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<?>> redDotDrawable, TitleBarRightButtonView.AnonymousClass4<? extends T> r3) {
            this.downstream = griverProgressBar;
            this.itemTimeoutIndicator = redDotDrawable;
            this.fallback = r3;
            this.index = new AtomicLong();
            this.upstream = new AtomicReference<>();
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.setOnce(this.upstream, updateRunnable);
        }

        public final void onNext(T t) {
            long j = this.index.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.index.compareAndSet(j, j2)) {
                    GriverProgressBar.UpdateRunnable updateRunnable = (GriverProgressBar.UpdateRunnable) this.task.get();
                    if (updateRunnable != null) {
                        updateRunnable.dispose();
                    }
                    this.downstream.onNext(t);
                    try {
                        TitleBarRightButtonView.AnonymousClass4 r8 = (TitleBarRightButtonView.AnonymousClass4) setRefreshAnimation.getMax(this.itemTimeoutIndicator.apply(t), "The itemTimeoutIndicator returned a null ObservableSource.");
                        length length = new length(j2, this);
                        if (this.task.replace(length)) {
                            r8.subscribe(length);
                        }
                    } catch (Throwable th) {
                        registerNode.getMax(th);
                        this.upstream.get().dispose();
                        this.index.getAndSet(Long.MAX_VALUE);
                        this.downstream.onError(th);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void startFirstTimeout(TitleBarRightButtonView.AnonymousClass4<?> r4) {
            if (r4 != null) {
                length length = new length(0, this);
                if (this.task.replace(length)) {
                    r4.subscribe(length);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onError(th);
                this.task.dispose();
                return;
            }
            SecuritySignature.getMax(th);
        }

        public final void onComplete() {
            if (this.index.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.task.dispose();
                this.downstream.onComplete();
                this.task.dispose();
            }
        }

        public final void onTimeout(long j) {
            if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this.upstream);
                TitleBarRightButtonView.AnonymousClass4<? extends T> r4 = this.fallback;
                this.fallback = null;
                r4.subscribe(new NebulaPopMenu.AnonymousClass2.setMax(this.downstream, this));
            }
        }

        public final void onTimeoutError(long j, Throwable th) {
            if (this.index.compareAndSet(j, Long.MAX_VALUE)) {
                DisposableHelper.dispose(this);
                this.downstream.onError(th);
                return;
            }
            SecuritySignature.getMax(th);
        }

        public final void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this);
            this.task.dispose();
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((GriverProgressBar.UpdateRunnable) get());
        }
    }

    static final class length extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<Object>, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = 8708641127342403073L;
        final long idx;
        final getMax parent;

        length(long j, getMax getmax) {
            this.idx = j;
            this.parent = getmax;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.setOnce(this, updateRunnable);
        }

        public final void onNext(Object obj) {
            GriverProgressBar.UpdateRunnable updateRunnable = (GriverProgressBar.UpdateRunnable) get();
            if (updateRunnable != DisposableHelper.DISPOSED) {
                updateRunnable.dispose();
                lazySet(DisposableHelper.DISPOSED);
                this.parent.onTimeout(this.idx);
            }
        }

        public final void onError(Throwable th) {
            if (get() != DisposableHelper.DISPOSED) {
                lazySet(DisposableHelper.DISPOSED);
                this.parent.onTimeoutError(this.idx, th);
                return;
            }
            SecuritySignature.getMax(th);
        }

        public final void onComplete() {
            if (get() != DisposableHelper.DISPOSED) {
                lazySet(DisposableHelper.DISPOSED);
                this.parent.onTimeout(this.idx);
            }
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((GriverProgressBar.UpdateRunnable) get());
        }
    }
}
