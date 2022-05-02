package o;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class setCloseButtonColor<T> extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<T> {
    final setMinDuration<? extends T> getMax;
    final RedDotDrawable<? super Throwable, ? extends setMinDuration<? extends T>> length;

    public setCloseButtonColor(setMinDuration<? extends T> setminduration, RedDotDrawable<? super Throwable, ? extends setMinDuration<? extends T>> redDotDrawable) {
        this.getMax = setminduration;
        this.length = redDotDrawable;
    }

    public final void setMin(TitleBarRightButtonView.CornerMarkingUIController<? super T> cornerMarkingUIController) {
        this.getMax.getMin(new getMax(cornerMarkingUIController, this.length));
    }

    static final class getMax<T> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements TitleBarRightButtonView.CornerMarkingUIController<T>, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = -5314538511045349925L;
        final TitleBarRightButtonView.CornerMarkingUIController<? super T> downstream;
        final RedDotDrawable<? super Throwable, ? extends setMinDuration<? extends T>> nextFunction;

        getMax(TitleBarRightButtonView.CornerMarkingUIController<? super T> cornerMarkingUIController, RedDotDrawable<? super Throwable, ? extends setMinDuration<? extends T>> redDotDrawable) {
            this.downstream = cornerMarkingUIController;
            this.nextFunction = redDotDrawable;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.setOnce(this, updateRunnable)) {
                this.downstream.onSubscribe(this);
            }
        }

        public final void onSuccess(T t) {
            this.downstream.onSuccess(t);
        }

        public final void onError(Throwable th) {
            try {
                ((setMinDuration) setRefreshAnimation.getMax(this.nextFunction.apply(th), "The nextFunction returned a null SingleSource.")).getMin(new setMaxPushDistance(this, this.downstream));
            } catch (Throwable th2) {
                registerNode.getMax(th2);
                this.downstream.onError(new CompositeException(th, th2));
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
