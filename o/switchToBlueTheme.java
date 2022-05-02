package o;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class switchToBlueTheme<T, R> extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<R> {
    final RedDotDrawable<? super T, ? extends setMinDuration<? extends R>> getMin;
    final setMinDuration<? extends T> length;

    public switchToBlueTheme(setMinDuration<? extends T> setminduration, RedDotDrawable<? super T, ? extends setMinDuration<? extends R>> redDotDrawable) {
        this.getMin = redDotDrawable;
        this.length = setminduration;
    }

    public final void setMin(TitleBarRightButtonView.CornerMarkingUIController<? super R> cornerMarkingUIController) {
        this.length.getMin(new setMin(cornerMarkingUIController, this.getMin));
    }

    static final class setMin<T, R> extends AtomicReference<GriverProgressBar.UpdateRunnable> implements TitleBarRightButtonView.CornerMarkingUIController<T>, GriverProgressBar.UpdateRunnable {
        private static final long serialVersionUID = 3258103020495908596L;
        final TitleBarRightButtonView.CornerMarkingUIController<? super R> downstream;
        final RedDotDrawable<? super T, ? extends setMinDuration<? extends R>> mapper;

        setMin(TitleBarRightButtonView.CornerMarkingUIController<? super R> cornerMarkingUIController, RedDotDrawable<? super T, ? extends setMinDuration<? extends R>> redDotDrawable) {
            this.downstream = cornerMarkingUIController;
            this.mapper = redDotDrawable;
        }

        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        public final boolean isDisposed() {
            return DisposableHelper.isDisposed((GriverProgressBar.UpdateRunnable) get());
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            if (DisposableHelper.setOnce(this, updateRunnable)) {
                this.downstream.onSubscribe(this);
            }
        }

        public final void onSuccess(T t) {
            try {
                setMinDuration setminduration = (setMinDuration) setRefreshAnimation.getMax(this.mapper.apply(t), "The single returned by the mapper is null");
                if (!isDisposed()) {
                    setminduration.getMin(new getMin(this, this.downstream));
                }
            } catch (Throwable th) {
                registerNode.getMax(th);
                this.downstream.onError(th);
            }
        }

        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        static final class getMin<R> implements TitleBarRightButtonView.CornerMarkingUIController<R> {
            final TitleBarRightButtonView.CornerMarkingUIController<? super R> getMin;
            final AtomicReference<GriverProgressBar.UpdateRunnable> setMin;

            getMin(AtomicReference<GriverProgressBar.UpdateRunnable> atomicReference, TitleBarRightButtonView.CornerMarkingUIController<? super R> cornerMarkingUIController) {
                this.setMin = atomicReference;
                this.getMin = cornerMarkingUIController;
            }

            public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
                DisposableHelper.replace(this.setMin, updateRunnable);
            }

            public final void onSuccess(R r) {
                this.getMin.onSuccess(r);
            }

            public final void onError(Throwable th) {
                this.getMin.onError(th);
            }
        }
    }
}
