package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class calAlphaValue<T> extends onLoadMoreStateChanged<T, T> {
    final dismissBadgeView getMax;

    public calAlphaValue(TitleBarRightButtonView.AnonymousClass1<T> r1, dismissBadgeView dismissbadgeview) {
        super(r1);
        this.getMax = dismissbadgeview;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        getMax getmax = new getMax(griverProgressBar);
        griverProgressBar.onSubscribe(getmax);
        this.setMin.subscribe(getmax);
        this.getMax.getMax(getmax.otherObserver);
    }

    static final class getMax<T> extends AtomicInteger implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = -4592979584110982903L;
        final GriverProgressBar<? super T> downstream;
        final InterfacePluginInfo error = new InterfacePluginInfo();
        final AtomicReference<GriverProgressBar.UpdateRunnable> mainDisposable = new AtomicReference<>();
        volatile boolean mainDone;
        volatile boolean otherDone;
        final C0106getMax otherObserver = new C0106getMax(this);

        getMax(GriverProgressBar<? super T> griverProgressBar) {
            this.downstream = griverProgressBar;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.setOnce(this.mainDisposable, updateRunnable);
        }

        public final void onNext(T t) {
            addUtRecord.getMax(this.downstream, t, this, this.error);
        }

        public final void onError(Throwable th) {
            DisposableHelper.dispose(this.otherObserver);
            GriverProgressBar<? super T> griverProgressBar = this.downstream;
            InterfacePluginInfo interfacePluginInfo = this.error;
            if (!interfacePluginInfo.addThrowable(th)) {
                SecuritySignature.getMax(th);
            } else if (getAndIncrement() == 0) {
                griverProgressBar.onError(interfacePluginInfo.terminate());
            }
        }

        public final void onComplete() {
            this.mainDone = true;
            if (this.otherDone) {
                GriverProgressBar<? super T> griverProgressBar = this.downstream;
                InterfacePluginInfo interfacePluginInfo = this.error;
                if (getAndIncrement() == 0) {
                    Throwable terminate = interfacePluginInfo.terminate();
                    if (terminate != null) {
                        griverProgressBar.onError(terminate);
                    } else {
                        griverProgressBar.onComplete();
                    }
                }
            }
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.mainDisposable.get());
        }

        public final void dispose() {
            DisposableHelper.dispose(this.mainDisposable);
            DisposableHelper.dispose(this.otherObserver);
        }

        /* access modifiers changed from: package-private */
        public final void otherError(Throwable th) {
            DisposableHelper.dispose(this.mainDisposable);
            GriverProgressBar<? super T> griverProgressBar = this.downstream;
            InterfacePluginInfo interfacePluginInfo = this.error;
            if (!interfacePluginInfo.addThrowable(th)) {
                SecuritySignature.getMax(th);
            } else if (getAndIncrement() == 0) {
                griverProgressBar.onError(interfacePluginInfo.terminate());
            }
        }

        /* access modifiers changed from: package-private */
        public final void otherComplete() {
            this.otherDone = true;
            if (this.mainDone) {
                GriverProgressBar<? super T> griverProgressBar = this.downstream;
                InterfacePluginInfo interfacePluginInfo = this.error;
                if (getAndIncrement() == 0) {
                    Throwable terminate = interfacePluginInfo.terminate();
                    if (terminate != null) {
                        griverProgressBar.onError(terminate);
                    } else {
                        griverProgressBar.onComplete();
                    }
                }
            }
        }

        /* renamed from: o.calAlphaValue$getMax$getMax  reason: collision with other inner class name */
        static final class C0106getMax extends AtomicReference<GriverProgressBar.UpdateRunnable> implements switchFavoriteIconFont {
            private static final long serialVersionUID = -2935427570954647017L;
            final getMax<?> parent;

            C0106getMax(getMax<?> getmax) {
                this.parent = getmax;
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                DisposableHelper.setOnce(this, updateRunnable);
            }

            public final void onError(Throwable th) {
                this.parent.otherError(th);
            }

            public final void onComplete() {
                this.parent.otherComplete();
            }
        }
    }
}
