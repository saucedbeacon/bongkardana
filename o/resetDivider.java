package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class resetDivider<T, R> extends onLoadMoreStateChanged<T, R> {
    final RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1<T>, ? extends TitleBarRightButtonView.AnonymousClass4<R>> getMin;

    public resetDivider(TitleBarRightButtonView.AnonymousClass4<T> r1, RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1<T>, ? extends TitleBarRightButtonView.AnonymousClass4<R>> redDotDrawable) {
        super(r1);
        this.getMin = redDotDrawable;
    }

    public final void subscribeActual(GriverProgressBar<? super R> griverProgressBar) {
        IComponent max = IComponent.setMax();
        try {
            TitleBarRightButtonView.AnonymousClass4 r1 = (TitleBarRightButtonView.AnonymousClass4) setRefreshAnimation.getMax(this.getMin.apply(max), "The selector returned a null ObservableSource");
            length length2 = new length(griverProgressBar);
            r1.subscribe(length2);
            this.setMin.subscribe(new setMin(max, length2));
        } catch (Throwable th) {
            registerNode.getMax(th);
            EmptyDisposable.error(th, (GriverProgressBar<?>) griverProgressBar);
        }
    }

    static final class setMin<T, R> implements GriverProgressBar<T> {
        final AtomicReference<GriverProgressBar.UpdateRunnable> getMin;
        final IComponent<T> setMin;

        setMin(IComponent<T> iComponent, AtomicReference<GriverProgressBar.UpdateRunnable> atomicReference) {
            this.setMin = iComponent;
            this.getMin = atomicReference;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            DisposableHelper.setOnce(this.getMin, updateRunnable);
        }

        public final void onNext(T t) {
            this.setMin.onNext(t);
        }

        public final void onError(Throwable th) {
            this.setMin.onError(th);
        }

        public final void onComplete() {
            this.setMin.onComplete();
        }
    }

    static final class length<T, R> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements GriverProgressBar<R>, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = 854110278590336484L;
        final GriverProgressBar<? super R> downstream;
        GriverProgressBar.UpdateRunnable upstream;

        length(GriverProgressBar<? super R> griverProgressBar) {
            this.downstream = griverProgressBar;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.upstream, updateRunnable)) {
                this.upstream = updateRunnable;
                this.downstream.onSubscribe(this);
            }
        }

        public final void onNext(R r) {
            this.downstream.onNext(r);
        }

        public final void onError(Throwable th) {
            DisposableHelper.dispose(this);
            this.downstream.onError(th);
        }

        public final void onComplete() {
            DisposableHelper.dispose(this);
            this.downstream.onComplete();
        }

        public final void dispose() {
            this.upstream.dispose();
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return this.upstream.isDisposed();
        }
    }
}
