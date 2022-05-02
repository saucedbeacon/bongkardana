package o;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.Callable;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class showTitleBar<T, R> extends onLoadMoreStateChanged<T, TitleBarRightButtonView.AnonymousClass4<? extends R>> {
    final RedDotDrawable<? super Throwable, ? extends TitleBarRightButtonView.AnonymousClass4<? extends R>> getMax;
    final RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<? extends R>> getMin;
    final Callable<? extends TitleBarRightButtonView.AnonymousClass4<? extends R>> length;

    public showTitleBar(TitleBarRightButtonView.AnonymousClass4<T> r1, RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<? extends R>> redDotDrawable, RedDotDrawable<? super Throwable, ? extends TitleBarRightButtonView.AnonymousClass4<? extends R>> redDotDrawable2, Callable<? extends TitleBarRightButtonView.AnonymousClass4<? extends R>> callable) {
        super(r1);
        this.getMin = redDotDrawable;
        this.getMax = redDotDrawable2;
        this.length = callable;
    }

    public final void subscribeActual(GriverProgressBar<? super TitleBarRightButtonView.AnonymousClass4<? extends R>> griverProgressBar) {
        this.setMin.subscribe(new setMax(griverProgressBar, this.getMin, this.getMax, this.length));
    }

    static final class setMax<T, R> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        GriverProgressBar.UpdateRunnable getMax;
        final GriverProgressBar<? super TitleBarRightButtonView.AnonymousClass4<? extends R>> getMin;
        final RedDotDrawable<? super Throwable, ? extends TitleBarRightButtonView.AnonymousClass4<? extends R>> length;
        final Callable<? extends TitleBarRightButtonView.AnonymousClass4<? extends R>> setMax;
        final RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<? extends R>> setMin;

        setMax(GriverProgressBar<? super TitleBarRightButtonView.AnonymousClass4<? extends R>> griverProgressBar, RedDotDrawable<? super T, ? extends TitleBarRightButtonView.AnonymousClass4<? extends R>> redDotDrawable, RedDotDrawable<? super Throwable, ? extends TitleBarRightButtonView.AnonymousClass4<? extends R>> redDotDrawable2, Callable<? extends TitleBarRightButtonView.AnonymousClass4<? extends R>> callable) {
            this.getMin = griverProgressBar;
            this.setMin = redDotDrawable;
            this.length = redDotDrawable2;
            this.setMax = callable;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.getMax, updateRunnable)) {
                this.getMax = updateRunnable;
                this.getMin.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.getMax.dispose();
        }

        public final boolean isDisposed() {
            return this.getMax.isDisposed();
        }

        public final void onNext(T t) {
            try {
                this.getMin.onNext((TitleBarRightButtonView.AnonymousClass4) setRefreshAnimation.getMax(this.setMin.apply(t), "The onNext ObservableSource returned is null"));
            } catch (Throwable th) {
                registerNode.getMax(th);
                this.getMin.onError(th);
            }
        }

        public final void onError(Throwable th) {
            try {
                this.getMin.onNext((TitleBarRightButtonView.AnonymousClass4) setRefreshAnimation.getMax(this.length.apply(th), "The onError ObservableSource returned is null"));
                this.getMin.onComplete();
            } catch (Throwable th2) {
                registerNode.getMax(th2);
                this.getMin.onError(new CompositeException(th, th2));
            }
        }

        public final void onComplete() {
            try {
                this.getMin.onNext((TitleBarRightButtonView.AnonymousClass4) setRefreshAnimation.getMax(this.setMax.call(), "The onComplete ObservableSource returned is null"));
                this.getMin.onComplete();
            } catch (Throwable th) {
                registerNode.getMax(th);
                this.getMin.onError(th);
            }
        }
    }
}
