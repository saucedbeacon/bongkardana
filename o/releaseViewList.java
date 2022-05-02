package o;

import o.GriverProgressBar;
import o.TitleBarRightButtonView;

public final class releaseViewList<T, R> extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<R> {
    final RedDotDrawable<? super T, ? extends R> getMax;
    final setMinDuration<? extends T> setMin;

    public releaseViewList(setMinDuration<? extends T> setminduration, RedDotDrawable<? super T, ? extends R> redDotDrawable) {
        this.setMin = setminduration;
        this.getMax = redDotDrawable;
    }

    public final void setMin(TitleBarRightButtonView.CornerMarkingUIController<? super R> cornerMarkingUIController) {
        this.setMin.getMin(new setMax(cornerMarkingUIController, this.getMax));
    }

    static final class setMax<T, R> implements TitleBarRightButtonView.CornerMarkingUIController<T> {
        final TitleBarRightButtonView.CornerMarkingUIController<? super R> getMax;
        final RedDotDrawable<? super T, ? extends R> setMin;

        setMax(TitleBarRightButtonView.CornerMarkingUIController<? super R> cornerMarkingUIController, RedDotDrawable<? super T, ? extends R> redDotDrawable) {
            this.getMax = cornerMarkingUIController;
            this.setMin = redDotDrawable;
        }

        public final void onSubscribe(GriverProgressBar.UpdateRunnable updateRunnable) {
            this.getMax.onSubscribe(updateRunnable);
        }

        public final void onSuccess(T t) {
            try {
                this.getMax.onSuccess(setRefreshAnimation.getMax(this.setMin.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                registerNode.getMax(th);
                onError(th);
            }
        }

        public final void onError(Throwable th) {
            this.getMax.onError(th);
        }
    }
}
