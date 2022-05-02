package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class getContentBgView<T, U> extends onLoadMoreStateChanged<T, T> {
    final TitleBarRightButtonView.AnonymousClass4<? extends U> getMax;

    public getContentBgView(TitleBarRightButtonView.AnonymousClass4<T> r1, TitleBarRightButtonView.AnonymousClass4<? extends U> r2) {
        super(r1);
        this.getMax = r2;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        setMax setmax = new setMax(griverProgressBar);
        griverProgressBar.onSubscribe(setmax);
        this.getMax.subscribe(setmax.otherObserver);
        this.setMin.subscribe(setmax);
    }

    static final class setMax<T, U> extends AtomicInteger implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = 1418547743690811973L;
        final GriverProgressBar<? super T> downstream;
        final InterfacePluginInfo error = new InterfacePluginInfo();
        final setMax<T, U>.getMax otherObserver = new getMax();
        final AtomicReference<GriverProgressBar.UpdateRunnable> upstream = new AtomicReference<>();

        setMax(GriverProgressBar<? super T> griverProgressBar) {
            this.downstream = griverProgressBar;
        }

        public final void dispose() {
            DisposableHelper.dispose(this.upstream);
            DisposableHelper.dispose(this.otherObserver);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(this.upstream.get());
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.setOnce(this.upstream, updateRunnable);
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
            DisposableHelper.dispose(this.otherObserver);
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

        /* access modifiers changed from: package-private */
        public final void otherError(Throwable th) {
            DisposableHelper.dispose(this.upstream);
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
            DisposableHelper.dispose(this.upstream);
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

        final class getMax extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<U> {
            private static final long serialVersionUID = -8693423678067375039L;

            getMax() {
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                DisposableHelper.setOnce(this, updateRunnable);
            }

            public final void onNext(U u) {
                DisposableHelper.dispose(this);
                setMax.this.otherComplete();
            }

            public final void onError(Throwable th) {
                setMax.this.otherError(th);
            }

            public final void onComplete() {
                setMax.this.otherComplete();
            }
        }
    }
}
