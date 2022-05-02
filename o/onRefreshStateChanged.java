package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class onRefreshStateChanged<T> extends setFavoriteBtnVisibility {
    final boolean getMax;
    final RedDotDrawable<? super T, ? extends dismissBadgeView> setMax;
    final TitleBarRightButtonView.AnonymousClass1<T> setMin;

    public onRefreshStateChanged(TitleBarRightButtonView.AnonymousClass1<T> r1, RedDotDrawable<? super T, ? extends dismissBadgeView> redDotDrawable, boolean z) {
        this.setMin = r1;
        this.setMax = redDotDrawable;
        this.getMax = z;
    }

    public final void setMax(switchFavoriteIconFont switchfavoriteiconfont) {
        if (!onPullDistance.setMax(this.setMin, this.setMax, switchfavoriteiconfont)) {
            this.setMin.subscribe(new setMin(switchfavoriteiconfont, this.setMax, this.getMax));
        }
    }

    static final class setMin<T> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        static final C0108setMin equals = new C0108setMin((setMin<?>) null);
        GriverProgressBar.UpdateRunnable IsOverlapping;
        final boolean getMax;
        final switchFavoriteIconFont getMin;
        volatile boolean isInside;
        final RedDotDrawable<? super T, ? extends dismissBadgeView> length;
        final InterfacePluginInfo setMax = new InterfacePluginInfo();
        final AtomicReference<C0108setMin> setMin = new AtomicReference<>();

        setMin(switchFavoriteIconFont switchfavoriteiconfont, RedDotDrawable<? super T, ? extends dismissBadgeView> redDotDrawable, boolean z) {
            this.getMin = switchfavoriteiconfont;
            this.length = redDotDrawable;
            this.getMax = z;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.IsOverlapping, updateRunnable)) {
                this.IsOverlapping = updateRunnable;
                this.getMin.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            C0108setMin setmin;
            try {
                dismissBadgeView dismissbadgeview = (dismissBadgeView) setRefreshAnimation.getMax(this.length.apply(t), "The mapper returned a null CompletableSource");
                C0108setMin setmin2 = new C0108setMin(this);
                do {
                    setmin = this.setMin.get();
                    if (setmin == equals) {
                        return;
                    }
                } while (!this.setMin.compareAndSet(setmin, setmin2));
                if (setmin != null) {
                    setmin.dispose();
                }
                dismissbadgeview.getMax(setmin2);
            } catch (Throwable th) {
                registerNode.getMax(th);
                this.IsOverlapping.dispose();
                onError(th);
            }
        }

        public final void onError(Throwable th) {
            if (!this.setMax.addThrowable(th)) {
                SecuritySignature.getMax(th);
            } else if (this.getMax) {
                onComplete();
            } else {
                C0108setMin andSet = this.setMin.getAndSet(equals);
                if (!(andSet == null || andSet == equals)) {
                    andSet.dispose();
                }
                Throwable terminate = this.setMax.terminate();
                if (terminate != utAvaiable.setMax) {
                    this.getMin.onError(terminate);
                }
            }
        }

        public final void onComplete() {
            this.isInside = true;
            if (this.setMin.get() == null) {
                Throwable terminate = this.setMax.terminate();
                if (terminate == null) {
                    this.getMin.onComplete();
                } else {
                    this.getMin.onError(terminate);
                }
            }
        }

        public final void dispose() {
            this.IsOverlapping.dispose();
            C0108setMin andSet = this.setMin.getAndSet(equals);
            if (andSet != null && andSet != equals) {
                andSet.dispose();
            }
        }

        public final boolean isDisposed() {
            return this.setMin.get() == equals;
        }

        /* renamed from: o.onRefreshStateChanged$setMin$setMin  reason: collision with other inner class name */
        static final class C0108setMin extends AtomicReference<GriverProgressBar.UpdateRunnable> implements switchFavoriteIconFont {
            private static final long serialVersionUID = -8003404460084760287L;
            final setMin<?> parent;

            C0108setMin(setMin<?> setmin) {
                this.parent = setmin;
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                DisposableHelper.setOnce(this, updateRunnable);
            }

            public final void onError(Throwable th) {
                setMin<?> setmin = this.parent;
                if (!setmin.setMin.compareAndSet(this, (Object) null) || !setmin.setMax.addThrowable(th)) {
                    SecuritySignature.getMax(th);
                } else if (!setmin.getMax) {
                    setmin.dispose();
                    Throwable terminate = setmin.setMax.terminate();
                    if (terminate != utAvaiable.setMax) {
                        setmin.getMin.onError(terminate);
                    }
                } else if (setmin.isInside) {
                    setmin.getMin.onError(setmin.setMax.terminate());
                }
            }

            public final void onComplete() {
                setMin<?> setmin = this.parent;
                if (setmin.setMin.compareAndSet(this, (Object) null) && setmin.isInside) {
                    Throwable terminate = setmin.setMax.terminate();
                    if (terminate == null) {
                        setmin.getMin.onComplete();
                    } else {
                        setmin.getMin.onError(terminate);
                    }
                }
            }

            /* access modifiers changed from: package-private */
            public final void dispose() {
                DisposableHelper.dispose(this);
            }
        }
    }
}
