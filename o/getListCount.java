package o;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class getListCount<T, D> extends TitleBarRightButtonView.AnonymousClass1<T> {
    final Callable<? extends D> getMax;
    final RedDotDrawable<? super D, ? extends TitleBarRightButtonView.AnonymousClass4<? extends T>> length;
    final RedDotManager<? super D> setMax;
    final boolean setMin;

    public getListCount(Callable<? extends D> callable, RedDotDrawable<? super D, ? extends TitleBarRightButtonView.AnonymousClass4<? extends T>> redDotDrawable, RedDotManager<? super D> redDotManager, boolean z) {
        this.getMax = callable;
        this.length = redDotDrawable;
        this.setMax = redDotManager;
        this.setMin = z;
    }

    public final void subscribeActual(GriverProgressBar<? super T> griverProgressBar) {
        try {
            Object call = this.getMax.call();
            try {
                ((TitleBarRightButtonView.AnonymousClass4) setRefreshAnimation.getMax(this.length.apply(call), "The sourceSupplier returned a null ObservableSource")).subscribe(new setMax(griverProgressBar, call, this.setMax, this.setMin));
            } catch (Throwable th) {
                registerNode.getMax(th);
                EmptyDisposable.error((Throwable) new CompositeException(th, th), (GriverProgressBar<?>) griverProgressBar);
            }
        } catch (Throwable th2) {
            registerNode.getMax(th2);
            EmptyDisposable.error(th2, (GriverProgressBar<?>) griverProgressBar);
        }
    }

    static final class setMax<T, D> extends AtomicBoolean implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = 5904473792286235046L;
        final RedDotManager<? super D> disposer;
        final GriverProgressBar<? super T> downstream;
        final boolean eager;
        final D resource;
        GriverProgressBar.UpdateRunnable upstream;

        setMax(GriverProgressBar<? super T> griverProgressBar, D d, RedDotManager<? super D> redDotManager, boolean z) {
            this.downstream = griverProgressBar;
            this.resource = d;
            this.disposer = redDotManager;
            this.eager = z;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.upstream, updateRunnable)) {
                this.upstream = updateRunnable;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        public final void onError(Throwable th) {
            if (this.eager) {
                if (compareAndSet(false, true)) {
                    try {
                        this.disposer.accept(this.resource);
                    } catch (Throwable th2) {
                        registerNode.getMax(th2);
                        th = new CompositeException(th, th2);
                    }
                }
                this.upstream.dispose();
                this.downstream.onError(th);
                return;
            }
            this.downstream.onError(th);
            this.upstream.dispose();
            disposeAfter();
        }

        public final void onComplete() {
            if (this.eager) {
                if (compareAndSet(false, true)) {
                    try {
                        this.disposer.accept(this.resource);
                    } catch (Throwable th) {
                        registerNode.getMax(th);
                        this.downstream.onError(th);
                        return;
                    }
                }
                this.upstream.dispose();
                this.downstream.onComplete();
                return;
            }
            this.downstream.onComplete();
            this.upstream.dispose();
            disposeAfter();
        }

        public final void dispose() {
            disposeAfter();
            this.upstream.dispose();
        }

        public final boolean isDisposed() {
            return get();
        }

        /* access modifiers changed from: package-private */
        public final void disposeAfter() {
            if (compareAndSet(false, true)) {
                try {
                    this.disposer.accept(this.resource);
                } catch (Throwable th) {
                    registerNode.getMax(th);
                    SecuritySignature.getMax(th);
                }
            }
        }
    }
}
