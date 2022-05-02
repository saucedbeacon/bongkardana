package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class TabBarItem<T> extends setFavoriteBtnVisibility implements getSecondFloorView<T> {
    final TitleBarRightButtonView.AnonymousClass4<T> getMin;
    final boolean setMax;
    final RedDotDrawable<? super T, ? extends dismissBadgeView> setMin;

    public TabBarItem(TitleBarRightButtonView.AnonymousClass4<T> r1, RedDotDrawable<? super T, ? extends dismissBadgeView> redDotDrawable, boolean z) {
        this.getMin = r1;
        this.setMin = redDotDrawable;
        this.setMax = z;
    }

    public final void setMax(switchFavoriteIconFont switchfavoriteiconfont) {
        this.getMin.subscribe(new getMax(switchfavoriteiconfont, this.setMin, this.setMax));
    }

    public final TitleBarRightButtonView.AnonymousClass1<T> setMax() {
        setHasShowTab sethasshowtab = new setHasShowTab(this.getMin, this.setMin, this.setMax);
        RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
        return redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, sethasshowtab) : sethasshowtab;
    }

    static final class getMax<T> extends AtomicInteger implements GriverProgressBar.UpdateRunnable, GriverProgressBar<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        final boolean delayErrors;
        volatile boolean disposed;
        final switchFavoriteIconFont downstream;
        final InterfacePluginInfo errors = new InterfacePluginInfo();
        final RedDotDrawable<? super T, ? extends dismissBadgeView> mapper;
        final IRedDotManager set = new IRedDotManager();
        GriverProgressBar.UpdateRunnable upstream;

        getMax(switchFavoriteIconFont switchfavoriteiconfont, RedDotDrawable<? super T, ? extends dismissBadgeView> redDotDrawable, boolean z) {
            this.downstream = switchfavoriteiconfont;
            this.mapper = redDotDrawable;
            this.delayErrors = z;
            lazySet(1);
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.upstream, updateRunnable)) {
                this.upstream = updateRunnable;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            try {
                dismissBadgeView dismissbadgeview = (dismissBadgeView) setRefreshAnimation.getMax(this.mapper.apply(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                setMax setmax = new setMax();
                if (!this.disposed && this.set.getMin(setmax)) {
                    dismissbadgeview.getMax(setmax);
                }
            } catch (Throwable th) {
                registerNode.getMax(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        public final void onError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                SecuritySignature.getMax(th);
            } else if (!this.delayErrors) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.downstream.onError(this.errors.terminate());
                }
            } else if (decrementAndGet() == 0) {
                this.downstream.onError(this.errors.terminate());
            }
        }

        public final void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable terminate = this.errors.terminate();
                if (terminate != null) {
                    this.downstream.onError(terminate);
                } else {
                    this.downstream.onComplete();
                }
            }
        }

        public final void dispose() {
            this.disposed = true;
            this.upstream.dispose();
            this.set.dispose();
        }

        public final boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        /* access modifiers changed from: package-private */
        public final void innerComplete(getMax<T>.setMax setmax) {
            this.set.setMax(setmax);
            onComplete();
        }

        /* access modifiers changed from: package-private */
        public final void innerError(getMax<T>.setMax setmax, Throwable th) {
            this.set.setMax(setmax);
            onError(th);
        }

        final class setMax extends AtomicReference<GriverProgressBar.UpdateRunnable> implements switchFavoriteIconFont, GriverProgressBar.UpdateRunnable {
            private static final long serialVersionUID = 8606673141535671828L;

            setMax() {
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                DisposableHelper.setOnce(this, updateRunnable);
            }

            public final void onComplete() {
                getMax.this.innerComplete(this);
            }

            public final void onError(Throwable th) {
                getMax.this.innerError(this, th);
            }

            public final void dispose() {
                DisposableHelper.dispose(this);
            }

            public final boolean isDisposed() {
                return DisposableHelper.isDisposed((GriverProgressBar.UpdateRunnable) get());
            }
        }
    }
}
