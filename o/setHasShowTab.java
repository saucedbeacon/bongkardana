package o;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.GriverPullRefreshService;
import o.TitleBarRightButtonView;

public final class setHasShowTab<T> extends onLoadMoreStateChanged<T, T> {
    final boolean getMax;
    final RedDotDrawable<? super T, ? extends dismissBadgeView> length;

    public setHasShowTab(TitleBarRightButtonView.AnonymousClass4<T> r1, RedDotDrawable<? super T, ? extends dismissBadgeView> redDotDrawable, boolean z) {
        super(r1);
        this.length = redDotDrawable;
        this.getMax = z;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        this.setMin.subscribe(new length(griverProgressBar, this.length, this.getMax));
    }

    static final class length<T> extends GriverPullRefreshService.IGriverRefreshState<T> implements GriverProgressBar<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        final boolean delayErrors;
        volatile boolean disposed;
        final GriverProgressBar<? super T> downstream;
        final InterfacePluginInfo errors = new InterfacePluginInfo();
        final RedDotDrawable<? super T, ? extends dismissBadgeView> mapper;
        final IRedDotManager set = new IRedDotManager();
        GriverProgressBar.UpdateRunnable upstream;

        public final void clear() {
        }

        public final boolean isEmpty() {
            return true;
        }

        @Nullable
        public final T poll() throws Exception {
            return null;
        }

        public final int requestFusion(int i) {
            return i & 2;
        }

        length(GriverProgressBar<? super T> griverProgressBar, RedDotDrawable<? super T, ? extends dismissBadgeView> redDotDrawable, boolean z) {
            this.downstream = griverProgressBar;
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
                setMin setmin = new setMin();
                if (!this.disposed && this.set.getMin(setmin)) {
                    dismissbadgeview.getMax(setmin);
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
        public final void innerComplete(length<T>.setMin setmin) {
            this.set.setMax(setmin);
            onComplete();
        }

        /* access modifiers changed from: package-private */
        public final void innerError(length<T>.setMin setmin, Throwable th) {
            this.set.setMax(setmin);
            onError(th);
        }

        final class setMin extends AtomicReference<GriverProgressBar.UpdateRunnable> implements switchFavoriteIconFont, GriverProgressBar.UpdateRunnable {
            private static final long serialVersionUID = 8606673141535671828L;

            setMin() {
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                DisposableHelper.setOnce(this, updateRunnable);
            }

            public final void onComplete() {
                length.this.innerComplete(this);
            }

            public final void onError(Throwable th) {
                length.this.innerError(this, th);
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
