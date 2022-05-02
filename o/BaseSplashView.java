package o;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.Callable;
import o.GriverProgressBar;
import o.RefreshHeader;
import o.TitleBarRightButtonView;

public final class BaseSplashView<T, U> extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<U> implements getSecondFloorView<U> {
    final Callable<? extends U> getMin;
    final setStateDidChangeHandler<? super U, ? super T> setMax;
    final TitleBarRightButtonView.AnonymousClass4<T> setMin;

    public BaseSplashView(TitleBarRightButtonView.AnonymousClass4<T> r1, Callable<? extends U> callable, setStateDidChangeHandler<? super U, ? super T> setstatedidchangehandler) {
        this.setMin = r1;
        this.getMin = callable;
        this.setMax = setstatedidchangehandler;
    }

    public final void setMin(TitleBarRightButtonView.CornerMarkingUIController<? super U> cornerMarkingUIController) {
        try {
            this.setMin.subscribe(new getMax(cornerMarkingUIController, setRefreshAnimation.getMax(this.getMin.call(), "The initialSupplier returned a null value"), this.setMax));
        } catch (Throwable th) {
            EmptyDisposable.error(th, (TitleBarRightButtonView.CornerMarkingUIController<?>) cornerMarkingUIController);
        }
    }

    public final TitleBarRightButtonView.AnonymousClass1<U> setMax() {
        RefreshHeader.RefreshState refreshState = new RefreshHeader.RefreshState(this.setMin, this.getMin, this.setMax);
        RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
        return redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, refreshState) : refreshState;
    }

    static final class getMax<T, U> implements GriverProgressBar<T>, GriverProgressBar.UpdateRunnable {
        final setStateDidChangeHandler<? super U, ? super T> getMax;
        final TitleBarRightButtonView.CornerMarkingUIController<? super U> getMin;
        final U length;
        boolean setMax;
        GriverProgressBar.UpdateRunnable setMin;

        getMax(TitleBarRightButtonView.CornerMarkingUIController<? super U> cornerMarkingUIController, U u, setStateDidChangeHandler<? super U, ? super T> setstatedidchangehandler) {
            this.getMin = cornerMarkingUIController;
            this.getMax = setstatedidchangehandler;
            this.length = u;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.validate(this.setMin, updateRunnable)) {
                this.setMin = updateRunnable;
                this.getMin.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.setMin.dispose();
        }

        public final boolean isDisposed() {
            return this.setMin.isDisposed();
        }

        public final void onNext(T t) {
            if (!this.setMax) {
                try {
                    this.getMax.setMax(this.length, t);
                } catch (Throwable th) {
                    this.setMin.dispose();
                    onError(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.setMax) {
                SecuritySignature.getMax(th);
                return;
            }
            this.setMax = true;
            this.getMin.onError(th);
        }

        public final void onComplete() {
            if (!this.setMax) {
                this.setMax = true;
                this.getMin.onSuccess(this.length);
            }
        }
    }
}
